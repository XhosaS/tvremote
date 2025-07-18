package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abk implements add {
    public final int a;
    public final Object b;
    public final int d;
    public final act e;
    public final int f;
    public final int g;
    public int i;
    public final long j;
    public long k;
    public int l;
    public int m;
    public boolean n;
    private final int o;
    private final cmi p;
    private final int q;
    private final List r;
    private final long s;
    private final long t;
    private final int u;
    private final int v;
    private int w;
    public final boolean c = true;
    public int h = Integer.MIN_VALUE;

    public abk(int i, Object obj, int i2, int i3, cmi cmiVar, int i4, int i5, List list, long j, act actVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.o = i2;
        this.p = cmiVar;
        this.q = i4;
        this.d = i5;
        this.r = list;
        this.s = j;
        this.e = actVar;
        this.t = j2;
        this.u = i6;
        this.v = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((bwj) list.get(i8)).b);
        }
        this.f = iMax;
        this.g = ykn.j(iMax + i3, 0);
        this.j = (this.o << 32) | (4294967295L & iMax);
        this.k = 0L;
        this.l = -1;
        this.m = -1;
    }

    @Override // defpackage.add
    public final int a() {
        return this.a;
    }

    @Override // defpackage.add
    public final int b() {
        return this.u;
    }

    @Override // defpackage.add
    public final int c() {
        return this.g;
    }

    @Override // defpackage.add
    public final int d() {
        return this.r.size();
    }

    @Override // defpackage.add
    public final int e() {
        return this.v;
    }

    @Override // defpackage.add
    public final long f() {
        return this.t;
    }

    @Override // defpackage.add
    public final long g(int i) {
        return this.k;
    }

    @Override // defpackage.add
    public final Object h() {
        return this.b;
    }

    @Override // defpackage.add
    public final Object i(int i) {
        return ((bwj) this.r.get(i)).g();
    }

    public final void j(bwi bwiVar, boolean z) {
        bpu bpuVar;
        if (this.h == Integer.MIN_VALUE) {
            wv.c("position() should be called first");
        }
        int iD = d();
        for (int i = 0; i < iD; i++) {
            bwj bwjVar = (bwj) this.r.get(i);
            int i2 = this.w - bwjVar.b;
            int i3 = this.i;
            long j = this.k;
            acp acpVarB = this.e.b(this.b, i);
            if (acpVarB != null) {
                if (z) {
                    acpVarB.g = j;
                } else {
                    long j2 = acpVarB.g;
                    if (true == a.s(j2, 9223372034707292159L)) {
                        j2 = j;
                    }
                    long jD = cmf.d(j2, acpVarB.a());
                    if ((cmf.b(j) <= i2 && cmf.b(jD) <= i2) || (cmf.b(j) >= i3 && cmf.b(jD) >= i3)) {
                        acpVarB.c();
                    }
                    j = jD;
                }
                bpuVar = acpVarB.d;
            } else {
                bpuVar = null;
            }
            long jD2 = cmf.d(j, this.s);
            if (!z && acpVarB != null) {
                acpVarB.c = jD2;
            }
            if (bpuVar != null) {
                bwiVar.u(bwjVar, jD2, bpuVar, 0.0f);
            } else {
                bwiVar.t(bwjVar, jD2, 0.0f, bwk.a);
            }
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.h = i4;
        if (this.p == cmi.b) {
            i2 = (i3 - i2) - this.o;
        }
        this.k = (i2 << 32) | (i & 4294967295L);
        this.l = i5;
        this.m = i6;
        this.w = -this.q;
        this.i = i4 + this.d;
    }

    @Override // defpackage.add
    public final void l(int i, int i2, int i3, int i4) {
        k(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.add
    public final boolean m() {
        return true;
    }

    @Override // defpackage.add
    public final void n() {
        this.n = true;
    }
}
