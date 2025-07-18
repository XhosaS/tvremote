package com.google.android.libraries.multiplatform.elements.runtime;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MeasureFunctionJniWrapper implements AutoCloseable {
    private static native long jniCreateMeasureFunction(Object obj);

    private static native void jniDeleteMeasureFunction(long j);

    private static native int jniGetInstanceCount();

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
