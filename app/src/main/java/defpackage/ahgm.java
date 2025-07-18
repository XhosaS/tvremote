package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgm extends ahgn {
    private final agvb d;

    public ahgm(agvb agvbVar, agte agteVar, int i, int i2) {
        super(agvbVar, agteVar, i, i2);
        this.d = agvbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahgn, defpackage.ahjj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object b(defpackage.ahge r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahgl
            if (r0 == 0) goto L13
            r0 = r6
            ahgl r0 = (defpackage.ahgl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahgl r0 = new ahgl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ahge r5 = r0.d
            defpackage.agpl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.agpl.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ahgn.d(r4, r5, r0)
            if (r6 == r1) goto L51
        L3e:
            ahfn r5 = r5.b
            boolean r5 = r5.y()
            if (r5 == 0) goto L49
            agpu r5 = defpackage.agpu.a
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgm.b(ahge, agsw):java.lang.Object");
    }

    @Override // defpackage.ahgn, defpackage.ahjj
    protected final ahjj c(agte agteVar, int i, int i2) {
        return new ahgm(this.d, agteVar, i, i2);
    }

    public /* synthetic */ ahgm(agvb agvbVar) {
        super(agvbVar, agtf.a, -2, 1);
        this.d = agvbVar;
    }
}
