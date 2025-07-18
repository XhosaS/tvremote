package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahgw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:13:0x002e, B:25:0x005d, B:29:0x0078, B:31:0x0080, B:18:0x0044, B:24:0x0054), top: B:47:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009a -> B:25:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ahgs r7, defpackage.ahgg r8, boolean r9, defpackage.agsw r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ahgv
            if (r0 == 0) goto L13
            r0 = r10
            ahgv r0 = (defpackage.ahgv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ahgv r0 = new ahgv
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r9 = r0.b
            ahff r7 = r0.f
            ahge r8 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r10)     // Catch: java.lang.Throwable -> L4c
            r10 = r7
            r7 = r2
            goto L5d
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            boolean r9 = r0.b
            ahff r7 = r0.f
            ahge r8 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r10)     // Catch: java.lang.Throwable -> L4c
            r6 = r0
            r0 = r7
            r7 = r2
        L4a:
            r2 = r6
            goto L78
        L4c:
            r7 = move-exception
            goto La7
        L4e:
            defpackage.agpl.b(r10)
            defpackage.ahhh.b(r7)
            r10 = r8
            ahfo r10 = (defpackage.ahfo) r10     // Catch: java.lang.Throwable -> L4c
            ahfn r10 = r10.b     // Catch: java.lang.Throwable -> L4c
            ahfp r10 = r10.n()     // Catch: java.lang.Throwable -> L4c
        L5d:
            r0.a = r7     // Catch: java.lang.Throwable -> L4c
            r2 = r8
            ahge r2 = (defpackage.ahge) r2     // Catch: java.lang.Throwable -> L4c
            r0.e = r2     // Catch: java.lang.Throwable -> L4c
            r2 = r10
            ahff r2 = (defpackage.ahff) r2     // Catch: java.lang.Throwable -> L4c
            r0.f = r2     // Catch: java.lang.Throwable -> L4c
            r0.b = r9     // Catch: java.lang.Throwable -> L4c
            r0.d = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L4c
            if (r2 != r1) goto L74
            goto L9d
        L74:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L4a
        L78:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L4c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r10 == 0) goto L9e
            java.lang.Object r10 = r0.b()     // Catch: java.lang.Throwable -> L4c
            r2.a = r7     // Catch: java.lang.Throwable -> L4c
            r5 = r8
            ahge r5 = (defpackage.ahge) r5     // Catch: java.lang.Throwable -> L4c
            r2.e = r5     // Catch: java.lang.Throwable -> L4c
            r5 = r0
            ahff r5 = (defpackage.ahff) r5     // Catch: java.lang.Throwable -> L4c
            r2.f = r5     // Catch: java.lang.Throwable -> L4c
            r2.b = r9     // Catch: java.lang.Throwable -> L4c
            r2.d = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r7.a(r10, r2)     // Catch: java.lang.Throwable -> L4c
            if (r10 == r1) goto L9d
            r10 = r0
            r0 = r2
            goto L5d
        L9d:
            return r1
        L9e:
            if (r9 == 0) goto La4
            r7 = 0
            defpackage.ahfx.a(r8, r7)
        La4:
            agpu r7 = defpackage.agpu.a
            return r7
        La7:
            throw r7     // Catch: java.lang.Throwable -> La8
        La8:
            r10 = move-exception
            if (r9 != 0) goto Lac
            goto Laf
        Lac:
            defpackage.ahfx.a(r8, r7)
        Laf:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgw.a(ahgs, ahgg, boolean, agsw):java.lang.Object");
    }
}
