package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ahge r4, defpackage.agum r5, defpackage.agsw r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ahgb
            if (r0 == 0) goto L13
            r0 = r6
            ahgb r0 = (defpackage.ahgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahgb r0 = new ahgb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.agpl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.agpl.b(r6)
            agte r6 = r0.E
            r6.getClass()
            ahdk r2 = defpackage.ahdl.c
            agtc r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            ahar r6 = new ahar     // Catch: java.lang.Throwable -> L29
            agsw r0 = defpackage.agth.c(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.z()     // Catch: java.lang.Throwable -> L29
            ahgc r0 = new ahgc     // Catch: java.lang.Throwable -> L29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
            ahfn r4 = r4.b     // Catch: java.lang.Throwable -> L29
            r4.r(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.m()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.a()
            agpu r4 = defpackage.agpu.a
            return r4
        L6a:
            r5.a()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgd.a(ahge, agum, agsw):java.lang.Object");
    }

    public static final ahgg b(ahbt ahbtVar, agte agteVar, int i, int i2, int i3, agvb agvbVar) {
        ahge ahgeVar = new ahge(ahbj.b(ahbtVar, agteVar), ahfq.a(i, i2, 4));
        ahbv.b(i3, agvbVar, ahgeVar, ahgeVar);
        return ahgeVar;
    }
}
