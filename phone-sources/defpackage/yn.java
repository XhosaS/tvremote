package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yn implements bve, bxf, bxi {
    private final zr a;
    private final bcb b;
    private final bcb c;

    public yn(zr zrVar) {
        this.a = zrVar;
        bcz bczVar = bcz.c;
        this.b = new bci(zrVar, bczVar);
        this.c = new bci(zrVar, bczVar);
    }

    private final zr l() {
        return (zr) this.b.a();
    }

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return bdi.y(this, obj, yjzVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return bdi.z(this, yjvVar);
    }

    @Override // defpackage.bxf
    public final void d(bxj bxjVar) {
        zr zrVar = (zr) bxjVar.bY(zt.a);
        zr zrVar2 = this.a;
        this.b.b(new yf(zrVar2, zrVar));
        this.c.b(new zl(zrVar, zrVar2));
    }

    @Override // defpackage.bve
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return bty.k(this, buzVar, buyVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yn) {
            return yks.e(((yn) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.bxi
    public final /* synthetic */ Object f() {
        return (zr) this.c.a();
    }

    @Override // defpackage.bxi
    public final kw g() {
        return zt.a;
    }

    @Override // defpackage.bve
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return bty.l(this, buzVar, buyVar, i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bve
    public final /* synthetic */ int i(buz buzVar, buy buyVar, int i) {
        return bty.m(this, buzVar, buyVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int j(buz buzVar, buy buyVar, int i) {
        return bty.n(this, buzVar, buyVar, i);
    }

    @Override // defpackage.bve
    public final bvu k(bvv bvvVar, bvs bvsVar, long j) {
        int iB = l().b(bvvVar, bvvVar.n());
        int iD = l().d(bvvVar);
        int iC = l().c(bvvVar, bvvVar.n()) + iB;
        int iA = l().a(bvvVar) + iD;
        bwj bwjVarU = bvsVar.u(clw.h(j, -iC, -iA));
        int i = bwjVarU.a + iC;
        int i2 = bwjVarU.b + iA;
        return bvvVar.cz(clw.c(j, i), clw.b(j, i2), yhc.a, new ym(bwjVarU, iB, iD, 0));
    }
}
