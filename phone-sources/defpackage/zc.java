package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zc extends bko implements byl {
    public yy a;

    public zc(yy yyVar) {
        this.a = yyVar;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        float fB = this.a.b(bvvVar.n());
        float fD = this.a.d();
        float fC = this.a.c(bvvVar.n());
        float fA = this.a.a();
        if (!((Float.compare(fB, 0.0f) >= 0) & (Float.compare(fD, 0.0f) >= 0) & (Float.compare(fC, 0.0f) >= 0) & (Float.compare(fA, 0.0f) >= 0))) {
            zy.a("Padding must be non-negative");
        }
        int iCu = bvvVar.cu(fB);
        int iCu2 = bvvVar.cu(fC) + iCu;
        int iCu3 = bvvVar.cu(fD);
        int iCu4 = bvvVar.cu(fA) + iCu3;
        bwj bwjVarU = bvsVar.u(clw.h(j, -iCu2, -iCu4));
        return bvvVar.cz(clw.c(j, bwjVarU.a + iCu2), clw.b(j, bwjVarU.b + iCu4), yhc.a, new ym(bwjVarU, iCu, iCu3, 2));
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }
}
