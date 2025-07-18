package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afj {
    private static final bcp a = new bdz(new gf(13));
    private static Boolean b;

    public static final boolean a(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: RejectedExecutionException -> 0x008c, TryCatch #0 {RejectedExecutionException -> 0x008c, blocks: (B:8:0x0036, B:14:0x0043, B:16:0x0053, B:21:0x005e, B:23:0x0073, B:26:0x0087, B:25:0x0077, B:18:0x0059, B:10:0x003c), top: B:32:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r9, defpackage.chc r10, defpackage.esn r11, defpackage.bao r12, int r13) {
        /*
            bcp r0 = defpackage.afj.a
            java.lang.Object r0 = r12.f(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto L92
            int r1 = r9.length()
            boolean r1 = a(r1)
            if (r1 == 0) goto L92
            r1 = 1254328095(0x4ac3871f, float:6407055.5)
            r12.x(r1)
            bcp r1 = defpackage.ccq.i
            java.lang.Object r1 = r12.f(r1)
            r4 = r1
            cmi r4 = (defpackage.cmi) r4
            bcp r1 = defpackage.ccq.d
            java.lang.Object r1 = r12.f(r1)
            r6 = r1
            clx r6 = (defpackage.clx) r6
            r1 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 32
            r5 = 1
            if (r1 <= r3) goto L3c
            boolean r1 = r12.F(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r1 != 0) goto L40
        L3c:
            r1 = r13 & 48
            if (r1 != r3) goto L42
        L40:
            r1 = r5
            goto L43
        L42:
            r1 = r2
        L43:
            int r3 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            boolean r3 = r12.D(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r1 = r1 | r3
            r3 = r13 & 14
            r3 = r3 ^ 6
            r7 = 4
            if (r3 <= r7) goto L59
            boolean r3 = r12.F(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r3 != 0) goto L5d
        L59:
            r13 = r13 & 6
            if (r13 != r7) goto L5e
        L5d:
            r2 = r5
        L5e:
            r13 = r1 | r2
            boolean r1 = r12.F(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r13 = r13 | r1
            boolean r1 = r12.H(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r13 = r13 | r1
            r1 = r12
            bas r1 = (defpackage.bas) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            java.lang.Object r1 = r1.T()     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r13 != 0) goto L77
            java.lang.Object r13 = defpackage.ban.a     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r1 != r13) goto L87
        L77:
            fnc r2 = new fnc     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r8 = 1
            r5 = r9
            r3 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r9 = r12
            bas r9 = (defpackage.bas) r9     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r9.ae(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r1 = r2
        L87:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
        L8c:
            bas r12 = (defpackage.bas) r12
            r12.aa()
            return
        L92:
            r9 = 1255196839(0x4ad0c8a7, float:6841427.5)
            r12.x(r9)
            bas r12 = (defpackage.bas) r12
            r12.aa()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afj.b(java.lang.String, chc, esn, bao, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: RejectedExecutionException -> 0x0092, TryCatch #0 {RejectedExecutionException -> 0x0092, blocks: (B:8:0x0036, B:14:0x0043, B:16:0x0058, B:21:0x0063, B:23:0x0078, B:26:0x008d, B:25:0x007c, B:18:0x005e, B:10:0x003c), top: B:32:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.cfy r10, defpackage.chc r11, defpackage.esn r12, java.util.List r13, defpackage.bao r14, int r15) {
        /*
            bcp r0 = defpackage.afj.a
            java.lang.Object r0 = r14.f(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto L98
            int r1 = r10.a()
            boolean r1 = a(r1)
            if (r1 == 0) goto L98
            r1 = -518708178(0xffffffffe115242e, float:-1.7194824E20)
            r14.x(r1)
            bcp r1 = defpackage.ccq.i
            java.lang.Object r1 = r14.f(r1)
            r4 = r1
            cmi r4 = (defpackage.cmi) r4
            bcp r1 = defpackage.ccq.d
            java.lang.Object r1 = r14.f(r1)
            r7 = r1
            clx r7 = (defpackage.clx) r7
            r1 = r15 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 32
            r5 = 1
            if (r1 <= r3) goto L3c
            boolean r1 = r14.F(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r1 != 0) goto L40
        L3c:
            r1 = r15 & 48
            if (r1 != r3) goto L42
        L40:
            r1 = r5
            goto L43
        L42:
            r1 = r2
        L43:
            int r3 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            boolean r3 = r14.D(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r1 = r1 | r3
            boolean r3 = r14.H(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r1 = r1 | r3
            r3 = r15 & 14
            r3 = r3 ^ 6
            r6 = 4
            if (r3 <= r6) goto L5e
            boolean r3 = r14.F(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r3 != 0) goto L62
        L5e:
            r15 = r15 & 6
            if (r15 != r6) goto L63
        L62:
            r2 = r5
        L63:
            r15 = r1 | r2
            boolean r1 = r14.F(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r15 = r15 | r1
            boolean r1 = r14.H(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r15 = r15 | r1
            r1 = r14
            bas r1 = (defpackage.bas) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            java.lang.Object r1 = r1.T()     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r15 != 0) goto L7c
            java.lang.Object r15 = defpackage.ban.a     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r1 != r15) goto L8d
        L7c:
            rvo r2 = new rvo     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r9 = 1
            r6 = r10
            r3 = r11
            r8 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r10 = r14
            bas r10 = (defpackage.bas) r10     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r10.ae(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r1 = r2
        L8d:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
        L92:
            bas r14 = (defpackage.bas) r14
            r14.aa()
            return
        L98:
            r10 = -517807721(0xffffffffe122e197, float:-1.8778925E20)
            r14.x(r10)
            bas r14 = (defpackage.bas) r14
            r14.aa()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afj.c(cfy, chc, esn, java.util.List, bao, int):void");
    }
}
