package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class yr extends bko implements byl {
    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        long jL = l(bvsVar, j);
        if (i()) {
            jL = clw.f(j, jL);
        }
        bwj bwjVarU = bvsVar.u(jL);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new kb(bwjVarU, 20));
    }

    public int e(buz buzVar, buy buyVar, int i) {
        return buyVar.c(i);
    }

    @Override // defpackage.byl
    public int f(buz buzVar, buy buyVar, int i) {
        return buyVar.d(i);
    }

    public int g(buz buzVar, buy buyVar, int i) {
        return buyVar.e(i);
    }

    @Override // defpackage.byl
    public int h(buz buzVar, buy buyVar, int i) {
        return buyVar.f(i);
    }

    public abstract boolean i();

    public abstract long l(bvs bvsVar, long j);
}
