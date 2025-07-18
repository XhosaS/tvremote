package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdw implements fdq {
    public static final fdr a = new fdr();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl");
    private final vrs c;
    private final agte d;
    private final gph e;

    public fdw(vrs vrsVar, agte agteVar, gph gphVar) {
        agteVar.getClass();
        this.c = vrsVar;
        this.d = agteVar;
        this.e = gphVar;
    }

    private final Object d(agsw agswVar) {
        return ahal.a(this.d, new fdv(null), agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.fds
            if (r0 == 0) goto L13
            r0 = r6
            fds r0 = (defpackage.fds) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fds r0 = new fds
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.agpl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r5.d(r0)
            if (r6 == r1) goto L6a
        L3a:
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            r0 = 0
            if (r6 == 0) goto L46
            fdr r1 = defpackage.fdw.a
            fcy r6 = r1.a(r6)
            goto L47
        L46:
            r6 = r0
        L47:
            if (r6 == 0) goto L50
            boolean r1 = r6.a()
            if (r1 != r3) goto L50
            return r6
        L50:
            zdy r6 = defpackage.fdw.b
            zeo r6 = r6.d()
            r1 = 97
            java.lang.String r2 = "LoadCastServiceInfoTaskImpl.kt"
            java.lang.String r3 = "com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl"
            java.lang.String r4 = "loadCastInfoFromCastService"
            zeo r6 = r6.q(r3, r4, r1, r2)
            zdv r6 = (defpackage.zdv) r6
            java.lang.String r1 = "Failed to get cast id and certificate from cast service."
            r6.u(r1)
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdw.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fdt
            if (r0 == 0) goto L13
            r0 = r5
            fdt r0 = (defpackage.fdt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdt r0 = new fdt
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            vrs r5 = r4.c
            fcx r2 = defpackage.fcx.a
            r0.c = r3
            java.lang.Object r5 = r2.a(r5, r0)
            if (r5 == r1) goto L64
        L3e:
            fcy r5 = (defpackage.fcy) r5
            if (r5 == 0) goto L49
            boolean r0 = r5.a()
            if (r0 != r3) goto L49
            return r5
        L49:
            zdy r5 = defpackage.fdw.b
            zeo r5 = r5.d()
            r0 = 89
            java.lang.String r1 = "LoadCastServiceInfoTaskImpl.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl"
            java.lang.String r3 = "loadCastInfoFromContentProvider"
            zeo r5 = r5.q(r2, r3, r0, r1)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r0 = "Failed to get cast id and certificate from Content Provider."
            r5.u(r0)
            r5 = 0
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdw.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.fdu
            if (r0 == 0) goto L13
            r0 = r10
            fdu r0 = (defpackage.fdu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdu r0 = new fdu
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            java.lang.String r3 = "loadCastServiceInfo"
            java.lang.String r4 = "com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl"
            r5 = 0
            r6 = 2
            r7 = 1
            java.lang.String r8 = "LoadCastServiceInfoTaskImpl.kt"
            if (r2 == 0) goto L3d
            if (r2 == r7) goto L39
            if (r2 != r6) goto L31
            defpackage.agpl.b(r10)
            goto L70
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            defpackage.agpl.b(r10)
            goto L48
        L3d:
            defpackage.agpl.b(r10)
            r0.c = r7
            java.lang.Object r10 = r9.d(r0)
            if (r10 == r1) goto La4
        L48:
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            if (r10 == 0) goto L53
            fdr r2 = defpackage.fdw.a
            fcy r10 = r2.a(r10)
            goto L54
        L53:
            r10 = r5
        L54:
            if (r10 == 0) goto L5e
            boolean r2 = r10.a()
            if (r2 == r7) goto L5d
            goto L5e
        L5d:
            return r10
        L5e:
            gph r10 = r9.e
            gph r2 = defpackage.gph.a
            if (r10 != r2) goto L90
            vrs r10 = r9.c
            fcx r2 = defpackage.fcx.a
            r0.c = r6
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 == r1) goto La4
        L70:
            fcy r10 = (defpackage.fcy) r10
            if (r10 == 0) goto L7c
            boolean r0 = r10.a()
            if (r0 == r7) goto L7b
            goto L7c
        L7b:
            return r10
        L7c:
            zdy r10 = defpackage.fdw.b
            zeo r10 = r10.b()
            r0 = 77
            zeo r10 = r10.q(r4, r3, r0, r8)
            zdv r10 = (defpackage.zdv) r10
            java.lang.String r0 = "Failed to get cast id and certificate from Content Provider."
            r10.u(r0)
            goto La3
        L90:
            zdy r10 = defpackage.fdw.b
            zeo r10 = r10.b()
            r0 = 79
            zeo r10 = r10.q(r4, r3, r0, r8)
            zdv r10 = (defpackage.zdv) r10
            java.lang.String r0 = "Failed to get cast id and certificate from cast service."
            r10.u(r0)
        La3:
            return r5
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdw.c(agsw):java.lang.Object");
    }
}
