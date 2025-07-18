package com.google.android.apps.assistant.audio;

import android.media.AudioAttributes;
import android.media.AudioDeviceAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import com.google.android.apps.assistant.audio.ThrottledLog;
import com.google.assistant.base.ContextHelper;
import com.google.assistant.base.Log;
import com.google.assistant.base.annotations.JNINamespace;
import defpackage.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@JNINamespace("assistant::sdk")
/* loaded from: classes.dex */
class AudioOutput {
    private static final long ANDROID_AUDIO_PERIOD_SIZE_USEC = 20000;
    private static final int AUDIO_FORMAT = 2;
    private static final int AUDIO_MODE = 1;
    private static final int DEBUG_LEVEL = 0;
    private static final int MIN_BUFFER_SIZE_MULTIPLIER = 3;
    private static final long MSEC_IN_NSEC = 1000000;
    private static final long NO_TIMESTAMP = Long.MIN_VALUE;
    private static final Map OUTPUT_STREAM_TYPE_TO_ANDROID_AUDIO_ATTRIBUTES;
    private static final long PLAY_START_THRESHOLD_USEC = 30000;
    private static final long SEC_IN_NSEC = 1000000000;
    private static final long SEC_IN_USEC = 1000000;
    private static final String TAG = "AudioOutput";
    private static final long TIMEOUT = 60000000000L;
    private static final long TIMESTAMP_UPDATE_PERIOD = 3000000000L;
    private static final long UNDERRUN_LOG_THROTTLE_PERIOD = 1000000000;
    private static final long VERY_LOW_BUFFER_LEVEL_USEC = 20000;
    private AudioTrack audioTrack;
    private long audioTrackBufferSizeInUsec;
    private ThrottledLog bufferLevelWarningLog;
    private int bytesPerFrame;
    private long lastBufferLevelUsec;
    private float lastSampleRate;
    private final long nativeAudioOutput;
    private int nativeBufferSize;
    private int numOfChannels;
    private ByteBuffer pcmBuffer;
    private long rWindowFramesWritten;
    private long rWindowStartTimeNsec;
    private AudioTimestamp refPointTStamp;
    private ByteBuffer renderingDelayBuffer;
    private int sampleRateInHz;
    private ThrottledLog statisticsLog;
    private ThrottledLog underrunWarningLog;
    private String tag = TAG;
    private boolean isInitialized = false;
    private long lastTimestampUpdateNsec = NO_TIMESTAMP;
    private boolean triggerTimestampUpdateNow = false;
    private long lastRenderingDelayUsecs = NO_TIMESTAMP;
    private int lastUnderrunCount = 0;
    private long totalFramesWritten = 0;

    static {
        HashMap map = new HashMap();
        OUTPUT_STREAM_TYPE_TO_ANDROID_AUDIO_ATTRIBUTES = map;
        map.put(0, new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
        map.put(1, new AudioAttributes.Builder().setUsage(4).setContentType(2).build());
        map.put(2, new AudioAttributes.Builder().setUsage(16).setContentType(1).build());
    }

    private AudioOutput(long j) {
        this.nativeAudioOutput = j;
    }

    private long bytes2frames(long j) {
        return (j + (r0 / 2)) / this.bytesPerFrame;
    }

    private long bytes2usec(long j) {
        return frames2usec(bytes2frames(j));
    }

    private void checkBufferLevel() {
        long jFrames2usec = frames2usec(this.totalFramesWritten - this.audioTrack.getPlaybackHeadPosition());
        this.lastBufferLevelUsec = jFrames2usec;
        if (jFrames2usec <= 20000) {
            long j = this.lastRenderingDelayUsecs;
            if (j == NO_TIMESTAMP) {
                j = -1;
            }
            int underrunCount = getUnderrunCount();
            int i = this.lastUnderrunCount;
            ThrottledLog throttledLog = this.bufferLevelWarningLog;
            String str = this.tag;
            long j2 = this.lastBufferLevelUsec;
            StringBuilder sb = new StringBuilder("Low buffer level=");
            sb.append(j2);
            sb.append("us  RD=");
            sb.append(j);
            sb.append(underrunCount != i ? "us *" : "us");
            throttledLog.log(str, sb.toString());
        }
    }

    private void checkForUnderruns() {
        int underrunCount = getUnderrunCount();
        int i = this.lastUnderrunCount;
        if (underrunCount != i) {
            this.underrunWarningLog.log(this.tag, a.m(underrunCount, i, "Underrun detected (", "->", ")! Resetting rendering delay logic."));
            this.lastTimestampUpdateNsec = NO_TIMESTAMP;
            this.lastUnderrunCount = underrunCount;
        }
    }

    private void close() throws IllegalStateException {
        Log.i(this.tag, "Close AudioOutput!", new Object[0]);
        if (!this.isInitialized) {
            Log.w(this.tag, "Close: not initialized.", new Object[0]);
            return;
        }
        if (!isStopped()) {
            this.audioTrack.stop();
        }
        this.audioTrack.release();
        this.isInitialized = false;
    }

    private static AudioOutput createAudioOutput(long j) {
        return new AudioOutput(j);
    }

    private long elapsedNsec(long j) {
        return System.nanoTime() - j;
    }

    private long frames2nsec(long j) {
        return (j * 1000000000) / this.sampleRateInHz;
    }

    private long frames2usec(long j) {
        return nsecs2usecs(frames2nsec(j));
    }

    private long getInterpolatedTStampNsecs(AudioTimestamp audioTimestamp, long j) {
        if (!haveValidRefPoint()) {
            return NO_TIMESTAMP;
        }
        return audioTimestamp.nanoTime + frames2nsec(j - audioTimestamp.framePosition);
    }

    private String getPlayStateString() {
        int playState = this.audioTrack.getPlayState();
        return playState != 1 ? playState != 2 ? playState != 3 ? "UNKNOWN" : "PLAYING" : "PAUSED" : "STOPPED";
    }

    private int getUnderrunCount() {
        return this.audioTrack.getUnderrunCount();
    }

    private boolean haveValidRefPoint() {
        return this.lastTimestampUpdateNsec != NO_TIMESTAMP;
    }

    private int init(int i, int i2, int i3, boolean z) {
        this.tag = a.a(i, "AudioOutput(", ")");
        this.bufferLevelWarningLog = new ThrottledLog(new ThrottledLog.LogFunction() { // from class: com.google.android.apps.assistant.audio.AudioOutput$$ExternalSyntheticLambda0
            @Override // com.google.android.apps.assistant.audio.ThrottledLog.LogFunction
            public final void accept(String str, String str2) {
                Log.w(str, str2, new Object[0]);
            }
        }, 5, 1000L, 5000L);
        this.underrunWarningLog = new ThrottledLog(new ThrottledLog.LogFunction() { // from class: com.google.android.apps.assistant.audio.AudioOutput$$ExternalSyntheticLambda1
            @Override // com.google.android.apps.assistant.audio.ThrottledLog.LogFunction
            public final void accept(String str, String str2) {
                Log.w(str, str2, new Object[0]);
            }
        }, 5, 1000L, 5000L);
        this.statisticsLog = new ThrottledLog(new ThrottledLog.LogFunction() { // from class: com.google.android.apps.assistant.audio.AudioOutput$$ExternalSyntheticLambda2
            @Override // com.google.android.apps.assistant.audio.ThrottledLog.LogFunction
            public final void accept(String str, String str2) {
                Log.i(str, str2, new Object[0]);
            }
        }, 1, 1000L, 5000L);
        Log.i(this.tag, "Init: sampleRateInHz=" + i2 + " numOfChannels=" + i3 + " keepPlaybackRouting=" + z, new Object[0]);
        if (this.isInitialized) {
            Log.w(this.tag, "Init: already initialized.", new Object[0]);
            return this.nativeBufferSize;
        }
        if (i2 <= 0) {
            Log.e(this.tag, a.a(i2, "Invalid sampleRateInHz=", " given!"), new Object[0]);
            return -1;
        }
        this.sampleRateInHz = i2;
        if (i3 <= 0 || i3 > 2) {
            Log.e(this.tag, a.a(i3, "Invalid numOfChannels=", " given!"), new Object[0]);
            return -1;
        }
        this.numOfChannels = i3;
        this.bytesPerFrame = i3 + i3;
        int i4 = i3 > 1 ? 12 : 4;
        AudioAttributes audioAttributes = (AudioAttributes) OUTPUT_STREAM_TYPE_TO_ANDROID_AUDIO_ATTRIBUTES.get(Integer.valueOf(i));
        int minBufferSize = AudioTrack.getMinBufferSize(this.sampleRateInHz, i4, 2);
        int i5 = minBufferSize * 3;
        long jBytes2usec = bytes2usec(i5);
        this.audioTrackBufferSizeInUsec = jBytes2usec;
        Log.i(this.tag, "Init: create an AudioTrack of size=" + i5 + " (" + jBytes2usec + "usec) minBufSize=" + minBufferSize, new Object[0]);
        this.audioTrack = new AudioTrack.Builder().setAudioAttributes(audioAttributes).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(this.sampleRateInHz).setChannelMask(i4).build()).setBufferSizeInBytes(i5).setTransferMode(1).build();
        this.refPointTStamp = new AudioTimestamp();
        if (z) {
            keepCurrentRoute(audioAttributes);
        }
        int channelCount = this.sampleRateInHz * this.audioTrack.getChannelCount() * this.bytesPerFrame;
        this.nativeBufferSize = channelCount;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(channelCount);
        this.pcmBuffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(16);
        this.renderingDelayBuffer = byteBufferAllocateDirect2;
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        nativeCacheDirectBufferAddress(this.nativeAudioOutput, this.pcmBuffer, this.renderingDelayBuffer);
        this.isInitialized = true;
        return this.nativeBufferSize;
    }

    private boolean isPlaying() {
        return this.audioTrack.getPlayState() == 3;
    }

    private boolean isStopped() {
        return this.audioTrack.getPlayState() == 1;
    }

    private void keepCurrentRoute(AudioAttributes audioAttributes) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        AudioManager audioManager = (AudioManager) ContextHelper.getApplicationContext().getSystemService("audio");
        if (audioManager == null) {
            Log.w(TAG, "Failed to get AudioManager", new Object[0]);
            return;
        }
        List<AudioDeviceAttributes> devicesForAttributes = audioManager.getDevicesForAttributes(audioAttributes);
        Iterator it = devicesForAttributes.iterator();
        while (it.hasNext()) {
            Log.i(TAG, "Attributes type=" + ((AudioDeviceAttributes) it.next()).getType(), new Object[0]);
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            Log.i(TAG, "Device type=" + audioDeviceInfo.getType(), new Object[0]);
        }
        for (AudioDeviceAttributes audioDeviceAttributes : devicesForAttributes) {
            int type = audioDeviceAttributes.getType();
            String address = audioDeviceAttributes.getAddress();
            for (AudioDeviceInfo audioDeviceInfo2 : devices) {
                if (type == audioDeviceInfo2.getType() && address.equals(audioDeviceInfo2.getAddress())) {
                    Log.i(TAG, "Setting preferred output device=" + type + ", address=" + address + ", isSet=" + this.audioTrack.setPreferredDevice(audioDeviceInfo2), new Object[0]);
                    return;
                }
            }
        }
        Log.w(TAG, "Unable to find matching device, not explicitly setting routing", new Object[0]);
    }

    private void logStatistics() {
        long j = this.lastRenderingDelayUsecs;
        if (j == NO_TIMESTAMP) {
            j = -1;
        }
        this.statisticsLog.log(this.tag, "SampleRateHz=" + this.lastSampleRate + " RenderingDelayUsec=" + j + " BufferLevelUsec=" + this.lastBufferLevelUsec);
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private static long nsecs2usecs(long j) {
        return (j + 500) / 1000;
    }

    private void play() throws IllegalStateException {
        Log.i(this.tag, "Start playback", new Object[0]);
        this.rWindowFramesWritten = 0L;
        this.audioTrack.play();
        this.triggerTimestampUpdateNow = true;
    }

    private long prepareForShutdown() throws IllegalStateException {
        this.audioTrack.stop();
        updateRefPointTimestamp();
        long interpolatedTStampNsecs = getInterpolatedTStampNsecs(this.refPointTStamp, this.totalFramesWritten);
        return (interpolatedTStampNsecs != NO_TIMESTAMP ? interpolatedTStampNsecs - System.nanoTime() : frames2nsec(Math.min(this.totalFramesWritten, this.audioTrack.getBufferSizeInFrames()))) / 1000;
    }

    private void setVolume(float f) {
        Log.i(this.tag, "Setting volume to " + f, new Object[0]);
        int volume = this.audioTrack.setVolume(f);
        if (volume != 0) {
            Log.e(this.tag, a.b(volume, "Cannot set volume: ret="), new Object[0]);
        }
    }

    private void sleepUntilBufferAvail(int i) throws InterruptedException {
        long jBytes2usec = bytes2usec(i);
        long j = this.audioTrackBufferSizeInUsec / 2;
        if (jBytes2usec >= j) {
            jBytes2usec = j;
        } else {
            long j2 = jBytes2usec / 20000;
            if (j2 * 20000 < jBytes2usec) {
                jBytes2usec = (j2 + 1) * 20000;
            }
        }
        try {
            Thread.sleep(jBytes2usec / 1000);
        } catch (InterruptedException e) {
            Log.i(this.tag, "Sleep was interrupted: ".concat(e.toString()), new Object[0]);
        }
    }

    private void startPlayingIfItIsTime() throws IllegalStateException {
        if (frames2usec(this.totalFramesWritten) > PLAY_START_THRESHOLD_USEC) {
            play();
        }
    }

    private void updateRefPointTimestamp() {
        if ((this.triggerTimestampUpdateNow || !haveValidRefPoint() || elapsedNsec(this.lastTimestampUpdateNsec) > TIMESTAMP_UPDATE_PERIOD) && this.audioTrack.getTimestamp(this.refPointTStamp)) {
            this.lastTimestampUpdateNsec = System.nanoTime();
            this.triggerTimestampUpdateNow = false;
        }
    }

    private void updateRenderingDelay() {
        checkForUnderruns();
        updateRefPointTimestamp();
        if (!haveValidRefPoint()) {
            this.renderingDelayBuffer.putLong(0, 0L);
            this.renderingDelayBuffer.putLong(8, NO_TIMESTAMP);
            this.lastRenderingDelayUsecs = NO_TIMESTAMP;
        } else {
            long jNsecs2usecs = nsecs2usecs(getInterpolatedTStampNsecs(this.refPointTStamp, this.totalFramesWritten));
            long jNsecs2usecs2 = nsecs2usecs(System.nanoTime());
            long j = jNsecs2usecs - jNsecs2usecs2;
            this.renderingDelayBuffer.putLong(0, j);
            this.renderingDelayBuffer.putLong(8, jNsecs2usecs2);
            this.lastRenderingDelayUsecs = j;
        }
    }

    private void updateSampleRateMeasure(long j) {
        long j2 = this.rWindowFramesWritten;
        if (j2 == 0) {
            this.rWindowStartTimeNsec = System.nanoTime();
            this.rWindowFramesWritten = j;
        } else {
            this.rWindowFramesWritten = j2 + j;
            this.lastSampleRate = (this.rWindowFramesWritten * 1.0E9f) / elapsedNsec(this.rWindowStartTimeNsec);
        }
    }

    private int writePcm(int i) throws IllegalStateException, InterruptedException {
        if (!this.isInitialized) {
            Log.e(this.tag, "not initialized!", new Object[0]);
            return -1;
        }
        checkBufferLevel();
        this.pcmBuffer.limit(i);
        long jNanoTime = System.nanoTime();
        int i2 = i;
        while (i2 > 0) {
            this.pcmBuffer.position(i - i2);
            System.nanoTime();
            int iWrite = this.audioTrack.write(this.pcmBuffer, i2, 1);
            if (iWrite < 0) {
                Log.e(this.tag, a.a(iWrite, "Couldn't write into AudioTrack (", ")"), new Object[0]);
                return iWrite;
            }
            this.totalFramesWritten += bytes2frames(iWrite);
            if (isStopped()) {
                startPlayingIfItIsTime();
            }
            i2 -= iWrite;
            if (i2 > 0) {
                sleepUntilBufferAvail(i2);
                checkBufferLevel();
            }
            if (i2 > 0 && elapsedNsec(jNanoTime) > TIMEOUT) {
                Log.e(this.tag, "Took too long to write all data, abort!", new Object[0]);
                return -1;
            }
        }
        int i3 = i - i2;
        updateSampleRateMeasure(bytes2frames(i3));
        updateRenderingDelay();
        logStatistics();
        return i3;
    }
}
