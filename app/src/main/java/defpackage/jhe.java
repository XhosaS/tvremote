package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhe extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhe(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhe) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5.af(r4) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (defpackage.ahal.a(r5.ah, new defpackage.jgg(r5, null), r4) == r0) goto L12;
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
            if (r1 == 0) goto Lb
            goto L38
        Lb:
            zdy r5 = defpackage.jhh.a
            jhh r5 = r4.b
            agow r1 = r5.P
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2e
            r4.a = r2
            ahdb r1 = r5.ah
            jgg r2 = new jgg
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = defpackage.ahal.a(r1, r2, r4)
            if (r5 != r0) goto L38
            goto L37
        L2e:
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.af(r4)
            if (r5 != r0) goto L38
        L37:
            return r0
        L38:
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jhe(this.b, agswVar);
    }
}
