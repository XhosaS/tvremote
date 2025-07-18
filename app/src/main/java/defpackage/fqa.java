package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqa {
    public static final fxr a;
    public static final fxr b;
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/datastore/user/accessors/AccountAccessor");
    private static final fxr d;
    private final fxt e;
    private final fpg f;

    static {
        fxg fxgVar = fxg.a;
        a = fxs.a(fxh.a(new fxc()), 1);
        d = fxs.a(fxh.a(new fxc()), 16);
        b = fxs.a(fxh.a(new fxc()), 2);
    }

    public fqa(fxt fxtVar, fpg fpgVar) {
        fxtVar.getClass();
        fpgVar.getClass();
        this.e = fxtVar;
        this.f = fpgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(final java.lang.String r6, defpackage.agsw r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fpt
            if (r0 == 0) goto L13
            r0 = r7
            fpt r0 = (defpackage.fpt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpt r0 = new fpt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            agwe r6 = r0.d
            defpackage.agpl.b(r7)
            goto L51
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.agpl.b(r7)
            boolean r7 = defpackage.gts.a(r6)
            if (r7 == 0) goto L77
            agwe r7 = new agwe
            r7.<init>()
            fpg r2 = r5.f
            fpq r4 = new fpq
            r4.<init>()
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L76
            r6 = r7
        L51:
            boolean r6 = r6.a
            if (r6 == 0) goto L77
            zdy r6 = defpackage.fqa.c
            zeo r6 = r6.b()
            r7 = 33
            java.lang.String r0 = "AccountAccessor.kt"
            java.lang.String r1 = "com/google/android/apps/tvsearch/datastore/user/accessors/AccountAccessor"
            java.lang.String r2 = "addAccount"
            zeo r6 = r6.q(r1, r2, r7, r0)
            zdv r6 = (defpackage.zdv) r6
            java.lang.String r7 = "Accounts changed after adding account, notifying listeners"
            r6.u(r7)
            fxt r6 = r5.e
            fxr r7 = defpackage.fqa.a
            r6.b(r7)
            goto L77
        L76:
            return r1
        L77:
            agpu r6 = defpackage.agpu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.a(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(final java.lang.String r7, final java.lang.String r8, defpackage.agsw r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.fpu
            if (r0 == 0) goto L13
            r0 = r9
            fpu r0 = (defpackage.fpu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpu r0 = new fpu
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            agwe r7 = r0.d
            defpackage.agpl.b(r9)
            goto L99
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.agpl.b(r9)
            boolean r9 = defpackage.gts.a(r7)
            java.lang.String r2 = "addAlternativeAccountName"
            java.lang.String r4 = "com/google/android/apps/tvsearch/datastore/user/accessors/AccountAccessor"
            java.lang.String r5 = "AccountAccessor.kt"
            if (r9 != 0) goto L5e
            zdy r7 = defpackage.fqa.c
            zeo r7 = r7.d()
            zdv r7 = (defpackage.zdv) r7
            zfc r8 = defpackage.zfc.MEDIUM
            zeo r7 = r7.r(r8)
            r8 = 66
            zeo r7 = r7.q(r4, r2, r8, r5)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "Invalid account name"
            r7.u(r8)
            agpu r7 = defpackage.agpu.a
            return r7
        L5e:
            boolean r9 = defpackage.gts.a(r8)
            if (r9 != 0) goto L82
            zdy r7 = defpackage.fqa.c
            zeo r7 = r7.d()
            zdv r7 = (defpackage.zdv) r7
            zfc r8 = defpackage.zfc.MEDIUM
            zeo r7 = r7.r(r8)
            r8 = 71
            zeo r7 = r7.q(r4, r2, r8, r5)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "Invalid alternative name"
            r7.u(r8)
            agpu r7 = defpackage.agpu.a
            return r7
        L82:
            agwe r9 = new agwe
            r9.<init>()
            fpg r2 = r6.f
            fpr r4 = new fpr
            r4.<init>()
            r0.d = r9
            r0.c = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 == r1) goto La7
            r7 = r9
        L99:
            boolean r7 = r7.a
            if (r7 == 0) goto La4
            fxt r7 = r6.e
            fxr r8 = defpackage.fqa.d
            r7.b(r8)
        La4:
            agpu r7 = defpackage.agpu.a
            return r7
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.b(java.lang.String, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fpv
            if (r0 == 0) goto L13
            r0 = r5
            fpv r0 = (defpackage.fpv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpv r0 = new fpv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fpg r5 = r4.f
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L79
        L3c:
            fxg r5 = (defpackage.fxg) r5
            abyl r5 = r5.b
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r5)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.size()
            int r1 = defpackage.agrj.b(r1)
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            fxe r1 = (defpackage.fxe) r1
            abxs r1 = r1.c
            r0.put(r2, r1)
            goto L5c
        L78:
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.c(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fpw
            if (r0 == 0) goto L13
            r0 = r5
            fpw r0 = (defpackage.fpw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpw r0 = new fpw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fpg r5 = r4.f
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto La9
        L3c:
            fxg r5 = (defpackage.fxg) r5
            abyl r5 = r5.b
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r5)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L54:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            fxe r2 = (defpackage.fxe) r2
            java.lang.String r2 = r2.m
            r2.getClass()
            int r2 = r2.length()
            if (r2 <= 0) goto L54
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L54
        L7d:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r5.add(r1)
            goto L8e
        La4:
            java.util.Set r5 = defpackage.agqq.A(r5)
            return r5
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.d(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fpx
            if (r0 == 0) goto L13
            r0 = r5
            fpx r0 = (defpackage.fpx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpx r0 = new fpx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fpg r5 = r4.f
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            fxg r5 = (defpackage.fxg) r5
            java.lang.String r5 = r5.d
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.e(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(final java.lang.String r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fpy
            if (r0 == 0) goto L13
            r0 = r8
            fpy r0 = (defpackage.fpy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpy r0 = new fpy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            agwe r7 = r0.e
            agwe r0 = r0.d
            defpackage.agpl.b(r8)
            goto L5b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.agpl.b(r8)
            int r8 = r7.length()
            if (r8 == 0) goto L9f
            agwe r8 = new agwe
            r8.<init>()
            agwe r2 = new agwe
            r2.<init>()
            fpg r4 = r6.f
            fpp r5 = new fpp
            r5.<init>()
            r0.d = r8
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r4.b(r5, r0)
            if (r7 == r1) goto L9e
            r0 = r8
            r7 = r2
        L5b:
            boolean r8 = r0.a
            java.lang.String r0 = "removeAccount"
            java.lang.String r1 = "com/google/android/apps/tvsearch/datastore/user/accessors/AccountAccessor"
            java.lang.String r2 = "AccountAccessor.kt"
            if (r8 == 0) goto L7f
            zdy r8 = defpackage.fqa.c
            zeo r8 = r8.b()
            r3 = 55
            zeo r8 = r8.q(r1, r0, r3, r2)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r3 = "Accounts changed after removing account, notifying listeners"
            r8.u(r3)
            fxt r8 = r6.e
            fxr r3 = defpackage.fqa.a
            r8.b(r3)
        L7f:
            boolean r7 = r7.a
            if (r7 == 0) goto L9f
            zdy r7 = defpackage.fqa.c
            zeo r7 = r7.b()
            r8 = 59
            zeo r7 = r7.q(r1, r0, r8, r2)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "Search account changed after removing account, notifying listeners"
            r7.u(r8)
            fxt r7 = r6.e
            fxr r8 = defpackage.fqa.b
            r7.b(r8)
            goto L9f
        L9e:
            return r1
        L9f:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.f(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(final java.lang.String r9, defpackage.agsw r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.fpz
            if (r0 == 0) goto L13
            r0 = r10
            fpz r0 = (defpackage.fpz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpz r0 = new fpz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            java.lang.String r3 = "writeSearchAccountName"
            java.lang.String r4 = "com/google/android/apps/tvsearch/datastore/user/accessors/AccountAccessor"
            r5 = 1
            java.lang.String r6 = "AccountAccessor.kt"
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            agwe r9 = r0.d
            defpackage.agpl.b(r10)
            goto L7c
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            defpackage.agpl.b(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L65
            boolean r10 = defpackage.gts.a(r9)
            if (r10 == 0) goto L47
            goto L65
        L47:
            zdy r9 = defpackage.fqa.c
            zeo r9 = r9.d()
            zdv r9 = (defpackage.zdv) r9
            zfc r10 = defpackage.zfc.MEDIUM
            zeo r9 = r9.r(r10)
            r10 = 155(0x9b, float:2.17E-43)
            zeo r9 = r9.q(r4, r3, r10, r6)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r10 = "SearchAccount should be a valid name or an empty string."
            r9.u(r10)
            agpu r9 = defpackage.agpu.a
            return r9
        L65:
            agwe r10 = new agwe
            r10.<init>()
            fpg r2 = r8.f
            fps r7 = new fps
            r7.<init>()
            r0.d = r10
            r0.c = r5
            java.lang.Object r9 = r2.b(r7, r0)
            if (r9 == r1) goto L9d
            r9 = r10
        L7c:
            boolean r9 = r9.a
            if (r9 == 0) goto L9a
            zdy r9 = defpackage.fqa.c
            zeo r9 = r9.b()
            r10 = 165(0xa5, float:2.31E-43)
            zeo r9 = r9.q(r4, r3, r10, r6)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r10 = "Writing search account to PDS, notifying listeners"
            r9.u(r10)
            fxt r9 = r8.e
            fxr r10 = defpackage.fqa.b
            r9.b(r10)
        L9a:
            agpu r9 = defpackage.agpu.a
            return r9
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.g(java.lang.String, agsw):java.lang.Object");
    }
}
