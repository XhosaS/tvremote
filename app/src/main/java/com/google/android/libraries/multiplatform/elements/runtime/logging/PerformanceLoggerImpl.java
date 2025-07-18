package com.google.android.libraries.multiplatform.elements.runtime.logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PerformanceLoggerImpl {
    private static native long[] jniLogPerformanceSpans();

    private static native void jniQueuePerformanceSpan(long j, long j2, int i);
}
