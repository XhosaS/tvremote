package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class am {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    am ab;
    am ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final al i;
    final al j;
    final al k;
    final al l;
    final al m;
    final al n;
    final al o;
    final al p;
    public final ArrayList q;
    public am r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public am() {
        al alVar = new al(this, 2);
        this.i = alVar;
        al alVar2 = new al(this, 3);
        this.j = alVar2;
        al alVar3 = new al(this, 4);
        this.k = alVar3;
        al alVar4 = new al(this, 5);
        this.l = alVar4;
        al alVar5 = new al(this, 6);
        this.m = alVar5;
        al alVar6 = new al(this, 8);
        this.n = alVar6;
        al alVar7 = new al(this, 9);
        this.o = alVar7;
        this.p = new al(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(alVar);
        arrayList.add(alVar2);
        arrayList.add(alVar3);
        arrayList.add(alVar4);
        arrayList.add(alVar6);
        arrayList.add(alVar7);
        arrayList.add(alVar5);
    }

    private final void A(aj ajVar, boolean z, boolean z2, al alVar, al alVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        ak akVarE = ajVar.e(alVar);
        ak akVarE2 = ajVar.e(alVar2);
        ak akVarE3 = ajVar.e(alVar.b);
        ak akVarE4 = ajVar.e(alVar2.b);
        int iA = alVar.a();
        int iA2 = alVar2.a();
        int i8 = this.K;
        boolean z5 = i8 != 8;
        int i9 = i8 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (akVarE3 == null && akVarE4 == null) {
            ah ahVarA = ajVar.a();
            ahVarA.g(akVarE, i);
            ajVar.g(ahVarA);
            if (z3) {
                return;
            }
            if (z) {
                ajVar.g(aj.c(ajVar, akVarE2, akVarE, i4, true));
                return;
            } else {
                if (z6) {
                    ajVar.g(aj.c(ajVar, akVarE2, akVarE, i9, false));
                    return;
                }
                ah ahVarA2 = ajVar.a();
                ahVarA2.g(akVarE2, i2);
                ajVar.g(ahVarA2);
                return;
            }
        }
        if (akVarE3 != null && akVarE4 == null) {
            ah ahVarA3 = ajVar.a();
            ahVarA3.h(akVarE, akVarE3, iA);
            ajVar.g(ahVarA3);
            if (z) {
                ajVar.g(aj.c(ajVar, akVarE2, akVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ah ahVarA4 = ajVar.a();
                ahVarA4.h(akVarE2, akVarE, i9);
                ajVar.g(ahVarA4);
                return;
            } else {
                ah ahVarA5 = ajVar.a();
                ahVarA5.g(akVarE2, i2);
                ajVar.g(ahVarA5);
                return;
            }
        }
        if (akVarE3 == null) {
            ah ahVarA6 = ajVar.a();
            ahVarA6.h(akVarE2, akVarE4, -iA2);
            ajVar.g(ahVarA6);
            if (z) {
                ajVar.g(aj.c(ajVar, akVarE2, akVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ah ahVarA7 = ajVar.a();
                ahVarA7.h(akVarE2, akVarE, i9);
                ajVar.g(ahVarA7);
                return;
            } else {
                ah ahVarA8 = ajVar.a();
                ahVarA8.g(akVarE, i);
                ajVar.g(ahVarA8);
                return;
            }
        }
        if (!z6) {
            int i10 = i6;
            if (z3) {
                ajVar.i(akVarE, akVarE3, iA, 3);
                ajVar.j(akVarE2, akVarE4, -iA2, 3);
                ajVar.g(aj.b(ajVar, akVarE, akVarE3, iA, f, akVarE4, akVarE2, iA2, true));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -iA2;
            if (i5 == 1) {
                if (i10 <= i9) {
                    i10 = i9;
                }
                if (i7 > 0) {
                    if (i7 < i10) {
                        i10 = i7;
                    } else {
                        ajVar.j(akVarE2, akVarE, i7, 3);
                    }
                }
                ajVar.n(akVarE2, akVarE, i10, 3);
                ajVar.i(akVarE, akVarE3, iA, 2);
                ajVar.j(akVarE2, akVarE4, i11, 2);
                ajVar.m(akVarE, akVarE3, iA, f, akVarE4, akVarE2, iA2);
                return;
            }
            if (i10 != 0 || i7 != 0) {
                if (i7 > 0) {
                    ajVar.j(akVarE2, akVarE, i7, 3);
                }
                ajVar.i(akVarE, akVarE3, iA, 2);
                ajVar.j(akVarE2, akVarE4, i11, 2);
                ajVar.m(akVarE, akVarE3, iA, f, akVarE4, akVarE2, iA2);
                return;
            }
            ah ahVarA9 = ajVar.a();
            ahVarA9.h(akVarE, akVarE3, iA);
            ajVar.g(ahVarA9);
            ah ahVarA10 = ajVar.a();
            ahVarA10.h(akVarE2, akVarE4, i11);
            ajVar.g(ahVarA10);
            return;
        }
        if (z) {
            ajVar.g(aj.c(ajVar, akVarE2, akVarE, i4, true));
        } else {
            ah ahVarA11 = ajVar.a();
            ahVarA11.h(akVarE2, akVarE, i9);
            ajVar.g(ahVarA11);
        }
        int i12 = alVar.h;
        if (i12 != alVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                ah ahVarA12 = ajVar.a();
                ahVarA12.h(akVarE, akVarE3, iA);
                ajVar.g(ahVarA12);
                ak akVarF = ajVar.f();
                ah ahVarA13 = ajVar.a();
                ahVarA13.j(akVarE2, akVarE4, akVarF, i13);
                ajVar.g(ahVarA13);
                return;
            }
            ak akVarF2 = ajVar.f();
            ah ahVarA14 = ajVar.a();
            ahVarA14.i(akVarE, akVarE3, akVarF2, iA);
            ajVar.g(ahVarA14);
            ah ahVarA15 = ajVar.a();
            ahVarA15.h(akVarE2, akVarE4, i13);
            ajVar.g(ahVarA15);
            return;
        }
        if (akVarE3 == akVarE4) {
            ajVar.g(aj.b(ajVar, akVarE, akVarE3, 0, 0.5f, akVarE4, akVarE2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = alVar.i;
        ak akVarF3 = ajVar.f();
        ah ahVarA16 = ajVar.a();
        ahVarA16.i(akVarE, akVarE3, akVarF3, iA);
        if (i15 != 2) {
            ajVar.k(ahVarA16, (int) (-ahVarA16.d.a(akVarF3)));
        }
        ajVar.g(ahVarA16);
        int i16 = alVar2.i;
        ak akVarF4 = ajVar.f();
        ah ahVarA17 = ajVar.a();
        ahVarA17.j(akVarE2, akVarE4, akVarF4, i14);
        if (i16 != 2) {
            ajVar.k(ahVarA17, (int) (-ahVarA17.d.a(akVarF4)));
        }
        ajVar.g(ahVarA17);
        ajVar.g(aj.b(ajVar, akVarE, akVarE3, iA, f, akVarE4, akVarE2, iA2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int iMax = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                iMax = Math.max(this.g, iMax);
            } else {
                iMax = this.g;
                if (iMax > 0) {
                    this.t = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.h;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public final int f() {
        int iMax = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                iMax = Math.max(this.e, iMax);
            } else {
                iMax = this.e;
                if (iMax > 0) {
                    this.s = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.f;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public al t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void u(int i, am amVar, int i2, int i3, int i4) {
        t(i).d(amVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(defpackage.aj r45) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am.x(aj):void");
    }

    public void y() {
        int i;
        int i2;
        int iP = aj.p(this.i);
        int iP2 = aj.p(this.j);
        int iP3 = aj.p(this.k) - iP;
        int iP4 = aj.p(this.l) - iP2;
        this.w = iP;
        this.x = iP2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iP3 < (i2 = this.s)) {
            iP3 = i2;
        }
        if (this.ae == 1 && iP4 < (i = this.t)) {
            iP4 = i;
        }
        this.s = iP3;
        this.t = iP4;
        int i3 = this.E;
        if (iP4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iP3 < i4) {
            this.s = i4;
        }
    }

    public void z(ivx ivxVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
