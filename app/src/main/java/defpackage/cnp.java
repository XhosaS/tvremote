package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cnp implements Executor {
    public final ArrayDeque a = new ArrayDeque();
    public final Object b = new Object();
    private final Executor c;
    private Runnable d;

    public cnp(Executor executor) {
        this.c = executor;
    }

    final void a() {
        Runnable runnable = (Runnable) this.a.poll();
        this.d = runnable;
        if (runnable != null) {
            this.c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.a.add(new cno(this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }
}
