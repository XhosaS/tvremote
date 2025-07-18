package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class icl {
    public static final Object b = new Object();
    private final ysn a;
    private final yol d = new yol();
    private final ynu c = new ynu(false, ynv.a);

    public icl(yow yowVar) {
        this.a = vyf.T(yowVar, 0, new aki(this, (yih) null, 15), 13);
    }

    public abstract Object d(Object obj, yih yihVar);

    public void e() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r6.z(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ick
            if (r0 == 0) goto L13
            r0 = r6
            ick r0 = (defpackage.ick) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ick r0 = new ick
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r6)     // Catch: defpackage.ysg -> L50
            goto L50
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.ybn.f(r6)     // Catch: defpackage.ysg -> L50
            goto L45
        L36:
            defpackage.ybn.f(r6)
            ysn r6 = r5.a     // Catch: defpackage.ysg -> L50
            java.lang.Object r2 = defpackage.icl.b     // Catch: defpackage.ysg -> L50
            r0.c = r4     // Catch: defpackage.ysg -> L50
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: defpackage.ysg -> L50
            if (r6 == r1) goto L4f
        L45:
            yol r6 = r5.d     // Catch: defpackage.ysg -> L50
            r0.c = r3     // Catch: defpackage.ysg -> L50
            java.lang.Object r6 = r6.z(r0)     // Catch: defpackage.ysg -> L50
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icl.f(yih):java.lang.Object");
    }

    public final Object g(Object obj, yih yihVar) {
        Object objA = this.a.a(obj, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    public final void h() {
        if (this.c.d(false, true)) {
            try {
                e();
            } finally {
                this.a.e(null);
                this.d.S(ygi.a);
            }
        }
    }
}
