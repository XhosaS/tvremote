package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbm implements Runnable {
    final /* synthetic */ afnd a;

    public agbm(afnd afndVar) {
        this.a = afndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afnd afndVar = this.a;
        afne afneVar = afndVar.b;
        AtomicLong atomicLong = afneVar.c;
        long j = afndVar.a;
        long jMax = Math.max(j + j, j);
        if (atomicLong.compareAndSet(j, jMax)) {
            afne.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{afneVar.b, Long.valueOf(jMax)});
        }
    }
}
