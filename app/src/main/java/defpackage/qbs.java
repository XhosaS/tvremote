package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbs extends qbu {
    private final zqv a;
    private final zqf b;

    public qbs(zqv zqvVar, zqf zqfVar) {
        if (zqvVar == null) {
            throw new NullPointerException("Null fileGroupStatus");
        }
        this.a = zqvVar;
        if (zqfVar == null) {
            throw new NullPointerException("Null fileGroupDetails");
        }
        this.b = zqfVar;
    }

    @Override // defpackage.qbu
    public final zqf a() {
        return this.b;
    }

    @Override // defpackage.qbu
    public final zqv b() {
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
            boolean r1 = r7 instanceof defpackage.qbu
            r2 = 0
            if (r1 == 0) goto L53
            qbu r7 = (defpackage.qbu) r7
            zqv r1 = r6.a
            zqv r3 = r7.b()
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
            zqf r1 = r6.b
            zqf r7 = r7.a()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        int iB2;
        zqv zqvVar = this.a;
        if ((zqvVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(zqvVar.getClass()).b(zqvVar);
        } else {
            int iB3 = zqvVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(zqvVar.getClass()).b(zqvVar);
                zqvVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        zqf zqfVar = this.b;
        if ((Integer.MIN_VALUE & zqfVar.memoizedSerializedSize) != 0) {
            iB2 = abza.a.a(zqfVar.getClass()).b(zqfVar);
        } else {
            int iB4 = zqfVar.memoizedHashCode;
            if (iB4 == 0) {
                iB4 = abza.a.a(zqfVar.getClass()).b(zqfVar);
                zqfVar.memoizedHashCode = iB4;
            }
            iB2 = iB4;
        }
        return ((iB ^ 1000003) * 1000003) ^ iB2;
    }

    public final String toString() {
        zqf zqfVar = this.b;
        return "FileGroupStatusWithDetails{fileGroupStatus=" + this.a.toString() + ", fileGroupDetails=" + zqfVar.toString() + "}";
    }
}
