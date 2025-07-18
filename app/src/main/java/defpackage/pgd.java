package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgd extends pgb {
    public final pgr a;
    public final yqt b;
    public final yqt c;

    public pgd(pgr pgrVar, yqt yqtVar, yqt yqtVar2) {
        this.a = pgrVar;
        this.b = yqtVar;
        this.c = yqtVar2;
    }

    @Override // defpackage.pgb
    public final pgr a() {
        return this.a;
    }

    @Override // defpackage.pgb
    public final yqt b() {
        return this.b;
    }

    @Override // defpackage.pgb
    public final yqt c() {
        return this.c;
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
            boolean r1 = r7 instanceof defpackage.pgb
            r2 = 0
            if (r1 == 0) goto L47
            pgb r7 = (defpackage.pgb) r7
            pgr r1 = r6.a
            pgr r3 = r7.a()
            if (r1 != r3) goto L14
            goto L2e
        L14:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L47
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L47
        L2e:
            yqt r1 = r6.b
            yqt r3 = r7.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L47
            yqt r1 = r6.c
            yqt r7 = r7.c()
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L47
            return r0
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        pgr pgrVar = this.a;
        if ((pgrVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(pgrVar.getClass()).b(pgrVar);
        } else {
            int iB2 = pgrVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(pgrVar.getClass()).b(pgrVar);
                pgrVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return ((((iB ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "AddFileGroupRequest{dataFileGroup=" + this.a.toString() + ", accountOptional=Optional.absent(), variantIdOptional=Optional.absent()}";
    }
}
