package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmj extends agfx {
    static final agmh b;
    public static final agna c;
    static final int d;
    static final agmi e;
    final ThreadFactory f;
    final AtomicReference g;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        d = iAvailableProcessors;
        agmi agmiVar = new agmi(new agna("RxComputationShutdown"));
        e = agmiVar;
        agmiVar.dispose();
        agna agnaVar = new agna("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = agnaVar;
        agmh agmhVar = new agmh(0, agnaVar);
        b = agmhVar;
        agmhVar.b();
    }

    public agmj() {
        throw null;
    }

    @Override // defpackage.agfx
    public final agfw a() {
        return new agmg(((agmh) this.g.get()).a());
    }

    @Override // defpackage.agfx
    public final aggi c(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((agmh) this.g.get()).a().d(runnable, j, timeUnit);
    }

    @Override // defpackage.agfx
    public final aggi d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((agmh) this.g.get()).a().e(runnable, j, j2, timeUnit);
    }

    public agmj(ThreadFactory threadFactory) {
        this.f = threadFactory;
        agmh agmhVar = b;
        AtomicReference atomicReference = new AtomicReference(agmhVar);
        this.g = atomicReference;
        agmh agmhVar2 = new agmh(d, threadFactory);
        while (!atomicReference.compareAndSet(agmhVar, agmhVar2)) {
            if (atomicReference.get() != agmhVar) {
                agmhVar2.b();
                return;
            }
        }
    }
}
