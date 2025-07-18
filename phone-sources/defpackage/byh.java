package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byh extends bza {
    public byh(byi byiVar) {
        super(byiVar);
    }

    @Override // defpackage.bza, defpackage.buy
    public final int c(int i) {
        dhk dhkVarAz = K().az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.a(bysVar.o(), bysVar.r(), i);
    }

    @Override // defpackage.bza, defpackage.buy
    public final int d(int i) {
        dhk dhkVarAz = K().az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.b(bysVar.o(), bysVar.r(), i);
    }

    @Override // defpackage.bza, defpackage.buy
    public final int e(int i) {
        dhk dhkVarAz = K().az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.c(bysVar.o(), bysVar.r(), i);
    }

    @Override // defpackage.bza, defpackage.buy
    public final int f(int i) {
        dhk dhkVarAz = K().az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.d(bysVar.o(), bysVar.r(), i);
    }

    @Override // defpackage.byz
    public final int q(bub bubVar) {
        bzd bzdVar = (bzd) t();
        if (!bzdVar.j) {
            if (bzdVar.G() == 2) {
                bxl bxlVar = bzdVar.p;
                bxlVar.f = true;
                if (bxlVar.b) {
                    bzdVar.f.e();
                }
            } else {
                bzdVar.p.g = true;
            }
        }
        bza bzaVar = ((byi) bzdVar.j()).g;
        if (bzaVar != null) {
            bzaVar.k = true;
        }
        bzdVar.l();
        bza bzaVar2 = ((byi) bzdVar.j()).g;
        if (bzaVar2 != null) {
            bzaVar2.k = false;
        }
        Integer num = (Integer) bzdVar.p.h.get(bubVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.p.g(bubVar, iIntValue);
        return iIntValue;
    }

    @Override // defpackage.bza
    protected final void r() {
        bzd bzdVarL = K().l();
        bzdVarL.getClass();
        bzdVarL.A();
    }

    @Override // defpackage.bvs
    public final bwj u(long j) {
        z(j);
        bfz bfzVarI = K().i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bzd bzdVarL = ((bys) objArr[i2]).l();
            bzdVarL.getClass();
            bzdVarL.w = 3;
        }
        super.B(K().o.e(this, K().r(), j));
        return this;
    }
}
