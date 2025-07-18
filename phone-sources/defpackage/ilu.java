package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ilu extends ilf {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5.g(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object d(defpackage.ilu r5, java.lang.String r6, defpackage.wll r7, boolean r8, long r9, defpackage.yih r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ilt
            if (r0 == 0) goto L13
            r0 = r11
            ilt r0 = (defpackage.ilt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ilt r0 = new ilt
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.d
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.ybn.f(r11)
            goto L68
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            long r9 = r0.c
            boolean r8 = r0.b
            java.lang.Object r5 = r0.a
            ilu r5 = (defpackage.ilu) r5
            defpackage.ybn.f(r11)
            goto L51
        L40:
            defpackage.ybn.f(r11)
            r0.a = r5
            r0.b = r8
            r0.c = r9
            r0.e = r4
            java.lang.Object r11 = r5.h(r6, r7, r0)
            if (r11 == r1) goto L6b
        L51:
            r6 = r11
            imi r6 = (defpackage.imi) r6
            r6.d = r8
            r6.h = r9
            imi[] r7 = new defpackage.imi[r4]
            r8 = 0
            r7[r8] = r6
            r0.a = r11
            r0.e = r3
            java.lang.Object r5 = r5.g(r7, r0)
            if (r5 != r1) goto L68
            goto L6b
        L68:
            ygi r5 = defpackage.ygi.a
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilu.d(ilu, java.lang.String, wll, boolean, long, yih):java.lang.Object");
    }

    public Object c(String str, wll wllVar, boolean z, long j, yih yihVar) {
        throw null;
    }

    public abstract ysx e(String str);
}
