package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aue {
    public final auc a;
    public final crv b;
    public final azf c;
    public final crv d;
    public final cov e;
    private final aqp f;
    private final Executor g;

    /* JADX WARN: Type inference failed for: r9v5, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [crv, java.lang.Object] */
    public aue(auc aucVar, crv crvVar, aqp aqpVar, bfv bfvVar, crv crvVar2, Executor executor, cov covVar, crv crvVar3) {
        this.a = aucVar;
        this.f = aqpVar;
        this.b = crvVar;
        this.g = executor;
        this.d = new axy(crvVar2, 1);
        Context context = (Context) ((cpj) bfvVar.d).a;
        Executor executor2 = (Executor) bfvVar.b.a();
        executor2.getClass();
        azi aziVar = (azi) bfvVar.c.a();
        aziVar.getClass();
        ((Boolean) bfvVar.a.a()).booleanValue();
        this.c = new azf(context, executor2, aziVar, covVar, (byg) ((cpj) bfvVar.e).a, crvVar3, ((azc) bfvVar.f).a());
        this.e = covVar;
    }

    public final cja a(final aub aubVar) {
        return this.f.a ? qm.J() : qm.O(new chs() { // from class: aud
            /* JADX WARN: Removed duplicated region for block: B:305:0x0801 A[Catch: RuntimeException -> 0x0918, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0918, blocks: (B:297:0x07d7, B:299:0x07db, B:301:0x07df, B:302:0x07e1, B:304:0x07e7, B:305:0x0801, B:314:0x0824, B:320:0x083f, B:322:0x0847, B:324:0x084f, B:325:0x0856, B:327:0x0864, B:329:0x086a), top: B:387:0x07d7 }] */
            /* JADX WARN: Removed duplicated region for block: B:346:0x08e3  */
            /* JADX WARN: Removed duplicated region for block: B:368:0x093e  */
            /* JADX WARN: Removed duplicated region for block: B:369:0x0940  */
            /* JADX WARN: Type inference failed for: r0v3, types: [byo, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v72, types: [byo, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v110, types: [crv, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v27, types: [byo, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v5, types: [crv, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v9, types: [crv, java.lang.Object] */
            @Override // defpackage.chs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.cja a() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instructions count: 2445
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.a():cja");
            }
        }, this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r6) <= 1000) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r9) {
        /*
            r8 = this;
            aqp r0 = r8.f
            boolean r0 = r0.a
            r1 = -1
            if (r0 == 0) goto La
        L8:
            r3 = r1
            goto L47
        La:
            azf r0 = r8.c
            aza r3 = r0.c
            crv r4 = r3.b
            java.lang.Object r4 = r4.a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L1d
            goto L8
        L1d:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L23
            goto L3d
        L23:
            java.lang.Object r5 = r3.a
            monitor-enter(r5)
            int r6 = r3.c     // Catch: java.lang.Throwable -> L4f
            if (r6 >= r4) goto L2c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            goto L3d
        L2c:
            long r6 = r3.d     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            sd r3 = r3.e
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            r5 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L3d
            goto L8
        L3d:
            boolean r3 = r0.b
            azj r0 = r0.a
            if (r3 == 0) goto L8
            long r3 = r0.a(r9)
        L47:
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 == 0) goto L4d
            r9 = 1
            return r9
        L4d:
            r9 = 0
            return r9
        L4f:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aue.b(java.lang.String):boolean");
    }
}
