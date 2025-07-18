package com.google.android.libraries.multiplatform.elements.runtime;

import android.view.Choreographer;
import com.google.android.libraries.elements.interfaces.ClientDataObservable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ElementsRuntimeImpl implements AutoCloseable, Choreographer.FrameCallback {
    private static native void jniAttachNodeTreeProcessor(long j, long j2, boolean z);

    private native long jniCreateRuntime();

    private static native void jniDeleteRuntime(long j);

    private static native void jniDetachNodeTreeProcessor(long j, long j2);

    private static native long[] jniGetDirtyNodeTreeHandles(long j);

    private static native long jniGetInstanceCount();

    private void logInteractionEvents(long j, long j2, long[] jArr, long[] jArr2, long[] jArr3) {
        throw null;
    }

    private void onLayoutEnd(long j) {
        throw null;
    }

    private void reportError(byte[] bArr) {
        throw null;
    }

    private void resolveCommand(long j, long j2, long j3) {
        throw null;
    }

    private void scheduleUpdate() {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        throw null;
    }

    public String getBlockRegistryRef(long j) {
        throw null;
    }

    public ClientDataObservable getClientDataObservable(long j) {
        throw null;
    }
}
