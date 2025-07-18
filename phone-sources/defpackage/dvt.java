package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvt implements dvw {
    final dvs a;
    final dvw b;
    int c = -1;

    public dvt(dvs dvsVar, dvw dvwVar) {
        this.a = dvsVar;
        this.b = dvwVar;
    }

    final void b() {
        this.a.e(this);
    }

    @Override // defpackage.dvw
    public final void dV(Object obj) {
        int i = this.c;
        int i2 = this.a.f;
        if (i != i2) {
            this.c = i2;
            this.b.dV(obj);
        }
    }
}
