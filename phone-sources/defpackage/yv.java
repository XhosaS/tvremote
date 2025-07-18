package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yv extends bko implements byl {
    public float a;
    public float b;
    public boolean c = true;

    public yv(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(j);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new ox(this, bwjVarU, 13, null));
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
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
