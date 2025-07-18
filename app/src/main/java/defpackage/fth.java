package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fth {
    public static final fxr a;
    private final fxt b;
    private final fpg c;

    static {
        fxg fxgVar = fxg.a;
        a = fxs.b(fxs.b(fxs.a(fxh.a(new fxc()), 1), 14), 2);
    }

    public fth(fxt fxtVar, fpg fpgVar) {
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
            boolean r0 = r5 instanceof defpackage.fte
            if (r0 == 0) goto L13
            r0 = r5
            fte r0 = (defpackage.fte) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fte r0 = new fte
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
            if (r5 == r1) goto Lbd
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
            if (r1 == 0) goto L80
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            fxe r2 = (defpackage.fxe) r2
            fwp r2 = r2.k
            if (r2 != 0) goto L6c
            fwp r2 = defpackage.fwp.a
        L6c:
            abxs r2 = r2.b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L54
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L54
        L80:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L91:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            fxe r1 = (defpackage.fxe) r1
            fwp r1 = r1.k
            if (r1 != 0) goto Lad
            fwp r1 = defpackage.fwp.a
        Lad:
            abxs r1 = r1.b
            agpi r3 = new agpi
            r3.<init>(r2, r1)
            r5.add(r3)
            goto L91
        Lb8:
            java.util.Map r5 = defpackage.agrj.f(r5)
            return r5
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fth.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ftf
            if (r0 == 0) goto L13
            r0 = r6
            ftf r0 = (defpackage.ftf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ftf r0 = new ftf
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
            fpg r6 = r4.c
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L61
        L40:
            fxg r6 = (defpackage.fxg) r6
            abyl r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            fxe r5 = (defpackage.fxe) r5
            r6 = 0
            if (r5 == 0) goto L5b
            fwp r5 = r5.k
            if (r5 != 0) goto L57
            fwp r5 = defpackage.fwp.a
        L57:
            if (r5 == 0) goto L5b
            abxs r6 = r5.b
        L5b:
            if (r6 != 0) goto L60
            agrd r5 = defpackage.agrd.a
            return r5
        L60:
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fth.b(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(final java.util.Map r6, defpackage.agsw r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ftg
            if (r0 == 0) goto L13
            r0 = r7
            ftg r0 = (defpackage.ftg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ftg r0 = new ftg
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
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.agpl.b(r7)
            agwe r7 = new agwe
            r7.<init>()
            fpg r2 = r5.c
            ftd r4 = new ftd
            r4.<init>()
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L59
            r6 = r7
        L4b:
            boolean r6 = r6.a
            if (r6 == 0) goto L56
            fxt r6 = r5.b
            fxr r7 = defpackage.fth.a
            r6.b(r7)
        L56:
            agpu r6 = defpackage.agpu.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fth.c(java.util.Map, agsw):java.lang.Object");
    }
}
