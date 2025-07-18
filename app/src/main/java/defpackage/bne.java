package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bne implements Executor {
    private final Executor a;
    private Runnable c;
    private final ArrayDeque b = new ArrayDeque();
    private final Object d = new Object();

    public bne(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.d) {
            Object objPoll = this.b.poll();
            Runnable runnable = (Runnable) objPoll;
            this.c = runnable;
            if (objPoll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new Runnable() { // from class: bnd
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    bne bneVar = this;
                    try {
                        runnable2.run();
                    } finally {
                        bneVar.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }
    }
}
