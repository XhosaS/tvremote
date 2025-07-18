package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojb extends ojh {
    public final acfv a;
    public final acfz b;

    public ojb(acfv acfvVar, acfz acfzVar) {
        if (acfvVar == null) {
            throw new NullPointerException("Null batchSyncRequest");
        }
        this.a = acfvVar;
        if (acfzVar == null) {
            throw new NullPointerException("Null batchSyncResponse");
        }
        this.b = acfzVar;
    }

    @Override // defpackage.ojh
    public final acfv a() {
        return this.a;
    }

    @Override // defpackage.ojh
    public final acfz b() {
        return this.b;
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
            boolean r1 = r7 instanceof defpackage.ojh
            r2 = 0
            if (r1 == 0) goto L53
            ojh r7 = (defpackage.ojh) r7
            acfv r1 = r6.a
            acfv r3 = r7.a()
            if (r1 != r3) goto L14
            goto L2e
        L14:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L53
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L53
        L2e:
            acfz r1 = r6.b
            acfz r7 = r7.b()
            if (r1 != r7) goto L37
            goto L52
        L37:
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r3 == r4) goto L42
            goto L53
        L42:
            java.lang.Class r3 = r1.getClass()
            abza r4 = defpackage.abza.a
            abzj r3 = r4.a(r3)
            boolean r7 = r3.k(r1, r7)
            if (r7 == 0) goto L53
        L52:
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        int iB2;
        acfv acfvVar = this.a;
        if ((acfvVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(acfvVar.getClass()).b(acfvVar);
        } else {
            int iB3 = acfvVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(acfvVar.getClass()).b(acfvVar);
                acfvVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        acfz acfzVar = this.b;
        if ((Integer.MIN_VALUE & acfzVar.memoizedSerializedSize) != 0) {
            iB2 = abza.a.a(acfzVar.getClass()).b(acfzVar);
        } else {
            int iB4 = acfzVar.memoizedHashCode;
            if (iB4 == 0) {
                iB4 = abza.a.a(acfzVar.getClass()).b(acfzVar);
                acfzVar.memoizedHashCode = iB4;
            }
            iB2 = iB4;
        }
        return ((iB ^ 1000003) * 1000003) ^ iB2;
    }

    public final String toString() {
        acfz acfzVar = this.b;
        return "BatchSyncResult{batchSyncRequest=" + this.a.toString() + ", batchSyncResponse=" + acfzVar.toString() + "}";
    }
}
