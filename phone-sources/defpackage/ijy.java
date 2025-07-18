package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ijy implements ijf {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (defpackage.gez.l(((defpackage.ike) r7).a, false, true, new defpackage.ijr(r8, (java.lang.Object) r9, 3), r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object d(defpackage.ijy r7, java.lang.String r8, defpackage.wni r9, defpackage.yih r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ijx
            if (r0 == 0) goto L13
            r0 = r10
            ijx r0 = (defpackage.ijx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ijx r0 = new ijx
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ybn.f(r10)
            goto L73
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            wni r9 = r0.d
            java.lang.String r8 = r0.c
            ike r7 = r0.e
            defpackage.ybn.f(r10)
            goto L59
        L3d:
            defpackage.ybn.f(r10)
            r10 = r7
            ike r10 = (defpackage.ike) r10
            r0.e = r10
            r0.c = r8
            r0.d = r9
            r0.b = r5
            gex r10 = r10.a
            ijr r2 = new ijr
            r6 = 6
            r2.<init>(r8, r9, r6)
            java.lang.Object r10 = defpackage.gez.l(r10, r3, r5, r2, r0)
            if (r10 == r1) goto L76
        L59:
            r10 = 0
            r0.e = r10
            r0.c = r10
            r0.d = r10
            r0.b = r4
            ijr r10 = new ijr
            r2 = 3
            r10.<init>(r8, r9, r2)
            ike r7 = (defpackage.ike) r7
            gex r7 = r7.a
            java.lang.Object r7 = defpackage.gez.l(r7, r3, r5, r10, r0)
            if (r7 != r1) goto L73
            goto L76
        L73:
            ygi r7 = defpackage.ygi.a
            return r7
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy.d(ijy, java.lang.String, wni, yih):java.lang.Object");
    }

    public Object c(String str, wni wniVar, yih yihVar) {
        throw null;
    }

    public abstract Object e(String str, yih yihVar);

    public abstract Object f(String str, wni wniVar, yih yihVar);

    public abstract Object g(String str, String str2, int i, yih yihVar);

    public abstract Object h(String str, String str2, int i, yih yihVar);

    public abstract Object i(String str, yih yihVar);

    public abstract Object j(String str, wni wniVar, yih yihVar);

    public abstract Object k(String str, long j, yih yihVar);

    public abstract Object l(String str, long j, int i, int i2, yih yihVar);

    public abstract Object m(String str, wni wniVar, yih yihVar);

    public abstract Object n(String str, yih yihVar);

    public abstract ysx o(ghq ghqVar);
}
