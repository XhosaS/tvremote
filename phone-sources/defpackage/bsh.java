package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsh extends bko implements cak, bsb {
    public bsb a;
    public bse b;
    private bsh c;
    private final Object d;

    public bsh(bsb bsbVar, bse bseVar) {
        this.a = bsbVar;
        this.b = bseVar == null ? new bse() : bseVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final bsb l() {
        if (this.A) {
            return f();
        }
        return null;
    }

    @Override // defpackage.bsb
    public final long a(long j, long j2, int i) {
        long jA = this.a.a(j, j2, i);
        bsb bsbVarL = l();
        return a.D(jA, bsbVarL != null ? bsbVarL.a(a.D(j, jA), a.at(j2, jA), i) : 0L);
    }

    @Override // defpackage.bsb
    public final long b(long j, int i) {
        bsb bsbVarL = l();
        long jB = bsbVarL != null ? bsbVarL.b(j, i) : 0L;
        return a.D(jB, this.a.b(a.at(j, jB), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r11, long r13, defpackage.yih r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.bsf
            if (r0 == 0) goto L13
            r0 = r15
            bsf r0 = (defpackage.bsf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bsf r0 = new bsf
            r0.<init>(r10, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.c
            yio r0 = defpackage.yio.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            long r11 = r6.a
            defpackage.ybn.f(r15)
            goto L77
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            long r13 = r6.b
            long r11 = r6.a
            defpackage.ybn.f(r15)
            goto L52
        L3d:
            defpackage.ybn.f(r15)
            bsb r1 = r10.a
            r6.a = r11
            r6.b = r13
            r6.e = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 == r0) goto L89
            r11 = r2
            r13 = r4
        L52:
            cmm r15 = (defpackage.cmm) r15
            long r8 = r15.a
            boolean r15 = r10.A
            if (r15 == 0) goto L5f
            bsb r15 = r10.l()
            goto L61
        L5f:
            bsh r15 = r10.c
        L61:
            r1 = r15
            if (r1 == 0) goto L7d
            long r2 = defpackage.a.D(r11, r8)
            long r4 = defpackage.a.at(r13, r8)
            r6.a = r8
            r6.e = r7
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 == r0) goto L89
            r11 = r8
        L77:
            cmm r15 = (defpackage.cmm) r15
            long r13 = r15.a
            r8 = r11
            goto L7f
        L7d:
            r13 = 0
        L7f:
            long r11 = defpackage.a.D(r8, r13)
            cmm r13 = new cmm
            r13.<init>(r11)
            return r13
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsh.c(long, long, yih):java.lang.Object");
    }

    @Override // defpackage.bko
    public final void cd() {
        i();
    }

    @Override // defpackage.bko
    public final void ch() {
        ylf ylfVar = new ylf();
        cbp.H(this, new brj(ylfVar, 2));
        bsh bshVar = (bsh) ((cak) ylfVar.a);
        this.c = bshVar;
        this.b.b = bshVar;
        h();
    }

    @Override // defpackage.cak
    public final Object ci() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r7, defpackage.yih r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bsg
            if (r0 == 0) goto L13
            r0 = r9
            bsg r0 = (defpackage.bsg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bsg r0 = new bsg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.a
            defpackage.ybn.f(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.a
            defpackage.ybn.f(r9)
            goto L4d
        L3a:
            defpackage.ybn.f(r9)
            bsb r9 = r6.l()
            if (r9 == 0) goto L52
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
        L4d:
            cmm r9 = (defpackage.cmm) r9
            long r4 = r9.a
            goto L54
        L52:
            r4 = 0
        L54:
            bsb r9 = r6.a
            long r7 = defpackage.a.at(r7, r4)
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
            r7 = r4
        L65:
            cmm r9 = (defpackage.cmm) r9
            long r0 = r9.a
            long r7 = defpackage.a.D(r7, r0)
            cmm r9 = new cmm
            r9.<init>(r7)
            return r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsh.d(long, yih):java.lang.Object");
    }

    public final bsh f() {
        if (this.A) {
            return (bsh) cbp.G(this);
        }
        return null;
    }

    public final yow g() {
        bsh bshVarF = f();
        yow yowVarG = bshVarF != null ? bshVarF.g() : null;
        if (yowVarG != null && yoz.p(yowVarG)) {
            return yowVarG;
        }
        yow yowVar = this.b.d;
        if (yowVar != null) {
            return yowVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void h() {
        bse bseVar = this.b;
        if (bseVar.a == this) {
            bseVar.a = null;
        }
    }

    public final void i() {
        bse bseVar = this.b;
        bseVar.a = this;
        bseVar.b = null;
        this.c = null;
        bseVar.c = new bms(this, 4);
        bseVar.d = F();
    }
}
