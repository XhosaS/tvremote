package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsr implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afst b;

    public afsr(afst afstVar, Status status) {
        this.a = status;
        this.b = afstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afst afstVar = this.b;
        afsv afsvVar = afstVar.c;
        if (afsvVar.r.a == affe.SHUTDOWN) {
            return;
        }
        afvc afvcVar = afsvVar.q;
        afot afotVar = afstVar.a;
        if (afvcVar == afotVar) {
            afsvVar.q = null;
            afsvVar.h.c();
            afsvVar.d(affe.IDLE);
            return;
        }
        if (afsvVar.p == afotVar) {
            yqw.R(afsvVar.r.a == affe.CONNECTING, "Expected state is CONNECTING, actual state is %s", afsvVar.r.a);
            afsp afspVar = afsvVar.h;
            affy affyVar = (affy) afspVar.a.get(afspVar.b);
            int i = afspVar.c + 1;
            afspVar.c = i;
            if (i >= affyVar.b.size()) {
                afspVar.b++;
                afspVar.c = 0;
            }
            if (afspVar.b < afspVar.a.size()) {
                afsvVar.i();
                return;
            }
            afsvVar.p = null;
            afspVar.c();
            Status status = this.a;
            afkc afkcVar = afsvVar.g;
            afkcVar.d();
            yqw.B(!status.e(), "The error status must not be OK");
            afsvVar.e(new afff(affe.TRANSIENT_FAILURE, status));
            if (afsvVar.e) {
                return;
            }
            if (afsvVar.u == null) {
                afsvVar.u = new afqy();
            }
            long jA = afsvVar.u.a() - afsvVar.j.a(TimeUnit.NANOSECONDS);
            afsvVar.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", afsvVar.b(status), Long.valueOf(jA));
            yqw.M(afsvVar.k == null, "previous reconnectTask is not done");
            afsvVar.k = afkcVar.a(new afse(afsvVar), jA, TimeUnit.NANOSECONDS, afsvVar.b);
        }
    }
}
