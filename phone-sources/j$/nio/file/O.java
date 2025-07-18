package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class O implements WatchService {
    public final /* synthetic */ P a;

    public /* synthetic */ O(P p) {
        this.a = p;
    }

    public static /* synthetic */ WatchService a(P p) {
        if (p == null) {
            return null;
        }
        return p instanceof N ? ((N) p).a : new O(p);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((N) this.a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        P p = this.a;
        if (obj instanceof O) {
            obj = ((O) obj).a;
        }
        return p.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return L.a(((N) this.a).b());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return L.a(((N) this.a).d());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return L.a(((N) this.a).c(j, timeUnit));
    }
}
