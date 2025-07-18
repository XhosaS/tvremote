package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoo {
    public float a = 6.0f;
    public float b = 12.0f;
    public float c = 8.0f;
    public float d = 8.0f;
    public final mr e = new mr(new cma(6.0f), pm.c, null, 12);
    private wq f;
    private wq g;

    private final float c(wq wqVar) {
        return wqVar instanceof ws ? this.b : wqVar instanceof wn ? this.c : wqVar instanceof wl ? this.d : this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r8v1, types: [wq] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.wq r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aom
            if (r0 == 0) goto L13
            r0 = r9
            aom r0 = (defpackage.aom) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aom r0 = new aom
            r0.<init>(r7, r9)
        L18:
            r5 = r0
            java.lang.Object r9 = r5.b
            yio r0 = defpackage.yio.a
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r5.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L2b
            goto Lb0
        L2b:
            r0 = move-exception
            r9 = r0
            goto Lb5
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.ybn.f(r9)
            float r9 = r7.c(r8)
            r7.g = r8
            mr r1 = r7.e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r1.c()     // Catch: java.lang.Throwable -> L2b
            cma r3 = (defpackage.cma) r3     // Catch: java.lang.Throwable -> L2b
            float r3 = r3.a     // Catch: java.lang.Throwable -> L2b
            boolean r3 = defpackage.cma.b(r3, r9)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto Lb0
            wq r3 = r7.f     // Catch: java.lang.Throwable -> L2b
            r5.a = r8     // Catch: java.lang.Throwable -> L2b
            r5.d = r2     // Catch: java.lang.Throwable -> L2b
            pk r2 = defpackage.aoj.a     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r8 == 0) goto L73
            boolean r3 = r8 instanceof defpackage.ws     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L62
            pk r2 = defpackage.aoj.a     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L62:
            boolean r3 = r8 instanceof defpackage.wj     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L69
        L66:
            pk r2 = defpackage.aoj.a     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L69:
            boolean r3 = r8 instanceof defpackage.wn     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L6e
            goto L66
        L6e:
            boolean r3 = r8 instanceof defpackage.wl     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L8d
            goto L66
        L73:
            if (r3 == 0) goto L8d
            boolean r4 = r3 instanceof defpackage.ws     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L7c
        L79:
            pk r2 = defpackage.aoj.b     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L7c:
            boolean r4 = r3 instanceof defpackage.wj     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L81
            goto L79
        L81:
            boolean r4 = r3 instanceof defpackage.wn     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L88
            pk r2 = defpackage.aoj.c     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L88:
            boolean r3 = r3 instanceof defpackage.wl     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L8d
            goto L79
        L8d:
            r3 = r2
            if (r3 == 0) goto La1
            cma r2 = new cma     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r6 = 12
            java.lang.Object r9 = defpackage.mr.j(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
            if (r9 == r0) goto Lad
        L9e:
            ygi r9 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L2b
            goto Lad
        La1:
            cma r2 = new cma     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r9 = r1.e(r2, r5)     // Catch: java.lang.Throwable -> L2b
            if (r9 == r0) goto Lad
            goto L9e
        Lad:
            if (r9 != r0) goto Lb0
            return r0
        Lb0:
            r7.f = r8
            ygi r8 = defpackage.ygi.a
            return r8
        Lb5:
            r7.f = r8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoo.a(wq, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aon
            if (r0 == 0) goto L13
            r0 = r6
            aon r0 = (defpackage.aon) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aon r0 = new aon
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L27
            goto L57
        L27:
            r6 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ybn.f(r6)
            wq r6 = r5.g
            float r6 = r5.c(r6)
            mr r2 = r5.e
            java.lang.Object r4 = r2.c()
            cma r4 = (defpackage.cma) r4
            float r4 = r4.a
            boolean r4 = defpackage.cma.b(r4, r6)
            if (r4 != 0) goto L62
            cma r4 = new cma     // Catch: java.lang.Throwable -> L27
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L5c
        L57:
            wq r6 = r5.g
            r5.f = r6
            goto L62
        L5c:
            return r1
        L5d:
            wq r0 = r5.g
            r5.f = r0
            throw r6
        L62:
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoo.b(yih):java.lang.Object");
    }
}
