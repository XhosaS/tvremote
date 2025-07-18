package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbo implements Executor {
    private final int a;
    private final Executor b;
    private final AtomicInteger c;

    public mbo(int i, Executor executor, AtomicInteger atomicInteger) {
        this.a = i;
        this.b = executor;
        this.c = atomicInteger;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(new mbn(this.a, this.c.incrementAndGet(), runnable));
    }
}
