package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtk extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gtl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtk(gtl gtlVar, agsw agswVar) {
        super(2, agswVar);
        this.d = gtlVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gtk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r6.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L13
            defpackage.agpl.b(r7)
            return r7
        L13:
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.agpl.b(r7)
            goto L7f
        L1b:
            java.lang.Object r1 = r6.a
            defpackage.agpl.b(r7)
            goto L5b
        L21:
            defpackage.agpl.b(r7)
            goto L3a
        L25:
            defpackage.agpl.b(r7)
            gtl r7 = r6.d
            wei r7 = r7.d
            java.lang.String r1 = "com.google.android.katniss.device"
            zyd r7 = r7.a(r1)
            r6.c = r4
            java.lang.Object r7 = defpackage.ahkr.b(r7, r6)
            if (r7 == r0) goto L9d
        L3a:
            gtl r7 = r6.d
            gsv r1 = new gsv
            gsy r4 = r7.c
            r1.<init>(r4)
            gsy r1 = r1.a
            zyd r1 = defpackage.gsy.b(r1)
            r1.getClass()
            android.content.Context r7 = r7.b
            r6.a = r7
            r6.c = r3
            java.lang.Object r1 = defpackage.ahkr.b(r1, r6)
            if (r1 == r0) goto L9d
            r5 = r1
            r1 = r7
            r7 = r5
        L5b:
            gtl r3 = r6.d
            aagu r7 = (defpackage.aagu) r7
            gsu r4 = new gsu
            gsy r3 = r3.c
            r4.<init>(r3)
            gsy r3 = r4.a
            zyd r3 = defpackage.gsy.a(r3)
            r3.getClass()
            r6.a = r1
            r6.b = r7
            r6.c = r2
            java.lang.Object r2 = defpackage.ahkr.b(r3, r6)
            if (r2 == r0) goto L9d
            r5 = r1
            r1 = r7
            r7 = r2
            r2 = r5
        L7f:
            com.google.protobuf.MessageLite r7 = (com.google.protobuf.MessageLite) r7
            byte[] r7 = r7.toByteArray()
            android.content.Context r2 = (android.content.Context) r2
            aagu r1 = (defpackage.aagu) r1
            zyd r7 = defpackage.aeoz.a(r2, r1, r7)
            r1 = 0
            r6.a = r1
            r6.b = r1
            r1 = 4
            r6.c = r1
            java.lang.Object r7 = defpackage.ahkr.b(r7, r6)
            if (r7 != r0) goto L9c
            goto L9d
        L9c:
            return r7
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gtk(this.d, agswVar);
    }
}
