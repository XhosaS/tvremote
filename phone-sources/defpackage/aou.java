package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aou extends bko implements bxu, byl {
    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        boolean z = false;
        if (this.A && ((Boolean) fh.P(this, aos.a)).booleanValue()) {
            z = true;
        }
        long j2 = aos.b;
        bwj bwjVarU = bvsVar.u(j);
        int iMax = z ? Math.max(bwjVarU.a, bvvVar.cu(cmc.b(j2))) : bwjVarU.a;
        int iMax2 = z ? Math.max(bwjVarU.b, bvvVar.cu(cmc.a(j2))) : bwjVarU.b;
        return bvvVar.cz(iMax, iMax2, yhc.a, new ym(iMax, bwjVarU, iMax2, 4));
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
