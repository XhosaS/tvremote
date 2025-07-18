package j$.nio.file;

import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class O implements Q {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ O(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ Q a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof P ? ((P) watchService).a : new O(watchService);
    }

    public final /* synthetic */ N b() {
        return L.b(this.a.poll());
    }

    public final /* synthetic */ N c(long j, TimeUnit timeUnit) {
        return L.b(this.a.poll(j, timeUnit));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ N d() {
        return L.b(this.a.take());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof O) {
            obj = ((O) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
