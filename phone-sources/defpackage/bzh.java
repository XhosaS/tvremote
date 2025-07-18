package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzh extends bwj implements bvs, bxm, bzj {
    public float A;
    public boolean B;
    public yjv C;
    public bpu D;
    public float F;
    private boolean H;
    private boolean M;
    public final byw f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public yjv n;
    public bpu o;
    public float p;
    public Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean y;
    public int h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int G = 3;
    public long m = 0;
    public boolean q = true;
    public final bxl w = new byt(this);
    private final bfz I = new bfz(new bzh[16], 0);
    public boolean x = true;
    public long z = clw.k(0, 0, 15);
    private final yjk J = new bms(this, 13);
    private final yjk K = new bms(this, 12);
    public long E = 0;
    private final yjk L = new bms(this, 14);

    public bzh(byw bywVar) {
        this.f = bywVar;
    }

    private final bzd H() {
        return this.f.p;
    }

    private final void I() {
        boolean z = this.s;
        this.s = true;
        bys bysVarP = p();
        if (!z) {
            bysVarP.n().aj();
            if (bysVarP.ae()) {
                bys.aq(bysVarP, true, 6);
            } else if (bysVarP.ad()) {
                bys.ao(bysVarP, true, 6);
            }
        }
        bzq bzqVar = bysVarP.n().v;
        for (bzq bzqVarO = bysVarP.o(); !yks.e(bzqVarO, bzqVar) && bzqVarO != null; bzqVarO = bzqVarO.v) {
            if (bzqVarO.B) {
                bzqVarO.af();
            }
        }
        bfz bfzVarI = bysVarP.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            if (bysVar.f() != Integer.MAX_VALUE) {
                bysVar.m().I();
                bysVarP.T(bysVar);
            }
        }
    }

    private final void J() {
        int i;
        bys.aq(p(), false, 7);
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

    private final void K(long j, float f, yjv yjvVar, bpu bpuVar) throws Throwable {
        bwi bwfVar;
        bys bysVarP = p();
        try {
            this.t = true;
            if (!a.s(j, this.m) || this.M) {
                byw bywVar = this.f;
                if (bywVar.j || bywVar.i || this.M) {
                    this.v = true;
                    this.M = false;
                }
                B();
            }
            bzd bzdVarH = H();
            if (bzdVarH != null) {
                if (!cbp.V(bzdVarH.p())) {
                    if (bzdVarH.x == 3) {
                        byw bywVar2 = bzdVarH.f;
                        if (!bywVar2.b) {
                            bywVar2.c = true;
                        }
                    }
                    if (bzdVarH.D()) {
                    }
                }
                bzq bzqVar = q().w;
                if (bzqVar == null || (bwfVar = bzqVar.l) == null) {
                    bzz bzzVarA = byv.a(p());
                    yjv yjvVar2 = bwk.a;
                    bwfVar = new bwf(bzzVarA);
                }
                bzd bzdVarH2 = H();
                bzdVarH2.getClass();
                bys bysVarJ = p().j();
                if (bysVarJ != null) {
                    bysVarJ.u.g = 0;
                }
                bzdVarH2.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                bwfVar.r(bzdVarH2, cmf.a(j), cmf.b(j), 0.0f);
            }
            bzd bzdVarH3 = H();
            if (bzdVarH3 != null && !bzdVarH3.k) {
                bty.c("Error: Placement happened before lookahead.");
            }
            D(j, f, yjvVar, bpuVar);
        } catch (Throwable th) {
            bysVarP.ar(th);
            throw new yfs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void A() {
        bko bkoVarA;
        if (this.s) {
            this.s = false;
            bys bysVarP = p();
            bzq bzqVar = bysVarP.n().v;
            for (bzq bzqVarO = bysVarP.o(); !yks.e(bzqVarO, bzqVar) && bzqVarO != null; bzqVarO = bzqVarO.v) {
                if (bzqVarO.ar(1048576)) {
                    boolean zH = bzr.h(1048576);
                    if (zH) {
                        bkoVarA = bzqVarO.A();
                    } else {
                        bkoVarA = bzqVarO.A().t;
                        if (bkoVarA == null) {
                        }
                    }
                    for (bko bkoVarX = bzqVarO.X(zH); bkoVarX != null && (bkoVarX.s & 1048576) != 0; bkoVarX = bkoVarX.u) {
                        if ((bkoVarX.r & 1048576) != 0) {
                            bxw bxwVarF = bkoVarX;
                            ?? bfzVar = 0;
                            while (bxwVarF != 0) {
                                if (bxwVarF instanceof bzv) {
                                    ((bzv) bxwVarF).a();
                                } else if ((bxwVarF.r & 1048576) != 0 && (bxwVarF instanceof bxw)) {
                                    bko bkoVar = bxwVarF.C;
                                    int i = 0;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                    while (bkoVar != null) {
                                        if ((bkoVar.r & 1048576) != 0) {
                                            i++;
                                            bfzVar = bfzVar;
                                            if (i == 1) {
                                                bxwVarF = bkoVar;
                                            } else {
                                                if (bfzVar == 0) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bxwVarF != 0) {
                                                    bfzVar.o(bxwVarF);
                                                }
                                                bfzVar.o(bkoVar);
                                                bxwVarF = 0;
                                            }
                                        }
                                        bkoVar = bkoVar.u;
                                        bxwVarF = bxwVarF;
                                        bfzVar = bfzVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bxwVarF = fh.F(bfzVar);
                            }
                        }
                        if (bkoVarX != bkoVarA) {
                        }
                    }
                }
                bzqVarO.ao();
            }
            bfz bfzVarI = p().i();
            Object[] objArr = bfzVarI.a;
            int i2 = bfzVarI.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ((bys) objArr[i3]).m().A();
            }
        }
    }

    public final void B() {
        if (this.f.k > 0) {
            bfz bfzVarI = p().i();
            Object[] objArr = bfzVarI.a;
            int i = bfzVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bys bysVar = (bys) objArr[i2];
                byw bywVar = bysVar.u;
                if ((bywVar.i || bywVar.j) && !bywVar.n()) {
                    bysVar.S(false);
                }
                bywVar.o.B();
            }
        }
    }

    public final void C() {
        this.B = true;
        bys bysVarJ = p().j();
        float f = j().y;
        bys bysVarP = p();
        bzq bzqVarO = bysVarP.o();
        bzq bzqVarN = bysVarP.n();
        while (bzqVarO != bzqVarN) {
            bzqVarO.getClass();
            byo byoVar = (byo) bzqVarO;
            f += byoVar.y;
            bzqVarO = byoVar.v;
        }
        if (f != this.A) {
            this.A = f;
            if (bysVarJ != null) {
                bysVarJ.N();
            }
            if (bysVarJ != null) {
                bysVarJ.E();
            }
        }
        if (this.s) {
            p().n().aj();
        } else {
            if (bysVarJ != null) {
                bysVarJ.E();
            }
            I();
            if (this.g && bysVarJ != null) {
                bysVarJ.S(false);
            }
        }
        if (bysVarJ == null) {
            this.i = 0;
        } else if (!this.g && bysVarJ.av() == 3) {
            if (this.i != Integer.MAX_VALUE) {
                bty.c("Place was called on a node which was placed already");
            }
            byw bywVar = bysVarJ.u;
            int i = bywVar.h;
            this.i = i;
            bywVar.h = i + 1;
        }
        l();
    }

    public final void D(long j, float f, yjv yjvVar, bpu bpuVar) {
        if (p().z) {
            bty.b("place is called on a deactivated node");
        }
        G(3);
        boolean z = !this.k;
        this.m = j;
        this.p = f;
        this.n = yjvVar;
        this.o = bpuVar;
        this.k = true;
        this.B = false;
        cbc cbcVar = (cbc) byv.a(p());
        cbcVar.m.e(p(), j, z);
        if (this.v || !this.s) {
            this.w.g = false;
            this.f.i(false);
            this.C = yjvVar;
            this.E = j;
            this.F = f;
            this.D = bpuVar;
            cbcVar.w.a(p(), false, this.L);
        } else {
            bzq bzqVarQ = q();
            bzqVarQ.am(cmf.d(j, bzqVarQ.e), f, yjvVar, bpuVar);
            C();
        }
        G(5);
    }

    public final boolean E(long j) throws Throwable {
        bys bysVarP = p();
        try {
            if (p().z) {
                bty.b("measure is called on a deactivated node");
            }
            bzz bzzVarA = byv.a(p());
            bys bysVarJ = p().j();
            p().s = p().s || (bysVarJ != null && bysVarJ.s);
            if (!p().ae() && a.s(this.d, j)) {
                bzzVarA.p(p(), false);
                p().U();
                return false;
            }
            this.w.f = false;
            k(bzg.d);
            this.j = true;
            long j2 = q().c;
            z(j);
            if (F() != 5) {
                bty.c("layout state is not idle before measure starts");
            }
            this.z = j;
            G(1);
            this.u = false;
            ((cbc) byv.a(p())).w.c(p(), false, this.J);
            if (F() == 1) {
                s();
                G(5);
            }
            boolean z = (a.s(q().c, j2) && q().a == this.a && q().b == this.b) ? false : true;
            y((q().b & 4294967295L) | (q().a << 32));
            return z;
        } catch (Throwable th) {
            bysVarP.ar(th);
            throw new yfs();
        }
    }

    public final int F() {
        return this.f.q;
    }

    public final void G(int i) {
        this.f.q = i;
    }

    @Override // defpackage.bzj
    public final void Q(boolean z) {
        if (z != q().i) {
            q().i = z;
            this.M = true;
        }
    }

    @Override // defpackage.buy
    public final int c(int i) {
        if (!cbp.V(p())) {
            J();
            return q().c(i);
        }
        bzd bzdVarH = H();
        bzdVarH.getClass();
        return bzdVarH.c(i);
    }

    @Override // defpackage.bwj
    public final int cC() {
        return q().cC();
    }

    @Override // defpackage.bwj
    public final void cm(long j, float f, yjv yjvVar) throws Throwable {
        K(j, f, yjvVar, null);
    }

    @Override // defpackage.bvw
    public final int cs(bub bubVar) {
        bys bysVarJ = p().j();
        if (bysVarJ == null || bysVarJ.av() != 1) {
            bys bysVarJ2 = p().j();
            if (bysVarJ2 != null && bysVarJ2.av() == 3) {
                this.w.d = true;
            }
        } else {
            this.w.c = true;
        }
        this.l = true;
        int iCs = q().cs(bubVar);
        this.l = false;
        return iCs;
    }

    @Override // defpackage.buy
    public final int d(int i) {
        if (!cbp.V(p())) {
            J();
            return q().d(i);
        }
        bzd bzdVarH = H();
        bzdVarH.getClass();
        return bzdVarH.d(i);
    }

    @Override // defpackage.buy
    public final int e(int i) {
        if (!cbp.V(p())) {
            J();
            return q().e(i);
        }
        bzd bzdVarH = H();
        bzdVarH.getClass();
        return bzdVarH.e(i);
    }

    @Override // defpackage.buy
    public final int f(int i) {
        if (!cbp.V(p())) {
            J();
            return q().f(i);
        }
        bzd bzdVarH = H();
        bzdVarH.getClass();
        return bzdVarH.f(i);
    }

    @Override // defpackage.bwj, defpackage.buy
    public final Object g() {
        return this.r;
    }

    @Override // defpackage.bxm
    public final bxl h() {
        return this.w;
    }

    @Override // defpackage.bxm
    public final bxm i() {
        byw bywVar;
        bys bysVarJ = p().j();
        if (bysVarJ == null || (bywVar = bysVarJ.u) == null) {
            return null;
        }
        return bywVar.o;
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
            yjvVar.a(((bys) objArr[i2]).u.o);
        }
    }

    @Override // defpackage.bxm
    public final void l() {
        this.y = true;
        bxl bxlVar = this.w;
        bxlVar.g();
        if (this.v) {
            bfz bfzVarI = p().i();
            Object[] objArr = bfzVarI.a;
            int i = bfzVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bys bysVar = (bys) objArr[i2];
                if (bysVar.ae() && bysVar.aw() == 1 && bysVar.aj(bysVar.u.b())) {
                    bys.aq(p(), false, 7);
                }
            }
        }
        if (this.H || (!this.l && !j().k && this.v)) {
            this.v = false;
            int iF = F();
            G(3);
            byw bywVar = this.f;
            bywVar.j(false);
            bys bysVarP = p();
            ((cbc) byv.a(bysVarP)).w.b(bysVarP, false, this.K);
            G(iF);
            if (j().k && bywVar.i) {
                m();
            }
            this.H = false;
        }
        if (bxlVar.d) {
            bxlVar.e = true;
        }
        if (bxlVar.b && bxlVar.j()) {
            bxlVar.f();
        }
        this.y = false;
    }

    @Override // defpackage.bxm
    public final void m() {
        p().S(false);
    }

    @Override // defpackage.bxm
    public final void n() {
        bys.aq(p(), false, 7);
    }

    @Override // defpackage.bxm
    public final boolean o() {
        return this.s;
    }

    public final bys p() {
        return this.f.a;
    }

    public final bzq q() {
        return this.f.a();
    }

    public final List r() {
        p().Z();
        if (!this.x) {
            return this.I.f();
        }
        bys bysVarP = p();
        bfz bfzVar = this.I;
        bfz bfzVarI = bysVarP.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            if (bfzVar.b <= i2) {
                bfzVar.o(bysVar.u.o);
            } else {
                bfzVar.e(i2, bysVar.u.o);
            }
        }
        bfzVar.i(bysVarP.t().size(), bfzVar.b);
        this.x = false;
        return bfzVar.f();
    }

    public final void s() {
        this.v = true;
        this.H = true;
    }

    public final void t() {
        this.u = true;
    }

    @Override // defpackage.bvs
    public final bwj u(long j) throws Throwable {
        int i = 3;
        if (p().A == 3) {
            p().x();
        }
        if (cbp.V(p())) {
            bzd bzdVarH = H();
            bzdVarH.getClass();
            bzdVarH.w = 3;
            bzdVarH.u(j);
        }
        bys bysVarP = p();
        bys bysVarJ = bysVarP.j();
        if (bysVarJ != null) {
            if (this.G != 3 && !bysVarP.s) {
                bty.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = bysVarJ.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int iAv2 = bysVarJ.av();
                    Objects.toString(cbp.W(iAv2));
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(cbp.W(iAv2)));
                }
                i = 2;
            }
        }
        this.G = i;
        E(j);
        return this;
    }

    @Override // defpackage.bwj
    public final int w() {
        return q().w();
    }

    @Override // defpackage.bwj
    public final void x(long j, float f, bpu bpuVar) throws Throwable {
        K(j, f, null, bpuVar);
    }
}
