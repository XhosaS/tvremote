package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alg {
    private anj A;
    public final akb a;
    public clx b;
    public boolean c;
    public boolean d = false;
    public boolean e;
    public final yow f;
    public brs g;
    public yjk h;
    public yjk i;
    public int j;
    public ws k;
    public final goe l;
    public final lhr m;
    public hp n;
    public cvw o;
    public final nxb p;
    private final bcb q;
    private final bcb r;
    private final bcb s;
    private final bcb t;
    private final bcb u;
    private final bcb v;
    private final bcb w;
    private final bcb x;
    private final bdy y;
    private final bcb z;

    public alg(akb akbVar, lhr lhrVar, clx clxVar, boolean z, boolean z2, nxb nxbVar, yow yowVar, goe goeVar) {
        this.a = akbVar;
        this.m = lhrVar;
        this.b = clxVar;
        this.c = z;
        this.e = z2;
        this.p = nxbVar;
        this.f = yowVar;
        this.l = goeVar;
        bcz bczVar = bcz.c;
        this.q = new bci(true, bczVar);
        long j = 9205357640488583168L;
        this.r = new bci(new bmx(j), bczVar);
        this.s = new bci(new bmx(j), bczVar);
        this.t = new bci(null, bczVar);
        this.u = new bci(akm.a, bczVar);
        this.v = new bci(false, bczVar);
        this.w = new bci(alh.a, bczVar);
        this.x = new bci(false, bczVar);
        this.j = -1;
        ajm ajmVar = new ajm(this, 7);
        ivx ivxVar = bdt.a;
        this.y = new bbh(ajmVar, null);
        this.z = new bci(null, bczVar);
    }

    private final long O() {
        bvc bvcVarJ = j();
        if (bvcVarJ != null) {
            return bty.r(bvcVarJ);
        }
        return 9205357640488583168L;
    }

    private final long P() {
        return ((bmx) this.s.a()).a;
    }

    private final long Q() {
        return ((bmx) this.r.a()).a;
    }

    private final void R(long j) {
        this.s.b(new bmx(j));
    }

    private final void S(long j) {
        this.r.b(new bmx(j));
    }

    public static final void v(yle yleVar, yle yleVar2, alg algVar) {
        if ((yleVar.a & 9223372034707292159L) != 9205357640488583168L) {
            yleVar.a = 9205357640488583168L;
            yleVar2.a = 9205357640488583168L;
            algVar.u();
        }
    }

    public static final void w(yle yleVar, alg algVar, yle yleVar2) {
        if ((yleVar.a & 9223372034707292159L) != 9205357640488583168L) {
            algVar.u();
            yleVar.a = 9205357640488583168L;
            yleVar2.a = 0L;
            algVar.j = -1;
        }
    }

    public final void A(afo afoVar) {
        this.t.b(afoVar);
    }

    public final void B(boolean z) {
        this.q.b(Boolean.valueOf(z));
    }

    public final void C(boolean z) {
        this.v.b(Boolean.valueOf(z));
    }

    public final void D(boolean z) {
        this.x.b(Boolean.valueOf(z));
    }

    public final void E(alh alhVar) {
        this.w.b(alhVar);
    }

    public final void F(afo afoVar, long j) {
        A(afoVar);
        R(j);
    }

    public final boolean G() {
        return this.c;
    }

    public final boolean H() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    public final boolean I() {
        return ((Boolean) this.q.a()).booleanValue();
    }

    public final boolean J(long j) {
        int iJ;
        int i;
        int iE;
        cgz cgzVarL = this.m.l();
        if (cgzVarL == null || (iJ = cgzVarL.j(j)) == -1) {
            return false;
        }
        akb akbVar = this.a;
        long jA = akbVar.a(iJ);
        long jC = akbVar.c(jA);
        if (chb.g(jA) && chb.g(jC)) {
            i = 1;
        } else if (chb.g(jA) || chb.g(jC)) {
            i = 4;
            if (chb.g(jA) && !chb.g(jC)) {
                i = 2;
            }
        } else {
            i = 3;
        }
        int i2 = i - 1;
        ajc ajcVar = null;
        if (i2 == 0) {
            iE = chb.e(jA);
        } else if (i2 != 1) {
            iE = (i2 == 3 || hu.y(j, cgzVarL.m(chb.e(jC)), cgzVarL.m(chb.a(jC))) < 0) ? chb.e(jA) : chb.a(jA);
        } else {
            ajcVar = hu.y(j, cgzVarL.m(chb.e(jC)), cgzVarL.m(chb.a(jC))) < 0 ? new ajc(1, 1) : new ajc(2, 2);
            iE = chb.e(jA);
        }
        long jN = ccf.N(iE, iE);
        if (a.s(jN, akbVar.d().d) && (ajcVar == null || yks.e(ajcVar, akbVar.f()))) {
            return false;
        }
        akbVar.k(jN);
        if (ajcVar != null) {
            akbVar.l(ajcVar);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long L(defpackage.ahx r17, int r18, int r19, boolean r20, defpackage.ams r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.L(ahx, int, int, boolean, ams, boolean):long");
    }

    public final cvw N() {
        return (cvw) this.z.a();
    }

    public final long a() {
        if ((P() & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return (Q() & 9223372034707292159L) == 9205357640488583168L ? hv.q(this.m, P()) : a.D(P(), a.at(Q(), O()));
    }

    public final long b(boolean z) {
        int iMax;
        cgz cgzVarL = this.m.l();
        if (cgzVarL == null) {
            return 0L;
        }
        long j = this.a.e().d;
        int iE = z ? chb.e(j) : chb.a(j);
        boolean zH = chb.h(j);
        if (cgzVarL.g(iE) >= cgzVarL.e()) {
            return 9205357640488583168L;
        }
        if (z) {
            if (zH) {
                zH = true;
                if (z) {
                }
            }
        } else {
            iMax = (z && zH) ? iE : Math.max(iE - 1, 0);
        }
        boolean z2 = cgzVarL.r(iMax) == cgzVarL.s(iE);
        cgh cghVar = cgzVarL.b;
        cghVar.j(iE);
        cgj cgjVar = (cgj) cghVar.h.get(iE == cghVar.h().a() ? yfm.q(cghVar.h) : ccf.R(cghVar.h, iE));
        float fC = cgjVar.g.c(cgjVar.e(iE), z2);
        long j2 = cgzVarL.c;
        return (Float.floatToRawIntBits(ykn.i(fC, 0.0f, (int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(ykn.i(cgzVarL.a(r2), 0.0f, (int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final afo c() {
        return (afo) this.t.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (defpackage.kv.L(defpackage.kv.K(r0), r4) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akf d(boolean r12) {
        /*
            r11 = this;
            akb r0 = r11.a
            ahx r0 = r0.e()
            bcb r1 = r11.v
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            akm r2 = r11.f()
            akm r3 = defpackage.akm.a
            afo r4 = r11.c()
            if (r1 == 0) goto L86
            if (r2 != r3) goto L86
            long r1 = r0.d
            boolean r1 = defpackage.chb.g(r1)
            if (r1 == 0) goto L86
            boolean r1 = r0.c()
            if (r1 == 0) goto L86
            int r0 = r0.a()
            if (r0 <= 0) goto L86
            afo r0 = defpackage.afo.a
            if (r4 == r0) goto L6b
            bit r1 = defpackage.bcm.t()
            if (r1 == 0) goto L43
            yjv r0 = r1.i()
            goto L44
        L43:
            r0 = 0
        L44:
            r2 = r0
            bit r3 = defpackage.bcm.u(r1)
            bmy r0 = r11.h()     // Catch: java.lang.Throwable -> L65
            long r4 = r0.a()     // Catch: java.lang.Throwable -> L65
            defpackage.bcm.z(r1, r3, r2)
            bvc r0 = r11.j()
            if (r0 == 0) goto L86
            bmy r0 = defpackage.kv.K(r0)
            boolean r0 = defpackage.kv.L(r0, r4)
            if (r0 == 0) goto L86
            goto L6b
        L65:
            r0 = move-exception
            r12 = r0
            defpackage.bcm.z(r1, r3, r2)
            throw r12
        L6b:
            akf r4 = new akf
            if (r12 == 0) goto L78
            bmy r12 = r11.h()
            long r0 = r12.a()
            goto L7d
        L78:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r6 = r0
            r9 = 1
            r10 = 0
            r5 = 1
            r8 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L86:
            akf r12 = defpackage.akf.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.d(boolean):akf");
    }

    public final akf e(boolean z, boolean z2) {
        bvc bvcVarJ;
        afo afoVar = z ? afo.b : afo.c;
        cgz cgzVarL = this.m.l();
        if (cgzVarL != null) {
            akb akbVar = this.a;
            long j = akbVar.e().d;
            if (!chb.g(j)) {
                long jB = b(z);
                if (f() == akm.a && ((c() == afoVar || ((bvcVarJ = j()) != null && kv.L(kv.K(bvcVarJ), jB))) && akbVar.e().c())) {
                    int iE = z ? chb.e(j) : Math.max(chb.a(j) - 1, 0);
                    boolean zH = chb.h(j);
                    int iR = cgzVarL.r(iE);
                    if (z2) {
                        bvc bvcVarJ2 = j();
                        if (bvcVarJ2 != null) {
                            jB = hv.l(jB, kv.K(bvcVarJ2));
                        }
                    } else {
                        jB = 9205357640488583168L;
                    }
                    long j2 = jB;
                    int iE2 = z ? chb.e(j) : chb.a(j);
                    float fC = 0.0f;
                    if (iE2 >= 0 && cgzVarL.a.a.a() != 0) {
                        cgh cghVar = cgzVarL.b;
                        int iMin = Math.min(cghVar.d(iE2), Math.min(cghVar.b - 1, cghVar.f - 1));
                        if (iE2 <= cghVar.c(iMin, false)) {
                            cghVar.k(iMin);
                            List list = cghVar.h;
                            cgj cgjVar = (cgj) list.get(ccf.S(list, iMin));
                            fC = cgjVar.g.b.c(cgjVar.f(iMin));
                        }
                    }
                    return new akf(true, j2, fC, iR, zH);
                }
            }
        }
        return akf.a;
    }

    public final akm f() {
        return (akm) this.u.a();
    }

    public final alh g() {
        return (alh) this.w.a();
    }

    public final bmy h() {
        cgz cgzVarL = this.m.l();
        if (cgzVarL != null) {
            long j = this.a.e().d;
            if (chb.g(j)) {
                bmy bmyVarM = cgzVarL.m(chb.e(j));
                float fFloor = (float) Math.floor(this.b.cr(2.0f));
                cmi cmiVar = cgzVarL.a.h;
                cmi cmiVar2 = cmi.a;
                float fG = ykn.g(fFloor, 1.0f);
                float f = cmiVar == cmiVar2 ? bmyVarM.b + (fG / 2.0f) : bmyVarM.d - (fG / 2.0f);
                long j2 = cgzVarL.c;
                float f2 = fG / 2.0f;
                int i = ((int) fG) % 2;
                double dG = ykn.g(ykn.h(f, ((int) (j2 >> 32)) - f2), f2);
                float fFloor2 = i == 1 ? ((float) Math.floor(dG)) + 0.5f : (float) Math.rint(dG);
                return new bmy(fFloor2 - f2, bmyVarM.c, fFloor2 + f2, bmyVarM.e);
            }
        }
        return bmy.a;
    }

    public final bmy i() {
        return (bmy) this.y.a();
    }

    public final bvc j() {
        bvc bvcVarK = this.m.k();
        if (bvcVarK == null || !bvcVarK.s()) {
            return null;
        }
        return bvcVarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(boolean r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.akp
            if (r0 == 0) goto L13
            r0 = r8
            akp r0 = (defpackage.akp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akp r0 = new akp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r7 = r0.a
            defpackage.ybn.f(r8)
            goto L64
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
            akb r8 = r6.a
            ahx r8 = r8.e()
            long r4 = r8.d
            boolean r2 = defpackage.chb.g(r4)
            if (r2 == 0) goto L43
            goto L6e
        L43:
            cfy r2 = new cfy
            java.lang.CharSequence r8 = defpackage.ht.n(r8)
            java.lang.String r8 = r8.toString()
            r2.<init>(r8)
            cvw r8 = r6.o
            if (r8 == 0) goto L64
            cvw r2 = defpackage.a.bJ(r2)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.r(r2)
            if (r8 == r1) goto L63
            goto L64
        L63:
            return r1
        L64:
            if (r7 == 0) goto L6e
            akb r7 = r6.a
            r7.g()
            ygi r7 = defpackage.ygi.a
            return r7
        L6e:
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.k(boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.akr
            if (r0 == 0) goto L13
            r0 = r7
            akr r0 = (defpackage.akr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akr r0 = new akr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.ybn.f(r7)
            akb r7 = r6.a
            ahx r7 = r7.e()
            long r4 = r7.d
            boolean r2 = defpackage.chb.g(r4)
            if (r2 == 0) goto L43
            ygi r7 = defpackage.ygi.a
            return r7
        L43:
            cfy r2 = new cfy
            java.lang.CharSequence r7 = defpackage.ht.n(r7)
            java.lang.String r7 = r7.toString()
            r2.<init>(r7)
            cvw r7 = r6.o
            if (r7 == 0) goto L61
            cvw r2 = defpackage.a.bJ(r2)
            r0.c = r3
            java.lang.Object r7 = r7.r(r2)
            if (r7 != r1) goto L61
            return r1
        L61:
            akb r7 = r6.a
            r7.h()
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.l(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.bte r14, defpackage.yih r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.aks
            if (r0 == 0) goto L13
            r0 = r15
            aks r0 = (defpackage.aks) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aks r0 = new aks
            r0.<init>(r13, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            yle r14 = r6.e
            yle r1 = r6.d
            defpackage.ybn.f(r15)     // Catch: java.lang.Throwable -> L2c
            goto L82
        L2c:
            r0 = move-exception
            r15 = r0
            goto L91
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            defpackage.ybn.f(r15)
            yle r8 = new yle
            r8.<init>()
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r8.a = r3
            yle r9 = new yle
            r9.<init>()
            r9.a = r3
            gk r7 = new gk     // Catch: java.lang.Throwable -> L8c
            r11 = 7
            r12 = 0
            r10 = r9
            r9 = r13
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L89
            r15 = r7
            r9 = r10
            bg r3 = new bg     // Catch: java.lang.Throwable -> L8c
            r11 = 7
            r12 = 0
            r10 = r13
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8c
            bg r4 = new bg     // Catch: java.lang.Throwable -> L8c
            r11 = 8
            r12 = 0
            r10 = r13
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8c
            vi r5 = new vi     // Catch: java.lang.Throwable -> L8c
            r1 = 2
            r5.<init>(r9, r13, r8, r1)     // Catch: java.lang.Throwable -> L8c
            r6.d = r8     // Catch: java.lang.Throwable -> L8c
            r6.e = r9     // Catch: java.lang.Throwable -> L8c
            r6.c = r2     // Catch: java.lang.Throwable -> L8c
            r1 = r14
            r2 = r15
            java.lang.Object r14 = defpackage.kv.o(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8c
            if (r14 == r0) goto L88
            r1 = r8
            r14 = r9
        L82:
            v(r1, r14, r13)
            ygi r14 = defpackage.ygi.a
            return r14
        L88:
            return r0
        L89:
            r0 = move-exception
            r9 = r10
            goto L8d
        L8c:
            r0 = move-exception
        L8d:
            r14 = r0
            r15 = r14
            r1 = r8
            r14 = r9
        L91:
            v(r1, r14, r13)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.m(bte, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.bte r15, final boolean r16, defpackage.yih r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.n(bte, boolean, yih):java.lang.Object");
    }

    public final Object o(bte bteVar, yih yihVar) {
        Object objP = bteVar.p(new akx(this, (yih) null, 0), yihVar);
        return objP == yio.a ? objP : ygi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (q(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (q(r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.akz
            if (r0 == 0) goto L13
            r0 = r7
            akz r0 = (defpackage.akz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akz r0 = new akz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L38
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r7)
            goto L58
        L38:
            defpackage.ybn.f(r7)
            goto L9a
        L3c:
            defpackage.ybn.f(r7)
            yjk r7 = r6.i
            if (r7 == 0) goto L91
            java.lang.Object r2 = r7.a()
            if (r2 != 0) goto L4a
            goto L91
        L4a:
            cvw r7 = r6.o
            if (r7 == 0) goto L85
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.q()
            if (r7 == r1) goto L99
        L58:
            cvw r7 = (defpackage.cvw) r7
            if (r7 != 0) goto L5d
            goto L85
        L5d:
            java.lang.Object r7 = r7.a
            android.content.ClipData r7 = (android.content.ClipData) r7
            r7.getDescription()
            sp r2 = (defpackage.sp) r2
            so r7 = r2.a()
            cb r7 = r7.c()
            if (r7 == 0) goto L9a
            java.lang.Object r7 = r7.a
            cvw r7 = (defpackage.cvw) r7
            java.lang.String r1 = defpackage.hw.G(r7)
            if (r1 == 0) goto L9a
            akb r0 = r6.a
            r4 = 0
            r5 = 10
            r2 = 0
            r3 = 3
            defpackage.akb.o(r0, r1, r2, r3, r4, r5)
            goto L9a
        L85:
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r6.q(r0)
            if (r7 != r1) goto L9a
            goto L99
        L91:
            r0.d = r5
            java.lang.Object r7 = r6.q(r0)
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.p(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r7 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ala
            if (r0 == 0) goto L13
            r0 = r7
            ala r0 = (defpackage.ala) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ala r0 = new ala
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.ybn.f(r7)
            goto L45
        L36:
            defpackage.ybn.f(r7)
            cvw r7 = r6.o
            if (r7 == 0) goto L79
            r0.c = r4
            java.lang.Object r7 = r7.q()
            if (r7 == r1) goto L78
        L45:
            cvw r7 = (defpackage.cvw) r7
            if (r7 == 0) goto L79
            r0.c = r3
            java.lang.Object r7 = r7.a
            android.content.ClipData r7 = (android.content.ClipData) r7
            r0 = 0
            android.content.ClipData$Item r7 = r7.getItemAt(r0)
            r0 = 0
            if (r7 == 0) goto L62
            java.lang.CharSequence r7 = r7.getText()
            if (r7 == 0) goto L62
            java.lang.String r7 = r7.toString()
            goto L63
        L62:
            r7 = r0
        L63:
            if (r7 == r1) goto L78
        L65:
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L6b
            goto L79
        L6b:
            akb r0 = r6.a
            r4 = 0
            r5 = 10
            r2 = 0
            r3 = 3
            defpackage.akb.o(r0, r1, r2, r3, r4, r5)
            ygi r7 = defpackage.ygi.a
            return r7
        L78:
            return r1
        L79:
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.q(yih):java.lang.Object");
    }

    public final Object r(bte bteVar, boolean z, yih yihVar) {
        Object objK = yoz.k(new alc(this, bteVar, z, null), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ald
            if (r0 == 0) goto L13
            r0 = r6
            ald r0 = (defpackage.ald) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ald r0 = new ald
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L28
            goto L44
        L28:
            r6 = move-exception
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.ybn.f(r6)
            ale r6 = new ale     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r6.<init>(r5, r2, r4)     // Catch: java.lang.Throwable -> L28
            r0.c = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = defpackage.yoz.k(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L44
            return r1
        L44:
            yqe r6 = (defpackage.yqe) r6     // Catch: java.lang.Throwable -> L28
            r5.C(r4)
            alh r6 = r5.g()
            alh r0 = defpackage.alh.a
            if (r6 == r0) goto L54
            r5.x()
        L54:
            ygi r6 = defpackage.ygi.a
            return r6
        L57:
            r5.C(r4)
            alh r0 = r5.g()
            alh r1 = defpackage.alh.a
            if (r0 != r1) goto L63
            goto L66
        L63:
            r5.x()
        L66:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.s(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.alf
            if (r0 == 0) goto L13
            r0 = r5
            alf r0 = (defpackage.alf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alf r0 = new alf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            alg r0 = r0.d
            defpackage.ybn.f(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ybn.f(r5)
            cvw r5 = r4.o
            if (r5 == 0) goto L47
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.q()
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            cvw r5 = (defpackage.cvw) r5
            goto L49
        L47:
            r5 = 0
            r0 = r4
        L49:
            bcb r0 = r0.z
            r0.b(r5)
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.t(yih):java.lang.Object");
    }

    public final void u() {
        A(null);
        R(9205357640488583168L);
        S(9205357640488583168L);
    }

    public final void x() {
        ahi ahiVar;
        yqe yqeVar;
        Object obj = this.p.a;
        if (obj == null || (yqeVar = (ahiVar = (ahi) obj).c) == null) {
            return;
        }
        yqeVar.t(null);
        ahiVar.c = null;
    }

    public final void y() {
        S(O());
    }

    public final void z(akm akmVar) {
        this.u.b(akmVar);
    }
}
