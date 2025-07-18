package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yrv implements yrz {
    public final ynt a;
    public final ynt b;
    public final ynu c;
    public final ynu d;
    private final int f;
    private final ynt g;
    private final ynt h;
    private final ynu i;
    private final ynu j;
    private final ynu k;

    public yrv(int i) {
        this.f = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.cd(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        ynv ynvVar = ynv.a;
        this.a = new ynt(0L, ynvVar);
        this.b = new ynt(0L, ynvVar);
        yse yseVar = yrx.a;
        this.g = new ynt(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, ynvVar);
        this.h = new ynt(G(), ynvVar);
        yse yseVar2 = new yse(0L, null, this, 3);
        this.c = new ynu(yseVar2, ynvVar);
        this.d = new ynu(yseVar2, ynvVar);
        if (R()) {
            yseVar2 = yrx.a;
            yseVar2.getClass();
        }
        this.i = new ynu(yseVar2, ynvVar);
        this.j = new ynu(yrx.s, ynvVar);
        this.k = new ynu(null, ynvVar);
    }

    public static final void E(yri yriVar, yse yseVar, int i) {
        yriVar.A(yseVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int F(defpackage.yse r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L35
            boolean r0 = r5.O(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            yxo r0 = defpackage.yrx.d
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r6 = 3
            return r6
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L29:
            yxo r0 = defpackage.yrx.j
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L35:
            yxo r4 = defpackage.yrx.e
            if (r0 != r4) goto L42
            yxo r1 = defpackage.yrx.d
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            yxo r9 = defpackage.yrx.k
            r10 = 5
            if (r0 == r9) goto L7e
            yxo r11 = defpackage.yrx.h
            if (r0 == r11) goto L7a
            yxo r11 = defpackage.yrx.l
            if (r0 != r11) goto L56
            r6.g(r7)
            r5.f()
            return r1
        L56:
            boolean r11 = defpackage.yoy.a
            r6.g(r7)
            boolean r11 = r0 instanceof defpackage.yso
            if (r11 == 0) goto L63
            yso r0 = (defpackage.yso) r0
            yri r0 = r0.a
        L63:
            boolean r8 = W(r0, r8)
            if (r8 == 0) goto L6f
            yxo r8 = defpackage.yrx.i
            r6.j(r7, r8)
            return r2
        L6f:
            java.lang.Object r8 = r6.b(r7, r9)
            if (r8 != r9) goto L76
            return r10
        L76:
            r6.h(r7, r3)
            return r10
        L7a:
            r6.g(r7)
            return r10
        L7e:
            r6.g(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.F(yse, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long G() {
        return this.g.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r1 = (defpackage.yse) r1.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.yse H(long r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.H(long):yse");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
    
        J(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.I():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        ynt yntVar = this.h;
        if ((yntVar.a(j) & 4611686018427387904L) != 0) {
            while ((yntVar.b & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(long r5, defpackage.yse r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ywp r0 = r7.n()
            yse r0 = (defpackage.yse) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.u()
            if (r5 == 0) goto L22
            ywp r5 = r7.n()
            yse r5 = (defpackage.yse) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            ynu r5 = r4.i
        L24:
            java.lang.Object r6 = r5.a
            ywp r6 = (defpackage.ywp) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r7.v()
            if (r0 == 0) goto L11
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L47
            boolean r5 = r6.t()
            if (r5 == 0) goto L46
            r6.q()
        L46:
            return
        L47:
            boolean r6 = r7.t()
            if (r6 == 0) goto L24
            r7.q()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.K(long, yse):void");
    }

    private final void L(yri yriVar) {
        N(yriVar, true);
    }

    private final void M(yri yriVar) {
        N(yriVar, false);
    }

    private final void N(yri yriVar, boolean z) {
        if (yriVar instanceof yrs) {
            throw null;
        }
        if (yriVar instanceof yoe) {
            ((yih) yriVar).resumeWith(ybn.e(z ? p() : q()));
            return;
        }
        if (yriVar instanceof ysl) {
            ((ysl) yriVar).a.resumeWith(new ysd(new ysb(o())));
            return;
        }
        if (!(yriVar instanceof yrr)) {
            if (!(yriVar instanceof yyi)) {
                Objects.toString(yriVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(yriVar)));
            }
            yse yseVar = yrx.a;
            throw null;
        }
        yrr yrrVar = (yrr) yriVar;
        yof yofVar = yrrVar.b;
        yofVar.getClass();
        yrrVar.b = null;
        yrrVar.a = yrx.l;
        Throwable thO = yrrVar.c.o();
        if (thO == null) {
            yofVar.resumeWith(false);
            return;
        }
        if (yoy.b) {
            thO = yxn.a(thO, yofVar);
        }
        yofVar.resumeWith(ybn.e(thO));
    }

    private final boolean O(long j) {
        return j < G() || j < g() + ((long) this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
    
        r10 = (defpackage.yse) r10.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean P(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.P(long, boolean):boolean");
    }

    private final boolean Q(long j) {
        return P(j, true);
    }

    private final boolean R() {
        long jG = G();
        return jG == 0 || jG == Long.MAX_VALUE;
    }

    private final Object S(yih yihVar) {
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        Throwable thQ = q();
        if (yoy.b) {
            thQ = yxn.a(thQ, yofVar);
        }
        yofVar.resumeWith(ybn.e(thQ));
        Object objI = yofVar.i();
        yio yioVar = yio.a;
        if (objI == yioVar) {
            yihVar.getClass();
        }
        return objI == yioVar ? objI : ygi.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(yoe yoeVar) {
        Throwable thQ = q();
        if (yoy.b) {
            thQ = yxn.a(thQ, yoeVar);
        }
        yoeVar.resumeWith(ybn.e(thQ));
    }

    private static final void U(yri yriVar, yse yseVar, int i) {
        yriVar.A(yseVar, i + yrx.b);
    }

    private static final boolean V(Object obj) {
        if (obj instanceof yoe) {
            obj.getClass();
            return yrx.c((yoe) obj, ygi.a);
        }
        if (obj instanceof yyi) {
            obj.getClass();
            throw null;
        }
        if (obj instanceof yrs) {
            throw null;
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
    }

    private static final boolean W(Object obj, Object obj2) {
        if (obj instanceof yyi) {
            throw null;
        }
        if (obj instanceof ysl) {
            obj.getClass();
            return yrx.c(((ysl) obj).a, new ysd(obj2));
        }
        if (!(obj instanceof yrr)) {
            if (obj instanceof yoe) {
                obj.getClass();
                return yrx.c((yoe) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        yrr yrrVar = (yrr) obj;
        yof yofVar = yrrVar.b;
        yofVar.getClass();
        yrrVar.b = null;
        yrrVar.a = obj2;
        return yrx.c(yofVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object k(defpackage.yrv r13, defpackage.yih r14) {
        /*
            boolean r0 = r14 instanceof defpackage.yrt
            if (r0 == 0) goto L13
            r0 = r14
            yrt r0 = (defpackage.yrt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yrt r0 = new yrt
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            defpackage.ybn.f(r14)
            ysd r14 = (defpackage.ysd) r14
            java.lang.Object r13 = r14.b
            return r13
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.ybn.f(r14)
            ynu r14 = r13.d
            java.lang.Object r14 = r14.a
            yse r14 = (defpackage.yse) r14
        L3d:
            boolean r1 = r13.y()
            if (r1 == 0) goto L4d
            java.lang.Throwable r13 = r13.o()
            ysb r14 = new ysb
            r14.<init>(r13)
            return r14
        L4d:
            ynt r1 = r13.b
            long r4 = r1.b()
            int r1 = defpackage.yrx.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L69
            yse r1 = r13.r(r9, r14)
            if (r1 == 0) goto L3d
            r8 = r1
            goto L6a
        L69:
            r8 = r14
        L6a:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.n(r8, r9, r10, r12)
            r1 = r7
            yxo r14 = defpackage.yrx.m
            if (r13 == r14) goto L9c
            yxo r14 = defpackage.yrx.o
            if (r13 != r14) goto L89
            long r13 = r1.h()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L86
            r8.p()
        L86:
            r13 = r1
            r14 = r8
            goto L3d
        L89:
            yxo r14 = defpackage.yrx.n
            if (r13 != r14) goto L98
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.l(r2, r3, r4, r6)
            if (r13 != r0) goto L97
            return r0
        L97:
            return r13
        L98:
            r8.p()
            return r13
        L9c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.k(yrv, yih):java.lang.Object");
    }

    protected boolean A() {
        return false;
    }

    @Override // defpackage.ysm
    public final boolean B() {
        return (y() || x() || y()) ? false : true;
    }

    @Override // defpackage.ysm
    public final yrr C() {
        return new yrr(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135 A[RETURN] */
    @Override // defpackage.ysn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r23, defpackage.yih r24) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.a(java.lang.Object, yih):java.lang.Object");
    }

    @Override // defpackage.ysn
    public Object b(Object obj) {
        yse yseVar;
        ynt yntVar = this.a;
        long j = yntVar.b;
        if (!z(j) && !O(j & 1152921504606846975L)) {
            return ysd.a;
        }
        ynu ynuVar = this.c;
        yxo yxoVar = yrx.j;
        yse yseVar2 = (yse) ynuVar.a;
        while (true) {
            long jB = yntVar.b();
            long j2 = jB & 1152921504606846975L;
            boolean z = z(jB);
            long j3 = yrx.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (yseVar2.b != j4) {
                yse yseVarS = s(j4, yseVar2);
                if (yseVarS != null) {
                    yseVar = yseVarS;
                } else if (z) {
                    return new ysb(q());
                }
            } else {
                yseVar = yseVar2;
            }
            Object obj2 = obj;
            int iC = c(yseVar, i, obj2, j2, yxoVar, z);
            yseVar2 = yseVar;
            if (iC == 0) {
                yseVar2.p();
                return ygi.a;
            }
            if (iC == 1) {
                return ygi.a;
            }
            if (iC == 2) {
                if (z) {
                    yseVar2.s();
                    return new ysb(q());
                }
                yseVar2.s();
                return ysd.a;
            }
            if (iC == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iC == 4) {
                if (j2 < g()) {
                    yseVar2.p();
                }
                return new ysb(q());
            }
            yseVar2.p();
            obj = obj2;
        }
    }

    public final int c(yse yseVar, int i, Object obj, long j, Object obj2, boolean z) {
        yseVar.i(i, obj);
        if (z) {
            return F(yseVar, i, obj, j, obj2, true);
        }
        Object objD = yseVar.d(i);
        if (objD == null) {
            if (O(j)) {
                if (yseVar.k(i, null, yrx.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (yseVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof yri) {
            yseVar.g(i);
            if (W(objD, obj)) {
                yseVar.j(i, yrx.i);
                return 0;
            }
            yxo yxoVar = yrx.k;
            if (yseVar.b(i, yxoVar) == yxoVar) {
                return 5;
            }
            yseVar.h(i, true);
            return 5;
        }
        return F(yseVar, i, obj, j, obj2, false);
    }

    @Override // defpackage.ysn
    public final boolean e(Throwable th) {
        return w(th, false);
    }

    @Override // defpackage.ysn
    public final void eL(yjv yjvVar) {
        yxo yxoVar;
        ynu ynuVar = this.k;
        if (ynuVar.d(null, yjvVar)) {
            return;
        }
        do {
            Object obj = ynuVar.a;
            yxoVar = yrx.q;
            if (obj != yxoVar) {
                if (obj == yrx.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!ynuVar.d(yxoVar, yrx.r));
        yjvVar.a(o());
    }

    @Override // defpackage.ysn
    public final boolean f() {
        return z(this.a.b);
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.a.b & 1152921504606846975L;
    }

    @Override // defpackage.ysm
    public final Object i(yih yihVar) throws Throwable {
        yse yseVarR;
        yrv yrvVar = this;
        ynu ynuVar = yrvVar.d;
        yse yseVar = (yse) ynuVar.a;
        while (!yrvVar.y()) {
            ynt yntVar = yrvVar.b;
            long jB = yntVar.b();
            long j = yrx.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (yseVar.b != j2) {
                yse yseVarR2 = yrvVar.r(j2, yseVar);
                if (yseVarR2 != null) {
                    yseVar = yseVarR2;
                } else {
                    continue;
                }
            }
            Object objN = yrvVar.n(yseVar, i, jB, null);
            yxo yxoVar = yrx.m;
            if (objN == yxoVar) {
                throw new IllegalStateException("unexpected");
            }
            yxo yxoVar2 = yrx.o;
            if (objN != yxoVar2) {
                yxo yxoVar3 = yrx.n;
                if (objN != yxoVar3) {
                    yseVar.p();
                    return objN;
                }
                yof yofVarO = yks.o(wcq.S(yihVar));
                yrv yrvVar2 = this;
                try {
                    Object objN2 = yrvVar2.n(yseVar, i, jB, yofVarO);
                    if (objN2 == yxoVar) {
                        E(yofVarO, yseVar, i);
                    } else if (objN2 == yxoVar2) {
                        if (jB < yrvVar2.h()) {
                            yseVar.p();
                        }
                        yse yseVar2 = (yse) ynuVar.a;
                        while (true) {
                            if (yrvVar2.y()) {
                                yofVarO.resumeWith(ybn.e(yrvVar2.p()));
                                break;
                            }
                            long jB2 = yntVar.b();
                            long j3 = jB2 / j;
                            int i2 = (int) (jB2 % j);
                            if (yseVar2.b != j3) {
                                yseVarR = yrvVar2.r(j3, yseVar2);
                                if (yseVarR == null) {
                                    continue;
                                }
                            } else {
                                yseVarR = yseVar2;
                            }
                            Object objN3 = yrvVar2.n(yseVarR, i2, jB2, yofVarO);
                            if (objN3 == yxoVar) {
                                E(yofVarO, yseVarR, i2);
                                break;
                            }
                            if (objN3 == yxoVar2) {
                                if (jB2 < h()) {
                                    yseVarR.p();
                                }
                                yrvVar2 = this;
                                yseVar2 = yseVarR;
                            } else {
                                if (objN3 == yxoVar3) {
                                    throw new IllegalStateException("unexpected");
                                }
                                yseVarR.p();
                                yofVarO.c(objN3, null);
                            }
                        }
                    } else {
                        yseVar.p();
                        yofVarO.c(objN2, null);
                    }
                    Object objI = yofVarO.i();
                    yio yioVar = yio.a;
                    return objI;
                } catch (Throwable th) {
                    yofVarO.x();
                    throw th;
                }
            }
            if (jB < h()) {
                yseVar.p();
            }
            yrvVar = this;
        }
        throw yxn.b(p());
    }

    @Override // defpackage.ysm
    public final Object j(yih yihVar) {
        return k(this, yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.yse r17, int r18, long r19, defpackage.yih r21) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.l(yse, int, long, yih):java.lang.Object");
    }

    @Override // defpackage.ysm
    public final Object m() {
        yse yseVar;
        ynt yntVar = this.b;
        long j = yntVar.b;
        long j2 = this.a.b;
        if (Q(j2)) {
            return new ysb(o());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return ysd.a;
        }
        ynu ynuVar = this.d;
        yxo yxoVar = yrx.k;
        yse yseVar2 = (yse) ynuVar.a;
        while (!y()) {
            long jB = yntVar.b();
            long j3 = yrx.b;
            long j4 = jB / j3;
            int i = (int) (jB % j3);
            if (yseVar2.b != j4) {
                yse yseVarR = r(j4, yseVar2);
                if (yseVarR != null) {
                    yseVar = yseVarR;
                } else {
                    continue;
                }
            } else {
                yseVar = yseVar2;
            }
            Object objN = n(yseVar, i, jB, yxoVar);
            yse yseVar3 = yseVar;
            if (objN == yrx.m) {
                v(jB);
                yseVar3.s();
                return ysd.a;
            }
            if (objN != yrx.o) {
                if (objN == yrx.n) {
                    throw new IllegalStateException("unexpected");
                }
                yseVar3.p();
                return objN;
            }
            if (jB < h()) {
                yseVar3.p();
            }
            yseVar2 = yseVar3;
        }
        return new ysb(o());
    }

    public final Object n(yse yseVar, int i, long j, Object obj) {
        Object objD = yseVar.d(i);
        if (objD == null) {
            if (j >= (this.a.b & 1152921504606846975L)) {
                if (obj == null) {
                    return yrx.n;
                }
                if (yseVar.k(i, null, obj)) {
                    I();
                    return yrx.m;
                }
            }
        } else if (objD == yrx.d && yseVar.k(i, objD, yrx.i)) {
            I();
            return yseVar.e(i);
        }
        while (true) {
            Object objD2 = yseVar.d(i);
            if (objD2 == null || objD2 == yrx.e) {
                if (j < (this.a.b & 1152921504606846975L)) {
                    if (yseVar.k(i, objD2, yrx.h)) {
                        I();
                        return yrx.o;
                    }
                } else {
                    if (obj == null) {
                        return yrx.n;
                    }
                    if (yseVar.k(i, objD2, obj)) {
                        I();
                        return yrx.m;
                    }
                }
            } else if (objD2 != yrx.d) {
                yxo yxoVar = yrx.j;
                if (objD2 == yxoVar) {
                    return yrx.o;
                }
                if (objD2 == yrx.h) {
                    return yrx.o;
                }
                if (objD2 == yrx.l) {
                    I();
                    return yrx.o;
                }
                if (objD2 != yrx.g && yseVar.k(i, objD2, yrx.f)) {
                    boolean z = objD2 instanceof yso;
                    if (z) {
                        objD2 = ((yso) objD2).a;
                    }
                    if (V(objD2)) {
                        yseVar.j(i, yrx.i);
                        I();
                        return yseVar.e(i);
                    }
                    yseVar.j(i, yxoVar);
                    yseVar.h(i, false);
                    if (z) {
                        I();
                    }
                    return yrx.o;
                }
            } else if (yseVar.k(i, objD2, yrx.i)) {
                I();
                return yseVar.e(i);
            }
        }
    }

    protected final Throwable o() {
        return (Throwable) this.j.a;
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new ysf() : thO;
    }

    protected final Throwable q() {
        Throwable thO = o();
        return thO == null ? new ysg("Channel was closed") : thO;
    }

    public final yse r(long j, yse yseVar) {
        Object objA;
        long j2;
        long j3;
        yse yseVar2 = yrx.a;
        yrw yrwVar = yrw.a;
        loop0: while (true) {
            objA = ywo.a(yseVar, j, yrwVar);
            if (!yxm.a(objA)) {
                ywp ywpVarB = yxm.b(objA);
                while (true) {
                    ynu ynuVar = this.d;
                    ywp ywpVar = (ywp) ynuVar.a;
                    if (ywpVar.b >= ywpVarB.b) {
                        break loop0;
                    }
                    if (ywpVarB.v()) {
                        if (ynuVar.d(ywpVar, ywpVarB)) {
                            if (ywpVar.t()) {
                                ywpVar.q();
                            }
                        } else if (ywpVarB.t()) {
                            ywpVarB.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (yxm.a(objA)) {
            f();
            if (yseVar.b * yrx.b >= h()) {
                return null;
            }
            yseVar.p();
            return null;
        }
        yse yseVar3 = (yse) yxm.b(objA);
        if (!R() && j <= G() / yrx.b) {
            ynu ynuVar2 = this.i;
            while (true) {
                ywp ywpVar2 = (ywp) ynuVar2.a;
                if (ywpVar2.b >= yseVar3.b || !yseVar3.v()) {
                    break;
                }
                if (ynuVar2.d(ywpVar2, yseVar3)) {
                    if (ywpVar2.t()) {
                        ywpVar2.q();
                    }
                } else if (yseVar3.t()) {
                    yseVar3.q();
                }
            }
        }
        long j4 = yseVar3.b;
        if (j4 <= j) {
            boolean z = yoy.a;
            return yseVar3;
        }
        long j5 = yrx.b;
        ynt yntVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = yntVar.b;
            if (j3 >= j2) {
                break;
            }
        } while (!yntVar.c(j3, j2));
        if (j2 >= h()) {
            return null;
        }
        yseVar3.p();
        return null;
    }

    public final yse s(long j, yse yseVar) {
        Object objA;
        long j2;
        long j3;
        long j4;
        yse yseVar2 = yrx.a;
        yrw yrwVar = yrw.a;
        loop0: while (true) {
            objA = ywo.a(yseVar, j, yrwVar);
            if (!yxm.a(objA)) {
                ywp ywpVarB = yxm.b(objA);
                while (true) {
                    ynu ynuVar = this.c;
                    ywp ywpVar = (ywp) ynuVar.a;
                    if (ywpVar.b >= ywpVarB.b) {
                        break loop0;
                    }
                    if (ywpVarB.v()) {
                        if (ynuVar.d(ywpVar, ywpVarB)) {
                            if (ywpVar.t()) {
                                ywpVar.q();
                            }
                        } else if (ywpVarB.t()) {
                            ywpVarB.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (yxm.a(objA)) {
            f();
            if (yseVar.b * yrx.b >= g()) {
                return null;
            }
            yseVar.p();
            return null;
        }
        yse yseVar3 = (yse) yxm.b(objA);
        long j5 = yseVar3.b;
        if (j5 <= j) {
            boolean z = yoy.a;
            return yseVar3;
        }
        long j6 = yrx.b;
        ynt yntVar = this.a;
        do {
            j2 = j5 * j6;
            j3 = yntVar.b;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!yntVar.c(j3, yrx.b(j4, (int) (j3 >> 60))));
        if (j2 >= g()) {
            return null;
        }
        yseVar3.p();
        return null;
    }

    @Override // defpackage.ysm
    public final void t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        w(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        r4 = (defpackage.yse) r4.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        if (r4 != null) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.toString():java.lang.String");
    }

    protected final void u(long j) {
        yse yseVar;
        boolean z = yoy.a;
        yse yseVar2 = (yse) this.d.a;
        while (true) {
            ynt yntVar = this.b;
            int i = this.f;
            long j2 = yntVar.b;
            if (j < Math.max(i + j2, G())) {
                return;
            }
            if (yntVar.c(j2, 1 + j2)) {
                long j3 = yrx.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (yseVar2.b != j4) {
                    yse yseVarR = r(j4, yseVar2);
                    if (yseVarR != null) {
                        yseVar = yseVarR;
                    }
                } else {
                    yseVar = yseVar2;
                }
                if (n(yseVar, i2, j2, null) != yrx.o || j2 < h()) {
                    yseVar.p();
                }
                yseVar2 = yseVar;
            }
        }
    }

    public final void v(long j) {
        long j2;
        long j3;
        if (R()) {
            return;
        }
        while (G() <= j) {
        }
        int i = yrx.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jG = G();
            if (jG == (4611686018427387903L & this.h.b) && jG == G()) {
                return;
            }
        }
        ynt yntVar = this.h;
        do {
            j2 = yntVar.b;
        } while (!yntVar.c(j2, yrx.a(j2 & 4611686018427387903L, true)));
        while (true) {
            long jG2 = G();
            long j4 = yntVar.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = 4611686018427387904L & j4;
            if (jG2 == j5 && jG2 == G()) {
                break;
            } else if (j6 == 0) {
                yntVar.c(j4, yrx.a(j5, true));
            }
        }
        do {
            j3 = yntVar.b;
        } while (!yntVar.c(j3, yrx.a(j3 & 4611686018427387903L, false)));
    }

    protected final boolean w(Throwable th, boolean z) {
        long j;
        long jB;
        Object obj;
        long j2;
        long j3;
        if (z) {
            ynt yntVar = this.a;
            do {
                j3 = yntVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!yntVar.c(j3, yrx.b(j3 & 1152921504606846975L, 1)));
        }
        boolean zD = this.j.d(yrx.s, th);
        if (z) {
            ynt yntVar2 = this.a;
            do {
                j2 = yntVar2.b;
            } while (!yntVar2.c(j2, yrx.b(j2 & 1152921504606846975L, 3)));
        } else {
            ynt yntVar3 = this.a;
            do {
                j = yntVar3.b;
                int i = (int) (j >> 60);
                if (i == 0) {
                    jB = yrx.b(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    jB = yrx.b(j & 1152921504606846975L, 3);
                }
            } while (!yntVar3.c(j, jB));
        }
        f();
        if (zD) {
            ynu ynuVar = this.k;
            do {
                obj = ynuVar.a;
            } while (!ynuVar.d(obj, obj == null ? yrx.q : yrx.r));
            if (obj != null) {
                ylh.d(obj, 1);
                ((yjv) obj).a(o());
                return true;
            }
        }
        return zD;
    }

    public final boolean x() {
        while (true) {
            ynu ynuVar = this.d;
            yse yseVarR = (yse) ynuVar.a;
            long jG = g();
            if (h() <= jG) {
                return false;
            }
            long j = yrx.b;
            long j2 = jG / j;
            if (yseVarR.b == j2 || (yseVarR = r(j2, yseVarR)) != null) {
                yseVarR.p();
                int i = (int) (jG % j);
                while (true) {
                    Object objD = yseVarR.d(i);
                    if (objD == null || objD == yrx.e) {
                        if (yseVarR.k(i, objD, yrx.h)) {
                            I();
                            break;
                        }
                    } else {
                        if (objD == yrx.d) {
                            return true;
                        }
                        if (objD != yrx.j && objD != yrx.l && objD != yrx.i && objD != yrx.h) {
                            if (objD == yrx.g) {
                                return true;
                            }
                            if (objD != yrx.f && jG == g()) {
                                return true;
                            }
                        }
                    }
                }
                this.b.c(jG, 1 + jG);
            } else if (((yse) ynuVar.a).b < j2) {
                return false;
            }
        }
    }

    public final boolean y() {
        return Q(this.a.b);
    }

    public final boolean z(long j) {
        return P(j, false);
    }
}
