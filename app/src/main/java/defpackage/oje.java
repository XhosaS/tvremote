package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oje extends oln {
    public final boolean a;
    public final int b;
    public final yyk c;
    public final abwf d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public oje(boolean z, int i, yyk yykVar, abwf abwfVar, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = i;
        this.c = yykVar;
        this.d = abwfVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // defpackage.oln
    public final int a() {
        return this.b;
    }

    @Override // defpackage.oln
    public final yyk b() {
        return this.c;
    }

    @Override // defpackage.oln
    public final abwf c() {
        return this.d;
    }

    @Override // defpackage.oln
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.oln
    public final boolean e() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.oln
            r2 = 0
            if (r1 == 0) goto L67
            oln r7 = (defpackage.oln) r7
            boolean r1 = r6.a
            boolean r3 = r7.d()
            if (r1 != r3) goto L67
            int r1 = r6.b
            int r3 = r7.a()
            if (r1 != r3) goto L67
            yyk r1 = r6.c
            yyk r3 = r7.b()
            boolean r1 = com.google.common.collect.Lists.d(r1, r3)
            if (r1 == 0) goto L67
            abwf r1 = r6.d
            abwf r3 = r7.c()
            if (r1 != r3) goto L30
            goto L4b
        L30:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 == r5) goto L3b
            goto L67
        L3b:
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L67
        L4b:
            boolean r1 = r6.e
            boolean r3 = r7.e()
            if (r1 != r3) goto L67
            boolean r1 = r6.f
            boolean r3 = r7.g()
            if (r1 != r3) goto L67
            boolean r1 = r6.g
            boolean r3 = r7.f()
            if (r1 != r3) goto L67
            r7.h()
            return r0
        L67:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oje.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.oln
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.oln
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        abwf abwfVar = this.d;
        if ((abwfVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(abwfVar.getClass()).b(abwfVar);
        } else {
            int iB2 = abwfVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(abwfVar.getClass()).b(abwfVar);
                abwfVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (((((((((iHashCode * 1000003) ^ iB) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        abwf abwfVar = this.d;
        return "GellerSyncExperimentalParams{enableGellerSyncRetry=" + this.a + ", maximumRetryAttemptsCount=" + this.b + ", gellerRetryableErrorCodes=" + this.c.toString() + ", gellerSyncRetryInitialDelay=" + abwfVar.toString() + ", enableRetrySyncRequiresCharging=" + this.e + ", enableRetrySyncRequiresUnmeteredNetwork=" + this.f + ", enableRetrySyncRequiresDeviceIdle=" + this.g + ", disableGellerSyncRetryForZwieback=false}";
    }

    @Override // defpackage.oln
    public final void h() {
    }
}
