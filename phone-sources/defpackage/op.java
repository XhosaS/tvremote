package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class op extends pj {
    public static final na a = new na(0.0f);
    public Object b;
    public pf c;
    public long d;
    public yoe e;
    public long f;
    public oh g;
    public final yjv h;
    public float i;
    public final yyk j;
    public final kc k;
    public final bhi l;
    private final bcb n;
    private final bcb o;
    private final yjk p;
    private final yjv q;
    private final bdl r;

    public op(Object obj) {
        bcz bczVar = bcz.c;
        this.n = new bci(obj, bczVar);
        this.o = new bci(obj, bczVar);
        this.b = obj;
        this.p = new fg(this, 6);
        this.r = new bce(0.0f);
        this.j = new yyk();
        this.l = new bhi((int[]) null);
        this.f = Long.MIN_VALUE;
        this.k = new kc((byte[]) null);
        this.h = new kb(this, 4);
        this.q = new kb(this, 5);
    }

    public static final void s(oh ohVar, long j) {
        long j2 = ohVar.a + j;
        ohVar.a = j2;
        long j3 = ohVar.h;
        if (j2 >= j3) {
            ohVar.d = 1.0f;
            return;
        }
        pn pnVar = ohVar.b;
        float f = j2 / j3;
        ohVar.d = (ohVar.e.a(0) * (1.0f - f)) + f;
    }

    @Override // defpackage.pj
    public final Object a() {
        return this.o.a();
    }

    @Override // defpackage.pj
    public final Object b() {
        return this.n.a();
    }

    @Override // defpackage.pj
    public final void c(Object obj) {
        this.o.b(obj);
    }

    @Override // defpackage.pj
    public final void d(pf pfVar) {
        pf pfVar2 = this.c;
        if (pfVar2 != null && !yks.e(pfVar, pfVar2)) {
            og.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.c + ", new instance: " + pfVar);
        }
        this.c = pfVar;
    }

    @Override // defpackage.pj
    public final void e() {
        this.c = null;
        pi.a().b(this);
    }

    public final float f() {
        return this.r.e();
    }

    public final Object g(yih yihVar) {
        float f = og.f(yihVar.getContext());
        if (f <= 0.0f) {
            l();
            return ygi.a;
        }
        this.i = f;
        Object objE = bcm.e(this.q, yihVar);
        return objE == yio.a ? objE : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.yih r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.oj
            if (r0 == 0) goto L13
            r0 = r10
            oj r0 = (defpackage.oj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oj r0 = new oj
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            defpackage.ybn.f(r10)
            goto L6d
        L35:
            defpackage.ybn.f(r10)
            kc r10 = r9.k
            boolean r10 = r10.f()
            if (r10 == 0) goto L48
            oh r10 = r9.g
            if (r10 == 0) goto L45
            goto L48
        L45:
            ygi r10 = defpackage.ygi.a
            return r10
        L48:
            yil r10 = r0.getContext()
            float r10 = defpackage.og.f(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L5d
            r9.l()
            r9.f = r5
            ygi r10 = defpackage.ygi.a
            return r10
        L5d:
            long r7 = r9.f
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L6d
            yjv r10 = r9.h
            r0.c = r4
            java.lang.Object r10 = defpackage.bcm.e(r10, r0)
            if (r10 == r1) goto L87
        L6d:
            kc r10 = r9.k
            boolean r10 = r10.g()
            if (r10 != 0) goto L7f
            oh r10 = r9.g
            if (r10 == 0) goto L7a
            goto L7f
        L7a:
            r9.f = r5
            ygi r10 = defpackage.ygi.a
            return r10
        L7f:
            r0.c = r3
            java.lang.Object r10 = r9.g(r0)
            if (r10 != r1) goto L6d
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op.h(yih):java.lang.Object");
    }

    public final Object i(float f, Object obj, yih yihVar) {
        if (f < 0.0f || f > 1.0f) {
            og.a("Expecting fraction between 0 and 1. Got " + f);
        }
        pf pfVar = this.c;
        if (pfVar != null) {
            Object objK = yoz.k(new rx(oe.a, this.l, new ol(obj, b(), this, pfVar, f, null), (yih) null, 1), yihVar);
            if (objK == yio.a) {
                return objK;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.on
            if (r0 == 0) goto L13
            r0 = r7
            on r0 = (defpackage.on) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            on r0 = new on
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r7)
            r7 = r2
            goto L4e
        L3b:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r6.b()
            yyk r2 = r6.j
            r0.a = r7
            r0.d = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L83
        L4e:
            r0.a = r7
            r0.d = r3
            yof r2 = new yof
            yih r0 = defpackage.wcq.S(r0)
            r2.<init>(r0, r4)
            r2.v()
            r6.e = r2
            yyk r0 = r6.j
            r0.d()
            java.lang.Object r0 = r2.i()
            if (r0 == r1) goto L83
            r5 = r0
            r0 = r7
            r7 = r5
        L6e:
            boolean r7 = defpackage.yks.e(r7, r0)
            if (r7 == 0) goto L77
            ygi r7 = defpackage.ygi.a
            return r7
        L77:
            r0 = -9223372036854775808
            r6.f = r0
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r7.<init>(r0)
            throw r7
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op.j(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.oo
            if (r0 == 0) goto L13
            r0 = r7
            oo r0 = (defpackage.oo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oo r0 = new oo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r7)
            goto L7c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r7)
            r7 = r2
            goto L4e
        L3b:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r6.b()
            yyk r2 = r6.j
            r0.a = r7
            r0.d = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L97
        L4e:
            java.lang.Object r2 = r6.b
            boolean r2 = defpackage.yks.e(r7, r2)
            if (r2 == 0) goto L5c
            yyk r7 = r6.j
            r7.d()
            goto L82
        L5c:
            r0.a = r7
            r0.d = r3
            yof r2 = new yof
            yih r0 = defpackage.wcq.S(r0)
            r2.<init>(r0, r4)
            r2.v()
            r6.e = r2
            yyk r0 = r6.j
            r0.d()
            java.lang.Object r0 = r2.i()
            if (r0 == r1) goto L97
            r5 = r0
            r0 = r7
            r7 = r5
        L7c:
            boolean r1 = defpackage.yks.e(r7, r0)
            if (r1 == 0) goto L85
        L82:
            ygi r7 = defpackage.ygi.a
            return r7
        L85:
            r1 = -9223372036854775808
            r6.f = r1
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            java.lang.String r3 = " instead of "
            java.lang.String r7 = defpackage.a.ck(r0, r7, r2, r3)
            r1.<init>(r7)
            throw r1
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op.k(yih):java.lang.Object");
    }

    public final void l() {
        pf pfVar = this.c;
        if (pfVar != null) {
            pfVar.i();
        }
        this.k.k();
        if (this.g != null) {
            this.g = null;
            p(1.0f);
            o();
        }
    }

    public final void m() {
        pf pfVar = this.c;
        if (pfVar == null) {
            return;
        }
        oh ohVar = this.g;
        if (ohVar == null) {
            if (this.d <= 0 || f() == 1.0f || yks.e(a(), b())) {
                ohVar = null;
            } else {
                ohVar = new oh();
                ohVar.d = f();
                long j = this.d;
                ohVar.g = j;
                ohVar.h = yln.w(j * (1.0d - f()));
                ohVar.e.e(0, f());
            }
        }
        if (ohVar != null) {
            ohVar.g = this.d;
            this.k.p(ohVar);
            pfVar.q(ohVar);
        }
        this.g = null;
    }

    public final void n() {
        pi.a().c(this, pi.a, this.p);
    }

    public final void o() {
        pf pfVar = this.c;
        if (pfVar == null) {
            return;
        }
        pfVar.p(yln.w(f() * pfVar.d()));
    }

    public final void p(float f) {
        this.r.h(f);
    }

    public final void q(Object obj) {
        this.n.b(obj);
    }
}
