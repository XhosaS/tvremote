package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bzq extends byz implements bvs, bvc, caa {
    public bnp A;
    public boolean B;
    public bzx C;
    private boolean D;
    private boolean E;
    private yjv F;
    private clx G;
    private cmi H;
    private bvu J;
    private bmw K;
    private byj L;
    private yjz M;
    private bpu O;
    private jz P;
    public final bys s;
    public boolean t;
    public boolean u;
    public bzq v;
    public bzq w;
    public float y;
    public bpu z;
    private static final yjv f = bzg.f;
    public static final yjv o = bzg.e;
    public static final boi p = new boi();
    private static final byj g = new byj();
    private static final float[] h = boa.e();
    public static final bzo q = new bzn(1);
    public static final bzo r = new bzn(0);
    private float I = 0.8f;
    public long x = 0;
    private final yjk N = new bms(this, 16);

    public bzq(bys bysVar) {
        this.s = bysVar;
        this.G = bysVar.p;
        this.H = bysVar.q;
    }

    private final yjz F() {
        yjz yjzVar = this.M;
        if (yjzVar != null) {
            return yjzVar;
        }
        bvo bvoVar = new bvo(this, new bms(this, 15), 2);
        this.M = bvoVar;
        return bvoVar;
    }

    private final void G(bzq bzqVar, bmw bmwVar, boolean z) {
        if (bzqVar == this) {
            return;
        }
        bzq bzqVar2 = this.w;
        if (bzqVar2 != null) {
            bzqVar2.G(bzqVar, bmwVar, z);
        }
        long j = this.x;
        float fA = cmf.a(j);
        bmwVar.a -= fA;
        bmwVar.c -= fA;
        float fB = cmf.b(j);
        bmwVar.b -= fB;
        bmwVar.d -= fB;
        bzx bzxVar = this.C;
        if (bzxVar != null) {
            bzxVar.d(bmwVar, true);
            if (this.E && z) {
                long j2 = this.c;
                bmwVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    private final void aA(bko bkoVar, bzo bzoVar, long j, byg bygVar, int i, boolean z, float f2) {
        if (bkoVar == null) {
            D(bzoVar, j, bygVar, i, z);
            return;
        }
        int i2 = bygVar.a;
        bygVar.d(i2 + 1, bygVar.a());
        bygVar.a++;
        bygVar.b.p(bkoVar);
        bygVar.c.b(fh.B(f2, z, false));
        al(cbp.R(bkoVar, bzoVar.a()), bzoVar, j, bygVar, i, z, f2, true);
        bygVar.a = i2;
    }

    private final boolean aB(boolean z) {
        bzz bzzVar;
        boolean z2 = false;
        if (this.O != null) {
            return false;
        }
        bzx bzxVar = this.C;
        if (bzxVar == null) {
            if (this.F != null) {
                bty.c("null layer with a non-null layerBlock");
            }
            return false;
        }
        yjv yjvVar = this.F;
        if (yjvVar == null) {
            bty.a("updateLayerParameters requires a non-null layerBlock");
            throw new yfs();
        }
        boi boiVar = p;
        boiVar.t(1.0f);
        boiVar.u(1.0f);
        boiVar.m(1.0f);
        boiVar.v(0.0f);
        long j = bnw.a;
        boiVar.n(j);
        boiVar.x(j);
        boiVar.s(0.0f);
        boiVar.p(8.0f);
        boiVar.y(bop.a);
        boiVar.w(boh.a);
        boiVar.q(false);
        boiVar.A();
        boiVar.z();
        boiVar.o(3);
        boiVar.r(0);
        boiVar.n = 9205357640488583168L;
        boiVar.r = null;
        boiVar.a = 0;
        bys bysVar = this.s;
        boiVar.o = bysVar.p;
        boiVar.p = bysVar.q;
        boiVar.n = clw.y(this.c);
        ab().d(this, f, new bms(yjvVar, 17));
        byj byjVar = this.L;
        if (byjVar == null) {
            byjVar = new byj();
            this.L = byjVar;
        }
        byj byjVar2 = g;
        byjVar2.a = byjVar.a;
        byjVar2.b = byjVar.b;
        byjVar2.c = byjVar.c;
        byjVar2.d = byjVar.d;
        byjVar2.e = byjVar.e;
        byjVar.a = boiVar.b;
        byjVar.b = boiVar.c;
        byjVar.c = boiVar.h;
        byjVar.d = boiVar.i;
        byjVar.e = boiVar.j;
        bzxVar.j(boiVar);
        boolean z3 = this.E;
        boolean z4 = boiVar.l;
        this.E = z4;
        this.I = boiVar.d;
        if (byjVar2.a == byjVar.a && byjVar2.b == byjVar.b && byjVar2.c == byjVar.c && byjVar2.d == byjVar.d && a.s(byjVar2.e, byjVar.e)) {
            z2 = true;
        }
        boolean z5 = !z2;
        if (z && ((!z2 || z3 != z4) && (bzzVar = bysVar.i) != null)) {
            bzzVar.t(bysVar);
        }
        return z5;
    }

    private final long aC(bzq bzqVar, long j) {
        if (bzqVar == this) {
            return j;
        }
        bzq bzqVar2 = this.w;
        return (bzqVar2 == null || yks.e(bzqVar, bzqVar2)) ? au(j) : au(bzqVar2.aC(bzqVar, j));
    }

    private static final bzq aD(bvc bvcVar) {
        bzq bzqVarA;
        bvr bvrVar = bvcVar instanceof bvr ? (bvr) bvcVar : null;
        if (bvrVar != null && (bzqVarA = bvrVar.a()) != null) {
            return bzqVarA;
        }
        bvcVar.getClass();
        return (bzq) bvcVar;
    }

    static /* synthetic */ boolean ax(bzq bzqVar) {
        return bzqVar.aB(true);
    }

    private final void az(bko bkoVar, bzo bzoVar, long j, byg bygVar, int i, boolean z) {
        if (bkoVar == null) {
            D(bzoVar, j, bygVar, i, z);
            return;
        }
        int i2 = bygVar.a;
        bygVar.d(i2 + 1, bygVar.a());
        bygVar.a++;
        bygVar.b.p(bkoVar);
        bygVar.c.b(fh.B(-1.0f, z, false));
        az(cbp.R(bkoVar, bzoVar.a()), bzoVar, j, bygVar, i, z);
        bygVar.a = i2;
    }

    public abstract bko A();

    public abstract bza B();

    public abstract void C();

    public void D(bzo bzoVar, long j, byg bygVar, int i, boolean z) {
        bzq bzqVar = this.v;
        if (bzqVar != null) {
            bzqVar.ae(bzoVar, bzqVar.au(j), bygVar, i, z);
        }
    }

    public void E(bnp bnpVar, bpu bpuVar) {
        throw null;
    }

    @Override // defpackage.byz
    public final long H() {
        return this.x;
    }

    @Override // defpackage.byz
    public final bvu J() {
        bvu bvuVar = this.J;
        if (bvuVar != null) {
            return bvuVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.byz
    public final bys K() {
        return this.s;
    }

    @Override // defpackage.byz
    public final byz L() {
        return this.v;
    }

    @Override // defpackage.byz
    public final byz M() {
        return this.w;
    }

    @Override // defpackage.byz
    public final void P() {
        bpu bpuVar = this.O;
        if (bpuVar != null) {
            x(this.x, this.y, bpuVar);
        } else {
            cm(this.x, this.y, this.F);
        }
    }

    @Override // defpackage.byz
    public final boolean R() {
        return this.J != null;
    }

    protected final float T(long j, long j2) {
        if (w() >= Float.intBitsToFloat((int) (j2 >> 32)) && cC() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jU = U(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - w());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fMax2 = Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - cC());
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMax) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax2) & 4294967295L;
        if (fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        long j3 = jFloatToRawIntBits2 | jFloatToRawIntBits;
        if (Float.intBitsToFloat((int) (j3 >> 32)) > fIntBitsToFloat || Float.intBitsToFloat((int) (j3 & 4294967295L)) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        return bmx.b(j3);
    }

    public final long U(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - w();
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - cC()) / 2.0f;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final long V() {
        return this.G.cw(this.s.r.h());
    }

    public final bko W(int i) {
        bko bkoVarA;
        boolean zH = bzr.h(i);
        if (zH) {
            bkoVarA = A();
        } else {
            bkoVarA = A().t;
            if (bkoVarA == null) {
                return null;
            }
        }
        for (bko bkoVarX = X(zH); bkoVarX != null && (bkoVarX.s & i) != 0; bkoVarX = bkoVarX.u) {
            if ((bkoVarX.r & i) != 0) {
                return bkoVarX;
            }
            if (bkoVarX == bkoVarA) {
                return null;
            }
        }
        return null;
    }

    public final bko X(boolean z) {
        bko bkoVarA;
        bys bysVar = this.s;
        if (bysVar.o() == this) {
            return bysVar.t.f;
        }
        if (!z) {
            bzq bzqVar = this.w;
            if (bzqVar == null) {
                return null;
            }
            return bzqVar.A();
        }
        bzq bzqVar2 = this.w;
        if (bzqVar2 == null || (bkoVarA = bzqVar2.A()) == null) {
            return null;
        }
        return bkoVarA.u;
    }

    public final bmw Y() {
        bmw bmwVar = this.K;
        if (bmwVar != null) {
            return bmwVar;
        }
        bmw bmwVar2 = new bmw();
        this.K = bmwVar2;
        return bmwVar2;
    }

    public final bxm Z() {
        return this.s.u.o;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.s.p.a();
    }

    public final bzq aa(bzq bzqVar) {
        bys bysVar = bzqVar.s;
        bys bysVar2 = this.s;
        if (bysVar == bysVar2) {
            bko bkoVarA = bzqVar.A();
            bko bkoVarA2 = A();
            if (!bkoVarA2.E().A) {
                bty.c("visitLocalAncestors called on an unattached node");
            }
            bko bkoVarE = bkoVarA2.E();
            while (true) {
                bkoVarE = bkoVarE.t;
                if (bkoVarE == null) {
                    break;
                }
                if ((bkoVarE.r & 2) != 0 && bkoVarE == bkoVarA) {
                    break;
                }
            }
            return bzqVar;
        }
        bys bysVarJ = bysVar;
        while (bysVarJ.k > bysVar2.k) {
            bysVarJ = bysVarJ.j();
            bysVarJ.getClass();
        }
        bys bysVarJ2 = bysVar2;
        while (bysVarJ2.k > bysVarJ.k) {
            bysVarJ2 = bysVarJ2.j();
            bysVarJ2.getClass();
        }
        while (bysVarJ != bysVarJ2) {
            bysVarJ = bysVarJ.j();
            bysVarJ2 = bysVarJ2.j();
            if (bysVarJ == null || bysVarJ2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (bysVarJ2 != bysVar2) {
            if (bysVarJ != bysVar) {
                return bysVarJ.n();
            }
            return bzqVar;
        }
        return this;
    }

    public final cab ab() {
        return ((cbc) byv.a(this.s)).w;
    }

    public final void ac(bnp bnpVar, bpu bpuVar) {
        bzx bzxVar = this.C;
        if (bzxVar != null) {
            bzxVar.c(bnpVar, bpuVar);
            return;
        }
        long j = this.x;
        float fA = cmf.a(j);
        float fB = cmf.b(j);
        bnpVar.i(fA, fB);
        ad(bnpVar, bpuVar);
        bnpVar.i(-fA, -fB);
    }

    public final void ad(bnp bnpVar, bpu bpuVar) {
        bnp bnpVar2;
        bpu bpuVar2;
        bko bkoVarW = W(4);
        if (bkoVarW == null) {
            E(bnpVar, bpuVar);
            return;
        }
        byu byuVarK = this.s.k();
        long jY = clw.y(this.c);
        bfz bfzVar = null;
        while (bkoVarW != null) {
            if (bkoVarW instanceof byc) {
                bnpVar2 = bnpVar;
                bpuVar2 = bpuVar;
                byuVarK.B(bnpVar2, jY, this, (byc) bkoVarW, bpuVar2);
            } else {
                bnpVar2 = bnpVar;
                bpuVar2 = bpuVar;
                if ((bkoVarW.r & 4) != 0 && (bkoVarW instanceof bxw)) {
                    int i = 0;
                    for (bko bkoVar = ((bxw) bkoVarW).C; bkoVar != null; bkoVar = bkoVar.u) {
                        if ((bkoVar.r & 4) != 0) {
                            i++;
                            if (i == 1) {
                                bkoVarW = bkoVar;
                            } else {
                                if (bfzVar == null) {
                                    bfzVar = new bfz(new bko[16], 0);
                                }
                                if (bkoVarW != null) {
                                    bfzVar.o(bkoVarW);
                                }
                                bfzVar.o(bkoVar);
                                bkoVarW = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                bnpVar = bnpVar2;
                bpuVar = bpuVar2;
            }
            bkoVarW = fh.F(bfzVar);
            bnpVar = bnpVar2;
            bpuVar = bpuVar2;
        }
    }

    public final void ae(bzo bzoVar, long j, byg bygVar, int i, boolean z) {
        bzq bzqVar;
        boolean z2;
        float f2;
        boolean z3;
        bko bkoVarW = W(bzoVar.a());
        if (!at(j)) {
            if (a.r(i, 1)) {
                float fT = T(j, V());
                if ((Float.floatToRawIntBits(fT) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040 || !bygVar.e(fT, false)) {
                    return;
                }
                aA(bkoVarW, bzoVar, j, bygVar, i, false, fT);
                return;
            }
            return;
        }
        if (bkoVarW == null) {
            D(bzoVar, j, bygVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < w() && fIntBitsToFloat2 < cC()) {
            az(bkoVarW, bzoVar, j, bygVar, i, z);
            return;
        }
        float fT2 = !a.r(i, 1) ? Float.POSITIVE_INFINITY : T(j, V());
        if ((Float.floatToRawIntBits(fT2) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) < 2139095040) {
            z2 = z;
            if (bygVar.e(fT2, z2)) {
                bzqVar = this;
                f2 = fT2;
                z3 = true;
                bzqVar.al(bkoVarW, bzoVar, j, bygVar, i, z2, f2, z3);
            }
            bzqVar = this;
        } else {
            bzqVar = this;
            z2 = z;
        }
        f2 = fT2;
        z3 = false;
        bzqVar.al(bkoVarW, bzoVar, j, bygVar, i, z2, f2, z3);
    }

    public final void af() {
        bzx bzxVar = this.C;
        if (bzxVar != null) {
            bzxVar.invalidate();
            return;
        }
        bzq bzqVar = this.w;
        if (bzqVar != null) {
            bzqVar.af();
        }
    }

    public final void ag() {
        this.s.u.f();
    }

    public final void ah() {
        bzx bzxVar = this.C;
        if (bzxVar != null) {
            bzxVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
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
    public final void ai() {
        bko bkoVarA;
        if (ar(128)) {
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            try {
                boolean zH = bzr.h(128);
                if (!zH) {
                    bkoVarA = A().t;
                    if (bkoVarA == null) {
                    }
                }
                bkoVarA = A();
                for (bko bkoVarX = X(zH); bkoVarX != null; bkoVarX = bkoVarX.u) {
                    if ((bkoVarX.s & 128) == 0) {
                        break;
                    }
                    if ((bkoVarX.r & 128) != 0) {
                        ?? bfzVar = 0;
                        bxw bxwVarF = bkoVarX;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof byk) {
                                ((byk) bxwVarF).bX(this.c);
                            } else if ((bxwVarF.r & 128) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar != null) {
                                    if ((bkoVar.r & 128) != 0) {
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
                    if (bkoVarX == bkoVarA) {
                        break;
                    }
                }
            } finally {
                bcm.z(bitVarT, bitVarU, yjvVarI);
            }
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
    public final void aj() {
        bko bkoVarA;
        boolean zH = bzr.h(128);
        if (zH) {
            bkoVarA = A();
        } else {
            bkoVarA = A().t;
            if (bkoVarA == null) {
                return;
            }
        }
        for (bko bkoVarX = X(zH); bkoVarX != null && (bkoVarX.s & 128) != 0; bkoVarX = bkoVarX.u) {
            if ((bkoVarX.r & 128) != 0) {
                bxw bxwVarF = bkoVarX;
                ?? bfzVar = 0;
                while (bxwVarF != 0) {
                    if (bxwVarF instanceof byk) {
                        ((byk) bxwVarF).cj(this);
                    } else if ((bxwVarF.r & 128) != 0 && (bxwVarF instanceof bxw)) {
                        bko bkoVar = bxwVarF.C;
                        int i = 0;
                        bxwVarF = bxwVarF;
                        bfzVar = bfzVar;
                        while (bkoVar != null) {
                            if ((bkoVar.r & 128) != 0) {
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
            if (bkoVarX == bkoVarA) {
                return;
            }
        }
    }

    public final void ak() {
        this.D = true;
        this.N.a();
        ao();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c A[PHI: r3
  0x018c: PHI (r3v15 bfz) = (r3v1 bfz), (r3v1 bfz), (r3v17 bfz) binds: [B:46:0x015b, B:48:0x015f, B:62:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [bko] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void al(defpackage.bko r14, defpackage.bzo r15, long r16, defpackage.byg r18, int r19, boolean r20, float r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzq.al(bko, bzo, long, byg, int, boolean, float, boolean):void");
    }

    public final void am(long j, float f2, yjv yjvVar, bpu bpuVar) {
        if (bpuVar != null) {
            if (yjvVar != null) {
                bty.b("both ways to create layers shouldn't be used together");
            }
            if (this.O != bpuVar) {
                this.O = null;
                aq(null, false);
                this.O = bpuVar;
            }
            if (this.C == null) {
                bys bysVar = this.s;
                bzz bzzVarA = byv.a(bysVar);
                yjz yjzVarF = F();
                yjk yjkVar = this.N;
                bzx bzxVarH = bzzVarA.h(yjzVarF, yjkVar, bpuVar);
                bzxVarH.f(this.c);
                bzxVarH.e(j);
                this.C = bzxVarH;
                bysVar.at();
                yjkVar.a();
            }
        } else {
            if (this.O != null) {
                this.O = null;
                aq(null, false);
            }
            aq(yjvVar, false);
        }
        if (!a.s(this.x, j)) {
            bys bysVar2 = this.s;
            byv.a(bysVar2).z(-4.0f);
            this.x = j;
            bysVar2.u.o.B();
            bzx bzxVar = this.C;
            if (bzxVar != null) {
                bzxVar.e(j);
            } else {
                bzq bzqVar = this.w;
                if (bzqVar != null) {
                    bzqVar.af();
                }
            }
            S(this);
            bzz bzzVar = bysVar2.i;
            if (bzzVar != null) {
                bzzVar.t(bysVar2);
            }
        }
        this.y = f2;
        if (this.k) {
            return;
        }
        O(J());
    }

    public final void an(bmw bmwVar, boolean z, boolean z2) {
        bzx bzxVar = this.C;
        if (bzxVar != null) {
            if (this.E) {
                if (z2) {
                    long jV = V();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jV & 4294967295L)) / 2.0f;
                    long j = this.c;
                    bmwVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (4294967295L & j)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    bmwVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (bmwVar.c()) {
                    return;
                }
            }
            bzxVar.d(bmwVar, false);
        }
        long j3 = this.x;
        float fA = cmf.a(j3);
        bmwVar.a += fA;
        bmwVar.c += fA;
        float fB = cmf.b(j3);
        bmwVar.b += fB;
        bmwVar.d += fB;
    }

    public final void ao() {
        if (this.C != null) {
            if (this.O != null) {
                this.O = null;
            }
            aq(null, false);
            this.s.S(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Type inference failed for: r7v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bfz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ap(defpackage.bvu r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzq.ap(bvu):void");
    }

    public final void aq(yjv yjvVar, boolean z) {
        bzz bzzVar;
        if (yjvVar != null && this.O != null) {
            bty.b("layerBlock can't be provided when explicitLayer is provided");
        }
        bys bysVar = this.s;
        boolean z2 = true;
        if (!z && this.F == yjvVar && yks.e(this.G, bysVar.p) && this.H == bysVar.q) {
            z2 = false;
        }
        this.G = bysVar.p;
        this.H = bysVar.q;
        if (!bysVar.af() || yjvVar == null) {
            this.F = null;
            bzx bzxVar = this.C;
            if (bzxVar != null) {
                bzxVar.b();
                bysVar.at();
                this.N.a();
                if (s() && bysVar.ag() && (bzzVar = bysVar.i) != null) {
                    bzzVar.t(bysVar);
                }
            }
            this.C = null;
            this.B = false;
            return;
        }
        this.F = yjvVar;
        if (this.C != null) {
            if (z2 && ax(this)) {
                ((cbc) byv.a(bysVar)).m.d(bysVar);
                return;
            }
            return;
        }
        bzz bzzVarA = byv.a(bysVar);
        yjz yjzVarF = F();
        yjk yjkVar = this.N;
        bzx bzxVarH = bzzVarA.h(yjzVarF, yjkVar, null);
        bzxVarH.f(this.c);
        bzxVarH.e(this.x);
        this.C = bzxVarH;
        ax(this);
        bysVar.at();
        yjkVar.a();
    }

    public final boolean ar(int i) {
        bko bkoVarX = X(bzr.h(i));
        return (bkoVarX == null || (i & bkoVarX.E().s) == 0) ? false : true;
    }

    public final boolean as() {
        if (this.C != null && this.I <= 0.0f) {
            return true;
        }
        bzq bzqVar = this.w;
        if (bzqVar != null) {
            return bzqVar.as();
        }
        return false;
    }

    protected final boolean at(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        bzx bzxVar = this.C;
        return bzxVar == null || !this.E || bzxVar.k(j);
    }

    public final long au(long j) {
        long j2 = this.x;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - cmf.a(j2);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - cmf.b(j2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        bzx bzxVar = this.C;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (jFloatToRawIntBits << 32);
        return bzxVar != null ? bzxVar.a(jFloatToRawIntBits2, true) : jFloatToRawIntBits2;
    }

    public final long av(long j) {
        bzx bzxVar = this.C;
        if (bzxVar != null) {
            j = bzxVar.a(j, false);
        }
        return cme.c(j, this.x);
    }

    protected final void ay(bnp bnpVar, tac tacVar) {
        long j = this.c;
        bnpVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, tacVar);
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.s.p.b();
    }

    @Override // defpackage.bwj
    public void cm(long j, float f2, yjv yjvVar) {
        if (!this.t) {
            am(j, f2, yjvVar, null);
            return;
        }
        bza bzaVarB = B();
        bzaVarB.getClass();
        am(bzaVarB.h, f2, yjvVar, null);
    }

    @Override // defpackage.bvc
    public final bvc ct() {
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ag();
        return this.s.o().w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.bwj, defpackage.buy
    public final Object g() {
        bys bysVar = this.s;
        bzm bzmVar = bysVar.t;
        if (!bzmVar.j(64)) {
            return null;
        }
        A();
        ylf ylfVar = new ylf();
        for (bko bkoVar = bzmVar.e; bkoVar != null; bkoVar = bkoVar.t) {
            if ((bkoVar.r & 64) != 0) {
                bxw bxwVarF = bkoVar;
                ?? bfzVar = 0;
                while (bxwVarF != 0) {
                    if (bxwVarF instanceof cac) {
                        clx clxVar = bysVar.p;
                        ylfVar.a = ((cac) bxwVarF).cl(ylfVar.a);
                    } else if ((bxwVarF.r & 64) != 0 && (bxwVarF instanceof bxw)) {
                        bko bkoVar2 = bxwVarF.C;
                        int i = 0;
                        bxwVarF = bxwVarF;
                        bfzVar = bfzVar;
                        while (bkoVar2 != null) {
                            if ((bkoVar2.r & 64) != 0) {
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
        }
        return ylfVar.a;
    }

    @Override // defpackage.bvc
    public final long h() {
        return this.c;
    }

    @Override // defpackage.bvc
    public final long i(bvc bvcVar, long j) {
        return t(bvcVar, j);
    }

    @Override // defpackage.bvc
    public final long j(long j) {
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ag();
        for (bzq bzqVar = this; bzqVar != null; bzqVar = bzqVar.w) {
            j = bzqVar.av(j);
        }
        return j;
    }

    @Override // defpackage.bvc
    public final long k(long j) {
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return byv.a(this.s).d(j(0L));
    }

    @Override // defpackage.bvc
    public final long l(long j) {
        bys bysVar = this.s;
        long j2 = j(j);
        cbc cbcVar = (cbc) byv.a(bysVar);
        cbcVar.H();
        return boa.a(cbcVar.A, j2);
    }

    @Override // defpackage.bvc
    public final long m(long j) {
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return t(bty.w(this), byv.a(this.s).g(j));
    }

    @Override // defpackage.buz
    public final cmi n() {
        return this.s.q;
    }

    @Override // defpackage.bvc
    public final long o(long j) {
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bvc bvcVarW = bty.w(this);
        cbc cbcVar = (cbc) byv.a(this.s);
        cbcVar.H();
        return t(bvcVarW, a.at(boa.a(cbcVar.B, j), bty.q(bvcVarW)));
    }

    @Override // defpackage.bvc
    public final bmy p(bvc bvcVar, boolean z) {
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!bvcVar.s()) {
            bty.c(a.cj(bvcVar, "LayoutCoordinates ", " is not attached!"));
        }
        bzq bzqVarAD = aD(bvcVar);
        bzqVarAD.ag();
        bzq bzqVarAa = aa(bzqVarAD);
        bmw bmwVarY = Y();
        bmwVarY.a = 0.0f;
        bmwVarY.b = 0.0f;
        bmwVarY.c = (int) (bvcVar.h() >> 32);
        bmwVarY.d = (int) (bvcVar.h() & 4294967295L);
        while (bzqVarAD != bzqVarAa) {
            bzqVarAD.an(bmwVarY, z, false);
            if (bmwVarY.c()) {
                return bmy.a;
            }
            bzqVarAD = bzqVarAD.w;
            bzqVarAD.getClass();
        }
        G(bzqVarAa, bmwVarY, z);
        return d.x(bmwVarY);
    }

    @Override // defpackage.bvc
    public final void r(float[] fArr) {
        bzz bzzVarA = byv.a(this.s);
        bzq bzqVarAD = aD(bty.w(this));
        bzq bzqVar = this;
        while (!yks.e(bzqVar, bzqVarAD)) {
            bzx bzxVar = bzqVar.C;
            if (bzxVar != null) {
                bzxVar.h(fArr);
            }
            if (!a.s(bzqVar.x, 0L)) {
                float[] fArr2 = h;
                boa.c(fArr2);
                boa.g(fArr2, cmf.a(r3), cmf.b(r3));
                boa.d(fArr, fArr2);
            }
            bzqVar = bzqVar.w;
            bzqVar.getClass();
        }
        cbc cbcVar = (cbc) bzzVarA;
        cbcVar.H();
        boa.d(fArr, cbcVar.A);
        cbp.g(fArr, Float.intBitsToFloat((int) (cbcVar.C >> 32)), Float.intBitsToFloat((int) (cbcVar.C & 4294967295L)), cbcVar.z);
    }

    @Override // defpackage.bvc
    public final boolean s() {
        return A().A;
    }

    @Override // defpackage.bvc
    public final long t(bvc bvcVar, long j) {
        if (bvcVar instanceof bvr) {
            bvr bvrVar = (bvr) bvcVar;
            bvrVar.a().ag();
            return bvrVar.t(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        bzq bzqVarAD = aD(bvcVar);
        bzqVarAD.ag();
        bzq bzqVarAa = aa(bzqVarAD);
        while (bzqVarAD != bzqVarAa) {
            j = bzqVarAD.av(j);
            bzqVarAD = bzqVarAD.w;
            bzqVarAD.getClass();
        }
        return aC(bzqVarAa, j);
    }

    @Override // defpackage.caa
    public final boolean v() {
        return (this.C == null || this.D || !this.s.af()) ? false : true;
    }

    @Override // defpackage.bwj
    public void x(long j, float f2, bpu bpuVar) {
        if (!this.t) {
            am(j, f2, null, bpuVar);
            return;
        }
        bza bzaVarB = B();
        bzaVarB.getClass();
        am(bzaVarB.h, f2, null, bpuVar);
    }

    @Override // defpackage.byz
    public final bvc I() {
        return this;
    }
}
