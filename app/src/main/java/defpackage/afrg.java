package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afrg extends afiv {
    public final afiv a;

    public afrg(afiv afivVar) {
        this.a = afivVar;
    }

    @Override // defpackage.afiv
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.afiv
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.afiv
    public void c() {
        this.a.c();
    }

    @Override // defpackage.afiv
    public void d(afir afirVar) {
        this.a.d(afirVar);
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", this.a);
        return yqqVarB.toString();
    }
}
