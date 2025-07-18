package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mao extends mbs {
    public final adot a;
    public final yqt b;
    public final yqt c;
    private final yqt d;

    public mao(adot adotVar, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        this.a = adotVar;
        this.b = yqtVar;
        this.c = yqtVar2;
        this.d = yqtVar3;
    }

    @Override // defpackage.mbs
    public final yqt a() {
        return this.d;
    }

    @Override // defpackage.mbs
    public final yqt b() {
        return this.c;
    }

    @Override // defpackage.mbs
    public final yqt c() {
        return this.b;
    }

    @Override // defpackage.mbs
    public final adot d() {
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
            boolean r1 = r7 instanceof defpackage.mbs
            r2 = 0
            if (r1 == 0) goto L53
            mbs r7 = (defpackage.mbs) r7
            adot r1 = r6.a
            adot r3 = r7.d()
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
            yqt r1 = r6.b
            yqt r3 = r7.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L53
            yqt r1 = r6.c
            yqt r3 = r7.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L53
            yqt r1 = r6.d
            yqt r7 = r7.a()
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        adot adotVar = this.a;
        if ((adotVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(adotVar.getClass()).b(adotVar);
        } else {
            int iB2 = adotVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(adotVar.getClass()).b(adotVar);
                adotVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return ((((((iB ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "SodaInitParams{sodaCoreConfig=" + this.a.toString() + ", sodaTransportFactory=" + String.valueOf(this.b) + ", sodaDataProvider=" + String.valueOf(this.c) + ", sodaApaAppFlow=Optional.absent()}";
    }
}
