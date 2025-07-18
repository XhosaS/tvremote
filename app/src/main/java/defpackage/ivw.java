package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivw extends agtu implements agvb {
    int a;
    final /* synthetic */ ite b;
    final /* synthetic */ iwd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivw(ite iteVar, iwd iwdVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iteVar;
        this.c = iwdVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ivw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (defpackage.iwd.b(r1, r4, r3, 2) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (defpackage.iwd.b(r4, null, r3, 1) == r0) goto L12;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r3.a
            r2 = 1
            defpackage.agpl.b(r4)
            if (r1 == 0) goto Lb
            goto L30
        Lb:
            ite r4 = r3.b
            boolean r1 = r4 instanceof defpackage.iuk
            if (r1 == 0) goto L1d
            iwd r4 = r3.c
            r3.a = r2
            r1 = 0
            java.lang.Object r4 = defpackage.iwd.b(r4, r1, r3, r2)
            if (r4 != r0) goto L30
            goto L2f
        L1d:
            iwd r1 = r3.c
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r4.getClass()
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = defpackage.iwd.b(r1, r4, r3, r2)
            if (r4 != r0) goto L30
        L2f:
            return r0
        L30:
            agpu r4 = defpackage.agpu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ivw(this.b, this.c, agswVar);
    }
}
