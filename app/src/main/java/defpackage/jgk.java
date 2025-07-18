package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgk extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgk(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 == r0) goto L18;
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
            if (r1 == r2) goto L1f
            goto L3b
        Ld:
            jhh r4 = r3.b
            agow r4 = r4.p
            java.lang.Object r4 = r4.a()
            fjn r4 = (defpackage.fjn) r4
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L4b
        L1f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L48
            jhh r4 = r3.b
            agow r4 = r4.p
            java.lang.Object r4 = r4.a()
            fjn r4 = (defpackage.fjn) r4
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.c(r3)
            if (r4 != r0) goto L3b
            goto L4b
        L3b:
            java.lang.String r4 = (java.lang.String) r4
            int r0 = r4.length()
            if (r0 <= 0) goto L48
            jhh r0 = r3.b
            r0.r(r4)
        L48:
            agpu r4 = defpackage.agpu.a
            return r4
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jgk(this.b, agswVar);
    }
}
