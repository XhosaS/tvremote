package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvk implements alu {
    final /* synthetic */ uje a;

    public fvk(uje ujeVar) {
        this.a = ujeVar;
    }

    @Override // defpackage.alu
    public final Object a(agsw agswVar) throws Throwable {
        zyd zydVarA = this.a.a();
        zydVarA.getClass();
        Object objB = ahkr.b(zydVarA, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    @Override // defpackage.alu
    public final /* bridge */ /* synthetic */ Object c(Object obj, agsw agswVar) {
        zyd zydVarC = this.a.c();
        zydVarC.getClass();
        return ahkr.b(zydVarC, agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.alu
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.fxg r5, defpackage.agsw r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fvj
            if (r0 == 0) goto L13
            r0 = r6
            fvj r0 = (defpackage.fvj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fvj r0 = new fvj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.agpl.b(r6)
            uje r6 = r4.a
            zyd r5 = r6.b(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.ahkr.b(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvk.b(fxg, agsw):java.lang.Object");
    }
}
