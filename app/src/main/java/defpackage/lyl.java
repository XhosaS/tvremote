package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyl extends agtu implements agvb {
    int a;
    final /* synthetic */ lyp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyl(lyp lypVar, agsw agswVar) {
        super(2, agswVar);
        this.b = lypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lyl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r4.d(r3) == r0) goto L13;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L23
        Ld:
            lyp r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L26
        L17:
            lyp r4 = r3.b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.d(r3)
            if (r4 != r0) goto L23
            goto L26
        L23:
            agpu r4 = defpackage.agpu.a
            return r4
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new lyl(this.b, agswVar);
    }
}
