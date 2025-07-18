package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yss extends ysu {
    private final yjz d;

    public yss(yjz yjzVar, yil yilVar, int i, int i2) {
        super(yjzVar, yilVar, i, i2);
        this.d = yjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ysu, defpackage.yvl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ysk r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ysr
            if (r0 == 0) goto L13
            r0 = r6
            ysr r0 = (defpackage.ysr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysr r0 = new ysr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ysk r5 = r0.d
            defpackage.ybn.f(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ysu.g(r4, r5, r0)
            if (r6 == r1) goto L51
        L3e:
            yrz r5 = r5.b
            boolean r5 = r5.f()
            if (r5 == 0) goto L49
            ygi r5 = defpackage.ygi.a
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yss.b(ysk, yih):java.lang.Object");
    }

    @Override // defpackage.ysu, defpackage.yvl
    protected final yvl c(yil yilVar, int i, int i2) {
        return new yss(this.d, yilVar, i, i2);
    }

    public /* synthetic */ yss(yjz yjzVar) {
        this(yjzVar, yim.a, -2, 1);
    }
}
