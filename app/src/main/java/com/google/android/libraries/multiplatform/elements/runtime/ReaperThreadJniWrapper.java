package com.google.android.libraries.multiplatform.elements.runtime;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReaperThreadJniWrapper {
    private final long a = jniCreateReaperThread();

    private static native long jniCreateReaperThread();

    private static native void jniDeleteReaperThread(long j);

    protected final void finalize() {
        long j = this.a;
        if (j != 0) {
            jniDeleteReaperThread(j);
        }
    }
}
