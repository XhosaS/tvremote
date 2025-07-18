package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsx extends yiz implements yjv {
    Object a;
    int b;
    final /* synthetic */ SessionWorker c;
    final /* synthetic */ dti d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsx(SessionWorker sessionWorker, dti dtiVar, yih yihVar) {
        super(1, yihVar);
        this.c = sessionWorker;
        this.d = dtiVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new dsx(this.c, this.d, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new dsx(this.c, this.d, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (defpackage.ykr.l(r3, r4, r8) != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dsn] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [dsn] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            yio r0 = defpackage.yio.a
            int r1 = r8.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 4
            r6 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L16
            defpackage.ybn.f(r9)
            goto L95
        L16:
            java.lang.Object r0 = r8.a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.ybn.f(r9)
            goto Lb0
        L1f:
            java.lang.Object r1 = r8.a
            dsn r1 = (defpackage.dsn) r1
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L27
            goto L81
        L27:
            r9 = move-exception
            goto L9b
        L29:
            defpackage.ybn.f(r9)
            goto L41
        L2d:
            defpackage.ybn.f(r9)
            androidx.glance.session.SessionWorker r9 = r8.c
            ale r1 = new ale
            r1.<init>(r9, r6, r5)
            r8.b = r4
            dso r9 = r9.b
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 == r0) goto Lb1
        L41:
            r1 = r9
            dsn r1 = (defpackage.dsn) r1
            if (r1 != 0) goto L6f
            androidx.glance.session.SessionWorker r9 = r8.c
            androidx.work.WorkerParameters r0 = r9.a
            int r0 = r0.d
            if (r0 == 0) goto L61
            java.lang.String r9 = r9.d
            java.lang.String r0 = "GlanceSessionWorker"
            java.lang.String r1 = "SessionWorker attempted restart but Session is not available for "
            java.lang.String r9 = r1.concat(r9)
            android.util.Log.w(r0, r9)
            gpl r9 = new gpl
            r9.<init>()
            return r9
        L61:
            java.lang.String r9 = r9.d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No session available for key "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L6f:
            dti r9 = r8.d     // Catch: java.lang.Throwable -> L27
            androidx.glance.session.SessionWorker r4 = r8.c     // Catch: java.lang.Throwable -> L27
            android.content.Context r7 = r4.e     // Catch: java.lang.Throwable -> L27
            dtg r4 = r4.c     // Catch: java.lang.Throwable -> L27
            r8.a = r1     // Catch: java.lang.Throwable -> L27
            r8.b = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = defpackage.czt.f(r9, r7, r1, r4, r8)     // Catch: java.lang.Throwable -> L27
            if (r9 == r0) goto Lb1
        L81:
            androidx.glance.session.SessionWorker r9 = r8.c
            yqr r3 = defpackage.yqr.a
            dbv r4 = new dbv
            r4.<init>(r9, r1, r6, r5)
            r8.a = r6
            r8.b = r2
            java.lang.Object r9 = defpackage.ykr.l(r3, r4, r8)
            if (r9 != r0) goto L95
            goto Lb1
        L95:
            gpl r9 = new gpl
            r9.<init>()
            return r9
        L9b:
            androidx.glance.session.SessionWorker r2 = r8.c
            yqr r3 = defpackage.yqr.a
            dbv r4 = new dbv
            r4.<init>(r2, r1, r6, r5)
            r8.a = r9
            r8.b = r5
            java.lang.Object r1 = defpackage.ykr.l(r3, r4, r8)
            if (r1 != r0) goto Laf
            goto Lb1
        Laf:
            r0 = r9
        Lb0:
            throw r0
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
