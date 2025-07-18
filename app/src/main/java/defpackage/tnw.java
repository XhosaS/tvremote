package defpackage;

import com.google.android.libraries.elements.interfaces.CachePurgeReason;
import com.google.android.libraries.elements.interfaces.CacheStrategyDelegate;
import io.grpc.Status;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnw extends CacheStrategyDelegate {
    public final tni a;
    private final tmj b;
    private final tmi c;
    private final zyh d;

    public tnw(tni tniVar, tmj tmjVar, tmi tmiVar, zyh zyhVar) {
        tniVar.getClass();
        tmiVar.getClass();
        zyhVar.getClass();
        this.a = tniVar;
        this.b = tmjVar;
        this.c = tmiVar;
        this.d = zyhVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onCacheFull(long j, long j2) {
        this.c.f("Srs.DiskCache.Full");
        this.b.d(acsw.LOG_TYPE_RESOURCE_WARNING, oal.A, null, "SRS DISK CACHE: Cache is full. Current cache size: %s. Cache size cap: %s", Long.valueOf(j), Long.valueOf(j2));
        Status status = Status.OK;
        status.getClass();
        return status;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onCacheInvalid(String str) {
        this.c.f("Srs.DiskCache.Invalid");
        this.b.d(acsw.LOG_TYPE_RESOURCE_WARNING, oal.A, null, "SRS DISK CACHE: Cache is invalid, error details: %s", str);
        Status status = Status.OK;
        status.getClass();
        return status;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onCachePurged(CachePurgeReason cachePurgeReason) {
        xab.b(this.a.a("Srs.DiskCache.Purge.ResourceCount")).a(new Callable() { // from class: tnv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.b();
            }
        }, this.d);
        this.c.f("Srs.DiskCache.Purge");
        this.b.d(acsw.LOG_TYPE_RESOURCE_WARNING, oal.A, null, "SRS DISK CACHE: Cache purged due to %s", cachePurgeReason != null ? cachePurgeReason.name() : null);
        Status status = Status.OK;
        status.getClass();
        return status;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onErrorReadingResource(String str) {
        this.c.f("Srs.DiskCache.ReadError");
        this.b.d(acsw.LOG_TYPE_RESOURCE_WARNING, oal.A, null, "SRS DISK CACHE: Error reading resource: %s", str);
        Status status = Status.OK;
        status.getClass();
        return status;
    }
}
