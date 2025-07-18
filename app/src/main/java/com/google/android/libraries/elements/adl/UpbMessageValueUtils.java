package com.google.android.libraries.elements.adl;

import dalvik.annotation.optimization.FastNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpbMessageValueUtils {
    private UpbMessageValueUtils() {
    }

    public static native String jniConvertToLongString(long j);

    @FastNative
    public static native String jniConvertToShortString(long j);

    private static native void jniCopyAndWriteByteArray(long j, byte[] bArr, int i, long j2);

    public static native byte[] jniCopyToByteArray(long j);

    private static native boolean[] jniRetrieveBooleanArray(long j);

    private static native double[] jniRetrieveDoubleArray(long j);

    public static native float[] jniRetrieveFloatArray(long j);

    public static native int[] jniRetrieveIntArray(long j);

    private static native long[] jniRetrieveLongArray(long j);

    private static native long[] jniRetrieveMap(long j, long j2, long j3);

    public static native long[] jniRetrievePointerArray(long j);
}
