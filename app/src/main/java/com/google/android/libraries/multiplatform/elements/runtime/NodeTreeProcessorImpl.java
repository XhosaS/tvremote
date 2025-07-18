package com.google.android.libraries.multiplatform.elements.runtime;

import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.LocalElementsServices;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NodeTreeProcessorImpl implements AutoCloseable {
    private static native int[] jniApply(long j, long j2, Object obj, float f, float f2, ElementsServices elementsServices, LocalElementsServices localElementsServices, int i, int i2);

    private static native long jniCreateNodeTreeProcessor(long j, long j2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native void jniDeleteNodeTreeProcessor(long j);

    private static native void jniGenerateAndPrepare(long j, long j2, float f, float f2, boolean z);

    private static native void jniGenerateAndPrepare(long j, long j2, long j3, float f, float f2, boolean z);

    private static native long jniGetInstanceCount();

    private static native int[] jniGetLayoutSize(long j);

    private static native long jniGetSnapshot(long j);

    private static native boolean jniHandleTouchEvent(long j, int i, float f, float f2, long j2);

    private static native boolean jniHasNewSnapshot(long j);

    private static native long jniLatestSnapshotVersion(long j);

    private static native void jniLogGestureEvent(long j, int i, int i2);

    private static native void jniMeasure(long j, float f, float f2, boolean z);

    private static native void jniRegenerate(long j);

    private static native void jniSetIsAttachedToWindow(long j, boolean z);

    private static native void jniSetVisibleBounds(long j, int i, int i2, int i3, int i4);

    private static native void jniSetWindowInsets(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private static native int[] jniWaitForMeasure(long j, int i, int i2, boolean z);

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
