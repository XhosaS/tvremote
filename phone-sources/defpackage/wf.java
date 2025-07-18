package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wf {
    public static final yka a = new ua((yih) null, 2, (char[]) null);

    public static final Object a(bte bteVar, yka ykaVar, yjv yjvVar, yih yihVar) {
        Object objK = yoz.k(new dxe(bteVar, ykaVar, yjvVar, new uz(bteVar), (yih) null, 1), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.btq r8, boolean r9, defpackage.bss r10, defpackage.yih r11) {
        /*
            boolean r0 = r11 instanceof defpackage.vy
            if (r0 == 0) goto L13
            r0 = r11
            vy r0 = (defpackage.vy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vy r0 = new vy
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r8 = r0.a
            bss r9 = r0.d
            btq r10 = r0.e
            defpackage.ybn.f(r11)
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            goto L4b
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            defpackage.ybn.f(r11)
        L3c:
            r0.e = r8
            r0.d = r10
            r0.a = r9
            r0.c = r3
            java.lang.Object r11 = r8.q(r10, r0)
            if (r11 != r1) goto L4b
            return r1
        L4b:
            bsr r11 = (defpackage.bsr) r11
            java.util.List r11 = r11.a
            int r2 = r11.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r2) goto L6e
            java.lang.Object r6 = r11.get(r5)
            bsz r6 = (defpackage.bsz) r6
            if (r9 == 0) goto L64
            boolean r6 = defpackage.bny.C(r6)
            goto L68
        L64:
            boolean r6 = defpackage.bny.D(r6)
        L68:
            if (r6 != 0) goto L6b
            goto L3c
        L6b:
            int r5 = r5 + 1
            goto L55
        L6e:
            java.lang.Object r8 = r11.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.b(btq, boolean, bss, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.btq r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.vz
            if (r0 == 0) goto L13
            r0 = r8
            vz r0 = (defpackage.vz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vz r0 = new vz
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            btq r7 = r0.c
            defpackage.ybn.f(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
        L34:
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = defpackage.bny.I(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            bsr r8 = (defpackage.bsr) r8
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L49:
            if (r5 >= r2) goto L57
            java.lang.Object r6 = r8.get(r5)
            bsz r6 = (defpackage.bsz) r6
            r6.b()
            int r5 = r5 + 1
            goto L49
        L57:
            int r2 = r8.size()
        L5b:
            if (r4 >= r2) goto L6b
            java.lang.Object r5 = r8.get(r4)
            bsz r5 = (defpackage.bsz) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L68
            goto L34
        L68:
            int r4 = r4 + 1
            goto L5b
        L6b:
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.c(btq, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.btq r7, defpackage.bss r8, defpackage.yih r9) {
        /*
            boolean r0 = r9 instanceof defpackage.wc
            if (r0 == 0) goto L13
            r0 = r9
            wc r0 = (defpackage.wc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wc r0 = new wc
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ylf r7 = r0.c
            defpackage.ybn.f(r9)     // Catch: defpackage.bst -> L5a
            goto L56
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r9)
            ylf r9 = new ylf
            r9.<init>()
            uk r2 = defpackage.uk.a
            r9.a = r2
            cds r2 = r7.p()     // Catch: defpackage.bst -> L5a
            long r4 = r2.g()     // Catch: defpackage.bst -> L5a
            wd r2 = new wd     // Catch: defpackage.bst -> L5a
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: defpackage.bst -> L5a
            r0.c = r9     // Catch: defpackage.bst -> L5a
            r0.b = r3     // Catch: defpackage.bst -> L5a
            java.lang.Object r7 = r7.r(r4, r2, r0)     // Catch: defpackage.bst -> L5a
            if (r7 == r1) goto L59
            r7 = r9
        L56:
            java.lang.Object r7 = r7.a
            return r7
        L59:
            return r1
        L5a:
            um r7 = defpackage.um.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.d(btq, bss, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b1 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.btq r17, defpackage.bss r18, defpackage.yih r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.e(btq, bss, yih):java.lang.Object");
    }

    public static /* synthetic */ Object g(bte bteVar, yka ykaVar, yjv yjvVar, yih yihVar, int i) {
        if ((i & 4) != 0) {
            ykaVar = a;
        }
        return j(bteVar, null, ykaVar, yjvVar, yihVar);
    }

    public static final Object j(bte bteVar, yjv yjvVar, yka ykaVar, yjv yjvVar2, yih yihVar) {
        Object objK = yoz.k(new dtj(bteVar, ykaVar, yjvVar, yjvVar2, (yih) null, 1), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }
}
