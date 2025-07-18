package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uah implements yjv {
    private final yyk a = new yyk();
    private tyq b;

    public uah(yjv yjvVar) {
        this.b = new uai(yjvVar);
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        yih yihVar = (yih) obj;
        tyq tyqVar = this.b;
        if (tyqVar instanceof uaf) {
            return ((uaf) tyqVar).a;
        }
        if (tyqVar instanceof uai) {
            return b(yihVar);
        }
        throw new yfu();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.uag
            if (r0 == 0) goto L13
            r0 = r7
            uag r0 = (defpackage.uag) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uag r0 = new uag
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
            goto L6c
        L2c:
            r7 = move-exception
            goto L84
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yyk r2 = r0.d
            defpackage.ybn.f(r7)
            r7 = r2
            goto L4c
        L3d:
            defpackage.ybn.f(r7)
            yyk r7 = r6.a
            r0.d = r7
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L88
        L4c:
            tyq r2 = r6.b     // Catch: java.lang.Throwable -> L80
            boolean r4 = r2 instanceof defpackage.uaf     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L57
            uaf r2 = (defpackage.uaf) r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r2.a     // Catch: java.lang.Throwable -> L80
            goto L76
        L57:
            boolean r4 = r2 instanceof defpackage.uai     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L7a
            uai r2 = (defpackage.uai) r2     // Catch: java.lang.Throwable -> L80
            yjv r2 = r2.a     // Catch: java.lang.Throwable -> L80
            r0.d = r7     // Catch: java.lang.Throwable -> L80
            r0.c = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L80
            if (r0 == r1) goto L88
            r5 = r0
            r0 = r7
            r7 = r5
        L6c:
            uaf r1 = new uaf     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            r6.b = r1     // Catch: java.lang.Throwable -> L2c
            r5 = r0
            r0 = r7
            r7 = r5
        L76:
            r7.d()
            return r0
        L7a:
            yfu r0 = new yfu     // Catch: java.lang.Throwable -> L80
            r0.<init>()     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L84:
            r0.d()
            throw r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.b(yih):java.lang.Object");
    }
}
