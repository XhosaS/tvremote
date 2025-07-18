package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afps extends afqm {
    public final afhh a;
    public final affp b = affp.k();
    public final afev[] c;
    public volatile Status d;
    final /* synthetic */ afpu e;

    public afps(afpu afpuVar, afhh afhhVar, afev[] afevVarArr) {
        this.e = afpuVar;
        this.a = afhhVar;
        this.c = afevVarArr;
    }

    @Override // defpackage.afqm
    protected final void b() {
        int i = 0;
        while (true) {
            afev[] afevVarArr = this.c;
            if (i >= afevVarArr.length) {
                return;
            }
            afev afevVar = afevVarArr[i];
            i++;
        }
    }

    @Override // defpackage.afqm, defpackage.afoe
    public final void m(afry afryVar) {
        if (((afwj) this.a).a.i()) {
            afryVar.a("wait_for_ready");
            Status status = this.d;
            if (status != null && !status.e()) {
                afryVar.b("Last Pick Failure", status);
            }
        }
        super.m(afryVar);
    }

    @Override // defpackage.afqm, defpackage.afoe
    public final void n(Status status) {
        super.n(status);
        afpu afpuVar = this.e;
        synchronized (afpuVar.a) {
            if (afpuVar.e != null) {
                boolean zRemove = afpuVar.g.remove(this);
                if (!afpuVar.e() && zRemove) {
                    afkc afkcVar = afpuVar.b;
                    afkcVar.c(afpuVar.d);
                    if (afpuVar.h.b != null) {
                        afkcVar.c(afpuVar.e);
                        afpuVar.e = null;
                    }
                }
            }
        }
        this.e.b.b();
    }
}
