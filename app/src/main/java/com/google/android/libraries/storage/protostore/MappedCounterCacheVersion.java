package com.google.android.libraries.storage.protostore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MappedCounterCacheVersion {
    public final long a;

    public MappedCounterCacheVersion(long j) {
        this.a = j;
    }

    public static native int nativeFileTruncate(int i);

    public static native int nativeGetCounter(long j);

    public static native int nativeIncrementCounter(long j);

    public static native long nativeMmap(int i, boolean z);
}
