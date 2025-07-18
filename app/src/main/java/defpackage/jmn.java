package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmn extends agtu implements agvb {
    int a;
    final /* synthetic */ jmr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmn(jmr jmrVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jmrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return (defpackage.fcy) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r4 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return (defpackage.fcy) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r4 != r0) goto L10;
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
            if (r1 == r2) goto L27
            goto L3a
        Ld:
            jmr r4 = r3.b
            agow r1 = r4.d
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2a
            fda r4 = r4.c
            r3.a = r2
            java.lang.Object r4 = r4.f(r3)
            if (r4 == r0) goto L39
        L27:
            fcy r4 = (defpackage.fcy) r4
            return r4
        L2a:
            fda r4 = r4.c
            zyd r4 = r4.b()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.ahkr.b(r4, r3)
            if (r4 != r0) goto L3a
        L39:
            return r0
        L3a:
            fcy r4 = (defpackage.fcy) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jmn(this.b, agswVar);
    }
}
