package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywv {
    public static final yxo a = new yxo("UNDEFINED");
    public static final yxo b = new yxo("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x0097, DONT_GENERATE, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x003c, B:15:0x004a, B:17:0x0050, B:28:0x0080, B:18:0x005c, B:20:0x006c, B:25:0x0077, B:27:0x007d, B:34:0x008d, B:37:0x0096, B:36:0x0093, B:23:0x0072), top: B:47:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.yih r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof defpackage.ywu
            if (r0 == 0) goto La4
            ywu r6 = (defpackage.ywu) r6
            java.lang.Object r0 = defpackage.yks.m(r7)
            yot r1 = r6.a
            yil r2 = r6.getContext()
            boolean r2 = c(r1, r2)
            r3 = 1
            if (r2 == 0) goto L23
            r6.c = r0
            r6.e = r3
            yil r7 = r6.getContext()
            b(r1, r7, r6)
            return
        L23:
            boolean r1 = defpackage.yoy.a
            java.lang.ThreadLocal r1 = defpackage.yra.a
            ypp r1 = defpackage.yra.a()
            boolean r2 = r1.p()
            if (r2 == 0) goto L39
            r6.c = r0
            r6.e = r3
            r1.n(r6)
            return
        L39:
            r1.o(r3)
            yil r0 = r6.getContext()     // Catch: java.lang.Throwable -> L97
            bbx r2 = defpackage.yqe.c     // Catch: java.lang.Throwable -> L97
            yij r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L97
            yqe r0 = (defpackage.yqe) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L5c
            boolean r2 = r0.u()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L5c
            java.util.concurrent.CancellationException r7 = r0.q()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r7 = defpackage.ybn.e(r7)     // Catch: java.lang.Throwable -> L97
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L97
            goto L80
        L5c:
            yih r0 = r6.b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r6.d     // Catch: java.lang.Throwable -> L97
            yil r4 = r0.getContext()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = defpackage.yxr.b(r4, r2)     // Catch: java.lang.Throwable -> L97
            yxo r5 = defpackage.yxr.a     // Catch: java.lang.Throwable -> L97
            if (r2 == r5) goto L71
            yrg r5 = defpackage.yos.c(r0, r4, r2)     // Catch: java.lang.Throwable -> L97
            goto L72
        L71:
            r5 = 0
        L72:
            r0.resumeWith(r7)     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L7d
            boolean r7 = r5.T()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L80
        L7d:
            defpackage.yxr.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L80:
            boolean r7 = r1.r()     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L80
            r1.m(r3)
            return
        L8a:
            r7 = move-exception
            if (r5 == 0) goto L93
            boolean r0 = r5.T()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L96
        L93:
            defpackage.yxr.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r7 = move-exception
            r6.E(r7)     // Catch: java.lang.Throwable -> L9f
            r1.m(r3)
            return
        L9f:
            r6 = move-exception
            r1.m(r3)
            throw r6
        La4:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywv.a(yih, java.lang.Object):void");
    }

    public static final void b(yot yotVar, yil yilVar, Runnable runnable) {
        try {
            yotVar.a(yilVar, runnable);
        } catch (Throwable th) {
            throw new ypg(th, yotVar, yilVar);
        }
    }

    public static final boolean c(yot yotVar, yil yilVar) throws ypg {
        try {
            return yotVar.cF(yilVar);
        } catch (Throwable th) {
            throw new ypg(th, yotVar, yilVar);
        }
    }
}
