package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahgk implements ahgr {
    public abstract Object b(ahgs ahgsVar, agsw agswVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fD(defpackage.ahgs r5, defpackage.agsw r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahgj
            if (r0 == 0) goto L13
            r0 = r6
            ahgj r0 = (defpackage.ahgj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahgj r0 = new ahgj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ahke r5 = r0.d
            defpackage.agpl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r6 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.agpl.b(r6)
            agte r6 = r0.E
            ahke r2 = new ahke
            r6.getClass()
            r2.<init>(r5, r6)
            r0.d = r2     // Catch: java.lang.Throwable -> L52
            r0.c = r3     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r4.b(r2, r0)     // Catch: java.lang.Throwable -> L52
            if (r5 == r1) goto L51
            r5 = r2
        L4b:
            r5.g()
            agpu r5 = defpackage.agpu.a
            return r5
        L51:
            return r1
        L52:
            r5 = move-exception
            r6 = r5
            r5 = r2
        L55:
            r5.g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgk.fD(ahgs, agsw):java.lang.Object");
    }
}
