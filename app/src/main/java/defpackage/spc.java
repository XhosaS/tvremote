package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spc extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ spf d;
    final /* synthetic */ int e;
    final /* synthetic */ sds f;
    final /* synthetic */ rux g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spc(spf spfVar, int i, sds sdsVar, rux ruxVar, agsw agswVar) {
        super(2, agswVar);
        this.d = spfVar;
        this.e = i;
        this.f = sdsVar;
        this.g = ruxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r6.b(r3, (defpackage.yqt) r1, (java.lang.String) r2, r5) != r0) goto L17;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 == r2) goto L10
            defpackage.agpl.b(r6)
            goto L63
        L10:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.agpl.b(r6)
            goto L4c
        L18:
            java.lang.Object r1 = r5.a
            defpackage.agpl.b(r6)
            goto L35
        L1e:
            defpackage.agpl.b(r6)
            spf r6 = r5.d
            int r1 = r5.e
            sds r4 = r5.f
            java.lang.String r1 = r6.d(r1)
            r5.a = r1
            r5.c = r3
            java.lang.Object r6 = r6.a(r4, r5)
            if (r6 == r0) goto L66
        L35:
            spf r3 = r5.d
            rux r4 = r5.g
            yqt r6 = (defpackage.yqt) r6
            r5.a = r1
            r5.b = r6
            r5.c = r2
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.c(r4, r6, r2, r5)
            if (r2 == r0) goto L66
            r2 = r1
            r1 = r6
        L4c:
            spf r6 = r5.d
            rux r3 = r5.g
            r4 = 0
            r5.a = r4
            r5.b = r4
            r4 = 3
            r5.c = r4
            java.lang.String r2 = (java.lang.String) r2
            yqt r1 = (defpackage.yqt) r1
            java.lang.Object r6 = r6.b(r3, r1, r2, r5)
            if (r6 != r0) goto L63
            goto L66
        L63:
            agpu r6 = defpackage.agpu.a
            return r6
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new spc(this.d, this.e, this.f, this.g, agswVar);
    }
}
