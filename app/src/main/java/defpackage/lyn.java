package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyn extends agtu implements agvb {
    int a;
    final /* synthetic */ lyp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyn(lyp lypVar, agsw agswVar) {
        super(2, agswVar);
        this.b = lypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lyn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (defpackage.ahkr.b(r4, r3) == r0) goto L15;
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
            goto L3a
        Ld:
            j$.time.Duration r4 = defpackage.lyp.b
            r3.a = r2
            java.lang.Object r4 = defpackage.zty.a(r4, r3)
            if (r4 == r0) goto L3d
        L17:
            lyp r4 = r3.b
            android.content.Context r1 = r4.i
            java.lang.String r1 = r1.getPackageName()
            r1.getClass()
            android.app.ActivityManager r2 = r4.c
            boolean r1 = defpackage.fbg.a(r2, r1)
            if (r1 == 0) goto L3a
            icl r4 = r4.v
            zyd r4 = r4.a()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.ahkr.b(r4, r3)
            if (r4 != r0) goto L3a
            goto L3d
        L3a:
            agpu r4 = defpackage.agpu.a
            return r4
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new lyn(this.b, agswVar);
    }
}
