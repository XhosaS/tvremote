package com.google.android.libraries.multiplatform.elements.runtime;

import dalvik.annotation.optimization.CriticalNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NodeTreeImpl implements AutoCloseable {
    private static native long jniCloneNodeTreeRef(long j);

    private static native long jniCreateEmptyNodeTree();

    private static native void jniDeleteNodeTree(long j);

    private static native long jniGetInstanceCount();

    private static native long jniSnapshotVersion(long j);

    @CriticalNative
    private static native long jniSnapshotVersionCritical(long j);

    public final /* bridge */ /* synthetic */ Object clone() {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
