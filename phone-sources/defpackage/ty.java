package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ty extends bxw implements cad, byd {
    public uv a;
    public yjv b;
    public boolean c;
    public yrz d;
    public boolean e;
    public long f = 0;
    public bvc g;
    private wj h;
    private bts i;
    private kw j;

    public ty(yjv yjvVar, boolean z, kw kwVar, uv uvVar) {
        this.a = uvVar;
        this.b = yjvVar;
        this.c = z;
        this.j = kwVar;
    }

    public abstract Object b(yjz yjzVar, yih yihVar);

    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        this.g = bvcVar;
    }

    @Override // defpackage.cad
    public final void bV() {
        bts btsVar = this.i;
        if (btsVar != null) {
            btsVar.bV();
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ long cf() {
        return cai.a;
    }

    @Override // defpackage.bko
    public /* synthetic */ void cg() {
        cbp.N(this);
    }

    @Override // defpackage.bko
    public final void ch() {
        this.e = false;
        l();
        this.g = null;
        this.f = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tv
            if (r0 == 0) goto L13
            r0 = r6
            tv r0 = (defpackage.tv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tv r0 = new tv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ybn.f(r6)
            wj r6 = r5.h
            if (r6 == 0) goto L4c
            kw r2 = r5.j
            if (r2 == 0) goto L49
            wi r4 = new wi
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r6 = r2.h(r4, r0)
            if (r6 == r1) goto L48
            goto L49
        L48:
            return r1
        L49:
            r6 = 0
            r5.h = r6
        L4c:
            r0 = 0
            r5.r(r0)
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty.e(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r2.h(r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.tm r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tw
            if (r0 == 0) goto L13
            r0 = r8
            tw r0 = (defpackage.tw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tw r0 = new tw
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            wj r7 = r0.e
            tm r0 = r0.d
            defpackage.ybn.f(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            tm r7 = r0.d
            defpackage.ybn.f(r8)
            goto L56
        L3c:
            defpackage.ybn.f(r8)
            wj r8 = r6.h
            if (r8 == 0) goto L56
            kw r2 = r6.j
            if (r2 == 0) goto L56
            wi r5 = new wi
            r5.<init>(r8)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r2.h(r5, r0)
            if (r8 == r1) goto L6c
        L56:
            wj r8 = new wj
            r8.<init>()
            kw r2 = r6.j
            if (r2 == 0) goto L6d
            r0.d = r7
            r0.e = r8
            r0.c = r3
            java.lang.Object r0 = r2.h(r8, r0)
            if (r0 == r1) goto L6c
            goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r6.h = r7
            long r7 = r0.a
            r6.o(r7)
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty.g(tm, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.tn r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.tx
            if (r0 == 0) goto L13
            r0 = r7
            tx r0 = (defpackage.tx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tx r0 = new tx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tn r6 = r0.d
            defpackage.ybn.f(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r7)
            wj r7 = r5.h
            if (r7 == 0) goto L50
            kw r2 = r5.j
            if (r2 == 0) goto L4d
            wk r4 = new wk
            r4.<init>(r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r2.h(r4, r0)
            if (r7 == r1) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            r7 = 0
            r5.h = r7
        L50:
            long r6 = r6.a
            r5.r(r6)
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty.h(tn, yih):java.lang.Object");
    }

    public final void l() {
        wj wjVar = this.h;
        if (wjVar != null) {
            kw kwVar = this.j;
            if (kwVar != null) {
                kwVar.i(new wi(wjVar));
            }
            this.h = null;
        }
    }

    @Override // defpackage.cad
    public void m(bsr bsrVar, bss bssVar, long j) {
        if (this.c && this.i == null) {
            qi qiVar = new qi(this, 2);
            bsr bsrVar2 = btm.a;
            bts btsVar = new bts(null, null, qiVar);
            O(btsVar);
            this.i = btsVar;
        }
        bts btsVar2 = this.i;
        if (btsVar2 != null) {
            btsVar2.m(bsrVar, bssVar, j);
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    public abstract void o(long j);

    public abstract void r(long j);

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    public abstract boolean v();

    public final void w(yjv yjvVar, boolean z, kw kwVar, uv uvVar, boolean z2) {
        this.b = yjvVar;
        if (this.c != z) {
            this.c = z;
            z2 = true;
            if (!z) {
                l();
                bts btsVar = this.i;
                if (btsVar != null) {
                    N(btsVar);
                }
                this.i = null;
            }
        }
        if (!yks.e(this.j, kwVar)) {
            l();
            this.j = kwVar;
        }
        if (this.a != uvVar) {
            this.a = uvVar;
        } else if (!z2) {
            return;
        }
        bts btsVar2 = this.i;
        if (btsVar2 != null) {
            btsVar2.q();
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }
}
