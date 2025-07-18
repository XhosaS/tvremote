package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bys implements bak, caa, bzy {
    public int A;
    public bhu B;
    private final boolean E;
    private int F;
    private bfz G;
    private boolean H;
    private bys I;
    private cfc J;
    private final bfz K;
    private boolean L;
    private bzq M;
    private boolean N;
    private bkp O;
    private bkp P;
    private int Q;
    private final dhk R;
    private dhk S;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public bys h;
    public bzz i;
    public cmv j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public bvt o;
    public clx p;
    public cmi q;
    public cds r;
    public boolean s;
    public final bzm t;
    public final byw u;
    public bvp v;
    public yjv w;
    public yjv x;
    public boolean y;
    public boolean z;
    private static final byr C = new byq();
    public static final yjk a = bmf.g;
    private static final cds D = new byp();
    public static final Comparator b = new ade(3);

    public bys() {
        this(false, 3, null);
    }

    private final String aA(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        bfz bfzVarI = i();
        Object[] objArr = bfzVarI.a;
        int i3 = bfzVarI.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((bys) objArr[i4]).aA(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        strSubstring.getClass();
        return strSubstring;
    }

    private final String aB(bys bysVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(bysVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(ak(this));
        sb.append(" Other tree: ");
        bys bysVar2 = bysVar.I;
        sb.append(bysVar2 != null ? ak(bysVar2) : null);
        return sb.toString();
    }

    private final void aC(bkp bkpVar) {
        int i;
        bzm bzmVar;
        bfz bfzVar;
        bzl bzlVar;
        bzm bzmVar2 = this.t;
        boolean zJ = bzmVar2.j(16);
        boolean zJ2 = bzmVar2.j(1024);
        this.O = bkpVar;
        bko bkoVar = bzmVar2.f;
        bzl bzlVar2 = bzmVar2.b;
        if (bkoVar == bzlVar2) {
            bty.c("padChain called on already padded chain");
        }
        bko bkoVar2 = bzmVar2.f;
        bkoVar2.t = bzlVar2;
        bzlVar2.u = bkoVar2;
        bfz bfzVar2 = bzmVar2.g;
        int i2 = bfzVar2 != null ? bfzVar2.b : 0;
        bfz bfzVar3 = bzmVar2.h;
        if (bfzVar3 == null) {
            bfzVar3 = new bfz(new bkn[16], 0);
        }
        bfz bfzVar4 = bzmVar2.i;
        bfzVar4.o(bkpVar);
        brj brjVar = null;
        while (true) {
            int i3 = bfzVar4.b;
            if (i3 == 0) {
                break;
            }
            bkp bkpVar2 = (bkp) bfzVar4.d(i3 - 1);
            if (bkpVar2 instanceof bkj) {
                bkj bkjVar = (bkj) bkpVar2;
                bfzVar4.o(bkjVar.b);
                bfzVar4.o(bkjVar.a);
            } else if (bkpVar2 instanceof bkn) {
                bfzVar3.o(bkpVar2);
            } else {
                if (brjVar == null) {
                    brjVar = new brj(bfzVar3, 12);
                }
                bkpVar2.c(brjVar);
            }
        }
        int i4 = bfzVar3.b;
        boolean z = true;
        if (i4 == i2) {
            bko bkoVar3 = bzlVar2.u;
            int i5 = 0;
            while (true) {
                if (bkoVar3 == null || i5 >= i2) {
                    break;
                }
                if (bfzVar2 == null) {
                    bty.a("expected prior modifier list to be non-empty");
                    throw new yfs();
                }
                bkn bknVar = (bkn) bfzVar2.a[i5];
                bkn bknVar2 = (bkn) bfzVar3.a[i5];
                int iS = cbp.S(bknVar, bknVar2);
                if (iS == 0) {
                    bkoVar3 = bkoVar3.t;
                    break;
                }
                if (iS == 1) {
                    bzm.m(bknVar, bknVar2, bkoVar3);
                }
                bkoVar3 = bkoVar3.u;
                i5++;
            }
            if (i5 < i2) {
                if (bfzVar2 == null) {
                    bty.a("expected prior modifier list to be non-empty");
                    throw new yfs();
                }
                if (bkoVar3 == null) {
                    bty.a("structuralUpdate requires a non-null tail");
                    throw new yfs();
                }
                bfzVar = bfzVar3;
                bko bkoVar4 = bkoVar3;
                bzmVar = bzmVar2;
                bzmVar.g(i5, bfzVar2, bfzVar, bkoVar4, !bzmVar2.a.aa());
                bzlVar = bzlVar2;
                i = 0;
            }
            bzmVar = bzmVar2;
            bfzVar = bfzVar3;
            bzlVar = bzlVar2;
            i = 0;
            z = false;
        } else {
            bys bysVar = bzmVar2.a;
            if (bysVar.aa() && i2 == 0) {
                bko bkoVarK = bzlVar2;
                for (int i6 = 0; i6 < bfzVar3.b; i6++) {
                    bkoVarK = bzm.k((bkn) bfzVar3.a[i6], bkoVarK);
                }
                bzmVar2.h();
                bzmVar = bzmVar2;
                bfzVar = bfzVar3;
                bzlVar = bzlVar2;
                i = 0;
            } else if (i4 != 0) {
                if (bfzVar2 == null) {
                    i = 0;
                    bfzVar2 = new bfz(new bkn[16], 0);
                } else {
                    i = 0;
                }
                bzmVar = bzmVar2;
                bfzVar = bfzVar3;
                bzlVar = bzlVar2;
                bzmVar.g(0, bfzVar2, bfzVar, bzlVar, !bysVar.aa());
            } else {
                if (bfzVar2 == null) {
                    bty.a("expected prior modifier list to be non-empty");
                    throw new yfs();
                }
                bko bkoVar5 = bzlVar2.u;
                for (int i7 = 0; bkoVar5 != null && i7 < bfzVar2.b; i7++) {
                    bkoVar5 = bzm.l(bkoVar5).u;
                }
                byi byiVar = bzmVar2.c;
                bys bysVarJ = bysVar.j();
                byiVar.w = bysVarJ != null ? bysVarJ.n() : null;
                bzmVar2.d = byiVar;
                bzmVar = bzmVar2;
                bfzVar = bfzVar3;
                bzlVar = bzlVar2;
                i = 0;
                z = false;
            }
        }
        bzmVar.g = bfzVar;
        if (bfzVar2 != null) {
            bfzVar2.h();
        } else {
            bfzVar2 = null;
        }
        bzmVar.h = bfzVar2;
        bko bkoVar6 = bzlVar.u;
        if (bkoVar6 == null) {
            bkoVar6 = bzmVar.e;
        }
        bkoVar6.t = null;
        bzlVar.u = null;
        bzlVar.s = -1;
        bzlVar.w = null;
        if (bkoVar6 == bzlVar) {
            bty.c("trimChain did not update the head");
        }
        bzmVar.f = bkoVar6;
        if (z) {
            bzmVar.i();
        }
        boolean zJ3 = bzmVar.j(16);
        boolean zJ4 = bzmVar.j(1024);
        this.u.m();
        if (this.h == null && bzmVar.j(512)) {
            aH(this);
        }
        if (zJ == zJ3 && zJ2 == zJ4) {
            return;
        }
        cfq cfqVar = ((cbc) byv.a(this)).m;
        if (!af()) {
            return;
        }
        cfp cfpVar = cfqVar.a;
        int i8 = this.c & 67108863;
        Object obj = cfpVar.b;
        int i9 = cfpVar.a;
        while (true) {
            long[] jArr = (long[]) obj;
            if (i >= jArr.length - 2 || i >= i9) {
                return;
            }
            int i10 = i + 2;
            long j = jArr[i10];
            if ((((int) j) & 67108863) == i8) {
                jArr[i10] = ((zJ3 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j) | ((zJ4 ? 1L : 0L) * 4611686018427387904L);
                return;
            }
            i += 3;
        }
    }

    private final void aD() {
        bys bysVar;
        if (this.F > 0) {
            this.H = true;
        }
        if (!this.E || (bysVar = this.I) == null) {
            return;
        }
        bysVar.aD();
    }

    private final void aE(bys bysVar) {
        if (bysVar.u.k > 0) {
            this.u.g(r0.k - 1);
        }
        if (this.i != null) {
            bysVar.z();
        }
        bysVar.I = null;
        bysVar.o().w = null;
        if (bysVar.E) {
            this.F--;
            bfz bfzVar = (bfz) bysVar.R.a;
            Object[] objArr = bfzVar.a;
            int i = bfzVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((bys) objArr[i2]).o().w = null;
            }
        }
        aD();
        N();
    }

    private final void aF() {
        G();
        bys bysVarJ = j();
        if (bysVarJ != null) {
            bysVarJ.E();
        }
        F();
    }

    private final void aG() {
        bzm bzmVar = this.t;
        for (bko bkoVar = bzmVar.e; bkoVar != null; bkoVar = bkoVar.t) {
            if (bkoVar.A) {
                bkoVar.I();
            }
        }
        bzmVar.f();
        bzmVar.c();
    }

    private final void aH(bys bysVar) {
        if (yks.e(bysVar, this.h)) {
            return;
        }
        this.h = bysVar;
        if (bysVar != null) {
            byw bywVar = this.u;
            if (bywVar.p == null) {
                bywVar.p = new bzd(bywVar);
            }
            bzq bzqVar = n().v;
            for (bzq bzqVarO = o(); !yks.e(bzqVarO, bzqVar) && bzqVarO != null; bzqVarO = bzqVarO.v) {
                bzqVarO.C();
            }
        } else {
            byw bywVar2 = this.u;
            bywVar2.p = null;
            bywVar2.e = false;
            bywVar2.d = false;
        }
        G();
    }

    static /* synthetic */ String ak(bys bysVar) {
        return bysVar.aA(0);
    }

    public static /* synthetic */ void ao(bys bysVar, boolean z, int i) {
        bys bysVarJ;
        if (bysVar.h == null) {
            bty.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        bzz bzzVar = bysVar.i;
        if (bzzVar == null || bysVar.l || bysVar.E) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z2 = i2 != 0;
        boolean z3 = 1 == ((z ? 1 : 0) & (i3 ^ 1));
        bzzVar.u(bysVar, true, z3, z2);
        if (i4 != 0) {
            bzd bzdVarL = bysVar.l();
            bzdVarL.getClass();
            bys bysVarJ2 = bzdVarL.p().j();
            int i5 = bzdVarL.p().A;
            if (bysVarJ2 == null || i5 == 3) {
                return;
            }
            while (bysVarJ2.A == i5 && (bysVarJ = bysVarJ2.j()) != null) {
                bysVarJ2 = bysVarJ;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                if (bysVarJ2.h != null) {
                    ao(bysVarJ2, z3, 6);
                    return;
                } else {
                    aq(bysVarJ2, z3, 6);
                    return;
                }
            }
            if (i6 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (bysVarJ2.h != null) {
                bysVarJ2.R(z3);
            } else {
                bysVarJ2.S(z3);
            }
        }
    }

    public static /* synthetic */ void aq(bys bysVar, boolean z, int i) {
        bzz bzzVar;
        bys bysVarJ;
        if (bysVar.l || bysVar.E || (bzzVar = bysVar.i) == null) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z2 = i2 != 0;
        boolean z3 = 1 == ((z ? 1 : 0) & (i3 ^ 1));
        bzzVar.u(bysVar, false, z3, z2);
        if (i4 != 0) {
            bzh bzhVarM = bysVar.m();
            bys bysVarJ2 = bzhVarM.p().j();
            int i5 = bzhVarM.p().A;
            if (bysVarJ2 == null || i5 == 3) {
                return;
            }
            while (bysVarJ2.A == i5 && (bysVarJ = bysVarJ2.j()) != null) {
                bysVarJ2 = bysVarJ;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                aq(bysVarJ2, z3, 6);
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                bysVarJ2.S(z3);
            }
        }
    }

    public final void A(bnp bnpVar, bpu bpuVar) throws Throwable {
        try {
            o().ac(bnpVar, bpuVar);
        } catch (Throwable th) {
            ar(th);
            throw new yfs();
        }
    }

    public final void B() {
        if (this.h != null) {
            ao(this, false, 5);
        } else {
            aq(this, false, 5);
        }
        clv clvVarB = this.u.b();
        if (clvVarB != null) {
            bzz bzzVar = this.i;
            if (bzzVar != null) {
                bzzVar.r(this, clvVarB.a);
                return;
            }
            return;
        }
        bzz bzzVar2 = this.i;
        if (bzzVar2 != null) {
            bzzVar2.q(true);
        }
    }

    public final void C(long j, byg bygVar, int i, boolean z) {
        bzq bzqVarO = o();
        yjv yjvVar = bzq.o;
        o().ae(bzq.q, bzqVarO.au(j), bygVar, i, z);
    }

    public final void D(int i, bys bysVar) {
        if (bysVar.I != null && bysVar.i != null) {
            bty.c(aB(bysVar));
        }
        bysVar.I = this;
        this.R.f(i, bysVar);
        N();
        if (bysVar.E) {
            this.F++;
        }
        aD();
        bzz bzzVar = this.i;
        if (bzzVar != null) {
            bysVar.w(bzzVar);
        }
        if (bysVar.u.k > 0) {
            byw bywVar = this.u;
            bywVar.g(bywVar.k + 1);
        }
    }

    public final void E() {
        if (this.N) {
            bzq bzqVarN = n();
            bzq bzqVar = o().w;
            this.M = null;
            while (true) {
                if (yks.e(bzqVarN, bzqVar)) {
                    break;
                }
                if ((bzqVarN != null ? bzqVarN.C : null) != null) {
                    this.M = bzqVarN;
                    break;
                }
                bzqVarN = bzqVarN != null ? bzqVarN.w : null;
            }
        }
        bzq bzqVar2 = this.M;
        if (bzqVar2 != null && bzqVar2.C == null) {
            bty.a("layer was not set");
            throw new yfs();
        }
        if (bzqVar2 != null) {
            bzqVar2.af();
            return;
        }
        bys bysVarJ = j();
        if (bysVarJ != null) {
            bysVarJ.E();
        }
    }

    public final void F() {
        bzq bzqVarO = o();
        bzq bzqVarN = n();
        while (bzqVarO != bzqVarN) {
            bzqVarO.getClass();
            byo byoVar = (byo) bzqVarO;
            bzx bzxVar = byoVar.C;
            if (bzxVar != null) {
                bzxVar.invalidate();
            }
            bzqVarO = byoVar.v;
        }
        bzx bzxVar2 = n().C;
        if (bzxVar2 != null) {
            bzxVar2.invalidate();
        }
    }

    public final void G() {
        if (this.E) {
            bys bysVarJ = j();
            if (bysVarJ != null) {
                bysVarJ.G();
                return;
            }
            return;
        }
        this.g = true;
        if (this.h != null) {
            ao(this, false, 7);
        } else {
            aq(this, false, 7);
        }
    }

    public final void H() {
        if (this.n) {
            return;
        }
        if (this.t.b.u != null || aa()) {
            this.m = true;
            return;
        }
        cfc cfcVar = this.J;
        this.n = true;
        ylf ylfVar = new ylf();
        ylfVar.a = new cfc();
        cab cabVar = ((cbc) byv.a(this)).w;
        cabVar.d(this, cabVar.b, new bmq(this, ylfVar, 3, null));
        this.n = false;
        this.J = (cfc) ylfVar.a;
        this.m = false;
        bzz bzzVarA = byv.a(this);
        ((cbc) bzzVarA).U.f(this, cfcVar);
        bzzVarA.w();
    }

    public final void I() {
        bys bysVarJ;
        if (this.A == 3) {
            y();
        }
        bzd bzdVarL = l();
        bzdVarL.getClass();
        try {
            bzdVarL.g = true;
            if (!bzdVarL.k) {
                bty.c("replace() called on item that was not placed");
            }
            bzdVarL.v = false;
            boolean zO = bzdVarL.o();
            bzdVarL.F(bzdVarL.m, bzdVarL.n, bzdVarL.o);
            if (zO && !bzdVarL.v && (bysVarJ = bzdVarL.p().j()) != null) {
                bysVarJ.R(false);
            }
        } finally {
            bzdVarL.g = false;
        }
    }

    public final void J() {
        this.u.o.s();
    }

    public final void K() {
        this.u.d = true;
    }

    public final void L() {
        this.u.o.t();
    }

    public final void M(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i > i2 ? i + i4 : i;
                int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
                dhk dhkVar = this.R;
                dhkVar.f(i6, (bys) dhkVar.e(i5));
            }
            N();
            aD();
            G();
        }
    }

    public final void N() {
        if (!this.E) {
            this.L = true;
            return;
        }
        bys bysVarJ = j();
        if (bysVarJ != null) {
            bysVarJ.N();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjk] */
    public final void O() {
        dhk dhkVar = this.R;
        bfz bfzVar = (bfz) dhkVar.a;
        int i = bfzVar.b;
        while (true) {
            i--;
            if (i < 0) {
                bfzVar.h();
                dhkVar.b.a();
                return;
            }
            aE((bys) bfzVar.a[i]);
        }
    }

    public final void P(int i, int i2) {
        if (i2 < 0) {
            bty.b(a.cd(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dhk dhkVar = this.R;
            aE((bys) ((bfz) dhkVar.a).a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void Q() {
        bys bysVarJ;
        if (this.A == 3) {
            y();
        }
        bzh bzhVarM = m();
        try {
            bzhVarM.g = true;
            if (!bzhVarM.k) {
                bty.c("replace called on unplaced item");
            }
            boolean z = bzhVarM.s;
            bzhVarM.D(bzhVarM.m, bzhVarM.p, bzhVarM.n, bzhVarM.o);
            if (z && !bzhVarM.B && (bysVarJ = bzhVarM.p().j()) != null) {
                bysVarJ.S(false);
            }
        } finally {
        }
    }

    public final void R(boolean z) {
        bzz bzzVar;
        if (this.E || (bzzVar = this.i) == null) {
            return;
        }
        bzzVar.v(this, true, z);
    }

    public final void S(boolean z) {
        bzz bzzVar;
        this.g = true;
        if (this.E || (bzzVar = this.i) == null) {
            return;
        }
        bzzVar.v(this, false, z);
    }

    public final void T(bys bysVar) {
        int iAv = bysVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 4) {
            int iAv2 = bysVar.av();
            Objects.toString(cbp.W(iAv2));
            throw new IllegalStateException("Unexpected state ".concat(cbp.W(iAv2)));
        }
        if (bysVar.ad()) {
            ao(bysVar, true, 6);
            return;
        }
        if (bysVar.ac()) {
            bysVar.R(true);
        }
        if (bysVar.ae()) {
            aq(bysVar, true, 6);
        } else if (bysVar.ab()) {
            bysVar.S(true);
        }
    }

    public final void U() {
        bfz bfzVarI = i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            int i3 = bysVar.Q;
            bysVar.A = i3;
            if (i3 != 3) {
                bysVar.U();
            }
        }
    }

    public final void V(clx clxVar) {
        if (yks.e(this.p, clxVar)) {
            return;
        }
        this.p = clxVar;
        aF();
        for (bko bkoVar = this.t.f; bkoVar != null; bkoVar = bkoVar.u) {
            bkoVar.cg();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bcb, java.lang.Object] */
    public final void W(bvt bvtVar) {
        if (yks.e(this.o, bvtVar)) {
            return;
        }
        this.o = bvtVar;
        dhk dhkVar = this.S;
        if (dhkVar != null) {
            dhkVar.b.b(bvtVar);
        }
        G();
    }

    public final void X(bkp bkpVar) {
        if (this.E && this.O != bkp.g) {
            bty.b("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.z) {
            bty.b("modifier is updated when deactivated");
        }
        if (!af()) {
            this.P = bkpVar;
            return;
        }
        aC(bkpVar);
        if (this.m) {
            H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void Y(cds cdsVar) {
        if (yks.e(this.r, cdsVar)) {
            return;
        }
        this.r = cdsVar;
        bzm bzmVar = this.t;
        if ((bzmVar.a() & 16) != 0) {
            for (bko bkoVar = bzmVar.f; bkoVar != null; bkoVar = bkoVar.u) {
                if ((bkoVar.r & 16) != 0) {
                    bxw bxwVarF = bkoVar;
                    ?? bfzVar = 0;
                    while (bxwVarF != 0) {
                        if (bxwVarF instanceof cad) {
                            ((cad) bxwVarF).n();
                        } else if ((bxwVarF.r & 16) != 0 && (bxwVarF instanceof bxw)) {
                            bko bkoVar2 = bxwVarF.C;
                            int i = 0;
                            bxwVarF = bxwVarF;
                            bfzVar = bfzVar;
                            while (bkoVar2 != null) {
                                if ((bkoVar2.r & 16) != 0) {
                                    i++;
                                    bfzVar = bfzVar;
                                    if (i == 1) {
                                        bxwVarF = bkoVar2;
                                    } else {
                                        if (bfzVar == 0) {
                                            bfzVar = new bfz(new bko[16], 0);
                                        }
                                        if (bxwVarF != 0) {
                                            bfzVar.o(bxwVarF);
                                        }
                                        bfzVar.o(bkoVar2);
                                        bxwVarF = 0;
                                    }
                                }
                                bkoVar2 = bkoVar2.u;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bxwVarF = fh.F(bfzVar);
                    }
                }
                if ((bkoVar.s & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void Z() {
        if (this.F <= 0 || !this.H) {
            return;
        }
        this.H = false;
        bfz bfzVar = this.G;
        if (bfzVar == null) {
            bfzVar = new bfz(new bys[16], 0);
            this.G = bfzVar;
        }
        bfzVar.h();
        bfz bfzVar2 = (bfz) this.R.a;
        Object[] objArr = bfzVar2.a;
        int i = bfzVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            if (bysVar.E) {
                bfzVar.p(bfzVar.b, bysVar.i());
            } else {
                bfzVar.o(bysVar);
            }
        }
        this.u.d();
    }

    @Override // defpackage.bak
    public final void a() {
        bla blaVar;
        cmv cmvVar = this.j;
        if (cmvVar != null) {
            cmvVar.removeAllViewsInLayout();
        }
        bvp bvpVar = this.v;
        if (bvpVar != null) {
            bvpVar.a();
        }
        this.z = true;
        aG();
        if (af()) {
            this.J = null;
            this.m = false;
        }
        bzz bzzVar = this.i;
        if (bzzVar != null) {
            cbc cbcVar = (cbc) bzzVar;
            cbcVar.m.f(this);
            if (cbc.M() && (blaVar = cbcVar.P) != null && blaVar.g.e(this.c)) {
                blaVar.i.f(blaVar.a, this.c, false);
            }
        }
    }

    public final boolean aa() {
        return this.P != null;
    }

    public final boolean ab() {
        return this.u.n();
    }

    public final boolean ac() {
        return this.u.e;
    }

    public final boolean ad() {
        return this.u.d;
    }

    public final boolean ae() {
        return this.u.o.u;
    }

    public final boolean af() {
        return this.i != null;
    }

    public final boolean ag() {
        return m().s;
    }

    public final boolean ah() {
        return m().t;
    }

    public final boolean ai(clv clvVar) {
        if (clvVar == null || this.h == null) {
            return false;
        }
        bzd bzdVarL = l();
        bzdVarL.getClass();
        return bzdVarL.E(clvVar.a);
    }

    public final boolean aj(clv clvVar) {
        if (clvVar == null) {
            return false;
        }
        if (this.A == 3) {
            x();
        }
        return m().E(clvVar.a);
    }

    public final void al(long j, byg bygVar, boolean z) {
        bzq bzqVarO = o();
        yjv yjvVar = bzq.o;
        o().ae(bzq.r, bzqVarO.au(j), bygVar, 1, z);
    }

    public final void ar(Throwable th) throws Throwable {
        bju bjuVar = (bju) this.B.f(bjv.a);
        if (bjuVar == null) {
            throw th;
        }
        bjuVar.b(th, this);
        throw th;
    }

    public final void at() {
        this.N = true;
    }

    public final void au() {
        this.g = false;
    }

    public final int av() {
        return this.u.q;
    }

    public final int aw() {
        return m().G;
    }

    public final int ax() {
        int i;
        bzd bzdVarL = l();
        if (bzdVarL == null || (i = bzdVarL.w) == 0) {
            return 3;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void ay(bhu bhuVar) {
        this.B = bhuVar;
        V((clx) bhuVar.f(ccq.d));
        cmi cmiVar = (cmi) bhuVar.f(ccq.i);
        if (this.q != cmiVar) {
            this.q = cmiVar;
            aF();
            for (bko bkoVar = this.t.f; bkoVar != null; bkoVar = bkoVar.u) {
                bkoVar.bP();
            }
        }
        Y((cds) bhuVar.f(ccq.m));
        bzm bzmVar = this.t;
        if ((bzmVar.a() & 32768) != 0) {
            for (bko bkoVar2 = bzmVar.f; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                if ((bkoVar2.r & 32768) != 0) {
                    bxw bxwVarF = bkoVar2;
                    ?? bfzVar = 0;
                    while (bxwVarF != 0) {
                        if (bxwVarF instanceof bxu) {
                            bko bkoVarE = ((bxu) bxwVarF).E();
                            if (bkoVarE.A) {
                                bzr.g(bkoVarE);
                            } else {
                                bkoVarE.y = true;
                            }
                        } else if ((bxwVarF.r & 32768) != 0 && (bxwVarF instanceof bxw)) {
                            bko bkoVar3 = bxwVarF.C;
                            int i = 0;
                            bxwVarF = bxwVarF;
                            bfzVar = bfzVar;
                            while (bkoVar3 != null) {
                                if ((bkoVar3.r & 32768) != 0) {
                                    i++;
                                    bfzVar = bfzVar;
                                    if (i == 1) {
                                        bxwVarF = bkoVar3;
                                    } else {
                                        if (bfzVar == 0) {
                                            bfzVar = new bfz(new bko[16], 0);
                                        }
                                        if (bxwVarF != 0) {
                                            bfzVar.o(bxwVarF);
                                        }
                                        bfzVar.o(bkoVar3);
                                        bxwVarF = 0;
                                    }
                                }
                                bkoVar3 = bkoVar3.u;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bxwVarF = fh.F(bfzVar);
                    }
                }
                if ((bkoVar2.s & 32768) == 0) {
                    return;
                }
            }
        }
    }

    public final dhk az() {
        dhk dhkVar = this.S;
        if (dhkVar != null) {
            return dhkVar;
        }
        dhk dhkVar2 = new dhk(this, this.o);
        this.S = dhkVar2;
        return dhkVar2;
    }

    @Override // defpackage.bak
    public final void b() {
        cmv cmvVar = this.j;
        if (cmvVar != null) {
            cmvVar.b();
        }
        bvp bvpVar = this.v;
        if (bvpVar != null) {
            bvpVar.g();
        }
        bzq bzqVar = n().v;
        for (bzq bzqVarO = o(); !yks.e(bzqVarO, bzqVar) && bzqVarO != null; bzqVarO = bzqVarO.v) {
            bzqVarO.ak();
        }
    }

    @Override // defpackage.bak
    public final void c() {
        bla blaVar;
        if (!af()) {
            bty.b("onReuse is only expected on attached node");
        }
        cmv cmvVar = this.j;
        if (cmvVar != null) {
            cmvVar.c();
        }
        bvp bvpVar = this.v;
        if (bvpVar != null) {
            bvpVar.c();
        }
        this.n = false;
        if (this.z) {
            this.z = false;
        } else {
            aG();
        }
        int i = this.c;
        this.c = cfd.a();
        bzz bzzVar = this.i;
        if (bzzVar != null) {
            jc jcVar = ((cbc) bzzVar).N;
            jcVar.d(i);
            jcVar.f(this.c, this);
        }
        bzm bzmVar = this.t;
        bzmVar.b();
        bzmVar.e();
        if (bzmVar.j(8)) {
            H();
        }
        T(this);
        bzz bzzVar2 = this.i;
        if (bzzVar2 != null) {
            if (cbc.M() && (blaVar = ((cbc) bzzVar2).P) != null) {
                if (blaVar.g.e(i)) {
                    blaVar.i.f(blaVar.a, i, false);
                }
                cfc cfcVarP = p();
                if (cfcVarP != null && bdi.w(cfcVarP)) {
                    blaVar.g.d(this.c);
                    blaVar.i.f(blaVar.a, this.c, true);
                }
            }
            ((cbc) bzzVar2).m.e(this, this.u.o.m, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.bzy
    public final void cD() {
        bko bkoVar;
        bzq bzqVarN = n();
        boolean zH = bzr.h(128);
        if (zH) {
            bkoVar = ((byi) bzqVarN).f;
        } else {
            bkoVar = ((byi) bzqVarN).f.t;
            if (bkoVar == null) {
                return;
            }
        }
        for (bko bkoVarX = bzqVarN.X(zH); bkoVarX != null && (bkoVarX.s & 128) != 0; bkoVarX = bkoVarX.u) {
            if ((bkoVarX.r & 128) != 0) {
                bxw bxwVarF = bkoVarX;
                ?? bfzVar = 0;
                while (bxwVarF != 0) {
                    if (bxwVarF instanceof byk) {
                        ((byk) bxwVarF).cj(n());
                    } else if ((bxwVarF.r & 128) != 0 && (bxwVarF instanceof bxw)) {
                        bko bkoVar2 = bxwVarF.C;
                        int i = 0;
                        bxwVarF = bxwVarF;
                        bfzVar = bfzVar;
                        while (bkoVar2 != null) {
                            if ((bkoVar2.r & 128) != 0) {
                                i++;
                                bfzVar = bfzVar;
                                if (i == 1) {
                                    bxwVarF = bkoVar2;
                                } else {
                                    if (bfzVar == 0) {
                                        bfzVar = new bfz(new bko[16], 0);
                                    }
                                    if (bxwVarF != 0) {
                                        bfzVar.o(bxwVarF);
                                    }
                                    bfzVar.o(bkoVar2);
                                    bxwVarF = 0;
                                }
                            }
                            bkoVar2 = bkoVar2.u;
                            bxwVarF = bxwVarF;
                            bfzVar = bfzVar;
                        }
                        if (i != 1) {
                        }
                    }
                    bxwVarF = fh.F(bfzVar);
                }
            }
            if (bkoVarX == bkoVar) {
                return;
            }
        }
    }

    public final float d() {
        return m().A;
    }

    public final int e() {
        return this.u.o.b;
    }

    public final int f() {
        return m().i;
    }

    public final int g() {
        return this.u.o.a;
    }

    public final bfz h() {
        if (this.L) {
            bfz bfzVar = this.K;
            bfzVar.h();
            bfzVar.p(bfzVar.b, i());
            bfzVar.k(b);
            this.L = false;
        }
        return this.K;
    }

    public final bfz i() {
        Object obj;
        Z();
        if (this.F == 0) {
            obj = this.R.a;
        } else {
            obj = this.G;
            obj.getClass();
        }
        return (bfz) obj;
    }

    public final bys j() {
        bys bysVar = this.I;
        while (bysVar != null && bysVar.E) {
            bysVar = bysVar.I;
        }
        return bysVar;
    }

    public final byu k() {
        return ((cbc) byv.a(this)).f;
    }

    public final bzd l() {
        return this.u.p;
    }

    public final bzh m() {
        return this.u.o;
    }

    public final bzq n() {
        return this.t.c;
    }

    public final bzq o() {
        return this.t.d;
    }

    public final cfc p() {
        if (af() && !this.z && this.t.j(8)) {
            return this.J;
        }
        return null;
    }

    public final Boolean q() {
        bzd bzdVarL = l();
        if (bzdVarL != null) {
            return Boolean.valueOf(bzdVarL.o());
        }
        return null;
    }

    public final List r() {
        bzd bzdVarL = l();
        bzdVarL.getClass();
        bzdVarL.p().t();
        if (!bzdVarL.r) {
            return bzdVarL.q.f();
        }
        bys bysVarP = bzdVarL.p();
        bfz bfzVar = bzdVarL.q;
        bfz bfzVarI = bysVarP.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            if (bfzVar.b <= i2) {
                bzd bzdVar = bysVar.u.p;
                bzdVar.getClass();
                bfzVar.o(bzdVar);
            } else {
                bzd bzdVar2 = bysVar.u.p;
                bzdVar2.getClass();
                bfzVar.e(i2, bzdVar2);
            }
        }
        bfzVar.i(bysVarP.t().size(), bfzVar.b);
        bzdVarL.r = false;
        return bfzVar.f();
    }

    public final List s() {
        return m().r();
    }

    public final List t() {
        return i().f();
    }

    public final String toString() {
        return cbp.v(this) + " children: " + t().size() + " measurePolicy: " + this.o;
    }

    public final List u() {
        return ((bfz) this.R.a).f();
    }

    @Override // defpackage.caa
    public final boolean v() {
        return af();
    }

    public final void w(bzz bzzVar) {
        bys bysVar;
        bla blaVar;
        cfc cfcVarP;
        if (this.i != null) {
            bty.c("Cannot attach " + this + " as it already is attached.  Tree: " + ak(this));
        }
        bys bysVar2 = this.I;
        if (bysVar2 != null && !yks.e(bysVar2.i, bzzVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(bzzVar);
            sb.append(") than the parent's owner(");
            bys bysVarJ = j();
            sb.append(bysVarJ != null ? bysVarJ.i : null);
            sb.append("). This tree: ");
            sb.append(ak(this));
            sb.append(" Parent tree: ");
            bys bysVar3 = this.I;
            sb.append(bysVar3 != null ? ak(bysVar3) : null);
            bty.c(sb.toString());
        }
        bys bysVarJ2 = j();
        if (bysVarJ2 == null) {
            m().s = true;
            bzd bzdVarL = l();
            if (bzdVarL != null) {
                bzdVarL.x = 1;
            }
        }
        o().w = bysVarJ2 != null ? bysVarJ2.n() : null;
        this.i = bzzVar;
        this.k = (bysVarJ2 != null ? bysVarJ2.k : -1) + 1;
        bkp bkpVar = this.P;
        if (bkpVar != null) {
            aC(bkpVar);
        }
        this.P = null;
        cbc cbcVar = (cbc) bzzVar;
        cbcVar.N.f(this.c, this);
        bys bysVar4 = this.I;
        if (bysVar4 == null || (bysVar = bysVar4.h) == null) {
            bysVar = this.h;
        }
        aH(bysVar);
        if (this.h == null && this.t.j(512)) {
            aH(this);
        }
        if (!this.z) {
            this.t.b();
        }
        bfz bfzVar = (bfz) this.R.a;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bys) objArr[i2]).w(bzzVar);
        }
        if (!this.z) {
            this.t.e();
        }
        G();
        if (bysVarJ2 != null) {
            bysVarJ2.G();
        }
        yjv yjvVar = this.w;
        if (yjvVar != null) {
            yjvVar.a(bzzVar);
        }
        this.u.m();
        if (!this.z && this.t.j(8)) {
            H();
        }
        if (!cbc.M() || (blaVar = cbcVar.P) == null || (cfcVarP = p()) == null || !bdi.w(cfcVarP)) {
            return;
        }
        blaVar.g.d(this.c);
        blaVar.i.f(blaVar.a, this.c, true);
    }

    public final void x() {
        this.Q = this.A;
        this.A = 3;
        bfz bfzVarI = i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            if (bysVar.A != 3) {
                bysVar.x();
            }
        }
    }

    public final void y() {
        this.Q = this.A;
        this.A = 3;
        bfz bfzVarI = i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar = (bys) objArr[i2];
            if (bysVar.A == 2) {
                bysVar.y();
            }
        }
    }

    public final void z() {
        bla blaVar;
        bxl bxlVar;
        bzz bzzVar = this.i;
        if (bzzVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            bys bysVarJ = j();
            sb.append(bysVarJ != null ? ak(bysVarJ) : null);
            bty.a(sb.toString());
            throw new yfs();
        }
        bys bysVarJ2 = j();
        if (bysVarJ2 != null) {
            bysVarJ2.E();
            bysVarJ2.G();
            m().G = 3;
            bzd bzdVarL = l();
            if (bzdVarL != null) {
                bzdVarL.w = 3;
            }
        }
        byw bywVar = this.u;
        bywVar.o.w.h();
        bzd bzdVar = bywVar.p;
        if (bzdVar != null && (bxlVar = bzdVar.p) != null) {
            bxlVar.h();
        }
        bzq bzqVar = n().v;
        for (bzq bzqVarO = o(); !yks.e(bzqVarO, bzqVar) && bzqVarO != null; bzqVarO = bzqVarO.v) {
            bzqVarO.ao();
        }
        yjv yjvVar = this.x;
        if (yjvVar != null) {
            yjvVar.a(bzzVar);
        }
        bzm bzmVar = this.t;
        bzmVar.f();
        this.l = true;
        bfz bfzVar = (bfz) this.R.a;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bys) objArr[i2]).z();
        }
        this.l = false;
        bzmVar.c();
        cbc cbcVar = (cbc) bzzVar;
        cbcVar.N.d(this.c);
        bzf bzfVar = cbcVar.y;
        bzfVar.h.c(this);
        ((bfz) bzfVar.g.a).n(this);
        cbcVar.v = true;
        cbcVar.m.f(this);
        if (cbc.M() && (blaVar = cbcVar.P) != null && blaVar.g.e(this.c)) {
            blaVar.i.f(blaVar.a, this.c, false);
        }
        this.i = null;
        aH(null);
        this.k = 0;
        bzh bzhVarM = m();
        bzhVarM.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        bzhVarM.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        bzhVarM.s = false;
        bzd bzdVarL2 = l();
        if (bzdVarL2 != null) {
            bzdVarL2.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            bzdVarL2.h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            bzdVarL2.x = 3;
        }
        if (bzmVar.j(8)) {
            cfc cfcVar = this.J;
            this.J = null;
            this.m = false;
            cbcVar.U.f(this, cfcVar);
            bzzVar.w();
        }
    }

    public bys(boolean z, int i) {
        this.E = z;
        this.c = i;
        this.d = 9223372034707292159L;
        this.e = 0L;
        this.f = 9223372034707292159L;
        this.g = true;
        this.R = new dhk(new bfz(new bys[16], 0), new bms(this, 11), (byte[]) null);
        this.K = new bfz(new bys[16], 0);
        this.L = true;
        this.o = C;
        this.p = byv.a;
        this.q = cmi.a;
        this.r = D;
        this.B = bbc.a;
        this.A = 3;
        this.Q = 3;
        this.t = new bzm(this);
        this.u = new byw(this);
        this.N = true;
        this.O = bkp.g;
    }

    public /* synthetic */ bys(boolean z, int i, byte[] bArr) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), cfd.a());
    }

    public final void as() {
    }
}
