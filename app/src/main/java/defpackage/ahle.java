package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahle {
    public static final ahmg a = new ahmg("UNDEFINED");
    public static final ahmg b = new ahmg("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x0097, DONT_GENERATE, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x003c, B:15:0x004a, B:17:0x0050, B:28:0x0080, B:18:0x005c, B:20:0x006c, B:25:0x0077, B:27:0x007d, B:34:0x008d, B:37:0x0096, B:36:0x0093, B:23:0x0072), top: B:47:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.agsw r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof defpackage.ahld
            if (r0 == 0) goto La4
            ahld r6 = (defpackage.ahld) r6
            java.lang.Object r0 = defpackage.ahbe.b(r7)
            ahbm r1 = r6.a
            agte r2 = r6.fr()
            boolean r2 = c(r1, r2)
            r3 = 1
            if (r2 == 0) goto L23
            r6.c = r0
            r6.e = r3
            agte r7 = r6.fr()
            b(r1, r7, r6)
            return
        L23:
            boolean r1 = defpackage.ahbx.a
            ahel r1 = defpackage.ahel.a
            ahcr r1 = r1.a()
            boolean r2 = r1.o()
            if (r2 == 0) goto L39
            r6.c = r0
            r6.e = r3
            r1.m(r6)
            return
        L39:
            r1.n(r3)
            agte r0 = r6.fr()     // Catch: java.lang.Throwable -> L97
            ahdk r2 = defpackage.ahdl.c     // Catch: java.lang.Throwable -> L97
            agtc r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L97
            ahdl r0 = (defpackage.ahdl) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L5c
            boolean r2 = r0.t()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L5c
            java.util.concurrent.CancellationException r7 = r0.o()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r7 = defpackage.agpl.a(r7)     // Catch: java.lang.Throwable -> L97
            r6.e(r7)     // Catch: java.lang.Throwable -> L97
            goto L80
        L5c:
            agsw r0 = r6.b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r6.d     // Catch: java.lang.Throwable -> L97
            agte r4 = r0.fr()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = defpackage.ahmn.b(r4, r2)     // Catch: java.lang.Throwable -> L97
            ahmg r5 = defpackage.ahmn.a     // Catch: java.lang.Throwable -> L97
            if (r2 == r5) goto L71
            aher r5 = defpackage.ahbj.c(r0, r4, r2)     // Catch: java.lang.Throwable -> L97
            goto L72
        L71:
            r5 = 0
        L72:
            r0.e(r7)     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L7d
            boolean r7 = r5.R()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L80
        L7d:
            defpackage.ahmn.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L80:
            boolean r7 = r1.q()     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L80
            r1.l(r3)
            return
        L8a:
            r7 = move-exception
            if (r5 == 0) goto L93
            boolean r0 = r5.R()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L96
        L93:
            defpackage.ahmn.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r7 = move-exception
            r6.H(r7)     // Catch: java.lang.Throwable -> L9f
            r1.l(r3)
            return
        L9f:
            r6 = move-exception
            r1.l(r3)
            throw r6
        La4:
            r6.e(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahle.a(agsw, java.lang.Object):void");
    }

    public static final void b(ahbm ahbmVar, agte agteVar, Runnable runnable) {
        try {
            ahbmVar.a(agteVar, runnable);
        } catch (Throwable th) {
            throw new ahcg(th, ahbmVar, agteVar);
        }
    }

    public static final boolean c(ahbm ahbmVar, agte agteVar) throws ahcg {
        try {
            return ahbmVar.b(agteVar);
        } catch (Throwable th) {
            throw new ahcg(th, ahbmVar, agteVar);
        }
    }
}
