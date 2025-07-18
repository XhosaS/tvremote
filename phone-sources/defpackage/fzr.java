package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzr extends gbo {
    public final fzi a;
    private final yil c;
    private int d = Integer.MIN_VALUE;

    public fzr(yil yilVar, fzi fziVar) {
        this.c = yilVar;
        this.a = fziVar;
        fziVar.a.c(new fzq(this, 1));
        e(new ddd(this, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // defpackage.gbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.gbk r9, defpackage.yih r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.gbj
            if (r0 == 0) goto L7
            fzx r1 = defpackage.fzx.a
            goto L14
        L7:
            boolean r1 = r9 instanceof defpackage.gbh
            if (r1 == 0) goto Le
            fzx r1 = defpackage.fzx.c
            goto L14
        Le:
            boolean r1 = r9 instanceof defpackage.gbi
            if (r1 == 0) goto L4d
            fzx r1 = defpackage.fzx.b
        L14:
            int r2 = r8.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L33
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"
            r2.println(r3)
            if (r0 == 0) goto L2f
            r0 = r9
            gbj r0 = (defpackage.gbj) r0
            int r0 = r0.a
            int r2 = r0 % 3
            if (r2 != 0) goto L2f
            int r0 = r0 / 3
            goto L31
        L2f:
            int r0 = r9.a
        L31:
            r8.d = r0
        L33:
            ghd r4 = new ghd
            java.lang.Object r0 = r9.a()
            r4.<init>(r1, r0)
            yil r0 = r8.c
            th r2 = new th
            r6 = 0
            r7 = 14
            r3 = r8
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = defpackage.ykr.l(r0, r2, r10)
            return r9
        L4d:
            yfu r9 = new yfu
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzr.a(gbk, yih):java.lang.Object");
    }

    public final void b(int i) {
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.d = i;
            return;
        }
        throw new IllegalStateException("Page size is already set to " + this.d + '.');
    }

    @Override // defpackage.gbo
    public final Object c() {
        return null;
    }
}
