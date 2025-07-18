package com.google.audio.hearing.common;

import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OggOpusEncoder {
    private static final zdy b = zdy.h("com/google/audio/hearing/common/OggOpusEncoder");
    public long a = 0;

    static {
        try {
            System.loadLibrary("ogg_opus_encoder");
        } catch (UnsatisfiedLinkError e) {
            ((zdv) ((zdv) ((zdv) b.d()).p(e)).q("com/google/audio/hearing/common/OggOpusEncoder", "<clinit>", 'M', "OggOpusEncoder.java")).u("System did not find libogg_opus_encoder.so! Make sure your JVM explicitly loads this lib, particularly if you are on Android.");
        }
    }

    private native byte[] flush(long j);

    private native void free(long j);

    public final byte[] a() {
        long j = this.a;
        if (j == 0) {
            ((zdv) ((zdv) b.c()).q("com/google/audio/hearing/common/OggOpusEncoder", "flushAndStop", 53, "OggOpusEncoder.java")).u("stop() called multiple times or without call to initialize()!");
            return new byte[0];
        }
        byte[] bArrFlush = flush(j);
        free(this.a);
        this.a = 0L;
        return bArrFlush;
    }

    protected final void finalize() throws Throwable {
        super.finalize();
        if (this.a != 0) {
            ((zdv) ((zdv) b.c()).q("com/google/audio/hearing/common/OggOpusEncoder", "finalize", 62, "OggOpusEncoder.java")).u("Native OggOpusEncoder resources weren't cleaned up. You must call stop()!");
            free(this.a);
        }
    }

    public native long init(int i, int i2, int i3, boolean z);

    public native byte[] processAudioBytes(long j, byte[] bArr, int i, int i2);
}
