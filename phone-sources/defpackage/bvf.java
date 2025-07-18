package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvf extends bko implements byl {
    public yka a;

    public bvf(yka ykaVar) {
        this.a = ykaVar;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        return (bvu) this.a.a(bvvVar, bvsVar, new clv(j));
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

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.a + ')';
    }
}
