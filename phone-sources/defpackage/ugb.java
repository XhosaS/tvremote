package defpackage;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugb extends IdentityHashMap implements Closeable {
    public final ulp a = new ulp(this, (byte[]) null);
    private volatile boolean b;
    private volatile CountDownLatch c;

    public final void a(AutoCloseable autoCloseable, Executor executor) {
        executor.getClass();
        if (autoCloseable == null) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                uge.e(autoCloseable, executor);
            } else {
                put(autoCloseable, executor);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                uge.e((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
