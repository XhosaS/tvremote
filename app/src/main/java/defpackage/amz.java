package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amz extends agtu implements agvb {
    int a;
    final /* synthetic */ ano b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amz(ano anoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = anoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r1.fD(r2, r3) == r0) goto L15;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r3.a
            r2 = 1
            defpackage.agpl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L3c
        Ld:
            ano r4 = r3.b
            r3.a = r2
            amk r4 = r4.e
            ahaz r4 = r4.c
            java.lang.Object r4 = r4.fy(r3)
            if (r4 == r0) goto L1d
            agpu r4 = defpackage.agpu.a
        L1d:
            if (r4 == r0) goto L3f
        L1f:
            ano r4 = r3.b
            aof r1 = r4.b()
            ahgr r1 = r1.e()
            ahgr r1 = defpackage.ahgy.a(r1)
            amy r2 = new amy
            r2.<init>(r4)
            r4 = 2
            r3.a = r4
            java.lang.Object r4 = r1.fD(r2, r3)
            if (r4 != r0) goto L3c
            goto L3f
        L3c:
            agpu r4 = defpackage.agpu.a
            return r4
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new amz(this.b, agswVar);
    }
}
