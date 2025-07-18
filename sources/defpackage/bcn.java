package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcn implements Comparable {
    public static final cih h = new cih((byte[]) null);
    public final bav a;
    public final String b;
    public final boolean e;
    public final bdl g;
    private final Set j;
    public final String c = "";
    public final boolean d = false;
    public final boolean f = false;
    private volatile cmt k = null;
    public final asv i = new asv((byte[]) null);

    public bcn(bav bavVar, String str, boolean z, Set set) {
        this.a = bavVar;
        this.b = str;
        this.e = z;
        this.j = set;
        this.g = new bdl(bavVar, str, "", z);
    }

    public final void a() {
        bdl bdlVar = this.g;
        cja cjaVarA = bdlVar.a(this.c);
        avs avsVar = new avs(bdlVar, 3);
        bav bavVar = this.a;
        chk.i(cjaVarA, avsVar, bavVar.b()).m(new ame(this, cjaVarA, 8), bavVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: CancellationException -> 0x0048, CancellationException | ExecutionException -> 0x004a, TryCatch #3 {CancellationException | ExecutionException -> 0x004a, blocks: (B:2:0x0000, B:4:0x0016, B:21:0x003e, B:14:0x0023, B:15:0x0024, B:17:0x002e, B:19:0x003a), top: B:31:0x0000 }] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(defpackage.cja r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.qm.P(r4)     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            bdm r4 = (defpackage.bdm) r4     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            bdk r0 = new bdk     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            r1 = 6
            r2 = 2
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            cmt r1 = new cmt     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            r1.<init>(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            cmt r4 = r3.k     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            if (r4 != 0) goto L24
            monitor-enter(r3)     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            cmt r4 = r3.k     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L1f
            r3.k = r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L3e
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r4     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
        L24:
            java.lang.Object r4 = r4.c     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            java.lang.Object r0 = r1.c     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            boolean r4 = defpackage.bjz.j(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            if (r4 != 0) goto L3e
            bav r4 = r3.a     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            byo r4 = r4.e     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            java.lang.Object r4 = r4.aL()     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            bda r4 = (defpackage.bda) r4     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            if (r4 == 0) goto L6d
            r4.a()     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            return
        L3e:
            asv r4 = r3.i     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            java.lang.Object r4 = r4.a     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            r4.incrementAndGet()     // Catch: java.util.concurrent.CancellationException -> L48 java.util.concurrent.ExecutionException -> L4a
            return
        L48:
            r4 = move-exception
            goto L4b
        L4a:
            r4 = move-exception
        L4b:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L6d
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
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcn.b(cja):void");
    }

    public final void c() {
        cja cjaVarD;
        bbd bbdVar;
        cmt cmtVarD = d();
        Object obj = cmtVarD.b;
        bav bavVar = this.a;
        bdh bdhVarC = bavVar.f.c(this.e);
        int i = 2;
        if (bdhVarC.j) {
            String str = (String) obj;
            if (bdq.q(str) && !bdhVarC.i) {
                cja cjaVar = ciw.a;
                return;
            }
            clo cloVarO = bbe.a.o();
            bdk bdkVar = (bdk) cmtVarD.d;
            if (bdkVar.a) {
                bbdVar = bbd.a;
            } else {
                clo cloVarO2 = bbd.a.o();
                int i2 = bdkVar.b;
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                clt cltVar = cloVarO2.b;
                bbd bbdVar2 = (bbd) cltVar;
                bbdVar2.c = i2 - 2;
                bbdVar2.b |= 1;
                int i3 = bdkVar.c;
                if (!cltVar.A()) {
                    cloVarO2.l();
                }
                bbd bbdVar3 = (bbd) cloVarO2.b;
                bbdVar3.d = i3 - 2;
                bbdVar3.b |= 2;
                bbdVar = (bbd) cloVarO2.i();
            }
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bbe bbeVar = (bbe) cloVarO.b;
            bbdVar.getClass();
            bbeVar.d = bbdVar;
            bbeVar.b |= 2;
            if (!bdq.q(str)) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bbe bbeVar2 = (bbe) cloVarO.b;
                obj.getClass();
                bbeVar2.b |= 1;
                bbeVar2.c = str;
            }
            if (bdhVarC.i) {
                String str2 = this.b;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bbe bbeVar3 = (bbe) cloVarO.b;
                str2.getClass();
                bbeVar3.b |= 4;
                bbeVar3.e = str2;
            }
            asv asvVarD = bavVar.d();
            bbe bbeVar4 = (bbe) cloVarO.i();
            bbeVar4.getClass();
            ahq ahqVar = new ahq();
            ahqVar.a = new ajk(bbeVar4, 3);
            ahqVar.b = new aes[]{aku.a};
            ahqVar.b();
            ahr ahrVarA = ahqVar.a();
            Object obj2 = asvVarD.a;
            cjaVarD = asv.e(((agb) obj2).c(ahrVarA).a(chz.a, new alf((alh) obj2, bbeVar4, 0)));
        } else {
            String str3 = (String) obj;
            if (bdq.q(str3)) {
                cja cjaVar2 = ciw.a;
                return;
            }
            cjaVarD = bavVar.d().d(str3);
        }
        cgp.i(cjaVarD, bbh.class, new avs(this, i), bavVar.b());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo((String) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0247 A[Catch: all -> 0x0406, TryCatch #4 {all -> 0x0406, blocks: (B:8:0x000f, B:10:0x001b, B:12:0x0027, B:13:0x0035, B:15:0x0052, B:21:0x0076, B:42:0x00b8, B:73:0x0243, B:75:0x0247, B:76:0x025b, B:77:0x026b, B:79:0x0290, B:81:0x02ab, B:82:0x02ba, B:44:0x00c6, B:46:0x00ce, B:48:0x00df, B:50:0x00ff, B:51:0x010c, B:52:0x0114, B:54:0x014a, B:56:0x01c7, B:66:0x0217, B:67:0x021a, B:62:0x01f1, B:72:0x0220, B:24:0x0083, B:26:0x0087, B:28:0x008f, B:31:0x0099, B:33:0x00a1, B:36:0x00a9, B:18:0x005f, B:19:0x006e, B:20:0x006f), top: B:129:0x000f, outer: #7, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025b A[Catch: all -> 0x0406, TRY_LEAVE, TryCatch #4 {all -> 0x0406, blocks: (B:8:0x000f, B:10:0x001b, B:12:0x0027, B:13:0x0035, B:15:0x0052, B:21:0x0076, B:42:0x00b8, B:73:0x0243, B:75:0x0247, B:76:0x025b, B:77:0x026b, B:79:0x0290, B:81:0x02ab, B:82:0x02ba, B:44:0x00c6, B:46:0x00ce, B:48:0x00df, B:50:0x00ff, B:51:0x010c, B:52:0x0114, B:54:0x014a, B:56:0x01c7, B:66:0x0217, B:67:0x021a, B:62:0x01f1, B:72:0x0220, B:24:0x0083, B:26:0x0087, B:28:0x008f, B:31:0x0099, B:33:0x00a1, B:36:0x00a9, B:18:0x005f, B:19:0x006e, B:20:0x006f), top: B:129:0x000f, outer: #7, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d6 A[Catch: all -> 0x040d, TryCatch #7 {, blocks: (B:5:0x0007, B:7:0x000b, B:83:0x02c8, B:85:0x02d6, B:91:0x031e, B:92:0x0320, B:94:0x0328, B:96:0x0332, B:115:0x0403, B:97:0x034c, B:99:0x036a, B:101:0x0374, B:102:0x0380, B:103:0x03a8, B:105:0x03ae, B:107:0x03c3, B:108:0x03d6, B:110:0x03e0, B:111:0x03ee, B:113:0x03f4, B:88:0x02e3, B:90:0x02fa, B:117:0x0407, B:118:0x040a, B:119:0x040b, B:8:0x000f, B:10:0x001b, B:12:0x0027, B:13:0x0035, B:15:0x0052, B:21:0x0076, B:42:0x00b8, B:73:0x0243, B:75:0x0247, B:76:0x025b, B:77:0x026b, B:79:0x0290, B:81:0x02ab, B:82:0x02ba, B:44:0x00c6, B:46:0x00ce, B:48:0x00df, B:50:0x00ff, B:51:0x010c, B:52:0x0114, B:54:0x014a, B:56:0x01c7, B:66:0x0217, B:67:0x021a, B:62:0x01f1, B:72:0x0220, B:24:0x0083, B:26:0x0087, B:28:0x008f, B:31:0x0099, B:33:0x00a1, B:36:0x00a9, B:18:0x005f, B:19:0x006e, B:20:0x006f), top: B:131:0x0007, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r13v2, types: [byo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [byo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cmt d() {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcn.d():cmt");
    }
}
