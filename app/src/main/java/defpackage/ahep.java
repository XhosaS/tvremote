package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahep {
    public static final Object a(long j, agvb agvbVar, agsw agswVar) {
        if (j > 0) {
            return c(new ahen(j, agswVar), agvbVar);
        }
        throw new ahem("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(long r7, defpackage.agvb r9, defpackage.agsw r10) {
        /*
            boolean r0 = r10 instanceof defpackage.aheo
            if (r0 == 0) goto L13
            r0 = r10
            aheo r0 = (defpackage.aheo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aheo r0 = new aheo
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            agwh r7 = r0.c
            defpackage.agpl.b(r10)     // Catch: defpackage.ahem -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.agpl.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            agwh r10 = new agwh
            r10.<init>()
            r0.c = r10     // Catch: defpackage.ahem -> L56
            r0.b = r4     // Catch: defpackage.ahem -> L56
            ahen r2 = new ahen     // Catch: defpackage.ahem -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.ahem -> L56
            r10.a = r2     // Catch: defpackage.ahem -> L56
            java.lang.Object r7 = c(r2, r9)     // Catch: defpackage.ahem -> L56
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            ahdl r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahep.b(long, agvb, agsw):java.lang.Object");
    }

    private static final Object c(ahen ahenVar, agvb agvbVar) {
        ahdp.b(ahenVar, true, new ahcp(ahce.d(ahenVar.e.fr()).g(ahenVar.b, ahenVar, ((ahab) ahenVar).a)));
        return ahmv.a(ahenVar, false, ahenVar, agvbVar);
    }
}
