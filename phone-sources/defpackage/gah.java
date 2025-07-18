package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gah extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ gav c;
    final /* synthetic */ fzx d;
    Object e;
    int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gah(yih yihVar, gav gavVar, fzx fzxVar) {
        super(3, yihVar);
        this.c = gavVar;
        this.d = fzxVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gah gahVar = new gah((yih) obj3, this.c, this.d);
        gahVar.g = (ysy) obj;
        gahVar.b = obj2;
        return gahVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (defpackage.vyf.K(r5, r1, r9) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ysy] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            yio r0 = defpackage.yio.a
            int r1 = r9.a
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto Le
            defpackage.ybn.f(r10)
            goto Lbe
        Le:
            int r1 = r9.f
            java.lang.Object r3 = r9.e
            java.lang.Object r4 = r9.b
            cvi r4 = (defpackage.cvi) r4
            java.lang.Object r5 = r9.g
            defpackage.ybn.f(r10)
            goto L42
        L1c:
            defpackage.ybn.f(r10)
            java.lang.Object r5 = r9.g
            java.lang.Object r10 = r9.b
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            gav r10 = r9.c
            r9.g = r5
            cvi r4 = r10.f
            r9.b = r4
            java.lang.Object r3 = r4.b
            r9.e = r3
            r9.f = r1
            r9.a = r2
            r10 = r3
            yyk r10 = (defpackage.yyk) r10
            java.lang.Object r10 = r10.b(r9)
            if (r10 == r0) goto Lc8
        L42:
            java.lang.Object r10 = r4.a     // Catch: java.lang.Throwable -> Lc1
            gaw r10 = (defpackage.gaw) r10     // Catch: java.lang.Throwable -> Lc1
            kvw r10 = r10.k     // Catch: java.lang.Throwable -> Lc1
            fzx r4 = r9.d     // Catch: java.lang.Throwable -> Lc1
            fzv r6 = r10.h(r4)     // Catch: java.lang.Throwable -> Lc1
            fzu r7 = defpackage.fzu.a     // Catch: java.lang.Throwable -> Lc1
            boolean r6 = defpackage.yks.e(r6, r7)     // Catch: java.lang.Throwable -> Lc1
            r7 = 2
            r8 = 0
            if (r6 == 0) goto L66
            fzn[] r10 = new defpackage.fzn[r8]     // Catch: java.lang.Throwable -> Lc1
            isv r1 = new isv     // Catch: java.lang.Throwable -> Lc1
            r2 = 5
            r1.<init>(r10, r2)     // Catch: java.lang.Throwable -> Lc1
            yyk r3 = (defpackage.yyk) r3
            r3.d()
            goto Lae
        L66:
            fzv r6 = r10.h(r4)     // Catch: java.lang.Throwable -> Lc1
            boolean r6 = r6 instanceof defpackage.fzs     // Catch: java.lang.Throwable -> Lc1
            if (r6 != 0) goto L73
            fzu r6 = defpackage.fzu.b     // Catch: java.lang.Throwable -> Lc1
            r10.j(r4, r6)     // Catch: java.lang.Throwable -> Lc1
        L73:
            yyk r3 = (defpackage.yyk) r3
            r3.d()
            gav r10 = r9.c
            r4.getClass()
            int r3 = r4.ordinal()
            cb r10 = r10.g
            if (r3 == r2) goto L96
            if (r3 != r7) goto L8e
            java.lang.Object r10 = r10.a
            gog r10 = (defpackage.gog) r10
            java.lang.Object r10 = r10.a
            goto L9c
        L8e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid load type for hints"
            r10.<init>(r0)
            throw r10
        L96:
            java.lang.Object r10 = r10.a
            gog r10 = (defpackage.gog) r10
            java.lang.Object r10 = r10.b
        L9c:
            ghc r10 = (defpackage.ghc) r10
            java.lang.Object r10 = r10.a
            if (r1 != 0) goto La3
            r2 = r8
        La3:
            ytl r3 = new ytl
            r3.<init>(r10, r2)
            gal r10 = new gal
            r10.<init>(r3, r1)
            r1 = r10
        Lae:
            r10 = 0
            r9.g = r10
            r9.b = r10
            r9.e = r10
            r9.a = r7
            java.lang.Object r10 = defpackage.vyf.K(r5, r1, r9)
            if (r10 != r0) goto Lbe
            goto Lc8
        Lbe:
            ygi r10 = defpackage.ygi.a
            return r10
        Lc1:
            r10 = move-exception
            yyk r3 = (defpackage.yyk) r3
            r3.d()
            throw r10
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gah.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
