package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gux extends agtu implements agvb {
    int a;
    final /* synthetic */ gva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gux(gva gvaVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gvaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gux) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return (android.accounts.Account[]) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r6 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return (android.accounts.Account[]) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r6 != r0) goto L10;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.a
            r2 = 1
            defpackage.agpl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2d
            goto L40
        Ld:
            gva r6 = r5.b
            agow r1 = r6.c
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L30
            agte r1 = r6.a
            guw r3 = new guw
            r4 = 0
            r3.<init>(r6, r4)
            r5.a = r2
            java.lang.Object r6 = defpackage.ahal.a(r1, r3, r5)
            if (r6 == r0) goto L3f
        L2d:
            android.accounts.Account[] r6 = (android.accounts.Account[]) r6
            return r6
        L30:
            jwr r6 = r6.b
            lvf r6 = r6.d()
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.ahnw.a(r6, r5)
            if (r6 != r0) goto L40
        L3f:
            return r0
        L40:
            android.accounts.Account[] r6 = (android.accounts.Account[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gux.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gux(this.b, agswVar);
    }
}
