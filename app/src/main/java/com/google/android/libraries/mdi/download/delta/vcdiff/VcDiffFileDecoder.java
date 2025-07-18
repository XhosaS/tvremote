package com.google.android.libraries.mdi.download.delta.vcdiff;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VcDiffFileDecoder {
    public static final boolean a = b();

    public static boolean a(String str, String str2, String str3) {
        if (!a) {
            throw new IllegalStateException("Native vcdiff library failed to initialize");
        }
        try {
            return nativeDecoder(str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new IllegalStateException(e);
        }
    }

    static boolean b() {
        try {
            Log.d("VcDiffFileDecoder", "Start to load vcdiffjni.so");
            System.loadLibrary("vcdiffjni");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            Log.e("VcDiffFileDecoder", "Unable to load vcdiffjni.so", e);
            return false;
        }
    }

    private static native boolean nativeDecoder(String str, String str2, String str3);
}
