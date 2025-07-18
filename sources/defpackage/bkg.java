package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkg {
    public bjx a;
    public bjx b;
    public bjx c;
    public bjx d;
    public bjz e;
    public bjz f;
    public bjz g;
    public bjz h;
    public xo i;
    public xo j;
    public xo k;
    public xo l;

    public bkg() {
        this.i = new bkf();
        this.j = new bkf();
        this.k = new bkf();
        this.l = new bkf();
        this.a = new bju(0.0f);
        this.b = new bju(0.0f);
        this.c = new bju(0.0f);
        this.d = new bju(0.0f);
        this.e = new bjz();
        this.f = new bjz();
        this.g = new bjz();
        this.h = new bjz();
    }

    private static void f(xo xoVar) {
        if (xoVar instanceof bkf) {
        } else if (xoVar instanceof bjy) {
        }
    }

    public final void a(float f) {
        this.a = new bju(f);
        this.b = new bju(f);
        this.c = new bju(f);
        this.d = new bju(f);
    }

    public final void b(xo xoVar) {
        this.l = xoVar;
        f(xoVar);
    }

    public final void c(xo xoVar) {
        this.k = xoVar;
        f(xoVar);
    }

    public final void d(xo xoVar) {
        this.i = xoVar;
        f(xoVar);
    }

    public final void e(xo xoVar) {
        this.j = xoVar;
        f(xoVar);
    }

    public bkg(bkh bkhVar) {
        this.i = new bkf();
        this.j = new bkf();
        this.k = new bkf();
        this.l = new bkf();
        this.a = new bju(0.0f);
        this.b = new bju(0.0f);
        this.c = new bju(0.0f);
        this.d = new bju(0.0f);
        this.e = new bjz();
        this.f = new bjz();
        this.g = new bjz();
        this.h = new bjz();
        this.i = bkhVar.i;
        this.j = bkhVar.j;
        this.k = bkhVar.k;
        this.l = bkhVar.l;
        this.a = bkhVar.a;
        this.b = bkhVar.b;
        this.c = bkhVar.c;
        this.d = bkhVar.d;
        this.e = bkhVar.e;
        this.f = bkhVar.f;
        this.g = bkhVar.g;
        this.h = bkhVar.h;
    }
}
