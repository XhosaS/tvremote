package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ikx extends ilf {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r5.g(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object d(defpackage.ikx r5, java.lang.String r6, defpackage.wll r7, defpackage.wog r8, long r9, defpackage.yih r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ikw
            if (r0 == 0) goto L13
            r0 = r11
            ikw r0 = (defpackage.ikw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ikw r0 = new ikw
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.ybn.f(r11)
            goto L6c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            long r9 = r0.b
            wog r8 = r0.e
            java.lang.Object r5 = r0.a
            ikx r5 = (defpackage.ikx) r5
            defpackage.ybn.f(r11)
            goto L51
        L40:
            defpackage.ybn.f(r11)
            r0.a = r5
            r0.e = r8
            r0.b = r9
            r0.d = r4
            java.lang.Object r11 = r5.h(r6, r7, r0)
            if (r11 == r1) goto L6f
        L51:
            r6 = r11
            imi r6 = (defpackage.imi) r6
            r6.a(r8)
            r6.h = r9
            imi[] r7 = new defpackage.imi[r4]
            r8 = 0
            r7[r8] = r6
            r0.a = r11
            r6 = 0
            r0.e = r6
            r0.d = r3
            java.lang.Object r5 = r5.g(r7, r0)
            if (r5 != r1) goto L6c
            goto L6f
        L6c:
            ygi r5 = defpackage.ygi.a
            return r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikx.d(ikx, java.lang.String, wll, wog, long, yih):java.lang.Object");
    }

    public Object c(String str, wll wllVar, wog wogVar, long j, yih yihVar) {
        throw null;
    }

    public abstract ysx e(String str);
}
