package com.google.android.libraries.assistant.soda;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import defpackage.mcw;
import defpackage.ruo;
import defpackage.slg;
import defpackage.szs;
import defpackage.zdv;
import defpackage.zdy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
class AudioInput {
    private static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/AudioInput");
    private final long b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private AudioRecord l;
    private ByteBuffer m;
    private ByteBuffer n;
    private final int o;
    private final boolean p;
    private final szs r;
    private slg s;
    private ruo t;
    private final mcw u;
    private int k = 0;
    private boolean q = false;

    public AudioInput(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        mcw mcwVar = new mcw();
        this.u = mcwVar;
        this.r = new szs(mcwVar);
        this.s = null;
        this.t = null;
        this.b = j;
        this.h = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.o = i6;
        this.p = z;
        this.i = z2;
        this.j = z3;
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/AudioInput", "<init>", 142, "AudioInput.java")).Q(Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    private final void a() {
        AudioRecord audioRecord = this.l;
        if (audioRecord != null) {
            audioRecord.release();
            this.l = null;
        }
    }

    private final boolean b(int i, int i2, int i3) throws UnsupportedOperationException {
        try {
            AudioRecord audioRecordBuild = new AudioRecord.Builder().setAudioSource(this.c).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.d).setChannelMask(i).setEncoding(i2).build()).setBufferSizeInBytes(i3).build();
            this.l = audioRecordBuild;
            if (audioRecordBuild == null) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 389, "AudioInput.java")).u("Init: Cannot create AudioRecord instance!");
                return false;
            }
            if (audioRecordBuild.getState() != 1) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 394, "AudioInput.java")).u("Init: AudioRecord instance state not INITIALIZED");
                a();
                return false;
            }
            if (this.j) {
                if (AcousticEchoCanceler.isAvailable()) {
                    AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(this.l.getAudioSessionId());
                    if (acousticEchoCancelerCreate == null) {
                        ((zdv) ((zdv) a.d()).q("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 357, "AudioInput.java")).u("Init: AcousticEchoCanceler is null");
                    } else if (acousticEchoCancelerCreate.setEnabled(true) != 0) {
                        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 361, "AudioInput.java")).u("Init: AcousticEchoCanceler.setEnabled failed");
                    } else {
                        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 365, "AudioInput.java")).u("Init: Enabled AcousticEchoCanceler");
                    }
                } else {
                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 350, "AudioInput.java")).u("Init: AcousticEchoCanceler is not available");
                }
                a();
                return false;
            }
            return true;
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 385, "AudioInput.java")).x("Init: Cannot create AudioRecord instance: %s", e.getMessage());
            return false;
        }
    }

    private final boolean c(int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class cls = Integer.TYPE;
            Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, cls, cls);
            Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(i).setEncoding(i2).setSampleRate(this.d).build();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            method.invoke(builder, Integer.valueOf(this.c));
            try {
                AudioRecord audioRecord = (AudioRecord) constructor.newInstance(builder.build(), audioFormatBuild, Integer.valueOf(i3), Integer.valueOf(i4));
                this.l = audioRecord;
                if (audioRecord == null || audioRecord.getState() == 1) {
                    return true;
                }
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 458, "AudioInput.java")).u("Failed to initialize AudioRecord");
                a();
                return false;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 453, "AudioInput.java")).u("Exception while invoking new AudioRecord");
                return false;
            }
        } catch (Exception unused2) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 464, "AudioInput.java")).v("Failed to construct AudioRecord for capture session %d", this.o);
            return false;
        }
    }

    private final boolean d(int i, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i3 = this.g * 5;
        try {
            Class cls = Integer.TYPE;
            Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, cls, cls);
            Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
            AudioFormat.Builder builder = new AudioFormat.Builder();
            if (i == 16 || i == 12) {
                builder.setChannelMask(i);
            } else {
                if (i != 15) {
                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 310, "AudioInput.java")).v("Invalid loopback channelConfig: %d", i);
                    return false;
                }
                builder.setChannelIndexMask(15);
            }
            builder.setEncoding(i2);
            builder.setSampleRate(this.d);
            AudioFormat audioFormatBuild = builder.build();
            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
            method.invoke(builder2, Integer.valueOf(this.c));
            try {
                AudioRecord audioRecord = (AudioRecord) constructor.newInstance(builder2.build(), audioFormatBuild, Integer.valueOf(i3), 0);
                this.l = audioRecord;
                if (audioRecord == null || audioRecord.getState() == 1) {
                    return true;
                }
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 334, "AudioInput.java")).u("Failed to initialize AudioRecord for loopback");
                a();
                return false;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 329, "AudioInput.java")).u("Exception while invoking new AudioRecord for loopback");
                return false;
            }
        } catch (Exception unused2) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 340, "AudioInput.java")).u("Failed to construct AudioRecord for loopback session");
            return false;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private int readBuffer() throws InterruptedException {
        int i;
        this.m.clear();
        AudioRecord audioRecord = this.l;
        if (audioRecord == null) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 546, "AudioInput.java")).u("Cannot read audio, no audio record!");
            return -1;
        }
        if (this.i) {
            int iCapacity = this.m.capacity();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iCapacity);
            i = 0;
            int i2 = 0;
            while (true) {
                if (!this.q) {
                    byteBufferAllocateDirect.clear();
                    AudioRecord audioRecord2 = this.l;
                    if (audioRecord2 != null) {
                        int i3 = audioRecord2.read(byteBufferAllocateDirect, iCapacity - i, 1);
                        if (i3 >= 0) {
                            if (i3 != 0) {
                                byteBufferAllocateDirect.position(i3);
                                byteBufferAllocateDirect.flip();
                                this.m.put(byteBufferAllocateDirect);
                                i += i3;
                                if (i == this.m.capacity()) {
                                    break;
                                }
                                i2 = 0;
                                Thread.sleep(this.h);
                            } else {
                                i2++;
                                if (i2 >= 6) {
                                    break;
                                }
                                try {
                                    Thread.sleep(this.h);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        } else {
                            i = i3;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            ByteBuffer byteBuffer = this.m;
            i = audioRecord.read(byteBuffer, byteBuffer.capacity());
        }
        if (i < 0) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 556, "AudioInput.java")).v("ReadBuffer: read failed with error: %d", i);
            return -1;
        }
        if (i == 0) {
            int i4 = this.k;
            if (i4 < 10) {
                this.k = i4 + 1;
                return 0;
            }
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 560, "AudioInput.java")).u("ReadBuffer: too many consecutive zero byte buffers.");
            this.k = 0;
            return -1;
        }
        this.k = 0;
        this.n.position(0);
        this.n.putLong(this.r.a(this.s.a(i).a) / 1000);
        if (i != this.m.capacity()) {
            this.m.capacity();
        }
        return i;
    }

    private void stop() throws IllegalStateException {
        this.q = true;
        if (this.l != null) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/AudioInput", "stop", 508, "AudioInput.java")).u("Stopping recording");
        }
        AudioRecord audioRecord = this.l;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        a();
        this.s = null;
        this.q = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:4)(1:(1:6)(3:67|68|69))|7|(1:(1:(3:11|68|69)(1:12))(1:13))(1:14)|15|72|16|17|(1:19)(13:20|(1:22)|23|(1:25)|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)(2:38|(1:64)(4:43|(1:45)|46|(1:48)(2:49|(1:51)(1:52))))|(2:54|(4:70|56|57|58)(2:62|63)))|68|69|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x021c, code lost:
    
        ((defpackage.zdv) ((defpackage.zdv) com.google.android.libraries.assistant.soda.AudioInput.a.c()).q("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 204, "AudioInput.java")).x("Init: Cannot create mPcmBuffer: %s", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean start() throws java.lang.IllegalStateException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.AudioInput.start():boolean");
    }
}
