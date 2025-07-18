package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqt extends agtu implements agvb {
    int a;
    final /* synthetic */ gqu b;
    final /* synthetic */ htd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqt(gqu gquVar, htd htdVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gquVar;
        this.c = htdVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gqt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (defpackage.ahnx.a(r6.e, r5) == r0) goto L20;
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
            int r1 = r5.a
            r2 = 1
            defpackage.agpl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L35
            goto L45
        Ld:
            gqu r6 = r5.b
            htd r1 = r5.c
            java.lang.String r3 = r6.f
            if (r3 == 0) goto L1d
            java.util.Set r3 = java.util.Collections.singleton(r3)
            r3.getClass()
            goto L1f
        L1d:
            agrf r3 = defpackage.agrf.a
        L1f:
            grk r4 = r6.h
            if (r4 != 0) goto L29
            java.lang.String r4 = "mediaResultReceiver"
            defpackage.agvy.b(r4)
            r4 = 0
        L29:
            java.lang.String r1 = r1.d
            izr r6 = r6.c
            r5.a = r2
            java.lang.Object r6 = r6.c(r1, r3, r4, r5)
            if (r6 == r0) goto L4d
        L35:
            jae r6 = (defpackage.jae) r6
            gqu r6 = r5.b
            r1 = 2
            r5.a = r1
            j$.time.Duration r6 = r6.e
            java.lang.Object r6 = defpackage.ahnx.a(r6, r5)
            if (r6 != r0) goto L45
            goto L4d
        L45:
            gqu r6 = r5.b
            r6.b()
            agpu r6 = defpackage.agpu.a
            return r6
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gqt(this.b, this.c, agswVar);
    }
}
