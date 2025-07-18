package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class p {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    protected int F;
    protected int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public Object L;
    public int M;
    int N;
    int O;
    int P;
    int Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    boolean V;
    boolean W;
    public int X;
    public int Y;
    boolean Z;
    boolean aa;
    public float ab;
    public float ac;
    p ad;
    p ae;
    public int af;
    public int ag;
    final o i;
    final o j;
    final o k;
    final o l;
    final o m;
    final o n;
    final o o;
    final o p;
    protected final ArrayList q;
    public p r;
    public int s;
    public int t;
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

    public p() {
        o oVar = new o(this, 2);
        this.i = oVar;
        o oVar2 = new o(this, 3);
        this.j = oVar2;
        o oVar3 = new o(this, 4);
        this.k = oVar3;
        o oVar4 = new o(this, 5);
        this.l = oVar4;
        o oVar5 = new o(this, 6);
        this.m = oVar5;
        o oVar6 = new o(this, 8);
        this.n = oVar6;
        o oVar7 = new o(this, 9);
        this.o = oVar7;
        this.p = new o(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.J = 0.5f;
        this.K = 0.5f;
        this.af = 1;
        this.ag = 1;
        this.M = 0;
        this.X = 0;
        this.Y = 0;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.ad = null;
        this.ae = null;
        arrayList.add(oVar);
        arrayList.add(oVar2);
        arrayList.add(oVar3);
        arrayList.add(oVar4);
        arrayList.add(oVar6);
        arrayList.add(oVar7);
        arrayList.add(oVar5);
    }

    private final void w(k kVar, boolean z, boolean z2, o oVar, o oVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        m mVarF = kVar.f(oVar);
        m mVarF2 = kVar.f(oVar2);
        m mVarF3 = kVar.f(oVar.b);
        m mVarF4 = kVar.f(oVar2.b);
        int iA = oVar.a();
        int iA2 = oVar2.a();
        int i8 = this.M;
        boolean z5 = i8 != 8;
        int i9 = i8 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (mVarF3 == null && mVarF4 == null) {
            h hVarB = kVar.b();
            hVarB.f(mVarF, i);
            kVar.h(hVarB);
            if (z3) {
                return;
            }
            if (z) {
                kVar.h(k.d(kVar, mVarF2, mVarF, i4, true));
                return;
            } else {
                if (z6) {
                    kVar.h(k.d(kVar, mVarF2, mVarF, i9, false));
                    return;
                }
                h hVarB2 = kVar.b();
                hVarB2.f(mVarF2, i2);
                kVar.h(hVarB2);
                return;
            }
        }
        if (mVarF3 != null && mVarF4 == null) {
            h hVarB3 = kVar.b();
            hVarB3.g(mVarF, mVarF3, iA);
            kVar.h(hVarB3);
            if (z) {
                kVar.h(k.d(kVar, mVarF2, mVarF, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                h hVarB4 = kVar.b();
                hVarB4.g(mVarF2, mVarF, i9);
                kVar.h(hVarB4);
                return;
            } else {
                h hVarB5 = kVar.b();
                hVarB5.f(mVarF2, i2);
                kVar.h(hVarB5);
                return;
            }
        }
        if (mVarF3 == null) {
            h hVarB6 = kVar.b();
            hVarB6.g(mVarF2, mVarF4, -iA2);
            kVar.h(hVarB6);
            if (z) {
                kVar.h(k.d(kVar, mVarF2, mVarF, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                h hVarB7 = kVar.b();
                hVarB7.g(mVarF2, mVarF, i9);
                kVar.h(hVarB7);
                return;
            } else {
                h hVarB8 = kVar.b();
                hVarB8.f(mVarF, i);
                kVar.h(hVarB8);
                return;
            }
        }
        if (!z6) {
            int i10 = i6;
            if (z3) {
                kVar.j(mVarF, mVarF3, iA, 3);
                kVar.k(mVarF2, mVarF4, -iA2, 3);
                kVar.h(k.c(kVar, mVarF, mVarF3, iA, f, mVarF4, mVarF2, iA2, true));
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
                        kVar.k(mVarF2, mVarF, i7, 3);
                    }
                }
                kVar.n(mVarF2, mVarF, i10, 3);
                kVar.j(mVarF, mVarF3, iA, 2);
                kVar.k(mVarF2, mVarF4, i11, 2);
                kVar.m(mVarF, mVarF3, iA, f, mVarF4, mVarF2, iA2);
                return;
            }
            if (i10 != 0 || i7 != 0) {
                if (i7 > 0) {
                    kVar.k(mVarF2, mVarF, i7, 3);
                }
                kVar.j(mVarF, mVarF3, iA, 2);
                kVar.k(mVarF2, mVarF4, i11, 2);
                kVar.m(mVarF, mVarF3, iA, f, mVarF4, mVarF2, iA2);
                return;
            }
            h hVarB9 = kVar.b();
            hVarB9.g(mVarF, mVarF3, iA);
            kVar.h(hVarB9);
            h hVarB10 = kVar.b();
            hVarB10.g(mVarF2, mVarF4, i11);
            kVar.h(hVarB10);
            return;
        }
        if (z) {
            kVar.h(k.d(kVar, mVarF2, mVarF, i4, true));
        } else {
            h hVarB11 = kVar.b();
            hVarB11.g(mVarF2, mVarF, i9);
            kVar.h(hVarB11);
        }
        int i12 = oVar.h;
        if (i12 != oVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                h hVarB12 = kVar.b();
                hVarB12.g(mVarF, mVarF3, iA);
                kVar.h(hVarB12);
                m mVarG = kVar.g();
                h hVarB13 = kVar.b();
                hVarB13.i(mVarF2, mVarF4, mVarG, i13);
                kVar.h(hVarB13);
                return;
            }
            m mVarG2 = kVar.g();
            h hVarB14 = kVar.b();
            hVarB14.h(mVarF, mVarF3, mVarG2, iA);
            kVar.h(hVarB14);
            h hVarB15 = kVar.b();
            hVarB15.g(mVarF2, mVarF4, i13);
            kVar.h(hVarB15);
            return;
        }
        if (mVarF3 == mVarF4) {
            kVar.h(k.c(kVar, mVarF, mVarF3, 0, 0.5f, mVarF4, mVarF2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = oVar.i;
        m mVarG3 = kVar.g();
        h hVarB16 = kVar.b();
        hVarB16.h(mVarF, mVarF3, mVarG3, iA);
        if (i15 != 2) {
            hVarB16.d.f(kVar.e(), (int) (-r1.a(mVarG3)));
        }
        kVar.h(hVarB16);
        int i16 = oVar2.i;
        m mVarG4 = kVar.g();
        h hVarB17 = kVar.b();
        hVarB17.i(mVarF2, mVarF4, mVarG4, i14);
        if (i16 != 2) {
            hVarB17.d.f(kVar.e(), (int) (-r1.a(mVarG4)));
        }
        kVar.h(hVarB17);
        kVar.h(k.c(kVar, mVarF, mVarF3, iA, f, mVarF4, mVarF2, iA2, false));
    }

    public final int a() {
        if (this.M == 8) {
            return 0;
        }
        return this.t;
    }

    public final int b() {
        int iMax = this.t;
        if (this.ag == 3) {
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

    public final int c() {
        int iMax = this.s;
        if (this.af == 3) {
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

    public final int d() {
        if (this.M == 8) {
            return 0;
        }
        return this.s;
    }

    public void e() {
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
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0.5f;
        this.K = 0.5f;
        this.af = 1;
        this.ag = 1;
        this.L = null;
        this.M = 0;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.aa = false;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public void f(i iVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }

    public final void g(int i) {
        this.t = i;
        int i2 = this.G;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void h(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.F;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void i(int i) {
        if (i < 0) {
            this.G = 0;
        } else {
            this.G = i;
        }
    }

    public final void j(int i) {
        if (i < 0) {
            this.F = 0;
        } else {
            this.F = i;
        }
    }

    public void k(int i, int i2) {
        this.C = i;
        this.D = i2;
    }

    public final void l(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.G;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void m(int i) {
        this.s = i;
        int i2 = this.F;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void n() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.y = i;
        this.z = i2;
        this.A = i3 - i;
        this.B = i4 - i2;
    }

    public final boolean o() {
        return this.E > 0;
    }

    public final boolean p() {
        return this.r == null;
    }

    public o q(int i) {
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

    public final void r(int i, p pVar, int i2, int i3, int i4) {
        q(i).d(pVar.q(i2), i3, i4, 2, 0, true);
    }

    public final void s(int i) {
        this.af = i;
        if (i == 2) {
            m(this.H);
        }
    }

    public final void t(int i) {
        this.ag = i;
        if (i == 2) {
            g(this.I);
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.H + " x " + this.I + ")";
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
    public void u(defpackage.k r45) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.u(k):void");
    }

    public void v(k kVar) {
        int i;
        int i2;
        int iA = kVar.a(this.i);
        int iA2 = kVar.a(this.j);
        int iA3 = kVar.a(this.k) - iA;
        int iA4 = kVar.a(this.l) - iA2;
        this.w = iA;
        this.x = iA2;
        if (this.M == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.af == 1 && iA3 < (i2 = this.s)) {
            iA3 = i2;
        }
        if (this.ag == 1 && iA4 < (i = this.t)) {
            iA4 = i;
        }
        this.s = iA3;
        this.t = iA4;
        int i3 = this.G;
        if (iA4 < i3) {
            this.t = i3;
        }
        int i4 = this.F;
        if (iA3 < i4) {
            this.s = i4;
        }
    }
}
