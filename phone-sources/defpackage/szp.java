package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szp {
    public sze a;
    public sze b;
    public sze c;
    public sze d;
    public szg e;
    public szg f;
    public szg g;
    public szg h;
    public sin i;
    public sin j;
    public sin k;
    public sin l;

    public szp() {
        this.i = new szo();
        this.j = new szo();
        this.k = new szo();
        this.l = new szo();
        this.a = new szb(0.0f);
        this.b = new szb(0.0f);
        this.c = new szb(0.0f);
        this.d = new szb(0.0f);
        this.e = new szg();
        this.f = new szg();
        this.g = new szg();
        this.h = new szg();
    }

    private static void m(sin sinVar) {
        if (sinVar instanceof szo) {
            float f = ((szo) sinVar).a;
        } else if (sinVar instanceof szf) {
            float f2 = ((szf) sinVar).a;
        }
    }

    public final void a(float f) {
        this.d = new szb(f);
    }

    public final void b(float f) {
        this.c = new szb(f);
    }

    public final void c(float f) {
        this.a = new szb(f);
    }

    public final void d(float f) {
        this.b = new szb(f);
    }

    public final void e(float f) {
        c(f);
        d(f);
        b(f);
        a(f);
    }

    public final void f(float f) {
        k(szg.s(0));
        c(f);
    }

    public final void g(float f) {
        l(szg.s(0));
        d(f);
    }

    public final void h(float f) {
        sin sinVarS = szg.s(0);
        k(sinVarS);
        l(sinVarS);
        j(sinVarS);
        i(sinVarS);
        e(f);
    }

    public final void i(sin sinVar) {
        this.l = sinVar;
        m(sinVar);
    }

    public final void j(sin sinVar) {
        this.k = sinVar;
        m(sinVar);
    }

    public final void k(sin sinVar) {
        this.i = sinVar;
        m(sinVar);
    }

    public final void l(sin sinVar) {
        this.j = sinVar;
        m(sinVar);
    }

    public szp(szq szqVar) {
        this.i = new szo();
        this.j = new szo();
        this.k = new szo();
        this.l = new szo();
        this.a = new szb(0.0f);
        this.b = new szb(0.0f);
        this.c = new szb(0.0f);
        this.d = new szb(0.0f);
        this.e = new szg();
        this.f = new szg();
        this.g = new szg();
        this.h = new szg();
        this.i = szqVar.j;
        this.j = szqVar.k;
        this.k = szqVar.l;
        this.l = szqVar.m;
        this.a = szqVar.b;
        this.b = szqVar.c;
        this.c = szqVar.d;
        this.d = szqVar.e;
        this.e = szqVar.f;
        this.f = szqVar.g;
        this.g = szqVar.h;
        this.h = szqVar.i;
    }
}
