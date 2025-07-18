package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajj extends yiz implements yjz {
    int a;
    final /* synthetic */ ajk b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bmy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajj(ajk ajkVar, float f, boolean z, bmy bmyVar, yih yihVar) {
        super(2, yihVar);
        this.b = ajkVar;
        this.c = f;
        this.d = z;
        this.e = bmyVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajj) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ajj(this.b, this.c, this.d, this.e, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (((defpackage.aea) r7).a(r1, r6) == r0) goto L25;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            yio r0 = defpackage.yio.a
            int r1 = r6.a
            r2 = 1
            defpackage.ybn.f(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L38
            goto L50
        Ld:
            ajk r7 = r6.b
            float r1 = r6.c
            sj r7 = r7.g
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto L30
            boolean r3 = java.lang.Float.isInfinite(r1)
            if (r3 == 0) goto L20
            goto L30
        L20:
            double r3 = (double) r1
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L2b
            double r3 = java.lang.Math.ceil(r3)
            goto L2f
        L2b:
            double r3 = java.lang.Math.floor(r3)
        L2f:
            float r1 = (float) r3
        L30:
            r6.a = r2
            java.lang.Object r7 = defpackage.a.bF(r7, r1, r6)
            if (r7 == r0) goto L53
        L38:
            boolean r7 = r6.d
            if (r7 == 0) goto L50
            ajk r7 = r6.b
            lhr r7 = r7.k
            java.lang.Object r7 = r7.b
            bmy r1 = r6.e
            r2 = 2
            r6.a = r2
            aea r7 = (defpackage.aea) r7
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L50
            goto L53
        L50:
            ygi r7 = defpackage.ygi.a
            return r7
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
