package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lta extends lsr {
    static final tsl a = new lpm();
    static final tsl b = new lth();
    private final val c;
    private final ksz d;

    public lta(val valVar, ksz kszVar) {
        this.c = valVar;
        this.d = kszVar;
    }

    @Override // defpackage.lsr
    public final void b(wam wamVar, vtw vtwVar) {
        lcr lcrVarP = lbk.p(this.d.e(kir.p(wamVar.h)));
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        lbe lbeVar = (lbe) vtwVar.b;
        lbe lbeVar2 = lbe.a;
        lcrVarP.getClass();
        lbeVar.g = lcrVarP;
        lbeVar.b |= 4;
    }

    @Override // defpackage.lsr
    public final void c(wam wamVar, vtw vtwVar) {
        vtw vtwVarM = lak.a.m();
        String str = (wamVar.c == 5 ? (waj) wamVar.d : waj.a).b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lak lakVar = (lak) vtwVarM.b;
        str.getClass();
        lakVar.b = str;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        lbe lbeVar = (lbe) vtwVar.b;
        lak lakVar2 = (lak) vtwVarM.r();
        lbe lbeVar2 = lbe.a;
        lakVar2.getClass();
        lbeVar.i = lakVar2;
        lbeVar.b |= 16;
    }

    @Override // defpackage.lsr
    public final void d(wam wamVar, vtw vtwVar) {
        vtw vtwVarM = lbd.a.m();
        String str = (wamVar.c == 8 ? (wak) wamVar.d : wak.a).b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbd lbdVar = (lbd) vtwVarM.b;
        str.getClass();
        lbdVar.b = str;
        val valVar = (wamVar.c == 8 ? (wak) wamVar.d : wak.a).c;
        if (valVar == null) {
            valVar = val.a;
        }
        String str2 = valVar.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbd lbdVar2 = (lbd) vtwVarM.b;
        str2.getClass();
        lbdVar2.c = str2;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        lbe lbeVar = (lbe) vtwVar.b;
        lbd lbdVar3 = (lbd) vtwVarM.r();
        lbe lbeVar2 = lbe.a;
        lbdVar3.getClass();
        lbeVar.k = lbdVar3;
        lbeVar.b |= 64;
    }

    @Override // defpackage.lsr
    public final void e(wam wamVar, vtw vtwVar) {
        vtw vtwVarM = lco.a.m();
        String str = (wamVar.c == 6 ? (wal) wamVar.d : wal.a).b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lco lcoVar = (lco) vtwVarM.b;
        str.getClass();
        lcoVar.b = str;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        lbe lbeVar = (lbe) vtwVar.b;
        lco lcoVar2 = (lco) vtwVarM.r();
        lbe lbeVar2 = lbe.a;
        lcoVar2.getClass();
        lbeVar.j = lcoVar2;
        lbeVar.b |= 32;
    }

    @Override // defpackage.lsr
    public final void f(vtw vtwVar) {
        vtw vtwVarM = kzu.a.m();
        String str = this.c.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        kzu kzuVar = (kzu) vtwVarM.b;
        str.getClass();
        kzuVar.b = str;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        lbe lbeVar = (lbe) vtwVar.b;
        kzu kzuVar2 = (kzu) vtwVarM.r();
        lbe lbeVar2 = lbe.a;
        kzuVar2.getClass();
        lbeVar.c = kzuVar2;
        lbeVar.b |= 1;
    }
}
