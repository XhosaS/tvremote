package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpm extends lpo {
    static final tsl a = new lpi();
    static final tsl b = new lpj();
    static final tsl c = new lpq(4);
    static final tsl d = new lpq(6);
    static final tsl e = new lpq(5);
    static final tsl f = new lpl();
    static final tsl g = new lpg();

    @Override // defpackage.lpo
    public final void a(vai vaiVar, vtw vtwVar) {
        String str = (vaiVar.b == 2 ? (vcq) vaiVar.c : vcq.a).c;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        kzh kzhVar = (kzh) vtwVar.b;
        kzh kzhVar2 = kzh.a;
        str.getClass();
        kzhVar.b = 2;
        kzhVar.c = str;
    }

    @Override // defpackage.lpo
    public final void b(vai vaiVar, vtw vtwVar) {
        vtw vtwVarM = lcr.a.m();
        String str = vaiVar.b == 1 ? (String) vaiVar.c : "";
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lcr lcrVar = (lcr) vtwVarM.b;
        str.getClass();
        lcrVar.b = str;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        kzh kzhVar = (kzh) vtwVar.b;
        lcr lcrVar2 = (lcr) vtwVarM.r();
        kzh kzhVar2 = kzh.a;
        lcrVar2.getClass();
        kzhVar.c = lcrVar2;
        kzhVar.b = 1;
    }
}
