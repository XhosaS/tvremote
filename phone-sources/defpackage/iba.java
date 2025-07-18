package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iba extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ity d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iba(ity ityVar, Object obj, boolean z, yih yihVar) {
        super(2, yihVar);
        this.d = ityVar;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iba) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        iba ibaVar = new iba(this.d, this.b, this.c, yihVar);
        ibaVar.e = obj;
        return ibaVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(1:(3:7|31|32)(2:8|44))(4:9|42|10|28))(1:14))(3:15|(0)|40)|17|41|18|(2:23|24)|25|(2:27|28)|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (((defpackage.iom) r10.b).d(r2, r1, r9) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        r1 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        throw r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            yio r0 = defpackage.yio.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L31
            if (r1 == r3) goto L29
            if (r1 == r2) goto L1e
            if (r1 != r4) goto L15
            defpackage.ybn.f(r10)
            goto L8f
        L15:
            java.lang.Object r0 = r9.e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.ybn.f(r10)
            goto Lab
        L1e:
            java.lang.Object r1 = r9.e
            ity r1 = (defpackage.ity) r1
            defpackage.ybn.f(r10)     // Catch: java.lang.Throwable -> L26
            goto L7c
        L26:
            r10 = move-exception
            goto L96
        L29:
            java.lang.Object r1 = r9.e
            ysy r1 = (defpackage.ysy) r1
            defpackage.ybn.f(r10)
            goto L54
        L31:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r9.e
            r1 = r10
            ysy r1 = (defpackage.ysy) r1
            ity r10 = r9.d
            java.lang.Object r6 = r9.b
            r9.e = r1
            r9.a = r3
            dbv r3 = new dbv
            r7 = 17
            r3.<init>(r10, r6, r5, r7)
            java.lang.Object r10 = r10.d
            ypc r10 = defpackage.ykr.o(r10, r5, r3, r4)
            java.lang.Object r10 = r10.n(r9)
            if (r10 == r0) goto Lac
        L54:
            ity r10 = (defpackage.ity) r10
            boolean r3 = r9.c     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L67
            boolean r6 = r10.a     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L5f
            goto L67
        L5f:
            java.lang.String r1 = "cannot create a piggyback only flow when piggybackDownstream is disabled"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L92
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L92
            throw r2     // Catch: java.lang.Throwable -> L92
        L67:
            ich r6 = new ich     // Catch: java.lang.Throwable -> L92
            r6.<init>(r10, r3, r5)     // Catch: java.lang.Throwable -> L92
            ysq r3 = new ysq     // Catch: java.lang.Throwable -> L92
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L92
            r9.e = r10     // Catch: java.lang.Throwable -> L92
            r9.a = r2     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = defpackage.vyf.K(r1, r3, r9)     // Catch: java.lang.Throwable -> L92
            if (r1 == r0) goto Lac
            r1 = r10
        L7c:
            ity r10 = r9.d
            java.lang.Object r2 = r9.b
            r9.e = r5
            r9.a = r4
            java.lang.Object r10 = r10.b
            iom r10 = (defpackage.iom) r10
            java.lang.Object r10 = r10.d(r2, r1, r9)
            if (r10 != r0) goto L8f
            goto Lac
        L8f:
            ygi r10 = defpackage.ygi.a
            return r10
        L92:
            r1 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        L96:
            ity r2 = r9.d
            java.lang.Object r3 = r9.b
            r9.e = r10
            r4 = 4
            r9.a = r4
            java.lang.Object r2 = r2.b
            iom r2 = (defpackage.iom) r2
            java.lang.Object r1 = r2.d(r3, r1, r9)
            if (r1 != r0) goto Laa
            goto Lac
        Laa:
            r0 = r10
        Lab:
            throw r0
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iba.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
