package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmw extends agfx {
    public static final agna b;
    static final agna c;
    static final agmv d;
    static final agmt e;
    final ThreadFactory f;
    final AtomicReference g;
    private static final TimeUnit i = TimeUnit.SECONDS;
    private static final long h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        agmv agmvVar = new agmv(new agna("RxCachedThreadSchedulerShutdown"));
        d = agmvVar;
        agmvVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        agna agnaVar = new agna("RxCachedThreadScheduler", iMax, false);
        b = agnaVar;
        c = new agna("RxCachedWorkerPoolEvictor", iMax, false);
        agmt agmtVar = new agmt(0L, null, agnaVar);
        e = agmtVar;
        agmtVar.a();
    }

    public agmw() {
        throw null;
    }

    @Override // defpackage.agfx
    public final agfw a() {
        return new agmu((agmt) this.g.get());
    }

    public agmw(ThreadFactory threadFactory) {
        this.f = threadFactory;
        agmt agmtVar = e;
        AtomicReference atomicReference = new AtomicReference(agmtVar);
        this.g = atomicReference;
        agmt agmtVar2 = new agmt(h, i, threadFactory);
        while (!atomicReference.compareAndSet(agmtVar, agmtVar2)) {
            if (atomicReference.get() != agmtVar) {
                agmtVar2.a();
                return;
            }
        }
    }
}
