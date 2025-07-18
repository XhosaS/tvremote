package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ikm implements ijf {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.gez.l(((defpackage.ikp) r10).a, false, true, new defpackage.gxb(r9, 18), r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(defpackage.ikm r9, java.lang.String r10, defpackage.yih r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ikl
            if (r0 == 0) goto L13
            r0 = r11
            ikl r0 = (defpackage.ikl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ikl r0 = new ikl
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ybn.f(r11)
            goto L95
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.String r9 = r0.c
            ikp r10 = r0.d
            defpackage.ybn.f(r11)
            goto L7c
        L3e:
            java.lang.String r10 = r0.c
            ikp r9 = r0.d
            defpackage.ybn.f(r11)
            goto L61
        L46:
            defpackage.ybn.f(r11)
            r11 = r9
            ikp r11 = (defpackage.ikp) r11
            r0.d = r11
            r0.c = r10
            r0.b = r6
            gex r11 = r11.a
            gxb r2 = new gxb
            r7 = 17
            r2.<init>(r10, r7)
            java.lang.Object r11 = defpackage.gez.l(r11, r5, r6, r2, r0)
            if (r11 == r1) goto L98
        L61:
            r11 = r9
            ikp r11 = (defpackage.ikp) r11
            r0.d = r11
            r0.c = r10
            r0.b = r4
            gxb r2 = new gxb
            r4 = 19
            r2.<init>(r10, r4)
            gex r11 = r11.a
            java.lang.Object r11 = defpackage.gez.l(r11, r5, r6, r2, r0)
            if (r11 == r1) goto L98
            r8 = r10
            r10 = r9
            r9 = r8
        L7c:
            r11 = 0
            r0.d = r11
            r0.c = r11
            r0.b = r3
            gxb r11 = new gxb
            r2 = 18
            r11.<init>(r9, r2)
            ikp r10 = (defpackage.ikp) r10
            gex r9 = r10.a
            java.lang.Object r9 = defpackage.gez.l(r9, r5, r6, r11, r0)
            if (r9 != r1) goto L95
            goto L98
        L95:
            ygi r9 = defpackage.ygi.a
            return r9
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikm.e(ikm, java.lang.String, yih):java.lang.Object");
    }

    public abstract Object c(String str, yih yihVar);

    public Object d(String str, yih yihVar) {
        throw null;
    }
}
