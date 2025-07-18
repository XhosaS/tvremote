package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dst implements dso {
    public final Class a;
    public final yjz b;
    public final czt c;
    private final yyk e = new yyk();
    private final dss d = new dss(this);

    public dst(Class cls, yjz yjzVar, czt cztVar) {
        this.a = cls;
        this.b = yjzVar;
        this.c = cztVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yjz r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dsp
            if (r0 == 0) goto L13
            r0 = r8
            dsp r0 = (defpackage.dsp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsp r0 = new dsp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            yyk r7 = (defpackage.yyk) r7
            defpackage.ybn.f(r8)     // Catch: java.lang.Throwable -> L2e
            goto L68
        L2e:
            r8 = move-exception
            goto L70
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yyk r7 = r0.e
            java.lang.Object r2 = r0.a
            yjz r2 = (defpackage.yjz) r2
            defpackage.ybn.f(r8)
            r8 = r7
            r7 = r2
            goto L55
        L44:
            defpackage.ybn.f(r8)
            yyk r8 = r6.e
            r0.a = r7
            r0.e = r8
            r0.d = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 == r1) goto L74
        L55:
            dss r2 = r6.d     // Catch: java.lang.Throwable -> L6c
            r0.a = r8     // Catch: java.lang.Throwable -> L6c
            r4 = 0
            r0.e = r4     // Catch: java.lang.Throwable -> L6c
            r0.d = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r1) goto L65
            goto L74
        L65:
            r5 = r8
            r8 = r7
            r7 = r5
        L68:
            r7.d()
            return r8
        L6c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L70:
            r7.d()
            throw r8
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dst.a(yjz, yih):java.lang.Object");
    }

    @Override // defpackage.dso
    public final /* synthetic */ String b() {
        return "KEY";
    }
}
