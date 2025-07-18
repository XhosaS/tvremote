package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzd extends bwj implements bvs, bxm, bzj {
    public final byw f;
    public boolean g;
    public boolean j;
    public boolean k;
    public clv l;
    public yjv n;
    public bpu o;
    public boolean s;
    public boolean v;
    private boolean y;
    public int h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int w = 3;
    public long m = 0;
    public int x = 3;
    public final bxl p = new byx(this);
    public final bfz q = new bfz(new bzd[16], 0);
    public boolean r = true;
    public boolean t = true;
    public Object u = q().r;

    public bzd(byw bywVar) {
        this.f = bywVar;
    }

    private final void I() {
        int i = this.x;
        if (D()) {
            this.x = 2;
        } else {
            this.x = 1;
        }
        if (i != 1 && this.f.d) {
            bys.ao(p(), true, 6);
        }
        bfz bfzVarI = p().i();
        Object[] objArr = bfzVarI.a;
        int i2 = bfzVarI.b;
        for (int i3 = 0; i3 < i2; i3++) {
            bys bysVar = (bys) objArr[i3];
            bzd bzdVarL = bysVar.l();
            if (bzdVarL == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (bzdVarL.i != Integer.MAX_VALUE) {
                bzdVarL.I();
                bysVar.T(bysVar);
            }
        }
    }

    private final void J() {
        int i;
        bys.ao(p(), false, 7);
        bys bysVarJ = p().j();
        if (bysVarJ == null || p().A != 3) {
            return;
        }
        bys bysVarP = p();
        int iAv = bysVarJ.av();
        int i2 = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = bysVarJ.A;
            }
        } else {
            i = 1;
        }
        bysVarP.A = i;
    }

    private final boolean K() {
        return this.f.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            r4 = this;
            r0 = 1
            r4.v = r0
            bys r1 = r4.p()
            bys r1 = r1.j()
            int r2 = r4.x
            if (r2 == r0) goto L18
            boolean r3 = r4.D()
            if (r3 == 0) goto L1e
            r3 = 2
            if (r2 == r3) goto L2a
        L18:
            boolean r2 = r4.D()
            if (r2 == 0) goto L2a
        L1e:
            r4.I()
            boolean r2 = r4.g
            if (r2 == 0) goto L2a
            if (r1 == 0) goto L2a
            defpackage.bys.an(r1)
        L2a:
            if (r1 == 0) goto L54
            boolean r2 = r4.g
            if (r2 != 0) goto L57
            int r2 = r1.av()
            r3 = 3
            if (r2 == r3) goto L3e
            int r2 = r1.av()
            r3 = 4
            if (r2 != r3) goto L57
        L3e:
            int r2 = r4.i
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L4a
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.bty.c(r2)
        L4a:
            byw r1 = r1.u
            int r2 = r1.g
            r4.i = r2
            int r2 = r2 + r0
            r1.g = r2
            goto L57
        L54:
            r0 = 0
            r4.i = r0
        L57:
            r4.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzd.A():void");
    }

    public final void B(boolean z) {
        this.f.e = z;
    }

    public final void C(boolean z) {
        this.f.f = z;
    }

    public final boolean D() {
        return this.f.c;
    }

    public final boolean E(long j) throws Throwable {
        clv clvVar;
        bys bysVarP = p();
        try {
            if (p().z) {
                bty.b("measure is called on a deactivated node");
            }
            bys bysVarJ = p().j();
            p().s = p().s || (bysVarJ != null && bysVarJ.s);
            if (!p().ad() && (clvVar = this.l) != null && a.s(clvVar.a, j)) {
                bzz bzzVar = p().i;
                if (bzzVar != null) {
                    bzzVar.p(p(), true);
                }
                p().U();
                return false;
            }
            this.l = new clv(j);
            z(j);
            this.p.f = false;
            k(bzg.b);
            long j2 = this.y ? this.c : -9223372034707292160L;
            this.y = true;
            bza bzaVarB = r().B();
            if (bzaVarB == null) {
                bty.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            bzd bzdVar = this.f.p;
            if (bzdVar != null) {
                bzdVar.H(2);
                bzdVar.f.d = false;
                ((cbc) byv.a(bzdVar.p())).w.c(bzdVar.p(), true, new bzb(bzdVar, j));
                bzdVar.B(true);
                bzdVar.C(true);
                if (cbp.V(bzdVar.p())) {
                    bzdVar.q().s();
                } else {
                    bzdVar.q().t();
                }
                bzdVar.H(5);
            }
            y((bzaVarB.b & 4294967295L) | (bzaVarB.a << 32));
            if (((int) (j2 >> 32)) == bzaVarB.a) {
                if (((int) (j2 & 4294967295L)) == bzaVarB.b) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            bysVarP.ar(th);
            throw new yfs();
        }
    }

    public final void F(long j, yjv yjvVar, bpu bpuVar) throws Throwable {
        bys bysVarP = p();
        try {
            bys bysVarJ = p().j();
            if (bysVarJ != null && bysVarJ.av() == 4) {
                this.f.c = false;
            }
            if (p().z) {
                bty.b("place is called on a deactivated node");
            }
            H(4);
            this.k = true;
            this.v = false;
            if (!a.s(j, this.m)) {
                byw bywVar = this.f;
                if (bywVar.m || bywVar.l) {
                    B(true);
                }
                t();
            }
            bzz bzzVarA = byv.a(p());
            if (K() || !o()) {
                this.f.k(false);
                this.p.g = false;
                ((cbc) bzzVarA).w.a(p(), true, new bzc(this, bzzVarA, j));
            } else {
                bza bzaVarB = r().B();
                bzaVarB.getClass();
                bzaVarB.A(cmf.d(j, bzaVarB.e));
                A();
            }
            this.m = j;
            this.n = yjvVar;
            this.o = bpuVar;
            H(5);
        } catch (Throwable th) {
            bysVarP.ar(th);
            throw new yfs();
        }
    }

    public final int G() {
        return this.f.q;
    }

    public final void H(int i) {
        this.f.q = i;
    }

    @Override // defpackage.bzj
    public final void Q(boolean z) {
        bza bzaVarB;
        bza bzaVarB2 = r().B();
        if (yks.e(Boolean.valueOf(z), bzaVarB2 != null ? Boolean.valueOf(bzaVarB2.i) : null) || (bzaVarB = r().B()) == null) {
            return;
        }
        bzaVarB.i = z;
    }

    @Override // defpackage.buy
    public final int c(int i) {
        J();
        bza bzaVarB = r().B();
        bzaVarB.getClass();
        return bzaVarB.c(i);
    }

    @Override // defpackage.bwj
    public final void cm(long j, float f, yjv yjvVar) throws Throwable {
        F(j, yjvVar, null);
    }

    @Override // defpackage.bvw
    public final int cs(bub bubVar) {
        bys bysVarJ = p().j();
        if (bysVarJ == null || bysVarJ.av() != 2) {
            bys bysVarJ2 = p().j();
            if (bysVarJ2 != null && bysVarJ2.av() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        bza bzaVarB = r().B();
        bzaVarB.getClass();
        int iCs = bzaVarB.cs(bubVar);
        this.j = false;
        return iCs;
    }

    @Override // defpackage.buy
    public final int d(int i) {
        J();
        bza bzaVarB = r().B();
        bzaVarB.getClass();
        return bzaVarB.d(i);
    }

    @Override // defpackage.buy
    public final int e(int i) {
        J();
        bza bzaVarB = r().B();
        bzaVarB.getClass();
        return bzaVarB.e(i);
    }

    @Override // defpackage.buy
    public final int f(int i) {
        J();
        bza bzaVarB = r().B();
        bzaVarB.getClass();
        return bzaVarB.f(i);
    }

    @Override // defpackage.bwj, defpackage.buy
    public final Object g() {
        return this.u;
    }

    @Override // defpackage.bxm
    public final bxl h() {
        return this.p;
    }

    @Override // defpackage.bxm
    public final bxm i() {
        byw bywVar;
        bys bysVarJ = p().j();
        if (bysVarJ == null || (bywVar = bysVarJ.u) == null) {
            return null;
        }
        return bywVar.p;
    }

    @Override // defpackage.bxm
    public final bzq j() {
        return p().n();
    }

    @Override // defpackage.bxm
    public final void k(yjv yjvVar) {
        bfz bfzVarI = p().i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bzd bzdVar = ((bys) objArr[i2]).u.p;
            bzdVar.getClass();
            yjvVar.a(bzdVar);
        }
    }

    @Override // defpackage.bxm
    public final void l() {
        this.s = true;
        bxl bxlVar = this.p;
        bxlVar.g();
        if (K()) {
            bfz bfzVarI = p().i();
            Object[] objArr = bfzVarI.a;
            int i = bfzVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bys bysVar = (bys) objArr[i2];
                if (bysVar.ad() && bysVar.ax() == 1) {
                    byw bywVar = bysVar.u;
                    bzd bzdVar = bywVar.p;
                    bzdVar.getClass();
                    clv clvVarC = bywVar.c();
                    clvVarC.getClass();
                    if (bzdVar.E(clvVarC.a)) {
                        bys.ao(p(), false, 7);
                    }
                }
            }
        }
        bza bzaVar = ((byi) j()).g;
        bzaVar.getClass();
        byw bywVar2 = this.f;
        if (bywVar2.f || (!this.j && !bzaVar.k && K())) {
            B(false);
            int iG = G();
            H(4);
            bzz bzzVarA = byv.a(p());
            bywVar2.l(false);
            ((cbc) bzzVarA).w.b(p(), true, new bmq(this, bzaVar, 4));
            H(iG);
            if (bywVar2.l && bzaVar.k) {
                m();
            }
            C(false);
        }
        if (bxlVar.d) {
            bxlVar.e = true;
        }
        if (bxlVar.b && bxlVar.j()) {
            bxlVar.f();
        }
        this.s = false;
    }

    @Override // defpackage.bxm
    public final void m() {
        p().R(false);
    }

    @Override // defpackage.bxm
    public final void n() {
        bys.ao(p(), false, 7);
    }

    @Override // defpackage.bxm
    public final boolean o() {
        return this.x != 3;
    }

    public final bys p() {
        return this.f.a;
    }

    public final bzh q() {
        return this.f.o;
    }

    public final bzq r() {
        return this.f.a();
    }

    public final void s(boolean z) {
        if (z) {
            if (D()) {
                return;
            }
        } else if (!D()) {
            return;
        }
        this.x = 3;
        bfz bfzVarI = p().i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bzd bzdVar = ((bys) objArr[i2]).u.p;
            bzdVar.getClass();
            bzdVar.s(true);
        }
    }

    public final void t() {
        if (this.f.n > 0) {
            bfz bfzVarI = p().i();
            Object[] objArr = bfzVarI.a;
            int i = bfzVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bys bysVar = (bys) objArr[i2];
                byw bywVar = bysVar.u;
                if ((bywVar.l || bywVar.m) && !bywVar.e) {
                    bysVar.R(false);
                }
                bzd bzdVar = bywVar.p;
                if (bzdVar != null) {
                    bzdVar.t();
                }
            }
        }
    }

    @Override // defpackage.bvs
    public final bwj u(long j) {
        bys bysVarJ;
        bys bysVarJ2 = p().j();
        int i = 2;
        if ((bysVarJ2 != null && bysVarJ2.av() == 2) || ((bysVarJ = p().j()) != null && bysVarJ.av() == 4)) {
            this.f.b = false;
        }
        bys bysVarP = p();
        bys bysVarJ3 = bysVarP.j();
        if (bysVarJ3 != null) {
            if (this.w != 3 && !bysVarP.s) {
                bty.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = bysVarJ3.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int iAv2 = bysVarJ3.av();
                Objects.toString(cbp.W(iAv2));
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(cbp.W(iAv2)));
            }
            this.w = i;
        } else {
            this.w = 3;
        }
        if (p().A == 3) {
            p().x();
        }
        E(j);
        return this;
    }

    @Override // defpackage.bwj
    public final void x(long j, float f, bpu bpuVar) throws Throwable {
        F(j, null, bpuVar);
    }
}
