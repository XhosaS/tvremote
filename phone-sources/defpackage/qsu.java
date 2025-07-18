package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsu {
    public static final tvn a = tvn.n("GnpSdk");
    private static final qgu g = qgu.a("Cookie");
    private static final qgu h = qgu.a("X-Goog-Visitor-Id");
    private static final qgu i = qgu.a("X-Goog-PageId");
    private static final qgu j = qgu.a("X-Goog-Fitbit-Oauth-Token");
    private static final qgu k = qgu.a("X-Goog-Api-Key");
    private static final qgu l = qgu.a("X-Android-Cert");
    private static final qgu m = qgu.a("X-Android-Package");
    public final Context b;
    public final qja c;
    public final qoj d;
    public final tst e;
    public final tst f;
    private final qei n;
    private final String o;
    private final qgt p;
    private final tst q;
    private final String r;
    private final yil s;
    private final yil t;

    public qsu(Context context, qja qjaVar, qei qeiVar, String str, qgt qgtVar, qoj qojVar, tst tstVar, tst tstVar2, String str2, tst tstVar3, yil yilVar, yil yilVar2) {
        qjaVar.getClass();
        qeiVar.getClass();
        qojVar.getClass();
        this.b = context;
        this.c = qjaVar;
        this.n = qeiVar;
        this.o = str;
        this.p = qgtVar;
        this.d = qojVar;
        this.q = tstVar;
        this.e = tstVar2;
        this.r = str2;
        this.f = tstVar3;
        this.s = yilVar;
        this.t = yilVar2;
    }

    private final Object i(String str, boolean z, yih yihVar) {
        return ykr.l(this.s, new alb(z, this, str, (yih) null, 6), yihVar);
    }

    private final void j(qgv qgvVar) {
        qgvVar.c(k, this.n.f);
        String str = this.r;
        if (str == null || str.length() == 0) {
            return;
        }
        qgvVar.c(m, this.b.getPackageName());
        qgvVar.c(l, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qgv r5, defpackage.qen r6, boolean r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qsn
            if (r0 == 0) goto L13
            r0 = r8
            qsn r0 = (defpackage.qsn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsn r0 = new qsn
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qen r6 = r0.e
            qgv r5 = r0.d
            defpackage.ybn.f(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r8)
            java.lang.String r8 = r6.d
            if (r8 == 0) goto L7b
            int r2 = r8.length()
            if (r2 != 0) goto L41
            goto L7b
        L41:
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r8 = r4.i(r8, r7, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            qdl r8 = (defpackage.qdl) r8
            boolean r7 = r8 instanceof defpackage.qdn
            if (r7 == 0) goto L6f
            java.lang.String r7 = "Authorization"
            qgu r7 = defpackage.qgu.a(r7)
            r0 = r8
            qdn r0 = (defpackage.qdn) r0
            java.lang.Object r0 = r0.a
            java.util.Objects.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Bearer "
            java.lang.String r0 = r1.concat(r0)
            r5.c(r7, r0)
        L6f:
            java.lang.String r6 = r6.c
            qgu r7 = defpackage.qsu.i
            r5.c(r7, r6)
            qdl r5 = defpackage.osk.ak(r8)
            return r5
        L7b:
            tvn r5 = defpackage.qsu.a
            tuv r5 = r5.f()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r6 = "No account name was supplied for delegated Gaia."
            r5.s(r6)
            qdj r5 = new qdj
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            r6 = 50
            r5.<init>(r7, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.a(qgv, qen, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qgv r7, defpackage.qen r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qso
            if (r0 == 0) goto L13
            r0 = r9
            qso r0 = (defpackage.qso) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qso r0 = new qso
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qgv r7 = r0.d
            defpackage.ybn.f(r9)
            goto L60
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r9)
            tst r9 = r6.f
            boolean r9 = r9.g()
            if (r9 != 0) goto L4b
            qdj r7 = new qdj
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "fitbitAuthDataProvider not found, can't get fitbit auth token."
            r8.<init>(r9)
            r9 = 49
            r7.<init>(r8, r9)
            return r7
        L4b:
            yil r9 = r6.s
            pfd r2 = new pfd
            r4 = 0
            r5 = 17
            r2.<init>(r6, r8, r4, r5)
            r0.d = r7
            r0.c = r3
            java.lang.Object r9 = defpackage.ykr.l(r9, r2, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            qdl r9 = (defpackage.qdl) r9
            boolean r8 = r9 instanceof defpackage.qdn
            if (r8 == 0) goto L72
            qgu r8 = defpackage.qsu.j
            r0 = r9
            qdn r0 = (defpackage.qdn) r0
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            r7.c(r8, r0)
        L72:
            qdl r7 = defpackage.osk.ak(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.b(qgv, qen, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qgv r5, defpackage.qpz r6, boolean r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qsp
            if (r0 == 0) goto L13
            r0 = r8
            qsp r0 = (defpackage.qsp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsp r0 = new qsp
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qgv r5 = r0.d
            defpackage.ybn.f(r8)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r8)
            java.lang.String r6 = r6.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r8 = r4.i(r6, r7, r0)
            if (r8 == r1) goto L66
        L40:
            qdl r8 = (defpackage.qdl) r8
            boolean r6 = r8 instanceof defpackage.qdn
            if (r6 == 0) goto L61
            java.lang.String r6 = "Authorization"
            qgu r6 = defpackage.qgu.a(r6)
            r7 = r8
            qdn r7 = (defpackage.qdn) r7
            java.lang.Object r7 = r7.a
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Bearer "
            java.lang.String r7 = r0.concat(r7)
            r5.c(r6, r7)
        L61:
            qdl r5 = defpackage.osk.ak(r8)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.c(qgv, qpz, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qgv r5, defpackage.qen r6, boolean r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qsq
            if (r0 == 0) goto L13
            r0 = r8
            qsq r0 = (defpackage.qsq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsq r0 = new qsq
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L89
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r8)
            if (r6 == 0) goto L96
            java.lang.String r8 = r6.b
            if (r8 == 0) goto L96
            int r8 = r8.length()
            if (r8 != 0) goto L3f
            goto L96
        L3f:
            r0.c = r3
            qpv r8 = r6.b()
            boolean r2 = r8 instanceof defpackage.qpz
            if (r2 == 0) goto L51
            qpz r8 = (defpackage.qpz) r8
            java.lang.Object r5 = r4.c(r5, r8, r7, r0)
        L4f:
            r8 = r5
            goto L86
        L51:
            boolean r2 = r8 instanceof defpackage.qpw
            if (r2 == 0) goto L5a
            java.lang.Object r5 = r4.a(r5, r6, r7, r0)
            goto L4f
        L5a:
            boolean r7 = r8 instanceof defpackage.qpx
            if (r7 == 0) goto L66
            r4.j(r5)
            java.lang.Object r5 = r4.b(r5, r6, r0)
            goto L4f
        L66:
            qqn r6 = defpackage.qqn.a
            boolean r6 = defpackage.yks.e(r8, r6)
            if (r6 == 0) goto L76
            r4.j(r5)
            java.lang.Object r5 = r4.f(r5, r0)
            goto L4f
        L76:
            qql r6 = defpackage.qql.a
            boolean r6 = defpackage.yks.e(r8, r6)
            if (r6 == 0) goto L90
            r4.j(r5)
            java.lang.Object r5 = r4.e(r5, r0)
            goto L4f
        L86:
            if (r8 != r1) goto L89
            return r1
        L89:
            qdl r8 = (defpackage.qdl) r8
            qdl r5 = defpackage.osk.ak(r8)
            return r5
        L90:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        L96:
            qei r6 = r4.n
            java.lang.String r6 = r6.f
            if (r6 == 0) goto Lae
            int r6 = r6.length()
            if (r6 != 0) goto La3
            goto Lae
        La3:
            r4.j(r5)
            qdn r5 = new qdn
            ygi r6 = defpackage.ygi.a
            r5.<init>(r6)
            return r5
        Lae:
            qdj r5 = new qdj
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "One of Account representation or API Key must be set."
            r6.<init>(r7)
            r7 = 54
            r5.<init>(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.d(qgv, qen, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qgv r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qsr
            if (r0 == 0) goto L13
            r0 = r8
            qsr r0 = (defpackage.qsr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsr r0 = new qsr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qgv r7 = r0.d
            defpackage.ybn.f(r8)     // Catch: java.lang.Exception -> L6f
            goto L5f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
            tst r8 = r6.e
            boolean r8 = r8.g()
            if (r8 != 0) goto L4b
            qdj r7 = new qdj
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "YouTubeVisitorDataProvider not found, can't get Visitor cookie"
            r8.<init>(r0)
            r0 = 11
            r7.<init>(r8, r0)
            return r7
        L4b:
            yil r8 = r6.s     // Catch: java.lang.Exception -> L6f
            oza r2 = new oza     // Catch: java.lang.Exception -> L6f
            r4 = 0
            r5 = 14
            r2.<init>(r6, r4, r5)     // Catch: java.lang.Exception -> L6f
            r0.d = r7     // Catch: java.lang.Exception -> L6f
            r0.c = r3     // Catch: java.lang.Exception -> L6f
            java.lang.Object r8 = defpackage.ykr.l(r8, r2, r0)     // Catch: java.lang.Exception -> L6f
            if (r8 == r1) goto L6e
        L5f:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L6f
            qgu r0 = defpackage.qsu.h     // Catch: java.lang.Exception -> L6f
            r7.c(r0, r8)     // Catch: java.lang.Exception -> L6f
            qdn r7 = new qdn     // Catch: java.lang.Exception -> L6f
            ygi r8 = defpackage.ygi.a     // Catch: java.lang.Exception -> L6f
            r7.<init>(r8)     // Catch: java.lang.Exception -> L6f
            return r7
        L6e:
            return r1
        L6f:
            r7 = move-exception
            qdj r8 = new qdj
            r0 = 13
            r8.<init>(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.e(qgv, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qgv r5, defpackage.yih r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qss
            if (r0 == 0) goto L13
            r0 = r6
            qss r0 = (defpackage.qss) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qss r0 = new qss
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qgv r5 = r0.d
            defpackage.ybn.f(r6)     // Catch: java.lang.Exception -> L7a
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            tst r6 = r4.q
            ttd r6 = (defpackage.ttd) r6     // Catch: java.lang.Exception -> L7a
            java.lang.Object r6 = r6.a     // Catch: java.lang.Exception -> L7a
            cb r6 = (defpackage.cb) r6     // Catch: java.lang.Exception -> L7a
            uhp r6 = r6.G()     // Catch: java.lang.Exception -> L7a
            r0.d = r5     // Catch: java.lang.Exception -> L7a
            r0.c = r3     // Catch: java.lang.Exception -> L7a
            java.lang.Object r6 = defpackage.wae.U(r6, r0)     // Catch: java.lang.Exception -> L7a
            if (r6 == r1) goto L79
        L4a:
            omv r6 = (defpackage.omv) r6     // Catch: java.lang.Exception -> L7a
            java.lang.String r6 = r6.a     // Catch: java.lang.Exception -> L7a
            if (r6 == 0) goto L6a
            int r0 = r6.length()     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L57
            goto L6a
        L57:
            qgu r0 = defpackage.qsu.g     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = "NID="
            java.lang.String r6 = defpackage.a.cr(r6, r1)     // Catch: java.lang.Exception -> L7a
            r5.c(r0, r6)     // Catch: java.lang.Exception -> L7a
            qdn r5 = new qdn     // Catch: java.lang.Exception -> L7a
            ygi r6 = defpackage.ygi.a     // Catch: java.lang.Exception -> L7a
            r5.<init>(r6)     // Catch: java.lang.Exception -> L7a
            return r5
        L6a:
            qdj r5 = new qdj     // Catch: java.lang.Exception -> L7a
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "Zwieback Cookie is null or empty."
            r6.<init>(r0)     // Catch: java.lang.Exception -> L7a
            r0 = 9
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L7a
            return r5
        L79:
            return r1
        L7a:
            r5 = move-exception
            qdj r6 = new qdj
            r0 = 10
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.f(qgv, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[Catch: Exception -> 0x0105, TryCatch #0 {Exception -> 0x0105, blocks: (B:13:0x0029, B:31:0x00b1, B:33:0x00b9, B:35:0x00d6, B:39:0x00e0, B:41:0x00e8, B:18:0x003a, B:24:0x007c, B:26:0x0082, B:28:0x0096, B:21:0x0041), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8 A[Catch: Exception -> 0x0105, TRY_LEAVE, TryCatch #0 {Exception -> 0x0105, blocks: (B:13:0x0029, B:31:0x00b1, B:33:0x00b9, B:35:0x00d6, B:39:0x00e0, B:41:0x00e8, B:18:0x003a, B:24:0x007c, B:26:0x0082, B:28:0x0096, B:21:0x0041), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r10, defpackage.qen r11, defpackage.vvj r12, defpackage.vvj r13, boolean r14, defpackage.yih r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.h(java.lang.String, qen, vvj, vvj, boolean, yih):java.lang.Object");
    }
}
