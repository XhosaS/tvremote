package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afrf extends afhq {
    public final afhq a;

    public afrf(afhq afhqVar) {
        this.a = afhqVar;
    }

    @Override // defpackage.afen
    public final afeq a(afil afilVar, afem afemVar) {
        return ((afun) this.a).q.a(afilVar, afemVar);
    }

    @Override // defpackage.afen
    public final String b() {
        return ((afun) this.a).q.b();
    }

    @Override // defpackage.afhq
    public final boolean d() {
        return ((afun) this.a).C.get();
    }

    @Override // defpackage.afhq
    public final void e(long j, TimeUnit timeUnit) throws InterruptedException {
        ((afun) this.a).F.await(j, timeUnit);
    }

    @Override // defpackage.afhq
    public void f() {
        throw null;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", this.a);
        return yqqVarB.toString();
    }
}
