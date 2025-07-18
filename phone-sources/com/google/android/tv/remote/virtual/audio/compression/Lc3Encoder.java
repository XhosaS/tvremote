package com.google.android.tv.remote.virtual.audio.compression;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import defpackage.a;
import defpackage.tlo;
import defpackage.tug;
import defpackage.tui;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Lc3Encoder implements tlo {
    private final int c;
    private final ByteBuffer d;
    private static final tui b = tui.l("com/google/android/tv/remote/virtual/audio/compression/Lc3Encoder");
    public static final boolean a = b();

    public Lc3Encoder(int i) {
        if (!a) {
            throw new IllegalStateException("LC3 library is not loaded");
        }
        this.c = i;
        ByteBuffer byteBufferInitializeEncoder = initializeEncoder(WVMediaCrypto.TYPE, i);
        this.d = byteBufferInitializeEncoder;
        if (byteBufferInitializeEncoder == null) {
            throw new IllegalArgumentException(a.cf(i, "Failed to initialize the encoder 10000 "));
        }
    }

    static boolean b() {
        try {
            System.loadLibrary("lc3_encoder");
            return true;
        } catch (UnsatisfiedLinkError e) {
            ((tug) ((tug) ((tug) b.f()).i(e)).j("com/google/android/tv/remote/virtual/audio/compression/Lc3Encoder", "loadLc3Library", (char) 17, "Lc3Encoder.java")).s("Loading LC3 encoder failed");
            return false;
        }
    }

    private static native byte[] encode(ByteBuffer byteBuffer, byte[] bArr, int i);

    private static native int frameSize(int i, int i2);

    private static native ByteBuffer initializeEncoder(int i, int i2);

    @Override // defpackage.tlo
    public final int a() {
        return frameSize(WVMediaCrypto.TYPE, this.c);
    }

    @Override // defpackage.tlo
    public final byte[] c(byte[] bArr) {
        byte[] bArrEncode = encode(this.d, bArr, 40);
        return bArrEncode == null ? new byte[0] : bArrEncode;
    }
}
