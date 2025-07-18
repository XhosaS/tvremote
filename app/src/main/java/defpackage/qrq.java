package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrq extends qrx {
    public final ahvb a;
    public final yyk b;

    public qrq(ahvb ahvbVar, yyk yykVar) {
        if (ahvbVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = ahvbVar;
        if (yykVar == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = yykVar;
    }

    @Override // defpackage.qrx
    public final yyk a() {
        return this.b;
    }

    @Override // defpackage.qrx
    public final ahvb b() {
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
            boolean r1 = r7 instanceof defpackage.qrx
            r2 = 0
            if (r1 == 0) goto L3b
            qrx r7 = (defpackage.qrx) r7
            ahvb r1 = r6.a
            ahvb r3 = r7.b()
            if (r1 != r3) goto L14
            goto L2e
        L14:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L3b
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L3b
        L2e:
            yyk r1 = r6.b
            yyk r7 = r7.a()
            boolean r7 = com.google.common.collect.Lists.d(r1, r7)
            if (r7 == 0) goto L3b
            return r0
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        ahvb ahvbVar = this.a;
        if ((ahvbVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(ahvbVar.getClass()).b(ahvbVar);
        } else {
            int iB2 = ahvbVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(ahvbVar.getClass()).b(ahvbVar);
                ahvbVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return ((iB ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        yyk yykVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + yykVar.toString() + "}";
    }
}
