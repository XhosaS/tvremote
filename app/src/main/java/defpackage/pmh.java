package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pmh implements Executor {
    private final Executor a;
    private final int b;
    private final Object c = new Object();
    private int d = 0;
    private final Queue e = new ArrayDeque();

    public pmh(Executor executor, int i) {
        this.a = executor;
        this.b = i;
    }

    public final void a() {
        synchronized (this.c) {
            Runnable runnable = (Runnable) this.e.poll();
            if (runnable == null) {
                this.d--;
                return;
            }
            try {
                this.a.execute(wyo.h(new pmg(this, runnable)));
            } catch (Throwable th) {
                qce.g(th, "%s: Task submission failed: %s", "ThrottlingExecutor", runnable);
                synchronized (this.c) {
                    this.d--;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.c) {
            int i = this.d;
            if (i >= this.b) {
                this.e.add(runnable);
                return;
            }
            this.d = i + 1;
            try {
                this.a.execute(wyo.h(new pmg(this, runnable)));
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.d--;
                    throw th;
                }
            }
        }
    }
}
