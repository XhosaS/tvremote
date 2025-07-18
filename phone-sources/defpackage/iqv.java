package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqv extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ iqw f;
    final /* synthetic */ Object g;
    final /* synthetic */ iqt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqv(iqw iqwVar, Object obj, iqt iqtVar, yih yihVar) {
        super(2, yihVar);
        this.f = iqwVar;
        this.g = obj;
        this.h = iqtVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iqv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new iqv(this.f, this.g, this.h, yihVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:(6:5|36|6|30|23|24)(1:12))(3:13|(1:15)|29)|33|16|35|17|(3:19|23|24)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r0 = r1;
        r1 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            yio r0 = defpackage.yio.a
            int r1 = r5.e
            r2 = 1
            if (r1 == 0) goto L25
            if (r1 == r2) goto L17
            java.lang.Object r0 = r5.b
            iqt r0 = (defpackage.iqt) r0
            java.lang.Object r1 = r5.a
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            goto L6c
        L13:
            r6 = move-exception
            goto L76
        L15:
            r6 = move-exception
            goto L5c
        L17:
            java.lang.Object r1 = r5.d
            java.lang.Object r2 = r5.c
            java.lang.Object r3 = r5.b
            iqw r3 = (defpackage.iqw) r3
            java.lang.Object r4 = r5.a
            defpackage.ybn.f(r6)
            goto L41
        L25:
            defpackage.ybn.f(r6)
            iqw r3 = r5.f
            java.lang.Object r6 = r5.g
            iqt r1 = r5.h
            yyk r4 = r3.a
            r5.a = r4
            r5.b = r3
            r5.c = r6
            r5.d = r1
            r5.e = r2
            java.lang.Object r2 = r4.b(r5)
            if (r2 == r0) goto L7c
            r2 = r6
        L41:
            ysn r6 = r3.a(r2)     // Catch: java.lang.Throwable -> L74
            r5.a = r4     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L74
            r5.b = r1     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L74
            r2 = 0
            r5.c = r2     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L74
            r5.d = r2     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L74
            r2 = 2
            r5.e = r2     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L74
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L74
            if (r6 == r0) goto L7c
            r1 = r4
            goto L6c
        L59:
            r6 = move-exception
            r0 = r1
            r1 = r4
        L5c:
            java.lang.String r2 = "Error submitting mutation: "
            java.lang.String r2 = defpackage.a.cm(r6, r2)     // Catch: java.lang.Throwable -> L13
            defpackage.krd.c(r2)     // Catch: java.lang.Throwable -> L13
            iqt r0 = (defpackage.iqt) r0     // Catch: java.lang.Throwable -> L13
            yol r0 = r0.b     // Catch: java.lang.Throwable -> L13
            r0.d(r6)     // Catch: java.lang.Throwable -> L13
        L6c:
            yyk r1 = (defpackage.yyk) r1
            r1.d()
            ygi r6 = defpackage.ygi.a
            return r6
        L74:
            r6 = move-exception
            r1 = r4
        L76:
            yyk r1 = (defpackage.yyk) r1
            r1.d()
            throw r6
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
