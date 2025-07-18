package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbt extends agtu implements agvb {
    int a;
    final /* synthetic */ fbv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbt(fbv fbvVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fbvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fbt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r4 == r0) goto L28;
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
            if (r1 == r2) goto L19
            goto L47
        Ld:
            fbv r4 = r3.b
            r3.a = r2
            gtu r4 = r4.l
            java.lang.Object r4 = r4.j(r3)
            if (r4 == r0) goto L5d
        L19:
            android.accounts.Account r4 = (android.accounts.Account) r4
            if (r4 == 0) goto L20
            java.lang.String r4 = r4.name
            goto L21
        L20:
            r4 = 0
        L21:
            if (r4 != 0) goto L25
            java.lang.String r4 = ""
        L25:
            int r1 = r4.length()
            if (r1 == 0) goto L5a
            fbv r1 = r3.b
            agow r2 = r1.q
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5a
            fus r1 = r1.p
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L47
            goto L5d
        L47:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L50
            goto L5a
        L50:
            fbv r4 = r3.b
            fbp r4 = r4.e
            r4.d()
            agpu r4 = defpackage.agpu.a
            return r4
        L5a:
            agpu r4 = defpackage.agpu.a
            return r4
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fbt(this.b, agswVar);
    }
}
