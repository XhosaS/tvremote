package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class sqy {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(defpackage.sra r4, defpackage.agsw r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.sqz
            if (r0 == 0) goto L13
            r0 = r5
            sqz r0 = (defpackage.sqz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            sqz r0 = new sqz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.agpl.b(r5)
            srd r4 = (defpackage.srd) r4
            rux r4 = r4.a
            zyd r4 = r4.b()
            r0.b = r3
            java.lang.Object r5 = defpackage.ahkr.b(r4, r0)
            if (r5 == r1) goto L54
        L42:
            ruv r5 = (defpackage.ruv) r5
            java.lang.Object r4 = r5.f()
            rvk r4 = (defpackage.rvk) r4
            rxj r4 = r4.c
            if (r4 != 0) goto L50
            rxj r4 = defpackage.rxj.a
        L50:
            r4.getClass()
            return r4
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqy.a(sra, agsw):java.lang.Object");
    }

    public static String b(sra sraVar) {
        return "audio_session_timeout:" + sraVar.a();
    }
}
