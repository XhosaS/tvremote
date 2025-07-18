package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozh extends agtu implements agvb {
    int a;
    final /* synthetic */ ozi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozh(ozi oziVar, agsw agswVar) {
        super(2, agswVar);
        this.b = oziVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ozh) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4.a(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.a(r1, r3) == r0) goto L12;
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
            goto L2c
        Lb:
            java.lang.Object r4 = r3.c
            ahgs r4 = (defpackage.ahgs) r4
            ozi r1 = r3.b
            boolean r1 = r1.s
            if (r1 == 0) goto L20
            owp r1 = defpackage.owp.a
            r3.a = r2
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L2c
            goto L2b
        L20:
            owq r1 = defpackage.owq.a
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L2c
        L2b:
            return r0
        L2c:
            agpu r4 = defpackage.agpu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ozh ozhVar = new ozh(this.b, agswVar);
        ozhVar.c = obj;
        return ozhVar;
    }
}
