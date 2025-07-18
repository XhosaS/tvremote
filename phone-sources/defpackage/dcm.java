package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcm {
    public List b;
    final /* synthetic */ dbz c;
    private final yyk d = new yyk();
    public final yol a = new yol();

    public dcm(dbz dbzVar, List list) {
        this.c = dbzVar;
        this.b = yfm.al(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dcl
            if (r0 == 0) goto L13
            r0 = r7
            dcl r0 = (defpackage.dcl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dcl r0 = new dcl
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yyk r0 = r0.d
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L2c
            goto L70
        L2c:
            r7 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yyk r2 = r0.d
            defpackage.ybn.f(r7)
            r7 = r2
            goto L57
        L3d:
            defpackage.ybn.f(r7)
            yol r7 = r6.a
            boolean r7 = r7.w()
            if (r7 == 0) goto L4b
            ygi r7 = defpackage.ygi.a
            return r7
        L4b:
            yyk r7 = r6.d
            r0.d = r7
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L85
        L57:
            yol r2 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r2.w()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L65
            ygi r0 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L7d
            r7.d()
            return r0
        L65:
            r0.d = r7     // Catch: java.lang.Throwable -> L7d
            r0.c = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r6.b(r0)     // Catch: java.lang.Throwable -> L7d
            if (r0 == r1) goto L85
            r0 = r7
        L70:
            yol r7 = r6.a     // Catch: java.lang.Throwable -> L2c
            ygi r1 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L2c
            r7.S(r1)     // Catch: java.lang.Throwable -> L2c
            r0.d()
            ygi r7 = defpackage.ygi.a
            return r7
        L7d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L81:
            r0.d()
            throw r7
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcm.a(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object b(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dbe
            if (r0 == 0) goto L13
            r0 = r7
            dbe r0 = (defpackage.dbe) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dbe r0 = new dbe
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.ybn.f(r7)
            goto L66
        L36:
            defpackage.ybn.f(r7)
            java.util.List r7 = r6.b
            if (r7 == 0) goto L5b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L44
            goto L5b
        L44:
            dbz r7 = r6.c
            cvi r2 = r7.m()
            dbh r4 = new dbh
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.b = r3
            java.lang.Object r7 = r2.r(r4, r0)
            if (r7 == r1) goto L72
        L58:
            dax r7 = (defpackage.dax) r7
            goto L68
        L5b:
            dbz r7 = r6.c
            r0.b = r4
            r2 = 0
            java.lang.Object r7 = r7.h(r2, r0)
            if (r7 == r1) goto L72
        L66:
            dax r7 = (defpackage.dax) r7
        L68:
            dbz r0 = r6.c
            cxe r0 = r0.g
            r0.F(r7)
            ygi r7 = defpackage.ygi.a
            return r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcm.b(yih):java.lang.Object");
    }

    public dcm() {
    }
}
