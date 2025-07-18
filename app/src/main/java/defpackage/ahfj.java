package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahfj implements ahfn {
    public final agzx a;
    public final agzx b;
    public final agzy c;
    public final agzy d;
    private final int e;
    private final agzx f;
    private final agzx g;
    private final agzy h;
    private final agzy i;
    private final agzy j;

    public ahfj(int i) {
        this.e = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.a(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        agzz agzzVar = agzz.a;
        this.a = new agzx(0L, agzzVar);
        this.b = new agzx(0L, agzzVar);
        ahfu ahfuVar = ahfl.a;
        agzx agzxVar = new agzx(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, agzzVar);
        this.f = agzxVar;
        this.g = new agzx(agzxVar.c, agzzVar);
        ahfu ahfuVar2 = new ahfu(0L, null, this, 3);
        this.c = new agzy(ahfuVar2, agzzVar);
        this.d = new agzy(ahfuVar2, agzzVar);
        if (I()) {
            ahfuVar2 = ahfl.a;
            ahfuVar2.getClass();
        }
        this.h = new agzy(ahfuVar2, agzzVar);
        this.i = new agzy(ahfl.s, agzzVar);
        this.j = new agzy(null, agzzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A(defpackage.ahfu r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L34
            boolean r0 = r5.H(r9)
            if (r0 == 0) goto L1a
            if (r12 != 0) goto L28
            ahmg r0 = defpackage.ahfl.d
            boolean r0 = r6.h(r7, r3, r0)
            if (r0 == 0) goto L0
            return r2
        L1a:
            if (r12 != 0) goto L28
            if (r11 != 0) goto L20
            r6 = 3
            return r6
        L20:
            boolean r0 = r6.h(r7, r3, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L28:
            ahmg r0 = defpackage.ahfl.j
            boolean r0 = r6.h(r7, r3, r0)
            if (r0 == 0) goto L0
            r6.o()
            return r1
        L34:
            ahmg r4 = defpackage.ahfl.e
            if (r0 != r4) goto L41
            ahmg r1 = defpackage.ahfl.d
            boolean r0 = r6.h(r7, r0, r1)
            if (r0 == 0) goto L0
            return r2
        L41:
            ahmg r9 = defpackage.ahfl.k
            r10 = 5
            if (r0 == r9) goto L7e
            ahmg r11 = defpackage.ahfl.h
            if (r0 == r11) goto L7a
            ahmg r11 = defpackage.ahfl.l
            if (r0 != r11) goto L55
            r6.f(r7, r3)
            r5.y()
            return r1
        L55:
            boolean r11 = defpackage.ahbx.a
            r6.f(r7, r3)
            boolean r11 = r0 instanceof defpackage.ahgi
            if (r11 == 0) goto L62
            ahgi r0 = (defpackage.ahgi) r0
            ahet r0 = r0.a
        L62:
            boolean r8 = r5.J(r0, r8)
            if (r8 == 0) goto L6f
            ahmg r8 = defpackage.ahfl.i
            r6.g(r7, r8)
            r6 = 0
            return r6
        L6f:
            java.lang.Object r8 = r6.b(r7, r9)
            if (r8 != r9) goto L76
            return r10
        L76:
            r6.e(r7, r2)
            return r10
        L7a:
            r6.f(r7, r3)
            return r10
        L7e:
            r6.f(r7, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.A(ahfu, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r1 = (defpackage.ahfu) r1.k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.ahfu B(long r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.B(long):ahfu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017c, code lost:
    
        D(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.C():void");
    }

    private final void D(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = agzx.a;
        agzx agzxVar = this.g;
        if ((atomicLongFieldUpdater.addAndGet(agzxVar, j) & 4611686018427387904L) != 0) {
            while ((agzxVar.c & 4611686018427387904L) != 0) {
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
    private final void E(long r5, defpackage.ahfu r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ahkx r0 = r7.j()
            ahfu r0 = (defpackage.ahfu) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.m()
            if (r5 == 0) goto L22
            ahkx r5 = r7.j()
            ahfu r5 = (defpackage.ahfu) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            agzy r5 = r4.h
        L24:
            java.lang.Object r6 = r5.a
            ahmd r6 = (defpackage.ahmd) r6
            long r0 = r6.d
            long r2 = r7.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r7.q()
            if (r0 == 0) goto L11
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L47
            boolean r5 = r6.p()
            if (r5 == 0) goto L46
            r6.l()
        L46:
            return
        L47:
            boolean r6 = r7.p()
            if (r6 == 0) goto L24
            r7.l()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.E(long, ahfu):void");
    }

    private final void F(ahet ahetVar, ahfu ahfuVar, int i) {
        ahetVar.A(ahfuVar, i + ahfl.b);
    }

    private final void G(ahet ahetVar, boolean z) {
        if (ahetVar instanceof ahfg) {
            throw null;
        }
        if (ahetVar instanceof ahap) {
            ((agsw) ahetVar).e(agpl.a(z ? l() : m()));
            return;
        }
        if (ahetVar instanceof ahgf) {
            ((ahgf) ahetVar).a.e(new ahft(new ahfr(k())));
            return;
        }
        if (!(ahetVar instanceof ahff)) {
            if (!(ahetVar instanceof ahnh)) {
                Objects.toString(ahetVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(ahetVar)));
            }
            ahfu ahfuVar = ahfl.a;
            throw null;
        }
        ahff ahffVar = (ahff) ahetVar;
        ahar aharVar = ahffVar.b;
        aharVar.getClass();
        ahffVar.b = null;
        ahffVar.a = ahfl.l;
        Throwable thK = ahffVar.c.k();
        if (thK == null) {
            aharVar.e(false);
            return;
        }
        if (ahbx.b) {
            thK = ahmf.a(thK, aharVar);
        }
        aharVar.e(agpl.a(thK));
    }

    private final boolean H(long j) {
        if (j >= this.f.c) {
            return j < this.b.c + ((long) this.e);
        }
        return true;
    }

    private final boolean I() {
        long j = this.f.c;
        return j == 0 || j == Long.MAX_VALUE;
    }

    private final boolean J(Object obj, Object obj2) {
        if (obj instanceof ahnh) {
            throw null;
        }
        if (obj instanceof ahgf) {
            obj.getClass();
            return ahfl.b(((ahgf) obj).a, new ahft(obj2));
        }
        if (!(obj instanceof ahff)) {
            if (obj instanceof ahap) {
                obj.getClass();
                return ahfl.b((ahap) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        ahff ahffVar = (ahff) obj;
        ahar aharVar = ahffVar.b;
        aharVar.getClass();
        ahffVar.b = null;
        ahffVar.a = obj2;
        return ahfl.b(aharVar, true);
    }

    private final Object K(agsw agswVar) {
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        Throwable thM = m();
        if (ahbx.b) {
            thM = ahmf.a(thM, aharVar);
        }
        aharVar.e(agpl.a(thM));
        Object objM = aharVar.m();
        agtg agtgVar = agtg.a;
        if (objM == agtgVar) {
            agswVar.getClass();
        }
        return objM == agtgVar ? objM : agpu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void L(ahap ahapVar) {
        Throwable thM = m();
        if (ahbx.b) {
            thM = ahmf.a(thM, ahapVar);
        }
        ahapVar.e(agpl.a(thM));
    }

    private final boolean M(Object obj) {
        if (obj instanceof ahap) {
            obj.getClass();
            return ahfl.b((ahap) obj, agpu.a);
        }
        if (obj instanceof ahnh) {
            obj.getClass();
            throw null;
        }
        if (obj instanceof ahfg) {
            throw null;
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(defpackage.ahfj r13, defpackage.agsw r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ahfh
            if (r0 == 0) goto L13
            r0 = r14
            ahfh r0 = (defpackage.ahfh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahfh r0 = new ahfh
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            agtg r0 = defpackage.agtg.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            defpackage.agpl.b(r14)
            ahft r14 = (defpackage.ahft) r14
            java.lang.Object r13 = r14.b
            return r13
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.agpl.b(r14)
            agzy r14 = r13.d
            java.lang.Object r14 = r14.a
            ahfu r14 = (defpackage.ahfu) r14
        L3d:
            boolean r1 = r13.x()
            if (r1 == 0) goto L4d
            java.lang.Throwable r13 = r13.k()
            ahfr r14 = new ahfr
            r14.<init>(r13)
            return r14
        L4d:
            agzx r1 = r13.b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.agzx.a
            long r4 = r3.getAndIncrement(r1)
            int r1 = defpackage.ahfl.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.d
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6b
            ahfu r1 = r13.o(r9, r14)
            if (r1 == 0) goto L3d
            r8 = r1
            goto L6c
        L6b:
            r8 = r14
        L6c:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.j(r8, r9, r10, r12)
            r1 = r7
            ahmg r14 = defpackage.ahfl.m
            if (r13 == r14) goto La3
            ahmg r14 = defpackage.ahfl.o
            r7 = 0
            if (r13 != r14) goto L8e
            long r13 = r1.b()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8b
            agzy r13 = r8.c
            r13.b(r7)
        L8b:
            r13 = r1
            r14 = r8
            goto L3d
        L8e:
            ahmg r14 = defpackage.ahfl.n
            if (r13 != r14) goto L9d
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.f(r2, r3, r4, r6)
            if (r13 != r0) goto L9c
            return r0
        L9c:
            return r13
        L9d:
            agzy r14 = r8.c
            r14.b(r7)
            return r13
        La3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.e(ahfj, agsw):java.lang.Object");
    }

    public final int a(ahfu ahfuVar, int i, Object obj, long j, Object obj2, boolean z) {
        ahfuVar.f(i, obj);
        if (z) {
            return A(ahfuVar, i, obj, j, obj2, true);
        }
        Object objD = ahfuVar.d(i);
        if (objD == null) {
            if (H(j)) {
                if (ahfuVar.h(i, null, ahfl.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ahfuVar.h(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof ahet) {
            ahfuVar.f(i, null);
            if (J(objD, obj)) {
                ahfuVar.g(i, ahfl.i);
                return 0;
            }
            ahmg ahmgVar = ahfl.k;
            if (ahfuVar.b(i, ahmgVar) == ahmgVar) {
                return 5;
            }
            ahfuVar.e(i, true);
            return 5;
        }
        return A(ahfuVar, i, obj, j, obj2, false);
    }

    public final long b() {
        return this.a.c & 1152921504606846975L;
    }

    @Override // defpackage.ahgg
    public final Object c(agsw agswVar) throws Throwable {
        ahfu ahfuVarO;
        ahfj ahfjVar = this;
        agzy agzyVar = ahfjVar.d;
        ahfu ahfuVar = (ahfu) agzyVar.a;
        while (!ahfjVar.x()) {
            agzx agzxVar = ahfjVar.b;
            AtomicLongFieldUpdater atomicLongFieldUpdater = agzx.a;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(agzxVar);
            long j = ahfl.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ahfuVar.d != j2) {
                ahfu ahfuVarO2 = ahfjVar.o(j2, ahfuVar);
                if (ahfuVarO2 != null) {
                    ahfuVar = ahfuVarO2;
                } else {
                    continue;
                }
            }
            Object objJ = ahfjVar.j(ahfuVar, i, andIncrement, null);
            ahmg ahmgVar = ahfl.m;
            if (objJ == ahmgVar) {
                throw new IllegalStateException("unexpected");
            }
            ahmg ahmgVar2 = ahfl.o;
            if (objJ != ahmgVar2) {
                ahmg ahmgVar3 = ahfl.n;
                if (objJ != ahmgVar3) {
                    ahfuVar.c.b(null);
                    return objJ;
                }
                ahar aharVarA = ahat.a(agth.c(agswVar));
                ahfj ahfjVar2 = this;
                try {
                    Object objJ2 = ahfjVar2.j(ahfuVar, i, andIncrement, aharVarA);
                    if (objJ2 == ahmgVar) {
                        aharVarA.A(ahfuVar, i);
                    } else if (objJ2 == ahmgVar2) {
                        if (andIncrement < ahfjVar2.b()) {
                            ahfuVar.c.b(null);
                        }
                        ahfu ahfuVar2 = (ahfu) agzyVar.a;
                        while (true) {
                            if (ahfjVar2.x()) {
                                aharVarA.e(agpl.a(ahfjVar2.l()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(agzxVar);
                            long j3 = andIncrement2 / j;
                            int i2 = (int) (andIncrement2 % j);
                            if (ahfuVar2.d != j3) {
                                ahfuVarO = ahfjVar2.o(j3, ahfuVar2);
                                if (ahfuVarO == null) {
                                    continue;
                                }
                            } else {
                                ahfuVarO = ahfuVar2;
                            }
                            Object objJ3 = ahfjVar2.j(ahfuVarO, i2, andIncrement2, aharVarA);
                            if (objJ3 == ahmgVar) {
                                aharVarA.A(ahfuVarO, i2);
                                break;
                            }
                            if (objJ3 == ahmgVar2) {
                                if (andIncrement2 < b()) {
                                    ahfuVarO.c.b(null);
                                }
                                ahfjVar2 = this;
                                ahfuVar2 = ahfuVarO;
                            } else {
                                if (objJ3 == ahmgVar3) {
                                    throw new IllegalStateException("unexpected");
                                }
                                ahfuVarO.c.b(null);
                                aharVarA.D(objJ3, aharVarA.e, null);
                            }
                        }
                    } else {
                        ahfuVar.c.b(null);
                        aharVarA.D(objJ2, aharVarA.e, null);
                    }
                    Object objM = aharVarA.m();
                    if (objM == agtg.a) {
                        agswVar.getClass();
                    }
                    return objM;
                } catch (Throwable th) {
                    aharVarA.C();
                    throw th;
                }
            }
            if (andIncrement < b()) {
                ahfuVar.c.b(null);
            }
            ahfjVar = this;
        }
        throw ahmf.b(l());
    }

    @Override // defpackage.ahgg
    public final Object d(agsw agswVar) {
        return e(this, agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.ahfu r17, int r18, long r19, defpackage.agsw r21) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.f(ahfu, int, long, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157 A[RETURN] */
    @Override // defpackage.ahgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.Object r23, defpackage.agsw r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.g(java.lang.Object, agsw):java.lang.Object");
    }

    @Override // defpackage.ahgg
    public final Object h() {
        ahfu ahfuVar;
        agzx agzxVar = this.a;
        agzx agzxVar2 = this.b;
        long j = agzxVar2.c;
        long j2 = agzxVar.c;
        if (w(j2, true)) {
            return new ahfr(k());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return ahft.a;
        }
        agzy agzyVar = this.d;
        ahmg ahmgVar = ahfl.k;
        ahfu ahfuVar2 = (ahfu) agzyVar.a;
        while (!x()) {
            long andIncrement = agzx.a.getAndIncrement(agzxVar2);
            long j3 = ahfl.b;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (ahfuVar2.d != j4) {
                ahfu ahfuVarO = o(j4, ahfuVar2);
                if (ahfuVarO != null) {
                    ahfuVar = ahfuVarO;
                } else {
                    continue;
                }
            } else {
                ahfuVar = ahfuVar2;
            }
            Object objJ = j(ahfuVar, i, andIncrement, ahmgVar);
            ahfu ahfuVar3 = ahfuVar;
            if (objJ == ahfl.m) {
                t(andIncrement);
                ahfuVar3.o();
                return ahft.a;
            }
            if (objJ != ahfl.o) {
                if (objJ == ahfl.n) {
                    throw new IllegalStateException("unexpected");
                }
                ahfuVar3.c.b(null);
                return objJ;
            }
            if (andIncrement < b()) {
                ahfuVar3.c.b(null);
            }
            ahfuVar2 = ahfuVar3;
        }
        return new ahfr(k());
    }

    @Override // defpackage.ahgh
    public Object i(Object obj) {
        agzx agzxVar = this.a;
        long j = agzxVar.c;
        if (!w(j, false) && !H(j & 1152921504606846975L)) {
            return ahft.a;
        }
        agzy agzyVar = this.c;
        ahmg ahmgVar = ahfl.j;
        ahfu ahfuVar = (ahfu) agzyVar.a;
        while (true) {
            long andIncrement = agzx.a.getAndIncrement(agzxVar);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zW = w(andIncrement, false);
            long j3 = ahfl.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (ahfuVar.d != j4) {
                ahfu ahfuVarP = p(j4, ahfuVar);
                if (ahfuVarP != null) {
                    ahfuVar = ahfuVarP;
                } else if (zW) {
                    return new ahfr(m());
                }
            }
            int iA = a(ahfuVar, i, obj, j2, ahmgVar, zW);
            if (iA == 0) {
                ahfuVar.c.b(null);
                return agpu.a;
            }
            if (iA == 1) {
                return agpu.a;
            }
            if (iA == 2) {
                if (zW) {
                    ahfuVar.o();
                    return new ahfr(m());
                }
                ahfuVar.o();
                return ahft.a;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j2 < this.b.c) {
                    ahfuVar.c.b(null);
                }
                return new ahfr(m());
            }
            ahfuVar.c.b(null);
        }
    }

    public final Object j(ahfu ahfuVar, int i, long j, Object obj) {
        Object objD = ahfuVar.d(i);
        if (objD == null) {
            if (j >= (this.a.c & 1152921504606846975L)) {
                if (obj == null) {
                    return ahfl.n;
                }
                if (ahfuVar.h(i, null, obj)) {
                    C();
                    return ahfl.m;
                }
            }
        } else if (objD == ahfl.d && ahfuVar.h(i, objD, ahfl.i)) {
            C();
            Object objC = ahfuVar.c(i);
            ahfuVar.f(i, null);
            return objC;
        }
        while (true) {
            Object objD2 = ahfuVar.d(i);
            if (objD2 == null || objD2 == ahfl.e) {
                if (j < (this.a.c & 1152921504606846975L)) {
                    if (ahfuVar.h(i, objD2, ahfl.h)) {
                        C();
                        return ahfl.o;
                    }
                } else {
                    if (obj == null) {
                        return ahfl.n;
                    }
                    if (ahfuVar.h(i, objD2, obj)) {
                        C();
                        return ahfl.m;
                    }
                }
            } else if (objD2 != ahfl.d) {
                ahmg ahmgVar = ahfl.j;
                if (objD2 == ahmgVar) {
                    return ahfl.o;
                }
                if (objD2 == ahfl.h) {
                    return ahfl.o;
                }
                if (objD2 == ahfl.l) {
                    C();
                    return ahfl.o;
                }
                if (objD2 != ahfl.g && ahfuVar.h(i, objD2, ahfl.f)) {
                    boolean z = objD2 instanceof ahgi;
                    if (z) {
                        objD2 = ((ahgi) objD2).a;
                    }
                    if (M(objD2)) {
                        ahfuVar.g(i, ahfl.i);
                        C();
                        Object objC2 = ahfuVar.c(i);
                        ahfuVar.f(i, null);
                        return objC2;
                    }
                    ahfuVar.g(i, ahmgVar);
                    ahfuVar.o();
                    if (z) {
                        C();
                    }
                    return ahfl.o;
                }
            } else if (ahfuVar.h(i, objD2, ahfl.i)) {
                C();
                Object objC3 = ahfuVar.c(i);
                ahfuVar.f(i, null);
                return objC3;
            }
        }
    }

    protected final Throwable k() {
        return (Throwable) this.i.a;
    }

    public final Throwable l() {
        Throwable thK = k();
        return thK == null ? new ahfy() : thK;
    }

    protected final Throwable m() {
        Throwable thK = k();
        return thK == null ? new ahfz("Channel was closed") : thK;
    }

    @Override // defpackage.ahgg
    public final ahfp n() {
        return new ahff(this);
    }

    public final ahfu o(long j, ahfu ahfuVar) {
        Object objA;
        long j2;
        long j3;
        ahfu ahfuVar2 = ahfl.a;
        ahfk ahfkVar = ahfk.a;
        loop0: while (true) {
            objA = ahkw.a(ahfuVar, j, ahfkVar);
            if (!ahme.b(objA)) {
                ahmd ahmdVarA = ahme.a(objA);
                while (true) {
                    agzy agzyVar = this.d;
                    ahmd ahmdVar = (ahmd) agzyVar.a;
                    if (ahmdVar.d >= ahmdVarA.d) {
                        break loop0;
                    }
                    if (ahmdVarA.q()) {
                        if (agzyVar.d(ahmdVar, ahmdVarA)) {
                            if (ahmdVar.p()) {
                                ahmdVar.l();
                            }
                        } else if (ahmdVarA.p()) {
                            ahmdVarA.l();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (ahme.b(objA)) {
            y();
            if (ahfuVar.d * ahfl.b >= b()) {
                return null;
            }
            ahfuVar.c.b(null);
            return null;
        }
        ahfu ahfuVar3 = (ahfu) ahme.a(objA);
        if (!I() && j <= this.f.c / ahfl.b) {
            agzy agzyVar2 = this.h;
            while (true) {
                ahmd ahmdVar2 = (ahmd) agzyVar2.a;
                if (ahmdVar2.d >= ahfuVar3.d || !ahfuVar3.q()) {
                    break;
                }
                if (agzyVar2.d(ahmdVar2, ahfuVar3)) {
                    if (ahmdVar2.p()) {
                        ahmdVar2.l();
                    }
                } else if (ahfuVar3.p()) {
                    ahfuVar3.l();
                }
            }
        }
        long j4 = ahfuVar3.d;
        if (j4 <= j) {
            boolean z = ahbx.a;
            return ahfuVar3;
        }
        long j5 = ahfl.b;
        agzx agzxVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = agzxVar.c;
            if (j3 >= j2) {
                break;
            }
        } while (!agzxVar.a(j3, j2));
        if (j2 >= b()) {
            return null;
        }
        ahfuVar3.c.b(null);
        return null;
    }

    public final ahfu p(long j, ahfu ahfuVar) {
        Object objA;
        long j2;
        long j3;
        long j4;
        ahfu ahfuVar2 = ahfl.a;
        ahfk ahfkVar = ahfk.a;
        loop0: while (true) {
            objA = ahkw.a(ahfuVar, j, ahfkVar);
            if (!ahme.b(objA)) {
                ahmd ahmdVarA = ahme.a(objA);
                while (true) {
                    agzy agzyVar = this.c;
                    ahmd ahmdVar = (ahmd) agzyVar.a;
                    if (ahmdVar.d >= ahmdVarA.d) {
                        break loop0;
                    }
                    if (ahmdVarA.q()) {
                        if (agzyVar.d(ahmdVar, ahmdVarA)) {
                            if (ahmdVar.p()) {
                                ahmdVar.l();
                            }
                        } else if (ahmdVarA.p()) {
                            ahmdVarA.l();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (ahme.b(objA)) {
            y();
            if (ahfuVar.d * ahfl.b >= this.b.c) {
                return null;
            }
            ahfuVar.c.b(null);
            return null;
        }
        ahfu ahfuVar3 = (ahfu) ahme.a(objA);
        long j5 = ahfuVar3.d;
        if (j5 <= j) {
            boolean z = ahbx.a;
            return ahfuVar3;
        }
        long j6 = ahfl.b;
        agzx agzxVar = this.a;
        do {
            j2 = j5 * j6;
            j3 = agzxVar.c;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!agzxVar.a(j3, (((int) (j3 >> 60)) << 60) + j4));
        if (j2 >= this.b.c) {
            return null;
        }
        ahfuVar3.c.b(null);
        return null;
    }

    protected final void q(long j) {
        ahfu ahfuVar;
        boolean z = ahbx.a;
        ahfu ahfuVar2 = (ahfu) this.d.a;
        while (true) {
            agzx agzxVar = this.b;
            int i = this.e;
            long j2 = agzxVar.c;
            if (j < Math.max(i + j2, this.f.c)) {
                return;
            }
            if (agzxVar.a(j2, 1 + j2)) {
                long j3 = ahfl.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (ahfuVar2.d != j4) {
                    ahfu ahfuVarO = o(j4, ahfuVar2);
                    if (ahfuVarO != null) {
                        ahfuVar = ahfuVarO;
                    }
                } else {
                    ahfuVar = ahfuVar2;
                }
                if (j(ahfuVar, i2, j2, null) != ahfl.o || j2 < b()) {
                    ahfuVar.c.b(null);
                }
                ahfuVar2 = ahfuVar;
            }
        }
    }

    @Override // defpackage.ahgh
    public final void r(agux aguxVar) {
        ahmg ahmgVar;
        agzy agzyVar = this.j;
        if (agzyVar.d(null, aguxVar)) {
            return;
        }
        do {
            Object obj = agzyVar.a;
            ahmgVar = ahfl.q;
            if (obj != ahmgVar) {
                if (obj == ahfl.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!agzyVar.d(ahmgVar, ahfl.r));
        aguxVar.a(k());
    }

    @Override // defpackage.ahgg
    public final void s(CancellationException cancellationException) {
        v(cancellationException, true);
    }

    public final void t(long j) {
        agzx agzxVar;
        long j2;
        long j3;
        long j4;
        if (I()) {
            return;
        }
        do {
            agzxVar = this.f;
        } while (agzxVar.c <= j);
        int i = ahfl.c;
        int i2 = 0;
        while (true) {
            long j5 = 4611686018427387903L;
            if (i2 >= i) {
                agzx agzxVar2 = this.g;
                do {
                    j2 = agzxVar2.c;
                } while (!agzxVar2.a(j2, ahfl.a(j2 & 4611686018427387903L, true)));
                while (true) {
                    long j6 = agzxVar.c;
                    long j7 = agzxVar2.c;
                    long j8 = j7 & j5;
                    long j9 = 4611686018427387904L & j7;
                    if (j6 == j8) {
                        j3 = j5;
                        if (j6 == agzxVar.c) {
                            break;
                        }
                    } else {
                        j3 = j5;
                    }
                    if (j9 == 0) {
                        agzxVar2.a(j7, ahfl.a(j8, true));
                    }
                    j5 = j3;
                }
                do {
                    j4 = agzxVar2.c;
                } while (!agzxVar2.a(j4, ahfl.a(j4 & j3, false)));
                return;
            }
            long j10 = agzxVar.c;
            if (j10 == (4611686018427387903L & this.g.c) && j10 == agzxVar.c) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        r4 = (defpackage.ahfu) r4.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        if (r4 != null) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.toString():java.lang.String");
    }

    @Override // defpackage.ahgh
    public final boolean u(Throwable th) {
        return v(th, false);
    }

    protected final boolean v(Throwable th, boolean z) {
        long j;
        long j2;
        Object obj;
        long j3;
        long j4;
        if (z) {
            agzx agzxVar = this.a;
            do {
                j4 = agzxVar.c;
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                ahfu ahfuVar = ahfl.a;
            } while (!agzxVar.a(j4, (j4 & 1152921504606846975L) + 1152921504606846976L));
        }
        boolean zD = this.i.d(ahfl.s, th);
        if (z) {
            agzx agzxVar2 = this.a;
            do {
                j3 = agzxVar2.c;
            } while (!agzxVar2.a(j3, (j3 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            agzx agzxVar3 = this.a;
            do {
                j = agzxVar3.c;
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!agzxVar3.a(j, j2));
        }
        y();
        if (zD) {
            agzy agzyVar = this.j;
            do {
                obj = agzyVar.a;
            } while (!agzyVar.d(obj, obj == null ? ahfl.q : ahfl.r));
            if (obj != null) {
                agwk.b(obj, 1);
                ((agux) obj).a(k());
                return true;
            }
        }
        return zD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r1 = (defpackage.ahfu) r1.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(long r17, boolean r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfj.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(this.a.c, true);
    }

    @Override // defpackage.ahgh
    public final boolean y() {
        return w(this.a.c, false);
    }

    protected boolean z() {
        return false;
    }
}
