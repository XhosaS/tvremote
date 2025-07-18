package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qku implements qjy {
    public static final tvn a = tvn.n("GnpSdk");
    public final tst b;
    private final tst c;
    private final tst d;
    private final tst e;
    private final qli f;
    private final qjv g;
    private final yil h;
    private final xbw i;
    private final qjw j;
    private final qjl k;
    private final qjm l;
    private final qlm m;
    private final qei n;
    private final yfo o;
    private final qjq p;
    private final Context q;
    private final qoj r;
    private final tst s;
    private final yfo t;
    private final yyk u;
    private final rbi v;
    private final rbi w;
    private final rbi x;
    private final aafi y;
    private final cb z;

    public qku(tst tstVar, tst tstVar2, tst tstVar3, aafi aafiVar, rbi rbiVar, qli qliVar, qjv qjvVar, yil yilVar, cb cbVar, xbw xbwVar, qjw qjwVar, qjl qjlVar, qjm qjmVar, rbi rbiVar2, qlm qlmVar, osk oskVar, qei qeiVar, yfo yfoVar, tst tstVar4, qjq qjqVar, Context context, qoj qojVar, tst tstVar5, rbi rbiVar3, yfo yfoVar2) {
        aafiVar.getClass();
        qjvVar.getClass();
        xbwVar.getClass();
        qjwVar.getClass();
        qjlVar.getClass();
        qjmVar.getClass();
        rbiVar2.getClass();
        oskVar.getClass();
        qeiVar.getClass();
        yfoVar.getClass();
        qjqVar.getClass();
        qojVar.getClass();
        yfoVar2.getClass();
        this.c = tstVar;
        this.d = tstVar2;
        this.e = tstVar3;
        this.y = aafiVar;
        this.v = rbiVar;
        this.f = qliVar;
        this.g = qjvVar;
        this.h = yilVar;
        this.z = cbVar;
        this.i = xbwVar;
        this.j = qjwVar;
        this.k = qjlVar;
        this.l = qjmVar;
        this.w = rbiVar2;
        this.m = qlmVar;
        this.n = qeiVar;
        this.o = yfoVar;
        this.b = tstVar4;
        this.p = qjqVar;
        this.q = context;
        this.r = qojVar;
        this.s = tstVar5;
        this.x = rbiVar3;
        this.t = yfoVar2;
        this.u = new yyk();
    }

    public static final /* synthetic */ Object h(qku qkuVar, yow yowVar, vmd vmdVar, boolean z, qel qelVar, yih yihVar) {
        return xgg.a.get().e() ? qkuVar.i(yowVar, vmdVar, z, qelVar, yihVar) : qkuVar.k(yowVar, vmdVar, z, qelVar, yihVar);
    }

    private final void l(yow yowVar, vmd vmdVar, String str) {
        if (this.b.g()) {
            ykr.q(yowVar, null, 0, new fzp(this, vmdVar, str, (yih) null, 9), 3);
        }
    }

    private static final void m(qku qkuVar, vmd vmdVar, qel qelVar, String str) {
        ((snf) qkuVar.r.i.get()).b(qkuVar.q.getPackageName(), vmdVar.name(), str, qelVar.name());
    }

    private final cb n(qel qelVar) {
        if (qelVar.a()) {
            return this.z;
        }
        if (!qelVar.b()) {
            throw new IllegalStateException("Unsupported targetType for GnpRegistrationHandlerImpl");
        }
        Object objB = this.i.b();
        objB.getClass();
        return (cb) objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qjy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qpv r5, defpackage.qel r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.qkm
            if (r0 == 0) goto L13
            r0 = r7
            qkm r0 = (defpackage.qkm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qkm r0 = new qkm
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qel r6 = r0.d
            defpackage.ybn.f(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r7)
            rbi r7 = r4.v
            qnr r7 = r7.b(r6)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.b(r5, r0)
            if (r7 == r1) goto L85
        L44:
            qdl r7 = (defpackage.qdl) r7
            boolean r5 = r7 instanceof defpackage.qdi
            if (r5 == 0) goto L5c
            r5 = r7
            qdi r5 = (defpackage.qdi) r5
            java.lang.Throwable r5 = r5.a()
            tvn r0 = defpackage.qku.a
            tuv r0 = r0.g()
            java.lang.String r1 = "Failed to get account from storage."
            defpackage.a.co(r0, r1, r5)
        L5c:
            java.lang.Object r5 = r7.c()
            qen r5 = (defpackage.qen) r5
            if (r5 != 0) goto L67
            trk r5 = defpackage.trk.a
            return r5
        L67:
            rub r7 = new rub
            r0 = 0
            r7.<init>(r0)
            int r5 = r5.f
            r7.e(r5)
            cb r5 = r4.n(r6)
            java.lang.String r5 = r5.J()
            r7.c = r5
            qka r5 = r7.d()
            tst r5 = defpackage.tst.h(r5)
            return r5
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.a(qpv, qel, yih):java.lang.Object");
    }

    @Override // defpackage.qjy
    public final Object b(vmd vmdVar, qel qelVar, yih yihVar) {
        return ykr.l(this.h, new dkg(this, vmdVar, qelVar, (yih) null, 6), yihVar);
    }

    @Override // defpackage.qjy
    public final Object c(vmd vmdVar, qel qelVar, yih yihVar) {
        return ykr.l(this.h, new dkg(this, vmdVar, qelVar, null, 7, null), yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
    
        if (r2 != r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, yil] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.Map r18, defpackage.qel r19, defpackage.yih r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.d(java.util.Map, qel, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0158, code lost:
    
        if (g(r22, r23, r7, r9) == r10) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Type inference failed for: r21v0, types: [qku] */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, xbw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List r22, java.util.Map r23, java.lang.String r24, defpackage.qdl r25, int r26, int r27, defpackage.qqc r28, boolean r29, defpackage.vmd r30, defpackage.qel r31, java.lang.String r32, defpackage.yih r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.e(java.util.List, java.util.Map, java.lang.String, qdl, int, int, qqc, boolean, vmd, qel, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [qjw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.List r17, java.util.Map r18, java.lang.String r19, defpackage.vjj r20, defpackage.qel r21, java.util.Map r22, defpackage.vmd r23, java.lang.String r24, defpackage.yih r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.f(java.util.List, java.util.Map, java.lang.String, vjj, qel, java.util.Map, vmd, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r9, java.util.Map r10, defpackage.qel r11, defpackage.yih r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.qkt
            if (r0 == 0) goto L13
            r0 = r12
            qkt r0 = (defpackage.qkt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qkt r0 = new qkt
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.ybn.f(r12)     // Catch: java.lang.Exception -> L28
            goto Lc4
        L28:
            r9 = move-exception
            goto Lb9
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.ybn.f(r12)
            boolean r11 = r11.a()
            if (r11 != 0) goto L3e
            goto Lc4
        L3e:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r12 = 10
            int r2 = defpackage.yfm.z(r9, r12)
            int r2 = defpackage.yfm.e(r2)
            r4 = 16
            int r2 = defpackage.ykn.j(r2, r4)
            r11.<init>(r2)
            java.util.Iterator r2 = r9.iterator()
        L57:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r2.next()
            r6 = r5
            qpv r6 = (defpackage.qpv) r6
            qdn r6 = new qdn
            ygi r7 = defpackage.ygi.a
            r6.<init>(r7)
            r11.put(r5, r6)
            goto L57
        L6f:
            java.util.Set r10 = r10.keySet()
            java.util.Set r9 = defpackage.yfm.aq(r9)
            java.util.Set r9 = defpackage.wcq.ak(r10, r9)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r12 = defpackage.yfm.z(r9, r12)
            int r12 = defpackage.yfm.e(r12)
            int r12 = defpackage.ykn.j(r12, r4)
            r10.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L90:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto La8
            java.lang.Object r12 = r9.next()
            r2 = r12
            qpv r2 = (defpackage.qpv) r2
            qdn r2 = new qdn
            ygi r4 = defpackage.ygi.a
            r2.<init>(r4)
            r10.put(r12, r2)
            goto L90
        La8:
            tst r9 = r8.s
            ttd r9 = (defpackage.ttd) r9     // Catch: java.lang.Exception -> L28
            java.lang.Object r9 = r9.a     // Catch: java.lang.Exception -> L28
            jbr r9 = (defpackage.jbr) r9     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r9 = defpackage.jbr.s(r11, r10)     // Catch: java.lang.Exception -> L28
            if (r9 != r1) goto Lc4
            return r1
        Lb9:
            tvn r10 = defpackage.qku.a
            tuv r10 = r10.g()
            java.lang.String r11 = "Failed to report registration results"
            defpackage.a.co(r10, r11, r9)
        Lc4:
            ygi r9 = defpackage.ygi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.g(java.util.List, java.util.Map, qel, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4, types: [yyk] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.yow r8, defpackage.vmd r9, boolean r10, defpackage.qel r11, defpackage.yih r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.qkp
            if (r0 == 0) goto L13
            r0 = r12
            qkp r0 = (defpackage.qkp) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qkp r0 = new qkp
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.c
            yio r0 = defpackage.yio.a
            int r1 = r6.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r6.a
            yyk r8 = (defpackage.yyk) r8
            defpackage.ybn.f(r12)     // Catch: java.lang.Throwable -> L2f
            goto L7d
        L2f:
            r0 = move-exception
            r9 = r0
            goto L81
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            boolean r10 = r6.b
            yyk r8 = r6.h
            qel r11 = r6.g
            vmd r9 = r6.f
            java.lang.Object r1 = r6.a
            yow r1 = (defpackage.yow) r1
            defpackage.ybn.f(r12)
            r3 = r9
            r9 = r2
            r2 = r1
            goto L68
        L4d:
            defpackage.ybn.f(r12)
            yyk r12 = r7.u
            r6.a = r8
            r6.f = r9
            r6.g = r11
            r6.h = r12
            r6.b = r10
            r6.e = r3
            java.lang.Object r1 = r12.b(r6)
            if (r1 == r0) goto L85
            r3 = r9
            r9 = r2
            r2 = r8
            r8 = r12
        L68:
            r4 = r10
            r5 = r11
            r6.a = r8     // Catch: java.lang.Throwable -> L2f
            r10 = 0
            r6.f = r10     // Catch: java.lang.Throwable -> L2f
            r6.g = r10     // Catch: java.lang.Throwable -> L2f
            r6.h = r10     // Catch: java.lang.Throwable -> L2f
            r6.e = r9     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            java.lang.Object r12 = r1.k(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
            if (r12 != r0) goto L7d
            goto L85
        L7d:
            r8.d()
            return r12
        L81:
            r8.d()
            throw r9
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.i(yow, vmd, boolean, qel, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, xbw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.yow r19, defpackage.vmd r20, java.util.List r21, java.util.Map r22, boolean r23, defpackage.qel r24, defpackage.qqc r25, defpackage.yih r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.j(yow, vmd, java.util.List, java.util.Map, boolean, qel, qqc, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [qku] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.yow r11, defpackage.vmd r12, boolean r13, defpackage.qel r14, defpackage.yih r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qku.k(yow, vmd, boolean, qel, yih):java.lang.Object");
    }
}
