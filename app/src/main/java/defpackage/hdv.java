package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdv extends agtu implements agvb {
    int a;
    final /* synthetic */ hec b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdv(hec hecVar, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.b = hecVar;
        this.c = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r5.b(r1, r4) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.agpl.b(r5)
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L36
            goto L4d
        L10:
            defpackage.agpl.b(r5)
            hec r5 = r4.b
            r4.a = r3
            gtu r5 = r5.f
            java.lang.Object r5 = r5.j(r4)
            if (r5 == r0) goto L50
        L1f:
            android.accounts.Account r5 = (android.accounts.Account) r5
            if (r5 == 0) goto L36
            hec r1 = r4.b
            boolean r3 = r4.c
            java.lang.String r5 = r5.name
            r5.getClass()
            r4.a = r2
            icx r1 = r1.h
            java.lang.Object r5 = r1.a(r3, r5, r4)
            if (r5 == r0) goto L50
        L36:
            hec r5 = r4.b
            boolean r1 = r4.c
            if (r1 == 0) goto L3f
            foc r1 = defpackage.foc.TOGGLE_ON
            goto L41
        L3f:
            foc r1 = defpackage.foc.TOGGLE_OFF
        L41:
            fjr r5 = r5.e
            r2 = 3
            r4.a = r2
            java.lang.Object r5 = r5.b(r1, r4)
            if (r5 != r0) goto L4d
            goto L50
        L4d:
            agpu r5 = defpackage.agpu.a
            return r5
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hdv(this.b, this.c, agswVar);
    }
}
