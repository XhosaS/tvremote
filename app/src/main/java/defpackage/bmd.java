package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmd extends bkq {
    public final bks a;
    public final bmu b;
    public final List c;
    public final brr d;
    public brm e;
    public final boq f;

    public bmd(bks bksVar, bmu bmuVar, agvb agvbVar) {
        this.a = bksVar;
        this.b = bmuVar;
        this.c = bksVar.e;
        brr brrVarA = bksVar.c.a(bro.a(bksVar.a, bksVar.b, new bmb(this, bmuVar.a), false, false));
        this.d = brrVarA;
        bsl bslVar = new bsl(brrVarA);
        String str = bksVar.b;
        this.f = new boq(bslVar, str == null ? ":memory:" : str, agvbVar);
        c();
    }

    private final void c() {
        brr brrVar = this.d;
        if (brrVar != null) {
            brrVar.d(this.a.q == 3);
        }
    }

    @Override // defpackage.bkq
    protected final bmu a() {
        return this.b;
    }

    public bmd(bks bksVar, agux aguxVar, agvb agvbVar) {
        this.a = bksVar;
        this.b = new bma();
        this.c = bksVar.e;
        brr brrVar = (brr) aguxVar.a(new bks(bksVar.a, bksVar.b, bksVar.c, bksVar.d, agqq.u(bksVar.e, new bmc(new agux() { // from class: blz
            @Override // defpackage.agux
            public final Object a(Object obj) {
                brm brmVar = (brm) obj;
                brmVar.getClass();
                this.a.e = brmVar;
                return agpu.a;
            }
        })), bksVar.f, bksVar.q, bksVar.g, bksVar.h, bksVar.i, bksVar.j, bksVar.k, bksVar.l, bksVar.m, bksVar.n, bksVar.o));
        this.d = brrVar;
        bsl bslVar = new bsl(brrVar);
        String str = bksVar.b;
        this.f = new boq(bslVar, str == null ? ":memory:" : str, agvbVar);
        c();
    }
}
