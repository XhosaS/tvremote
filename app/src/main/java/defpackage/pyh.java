package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyh extends pyj {
    private final piy a;
    private final pia b;

    public pyh(piy piyVar, pia piaVar) {
        if (piyVar == null) {
            throw new NullPointerException("Null groupKey");
        }
        this.a = piyVar;
        if (piaVar == null) {
            throw new NullPointerException("Null dataFileGroup");
        }
        this.b = piaVar;
    }

    @Override // defpackage.pyj
    public final pia a() {
        return this.b;
    }

    @Override // defpackage.pyj
    public final piy b() {
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
            boolean r1 = r7 instanceof defpackage.pyj
            r2 = 0
            if (r1 == 0) goto L53
            pyj r7 = (defpackage.pyj) r7
            piy r1 = r6.a
            piy r3 = r7.b()
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
            pia r1 = r6.b
            pia r7 = r7.a()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        int iB2;
        piy piyVar = this.a;
        if ((piyVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(piyVar.getClass()).b(piyVar);
        } else {
            int iB3 = piyVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(piyVar.getClass()).b(piyVar);
                piyVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        pia piaVar = this.b;
        if ((Integer.MIN_VALUE & piaVar.memoizedSerializedSize) != 0) {
            iB2 = abza.a.a(piaVar.getClass()).b(piaVar);
        } else {
            int iB4 = piaVar.memoizedHashCode;
            if (iB4 == 0) {
                iB4 = abza.a.a(piaVar.getClass()).b(piaVar);
                piaVar.memoizedHashCode = iB4;
            }
            iB2 = iB4;
        }
        return ((iB ^ 1000003) * 1000003) ^ iB2;
    }

    public final String toString() {
        pia piaVar = this.b;
        return "GroupKeyAndGroup{groupKey=" + this.a.toString() + ", dataFileGroup=" + piaVar.toString() + "}";
    }
}
