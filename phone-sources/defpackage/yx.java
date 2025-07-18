package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yx extends bko implements byl {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public yx(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        int iCu = bvvVar.cu(this.a) + bvvVar.cu(this.c);
        int iCu2 = bvvVar.cu(this.b) + bvvVar.cu(this.d);
        bwj bwjVarU = bvsVar.u(clw.h(j, -iCu, -iCu2));
        int i = bwjVarU.a + iCu;
        int i2 = bwjVarU.b + iCu2;
        return bvvVar.cz(clw.c(j, i), clw.b(j, i2), yhc.a, new ox(this, bwjVarU, 15, null));
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
