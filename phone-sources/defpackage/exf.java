package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exf implements ewx {
    public final ewx a;
    private final long b;

    public exf(ewx ewxVar, long j) {
        this.a = ewxVar;
        this.b = j;
    }

    @Override // defpackage.ewx
    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    @Override // defpackage.ewx
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        return this.a.dv();
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) {
        int iE = this.a.e(higVar, ehkVar, i);
        if (iE != -4) {
            return iE;
        }
        ehkVar.e += this.b;
        return -4;
    }
}
