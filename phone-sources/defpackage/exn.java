package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exn implements fel {
    public dze a;
    private final int b;
    private final dze c;
    private final fdm d = new fdm();
    private fel e;
    private long f;

    public exn(int i, dze dzeVar) {
        this.b = i;
        this.c = dzeVar;
    }

    @Override // defpackage.fel
    public final /* synthetic */ int a(dyu dyuVar, int i, boolean z) {
        return fki.L(this, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final void b(dze dzeVar) {
        dze dzeVar2 = this.c;
        if (dzeVar2 != null) {
            dzeVar = dzeVar.c(dzeVar2);
        }
        this.a = dzeVar;
        fel felVar = this.e;
        String str = edt.a;
        felVar.b(this.a);
    }

    @Override // defpackage.fel
    public final /* synthetic */ void c(edi ediVar, int i) {
        fki.M(this, ediVar, i);
    }

    @Override // defpackage.fel
    public final void d(edi ediVar, int i, int i2) {
        fel felVar = this.e;
        String str = edt.a;
        felVar.c(ediVar, i);
    }

    @Override // defpackage.fel
    public final void e(long j, int i, int i2, int i3, fek fekVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.d;
        }
        fel felVar = this.e;
        String str = edt.a;
        felVar.e(j, i, i2, i3, fekVar);
    }

    @Override // defpackage.fel
    public final int g(dyu dyuVar, int i, boolean z) {
        fel felVar = this.e;
        String str = edt.a;
        return felVar.a(dyuVar, i, z);
    }

    public final void h(epm epmVar, long j) {
        if (epmVar == null) {
            this.e = this.d;
            return;
        }
        this.f = j;
        fel felVarK = epmVar.k(this.b);
        this.e = felVarK;
        dze dzeVar = this.a;
        if (dzeVar != null) {
            felVarK.b(dzeVar);
        }
    }

    @Override // defpackage.fel
    public final /* synthetic */ void f() {
    }
}
