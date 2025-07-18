package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bse {
    public bsh a;
    public bsh b;
    public yjk c = new bms(this, 3);
    public yow d;

    public final long a(long j, long j2, int i) {
        bsb bsbVarC = c();
        if (bsbVarC != null) {
            return bsbVarC.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        bsb bsbVarC = c();
        if (bsbVarC != null) {
            return bsbVarC.b(j, i);
        }
        return 0L;
    }

    public final bsb c() {
        bsh bshVar = this.a;
        if (bshVar != null) {
            return bshVar.f();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r14 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r14 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r10, long r12, defpackage.yih r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.bsc
            if (r0 == 0) goto L13
            r0 = r14
            bsc r0 = (defpackage.bsc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bsc r0 = new bsc
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.ybn.f(r14)
            goto L68
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.ybn.f(r14)
            goto L50
        L37:
            defpackage.ybn.f(r14)
            bsb r14 = r9.c()
            r4 = 0
            if (r14 != 0) goto L55
            bsh r1 = r9.b
            if (r1 == 0) goto L6f
            r6.c = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.c(r2, r4, r6)
            if (r14 == r0) goto L6d
        L50:
            cmm r14 = (defpackage.cmm) r14
            long r4 = r14.a
            goto L6f
        L55:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            bsb r1 = r9.c()
            if (r1 == 0) goto L6e
            r6.c = r12
            java.lang.Object r14 = r1.c(r2, r4, r6)
            if (r14 == r0) goto L6d
        L68:
            cmm r14 = (defpackage.cmm) r14
            long r4 = r14.a
            goto L6f
        L6d:
            return r0
        L6e:
            r4 = r10
        L6f:
            cmm r10 = new cmm
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bse.d(long, long, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r5, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bsd
            if (r0 == 0) goto L13
            r0 = r7
            bsd r0 = (defpackage.bsd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bsd r0 = new bsd
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r7)
            bsb r7 = r4.c()
            if (r7 == 0) goto L46
            r0.c = r3
            java.lang.Object r7 = r7.d(r5, r0)
            if (r7 == r1) goto L45
        L40:
            cmm r7 = (defpackage.cmm) r7
            long r5 = r7.a
            goto L48
        L45:
            return r1
        L46:
            r5 = 0
        L48:
            cmm r7 = new cmm
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bse.e(long, yih):java.lang.Object");
    }

    public final yow f() {
        yow yowVar = (yow) this.c.a();
        if (yowVar != null) {
            return yowVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
