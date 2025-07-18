package defpackage;

import android.support.v7.appcompat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bas implements bao {
    public fh B;
    private final Set C;
    private bcl E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    private final ArrayList K;
    private bac L;
    private bef M;
    private final bju N;
    private bjs O;
    private iy Q;
    private final bjg R;
    private final bcm U;
    public final bad a;
    public final baw b;
    public final bdg c;
    public final bed d;
    public final bed e;
    public final baz f;
    public int[] g;
    public boolean h;
    public boolean j;
    public boolean k;
    public int m;
    public boolean n;
    public boolean o;
    public bdf p;
    public bdg q;
    public bdj r;
    public boolean s;
    public bed t;
    public final bee u;
    public final yil v;
    public boolean w;
    public long x;
    public bhu y;
    public jc z;
    private final ArrayList D = new ArrayList();
    private final ira S = new ira((char[]) null);
    public final List i = new ArrayList();
    private final ira T = new ira((char[]) null);
    private bhu P = bhu.d;
    public final ira A = new ira((char[]) null);
    public int l = -1;

    public bas(bad badVar, baw bawVar, bdg bdgVar, Set set, bed bedVar, bed bedVar2, bcm bcmVar, baz bazVar) {
        this.a = badVar;
        this.b = bawVar;
        this.c = bdgVar;
        this.C = set;
        this.d = bedVar;
        this.e = bedVar2;
        this.U = bcmVar;
        this.f = bazVar;
        this.n = bawVar.m() || bawVar.k();
        this.R = new bjg(this, 1);
        this.K = new ArrayList();
        bdf bdfVarB = bdgVar.b();
        bdfVarB.r();
        this.p = bdfVarB;
        bdg bdgVar2 = new bdg();
        if (bawVar.m()) {
            bdgVar2.e();
        }
        if (bawVar.k()) {
            bdgVar2.d();
        }
        this.q = bdgVar2;
        bdj bdjVarC = bdgVar2.c();
        bdjVarC.w(true);
        this.r = bdjVarC;
        this.u = new bee(this, bedVar);
        bdf bdfVarB2 = this.q.b();
        try {
            bac bacVarG = bdfVarB2.g(0);
            bdfVarB2.r();
            this.L = bacVarG;
            this.M = new bef();
            this.N = new bju(this);
            yil yilVarC = bawVar.c();
            yil yilVarR = R();
            this.v = yilVarC.plus(yilVarR == null ? yim.a : yilVarR);
        } catch (Throwable th) {
            bdfVarB2.r();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aA(int r7, int r8, int r9) {
        /*
            r6 = this;
            bdf r0 = r6.p
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.bau.b(r0, r7, r9)
            int r9 = defpackage.bau.b(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = r3
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.B(r7)
            if (r1 == 0) goto L64
            bee r1 = r6.u
            r1.f()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.as(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.aA(int, int, int):void");
    }

    private final void aB(int i) {
        boolean zB = this.p.B(i);
        if (zB) {
            bee beeVar = this.u;
            beeVar.i();
            beeVar.d(this.p.o(i));
        }
        aq(this, i, i, zB, 0);
        bee beeVar2 = this.u;
        beeVar2.i();
        if (zB) {
            beeVar2.f();
        }
    }

    private static final void aC(bas basVar, List list, int i) {
        int iC = basVar.p.c(i) + i;
        int iC2 = i + 1;
        while (iC2 < iC) {
            if (basVar.p.y(iC2)) {
                bca bcaVarAr = ar(basVar, iC2);
                if (bcaVarAr != null) {
                    list.add(bcaVarAr);
                }
            } else if (basVar.p.w(iC2)) {
                aC(basVar, list, iC2);
            }
            iC2 += basVar.p.c(iC2);
        }
    }

    private final void aD() {
        bdf bdfVar = this.p;
        int i = bdfVar.h;
        this.G = i >= 0 ? bdfVar.b[(i * 5) + 1] & 67108863 : 0;
        bdfVar.u();
    }

    private final void aE(int i) {
        ac(i, null, 0, null);
    }

    private final void aF(boolean z, Object obj) {
        if (z) {
            bdf bdfVar = this.p;
            if (bdfVar.i <= 0) {
                if ((bdfVar.b[(bdfVar.f * 5) + 1] & 1073741824) == 0) {
                    bcm.a("Expected a node group");
                }
                bdfVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.p.h() != obj) {
            bee beeVar = this.u;
            beeVar.j(false);
            bfu bfuVar = beeVar.a.a;
            bfuVar.cC(bfk.a);
            bft.a(bfuVar, 0, obj);
        }
        this.p.v();
    }

    private final void aG(int i, int i2) {
        int iP = P(i);
        if (iP != i2) {
            ArrayList arrayList = this.D;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iP2 = P(i) + (i2 - iP);
                af(i, iP2);
                int i3 = size;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    bcl bclVar = (bcl) arrayList.get(i3);
                    if (bclVar != null && bclVar.a(i, iP2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                if (i < 0) {
                    i = this.p.h;
                } else if (this.p.B(i)) {
                    return;
                } else {
                    i = this.p.e(i);
                }
            }
        }
    }

    private final void aH(Object obj) {
        S();
        ag(obj);
    }

    private final void aI() {
        if (!this.I) {
            bau.i("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.I = false;
    }

    private final void aJ() {
        if (this.I) {
            bau.i("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final bhu aK(int i) {
        bhu bhuVar;
        if (this.w && this.s) {
            int iK = this.r.q;
            while (iK > 0) {
                if (this.r.h(iK) == 202 && yks.e(this.r.r(iK), bau.c)) {
                    Object objQ = this.r.q(iK);
                    objQ.getClass();
                    bhu bhuVar2 = (bhu) objQ;
                    this.y = bhuVar2;
                    return bhuVar2;
                }
                iK = this.r.k(iK);
            }
        }
        if (this.p.c > 0) {
            while (i > 0) {
                if (this.p.b(i) == 202 && yks.e(this.p.m(i), bau.c)) {
                    jc jcVar = this.z;
                    if (jcVar == null || (bhuVar = (bhu) jcVar.a(i)) == null) {
                        Object objJ = this.p.j(i);
                        objJ.getClass();
                        bhuVar = (bhu) objJ;
                    }
                    this.y = bhuVar;
                    return bhuVar;
                }
                i = this.p.e(i);
            }
        }
        bhu bhuVar3 = this.P;
        this.y = bhuVar3;
        return bhuVar3;
    }

    private static final int aL(int i) {
        return (-2) - i;
    }

    private final int ap(int i) {
        int iE = this.p.e(i) + 1;
        int i2 = 0;
        while (iE < i) {
            if (!this.p.z(iE)) {
                i2++;
            }
            iE += this.p.c(iE);
        }
        return i2;
    }

    private static final int aq(bas basVar, int i, int i2, boolean z, int i3) {
        bdf bdfVar = basVar.p;
        if (!bdfVar.y(i2)) {
            if (!bdfVar.w(i2)) {
                if (bdfVar.B(i2)) {
                    return 1;
                }
                return bdfVar.d(i2);
            }
            int iC = bdfVar.c(i2) + i2;
            int iAq = 0;
            for (int iC2 = i2 + 1; iC2 < iC; iC2 += bdfVar.c(iC2)) {
                boolean zB = bdfVar.B(iC2);
                if (zB) {
                    bee beeVar = basVar.u;
                    beeVar.i();
                    beeVar.d(bdfVar.o(iC2));
                }
                iAq += aq(basVar, i, iC2, zB || z, zB ? 0 : i3 + iAq);
                if (zB) {
                    bee beeVar2 = basVar.u;
                    beeVar2.i();
                    beeVar2.f();
                }
            }
            if (bdfVar.B(i2)) {
                return 1;
            }
            return iAq;
        }
        int iB = bdfVar.b(i2);
        Object objM = bdfVar.m(i2);
        if (iB == 126665345) {
            if (objM instanceof bbz) {
                bca bcaVarAr = ar(basVar, i2);
                if (bcaVarAr != null) {
                    baw bawVar = basVar.b;
                    bawVar.d(bcaVarAr);
                    bee beeVar3 = basVar.u;
                    beeVar3.k();
                    baz bazVar = basVar.f;
                    bfu bfuVar = beeVar3.a.a;
                    bfuVar.cC(bfa.a);
                    bft.c(bfuVar, bazVar, bawVar, bcaVarAr);
                }
                if (!z || i2 == i) {
                    return bdfVar.d(i2);
                }
                bee beeVar4 = basVar.u;
                beeVar4.i();
                beeVar4.g();
                int iD = beeVar4.a().B(i2) ? 1 : beeVar4.a().d(i2);
                if (iD <= 0) {
                    return 0;
                }
                beeVar4.l(i3, iD);
                return 0;
            }
        } else if (iB == 206 && yks.e(objM, bau.e)) {
            Object objL = bdfVar.l(i2, 0);
            baq baqVar = objL instanceof baq ? (baq) objL : null;
            if (baqVar != null) {
                for (bas basVar2 : baqVar.a.a) {
                    bdg bdgVar = basVar2.c;
                    if (bdgVar.b > 0 && (bdgVar.a[1] & 67108864) != 0) {
                        baz bazVar2 = basVar2.f;
                        synchronized (bazVar2.b) {
                            Object andSet = bazVar2.a.getAndSet(yhd.a);
                            if (!yks.e(andSet, bba.a) && andSet != null) {
                                if (andSet instanceof Set) {
                                    bazVar2.f((Set) andSet, false);
                                } else {
                                    if (!(andSet instanceof Object[])) {
                                        AtomicReference atomicReference = bazVar2.a;
                                        Objects.toString(atomicReference);
                                        bau.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                        throw new yfs();
                                    }
                                    for (Set set : (Set[]) andSet) {
                                        bazVar2.f(set, false);
                                    }
                                }
                            }
                            ki kiVarP = bazVar2.p();
                            try {
                                bazVar2.h.am(kiVarP);
                            } catch (Throwable th) {
                                bazVar2.l = kiVarP;
                                throw th;
                            }
                        }
                        bed bedVar = new bed();
                        basVar2.t = bedVar;
                        bdf bdfVarB = bdgVar.b();
                        try {
                            basVar2.p = bdfVarB;
                            bee beeVar5 = basVar2.u;
                            bed bedVar2 = beeVar5.a;
                            try {
                                beeVar5.a = bedVar;
                                basVar2.aB(0);
                                beeVar5.g();
                                if (beeVar5.b) {
                                    beeVar5.m();
                                    beeVar5.b();
                                }
                            } finally {
                            }
                        } finally {
                            bdfVarB.r();
                        }
                    }
                    basVar.b.q(basVar2.f);
                }
            }
            return bdfVar.d(i2);
        }
        if (bdfVar.B(i2)) {
            return 1;
        }
        return bdfVar.d(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.bca ar(defpackage.bas r13, int r14) {
        /*
            bdf r0 = r13.p
            int r0 = r0.b(r14)
            bdf r1 = r13.p
            java.lang.Object r1 = r1.m(r14)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L88
            boolean r0 = r1 instanceof defpackage.bbz
            if (r0 == 0) goto L88
            bdf r0 = r13.p
            boolean r0 = r0.w(r14)
            if (r0 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            aC(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r12 = r0
            goto L30
        L2f:
            r12 = r3
        L30:
            bdf r0 = r13.p
            java.lang.Object r0 = r0.m(r14)
            r0.getClass()
            r5 = r0
            bbz r5 = (defpackage.bbz) r5
            bdf r0 = r13.p
            r1 = 0
            java.lang.Object r6 = r0.l(r14, r1)
            bdf r0 = r13.p
            bac r9 = r0.g(r14)
            bdf r0 = r13.p
            int r0 = r0.c(r14)
            int r0 = r0 + r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r1 = r13.i
            int r2 = defpackage.bau.c(r1, r14)
        L5b:
            int r3 = r1.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r1.get(r2)
            bbq r3 = (defpackage.bbq) r3
            int r4 = r3.a
            if (r4 >= r0) goto L7a
            java.lang.Object r4 = r3.c
            java.lang.Object r3 = r3.b
            yfw r7 = new yfw
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L5b
        L7a:
            baz r7 = r13.f
            bdg r8 = r13.c
            bca r4 = new bca
            bhu r11 = r13.aK(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.ar(bas, int):bca");
    }

    private final void as(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        as(this.p.e(i), i2);
        if (this.p.B(i)) {
            this.u.d(this.p.o(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ee  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void at(boolean r38) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.at(boolean):void");
    }

    private final void au() {
        if (this.r.r) {
            bdj bdjVarC = this.q.c();
            this.r = bdjVarC;
            bdjVarC.H();
            this.s = false;
            this.y = null;
        }
    }

    private final void av(boolean z, bcl bclVar) {
        this.D.add(this.E);
        this.E = bclVar;
        ira iraVar = this.S;
        iraVar.g(this.G);
        iraVar.g(this.H);
        iraVar.g(this.F);
        if (z) {
            this.F = 0;
        }
        this.G = 0;
        this.H = 0;
    }

    private final void aw(bcr bcrVar) {
        bcrVar.e = this.J;
        bcrVar.h(false);
        bcm.f();
    }

    private final void ax() {
        bdg bdgVar = new bdg();
        if (this.n) {
            bdgVar.e();
        }
        if (this.b.k()) {
            bdgVar.d();
        }
        this.q = bdgVar;
        bdj bdjVarC = bdgVar.c();
        bdjVarC.w(true);
        this.r = bdjVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ay() {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.ay():void");
    }

    private final void az() {
        aB(this.p.f);
        bee beeVar = this.u;
        beeVar.h();
        beeVar.a.a.cC(bfc.a);
        int i = beeVar.d;
        bdf bdfVarA = beeVar.a();
        beeVar.d = i + bdi.a(bdfVarA.b, bdfVarA.f);
    }

    @Override // defpackage.bao
    public final void A(Object obj) {
        ae(obj);
    }

    @Override // defpackage.bao
    public final void B() {
        aI();
        if (this.w) {
            bau.i("useNode() called while inserting");
        }
        bdf bdfVar = this.p;
        Object objO = bdfVar.o(bdfVar.h);
        bee beeVar = this.u;
        beeVar.d(objO);
        if (this.k && (objO instanceof bak)) {
            beeVar.g();
            beeVar.a.a.cC(bfo.a);
        }
    }

    @Override // defpackage.bao
    public final boolean C(float f) {
        Object objS = S();
        if ((objS instanceof Float) && f == ((Number) objS).floatValue()) {
            return false;
        }
        ag(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.bao
    public final boolean D(int i) {
        Object objS = S();
        if ((objS instanceof Integer) && i == ((Number) objS).intValue()) {
            return false;
        }
        ag(Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.bao
    public final boolean E(long j) {
        Object objS = S();
        if ((objS instanceof Long) && j == ((Number) objS).longValue()) {
            return false;
        }
        ag(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.bao
    public final boolean F(Object obj) {
        if (yks.e(S(), obj)) {
            return false;
        }
        ag(obj);
        return true;
    }

    @Override // defpackage.bao
    public final boolean G(boolean z) {
        Object objS = S();
        if ((objS instanceof Boolean) && z == ((Boolean) objS).booleanValue()) {
            return false;
        }
        ag(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.bao
    public final boolean H(Object obj) {
        if (S() == obj) {
            return false;
        }
        ag(obj);
        return true;
    }

    @Override // defpackage.bao
    public final boolean I() {
        if (!K() || this.j) {
            return true;
        }
        bcr bcrVarQ = Q();
        return (bcrVarQ == null || (bcrVarQ.a & 4) == 0) ? false : true;
    }

    @Override // defpackage.bao
    public final boolean J() {
        return this.w;
    }

    @Override // defpackage.bao
    public final boolean K() {
        bcr bcrVarQ;
        return (this.w || this.k || this.j || (bcrVarQ = Q()) == null || (bcrVarQ.a & 8) != 0) ? false : true;
    }

    @Override // defpackage.bao
    public final boolean L(boolean z, int i) {
        return (i == 0 && (this.w || this.k)) || z || !K();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[EDGE_INSN: B:56:0x0074->B:29:0x0074 BREAK  A[LOOP:0: B:15:0x0033->B:28:0x0071], EDGE_INSN: B:57:0x0074->B:29:0x0074 BREAK  A[LOOP:0: B:15:0x0033->B:28:0x0071]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    @Override // defpackage.bao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bcr M() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.M():bcr");
    }

    @Override // defpackage.bao
    public final void N(Object obj) {
        if (!this.w && this.p.a() == 207 && !yks.e(this.p.h(), obj) && this.l < 0) {
            this.l = this.p.f;
            this.k = true;
        }
        ac(207, null, 0, obj);
    }

    @Override // defpackage.bao
    public final bhu O() {
        return ai();
    }

    public final int P(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.g;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.p.d(i) : i2;
        }
        iy iyVar = this.Q;
        if (iyVar == null || iyVar.a(i) < 0) {
            return 0;
        }
        int iA = iyVar.a(i);
        if (iA < 0) {
            kv.d(a.cf(i, "Cannot find value for key "));
        }
        return iyVar.c[iA];
    }

    public final bcr Q() {
        if (this.m != 0) {
            return null;
        }
        ArrayList arrayList = this.K;
        if (bdx.b(arrayList)) {
            return (bcr) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final bju R() {
        if (this.n) {
            return this.N;
        }
        return null;
    }

    public final Object S() {
        if (this.w) {
            aJ();
            return ban.a;
        }
        Object objN = this.p.n();
        return (!this.k || (objN instanceof baq)) ? objN : ban.a;
    }

    public final Object T() {
        if (this.w) {
            aJ();
            return ban.a;
        }
        Object objN = this.p.n();
        return (!this.k || (objN instanceof baq)) ? objN instanceof bdb ? ((bdb) objN).a : objN : ban.a;
    }

    public final List U() {
        RandomAccess arrayList;
        if (!this.n) {
            return yhb.a;
        }
        ArrayList arrayList2 = new ArrayList();
        bdj bdjVar = this.r;
        arrayList2.addAll(bcm.p(bdjVar, bdjVar.o, null));
        bdf bdfVar = this.p;
        if (bdfVar.e || bdfVar.c == 0) {
            arrayList = yhb.a;
        } else {
            arrayList = new ArrayList();
            int iE = bdfVar.h;
            Object objValueOf = Integer.valueOf(bdfVar.j - bdi.e(bdfVar.b, iE));
            while (iE >= 0) {
                bcm.q(bdfVar.a.h(iE), objValueOf);
                objValueOf = bdfVar.g(iE);
                iE = bdfVar.e(iE);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList2.addAll(V());
        return arrayList2;
    }

    public final List V() {
        baw bawVar = this.b;
        bav bavVarB = bawVar.b();
        if (true != (bavVarB instanceof baz)) {
            bavVarB = null;
        }
        if (bavVarB == null) {
            return yhb.a;
        }
        baz bazVar = (baz) bavVarB;
        bdf bdfVarB = bazVar.d.b();
        try {
            Integer numM = bcm.m(bdfVarB, bawVar, 0, bdfVarB.c);
            if (numM == null) {
                return yhb.a;
            }
            try {
                return bcm.n(bazVar.d.b(), numM.intValue(), 0);
            } finally {
            }
        } finally {
        }
    }

    public final void W() {
        X();
        this.D.clear();
        this.S.f();
        this.T.f();
        this.A.f();
        this.z = null;
        bef befVar = this.M;
        befVar.b.cB();
        befVar.a.cB();
        this.x = 0L;
        this.m = 0;
        this.I = false;
        this.w = false;
        this.k = false;
        this.o = false;
        this.l = -1;
        bdf bdfVar = this.p;
        if (!bdfVar.e) {
            bdfVar.r();
        }
        if (this.r.r) {
            return;
        }
        ax();
    }

    public final void X() {
        this.E = null;
        this.F = 0;
        this.G = 0;
        this.x = 0L;
        this.I = false;
        bee beeVar = this.u;
        beeVar.b = false;
        beeVar.h.f();
        beeVar.d = 0;
        this.K.clear();
        this.g = null;
        this.Q = null;
    }

    public final void Y() {
        if (!this.r.r) {
            bau.i("Check failed");
        }
        ax();
    }

    public final void Z() {
        this.K.clear();
        this.i.clear();
        this.d.cB();
        this.z = null;
    }

    @Override // defpackage.bao
    public final /* synthetic */ int a() {
        return a.k(this.x);
    }

    public final void aa() {
        at(false);
    }

    public final void ab() {
        this.G += this.p.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ac(int i, Object obj, int i2, Object obj2) {
        int iHashCode;
        long j;
        int i3;
        int i4;
        bcl bclVar;
        boolean z;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        long[] jArr3;
        char c;
        long[] jArr4;
        char c2;
        int i7;
        long jRotateLeft;
        Object obj3 = obj;
        aJ();
        int i8 = this.H;
        if (obj3 == null) {
            long j2 = i8;
            if (obj2 != null) {
                i3 = 207;
                i7 = i;
                if (i7 == 207) {
                    if (!yks.e(obj2, ban.a)) {
                        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.x, 3) ^ obj2.hashCode(), 3);
                    }
                    this.x = j2 ^ jRotateLeft;
                }
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.x, 3) ^ i3, 3);
                this.x = j2 ^ jRotateLeft;
            } else {
                i7 = i;
            }
            i3 = i7;
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.x, 3) ^ i3, 3);
            this.x = j2 ^ jRotateLeft;
        } else {
            if (obj3 instanceof Enum) {
                iHashCode = ((Enum) obj3).ordinal();
                j = this.x;
            } else {
                iHashCode = obj3.hashCode();
                j = this.x;
            }
            this.x = Long.rotateLeft(Long.rotateLeft(j, 3) ^ iHashCode, 3);
            i3 = i;
        }
        int i9 = 1;
        boolean z2 = true;
        if (obj3 == null) {
            this.H++;
        }
        boolean z3 = i2 != 0;
        int i10 = -1;
        if (this.w) {
            this.p.q();
            bdj bdjVar = this.r;
            int i11 = bdjVar.o;
            if (z3) {
                bdjVar.L(i3, ban.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = ban.a;
                    }
                    bdjVar.I(i3, obj3, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = ban.a;
                    }
                    bdjVar.K(i3, obj3);
                }
                z2 = false;
            }
            bcl bclVar2 = this.E;
            if (bclVar2 != null) {
                tqp tqpVar = new tqp(i3, (Object) (-1), aL(i11), -1);
                bclVar2.d(tqpVar, this.F - bclVar2.b);
                bclVar2.e(tqpVar);
            }
            av(z2, null);
            return;
        }
        byte b = i2 == 1 && this.k;
        if (this.E == null) {
            int iA = this.p.a();
            if (b != true && iA == i3 && yks.e(obj3, this.p.i())) {
                aF(z3, obj2);
                i4 = -1;
            } else {
                bdf bdfVar = this.p;
                ArrayList arrayList = new ArrayList();
                if (bdfVar.i <= 0) {
                    int iA2 = bdfVar.f;
                    while (iA2 < bdfVar.g) {
                        int[] iArr = bdfVar.b;
                        int i12 = iA2 * 5;
                        int i13 = i10;
                        int i14 = iArr[i12];
                        Object objP = bdfVar.p(iArr, iA2);
                        int i15 = iArr[i12 + 1];
                        if ((i15 & 1073741824) == 0) {
                            i9 = i15 & 67108863;
                        }
                        arrayList.add(new tqp(i14, objP, iA2, i9));
                        iA2 += bdi.a(iArr, iA2);
                        i10 = i13;
                        i9 = 1;
                    }
                }
                i4 = i10;
                this.E = new bcl(arrayList, this.F);
            }
        } else {
            i4 = -1;
        }
        bcl bclVar3 = this.E;
        if (bclVar3 != null) {
            Object bbrVar = obj3 != null ? new bbr(Integer.valueOf(i3), obj3) : Integer.valueOf(i3);
            ki kiVar = ((bfv) bclVar3.e.a()).a;
            Object objA = kiVar.a(bbrVar);
            if (objA == null) {
                objA = null;
            } else if (objA instanceof kc) {
                kc kcVar = (kc) objA;
                Object objH = kcVar.h(0);
                if (kcVar.f()) {
                    kiVar.g(bbrVar);
                }
                if (kcVar.b == 1) {
                    kiVar.j(bbrVar, kcVar.b());
                }
                objA = objH;
            } else {
                kiVar.g(bbrVar);
            }
            tqp tqpVar2 = (tqp) objA;
            if (b == true || tqpVar2 == null) {
                boolean z4 = z3;
                this.p.q();
                boolean z5 = true;
                this.w = true;
                this.y = null;
                au();
                this.r.v();
                bdj bdjVar2 = this.r;
                int i16 = bdjVar2.o;
                if (z4) {
                    bdjVar2.L(i3, ban.a);
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = ban.a;
                        }
                        bdjVar2.I(i3, obj3, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = ban.a;
                        }
                        bdjVar2.K(i3, obj3);
                    }
                    z5 = false;
                }
                this.L = this.r.o(i16);
                tqp tqpVar3 = new tqp(i3, Integer.valueOf(i4), aL(i16), i4);
                bclVar3.d(tqpVar3, this.F - bclVar3.b);
                bclVar3.e(tqpVar3);
                bclVar = new bcl(new ArrayList(), z5 ? 0 : this.F);
                z3 = z5;
            } else {
                bclVar3.e(tqpVar2);
                this.F = bclVar3.b(tqpVar2) + bclVar3.b;
                jc jcVar = bclVar3.f;
                int i17 = tqpVar2.c;
                odn odnVar = (odn) jcVar.a(i17);
                int i18 = odnVar != null ? odnVar.c : i4;
                int i19 = bclVar3.c;
                int i20 = i18 - i19;
                if (i18 > i19) {
                    Object[] objArr = jcVar.c;
                    long[] jArr5 = jcVar.a;
                    int length = jArr5.length - 2;
                    if (length >= 0) {
                        int i21 = 0;
                        char c3 = 7;
                        while (true) {
                            long j3 = jArr5[i21];
                            z = z3;
                            if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length)) >>> 31);
                                int i23 = 0;
                                while (i23 < i22) {
                                    if ((j3 & 255) < 128) {
                                        c2 = c3;
                                        odn odnVar2 = (odn) objArr[(i21 << 3) + i23];
                                        jArr4 = jArr5;
                                        int i24 = odnVar2.c;
                                        if (i24 == i18) {
                                            odnVar2.c = i19;
                                        } else if (i19 <= i24 && i24 < i18) {
                                            odnVar2.c = i24 + 1;
                                        }
                                    } else {
                                        jArr4 = jArr5;
                                        c2 = c3;
                                    }
                                    j3 >>= 8;
                                    i23++;
                                    jArr5 = jArr4;
                                    c3 = c2;
                                }
                                jArr3 = jArr5;
                                c = c3;
                                if (i22 != 8) {
                                    break;
                                }
                            } else {
                                jArr3 = jArr5;
                                c = c3;
                            }
                            if (i21 == length) {
                                break;
                            }
                            i21++;
                            z3 = z;
                            jArr5 = jArr3;
                            c3 = c;
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    if (i19 > i18) {
                        Object[] objArr2 = jcVar.c;
                        long[] jArr6 = jcVar.a;
                        int length2 = jArr6.length - 2;
                        if (length2 >= 0) {
                            int i25 = 0;
                            while (true) {
                                long j4 = jArr6[i25];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        if ((j4 & 255) < 128) {
                                            odn odnVar3 = (odn) objArr2[(i25 << 3) + i27];
                                            jArr2 = jArr6;
                                            int i28 = odnVar3.c;
                                            if (i28 == i18) {
                                                odnVar3.c = i19;
                                            } else {
                                                i6 = i18;
                                                if (i6 + 1 <= i28 && i28 < i19) {
                                                    odnVar3.c = i28 - 1;
                                                }
                                                j4 >>= 8;
                                                i27++;
                                                jArr6 = jArr2;
                                                i18 = i6;
                                            }
                                        } else {
                                            jArr2 = jArr6;
                                        }
                                        i6 = i18;
                                        j4 >>= 8;
                                        i27++;
                                        jArr6 = jArr2;
                                        i18 = i6;
                                    }
                                    jArr = jArr6;
                                    i5 = i18;
                                    if (i26 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr6;
                                    i5 = i18;
                                }
                                if (i25 == length2) {
                                    break;
                                }
                                i25++;
                                jArr6 = jArr;
                                i18 = i5;
                            }
                        }
                    }
                }
                bee beeVar = this.u;
                beeVar.e(i17);
                this.p.t(i17);
                if (i20 > 0) {
                    beeVar.h();
                    bfu bfuVar = beeVar.a.a;
                    bfuVar.cC(bex.a);
                    bfuVar.c[bfuVar.d - bfuVar.a[bfuVar.b - 1].b] = i20;
                }
                aF(z, obj2);
                z3 = z;
                bclVar = null;
            }
        } else {
            bclVar = null;
        }
        av(z3, bclVar);
    }

    public final void ad(int i, Object obj) {
        ac(i, obj, 0, null);
    }

    public final void ae(Object obj) {
        int i;
        bdf bdfVar;
        int i2;
        bdj bdjVar;
        if (obj instanceof bda) {
            bda bdaVar = (bda) obj;
            bac bacVarG = null;
            if (this.w) {
                bdj bdjVar2 = this.r;
                int i3 = bdjVar2.o;
                if (i3 > bdjVar2.q + 1) {
                    int i4 = i3 - 1;
                    int iK = bdjVar2.k(i4);
                    while (true) {
                        i2 = i4;
                        i4 = iK;
                        bdjVar = this.r;
                        if (i4 == bdjVar.q || i4 < 0) {
                            break;
                        } else {
                            iK = bdjVar.k(i4);
                        }
                    }
                    bacVarG = bdjVar.o(i2);
                }
            } else {
                bdf bdfVar2 = this.p;
                int i5 = bdfVar2.f;
                if (i5 > bdfVar2.h + 1) {
                    int i6 = i5 - 1;
                    int iE = bdfVar2.e(i6);
                    while (true) {
                        i = i6;
                        i6 = iE;
                        bdfVar = this.p;
                        if (i6 == bdfVar.h || i6 < 0) {
                            break;
                        } else {
                            iE = bdfVar.e(i6);
                        }
                    }
                    bacVarG = bdfVar.g(i);
                }
            }
            bdb bdbVar = new bdb(bdaVar, bacVarG);
            if (this.w) {
                bfu bfuVar = this.u.a.a;
                bfuVar.cC(bfb.a);
                bft.a(bfuVar, 0, bdbVar);
            }
            this.C.add(obj);
            obj = bdbVar;
        }
        ag(obj);
    }

    public final void af(int i, int i2) {
        if (P(i) != i2) {
            if (i < 0) {
                iy iyVar = this.Q;
                if (iyVar == null) {
                    iyVar = new iy((byte[]) null);
                    this.Q = iyVar;
                }
                iyVar.c(i, i2);
                return;
            }
            int[] iArr = this.g;
            if (iArr == null) {
                iArr = new int[this.p.c];
                Arrays.fill(iArr, 0, iArr.length, -1);
                this.g = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void ag(Object obj) {
        if (this.w) {
            this.r.X(obj);
            return;
        }
        bdf bdfVar = this.p;
        if (!bdfVar.l) {
            bee beeVar = this.u;
            bac bacVarG = bdfVar.g(bdfVar.h);
            bfu bfuVar = beeVar.a.a;
            bfuVar.cC(beh.a);
            bft.b(bfuVar, 0, bacVarG, 1, obj);
            return;
        }
        int iE = bdfVar.j - bdi.e(bdfVar.b, bdfVar.h);
        bee beeVar2 = this.u;
        int i = iE - 1;
        if (beeVar2.a().h - beeVar2.d >= 0) {
            beeVar2.j(true);
            bfu bfuVar2 = beeVar2.a.a;
            bfuVar2.cC(bfm.a);
            bft.a(bfuVar2, 0, obj);
            bfuVar2.c[bfuVar2.d - bfuVar2.a[bfuVar2.b - 1].b] = i;
            return;
        }
        bdf bdfVar2 = this.p;
        bac bacVarG2 = bdfVar2.g(bdfVar2.h);
        bfu bfuVar3 = beeVar2.a.a;
        bfuVar3.cC(bfj.a);
        bft.b(bfuVar3, 0, obj, 1, bacVarG2);
        bfuVar3.c[bfuVar3.d - bfuVar3.a[bfuVar3.b - 1].b] = i;
    }

    public final boolean ah(bcr bcrVar, Object obj) {
        bac bacVar = bcrVar.c;
        if (bacVar == null) {
            return false;
        }
        int iA = this.p.a.a(bacVar);
        if (!this.o || iA < this.p.f) {
            return false;
        }
        List list = this.i;
        int iD = bau.d(list, iA);
        if (iD < 0) {
            int i = iD + 1;
            if (true != (obj instanceof bbh)) {
                obj = null;
            }
            list.add(-i, new bbq(bcrVar, iA, obj));
        } else {
            bbq bbqVar = (bbq) list.get(iD);
            if (obj instanceof bbh) {
                Object obj2 = bbqVar.b;
                if (obj2 == null) {
                    bbqVar.b = obj;
                } else if (obj2 instanceof kk) {
                    ((kk) obj2).j(obj);
                } else {
                    int i2 = kl.a;
                    kk kkVar = new kk(2);
                    kkVar.h(obj2);
                    kkVar.h(obj);
                    bbqVar.b = kkVar;
                }
            } else {
                bbqVar.b = null;
            }
        }
        return true;
    }

    public final bhu ai() {
        bhu bhuVar = this.y;
        return bhuVar != null ? bhuVar : aK(this.p.h);
    }

    public final bhu aj(bhu bhuVar, bhu bhuVar2) {
        bht bhtVar = new bht(bhuVar);
        bhtVar.putAll(bhuVar2);
        bhu bhuVarG = bhtVar.b();
        ad(204, bau.d);
        aH(bhuVarG);
        aH(bhuVar2);
        aa();
        return bhuVarG;
    }

    public final void ak(bhu bhuVar) {
        jc jcVar = this.z;
        if (jcVar == null) {
            jcVar = new jc((byte[]) null);
            this.z = jcVar;
        }
        jcVar.f(this.p.f, bhuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0243, TryCatch #0 {all -> 0x0243, blocks: (B:7:0x002f, B:9:0x005e, B:10:0x0064, B:12:0x0068, B:15:0x007f, B:17:0x008b, B:18:0x0095, B:21:0x00a8, B:22:0x00ab, B:69:0x01e6, B:71:0x0206, B:72:0x020b, B:74:0x0213, B:75:0x0218, B:80:0x023b, B:81:0x0242, B:14:0x0070, B:23:0x00b1, B:25:0x00b8, B:26:0x00c5, B:29:0x00cb, B:31:0x00d3, B:32:0x00e6, B:34:0x00ee, B:35:0x00f3, B:39:0x010c, B:41:0x0114, B:50:0x0171, B:54:0x0182, B:58:0x0191, B:60:0x0199, B:61:0x01ab, B:63:0x01af, B:64:0x01be, B:66:0x01c2, B:67:0x01d5, B:43:0x012c, B:44:0x013e, B:46:0x0142, B:47:0x0158, B:48:0x015b), top: B:91:0x002f, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void al(defpackage.ki r17, defpackage.yjz r18) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.al(ki, yjz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void am(defpackage.ki r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r3 = r1.c
            long[] r1 = r1.a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L61
            r6 = 0
        L10:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5c
            int r9 = r6 - r4
            r10 = 0
        L23:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]
            r11 = r3[r11]
            r13.getClass()
            bcr r13 = (defpackage.bcr) r13
            bac r14 = r13.c
            if (r14 == 0) goto L56
            java.util.List r15 = r0.i
            int r14 = r14.a
            bde r5 = defpackage.bde.a
            if (r11 != r5) goto L4e
            r11 = 0
        L4e:
            bbq r5 = new bbq
            r5.<init>(r13, r14, r11)
            r15.add(r5)
        L56:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L23
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r6 == r4) goto L61
            int r6 = r6 + 1
            goto L10
        L61:
            java.util.List r1 = r0.i
            java.util.Comparator r2 = defpackage.bau.f
            defpackage.yfm.C(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.am(ki):void");
    }

    public final void an(bbz bbzVar, bhu bhuVar, Object obj) {
        v(126665345, bbzVar);
        aH(obj);
        long j = this.x;
        try {
            this.x = 126665345L;
            if (this.w) {
                bdj.V(this.r);
            }
            boolean z = (this.w || yks.e(this.p.h(), bhuVar)) ? false : true;
            if (z) {
                ak(bhuVar);
            }
            ac(202, bau.c, 0, bhuVar);
            this.y = null;
            boolean z2 = this.j;
            this.j = z;
            bga.f(this, new bhq(316014703, true, new anr(11)));
            this.j = z2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:16:0x0036, B:19:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x0050, B:25:0x0051, B:27:0x0057, B:20:0x0042), top: B:35:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ao(defpackage.baz r9, defpackage.baz r10, java.lang.Integer r11, java.util.List r12, defpackage.yjk r13) {
        /*
            r8 = this;
            boolean r0 = r8.o
            int r1 = r8.F
            r2 = 1
            r8.o = r2     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r8.F = r2     // Catch: java.lang.Throwable -> L5f
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L5f
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L5f
            yfw r6 = (defpackage.yfw) r6     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L5f
            bcr r7 = (defpackage.bcr) r7     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L24
            r8.ah(r7, r6)     // Catch: java.lang.Throwable -> L5f
            goto L27
        L24:
            r8.ah(r7, r5)     // Catch: java.lang.Throwable -> L5f
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L57
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L5f
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L51
            boolean r12 = defpackage.yks.e(r10, r9)     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L51
            if (r11 < 0) goto L51
            r9.e = r10     // Catch: java.lang.Throwable -> L5f
            r9.f = r11     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L4b
            r9.e = r5     // Catch: java.lang.Throwable -> L5f
            r9.f = r2     // Catch: java.lang.Throwable -> L5f
            goto L55
        L4b:
            r10 = move-exception
            r9.e = r5     // Catch: java.lang.Throwable -> L5f
            r9.f = r2     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L51:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L5f
        L55:
            if (r10 != 0) goto L5a
        L57:
            r13.a()     // Catch: java.lang.Throwable -> L5f
        L5a:
            r8.o = r0
            r8.F = r1
            return
        L5f:
            r9 = move-exception
            r8.o = r0
            r8.F = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bas.ao(baz, baz, java.lang.Integer, java.util.List, yjk):void");
    }

    @Override // defpackage.bao
    public final long b() {
        return this.x;
    }

    @Override // defpackage.bao
    public final bad c() {
        return this.a;
    }

    @Override // defpackage.bao
    public final bao d(int i) {
        bcr bcrVar;
        boolean z;
        x(i);
        if (this.w) {
            bcr bcrVar2 = new bcr(this.f);
            this.K.add(bcrVar2);
            ag(bcrVar2);
            aw(bcrVar2);
            return this;
        }
        bbq bbqVarF = bau.f(this.i, this.p.h);
        Object objN = this.p.n();
        if (yks.e(objN, ban.a)) {
            bcrVar = new bcr(this.f);
            ag(bcrVar);
        } else {
            objN.getClass();
            bcrVar = (bcr) objN;
        }
        if (bbqVarF == null) {
            int i2 = bcrVar.a;
            if ((i2 & 64) != 0) {
                bcrVar.a = i2 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        bcrVar.d(z);
        this.K.add(bcrVar);
        aw(bcrVar);
        int i3 = bcrVar.a;
        if ((i3 & 256) != 0) {
            bcrVar.a = i3 & (-257);
            bcrVar.g(true);
            bfu bfuVar = this.u.a.a;
            bfuVar.cC(bfh.a);
            bft.a(bfuVar, 0, bcrVar);
            if (!this.k && bcrVar.i()) {
                this.k = true;
                bcrVar.f(true);
            }
        }
        return this;
    }

    @Override // defpackage.bao
    public final bjs e() {
        bjs bjsVar = this.O;
        if (bjsVar != null) {
            return bjsVar;
        }
        bay bayVar = new bay(this.f);
        this.O = bayVar;
        return bayVar;
    }

    @Override // defpackage.bao
    public final Object f(bbb bbbVar) {
        return bcm.h(ai(), bbbVar);
    }

    @Override // defpackage.bao
    public final Object g() {
        return T();
    }

    @Override // defpackage.bao
    public final yil h() {
        return this.v;
    }

    @Override // defpackage.bao
    public final void i(Object obj, yjz yjzVar) {
        if (this.w) {
            bfu bfuVar = this.M.a;
            bfuVar.cC(bfl.a);
            bft.a(bfuVar, 0, obj);
            yjzVar.getClass();
            ylh.d(yjzVar, 2);
            bft.a(bfuVar, 1, yjzVar);
            return;
        }
        bee beeVar = this.u;
        beeVar.g();
        bfu bfuVar2 = beeVar.a.a;
        bfuVar2.cC(bfl.a);
        yjzVar.getClass();
        ylh.d(yjzVar, 2);
        bft.b(bfuVar2, 0, obj, 1, yjzVar);
    }

    @Override // defpackage.bao
    public final void j() {
        this.h = true;
        this.n = true;
        this.c.e();
        this.q.e();
        bdj bdjVar = this.r;
        bdg bdgVar = bdjVar.a;
        bdjVar.e = bdgVar.i;
        bdjVar.s = bdgVar.j;
    }

    @Override // defpackage.bao
    public final void k(yjk yjkVar) {
        aI();
        if (!this.w) {
            bau.i("createNode() can only be called when inserting");
        }
        int i = ((int[]) this.S.a)[r0.b - 1];
        bdj bdjVar = this.r;
        bac bacVarO = bdjVar.o(bdjVar.q);
        this.G++;
        bef befVar = this.M;
        bfu bfuVar = befVar.a;
        bfuVar.cC(beu.a);
        bft.a(bfuVar, 0, yjkVar);
        bfuVar.c[bfuVar.d - bfuVar.a[bfuVar.b - 1].b] = i;
        bft.a(bfuVar, 1, bacVarO);
        bfu bfuVar2 = befVar.b;
        bfuVar2.cC(bez.a);
        bfuVar2.c[bfuVar2.d - bfuVar2.a[bfuVar2.b - 1].b] = i;
        bft.a(bfuVar2, 0, bacVarO);
    }

    @Override // defpackage.bao
    public final void l(boolean z) {
        if (this.G != 0) {
            bau.i("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.w) {
            return;
        }
        if (!z) {
            aD();
            return;
        }
        bdf bdfVar = this.p;
        int i = bdfVar.f;
        int i2 = bdfVar.g;
        bee beeVar = this.u;
        beeVar.j(false);
        beeVar.a.a.cC(bel.a);
        bau.k(this.i, i, i2);
        this.p.u();
    }

    @Override // defpackage.bao
    public final void m() {
        aa();
        bcr bcrVarQ = Q();
        if (bcrVarQ == null || !bcrVarQ.k()) {
            return;
        }
        bcrVarQ.a |= 2;
    }

    @Override // defpackage.bao
    public final void n() {
        aa();
    }

    @Override // defpackage.bao
    public final void o() {
        at(true);
    }

    @Override // defpackage.bao
    public final void p() {
        aa();
    }

    @Override // defpackage.bao
    public final void q() {
        aa();
    }

    @Override // defpackage.bao
    public final void r() {
        if (this.k && this.p.h == this.l) {
            this.l = -1;
            this.k = false;
        }
        at(false);
    }

    @Override // defpackage.bao
    public final void s(yjk yjkVar) {
        bfu bfuVar = this.u.a.a;
        bfuVar.cC(bff.a);
        bft.a(bfuVar, 0, yjkVar);
    }

    @Override // defpackage.bao
    public final void t() {
        if (this.G != 0) {
            bau.i("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.w) {
            return;
        }
        bcr bcrVarQ = Q();
        if (bcrVarQ != null && !bcrVarQ.i()) {
            bcrVarQ.h(true);
        }
        if (this.i.isEmpty()) {
            aD();
        } else {
            ay();
        }
    }

    @Override // defpackage.bao
    public final void u() {
        ac(-127, null, 0, null);
    }

    @Override // defpackage.bao
    public final void v(int i, Object obj) {
        ac(i, obj, 0, null);
    }

    @Override // defpackage.bao
    public final void w() {
        ac(R.styleable.AppCompatTheme_windowMinWidthMinor, null, 1, null);
        this.I = true;
    }

    @Override // defpackage.bao
    public final void x(int i) {
        int i2;
        if (this.E != null) {
            ac(i, null, 0, null);
            return;
        }
        aJ();
        this.x = Long.rotateLeft(Long.rotateLeft(this.x, 3) ^ i, 3) ^ this.H;
        this.H++;
        bdf bdfVar = this.p;
        if (this.w) {
            bdfVar.q();
            this.r.K(i, ban.a);
            av(false, null);
            return;
        }
        if (bdfVar.a() == i && ((i2 = bdfVar.f) >= bdfVar.g || (bdfVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            bdfVar.v();
            av(false, null);
            return;
        }
        if (!bdfVar.A()) {
            int i3 = this.F;
            int i4 = bdfVar.f;
            az();
            this.u.l(i3, bdfVar.f());
            bau.k(this.i, i4, bdfVar.f);
        }
        bdfVar.q();
        this.w = true;
        this.y = null;
        au();
        bdj bdjVar = this.r;
        bdjVar.v();
        int i5 = bdjVar.o;
        bdjVar.K(i, ban.a);
        this.L = bdjVar.o(i5);
        av(false, null);
    }

    @Override // defpackage.bao
    public final void y(int i) {
        ac(i, null, 0, null);
    }

    @Override // defpackage.bao
    public final void z() {
        ac(R.styleable.AppCompatTheme_windowMinWidthMinor, null, 2, null);
        this.I = true;
    }
}
