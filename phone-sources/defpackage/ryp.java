package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryp implements Comparable {
    public static final unx h = new unx((byte[]) null);
    public final rwv a;
    public final String b;
    public final boolean e;
    public final rzh g;
    private final Set j;
    public final String c = "";
    public final boolean d = false;
    public final boolean f = false;
    private volatile yyh k = null;
    public final ulp i = new ulp((byte[]) null, (char[]) null);

    public ryp(rwv rwvVar, String str, boolean z, Set set) {
        this.a = rwvVar;
        this.b = str;
        this.e = z;
        this.j = set;
        this.g = new rzh(rwvVar, str, "", z);
    }

    public final void a() {
        rzh rzhVar = this.g;
        uhp uhpVarA = rzhVar.a(this.c);
        pbb pbbVar = new pbb(rzhVar, 16);
        rwv rwvVar = this.a;
        ufn.j(uhpVarA, pbbVar, rwvVar.b()).c(new rmz(this, uhpVarA, 8), rwvVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: CancellationException -> 0x004a, CancellationException | ExecutionException -> 0x004c, TryCatch #3 {CancellationException | ExecutionException -> 0x004c, blocks: (B:2:0x0000, B:4:0x0016, B:21:0x0040, B:14:0x0023, B:15:0x0024, B:17:0x0030, B:19:0x003c), top: B:31:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(defpackage.uhp r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.sfy.J(r4)     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            rzi r4 = (defpackage.rzi) r4     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            rzg r0 = new rzg     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            r1 = 6
            r2 = 2
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            yyh r1 = new yyh     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            r1.<init>(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            yyh r4 = r3.k     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            if (r4 != 0) goto L24
            monitor-enter(r3)     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            yyh r4 = r3.k     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L1f
            r3.k = r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L40
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r4     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
        L24:
            java.lang.Object r4 = r4.e     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            java.lang.Object r0 = r1.e     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            com.google.common.collect.ImmutableMap r4 = (com.google.common.collect.ImmutableMap) r4     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            boolean r4 = r4.equals(r0)     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            if (r4 != 0) goto L40
            rwv r4 = r3.a     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            ttm r4 = r4.d     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            rza r4 = (defpackage.rza) r4     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            if (r4 == 0) goto L6f
            r4.a()     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            return
        L40:
            ulp r4 = r3.i     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            java.lang.Object r4 = r4.a     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            r4.incrementAndGet()     // Catch: java.util.concurrent.CancellationException -> L4a java.util.concurrent.ExecutionException -> L4c
            return
        L4a:
            r4 = move-exception
            goto L4d
        L4c:
            r4 = move-exception
        L4d:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L6f
            java.lang.String r0 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to update local snapshot for "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", may result in stale flags."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FlagStore"
            android.util.Log.w(r1, r0, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryp.b(uhp):void");
    }

    public final void c() {
        uhp uhpVarAD;
        rxd rxdVar;
        yyh yyhVarD = d();
        Object obj = yyhVarD.b;
        rwv rwvVar = this.a;
        rzd rzdVarC = rwvVar.e.c(this.e);
        if (rzdVarC.j) {
            String str = (String) obj;
            if (sij.F(str) && !rzdVarC.i) {
                uhp uhpVar = uhl.a;
                return;
            }
            vtw vtwVarM = rxe.a.m();
            rzg rzgVar = (rzg) yyhVarD.d;
            int i = 2;
            int i2 = 1;
            if (rzgVar.a) {
                rxdVar = rxd.a;
            } else {
                vtw vtwVarM2 = rxd.a.m();
                int i3 = rzgVar.b;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar = vtwVarM2.b;
                rxd rxdVar2 = (rxd) vucVar;
                rxdVar2.c = a.aE(i3);
                rxdVar2.b |= 1;
                int i4 = rzgVar.c;
                if (!vucVar.A()) {
                    vtwVarM2.u();
                }
                rxd rxdVar3 = (rxd) vtwVarM2.b;
                rxdVar3.d = i4 - 2;
                rxdVar3.b |= 2;
                rxdVar = (rxd) vtwVarM2.r();
            }
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            rxe rxeVar = (rxe) vtwVarM.b;
            rxdVar.getClass();
            rxeVar.d = rxdVar;
            rxeVar.b |= 2;
            if (!sij.F(str)) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                rxe rxeVar2 = (rxe) vtwVarM.b;
                obj.getClass();
                rxeVar2.b |= 1;
                rxeVar2.c = str;
            }
            if (rzdVarC.i) {
                String str2 = this.b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                rxe rxeVar3 = (rxe) vtwVarM.b;
                str2.getClass();
                rxeVar3.b |= 4;
                rxeVar3.e = str2;
            }
            ulp ulpVarF = rwvVar.f();
            rxe rxeVar4 = (rxe) vtwVarM.r();
            rxeVar4.getClass();
            oaf oafVar = new oaf();
            oafVar.a = new ook(rxeVar4, i2);
            oafVar.b = new nvg[]{olz.a};
            oafVar.b();
            oag oagVarA = oafVar.a();
            Object obj2 = ulpVarF.a;
            uhpVarAD = ulp.aE(((nwq) obj2).r(oagVarA).b(ugk.a, new nuy(obj2, rxeVar4, i, null)));
        } else {
            String str3 = (String) obj;
            if (sij.F(str3)) {
                uhp uhpVar2 = uhl.a;
                return;
            }
            uhpVarAD = rwvVar.f().aD(str3);
        }
        ues.j(uhpVarAD, rxh.class, new pbb(this, 15), rwvVar.b());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo((String) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023b A[Catch: all -> 0x0400, TryCatch #1 {all -> 0x0400, blocks: (B:8:0x000f, B:10:0x001b, B:12:0x0025, B:13:0x0034, B:15:0x003a, B:17:0x004a, B:19:0x0060, B:25:0x007e, B:46:0x00c1, B:76:0x0237, B:78:0x023b, B:79:0x0248, B:80:0x024c, B:82:0x026d, B:84:0x0286, B:85:0x0295, B:48:0x00cf, B:50:0x00d7, B:52:0x00e5, B:54:0x0103, B:55:0x0110, B:56:0x0118, B:58:0x014a, B:60:0x01c5, B:68:0x020c, B:69:0x020f, B:74:0x0215, B:28:0x008c, B:30:0x0090, B:32:0x0098, B:35:0x00a2, B:37:0x00aa, B:40:0x00b2, B:22:0x006a, B:23:0x0079, B:24:0x007a), top: B:136:0x000f, outer: #2, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248 A[Catch: all -> 0x0400, TRY_LEAVE, TryCatch #1 {all -> 0x0400, blocks: (B:8:0x000f, B:10:0x001b, B:12:0x0025, B:13:0x0034, B:15:0x003a, B:17:0x004a, B:19:0x0060, B:25:0x007e, B:46:0x00c1, B:76:0x0237, B:78:0x023b, B:79:0x0248, B:80:0x024c, B:82:0x026d, B:84:0x0286, B:85:0x0295, B:48:0x00cf, B:50:0x00d7, B:52:0x00e5, B:54:0x0103, B:55:0x0110, B:56:0x0118, B:58:0x014a, B:60:0x01c5, B:68:0x020c, B:69:0x020f, B:74:0x0215, B:28:0x008c, B:30:0x0090, B:32:0x0098, B:35:0x00a2, B:37:0x00aa, B:40:0x00b2, B:22:0x006a, B:23:0x0079, B:24:0x007a), top: B:136:0x000f, outer: #2, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yyh d() {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryp.d():yyh");
    }
}
