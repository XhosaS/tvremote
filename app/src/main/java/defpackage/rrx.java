package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrx extends rru {
    public final ahpb a;
    public final boolean b = false;
    private final yzq c;
    private final rqp d;
    private final yyk e;

    public rrx(ahpb ahpbVar, yzq yzqVar, rqp rqpVar, boolean z, yyk yykVar) {
        this.a = ahpbVar;
        this.c = yzqVar;
        this.d = rqpVar;
        this.e = yykVar;
    }

    @Override // defpackage.rru
    public final rqp a() {
        return this.d;
    }

    @Override // defpackage.rru
    public final yyk c() {
        return this.e;
    }

    @Override // defpackage.rru
    public final yzq d() {
        return this.c;
    }

    @Override // defpackage.rru
    public final ahpb e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
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
            boolean r1 = r7 instanceof defpackage.rru
            r2 = 0
            if (r1 == 0) goto L56
            rru r7 = (defpackage.rru) r7
            ahpb r1 = r6.a
            ahpb r3 = r7.e()
            if (r1 != r3) goto L14
            goto L2e
        L14:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L56
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L56
        L2e:
            yzq r1 = r6.c
            yzq r3 = r7.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            rqp r1 = r6.d
            rqp r3 = r7.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            r7.f()
            yyk r1 = r6.e
            yyk r7 = r7.c()
            boolean r7 = com.google.common.collect.Lists.d(r1, r7)
            if (r7 == 0) goto L56
            return r0
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrx.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.rru
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        int iB;
        ahpb ahpbVar = this.a;
        if ((ahpbVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(ahpbVar.getClass()).b(ahpbVar);
        } else {
            int iB2 = ahpbVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(ahpbVar.getClass()).b(ahpbVar);
                ahpbVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return ((((((((iB ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        yyk yykVar = this.e;
        rqp rqpVar = this.d;
        yzq yzqVar = this.c;
        return "AppFlowLoggingData{appFlow=" + this.a.toString() + ", testCodes=" + yzqVar.toString() + ", appFlowType=" + rqpVar.toString() + ", sampledOut=false, globalMetadata=" + yykVar.toString() + "}";
    }
}
