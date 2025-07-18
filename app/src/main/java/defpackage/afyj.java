package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afyj extends afir {
    final /* synthetic */ afyk a;
    private final afir b;

    public afyj(afyk afykVar, afir afirVar) {
        this.a = afykVar;
        this.b = afirVar;
    }

    @Override // defpackage.afir
    public final Status a(afit afitVar) {
        Status statusA = this.b.a(afitVar);
        if (statusA.e()) {
            this.a.b.a();
            return statusA;
        }
        afyk afykVar = this.a;
        afyi afyiVar = new afyi(afykVar);
        afnn afnnVar = (afnn) afykVar.b;
        afkc afkcVar = afnnVar.c;
        afkcVar.d();
        if (afnnVar.e == null) {
            afnnVar.e = new afqy();
        }
        afkb afkbVar = afnnVar.d;
        if (afkbVar != null && afkbVar.b()) {
            return statusA;
        }
        long jA = afnnVar.e.a();
        afnnVar.d = afkcVar.a(afyiVar, jA, TimeUnit.NANOSECONDS, afnnVar.b);
        afnn.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        return statusA;
    }
}
