package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ixr {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (defpackage.bpr.d(r5.a, false, true, new defpackage.ixx(r5, r6), r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(defpackage.ixt r5, java.util.List r6, defpackage.agsw r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ixs
            if (r0 == 0) goto L13
            r0 = r7
            ixs r0 = (defpackage.ixs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ixs r0 = new ixs
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r7)
            goto L67
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.a
            ixz r5 = r0.d
            defpackage.agpl.b(r7)
            goto L4c
        L3a:
            defpackage.agpl.b(r7)
            r7 = r5
            ixz r7 = (defpackage.ixz) r7
            r0.d = r7
            r0.a = r6
            r0.c = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 == r1) goto L6a
        L4c:
            r7 = 0
            r0.d = r7
            r0.a = r7
            r0.c = r3
            r6.getClass()
            ixz r5 = (defpackage.ixz) r5
            bmn r7 = r5.a
            ixx r2 = new ixx
            r2.<init>()
            r5 = 0
            java.lang.Object r5 = defpackage.bpr.d(r7, r5, r4, r2, r0)
            if (r5 != r1) goto L67
            goto L6a
        L67:
            agpu r5 = defpackage.agpu.a
            return r5
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixr.a(ixt, java.util.List, agsw):java.lang.Object");
    }
}
