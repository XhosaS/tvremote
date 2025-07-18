package com.google.android.tv.remote.service.audio.compression;

import defpackage.b;
import defpackage.bqm;
import defpackage.cbs;
import defpackage.cbt;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Lc3Decoder implements bqm {
    private final int c;
    private final int d;
    private final ByteBuffer e;
    private static final cbt b = cbt.k("com/google/android/tv/remote/service/audio/compression/Lc3Decoder");
    public static final boolean a = a();

    public Lc3Decoder(int i, int i2) {
        if (!a) {
            throw new IllegalStateException("LC3 library is not loaded");
        }
        this.c = i;
        this.d = i2;
        ByteBuffer byteBufferInitializeDecoder = initializeDecoder(i, i2);
        this.e = byteBufferInitializeDecoder;
        if (byteBufferInitializeDecoder == null) {
            throw new IllegalArgumentException(b.f(i2, i, "Failed to initialize the decoder ", " "));
        }
    }

    static boolean a() {
        try {
            System.loadLibrary("lc3_decoder");
            return true;
        } catch (UnsatisfiedLinkError e) {
            ((cbs) ((cbs) b.f().i(e)).j("com/google/android/tv/remote/service/audio/compression/Lc3Decoder", "loadLc3Library", 17, "Lc3Decoder.java")).p("Loading LC3 decoder failed.");
            return false;
        }
    }

    private static native byte[] decode(ByteBuffer byteBuffer, byte[] bArr, int i, int i2);

    private static native ByteBuffer initializeDecoder(int i, int i2);

    @Override // defpackage.bqm
    public final byte[] b(byte[] bArr) {
        return decode(this.e, bArr, this.c, this.d);
    }
}
