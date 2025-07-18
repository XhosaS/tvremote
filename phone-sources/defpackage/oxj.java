package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxj implements oxc {
    private static final tvn a = tvn.n("GnpSdk");
    private final String b;
    private final oyi c;
    private final oxp d;
    private final xbw e;
    private final pdw f;
    private final nwq g;

    public oxj(String str, osk oskVar, oyi oyiVar, oxp oxpVar, xbw xbwVar, pdw pdwVar, nwq nwqVar) {
        str.getClass();
        oskVar.getClass();
        oyiVar.getClass();
        oxpVar.getClass();
        xbwVar.getClass();
        pdwVar.getClass();
        this.b = str;
        this.c = oyiVar;
        this.d = oxpVar;
        this.e = xbwVar;
        this.f = pdwVar;
        this.g = nwqVar;
    }

    private final void e(long j, boolean z) {
        ((snc) ((qoj) this.e.b()).x.get()).b(SystemClock.elapsedRealtime() - j, this.b, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00da -> B:17:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0128 -> B:37:0x012a). Please report as a decompilation issue!!! */
    @Override // defpackage.oxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r17, defpackage.yih r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxj.a(java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r9, j$.time.Instant r11, defpackage.yih r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.oxf
            if (r0 == 0) goto L13
            r0 = r12
            oxf r0 = (defpackage.oxf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oxf r0 = new oxf
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            long r9 = r0.a
            defpackage.ybn.f(r12)     // Catch: java.lang.Exception -> L2a
            goto L72
        L2a:
            r11 = move-exception
            goto L90
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.ybn.f(r12)
            long r5 = android.os.SystemClock.elapsedRealtime()
            tvn r12 = defpackage.oxj.a     // Catch: java.lang.Exception -> L8d
            tuv r12 = r12.l()     // Catch: java.lang.Exception -> L8d
            java.lang.String r2 = "Getting cross-app impression count."
            r12.s(r2)     // Catch: java.lang.Exception -> L8d
            nwq r12 = r8.g     // Catch: java.lang.Exception -> L8d
            r11.getClass()     // Catch: java.lang.Exception -> L8d
            oaf r2 = new oaf     // Catch: java.lang.Exception -> L8d
            r2.<init>()     // Catch: java.lang.Exception -> L8d
            r2.b()     // Catch: java.lang.Exception -> L8d
            oix r7 = new oix     // Catch: java.lang.Exception -> L8d
            r7.<init>(r9, r11, r3)     // Catch: java.lang.Exception -> L8d
            r2.a = r7     // Catch: java.lang.Exception -> L8d
            r9 = 34602(0x872a, float:4.8488E-41)
            r2.c = r9     // Catch: java.lang.Exception -> L8d
            oag r9 = r2.a()     // Catch: java.lang.Exception -> L8d
            onz r9 = r12.r(r9)     // Catch: java.lang.Exception -> L8d
            r0.a = r5     // Catch: java.lang.Exception -> L8d
            r0.d = r4     // Catch: java.lang.Exception -> L8d
            java.lang.Object r12 = defpackage.wae.G(r9, r0)     // Catch: java.lang.Exception -> L8d
            if (r12 == r1) goto L8c
            r9 = r5
        L72:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Exception -> L2a
            int r11 = r12.intValue()     // Catch: java.lang.Exception -> L2a
            r8.e(r9, r3)     // Catch: java.lang.Exception -> L2a
            tvn r12 = defpackage.oxj.a     // Catch: java.lang.Exception -> L2a
            tuv r12 = r12.l()     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = "Got cross-app impression count: %d"
            r12.t(r0, r11)     // Catch: java.lang.Exception -> L2a
            java.lang.Integer r12 = new java.lang.Integer     // Catch: java.lang.Exception -> L2a
            r12.<init>(r11)     // Catch: java.lang.Exception -> L2a
            return r12
        L8c:
            return r1
        L8d:
            r9 = move-exception
            r11 = r9
            r9 = r5
        L90:
            r8.e(r9, r4)
            tvn r9 = defpackage.oxj.a
            tuv r9 = r9.g()
            java.lang.String r10 = "Failed to get cross-app capping for promotions, API might not be available."
            defpackage.a.co(r9, r10, r11)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxj.b(long, j$.time.Instant, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.oyd r9, defpackage.yih r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxj.c(oyd, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.oxi
            if (r0 == 0) goto L13
            r0 = r5
            oxi r0 = (defpackage.oxi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oxi r0 = new oxi
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            pdw r5 = r4.f
            uhp r5 = r5.c()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.wae.U(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r0 = r5.entrySet()
            oun r1 = new oun
            r2 = 3
            r1.<init>(r2)
            defpackage.yfm.K(r0, r1)
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxj.d(yih):java.lang.Object");
    }
}
