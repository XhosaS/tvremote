package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aob {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.File r4, defpackage.agux r5, defpackage.agsw r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof defpackage.aoa
            if (r0 == 0) goto L13
            r0 = r6
            aoa r0 = (defpackage.aoa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoa r0 = new aoa
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.agpl.b(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.agpl.b(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.a(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof defpackage.als
            if (r6 != 0) goto Laa
            ans r6 = defpackage.ans.a
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r0 = r4.exists()
            if (r0 == 0) goto La5
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L7f
            boolean r0 = r4.canRead()
            if (r0 == 0) goto L6f
            boolean r0 = r4.canWrite()
            if (r0 == 0) goto L6a
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        L6a:
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        L6f:
            boolean r0 = r4.canWrite()
            if (r0 == 0) goto L7a
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        L7a:
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        L7f:
            boolean r0 = r4.canRead()
            if (r0 == 0) goto L95
            boolean r0 = r4.canWrite()
            if (r0 == 0) goto L90
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        L90:
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        L95:
            boolean r0 = r4.canWrite()
            if (r0 == 0) goto La0
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        La0:
            java.io.IOException r4 = r6.a(r4, r5)
            goto La9
        La5:
            java.io.IOException r4 = r6.a(r4, r5)
        La9:
            throw r4
        Laa:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aob.a(java.io.File, agux, agsw):java.lang.Object");
    }
}
