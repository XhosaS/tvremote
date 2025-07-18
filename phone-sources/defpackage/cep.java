package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cep {
    public final int a;
    public float b;
    private final yjz c;

    public cep(int i, yjz yjzVar) {
        this.a = i;
        this.c = yjzVar;
    }

    public final int a(int i) {
        return ykn.l(i - yln.v(this.b), 0, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(float r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ceo
            if (r0 == 0) goto L13
            r0 = r6
            ceo r0 = (defpackage.ceo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceo r0 = new ceo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            yjz r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cep.b(float, yih):java.lang.Object");
    }

    public final Object c(float f, yih yihVar) {
        Object objB = b(f - this.b, yihVar);
        return objB == yio.a ? objB : ygi.a;
    }
}
