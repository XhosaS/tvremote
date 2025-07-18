package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fw implements AutoCloseable, dvi {
    final /* synthetic */ fx a;
    final /* synthetic */ dve b;
    private final fyw c;

    public fw(fv fvVar, fx fxVar, dve dveVar) {
        this.a = fxVar;
        this.b = dveVar;
        this.c = fvVar.e();
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        if (dvcVar == dvc.ON_START) {
            fx fxVar = this.a;
            fyx.e((fyx) fxVar.b, this.c);
        } else if (dvcVar == dvc.ON_STOP) {
            this.c.e();
        } else if (dvcVar == dvc.ON_DESTROY) {
            this.c.e();
            this.b.d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.d(this);
    }
}
