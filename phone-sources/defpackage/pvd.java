package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvd implements qdr {
    public static final /* synthetic */ int b = 0;
    private static final tvn c = tvn.n("GnpSdk");
    public final yyk a;
    private final qai d;
    private final qbr e;
    private final pvg f;
    private final Set g;
    private final yow h;
    private final ntp i;
    private final aafi j;

    public pvd(qai qaiVar, ntp ntpVar, qbr qbrVar, pvg pvgVar, Set set, aafi aafiVar, yow yowVar) {
        qaiVar.getClass();
        ntpVar.getClass();
        qbrVar.getClass();
        pvgVar.getClass();
        this.d = qaiVar;
        this.i = ntpVar;
        this.e = qbrVar;
        this.f = pvgVar;
        this.g = set;
        this.j = aafiVar;
        this.h = yowVar;
        this.a = new yyk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        if (r12.b(r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        r2.d.c(r11);
        ((defpackage.qas) r2.i.a).d(r11);
        r0.f = r2;
        r0.g = r11;
        r0.h = r10;
        r0.a = null;
        r0.e = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0122, code lost:
    
        if (r2.a(r11, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:31:0x0083, B:48:0x00e9, B:50:0x00ef, B:53:0x0106), top: B:65:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[EDGE_INSN: B:69:0x0106->B:53:0x0106 BREAK  A[LOOP:0: B:48:0x00e9->B:72:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v16, types: [yyk] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(defpackage.pvd r9, defpackage.qen r10, boolean r11, defpackage.yih r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvd.d(pvd, qen, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qen r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pvb
            if (r0 == 0) goto L13
            r0 = r6
            pvb r0 = (defpackage.pvb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pvb r0 = new pvb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            if (r5 == 0) goto L56
            aafi r6 = r4.j
            r0.c = r3
            java.lang.Object r6 = r6.B(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            qdl r6 = (defpackage.qdl) r6
            boolean r5 = r6 instanceof defpackage.qdi
            if (r5 == 0) goto L56
            qdi r6 = (defpackage.qdi) r6
            java.lang.Throwable r5 = r6.a()
            tvn r6 = defpackage.pvd.c
            tuv r6 = r6.g()
            java.lang.String r0 = "Failed to clear notifications count cache"
            defpackage.a.co(r6, r0, r5)
        L56:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvd.a(qen, yih):java.lang.Object");
    }

    public final void b(qen qenVar, boolean z) {
        if (!z) {
            pvh pvhVarB = this.f.b(vie.NOTIFICATION_DATA_CLEANED);
            pvhVarB.e(qenVar);
            pvhVarB.a();
        } else {
            if (qenVar == null) {
                this.f.b(vie.ACCOUNT_DATA_CLEANED).a();
                return;
            }
            c.l().v("Account deleted: %s", qenVar.b);
            String str = qenVar.c;
            if (str == null || str.length() == 0) {
                return;
            }
            pvh pvhVarB2 = this.f.b(vie.ACCOUNT_DATA_CLEANED);
            ((pvo) pvhVarB2).r = str;
            pvhVarB2.a();
        }
    }

    @Override // defpackage.qdr
    public final Object c(qen qenVar) {
        ykr.q(this.h, null, 0, new qjf(this, qenVar, (yih) null, 1), 3);
        return ygi.a;
    }
}
