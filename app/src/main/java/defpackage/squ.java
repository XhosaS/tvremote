package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class squ extends agtu implements agvb {
    int a;
    final /* synthetic */ sqv b;
    final /* synthetic */ sqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public squ(sqv sqvVar, sqb sqbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sqvVar;
        this.c = sqbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((squ) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        return (defpackage.ruv) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return (defpackage.ruv) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L16;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.a
            r2 = 1
            defpackage.agpl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L53
            goto L38
        Ld:
            sqv r8 = r7.b
            skz r1 = r8.i
            slb r3 = r8.c
            slb r4 = r8.b
            sky r5 = r1.a(r3, r4)
            boolean r6 = r5.a
            if (r6 != 0) goto L45
            int r5 = r5.b
            if (r5 <= r2) goto L22
            goto L45
        L22:
            boolean r2 = r8.e
            if (r2 == 0) goto L3b
            sqn r8 = r8.d
            sqb r1 = r7.c
            zyd r8 = r8.n(r1)
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.ahkr.b(r8, r7)
            if (r8 != r0) goto L38
            goto L56
        L38:
            ruv r8 = (defpackage.ruv) r8
            return r8
        L3b:
            r1.b(r3, r4)
            rxh r8 = defpackage.rxh.FAILED_OPENING_NO_SOURCE_TO_COPY
            ruv r8 = defpackage.skc.a(r8)
            return r8
        L45:
            sqb r1 = r7.c
            zyd r8 = r8.p(r1)
            r7.a = r2
            java.lang.Object r8 = defpackage.ahkr.b(r8, r7)
            if (r8 == r0) goto L56
        L53:
            ruv r8 = (defpackage.ruv) r8
            return r8
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.squ.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new squ(this.b, this.c, agswVar);
    }
}
