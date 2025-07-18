package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rl extends bko implements cad {
    public kw a;
    private wn b;

    public rl(kw kwVar) {
        this.a = kwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rj
            if (r0 == 0) goto L13
            r0 = r5
            rj r0 = (defpackage.rj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rj r0 = new rj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wn r0 = r0.d
            defpackage.ybn.f(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ybn.f(r5)
            wn r5 = r4.b
            if (r5 != 0) goto L4e
            wn r5 = new wn
            r5.<init>()
            kw r2 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r2.h(r5, r0)
            if (r0 == r1) goto L4d
            r0 = r5
        L4a:
            r4.b = r0
            goto L4e
        L4d:
            return r1
        L4e:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.b(yih):java.lang.Object");
    }

    @Override // defpackage.cad
    public final void bV() {
        f();
    }

    @Override // defpackage.cad
    public final /* synthetic */ long cf() {
        return cai.a;
    }

    @Override // defpackage.bko
    public final /* synthetic */ void cg() {
        cbp.N(this);
    }

    @Override // defpackage.bko
    public final void ch() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rk
            if (r0 == 0) goto L13
            r0 = r5
            rk r0 = (defpackage.rk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rk r0 = new rk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            wn r5 = r4.b
            if (r5 == 0) goto L4a
            wo r2 = new wo
            r2.<init>(r5)
            kw r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.h(r2, r0)
            if (r5 == r1) goto L49
        L45:
            r5 = 0
            r4.b = r5
            goto L4a
        L49:
            return r1
        L4a:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.e(yih):java.lang.Object");
    }

    public final void f() {
        wn wnVar = this.b;
        if (wnVar != null) {
            this.a.i(new wo(wnVar));
            this.b = null;
        }
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        if (bssVar == bss.b) {
            int i = bsrVar.d;
            if (a.r(i, 4)) {
                ykr.q(F(), null, 0, new qy(this, (yih) null, 4), 3);
            } else if (a.r(i, 5)) {
                ykr.q(F(), null, 0, new qy(this, (yih) null, 5, (byte[]) null), 3);
            }
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }
}
