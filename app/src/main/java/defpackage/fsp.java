package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsp {
    public static final fxr a;
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/datastore/user/accessors/GlobalAccountsAccessor");
    private final fxt c;
    private final fpg d;

    static {
        fxg fxgVar = fxg.a;
        a = fxs.a(fxh.a(new fxc()), 5);
    }

    public fsp(fxt fxtVar, fpg fpgVar) {
        fxtVar.getClass();
        fpgVar.getClass();
        this.c = fxtVar;
        this.d = fpgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fsn
            if (r0 == 0) goto L13
            r0 = r5
            fsn r0 = (defpackage.fsn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fsn r0 = new fsn
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
            fpg r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            fxg r5 = (defpackage.fxg) r5
            abxs r5 = r5.c
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsp.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(final java.util.List r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fso
            if (r0 == 0) goto L13
            r0 = r9
            fso r0 = (defpackage.fso) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fso r0 = new fso
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r9)
            goto L5f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.agpl.b(r9)
            zdy r9 = defpackage.fsp.b
            zeo r9 = r9.b()
            r2 = 29
            java.lang.String r4 = "GlobalAccountsAccessor.kt"
            java.lang.String r5 = "com/google/android/apps/tvsearch/datastore/user/accessors/GlobalAccountsAccessor"
            java.lang.String r6 = "writeAccounts"
            zeo r9 = r9.q(r5, r6, r2, r4)
            zdv r9 = (defpackage.zdv) r9
            int r2 = r8.size()
            java.lang.String r4 = "Writing %d accounts"
            r9.v(r4, r2)
            fpg r9 = r7.d
            fsm r2 = new fsm
            r2.<init>()
            r0.c = r3
            java.lang.Object r8 = r9.b(r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            fxt r8 = r7.c
            fxr r9 = defpackage.fsp.a
            r8.b(r9)
            agpu r8 = defpackage.agpu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsp.b(java.util.List, agsw):java.lang.Object");
    }
}
