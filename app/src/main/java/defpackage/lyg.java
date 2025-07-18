package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyg extends agtu implements agvb {
    int a;
    final /* synthetic */ lyp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyg(lyp lypVar, agsw agswVar) {
        super(2, agswVar);
        this.b = lypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lyg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r5 == r0) goto L18;
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
            if (r1 == r2) goto L31
            goto L51
        Ld:
            lyp r5 = r4.b
            agow r1 = r5.u
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L64
            vrs r5 = r5.j
            android.net.Uri r1 = defpackage.esy.a
            r1.getClass()
            yyk r3 = defpackage.esy.c
            r3.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.gbv.c(r5, r1, r3, r4)
            if (r5 == r0) goto L63
        L31:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L59
            lyp r5 = r4.b
            android.net.Uri r1 = defpackage.esy.b
            r1.getClass()
            yyk r2 = defpackage.esy.d
            r2.getClass()
            r3 = 2
            r4.a = r3
            vrs r5 = r5.j
            java.lang.Object r5 = defpackage.gbv.c(r5, r1, r2, r4)
            if (r5 != r0) goto L51
            goto L63
        L51:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L64
        L59:
            lyp r5 = r4.b
            vxe r0 = r5.g
            gpd r5 = r5.t
            r0.b(r5)
            goto L64
        L63:
            return r0
        L64:
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new lyg(this.b, agswVar);
    }
}
