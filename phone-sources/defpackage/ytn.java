package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ytn<T> implements ysy {
    final /* synthetic */ yld a;
    final /* synthetic */ int b;
    final /* synthetic */ ysy c;

    public ytn(yld yldVar, int i, ysy ysyVar) {
        this.a = yldVar;
        this.b = i;
        this.c = ysyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ysy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r6, defpackage.yih<? super defpackage.ygi> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ytm
            if (r0 == 0) goto L13
            r0 = r7
            ytm r0 = (defpackage.ytm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ytm r0 = new ytm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ybn.f(r7)
            yld r7 = r5.a
            int r2 = r5.b
            int r4 = r7.a
            if (r4 < r2) goto L48
            ysy r7 = r5.c
            r0.c = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            ygi r6 = defpackage.ygi.a
            return r6
        L48:
            int r4 = r4 + r3
            r7.a = r4
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytn.emit(java.lang.Object, yih):java.lang.Object");
    }
}
