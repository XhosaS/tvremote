package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rf extends bxw implements cae, byd, bxu, bzt, cak {
    private static final hv g = new hv();
    public final yjv a;
    public wl b;
    public adi c;
    public final bmr d;
    public kw e;
    private bvc f;

    public rf(kw kwVar, int i, yjv yjvVar) {
        this.e = kwVar;
        this.a = yjvVar;
        bmr bmrVar = new bmr(i, new gew((Object) this, 1, (byte[]) null), 4);
        O(bmrVar);
        this.d = bmrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final rg a() {
        cak cakVar;
        bzm bzmVar;
        if (this.A) {
            hv hvVar = rg.a;
            if (!this.q.A) {
                bty.c("visitAncestors called on an unattached node");
            }
            bko bkoVar = this.q.t;
            bys bysVarI = fh.I(this);
            loop0: while (true) {
                if (bysVarI == null) {
                    cakVar = null;
                    break;
                }
                if ((bysVarI.t.f.s & 262144) != 0) {
                    while (bkoVar != null) {
                        if ((bkoVar.r & 262144) != 0) {
                            ?? bfzVar = 0;
                            bxw bxwVarF = bkoVar;
                            while (bxwVarF != 0) {
                                if (bxwVarF instanceof cak) {
                                    cakVar = (cak) bxwVarF;
                                    if (yks.e(hvVar, cakVar.ci())) {
                                        break loop0;
                                    }
                                } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                                    bko bkoVar2 = bxwVarF.C;
                                    int i = 0;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                    while (bkoVar2 != null) {
                                        if ((bkoVar2.r & 262144) != 0) {
                                            i++;
                                            bfzVar = bfzVar;
                                            if (i == 1) {
                                                bxwVarF = bkoVar2;
                                            } else {
                                                if (bfzVar == 0) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bxwVarF != 0) {
                                                    bfzVar.o(bxwVarF);
                                                }
                                                bfzVar.o(bkoVar2);
                                                bxwVarF = 0;
                                            }
                                        }
                                        bkoVar2 = bkoVar2.u;
                                        bxwVarF = bxwVarF;
                                        bfzVar = bfzVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bxwVarF = fh.F(bfzVar);
                            }
                        }
                        bkoVar = bkoVar.t;
                    }
                }
                bysVarI = bysVarI.j();
                bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
            }
            if (cakVar instanceof rg) {
                return (rg) cakVar;
            }
        }
        return null;
    }

    public final void b() {
        rg rgVarA;
        bvc bvcVar = this.f;
        if (bvcVar == null || !bvcVar.s() || (rgVarA = a()) == null) {
            return;
        }
        rgVarA.a(this.f);
    }

    @Override // defpackage.bko
    public final void bS() {
        adi adiVar = this.c;
        if (adiVar != null) {
            adiVar.a();
        }
        this.c = null;
    }

    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        this.f = bvcVar;
        if (this.d.e().b()) {
            if (bvcVar.s()) {
                b();
                return;
            }
            rg rgVarA = a();
            if (rgVarA != null) {
                rgVarA.a(null);
            }
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.cak
    public final Object ci() {
        return g;
    }

    public final boolean g() {
        return this.d.g(7);
    }

    public final adi h() {
        ylf ylfVar = new ylf();
        cbp.Q(this, new qm(ylfVar, this, 2, null));
        return (adi) ylfVar.a;
    }

    public final void i(kw kwVar, wq wqVar) {
        if (!this.A) {
            kwVar.i(wqVar);
        } else {
            yqe yqeVar = (yqe) ((ywq) F()).a.get(yqe.c);
            ykr.q(F(), null, 0, new th(kwVar, wqVar, yqeVar != null ? yqeVar.r(new ox(kwVar, wqVar, 8)) : null, (yih) null, 1), 3);
        }
    }

    @Override // defpackage.bzt
    public final void l() {
        adi adiVarH = h();
        if (this.d.e().b()) {
            adi adiVar = this.c;
            if (adiVar != null) {
                adiVar.a();
            }
            if (adiVarH != null) {
                adiVarH.c();
            } else {
                adiVarH = null;
            }
            this.c = adiVarH;
        }
    }

    public final void m(kw kwVar) {
        wl wlVar;
        if (yks.e(this.e, kwVar)) {
            return;
        }
        kw kwVar2 = this.e;
        if (kwVar2 != null && (wlVar = this.b) != null) {
            kwVar2.i(new wm(wlVar));
        }
        this.b = null;
        this.e = kwVar;
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        boolean zB = this.d.e().b();
        ymp[] ympVarArr = cfk.a;
        cfm cfmVar = cfi.k;
        ymp ympVar = cfk.a[4];
        cfcVar.e(cfmVar, Boolean.valueOf(zB));
        cfcVar.e(cfb.v, new ces(null, new agx((Object) this, 1, (byte[]) null)));
    }

    public /* synthetic */ rf(kw kwVar, yjv yjvVar, int i) {
        this(kwVar, (i & 2) != 0 ? 1 : 0, (i & 4) != 0 ? null : yjvVar);
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }
}
