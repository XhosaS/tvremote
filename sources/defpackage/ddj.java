package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddj extends czr implements cza {
    public final czb a;
    public final int b;

    public ddj(int i, czb czbVar) {
        this.a = czbVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ddj a(java.lang.Object r6) {
        /*
            if (r6 == 0) goto Lc1
            boolean r0 = r6 instanceof defpackage.ddj
            if (r0 == 0) goto L8
            goto Lc1
        L8:
            boolean r0 = r6 instanceof defpackage.dal
            if (r0 == 0) goto L92
            dal r6 = (defpackage.dal) r6
            int r0 = r6.c
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L88;
                case 1: goto L7a;
                case 2: goto L7a;
                case 3: goto L88;
                case 4: goto L6a;
                case 5: goto L88;
                case 6: goto L7a;
                case 7: goto L60;
                case 8: goto L21;
                default: goto L15;
            }
        L15:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown tag: "
            java.lang.String r0 = defpackage.b.e(r0, r1)
            r6.<init>(r0)
            throw r6
        L21:
            int r3 = r6.a
            ddj r4 = new ddj
            dam r5 = defpackage.czv.a
            r5 = 3
            if (r3 == r5) goto L54
            r5 = 4
            if (r3 == r5) goto L54
            int r3 = r6.b
            r5 = 128(0x80, float:1.8E-43)
            if (r3 != r5) goto L54
            czr r3 = r6.b()
            dab r3 = r3.p()
            boolean r5 = r3 instanceof defpackage.czv
            if (r5 != 0) goto L54
            czx r6 = defpackage.czx.f(r3)
            byte[] r6 = r6.b
            if (r6 == 0) goto L4c
            czv r6 = defpackage.czv.g(r6, r1)
            goto L5c
        L4c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "'contents' cannot be null"
            r6.<init>(r0)
            throw r6
        L54:
            dam r1 = defpackage.czv.a
            dab r6 = r1.d(r6, r2)
            czv r6 = (defpackage.czv) r6
        L5c:
            r4.<init>(r0, r6)
            return r4
        L60:
            ddj r1 = new ddj
            czx r6 = defpackage.czx.g(r6, r2)
            r1.<init>(r0, r6)
            return r1
        L6a:
            ddj r2 = new ddj
            int r3 = defpackage.dcp.b
            dag r6 = defpackage.dag.m(r6, r1)
            dcp r6 = defpackage.dcp.b(r6)
            r2.<init>(r0, r6)
            return r2
        L7a:
            ddj r1 = new ddj
            dam r3 = defpackage.czl.b
            dab r6 = r3.d(r6, r2)
            czl r6 = (defpackage.czl) r6
            r1.<init>(r0, r6)
            return r1
        L88:
            ddj r1 = new ddj
            dag r6 = defpackage.dag.m(r6, r2)
            r1.<init>(r0, r6)
            return r1
        L92:
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto La9
            byte[] r6 = (byte[]) r6     // Catch: java.io.IOException -> La1
            dab r6 = defpackage.dab.v(r6)     // Catch: java.io.IOException -> La1
            ddj r6 = a(r6)     // Catch: java.io.IOException -> La1
            return r6
        La1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unable to parse encoded general name"
            r6.<init>(r0)
            throw r6
        La9:
            java.lang.Class r6 = r6.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.getName()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "unknown object in getInstance: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        Lc1:
            ddj r6 = (defpackage.ddj) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddj.a(java.lang.Object):ddj");
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        int i = this.b;
        return new dbm(i == 4, i, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r2 = ": "
            r0.append(r2)
            r2 = 1
            if (r1 == r2) goto L33
            r2 = 2
            if (r1 == r2) goto L33
            r2 = 4
            if (r1 == r2) goto L25
            r2 = 6
            if (r1 == r2) goto L33
            czb r1 = r3.a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L25:
            czb r1 = r3.a
            dcp r1 = defpackage.dcp.b(r1)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L33:
            czb r1 = r3.a
            czl r1 = defpackage.czl.f(r1)
            java.lang.String r1 = r1.b()
            r0.append(r1)
        L40:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddj.toString():java.lang.String");
    }

    public ddj(dcp dcpVar) {
        this.a = dcpVar;
        this.b = 4;
    }

    public ddj() {
        this.b = 1;
        this.a = new czl("android-tv-remote-support@google.com");
    }
}
