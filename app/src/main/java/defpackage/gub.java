package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gub extends agtu implements agvb {
    int a;
    final /* synthetic */ gva b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gub(gva gvaVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.b = gvaVar;
        this.c = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gub) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r6 == r0) goto L13;
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
            if (r1 == r2) goto L21
            goto L30
        Ld:
            gva r6 = r5.b
            android.accounts.Account r1 = r5.c
            gua r3 = new gua
            r4 = 0
            r3.<init>(r6, r1, r4)
            r5.a = r2
            agte r6 = r6.a
            java.lang.Object r6 = defpackage.ahal.a(r6, r3, r5)
            if (r6 == r0) goto L36
        L21:
            r6.getClass()
            lvf r6 = (defpackage.lvf) r6
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.ahnw.a(r6, r5)
            if (r6 != r0) goto L30
            goto L36
        L30:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.gva.d
            return r6
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gub(this.b, this.c, agswVar);
    }
}
