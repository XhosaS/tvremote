package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class P implements WatchService {
    public final /* synthetic */ Q a;

    public /* synthetic */ P(Q q) {
        this.a = q;
    }

    public static /* synthetic */ WatchService a(Q q) {
        if (q == null) {
            return null;
        }
        return q instanceof O ? ((O) q).a : new P(q);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((O) this.a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Q q = this.a;
        if (obj instanceof P) {
            obj = ((P) obj).a;
        }
        return q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return M.a(((O) this.a).b());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return M.a(((O) this.a).d());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return M.a(((O) this.a).c(j, timeUnit));
    }
}
