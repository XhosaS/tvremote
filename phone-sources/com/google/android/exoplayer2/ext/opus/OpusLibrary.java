package com.google.android.exoplayer2.ext.opus;

import defpackage.ecv;
import defpackage.neh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpusLibrary {
    public static final ecv a = new neh("opusV2JNI");
    public static int b = 1;

    public static boolean a() {
        return a.c();
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
