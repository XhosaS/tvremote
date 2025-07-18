package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvs<T> implements ysy {
    final /* synthetic */ yrz a;
    final /* synthetic */ int b;

    public yvs(yrz yrzVar, int i) {
        this.a = yrzVar;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (defpackage.yoz.r(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ysy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, defpackage.yih<? super defpackage.ygi> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yvr
            if (r0 == 0) goto L13
            r0 = r8
            yvr r0 = (defpackage.yvr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yvr r0 = new yvr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r8)
            goto L53
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.ybn.f(r8)
            goto L4a
        L36:
            defpackage.ybn.f(r8)
            yrz r8 = r6.a
            int r2 = r6.b
            yhe r5 = new yhe
            r5.<init>(r2, r7)
            r0.c = r4
            java.lang.Object r7 = r8.a(r5, r0)
            if (r7 == r1) goto L56
        L4a:
            r0.c = r3
            java.lang.Object r7 = defpackage.yoz.r(r0)
            if (r7 != r1) goto L53
            goto L56
        L53:
            ygi r7 = defpackage.ygi.a
            return r7
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvs.emit(java.lang.Object, yih):java.lang.Object");
    }
}
