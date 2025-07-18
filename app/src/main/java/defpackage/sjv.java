package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjv extends sjs {
    public final zyd a;
    public final rvw b;
    public final zyd c;
    private final yqt d;
    private final yqt e;

    public sjv(zyd zydVar, rvw rvwVar, yqt yqtVar, zyd zydVar2, yqt yqtVar2) {
        if (zydVar == null) {
            throw new NullPointerException("Null audioRouteDisconnectStatus");
        }
        this.a = zydVar;
        if (rvwVar == null) {
            throw new NullPointerException("Null audioRouteType");
        }
        this.b = rvwVar;
        this.d = yqtVar;
        this.c = zydVar2;
        this.e = yqtVar2;
    }

    @Override // defpackage.sjs
    public final rvw a() {
        return this.b;
    }

    @Override // defpackage.sjs
    public final yqt c() {
        return this.d;
    }

    @Override // defpackage.sjs
    public final yqt d() {
        return this.e;
    }

    @Override // defpackage.sjs
    public final zyd e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
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
            boolean r1 = r7 instanceof defpackage.sjs
            r2 = 0
            if (r1 == 0) goto L60
            sjs r7 = (defpackage.sjs) r7
            zyd r1 = r6.a
            zyd r3 = r7.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            rvw r1 = r6.b
            rvw r3 = r7.a()
            if (r1 != r3) goto L20
            goto L3b
        L20:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 == r5) goto L2b
            goto L60
        L2b:
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L60
        L3b:
            yqt r1 = r6.d
            yqt r3 = r7.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            zyd r1 = r6.c
            zyd r3 = r7.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            yqt r1 = r6.e
            yqt r7 = r7.d()
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L60
            return r0
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjv.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.sjs
    public final zyd f() {
        return this.c;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = this.a.hashCode() ^ 1000003;
        rvw rvwVar = this.b;
        if ((rvwVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(rvwVar.getClass()).b(rvwVar);
        } else {
            int iB2 = rvwVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(rvwVar.getClass()).b(rvwVar);
                rvwVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (((((((iHashCode * 1000003) ^ iB) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "AudioRouteData{audioRouteDisconnectStatus=" + this.a.toString() + ", audioRouteType=" + this.b.toString() + ", handoffDataOptional=Optional.absent(), preferredDeviceId=" + this.c.toString() + ", routeRef=Optional.absent()}";
    }
}
