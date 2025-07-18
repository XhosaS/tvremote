package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szn implements rsm {
    final /* synthetic */ syb a;
    final /* synthetic */ agwh b;
    final /* synthetic */ szo c;
    final /* synthetic */ ahaz d;

    public szn(syb sybVar, ahaz ahazVar, agwh agwhVar, szo szoVar) {
        this.a = sybVar;
        this.d = ahazVar;
        this.b = agwhVar;
        this.c = szoVar;
    }

    @Override // defpackage.rsm
    public final Executor a() {
        return this.c.d;
    }

    @Override // defpackage.rsm, defpackage.sbo
    public final void b(rsu rsuVar) {
        rso rsoVar;
        rsuVar.getClass();
        if (rsuVar.c == 2) {
            this.a.a();
            this.d.N(agpu.a);
        } else {
            if (!this.a.b(rsuVar).isCancelled() || (rsoVar = (rso) this.b.a) == null) {
                return;
            }
            rsoVar.a.a();
        }
    }
}
