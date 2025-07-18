package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmu extends agfw {
    final AtomicBoolean a = new AtomicBoolean();
    private final aggh b = new aggh();
    private final agmt c;
    private final agmv d;

    public agmu(agmt agmtVar) {
        agmv agmvVar;
        this.c = agmtVar;
        if (!agmtVar.c.b) {
            while (true) {
                if (agmtVar.b.isEmpty()) {
                    agmvVar = new agmv(agmtVar.d);
                    agmtVar.c.a(agmvVar);
                    break;
                } else {
                    agmvVar = (agmv) agmtVar.b.poll();
                    if (agmvVar != null) {
                        break;
                    }
                }
            }
        } else {
            agmvVar = agmw.d;
        }
        this.d = agmvVar;
    }

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        aggh agghVar = this.b;
        return agghVar.b ? aghe.INSTANCE : this.d.g(runnable, j, timeUnit, agghVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.a.compareAndSet(false, true)) {
            this.b.dispose();
            agmt agmtVar = this.c;
            agmv agmvVar = this.d;
            agmvVar.a = System.nanoTime() + agmtVar.a;
            agmtVar.b.offer(agmvVar);
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
