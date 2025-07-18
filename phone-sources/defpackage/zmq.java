package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmq extends zix implements zig {
    public final zih a;
    public final int b;

    public zmq(int i, zih zihVar) {
        this.a = zihVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zmq a(java.lang.Object r6) {
        /*
            if (r6 == 0) goto Lc1
            boolean r0 = r6 instanceof defpackage.zmq
            if (r0 == 0) goto L8
            goto Lc1
        L8:
            boolean r0 = r6 instanceof defpackage.zjr
            if (r0 == 0) goto L92
            zjr r6 = (defpackage.zjr) r6
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
            java.lang.String r0 = defpackage.a.cf(r0, r1)
            r6.<init>(r0)
            throw r6
        L21:
            int r3 = r6.a
            zmq r4 = new zmq
            zjs r5 = defpackage.zjb.a
            r5 = 3
            if (r3 == r5) goto L54
            r5 = 4
            if (r3 == r5) goto L54
            int r3 = r6.b
            r5 = 128(0x80, float:1.8E-43)
            if (r3 != r5) goto L54
            zix r3 = r6.b()
            zjh r3 = r3.p()
            boolean r5 = r3 instanceof defpackage.zjb
            if (r5 != 0) goto L54
            zjd r6 = defpackage.zjd.f(r3)
            byte[] r6 = r6.b
            if (r6 == 0) goto L4c
            zjb r6 = defpackage.zjb.g(r6, r1)
            goto L5c
        L4c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "'contents' cannot be null"
            r6.<init>(r0)
            throw r6
        L54:
            zjs r1 = defpackage.zjb.a
            zjh r6 = r1.d(r6, r2)
            zjb r6 = (defpackage.zjb) r6
        L5c:
            r4.<init>(r0, r6)
            return r4
        L60:
            zmq r1 = new zmq
            zjd r6 = defpackage.zjd.g(r6, r2)
            r1.<init>(r0, r6)
            return r1
        L6a:
            zmq r2 = new zmq
            int r3 = defpackage.zlw.b
            zjm r6 = defpackage.zjm.m(r6, r1)
            zlw r6 = defpackage.zlw.b(r6)
            r2.<init>(r0, r6)
            return r2
        L7a:
            zmq r1 = new zmq
            zjs r3 = defpackage.zir.b
            zjh r6 = r3.d(r6, r2)
            zir r6 = (defpackage.zir) r6
            r1.<init>(r0, r6)
            return r1
        L88:
            zmq r1 = new zmq
            zjm r6 = defpackage.zjm.m(r6, r2)
            r1.<init>(r0, r6)
            return r1
        L92:
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto La9
            byte[] r6 = (byte[]) r6     // Catch: java.io.IOException -> La1
            zjh r6 = defpackage.zjh.v(r6)     // Catch: java.io.IOException -> La1
            zmq r6 = a(r6)     // Catch: java.io.IOException -> La1
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
            zmq r6 = (defpackage.zmq) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmq.a(java.lang.Object):zmq");
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        int i = this.b;
        return new zks(i == 4, i, this.a);
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
            zih r1 = r3.a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L25:
            zih r1 = r3.a
            zlw r1 = defpackage.zlw.b(r1)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L33:
            zih r1 = r3.a
            zir r1 = defpackage.zir.f(r1)
            java.lang.String r1 = r1.b()
            r0.append(r1)
        L40:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmq.toString():java.lang.String");
    }

    public zmq(zlw zlwVar) {
        this.a = zlwVar;
        this.b = 4;
    }

    public zmq() {
        this.b = 1;
        this.a = new zir("android-tv-remote-support@google.com");
    }
}
