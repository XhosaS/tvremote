package com.google.android.exoplayer2.ext.vp9;

import defpackage.ecv;
import defpackage.nek;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VpxLibrary {
    public static final ecv a = new nek("vpx", "vpxV2JNI");
    public static int b = 1;

    public static boolean a() {
        return a.c();
    }

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
