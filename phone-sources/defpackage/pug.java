package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pug implements pud {
    private static final tvn a = tvn.n("GnpSdk");
    private final qsy b;
    private final xbw c;
    private final pwi d;
    private final pui e;
    private final qjl f;
    private final yfo g;
    private final yfo h;
    private final yfo i;
    private final yfo j;

    public pug(qsy qsyVar, xbw xbwVar, pwi pwiVar, pui puiVar, qjl qjlVar, yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        qsyVar.getClass();
        xbwVar.getClass();
        pwiVar.getClass();
        puiVar.getClass();
        yfoVar.getClass();
        yfoVar2.getClass();
        yfoVar3.getClass();
        yfoVar4.getClass();
        this.b = qsyVar;
        this.c = xbwVar;
        this.d = pwiVar;
        this.e = puiVar;
        this.f = qjlVar;
        this.g = yfoVar;
        this.h = yfoVar2;
        this.i = yfoVar3;
        this.j = yfoVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r10 != r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r10 != r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        if (r10.a(r6) == r7) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pug.a(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.puf
            if (r0 == 0) goto L13
            r0 = r6
            puf r0 = (defpackage.puf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            puf r0 = new puf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ybn.f(r6)
            yfo r6 = r5.i
            qoe r6 = (defpackage.qoe) r6
            qnr r6 = r6.a()
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto Le7
        L42:
            qdl r6 = (defpackage.qdl) r6
            boolean r0 = r6 instanceof defpackage.qdn
            if (r0 == 0) goto Lda
            qdn r6 = (defpackage.qdn) r6
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lce
        L52:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> Lce
            qen r0 = (defpackage.qen) r0     // Catch: java.lang.Throwable -> Lce
            yfo r1 = r5.h     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r2 = r1.b()     // Catch: java.lang.Throwable -> Lce
            nsf r2 = (defpackage.nsf) r2     // Catch: java.lang.Throwable -> Lce
            com.google.common.collect.ImmutableList r2 = r2.k(r0)     // Catch: java.lang.Throwable -> Lce
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lce
            if (r3 != 0) goto L52
            r2.getClass()     // Catch: java.lang.Throwable -> Lce
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lce
            r4 = 10
            int r4 = defpackage.yfm.z(r2, r4)     // Catch: java.lang.Throwable -> Lce
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lce
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lce
        L82:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lce
            if (r4 == 0) goto L94
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lce
            qis r4 = (defpackage.qis) r4     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> Lce
            r3.add(r4)     // Catch: java.lang.Throwable -> Lce
            goto L82
        L94:
            java.util.Set r2 = defpackage.yfm.ap(r3)     // Catch: java.lang.Throwable -> Lce
            yfo r3 = r5.j     // Catch: java.lang.Throwable -> Lce
            qdg r3 = (defpackage.qdg) r3     // Catch: java.lang.Throwable -> Lce
            ntp r3 = r3.b()     // Catch: java.lang.Throwable -> Lce
            pxg r4 = defpackage.ocv.aZ(r0)     // Catch: java.lang.Throwable -> Lce
            java.util.Set r3 = r3.o(r4, r2)     // Catch: java.lang.Throwable -> Lce
            r2.removeAll(r3)     // Catch: java.lang.Throwable -> Lce
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lce
            if (r3 != 0) goto L52
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lce
            nsf r1 = (defpackage.nsf) r1     // Catch: java.lang.Throwable -> Lce
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lce
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.Throwable -> Lce
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lce
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.Throwable -> Lce
            r1.n(r0, r2)     // Catch: java.lang.Throwable -> Lce
            goto L52
        Lcb:
            ygi r6 = defpackage.ygi.a     // Catch: java.lang.Throwable -> Lce
            goto Ld3
        Lce:
            r6 = move-exception
            java.lang.Object r6 = defpackage.ybn.e(r6)
        Ld3:
            r0 = 18
            qdl r6 = defpackage.osk.am(r6, r0)
            return r6
        Lda:
            boolean r0 = r6 instanceof defpackage.qdi
            if (r0 == 0) goto Le1
            qdi r6 = (defpackage.qdi) r6
            return r6
        Le1:
            yfu r6 = new yfu
            r6.<init>()
            throw r6
        Le7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pug.b(yih):java.lang.Object");
    }
}
