package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aice implements Executor {
    private final Executor a;
    private final Runnable b = new Runnable() { // from class: aicd
        @Override // java.lang.Runnable
        public final void run() {
            this.a.a();
        }
    };
    private final ArrayDeque c = new ArrayDeque();
    private boolean d;

    public aice(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.c;
        synchronized (arrayDeque) {
            if (this.d) {
                return;
            }
            Runnable runnable = (Runnable) arrayDeque.pollFirst();
            this.d = runnable != null;
            while (runnable != null) {
                try {
                    runnable.run();
                    synchronized (arrayDeque) {
                        runnable = (Runnable) arrayDeque.pollFirst();
                        this.d = runnable != null;
                    }
                } catch (Throwable th) {
                    synchronized (this.c) {
                        this.d = false;
                        try {
                            this.a.execute(this.b);
                        } catch (RejectedExecutionException unused) {
                        }
                        throw th;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ArrayDeque arrayDeque = this.c;
        synchronized (arrayDeque) {
            arrayDeque.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
