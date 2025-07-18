package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glw extends agtu implements agvb {
    int a;
    final /* synthetic */ gly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glw(gly glyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = glyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r4.b(r3) == r0) goto L15;
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
            if (r1 == r2) goto L31
            goto L3d
        Ld:
            gly r4 = r3.b
            ztw r1 = r4.b
            j$.time.Instant r1 = r1.a()
            r1.getClass()
            r3.a = r2
            abzy r1 = defpackage.acbk.b(r1)
            fka r2 = new fka
            r2.<init>()
            fke r4 = r4.a
            fhi r4 = r4.a
            java.lang.Object r4 = r4.b(r2, r3)
            if (r4 == r0) goto L2f
            agpu r4 = defpackage.agpu.a
        L2f:
            if (r4 == r0) goto L40
        L31:
            gly r4 = r3.b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L3d
            goto L40
        L3d:
            agpu r4 = defpackage.agpu.a
            return r4
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new glw(this.b, agswVar);
    }
}
