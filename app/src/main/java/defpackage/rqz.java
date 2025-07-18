package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqz extends rra {
    private final ahpb a;
    private final yqt b;
    private final boolean c = false;

    public rqz(ahpb ahpbVar, yqt yqtVar, boolean z) {
        this.a = ahpbVar;
        this.b = yqtVar;
    }

    @Override // defpackage.rra
    public final yqt a() {
        return this.b;
    }

    @Override // defpackage.rra
    public final ahpb b() {
        return this.a;
    }

    @Override // defpackage.rra
    public final boolean c() {
        return false;
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
            boolean r1 = r7 instanceof defpackage.rra
            r2 = 0
            if (r1 == 0) goto L3e
            rra r7 = (defpackage.rra) r7
            ahpb r1 = r6.a
            ahpb r3 = r7.b()
            if (r1 != r3) goto L14
            goto L2e
        L14:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L3e
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L3e
        L2e:
            yqt r1 = r6.b
            yqt r3 = r7.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3e
            r7.c()
            return r0
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqz.equals(java.lang.Object):boolean");
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
        return ((((iB ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        yqt yqtVar = this.b;
        return "LoggedAppFlow{appFlow=" + this.a.toString() + ", loggedTimeMillis=" + yqtVar.toString() + ", sampledOut=false}";
    }
}
