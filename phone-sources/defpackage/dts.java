package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dts implements dtn {
    public static final dts a = new dts();
    private static final yyk c = new yyk();
    private static final Map b = new LinkedHashMap();

    private dts() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, defpackage.dtt r7, java.lang.String r8, defpackage.yih r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.dtq
            if (r0 == 0) goto L13
            r0 = r9
            dtq r0 = (defpackage.dtq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtq r0 = new dtq
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ybn.f(r9)
            goto L41
        L36:
            defpackage.ybn.f(r9)
            r0.c = r4
            java.lang.Object r9 = r5.b(r6, r7, r8, r0)
            if (r9 == r1) goto L51
        L41:
            dbd r9 = (defpackage.dbd) r9
            ysx r6 = r9.b()
            r0.c = r3
            java.lang.Object r6 = defpackage.vyf.x(r6, r0)
            if (r6 != r1) goto L50
            goto L51
        L50:
            return r6
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dts.a(android.content.Context, dtt, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4, types: [yyk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r7, defpackage.dtt r8, java.lang.String r9, defpackage.yih r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.dtp
            if (r0 == 0) goto L13
            r0 = r10
            dtp r0 = (defpackage.dtp) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dtp r0 = new dtp
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            yio r1 = defpackage.yio.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.c
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.b
            yyk r8 = (defpackage.yyk) r8
            java.lang.Object r9 = r0.a
            java.lang.String r9 = (java.lang.String) r9
            defpackage.ybn.f(r10)     // Catch: java.lang.Throwable -> L36
            goto L8d
        L36:
            r7 = move-exception
            goto L9c
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            yyk r7 = r0.g
            java.lang.Object r8 = r0.c
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.b
            dtt r8 = (defpackage.dtt) r8
            java.lang.Object r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            defpackage.ybn.f(r10)
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L71
        L58:
            defpackage.ybn.f(r10)
            yyk r10 = defpackage.dts.c
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.g = r10
            r0.f = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto La0
            r5 = r9
            r9 = r8
            r8 = r10
            r10 = r5
        L71:
            java.util.Map r2 = defpackage.dts.b     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r2.get(r10)     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L93
            r0.a = r10     // Catch: java.lang.Throwable -> L36
            r0.b = r8     // Catch: java.lang.Throwable -> L36
            r0.c = r2     // Catch: java.lang.Throwable -> L36
            r4 = 0
            r0.g = r4     // Catch: java.lang.Throwable -> L36
            r0.f = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = r9.a(r7, r10)     // Catch: java.lang.Throwable -> L36
            if (r7 == r1) goto La0
            r9 = r10
            r10 = r7
            r7 = r2
        L8d:
            r4 = r10
            dbd r4 = (defpackage.dbd) r4     // Catch: java.lang.Throwable -> L36
            r7.put(r9, r4)     // Catch: java.lang.Throwable -> L36
        L93:
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            dbd r4 = (defpackage.dbd) r4     // Catch: java.lang.Throwable -> L36
            r8.d()
            return r4
        L9c:
            r8.d()
            throw r7
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dts.b(android.content.Context, dtt, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r6, defpackage.dtt r7, java.lang.String r8, defpackage.yjz r9, defpackage.yih r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.dtr
            if (r0 == 0) goto L13
            r0 = r10
            dtr r0 = (defpackage.dtr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtr r0 = new dtr
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ale r9 = r0.d
            defpackage.ybn.f(r10)
            goto L48
        L38:
            defpackage.ybn.f(r10)
            r10 = r9
            ale r10 = (defpackage.ale) r10
            r0.d = r10
            r0.c = r4
            java.lang.Object r10 = r5.b(r6, r7, r8, r0)
            if (r10 == r1) goto L57
        L48:
            dbd r10 = (defpackage.dbd) r10
            r6 = 0
            r0.d = r6
            r0.c = r3
            java.lang.Object r6 = r10.a(r9, r0)
            if (r6 != r1) goto L56
            goto L57
        L56:
            return r6
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dts.c(android.content.Context, dtt, java.lang.String, yjz, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r5, java.lang.String r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dto
            if (r0 == 0) goto L13
            r0 = r7
            dto r0 = (defpackage.dto) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dto r0 = new dto
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yyk r5 = r0.f
            java.lang.String r6 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r7)
            r7 = r5
            r5 = r0
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.ybn.f(r7)
            yyk r7 = defpackage.dts.c
            r0.a = r5
            r0.e = r6
            r0.f = r7
            r0.d = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L63
        L4a:
            java.util.Map r0 = defpackage.dts.b     // Catch: java.lang.Throwable -> L5e
            r0.remove(r6)     // Catch: java.lang.Throwable -> L5e
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L5e
            java.io.File r5 = defpackage.cwq.g(r5, r6)     // Catch: java.lang.Throwable -> L5e
            r5.delete()     // Catch: java.lang.Throwable -> L5e
            r7.d()
            ygi r5 = defpackage.ygi.a
            return r5
        L5e:
            r5 = move-exception
            r7.d()
            throw r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dts.d(android.content.Context, java.lang.String, yih):java.lang.Object");
    }
}
