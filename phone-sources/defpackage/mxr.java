package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxr {
    public tst a;
    public tst b;
    public tst c;
    public tst d;
    public tst e;
    public tst f;
    public tst g;
    public tst h;
    private boolean i;
    private boolean j;
    private boolean k;
    private kuo l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private lio q;
    private boolean r;
    private boolean s;
    private boolean t;
    private short u;

    public mxr() {
        throw null;
    }

    public final mxs a() {
        kuo kuoVar;
        lio lioVar;
        if (this.u == 1023 && (kuoVar = this.l) != null && (lioVar = this.q) != null) {
            return new mxs(this.a, this.b, this.c, this.i, this.j, this.d, this.k, this.e, this.f, this.g, kuoVar, this.m, this.n, this.o, this.p, lioVar, this.h, this.r, this.s, this.t);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.u & 1) == 0) {
            sb.append(" isExpanded");
        }
        if ((this.u & 2) == 0) {
            sb.append(" isDimmed");
        }
        if ((this.u & 4) == 0) {
            sb.append(" showFamilyLibrary");
        }
        if (this.l == null) {
            sb.append(" episode");
        }
        if ((this.u & 8) == 0) {
            sb.append(" index");
        }
        if ((this.u & 16) == 0) {
            sb.append(" showThumbnail");
        }
        if ((this.u & 32) == 0) {
            sb.append(" isFreeOrEntitled");
        }
        if ((this.u & 64) == 0) {
            sb.append(" isFreeTabEnabled");
        }
        if (this.q == null) {
            sb.append(" elementNode");
        }
        if ((this.u & 128) == 0) {
            sb.append(" showDebugInfo");
        }
        if ((this.u & 256) == 0) {
            sb.append(" synopsisAlwaysExpanded");
        }
        if ((this.u & 512) == 0) {
            sb.append(" isGtvApplication");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(lio lioVar) {
        if (lioVar == null) {
            throw new NullPointerException("Null elementNode");
        }
        this.q = lioVar;
    }

    public final void c(kuo kuoVar) {
        if (kuoVar == null) {
            throw new NullPointerException("Null episode");
        }
        this.l = kuoVar;
    }

    public final void d(int i) {
        this.m = i;
        this.u = (short) (this.u | 8);
    }

    public final void e(boolean z) {
        this.j = z;
        this.u = (short) (this.u | 2);
    }

    public final void f(boolean z) {
        this.i = z;
        this.u = (short) (this.u | 1);
    }

    public final void g(boolean z) {
        this.o = z;
        this.u = (short) (this.u | 32);
    }

    public final void h(boolean z) {
        this.p = z;
        this.u = (short) (this.u | 64);
    }

    public final void i(boolean z) {
        this.t = z;
        this.u = (short) (this.u | 512);
    }

    public final void j(boolean z) {
        this.r = z;
        this.u = (short) (this.u | 128);
    }

    public final void k(boolean z) {
        this.k = z;
        this.u = (short) (this.u | 4);
    }

    public final void l(boolean z) {
        this.n = z;
        this.u = (short) (this.u | 16);
    }

    public final void m(boolean z) {
        this.s = z;
        this.u = (short) (this.u | 256);
    }

    public mxr(byte[] bArr) {
        trk trkVar = trk.a;
        this.a = trkVar;
        this.b = trkVar;
        this.c = trkVar;
        this.d = trkVar;
        this.e = trkVar;
        this.f = trkVar;
        this.g = trkVar;
        this.h = trkVar;
    }
}
