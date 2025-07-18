package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btq implements clx, yih {
    public yoe a;
    final /* synthetic */ bts b;
    private final /* synthetic */ bts c;
    private final yih d;
    private bss e = bss.b;
    private final yil f = yim.a;

    public btq(bts btsVar, yih yihVar) {
        this.b = btsVar;
        this.c = btsVar;
        this.d = yihVar;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.c.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.c.b();
    }

    @Override // defpackage.cmd
    public final float cn(long j) {
        return cme.e(this.c, j);
    }

    @Override // defpackage.clx
    public final float co(float f) {
        return cme.g(this.c, f);
    }

    @Override // defpackage.clx
    public final float cp(int i) {
        return cme.h(this.c, i);
    }

    @Override // defpackage.clx
    public final float cq(long j) {
        return cme.i(this.c, j);
    }

    @Override // defpackage.clx
    public final float cr(float f) {
        return cme.j(this.c, f);
    }

    @Override // defpackage.clx
    public final int cu(float f) {
        return cme.k(this.c, f);
    }

    @Override // defpackage.clx
    public final long cv(long j) {
        return cme.l(this.c, j);
    }

    @Override // defpackage.clx
    public final long cw(long j) {
        return cme.m(this.c, j);
    }

    @Override // defpackage.cmd
    public final long cx(float f) {
        return cme.f(this.c, f);
    }

    @Override // defpackage.clx
    public final long cy(float f) {
        return cme.n(this.c, f);
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.f;
    }

    public final long m() {
        bts btsVar = this.b;
        long jM = cme.m(btsVar, btsVar.o().h());
        long j = btsVar.g;
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jM >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jM & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final long n() {
        return this.b.g;
    }

    public final bsr o() {
        return this.b.d;
    }

    public final cds p() {
        return this.b.o();
    }

    public final Object q(bss bssVar, yih yihVar) {
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        this.e = bssVar;
        this.a = yofVar;
        return yofVar.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(long r11, defpackage.yjz r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.bto
            if (r0 == 0) goto L13
            r0 = r14
            bto r0 = (defpackage.bto) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bto r0 = new bto
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.a
            defpackage.ybn.f(r14)     // Catch: java.lang.Throwable -> L2a
            r7 = r10
            goto L6f
        L2a:
            r0 = move-exception
            r12 = r0
            r7 = r10
            goto L78
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            defpackage.ybn.f(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L4f
            yoe r14 = r10.a
            if (r14 == 0) goto L4f
            bst r2 = new bst
            r2.<init>(r11)
            java.lang.Object r2 = defpackage.ybn.e(r2)
            r14.resumeWith(r2)
        L4f:
            bts r14 = r10.b
            yow r14 = r14.F()
            vo r4 = new vo
            r8 = 0
            r9 = 4
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r11 = 3
            r12 = 0
            r2 = 0
            yqe r11 = defpackage.ykr.q(r14, r12, r2, r4, r11)
            r0.a = r11     // Catch: java.lang.Throwable -> L76
            r0.d = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r14 = r13.a(r10, r0)     // Catch: java.lang.Throwable -> L76
            if (r14 == r1) goto L75
        L6f:
            bsk r12 = defpackage.bsk.a
            r11.t(r12)
            return r14
        L75:
            return r1
        L76:
            r0 = move-exception
            r12 = r0
        L78:
            bsk r13 = defpackage.bsk.a
            r11.t(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btq.r(long, yjz, yih):java.lang.Object");
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        bts btsVar = this.b;
        synchronized (btsVar.f) {
            btsVar.e.n(this);
        }
        this.d.resumeWith(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(long r5, defpackage.yjz r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.btp
            if (r0 == 0) goto L13
            r0 = r8
            btp r0 = (defpackage.btp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            btp r0 = new btp
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)     // Catch: defpackage.bst -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r8)
            r0.c = r3     // Catch: defpackage.bst -> L3c
            java.lang.Object r5 = r4.r(r5, r7, r0)     // Catch: defpackage.bst -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btq.s(long, yjz, yih):java.lang.Object");
    }

    public final void t(bsr bsrVar, bss bssVar) {
        yoe yoeVar;
        if (bssVar != this.e || (yoeVar = this.a) == null) {
            return;
        }
        this.a = null;
        yoeVar.resumeWith(bsrVar);
    }
}
