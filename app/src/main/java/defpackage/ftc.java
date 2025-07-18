package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftc {
    public static final fxr a;
    private final fxt b;
    private final fpg c;

    static {
        fxe fxeVar = fxe.a;
        a = fxs.a(fxi.h(new fxd()), 4);
    }

    public ftc(fxt fxtVar, fpg fpgVar) {
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
    public static final java.lang.Object c(defpackage.ftc r5, final java.lang.String r6, defpackage.agsw r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fta
            if (r0 == 0) goto L13
            r0 = r7
            fta r0 = (defpackage.fta) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fta r0 = new fta
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            agwe r5 = r0.d
            ftc r6 = r0.c
            defpackage.agpl.b(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.agpl.b(r7)
            agwe r7 = new agwe
            r7.<init>()
            fpg r2 = r5.c
            fsx r4 = new fsx
            r4.<init>()
            r0.c = r5
            r0.d = r7
            r0.b = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L5e
            r6 = r5
            r5 = r7
        L50:
            boolean r5 = r5.a
            if (r5 == 0) goto L5b
            fxt r5 = r6.b
            fxr r6 = defpackage.ftc.a
            r5.b(r6)
        L5b:
            agpu r5 = defpackage.agpu.a
            return r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftc.c(ftc, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fsy
            if (r0 == 0) goto L13
            r0 = r5
            fsy r0 = (defpackage.fsy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fsy r0 = new fsy
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
            if (r5 == r1) goto L83
        L3c:
            fxg r5 = (defpackage.fxg) r5
            abyl r5 = r5.b
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r5)
            r5.getClass()
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L50
        L4e:
            r3 = r1
            goto L7e
        L50:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            fxe r0 = (defpackage.fxe) r0
            fwm r0 = r0.j
            if (r0 != 0) goto L70
            fwm r0 = defpackage.fwm.a
        L70:
            int r0 = r0.b
            fwl r0 = defpackage.fwl.b(r0)
            if (r0 != 0) goto L7a
            fwl r0 = defpackage.fwl.UNRECOGNIZED
        L7a:
            fwl r2 = defpackage.fwl.HOTWORD_CONSENT_ACCEPTED
            if (r0 != r2) goto L58
        L7e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftc.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (c(r6, r7, r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fsz
            if (r0 == 0) goto L13
            r0 = r8
            fsz r0 = (defpackage.fsz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fsz r0 = new fsz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.agpl.b(r8)
            goto Lab
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.String r7 = r0.d
            defpackage.agpl.b(r8)
            goto L48
        L39:
            defpackage.agpl.b(r8)
            fpg r8 = r6.c
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto Lae
        L48:
            fxg r8 = (defpackage.fxg) r8
            abyl r2 = r8.b
            java.util.Map r2 = j$.util.DesugarCollections.unmodifiableMap(r2)
            r2.getClass()
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 == 0) goto L5b
            goto La1
        L5b:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L63:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            fxe r4 = (defpackage.fxe) r4
            int r4 = r4.b
            r4 = r4 & 32
            if (r4 == 0) goto L63
            abyl r8 = r8.b
            java.util.Map r8 = j$.util.DesugarCollections.unmodifiableMap(r8)
            java.lang.Object r7 = r8.get(r7)
            fxe r7 = (defpackage.fxe) r7
            if (r7 == 0) goto L9b
            fwm r7 = r7.j
            if (r7 != 0) goto L8f
            fwm r7 = defpackage.fwm.a
        L8f:
            if (r7 == 0) goto L9b
            int r7 = r7.b
            fwl r5 = defpackage.fwl.b(r7)
            if (r5 != 0) goto L9b
            fwl r5 = defpackage.fwl.UNRECOGNIZED
        L9b:
            if (r5 != 0) goto La0
            fwl r7 = defpackage.fwl.HOTWORD_CONSENT_UNSPECIFIED
            return r7
        La0:
            return r5
        La1:
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = c(r6, r7, r0)
            if (r7 == r1) goto Lae
        Lab:
            fwl r7 = defpackage.fwl.HOTWORD_CONSENT_SPECIFIED_FOR_NO_USER
            return r7
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftc.b(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(final java.lang.String r6, boolean r7, defpackage.agsw r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ftb
            if (r0 == 0) goto L13
            r0 = r8
            ftb r0 = (defpackage.ftb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ftb r0 = new ftb
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
            goto L52
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.agpl.b(r8)
            if (r7 == 0) goto L39
            fwl r7 = defpackage.fwl.HOTWORD_CONSENT_ACCEPTED
            goto L3b
        L39:
            fwl r7 = defpackage.fwl.HOTWORD_CONSENT_DENIED
        L3b:
            agwe r8 = new agwe
            r8.<init>()
            fpg r2 = r5.c
            fsw r4 = new fsw
            r4.<init>()
            r0.d = r8
            r0.c = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L60
            r6 = r8
        L52:
            boolean r6 = r6.a
            if (r6 == 0) goto L5d
            fxt r6 = r5.b
            fxr r7 = defpackage.ftc.a
            r6.b(r7)
        L5d:
            agpu r6 = defpackage.agpu.a
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftc.d(java.lang.String, boolean, agsw):java.lang.Object");
    }
}
