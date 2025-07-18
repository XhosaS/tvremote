package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zx extends bko implements byl {
    public yjz a;
    public int b;

    public zx(int i, yjz yjzVar) {
        this.b = i;
        this.a = yjzVar;
    }

    @Override // defpackage.byl
    public final bvu b(final bvv bvvVar, bvs bvsVar, long j) {
        int i = this.b;
        final bwj bwjVarU = bvsVar.u(clw.d(i != 1 ? 0 : clv.d(j), clv.b(j), i == 2 ? clv.c(j) : 0, clv.a(j)));
        final int iL = ykn.l(bwjVarU.a, clv.d(j), clv.b(j));
        final int iL2 = ykn.l(bwjVarU.b, clv.c(j), clv.a(j));
        return bvvVar.cz(iL, iL2, yhc.a, new yjv() { // from class: zw
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                int i2 = iL;
                ((bwi) obj).s(bwjVarU, ((cmf) this.a.a.a(new cmh(((i2 - r1.a) << 32) | ((iL2 - r1.b) & 4294967295L)), bvvVar.n())).a, 0.0f);
                return ygi.a;
            }
        });
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
