package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agnl extends agfw implements aggi {
    volatile boolean c;
    final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final AtomicInteger d = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        agni agniVar = new agni(runnable, this, jA);
        if (!this.c) {
            agnj agnjVar = new agnj(agniVar, Long.valueOf(jA), this.b.incrementAndGet());
            PriorityBlockingQueue priorityBlockingQueue = this.a;
            priorityBlockingQueue.add(agnjVar);
            AtomicInteger atomicInteger = this.d;
            if (atomicInteger.getAndIncrement() != 0) {
                return new aggk(new agnk(this, agnjVar));
            }
            int iAddAndGet = 1;
            while (!this.c) {
                agnj agnjVar2 = (agnj) priorityBlockingQueue.poll();
                if (agnjVar2 == null) {
                    iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!agnjVar2.d) {
                    agnjVar2.a.run();
                }
            }
            priorityBlockingQueue.clear();
            return aghe.INSTANCE;
        }
        return aghe.INSTANCE;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.c = true;
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
