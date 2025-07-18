package com.google.android.exoplayer2.ext.widevine;

import androidx.media3.decoder.CryptoConfig;
import defpackage.nel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WVMediaCrypto implements CryptoConfig {
    public static final int TYPE = 10000;
    private final long nativeObject;

    static {
        if (nel.a) {
            native_init();
        }
    }

    WVMediaCrypto(long j) {
        this.nativeObject = j;
    }

    private native void native_finalize();

    private static native void native_init();

    protected void finalize() throws Throwable {
        native_finalize();
        super.finalize();
    }

    public final native void release();
}
