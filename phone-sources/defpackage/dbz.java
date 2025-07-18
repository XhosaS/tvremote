package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbz implements dbd {
    public final dcr a;
    public final yow b;
    public final dcm e;
    public final dfb f;
    private final daw h;
    private int i;
    private yqe j;
    public final ysx c = new ysq(new dbn(this, null));
    private final yyk l = new yyk();
    public final cxe g = new cxe();
    public final yft d = new yga(new awa(this, 19));
    private final yft k = new yga(new awa(this, 20));

    public dbz(dcr dcrVar, List list, daw dawVar, yow yowVar) {
        this.a = dcrVar;
        this.h = dawVar;
        this.b = yowVar;
        this.e = new dcm(this, list);
        this.f = new dfb(yowVar, new bap(this, 14), new xb(15), new aki(this, (yih) null, 5));
    }

    @Override // defpackage.dbd
    public final Object a(yjz yjzVar, yih yihVar) {
        dcu dcuVar = (dcu) yihVar.getContext().get(bbx.d);
        if (dcuVar != null) {
            dcuVar.a(this);
        }
        return ykr.l(new dcu(dcuVar, this), new uc(this, yjzVar, (yih) null, 10), yihVar);
    }

    @Override // defpackage.dbd
    public final ysx b() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dbo
            if (r0 == 0) goto L13
            r0 = r5
            dbo r0 = (defpackage.dbo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbo r0 = new dbo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yyk r0 = r0.d
            defpackage.ybn.f(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ybn.f(r5)
            yyk r5 = r4.l
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L5e
            r0 = r5
        L41:
            int r5 = r4.i     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + (-1)
            r4.i = r5     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L53
            yqe r5 = r4.j     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L50
            defpackage.ylh.ah(r5)     // Catch: java.lang.Throwable -> L59
        L50:
            r5 = 0
            r4.j = r5     // Catch: java.lang.Throwable -> L59
        L53:
            r0.d()
            ygi r5 = defpackage.ygi.a
            return r5
        L59:
            r5 = move-exception
            r0.d()
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.c(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dbq
            if (r0 == 0) goto L13
            r0 = r6
            dbq r0 = (defpackage.dbq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbq r0 = new dbq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yyk r0 = r0.d
            defpackage.ybn.f(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ybn.f(r6)
            yyk r6 = r5.l
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L64
            r0 = r6
        L41:
            int r6 = r5.i     // Catch: java.lang.Throwable -> L5f
            int r6 = r6 + r3
            r5.i = r6     // Catch: java.lang.Throwable -> L5f
            if (r6 != r3) goto L59
            yow r6 = r5.b     // Catch: java.lang.Throwable -> L5f
            btr r1 = new btr     // Catch: java.lang.Throwable -> L5f
            r2 = 6
            r3 = 0
            r1.<init>(r5, r3, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r4 = 3
            yqe r6 = defpackage.ykr.q(r6, r3, r2, r1, r4)     // Catch: java.lang.Throwable -> L5f
            r5.j = r6     // Catch: java.lang.Throwable -> L5f
        L59:
            r0.d()
            ygi r6 = defpackage.ygi.a
            return r6
        L5f:
            r6 = move-exception
            r0.d()
            throw r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.d(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r2.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yih r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dbr
            if (r0 == 0) goto L13
            r0 = r7
            dbr r0 = (defpackage.dbr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dbr r0 = new dbr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.a
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            defpackage.ybn.f(r7)
            goto L49
        L3a:
            defpackage.ybn.f(r7)
            cvi r7 = r6.m()
            r0.d = r4
            java.lang.Object r7 = r7.t()
            if (r7 == r1) goto L6e
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            dcm r2 = r6.e     // Catch: java.lang.Throwable -> L5f
            r0.a = r7     // Catch: java.lang.Throwable -> L5f
            r0.d = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r2.a(r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r1) goto L5c
            goto L6e
        L5c:
            ygi r7 = defpackage.ygi.a
            return r7
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            cxe r1 = r6.g
            dck r2 = new dck
            r2.<init>(r7, r0)
            r1.F(r2)
            throw r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.e(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r0 != r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r0 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r2 = r14 instanceof defpackage.dbs
            if (r2 == 0) goto L13
            r2 = r14
            dbs r2 = (defpackage.dbs) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.e = r3
            goto L18
        L13:
            dbs r2 = new dbs
            r2.<init>(r12, r14)
        L18:
            r6 = r2
            java.lang.Object r0 = r6.c
            yio r7 = defpackage.yio.a
            int r2 = r6.e
            r8 = 3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 == r3) goto L37
            if (r2 != r8) goto L2f
            defpackage.ybn.f(r0)
            goto La9
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            defpackage.ybn.f(r0)
            goto L8e
        L3b:
            boolean r2 = r6.a
            java.lang.Object r5 = r6.b
            defpackage.ybn.f(r0)
            goto L61
        L43:
            defpackage.ybn.f(r0)
            cxe r0 = r12.g
            dcq r5 = r0.E()
            boolean r0 = r5 instanceof defpackage.dcs
            if (r0 != 0) goto Lc0
            cvi r0 = r12.m()
            r6.b = r5
            r6.a = r13
            r6.e = r4
            java.lang.Object r0 = r0.t()
            if (r0 == r7) goto Lbf
            r2 = r13
        L61:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r9 = r5 instanceof defpackage.dax
            if (r9 == 0) goto L71
            r10 = r5
            dax r10 = (defpackage.dax) r10
            int r10 = r10.c
            goto L72
        L71:
            r10 = -1
        L72:
            if (r9 == 0) goto L78
            if (r0 == r10) goto L77
            goto L78
        L77:
            return r5
        L78:
            r9 = 0
            if (r2 == 0) goto L91
            cvi r0 = r12.m()
            dcb r2 = new dcb
            r2.<init>(r12, r9, r4)
            r6.b = r9
            r6.e = r3
            java.lang.Object r0 = r0.r(r2, r6)
            if (r0 == r7) goto Lbf
        L8e:
            yfw r0 = (defpackage.yfw) r0
            goto Lab
        L91:
            cvi r11 = r12.m()
            dbu r0 = new dbu
            r4 = 1
            r5 = 0
            r3 = 0
            r1 = r12
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.b = r9
            r6.e = r8
            java.lang.Object r0 = r11.s(r0, r6)
            if (r0 == r7) goto Lbf
        La9:
            yfw r0 = (defpackage.yfw) r0
        Lab:
            java.lang.Object r2 = r0.a
            dcq r2 = (defpackage.dcq) r2
            java.lang.Object r0 = r0.b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbe
            cxe r0 = r12.g
            r0.F(r2)
        Lbe:
            return r2
        Lbf:
            return r7
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.f(boolean, yih):java.lang.Object");
    }

    public final Object g(yih yihVar) {
        return k().b(new iaz(null, 1, null), yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: dav -> 0x0077, TRY_ENTER, TryCatch #3 {dav -> 0x0077, blocks: (B:19:0x0054, B:56:0x00e5, B:22:0x005b, B:53:0x00c9, B:47:0x00ab, B:30:0x0073, B:41:0x008d, B:43:0x0093), top: B:85:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120 A[Catch: all -> 0x0149, TryCatch #1 {all -> 0x0149, blocks: (B:64:0x010d, B:66:0x0120, B:67:0x0125), top: B:82:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125 A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #1 {all -> 0x0149, blocks: (B:64:0x010d, B:66:0x0120, B:67:0x0125), top: B:82:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(boolean r14, defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.h(boolean, yih):java.lang.Object");
    }

    public final Object i(yjz yjzVar, yil yilVar, yih yihVar) {
        return m().r(new dbw(this, yilVar, yjzVar, (yih) null, 0), yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r11, boolean r12, defpackage.yih r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.dbx
            if (r0 == 0) goto L13
            r0 = r13
            dbx r0 = (defpackage.dbx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbx r0 = new dbx
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yld r11 = r0.d
            defpackage.ybn.f(r13)
            goto L51
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.ybn.f(r13)
            yld r5 = new yld
            r5.<init>()
            dcg r13 = r10.k()
            dby r4 = new dby
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r5
            r0.c = r3
            java.lang.Object r11 = r13.c(r4, r0)
            if (r11 == r1) goto L59
            r11 = r5
        L51:
            int r11 = r11.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.j(java.lang.Object, boolean, yih):java.lang.Object");
    }

    public final dcg k() {
        return (dcg) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yil] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.dfb r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dbp
            if (r0 == 0) goto L13
            r0 = r9
            dbp r0 = (defpackage.dbp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbp r0 = new dbp
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yol r8 = r0.d
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L29
            goto L62
        L29:
            r9 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r8.c
            java.lang.Object r2 = r8.d     // Catch: java.lang.Throwable -> L5a
            yil r4 = r0.getContext()     // Catch: java.lang.Throwable -> L5a
            yil r2 = r2.plus(r4)     // Catch: java.lang.Throwable -> L5a
            dbv r4 = new dbv     // Catch: java.lang.Throwable -> L5a
            r5 = 0
            r4.<init>(r7, r8, r5, r3)     // Catch: java.lang.Throwable -> L5a
            r8 = r9
            yol r8 = (defpackage.yol) r8     // Catch: java.lang.Throwable -> L5a
            r0.d = r8     // Catch: java.lang.Throwable -> L5a
            r0.c = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r8 = defpackage.ykr.l(r2, r4, r0)     // Catch: java.lang.Throwable -> L5a
            if (r8 == r1) goto L59
            r6 = r9
            r9 = r8
            r8 = r6
            goto L62
        L59:
            return r1
        L5a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L5e:
            java.lang.Object r9 = defpackage.ybn.e(r9)
        L62:
            yol r8 = (defpackage.yol) r8
            defpackage.yks.n(r8, r9)
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.l(dfb, yih):java.lang.Object");
    }

    public final cvi m() {
        return (cvi) this.k.a();
    }
}
