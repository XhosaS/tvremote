package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CacheStrategyDelegate {
    public abstract Status onCacheFull(long j, long j2);

    public abstract Status onCacheInvalid(String str);

    public abstract Status onCachePurged(CachePurgeReason cachePurgeReason);

    public abstract Status onErrorReadingResource(String str);
}
