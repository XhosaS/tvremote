package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ys extends yr {
    public int b = 2;
    public boolean a = true;

    @Override // defpackage.yr, defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        return this.b == 1 ? buyVar.f(i) : buyVar.d(i);
    }

    @Override // defpackage.yr, defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        return this.b == 1 ? buyVar.f(i) : buyVar.d(i);
    }

    @Override // defpackage.yr
    public final boolean i() {
        return this.a;
    }

    @Override // defpackage.yr
    public final long l(bvs bvsVar, long j) {
        int iF = this.b == 1 ? bvsVar.f(clv.a(j)) : bvsVar.d(clv.a(j));
        if (iF < 0) {
            iF = 0;
        }
        return clw.p(iF);
    }
}
