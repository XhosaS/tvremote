package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fug {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/user/accessors/ParentAccountAccessor");
    public static final fxr b;
    private final fxt c;
    private final fpg d;

    static {
        fxe fxeVar = fxe.a;
        b = fxs.a(fxi.h(new fxd()), 11);
    }

    public fug(fxt fxtVar, fpg fpgVar) {
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
    public final java.lang.Object a(java.lang.String r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fud
            if (r0 == 0) goto L13
            r0 = r6
            fud r0 = (defpackage.fud) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fud r0 = new fud
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.agpl.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.agpl.b(r6)
            fpg r6 = r4.d
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L59
        L40:
            fxg r6 = (defpackage.fxg) r6
            abyl r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            fxe r5 = (defpackage.fxe) r5
            if (r5 == 0) goto L53
            java.lang.String r5 = r5.m
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 != 0) goto L58
            java.lang.String r5 = ""
        L58:
            return r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fug.a(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fue
            if (r0 == 0) goto L13
            r0 = r5
            fue r0 = (defpackage.fue) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fue r0 = new fue
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
            fpg r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto Laf
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
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r1 = r0.size()
            int r1 = defpackage.agrj.b(r1)
            r5.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            fxe r1 = (defpackage.fxe) r1
            java.lang.String r1 = r1.m
            r5.put(r2, r1)
            goto L92
        Lae:
            return r5
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fug.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(final java.lang.String r6, final java.lang.String r7, defpackage.agsw r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.fuf
            if (r0 == 0) goto L13
            r0 = r8
            fuf r0 = (defpackage.fuf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fuf r0 = new fuf
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
            fpg r2 = r5.d
            fuc r4 = new fuc
            r4.<init>()
            r0.d = r8
            r0.c = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L59
            r6 = r8
        L4b:
            boolean r6 = r6.a
            if (r6 == 0) goto L56
            fxt r6 = r5.c
            fxr r7 = defpackage.fug.b
            r6.b(r7)
        L56:
            agpu r6 = defpackage.agpu.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fug.c(java.lang.String, java.lang.String, agsw):java.lang.Object");
    }
}
