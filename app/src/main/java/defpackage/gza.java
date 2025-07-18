package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gza extends agtu implements agvb {
    int a;
    final /* synthetic */ gzb b;
    final /* synthetic */ gyx[] c;
    final /* synthetic */ agte d;
    final /* synthetic */ agum e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gza(gzb gzbVar, gyx[] gyxVarArr, agte agteVar, agum agumVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gzbVar;
        this.c = gyxVarArr;
        this.d = agteVar;
        this.e = agumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gza) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (defpackage.ahal.a(r5, r2, r4) == r0) goto L13;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r4.a
            r2 = 1
            defpackage.agpl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L35
        Ld:
            gzb r5 = r4.b
            gyx[] r1 = r4.c
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            gyx[] r1 = (defpackage.gyx[]) r1
            r4.a = r2
            gyy r5 = r5.a
            java.lang.Object r5 = r5.g(r1, r4)
            if (r5 == r0) goto L38
        L21:
            agte r5 = r4.d
            agum r1 = r4.e
            gyz r2 = new gyz
            r3 = 0
            r2.<init>(r1, r3)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.ahal.a(r5, r2, r4)
            if (r5 != r0) goto L35
            goto L38
        L35:
            agpu r5 = defpackage.agpu.a
            return r5
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gza.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gza(this.b, this.c, this.d, this.e, agswVar);
    }
}
