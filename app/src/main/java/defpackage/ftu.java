package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftu {
    public static final fxr a;
    private final fxt b;
    private final fpg c;

    static {
        fxe fxeVar = fxe.a;
        a = fxs.b(fxs.a(fxi.h(new fxd()), 17), 1);
    }

    public ftu(fxt fxtVar, fpg fpgVar) {
        fxtVar.getClass();
        fpgVar.getClass();
        this.b = fxtVar;
        this.c = fpgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fts
            if (r0 == 0) goto L13
            r0 = r5
            fts r0 = (defpackage.fts) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fts r0 = new fts
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
            fpg r5 = r4.c
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L87
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
            if (r1 == 0) goto L86
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            fxe r1 = (defpackage.fxe) r1
            fwt r1 = r1.l
            if (r1 != 0) goto L78
            fwt r1 = defpackage.fwt.a
        L78:
            int r1 = r1.c
            fws r1 = defpackage.fws.b(r1)
            if (r1 != 0) goto L82
            fws r1 = defpackage.fws.UNRECOGNIZED
        L82:
            r0.put(r2, r1)
            goto L5c
        L86:
            return r0
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftu.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(final java.lang.String r6, final defpackage.fws r7, defpackage.agsw r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ftt
            if (r0 == 0) goto L13
            r0 = r8
            ftt r0 = (defpackage.ftt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ftt r0 = new ftt
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            agwe r6 = r0.d
            defpackage.agpl.b(r8)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.agpl.b(r8)
            agwe r8 = new agwe
            r8.<init>()
            fpg r2 = r5.c
            ftr r4 = new ftr
            r4.<init>()
            r0.d = r8
            r0.c = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L59
            r6 = r8
        L4b:
            boolean r6 = r6.a
            if (r6 == 0) goto L56
            fxt r6 = r5.b
            fxr r7 = defpackage.ftu.a
            r6.b(r7)
        L56:
            agpu r6 = defpackage.agpu.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftu.b(java.lang.String, fws, agsw):java.lang.Object");
    }
}
