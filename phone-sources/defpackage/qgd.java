package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgd {
    private static final tvn a = tvn.n("GnpSdk");
    private final qnr b;
    private final qja c;

    public qgd(qnr qnrVar, qja qjaVar) {
        qjaVar.getClass();
        this.b = qnrVar;
        this.c = qjaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r2 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0099 -> B:52:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009f -> B:52:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:52:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0112 -> B:48:0x0113). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.vku r19, defpackage.yih r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgd.a(vku, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.vku r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qgc
            if (r0 == 0) goto L13
            r0 = r6
            qgc r0 = (defpackage.qgc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qgc r0 = new qgc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.ybn.f(r6)
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            int r6 = r5.b
            r6 = r6 & 2
            if (r6 == 0) goto L43
            vmc r5 = r5.d
            if (r5 != 0) goto L40
            vmc r5 = defpackage.vmc.a
        L40:
            java.lang.String r5 = r5.d
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 == 0) goto Laa
            int r6 = r5.length()
            if (r6 != 0) goto L4d
            goto Laa
        L4d:
            qnr r6 = r4.b
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto La9
        L59:
            qdl r6 = (defpackage.qdl) r6
            boolean r0 = r6 instanceof defpackage.qdn
            if (r0 == 0) goto L8d
            qdn r6 = (defpackage.qdn) r6
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r6.next()
            qen r0 = (defpackage.qen) r0
            java.lang.String r1 = r0.i
            boolean r1 = defpackage.yks.e(r1, r5)
            if (r1 == 0) goto L69
            qdn r5 = new qdn
            r5.<init>(r0)
            return r5
        L83:
            qdj r5 = new qdj
            java.lang.String r6 = "An account with the requested RTID was not found in storage"
            r0 = 33
            r5.<init>(r6, r0)
            return r5
        L8d:
            boolean r5 = r6 instanceof defpackage.qdi
            if (r5 == 0) goto La3
            qdi r6 = (defpackage.qdi) r6
            tvn r5 = defpackage.qgd.a
            tuv r5 = r5.g()
            java.lang.Throwable r0 = r6.a()
            java.lang.String r1 = "Failed to fetch accounts from storage."
            defpackage.a.co(r5, r1, r0)
            return r6
        La3:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        La9:
            return r1
        Laa:
            tvn r5 = defpackage.qgd.a
            tuv r5 = r5.f()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r6 = "Representative target id in payload is empty, can't find account"
            r5.s(r6)
            qdj r5 = new qdj
            java.lang.String r6 = "Payload does not contain an RTID"
            r0 = 71
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgd.b(vku, yih):java.lang.Object");
    }
}
