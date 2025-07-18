package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifx extends agtu implements agvb {
    int a;
    final /* synthetic */ ify b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifx(ify ifyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ifyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ifx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r1.e.a(true, r5, r4) == r0) goto L20;
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
            if (r1 == r2) goto L19
            goto L33
        Ld:
            ify r5 = r4.b
            r4.a = r2
            gtu r5 = r5.d
            java.lang.Object r5 = r5.j(r4)
            if (r5 == r0) goto L36
        L19:
            android.accounts.Account r5 = (android.accounts.Account) r5
            if (r5 == 0) goto L20
            java.lang.String r5 = r5.name
            goto L21
        L20:
            r5 = 0
        L21:
            ify r1 = r4.b
            r3 = 2
            r4.a = r3
            if (r5 != 0) goto L2a
            java.lang.String r5 = ""
        L2a:
            icx r1 = r1.e
            java.lang.Object r5 = r1.a(r2, r5, r4)
            if (r5 != r0) goto L33
            goto L36
        L33:
            agpu r5 = defpackage.agpu.a
            return r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ifx(this.b, agswVar);
    }
}
