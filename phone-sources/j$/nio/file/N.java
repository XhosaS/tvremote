package j$.nio.file;

import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class N implements P {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ N(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ P a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof O ? ((O) watchService).a : new N(watchService);
    }

    public final /* synthetic */ M b() {
        return K.b(this.a.poll());
    }

    public final /* synthetic */ M c(long j, TimeUnit timeUnit) {
        return K.b(this.a.poll(j, timeUnit));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ M d() {
        return K.b(this.a.take());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof N) {
            obj = ((N) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
