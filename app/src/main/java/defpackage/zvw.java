package defpackage;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvw extends IdentityHashMap implements Closeable {
    public final zvz a = new zvz(this);
    private volatile boolean b;
    private volatile CountDownLatch c;

    final zyd a(zvy zvyVar, Object obj) {
        zvw zvwVar = new zvw();
        try {
            return zxn.h(zvyVar.a(zvwVar.a, obj));
        } finally {
            b(zvwVar, zwk.a);
        }
    }

    final void b(AutoCloseable autoCloseable, Executor executor) {
        executor.getClass();
        if (autoCloseable == null) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                zwc.k(autoCloseable, executor);
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
                zwc.k((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
