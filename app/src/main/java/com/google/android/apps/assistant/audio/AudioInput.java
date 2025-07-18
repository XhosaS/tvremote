package com.google.android.apps.assistant.audio;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructPollfd;
import com.google.android.apps.assistant.audio.ThrottledLog;
import com.google.assistant.base.ContextHelper;
import com.google.assistant.base.Log;
import com.google.assistant.base.annotations.JNINamespace;
import defpackage.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
@JNINamespace("assistant::sdk")
/* loaded from: classes.dex */
class AudioInput {
    private static final int AUDIO_SOURCE_ECHO_REFERENCE = 1997;
    private static final int BUFFER_SIZE_MS = 20;
    private static final int DEBUG_LEVEL = 1;
    private static final int DSP_STREAMING_BUFFER_SIZE = 320000;
    private static final long INVALID_TIMESTAMP = Long.MIN_VALUE;
    private static final long MAX_TIMESTAMP_ERROR_USEC = 5000;
    private static final int MIN_BUFFER_SIZE_SCALE = 5;
    private static final long MSEC_IN_NSEC = 1000000;
    private static final long SEC_IN_NSEC = 1000000000;
    private static final long TIMESTAMP_UPDATE_PERIOD_NSEC = 250000000;
    private final int audioDeviceInfoType;
    private final ParcelFileDescriptor audioFd;
    private final int audioSource;
    private ParcelFileDescriptor.AutoCloseInputStream audioStream;
    private final int bytesPerSample;
    private final int channels;
    private int dspCaptureSession;
    private final ThrottledLog inputErrorThrottledLogs;
    private AudioTimestamp lastRecordTStamp;
    private final long nativeAudioInput;
    private long numberOfTimestamps;
    private ByteBuffer pcmBuffer;
    private ByteBuffer pcmBufferZeros;
    private final int sampleRateInHz;
    private boolean skipLeadingZerosConfig;
    private final String tag;
    private ByteBuffer timestampBuffer;
    private long totalTimestampDriftUsecs;
    private int bytesPerFrame = 0;
    private int bytesPerReadBuffer = 0;
    private long totalFramesRead = 0;
    private long lastTimestampUpdateNsec = INVALID_TIMESTAMP;
    private AudioRecord audioRecord = null;
    private boolean skipLeadingZeros = false;

    /* compiled from: PG */
    class DeviceRoutingListener implements AudioRouting.OnRoutingChangedListener {
        final /* synthetic */ AudioInput this$0;

        public DeviceRoutingListener(AudioInput audioInput) {
            audioInput.getClass();
            this.this$0 = audioInput;
        }

        public void onRoutingChanged(AudioRouting audioRouting) {
            if (this.this$0.audioDeviceInfoType == 0) {
                return;
            }
            if (audioRouting.getPreferredDevice() == null) {
                Log.e(this.this$0.tag, "The preferred device should always be set.", new Object[0]);
                AudioInput audioInput = this.this$0;
                audioInput.nativeOnJavaError(audioInput.nativeAudioInput);
            } else if (audioRouting.getPreferredDevice().getType() != this.this$0.audioDeviceInfoType) {
                Log.e(this.this$0.tag, "Preferred device type should match the requested device. Got " + audioRouting.getPreferredDevice().getType() + " instead of " + this.this$0.audioDeviceInfoType, new Object[0]);
                AudioInput audioInput2 = this.this$0;
                audioInput2.nativeOnJavaError(audioInput2.nativeAudioInput);
            }
            if (audioRouting.getRoutedDevice() == null || audioRouting.getRoutedDevice().getType() == this.this$0.audioDeviceInfoType) {
                return;
            }
            Log.e(this.this$0.tag, "Routing went to the wrong device. Got " + audioRouting.getRoutedDevice().getType() + " instead of " + this.this$0.audioDeviceInfoType, new Object[0]);
            AudioInput audioInput3 = this.this$0;
            audioInput3.nativeOnJavaError(audioInput3.nativeAudioInput);
        }
    }

    private AudioInput(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.dspCaptureSession = -1;
        this.skipLeadingZerosConfig = false;
        String strM = a.m(i2, i, "AudioInput(", ":", ")");
        this.tag = strM;
        this.inputErrorThrottledLogs = new ThrottledLog(new ThrottledLog.LogFunction() { // from class: com.google.android.apps.assistant.audio.AudioInput$$ExternalSyntheticLambda0
            @Override // com.google.android.apps.assistant.audio.ThrottledLog.LogFunction
            public final void accept(String str, String str2) {
                Log.w(str, str2, new Object[0]);
            }
        }, 5, MAX_TIMESTAMP_ERROR_USEC, 10000L);
        Log.i(strM, "Ctor: deviceType= " + i + " source=" + i2 + " sampleRate=" + i3 + " channels=" + i4 + " bytesPerSample=" + i5 + " dspCaptureSession=" + i6 + " FD=" + i7 + " skipLeadingZerosConfig=" + z, new Object[0]);
        this.nativeAudioInput = j;
        this.audioDeviceInfoType = i;
        this.audioSource = i2;
        this.sampleRateInHz = i3;
        this.channels = i4;
        this.bytesPerSample = i5;
        this.dspCaptureSession = i6;
        this.audioFd = ParcelFileDescriptor.adoptFd(i7);
        this.skipLeadingZerosConfig = z;
    }

    private int ReadBuffer() {
        if (this.audioStream != null) {
            return readBufferFromAudioFD();
        }
        if (this.audioRecord != null) {
            return readBufferFromAudioRecord();
        }
        return -1;
    }

    private boolean allocatePcmBuffer() {
        int i = this.channels * this.bytesPerSample;
        this.bytesPerFrame = i;
        int i2 = i * ((this.sampleRateInHz * BUFFER_SIZE_MS) / 1000);
        this.bytesPerReadBuffer = i2;
        try {
            this.pcmBuffer = ByteBuffer.allocateDirect(i2);
            if (this.skipLeadingZerosConfig) {
                this.pcmBufferZeros = ByteBuffer.allocateDirect(this.bytesPerReadBuffer);
            }
            if (this.bytesPerReadBuffer == this.pcmBuffer.capacity() && (!this.skipLeadingZerosConfig || this.bytesPerReadBuffer == this.pcmBufferZeros.capacity())) {
                this.pcmBuffer.order(ByteOrder.nativeOrder());
                return true;
            }
            Log.e(this.tag, "Init: Allocated buffer's sizes=" + this.pcmBuffer.capacity() + "," + this.pcmBufferZeros.capacity() + " are different from requested size=" + this.bytesPerReadBuffer, new Object[0]);
            return false;
        } catch (IllegalArgumentException e) {
            Log.e(this.tag, "Init: Cannot create mPcmBuffer: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return false;
        }
    }

    private boolean allocateTimestampBuffer() {
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(8);
            this.timestampBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            return true;
        } catch (IllegalArgumentException e) {
            Log.e(this.tag, "Init: Cannot create mTimestampBuffer: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return false;
        }
    }

    private static AudioInput createAudioInput(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        return new AudioInput(j, i, i2, i3, i4, i5, i6, i7, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean createAudioRecord(int r12) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.assistant.audio.AudioInput.createAudioRecord(int):boolean");
    }

    private static ParcelFileDescriptor.AutoCloseInputStream createAudioStream(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor.getFileDescriptor().valid()) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        }
        return null;
    }

    private boolean createDspAudioRecord(int i, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.dspCaptureSession < 0) {
            return false;
        }
        try {
            Class cls = Integer.TYPE;
            Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, cls, cls);
            Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(i2).setEncoding(i).setSampleRate(this.sampleRateInHz).build();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            method.invoke(builder, Integer.valueOf(this.audioSource));
            try {
                AudioRecord audioRecord = (AudioRecord) constructor.newInstance(builder.build(), audioFormatBuild, Integer.valueOf(DSP_STREAMING_BUFFER_SIZE), Integer.valueOf(this.dspCaptureSession));
                this.audioRecord = audioRecord;
                if (audioRecord == null || audioRecord.getState() == 1) {
                    return true;
                }
                Log.e(this.tag, "Failed to initialize DSP AudioRecord", new Object[0]);
                releaseAudioRecord();
                return false;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                Log.e(this.tag, "Exception while invoking new AudioRecord", new Object[0]);
                return false;
            }
        } catch (Exception unused2) {
            Log.e(this.tag, "Failed to construct AudioRecord for capture session " + this.dspCaptureSession, new Object[0]);
            return false;
        }
    }

    private int getChannelMask(int i) {
        return (1 << i) - 1;
    }

    private long getInterpolatedTimestampUsecs(long j) {
        return (this.lastRecordTStamp.nanoTime + (((j - this.lastRecordTStamp.framePosition) * SEC_IN_NSEC) / this.sampleRateInHz)) / 1000;
    }

    private int getMinBufferSize(int i) {
        int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRateInHz, this.channels == 1 ? 16 : 12, i);
        if (minBufferSize == -1 || minBufferSize == -2) {
            return 0;
        }
        int i2 = this.channels;
        return i2 > 2 ? (i2 * minBufferSize) / 2 : minBufferSize;
    }

    private boolean haveValidTimestamp() {
        return this.lastTimestampUpdateNsec != INVALID_TIMESTAMP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (createAudioRecord(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean initialize() {
        /*
            r5 = this;
            int r0 = r5.bytesPerSample
            int r0 = r5.getPcmEncoding(r0)
            boolean r1 = r5.allocatePcmBuffer()
            r2 = 0
            if (r1 != 0) goto Le
            goto L38
        Le:
            boolean r1 = r5.allocateTimestampBuffer()
            if (r1 == 0) goto L38
            android.os.ParcelFileDescriptor r1 = r5.audioFd
            android.os.ParcelFileDescriptor$AutoCloseInputStream r1 = createAudioStream(r1)
            r5.audioStream = r1
            if (r1 != 0) goto L2d
            java.lang.String r1 = r5.tag
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "AudioFd is invalid. Falling back to AudioRecord"
            com.google.assistant.base.Log.i(r1, r4, r3)
            boolean r0 = r5.createAudioRecord(r0)
            if (r0 == 0) goto L38
        L2d:
            long r0 = r5.nativeAudioInput
            java.nio.ByteBuffer r2 = r5.pcmBuffer
            java.nio.ByteBuffer r3 = r5.timestampBuffer
            r5.nativeCacheDirectBufferAddress(r0, r2, r3)
            r0 = 1
            return r0
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.assistant.audio.AudioInput.initialize():boolean");
    }

    private boolean isBufferAllZeros() {
        if (this.skipLeadingZeros) {
            if (this.pcmBuffer.compareTo(this.pcmBufferZeros) == 0) {
                return true;
            }
            Log.w(this.tag, "Non-zero audio found. Clearing the mSkipLeadingZeros flag.", new Object[0]);
            this.skipLeadingZeros = false;
        }
        return false;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnJavaError(long j);

    private int readBufferFromAudioFD() throws IOException {
        StructPollfd structPollfd = new StructPollfd();
        structPollfd.fd = this.audioFd.getFileDescriptor();
        structPollfd.events = (short) OsConstants.POLLIN;
        try {
            if (Os.poll(new StructPollfd[]{structPollfd}, BUFFER_SIZE_MS) != 0) {
                try {
                    int i = this.audioStream.read(this.pcmBuffer.array(), this.pcmBuffer.arrayOffset(), this.pcmBuffer.capacity());
                    if (i != this.pcmBuffer.capacity()) {
                        this.inputErrorThrottledLogs.log(this.tag, "ReadBufferFromAudioFD: got only " + i + "/" + this.pcmBuffer.capacity());
                    }
                    if (i <= 0) {
                        this.inputErrorThrottledLogs.log(this.tag, "Audio capture needs restart");
                        return -1;
                    }
                    if (isBufferAllZeros()) {
                        Log.w(this.tag, "Audio input is all zeros. Skipping them.", new Object[0]);
                        return 0;
                    }
                    this.totalFramesRead += i / this.bytesPerFrame;
                    this.timestampBuffer.putLong(0, 0L);
                    return i;
                } catch (IOException unused) {
                    Log.e(this.tag, "ReadBufferFromAudioFD: read failed with IOException, abort!", new Object[0]);
                    return -1;
                }
            }
        } catch (ErrnoException e) {
            if (e.errno != OsConstants.EINTR) {
                Log.e(this.tag, "ReadBufferFromAudioFD: poll failed with errno %d, abort!", Integer.valueOf(e.errno));
                return -1;
            }
        }
        return 0;
    }

    private int readBufferFromAudioRecord() {
        AudioRecord audioRecord = this.audioRecord;
        ByteBuffer byteBuffer = this.pcmBuffer;
        int i = audioRecord.read(byteBuffer, byteBuffer.capacity());
        if (i == -3) {
            Log.e(this.tag, "ReadBuffer: read failed (INVALID_OPERATION), abort!", new Object[0]);
            return -1;
        }
        if (i != this.pcmBuffer.capacity()) {
            this.inputErrorThrottledLogs.log(this.tag, "ReadBuffer: got only " + i + "/" + this.pcmBuffer.capacity());
        }
        if (i <= 0) {
            this.inputErrorThrottledLogs.log(this.tag, "Audio capture needs restart");
            return -1;
        }
        if (isBufferAllZeros()) {
            Log.w(this.tag, "Audio input is all zeros. Skipping them.", new Object[0]);
            return 0;
        }
        long j = this.totalFramesRead;
        this.totalFramesRead = (i / this.bytesPerFrame) + j;
        updateTimestamp();
        if (!haveValidTimestamp()) {
            this.inputErrorThrottledLogs.log(this.tag, "No timestamp available yet!");
            return 0;
        }
        this.timestampBuffer.putLong(0, getInterpolatedTimestampUsecs(j));
        return i;
    }

    private void releaseAudioRecord() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    private boolean setRouting() {
        AudioDeviceInfo audioDeviceInfo;
        int i = this.audioDeviceInfoType;
        if (i != 0) {
            Log.i(this.tag, a.b(i, "Setting routing to "), new Object[0]);
            AudioDeviceInfo[] devices = ((AudioManager) ContextHelper.getApplicationContext().getSystemService("audio")).getDevices(1);
            int length = devices.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    audioDeviceInfo = null;
                    break;
                }
                audioDeviceInfo = devices[i2];
                if (audioDeviceInfo.getType() == this.audioDeviceInfoType) {
                    break;
                }
                i2++;
            }
            if (audioDeviceInfo == null) {
                Log.e(this.tag, "Cannot find device type " + this.audioDeviceInfoType, new Object[0]);
                return false;
            }
            if (!this.audioRecord.setPreferredDevice(audioDeviceInfo)) {
                Log.e(this.tag, "Failed to set routing to " + this.audioDeviceInfoType, new Object[0]);
                return false;
            }
        }
        return true;
    }

    private boolean setRoutingAndStart() throws IllegalStateException {
        this.audioRecord.addOnRoutingChangedListener(new DeviceRoutingListener(this), (Handler) null);
        if (this.audioSource != AUDIO_SOURCE_ECHO_REFERENCE && !setRouting()) {
            Log.e(this.tag, "Setting initial routing failed.", new Object[0]);
            return false;
        }
        try {
            this.audioRecord.startRecording();
            Log.i(this.tag, "Started recording from " + this.audioDeviceInfoType, new Object[0]);
            return true;
        } catch (IllegalStateException e) {
            Log.e(this.tag, "Cannot start, startRecording() failed: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return false;
        }
    }

    private boolean start() {
        if (!initialize()) {
            Log.e(this.tag, "Cannot start, initialization failed!", new Object[0]);
            return false;
        }
        if (this.skipLeadingZerosConfig) {
            Log.w(this.tag, "Initializing mSkipLeadingZeros = true", new Object[0]);
            this.skipLeadingZeros = true;
        }
        if (this.audioStream != null) {
            return true;
        }
        if (setRoutingAndStart()) {
            this.lastRecordTStamp = new AudioTimestamp();
            return true;
        }
        Log.e(this.tag, "Failed to start.", new Object[0]);
        releaseAudioRecord();
        return false;
    }

    private void stop() throws IllegalStateException, IOException {
        Log.i(this.tag, "Stopping recording", new Object[0]);
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = this.audioStream;
        if (autoCloseInputStream != null) {
            try {
                autoCloseInputStream.close();
            } catch (IOException unused) {
                Log.e(this.tag, "stop: close failed with IOException", new Object[0]);
            }
            long j = this.totalFramesRead / (this.sampleRateInHz / 1000);
            Log.i(this.tag, "totalMsRead=" + j, new Object[0]);
        } else {
            try {
                this.audioFd.close();
            } catch (IOException unused2) {
                Log.e(this.tag, "audioFd: close failed with IOException", new Object[0]);
            }
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
            releaseAudioRecord();
        }
    }

    private void updateTimestamp() {
        boolean zHaveValidTimestamp = haveValidTimestamp();
        if (!zHaveValidTimestamp || System.nanoTime() - this.lastTimestampUpdateNsec > TIMESTAMP_UPDATE_PERIOD_NSEC) {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (this.audioRecord.getTimestamp(audioTimestamp, 0) != 0) {
                this.inputErrorThrottledLogs.log(this.tag, "Call to AudioRecord.getTimestamp() failed!");
                return;
            }
            if (this.lastRecordTStamp.framePosition == audioTimestamp.framePosition) {
                return;
            }
            this.numberOfTimestamps++;
            if (zHaveValidTimestamp) {
                long interpolatedTimestampUsecs = (audioTimestamp.nanoTime / 1000) - getInterpolatedTimestampUsecs(audioTimestamp.framePosition);
                this.totalTimestampDriftUsecs += interpolatedTimestampUsecs;
                if (Math.abs(interpolatedTimestampUsecs) > MAX_TIMESTAMP_ERROR_USEC) {
                    long j = this.totalTimestampDriftUsecs;
                    long j2 = j / this.numberOfTimestamps;
                    this.inputErrorThrottledLogs.log(this.tag, "Timestamp error is " + interpolatedTimestampUsecs + " usec (total=" + j + " avg=" + j2 + ")");
                }
            }
            this.lastRecordTStamp.nanoTime = audioTimestamp.nanoTime;
            this.lastRecordTStamp.framePosition = audioTimestamp.framePosition;
            this.lastTimestampUpdateNsec = System.nanoTime();
        }
    }

    public int getPcmEncoding(int i) {
        if (i == 2) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        Log.e(this.tag, "Unsupported sample size.", new Object[0]);
        return 0;
    }
}
