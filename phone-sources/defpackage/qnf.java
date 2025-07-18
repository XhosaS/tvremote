package defpackage;

import android.content.Context;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qnf implements qmr {
    public static final tvn a = tvn.n("GnpSdk");
    private static final qgu c = qgu.a("X-Goog-Api-Key");
    private static final qgu d = qgu.a("X-Android-Cert");
    private static final qgu e = qgu.a("X-Android-Package");
    private static final qgu f = qgu.a("Authorization");
    private static final qgu g = qgu.a("Cookie");
    public final yil b;
    private final qgt h;
    private final qei i;
    private final String j;
    private final qja k;
    private final Context l;
    private final String m;
    private final tst n;

    static {
        qgu.a("X-Goog-Visitor-Id");
        qgu.a("X-Goog-Fitbit-Oauth-Token");
    }

    public qnf(qgt qgtVar, qei qeiVar, String str, qja qjaVar, Context context, String str2, yil yilVar, tst tstVar) {
        qeiVar.getClass();
        qjaVar.getClass();
        this.h = qgtVar;
        this.i = qeiVar;
        this.j = str;
        this.k = qjaVar;
        this.l = context;
        this.m = str2;
        this.b = yilVar;
        this.n = tstVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r15 == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01af, code lost:
    
        if (r12 != r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0299, code lost:
    
        if (r15 == r1) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.vji r11, java.lang.String r12, defpackage.qen r13, boolean r14, defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.a(vji, java.lang.String, qen, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f4 -> B:38:0x00f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r17, java.lang.String r18, defpackage.vjj r19, boolean r20, defpackage.yih r21) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.b(java.util.List, java.lang.String, vjj, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qgv r6, defpackage.qpv r7, java.lang.String r8, boolean r9, defpackage.yih r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.c(qgv, qpv, java.lang.String, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qpv r5, java.lang.String r6, java.net.URL r7, defpackage.vvj r8, boolean r9, defpackage.yih r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.qna
            if (r0 == 0) goto L13
            r0 = r10
            qna r0 = (defpackage.qna) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qna r0 = new qna
            r0.<init>(r4, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.a
            yio r1 = defpackage.yio.a
            int r2 = r10.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            qgv r5 = r10.d
            defpackage.ybn.f(r0)
            goto L57
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.ybn.f(r0)
            r0 = r8
            r8 = r6
            qgv r6 = defpackage.qgw.a()
            r2 = 2
            r6.c = r2
            r6.e(r7)
            r6.d()
            byte[] r7 = r0.h()
            r6.b = r7
            r10.d = r6
            r10.c = r3
            r7 = r5
            r5 = r4
            java.lang.Object r0 = r5.c(r6, r7, r8, r9, r10)
            if (r0 == r1) goto L6f
            r5 = r6
        L57:
            qdl r0 = (defpackage.qdl) r0
            boolean r6 = r0.g()
            if (r6 == 0) goto L65
            r0.getClass()
            qdi r0 = (defpackage.qdi) r0
            return r0
        L65:
            qdn r6 = new qdn
            qgw r5 = r5.a()
            r6.<init>(r5)
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.d(qpv, java.lang.String, java.net.URL, vvj, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List r10, java.lang.String r11, defpackage.vjj r12, boolean r13, defpackage.yih r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.qnb
            if (r0 == 0) goto L13
            r0 = r14
            qnb r0 = (defpackage.qnb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qnb r0 = new qnb
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.c
            yio r0 = defpackage.yio.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            java.lang.Object r10 = r6.b
            vjj r11 = r6.f
            defpackage.ybn.f(r14)
            goto L82
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            boolean r13 = r6.a
            defpackage.ybn.f(r14)
            r1 = r9
            goto L51
        L3e:
            defpackage.ybn.f(r14)
            r6.a = r13
            r6.e = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.b(r2, r3, r4, r5, r6)
            if (r14 == r0) goto La8
            r13 = r5
        L51:
            qdl r14 = (defpackage.qdl) r14
            java.lang.String r10 = "/v1/multiloginupdate"
            java.net.URL r4 = r9.i(r10)
            boolean r10 = r14 instanceof defpackage.qdn
            if (r10 == 0) goto La2
            qdn r14 = (defpackage.qdn) r14
            java.lang.Object r10 = r14.a
            yfw r10 = (defpackage.yfw) r10
            java.lang.Object r11 = r10.a
            r5 = r11
            vjj r5 = (defpackage.vjj) r5
            java.lang.Object r10 = r10.b
            java.util.Map r10 = (java.util.Map) r10
            r8 = r6
            vjl r6 = defpackage.vjl.a
            r6.getClass()
            r8.f = r5
            r8.b = r10
            r8.e = r7
            r2 = 0
            r3 = 0
            r7 = r13
            java.lang.Object r14 = r1.f(r2, r3, r4, r5, r6, r7, r8)
            if (r14 == r0) goto La8
            r11 = r5
        L82:
            qdl r14 = (defpackage.qdl) r14
            boolean r12 = r14 instanceof defpackage.qdn
            if (r12 == 0) goto L9c
            qdn r12 = new qdn
            qjz r13 = new qjz
            qdn r14 = (defpackage.qdn) r14
            java.lang.Object r14 = r14.a
            r14.getClass()
            vjl r14 = (defpackage.vjl) r14
            r13.<init>(r11, r14, r10)
            r12.<init>(r13)
            return r12
        L9c:
            r14.getClass()
            qdi r14 = (defpackage.qdi) r14
            return r14
        La2:
            r14.getClass()
            qdi r14 = (defpackage.qdi) r14
            return r14
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.e(java.util.List, java.lang.String, vjj, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qpv r12, java.lang.String r13, java.net.URL r14, defpackage.vvj r15, defpackage.vvj r16, boolean r17, defpackage.yih r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.f(qpv, java.lang.String, java.net.URL, vvj, vvj, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.qpv r12, java.lang.String r13, java.net.URL r14, defpackage.vvj r15, defpackage.vvj r16, defpackage.yih r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.qnd
            if (r1 == 0) goto L15
            r1 = r0
            qnd r1 = (defpackage.qnd) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            qnd r1 = new qnd
            r1.<init>(r11, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.b
            yio r1 = defpackage.yio.a
            int r2 = r9.d
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 == r3) goto L35
            if (r2 != r10) goto L2d
            defpackage.ybn.f(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            vjt r12 = r9.h
            vjs r13 = r9.g
            java.net.URL r14 = r9.f
            java.lang.String r2 = r9.e
            java.lang.Object r3 = r9.a
            defpackage.ybn.f(r0)
            r7 = r12
            r6 = r13
            r4 = r2
            goto L6f
        L46:
            defpackage.ybn.f(r0)
            r9.a = r12
            r9.e = r13
            r9.f = r14
            r0 = r15
            vjs r0 = (defpackage.vjs) r0
            r9.g = r0
            r0 = r16
            vjt r0 = (defpackage.vjt) r0
            r9.h = r0
            r9.d = r3
            r8 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.Object r0 = r2.f(r3, r4, r5, r6, r7, r8, r9)
            if (r0 == r1) goto L8e
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
        L6f:
            r5 = r14
            qdl r0 = (defpackage.qdl) r0
            boolean r12 = r0 instanceof defpackage.qmm
            if (r12 == 0) goto L8d
            r12 = 0
            r9.a = r12
            r9.e = r12
            r9.f = r12
            r9.g = r12
            r9.h = r12
            r9.d = r10
            r8 = 1
            r2 = r11
            java.lang.Object r12 = r2.f(r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r1) goto L8c
            goto L8e
        L8c:
            return r12
        L8d:
            return r0
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.g(qpv, java.lang.String, java.net.URL, vvj, vvj, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r6, defpackage.qpv r7, boolean r8, defpackage.yih r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.qne
            if (r0 == 0) goto L13
            r0 = r9
            qne r0 = (defpackage.qne) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qne r0 = new qne
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.a
            defpackage.ybn.f(r9)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r7 = r0.a
            defpackage.ybn.f(r9)
            goto L4c
        L3a:
            defpackage.ybn.f(r9)
            if (r8 == 0) goto L4f
            qja r8 = r5.k
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r8.e(r6, r0)
            if (r9 != r1) goto L4c
            goto L5d
        L4c:
            qdl r9 = (defpackage.qdl) r9
            goto L60
        L4f:
            qja r8 = r5.k
            r0.a = r7
            r0.d = r3
            java.lang.String r9 = "oauth2:https://www.googleapis.com/auth/notifications"
            java.lang.Object r9 = r8.d(r6, r9, r0)
            if (r9 != r1) goto L5e
        L5d:
            return r1
        L5e:
            qdl r9 = (defpackage.qdl) r9
        L60:
            boolean r6 = r9 instanceof defpackage.qiz
            if (r6 == 0) goto L70
            qmj r6 = new qmj
            qiz r9 = (defpackage.qiz) r9
            java.io.IOException r8 = r9.a
            int r9 = r9.b
            r6.<init>(r8, r7, r9)
            return r6
        L70:
            boolean r6 = r9 instanceof defpackage.qix
            if (r6 == 0) goto L80
            qmh r6 = new qmh
            qix r9 = (defpackage.qix) r9
            java.lang.Throwable r8 = r9.a
            int r9 = r9.b
            r6.<init>(r8, r7, r9)
            return r6
        L80:
            boolean r6 = r9 instanceof defpackage.qiy
            if (r6 == 0) goto L90
            qmh r6 = new qmh
            qiy r9 = (defpackage.qiy) r9
            com.google.android.gms.auth.UserRecoverableAuthException r8 = r9.a
            int r9 = r9.b
            r6.<init>(r8, r7, r9)
            return r6
        L90:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.h(java.lang.String, qpv, boolean, yih):java.lang.Object");
    }

    public final URL i(String str) {
        return new URL(this.j.concat(str));
    }
}
