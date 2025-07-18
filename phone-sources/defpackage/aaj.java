package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaj implements add {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final act e;
    public int f;
    public final int g;
    public final int h;
    public final int i;
    public boolean j;
    public int k = Integer.MIN_VALUE;
    public int l;
    public final int[] m;
    private final List n;
    private final bkc o;
    private final cmi p;
    private final int q;
    private final int r;
    private final long s;
    private final long t;
    private int u;
    private final bkh v;

    public aaj(int i, List list, boolean z, bkc bkcVar, bkh bkhVar, cmi cmiVar, int i2, int i3, int i4, long j, Object obj, act actVar, long j2) {
        this.a = i;
        this.n = list;
        this.b = z;
        this.o = bkcVar;
        this.v = bkhVar;
        this.p = cmiVar;
        this.q = i2;
        this.c = i3;
        this.r = i4;
        this.s = j;
        this.d = obj;
        this.e = actVar;
        this.t = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            bwj bwjVar = (bwj) list.get(i6);
            boolean z2 = this.b;
            i5 += z2 ? bwjVar.b : bwjVar.a;
            iMax = Math.max(iMax, !z2 ? bwjVar.b : bwjVar.a);
        }
        this.g = i5;
        this.h = ykn.j(i5 + this.r, 0);
        this.i = iMax;
        int size2 = this.n.size();
        this.m = new int[size2 + size2];
    }

    private final int o(long j) {
        return this.b ? cmf.b(j) : cmf.a(j);
    }

    @Override // defpackage.add
    public final int a() {
        return this.a;
    }

    @Override // defpackage.add
    public final int b() {
        return 0;
    }

    @Override // defpackage.add
    public final int c() {
        return this.h;
    }

    @Override // defpackage.add
    public final int d() {
        return this.n.size();
    }

    @Override // defpackage.add
    public final int e() {
        return 1;
    }

    @Override // defpackage.add
    public final long f() {
        return this.t;
    }

    @Override // defpackage.add
    public final long g(int i) {
        int[] iArr = this.m;
        int i2 = i + i;
        return (iArr[i2] << 32) | (iArr[i2 + 1] & 4294967295L);
    }

    @Override // defpackage.add
    public final Object h() {
        return this.d;
    }

    @Override // defpackage.add
    public final Object i(int i) {
        return ((bwj) this.n.get(i)).g();
    }

    public final void j(bwi bwiVar, boolean z) {
        bpu bpuVar;
        if (this.k == Integer.MIN_VALUE) {
            wv.c("position() should be called first");
        }
        int iD = d();
        for (int i = 0; i < iD; i++) {
            bwj bwjVar = (bwj) this.n.get(i);
            int i2 = this.u;
            boolean z2 = this.b;
            int i3 = i2 - (z2 ? bwjVar.b : bwjVar.a);
            int i4 = this.l;
            long jG = g(i);
            acp acpVarB = this.e.b(this.d, i);
            if (acpVarB != null) {
                if (z) {
                    acpVarB.g = jG;
                } else {
                    long j = acpVarB.g;
                    if (true != a.s(j, 9223372034707292159L)) {
                        jG = j;
                    }
                    long jD = cmf.d(jG, acpVarB.a());
                    if ((o(jG) <= i3 && o(jD) <= i3) || (o(jG) >= i4 && o(jD) >= i4)) {
                        acpVarB.c();
                    }
                    jG = jD;
                }
                bpuVar = acpVarB.d;
            } else {
                bpuVar = null;
            }
            long jD2 = cmf.d(jG, this.s);
            if (!z && acpVarB != null) {
                acpVarB.c = jD2;
            }
            if (z2) {
                if (bpuVar != null) {
                    bwiVar.u(bwjVar, jD2, bpuVar, 0.0f);
                } else {
                    bwiVar.t(bwjVar, jD2, 0.0f, bwk.a);
                }
            } else if (bpuVar == null) {
                yjv yjvVar = bwk.a;
                if (bwiVar.o() == cmi.a || bwiVar.m() == 0) {
                    bwiVar.q(bwjVar);
                    bwjVar.cm(cmf.d(jD2, bwjVar.e), 0.0f, yjvVar);
                } else {
                    int iM = bwiVar.m() - bwjVar.a;
                    int iA = cmf.a(jD2);
                    bwiVar.q(bwjVar);
                    bwjVar.cm(cmf.d((cmf.b(jD2) & 4294967295L) | ((iM - iA) << 32), bwjVar.e), 0.0f, yjvVar);
                }
            } else if (bwiVar.o() == cmi.a || bwiVar.m() == 0) {
                bwiVar.q(bwjVar);
                bwjVar.x(cmf.d(jD2, bwjVar.e), 0.0f, bpuVar);
            } else {
                int iM2 = bwiVar.m() - bwjVar.a;
                int iA2 = cmf.a(jD2);
                bwiVar.q(bwjVar);
                bwjVar.x(cmf.d((cmf.b(jD2) & 4294967295L) | ((iM2 - iA2) << 32), bwjVar.e), 0.0f, bpuVar);
            }
        }
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.f = i;
        boolean z = this.b;
        this.k = true != z ? i2 : i3;
        List list = this.n;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            bwj bwjVar = (bwj) list.get(i5);
            int i6 = i5 + i5;
            if (z) {
                int[] iArr = this.m;
                bkc bkcVar = this.o;
                if (bkcVar == null) {
                    wv.a("null horizontalAlignment when isVertical == true");
                    throw new yfs();
                }
                iArr[i6] = bkcVar.a(bwjVar.a, i2, this.p);
                iArr[i6 + 1] = i;
                i4 = bwjVar.b;
            } else {
                int i7 = i6 + 1;
                int[] iArr2 = this.m;
                iArr2[i6] = i;
                bkh bkhVar = this.v;
                if (bkhVar == null) {
                    wv.a("null verticalAlignment when isVertical == false");
                    throw new yfs();
                }
                iArr2[i7] = bkhVar.a(bwjVar.b, i3);
                i4 = bwjVar.a;
            }
            i += i4;
        }
        this.u = -this.q;
        this.l = this.k + this.c;
    }

    @Override // defpackage.add
    public final void l(int i, int i2, int i3, int i4) {
        k(i, i3, i4);
    }

    @Override // defpackage.add
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.add
    public final void n() {
        this.j = true;
    }
}
