package com.google.android.libraries.multiplatform.elements.runtime;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ViewProcessorContextImpl implements AutoCloseable {
    private static native long jniCreateViewProcessorContext(Object obj, Object obj2, Object obj3, Object obj4, long j, float f, long j2);

    private static native void jniDeleteViewProcessorContext(long j);

    private static native long jniGetViewProcessorContextInstanceCount();

    private static native void jniSetPipelineStrategy(long j, int[] iArr);

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    public void setPipelineStrategy(int[] iArr) {
        throw null;
    }
}
