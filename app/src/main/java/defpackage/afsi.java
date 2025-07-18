package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsi implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afsv b;

    public afsi(afsv afsvVar, Status status) {
        this.a = status;
        this.b = afsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afsv afsvVar = this.b;
        affe affeVar = afsvVar.r.a;
        affe affeVar2 = affe.SHUTDOWN;
        if (affeVar == affeVar2) {
            return;
        }
        Status status = this.a;
        afsvVar.s = status;
        afvc afvcVar = afsvVar.q;
        afot afotVar = afsvVar.p;
        afsvVar.q = null;
        afsvVar.p = null;
        afsvVar.d(affeVar2);
        afsvVar.h.c();
        if (afsvVar.n.isEmpty()) {
            afsvVar.f();
        }
        afsvVar.g.d();
        afkb afkbVar = afsvVar.k;
        if (afkbVar != null) {
            afkbVar.a();
            afsvVar.k = null;
            afsvVar.u = null;
        }
        afkb afkbVar2 = afsvVar.l;
        if (afkbVar2 != null) {
            afkbVar2.a();
            afsvVar.m.f(status);
            afsvVar.l = null;
            afsvVar.m = null;
        }
        if (afvcVar != null) {
            afvcVar.f(status);
        }
        if (afotVar != null) {
            afotVar.f(status);
        }
    }
}
