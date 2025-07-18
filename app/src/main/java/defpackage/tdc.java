package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdc extends agtu implements agvb {
    int a;
    final /* synthetic */ tdd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdc(tdd tddVar, agsw agswVar) {
        super(2, agswVar);
        this.b = tddVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r10.a
            defpackage.agpl.b(r11)
            if (r1 == 0) goto La
            goto L26
        La:
            tdd r11 = r10.b
            java.util.Map r1 = r11.c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            r11 = 0
            return r11
        L16:
            vhb r11 = r11.a
            zyd r11 = r11.c()
            r1 = 1
            r10.a = r1
            java.lang.Object r11 = defpackage.ahkr.b(r11, r10)
            if (r11 != r0) goto L26
            return r0
        L26:
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L31:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r11.next()
            vha r1 = (defpackage.vha) r1
            r1.getClass()
            vhg r2 = r1.b()
            java.lang.String r2 = r2.j
            int r3 = r2.hashCode()
            r4 = -1425037495(0xffffffffab0fa749, float:-5.103596E-13)
            if (r3 == r4) goto L5e
            r4 = -1423657812(0xffffffffab24b4ac, float:-5.8515237E-13)
            if (r3 == r4) goto L55
            goto L66
        L55:
            java.lang.String r3 = "incognito"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L31
            goto L66
        L5e:
            java.lang.String r3 = "pseudonymous"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L31
        L66:
            tdd r2 = r10.b
            java.util.Map r3 = r2.c
            r4 = r3
            yyr r4 = (defpackage.yyr) r4
            yzq r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L75:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.get(r5)
            r6.getClass()
            java.util.Collection r6 = (java.util.Collection) r6
            yzq r6 = defpackage.yye.b(r6)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L75
            tbx r7 = r2.b
            com.google.apps.tiktok.account.AccountId r8 = r1.a()
            achm r9 = defpackage.achm.INITIALIZATION
            zyd r5 = r7.a(r8, r5, r6, r9)
            r0.add(r5)
            goto L75
        La4:
            zyd r11 = defpackage.zxn.e(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Failed to sync Geller during startup after package replaced."
            defpackage.vqi.c(r11, r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tdc(this.b, agswVar);
    }
}
