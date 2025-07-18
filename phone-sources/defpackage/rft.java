package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rft extends rem {
    public boolean A;
    public boolean B;
    public cuh C;
    public uzn D;
    private final ofj E;
    public final ofm a;
    public final tst y;
    public final tst z;

    public rft(rfy rfyVar, dvk dvkVar, final ofj ofjVar, final tst tstVar, String str, tst tstVar2, tst tstVar3) {
        uie uieVarA = ren.a();
        uieVarA.b = new rei(rfyVar.a, trk.a);
        uieVarA.g(rfyVar.c);
        rek rekVar = new rek();
        rekVar.b(160133);
        rekVar.c(90535);
        rekVar.d(90535);
        uieVarA.c = rekVar.a();
        super(uieVarA.f());
        this.C = new qvu(2);
        this.E = ofjVar;
        this.y = tstVar2;
        this.z = tstVar3;
        vtw vtwVarM = ofm.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ofm ofmVar = (ofm) vtwVarM.b;
        str.getClass();
        ofmVar.c = str;
        vtw vtwVarM2 = uzq.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        uzq uzqVar = (uzq) vtwVarM2.b;
        uzqVar.c = 1;
        uzqVar.b |= 1;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ofm ofmVar2 = (ofm) vtwVarM.b;
        uzq uzqVar2 = (uzq) vtwVarM2.r();
        uzqVar2.getClass();
        ofmVar2.d = uzqVar2;
        ofmVar2.b |= 1;
        String str2 = rfyVar.d;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ofm ofmVar3 = (ofm) vtwVarM.b;
        str2.getClass();
        ofmVar3.b = 2 | ofmVar3.b;
        ofmVar3.e = str2;
        this.a = (ofm) vtwVarM.r();
        d(dvkVar, new dvw() { // from class: rfs
            @Override // defpackage.dvw
            public final void dV(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                rft rftVar = this.a;
                if (zBooleanValue == rftVar.B) {
                    return;
                }
                rftVar.B = bool.booleanValue();
                if (rftVar.A) {
                    Object obj2 = ((ttd) tstVar).a;
                    ((rzy) obj2).p(new qxp(obj2, 14));
                }
                rft.o(ofjVar, rftVar.A, rftVar.a, rftVar.B);
            }
        });
        m(rej.ALWAYS_HIDE_DIVIDER_CARD);
        reo reoVarA = rep.a();
        reoVarA.a = tst.i(rfyVar.b);
        n(tst.i(reoVarA.a()));
        vtw vtwVarM3 = ucb.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ucb ucbVar = (ucb) vtwVarM3.b;
        ucbVar.c = 3;
        ucbVar.b |= 1;
        ucb ucbVar2 = (ucb) vtwVarM3.r();
        vvd vvdVar = rjd.a;
        vtw vtwVarM4 = rjf.a.m();
        vtw vtwVarM5 = ucf.a.m();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        ucf ucfVar = (ucf) vtwVarM5.b;
        ucbVar2.getClass();
        ucfVar.e = ucbVar2;
        ucfVar.b |= 64;
        ucf ucfVar2 = (ucf) vtwVarM5.r();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        rjf rjfVar = (rjf) vtwVarM4.b;
        ucfVar2.getClass();
        rjfVar.c = ucfVar2;
        rjfVar.b |= 1;
        rrx.ap(this.f, tst.i(new pjs(vvdVar, (rjf) vtwVarM4.r())));
        h(new nay(this, str, 11));
        i(false);
    }

    public static void o(ofj ofjVar, boolean z, ofm ofmVar, boolean z2) {
        if (z && z2) {
            ofy.a(ofmVar, (ogd) ofjVar);
        }
    }

    @Override // defpackage.rem
    protected final void k() {
        if (this.A) {
            return;
        }
        this.A = true;
        o(this.E, true, this.a, this.B);
    }

    @Override // defpackage.rem
    protected final void l() {
        this.A = false;
    }
}
