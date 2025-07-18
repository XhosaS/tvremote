package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class gj implements Executor {
    final Executor b;
    Runnable c;
    private final Object d = new Object();
    final Queue a = new ArrayDeque();

    public gj(Executor executor) {
        this.b = executor;
    }

    protected final void a() {
        synchronized (this.d) {
            Runnable runnable = (Runnable) this.a.poll();
            this.c = runnable;
            if (runnable != null) {
                this.b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.d) {
            this.a.add(new Runnable() { // from class: gi
                @Override // java.lang.Runnable
                public final void run() {
                    gj gjVar = this.a;
                    try {
                        runnable.run();
                    } finally {
                        gjVar.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }
    }
}
