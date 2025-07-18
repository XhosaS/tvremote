package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfv extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfv(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jfv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4.g(false, false, r3) == r0) goto L15;
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
            if (r1 == r2) goto L17
            goto L2c
        Ld:
            jhh r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.ag(r3)
            if (r4 == r0) goto L2f
        L17:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2c
            jhh r4 = r3.b
            r1 = 2
            r3.a = r1
            r1 = 0
            java.lang.Object r4 = r4.g(r1, r1, r3)
            if (r4 != r0) goto L2c
            goto L2f
        L2c:
            agpu r4 = defpackage.agpu.a
            return r4
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jfv(this.b, agswVar);
    }
}
