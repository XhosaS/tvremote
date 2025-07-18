package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eib implements ejj {
    public final eia b;
    public ekc c;
    public ejj d;
    public boolean f;
    public final ekk a = new ekk();
    public boolean e = true;

    public eib(eia eiaVar) {
        this.b = eiaVar;
    }

    @Override // defpackage.ejj
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        ejj ejjVar = this.d;
        ejjVar.getClass();
        return ejjVar.a();
    }

    @Override // defpackage.ejj
    public final eai b() {
        ejj ejjVar = this.d;
        return ejjVar != null ? ejjVar.b() : this.a.a;
    }

    public final void c(ekc ekcVar) {
        ejj ejjVar;
        ejj ejjVarJ = ekcVar.j();
        if (ejjVarJ == null || ejjVarJ == (ejjVar = this.d)) {
            return;
        }
        if (ejjVar != null) {
            throw new eii(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = ejjVarJ;
        this.c = ekcVar;
        ejjVarJ.d(this.a.a);
    }

    @Override // defpackage.ejj
    public final void d(eai eaiVar) {
        ejj ejjVar = this.d;
        if (ejjVar != null) {
            ejjVar.d(eaiVar);
            eaiVar = this.d.b();
        }
        this.a.d(eaiVar);
    }

    public final void e() {
        this.f = true;
        this.a.e();
    }

    public final void f() {
        this.f = false;
        this.a.f();
    }

    @Override // defpackage.ejj
    public final boolean g() {
        if (this.e) {
            return false;
        }
        ejj ejjVar = this.d;
        ejjVar.getClass();
        return ejjVar.g();
    }
}
