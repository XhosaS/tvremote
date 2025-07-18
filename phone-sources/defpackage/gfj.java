package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfj implements Executor {
    private final Executor a;
    private final ArrayDeque b;
    private Runnable c;
    private final Object d;

    public gfj(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
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
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new foa(runnable, this, 15));
            if (this.c == null) {
                a();
            }
        }
    }
}
