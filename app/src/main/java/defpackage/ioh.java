package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ioh extends agtu implements agvb {
    int a;
    final /* synthetic */ ioi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioh(ioi ioiVar, boolean z, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = ioiVar;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ioh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r5.b(r1, r4) == r0) goto L17;
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
            if (r1 == r2) goto L1d
            goto L34
        Ld:
            ioi r5 = r4.b
            boolean r1 = r4.c
            java.lang.String r3 = r4.d
            r4.a = r2
            icx r5 = r5.g
            java.lang.Object r5 = r5.a(r1, r3, r4)
            if (r5 == r0) goto L37
        L1d:
            ioi r5 = r4.b
            boolean r1 = r4.c
            if (r1 == 0) goto L26
            foc r1 = defpackage.foc.TOGGLE_ON
            goto L28
        L26:
            foc r1 = defpackage.foc.TOGGLE_OFF
        L28:
            fjr r5 = r5.d
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r5.b(r1, r4)
            if (r5 != r0) goto L34
            goto L37
        L34:
            agpu r5 = defpackage.agpu.a
            return r5
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ioh(this.b, this.c, this.d, agswVar);
    }
}
