package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyi extends pyk {
    private final pia a;
    private final pia b;

    public pyi(pia piaVar, pia piaVar2) {
        this.a = piaVar;
        this.b = piaVar2;
    }

    @Override // defpackage.pyk
    public final pia a() {
        return this.b;
    }

    @Override // defpackage.pyk
    public final pia b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
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
            boolean r1 = r7 instanceof defpackage.pyk
            r2 = 0
            if (r1 == 0) goto L69
            pyk r7 = (defpackage.pyk) r7
            pia r1 = r6.a
            if (r1 != 0) goto L16
            pia r1 = r7.b()
            if (r1 != 0) goto L67
            goto L38
        L16:
            pia r3 = r7.b()
            if (r1 == r3) goto L38
            if (r3 == 0) goto L67
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L67
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L67
        L38:
            pia r1 = r6.b
            if (r1 != 0) goto L43
            pia r7 = r7.a()
            if (r7 != 0) goto L67
            goto L68
        L43:
            pia r7 = r7.a()
            if (r1 == r7) goto L68
            if (r7 != 0) goto L4c
            goto L67
        L4c:
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r3 != r4) goto L67
            java.lang.Class r3 = r1.getClass()
            abza r4 = defpackage.abza.a
            abzj r3 = r4.a(r3)
            boolean r7 = r3.k(r1, r7)
            if (r7 == 0) goto L67
            goto L68
        L67:
            return r2
        L68:
            return r0
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        pia piaVar = this.a;
        int iB2 = 0;
        if (piaVar == null) {
            iB = 0;
        } else if ((piaVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(piaVar.getClass()).b(piaVar);
        } else {
            int iB3 = piaVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(piaVar.getClass()).b(piaVar);
                piaVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        pia piaVar2 = this.b;
        if (piaVar2 != null) {
            if ((piaVar2.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                iB2 = abza.a.a(piaVar2.getClass()).b(piaVar2);
            } else {
                iB2 = piaVar2.memoizedHashCode;
                if (iB2 == 0) {
                    iB2 = abza.a.a(piaVar2.getClass()).b(piaVar2);
                    piaVar2.memoizedHashCode = iB2;
                }
            }
        }
        return ((iB ^ 1000003) * 1000003) ^ iB2;
    }

    public final String toString() {
        pia piaVar = this.b;
        return "GroupPair{pendingGroup=" + String.valueOf(this.a) + ", downloadedGroup=" + String.valueOf(piaVar) + "}";
    }
}
