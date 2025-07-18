package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnq extends agtu implements agvb {
    int a;
    final /* synthetic */ boa b;
    final /* synthetic */ int[] c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnq(boa boaVar, int[] iArr, String[] strArr, agsw agswVar) {
        super(2, agswVar);
        this.b = boaVar;
        this.c = iArr;
        this.d = strArr;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bnq) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r4.a(r6, r12) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[Catch: all -> 0x001a, PHI: r1
  0x0057: PHI (r1v5 ahgs) = (r1v3 ahgs), (r1v4 ahgs), (r1v9 ahgs) binds: [B:13:0x0036, B:17:0x0055, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x001a, blocks: (B:18:0x0057, B:21:0x0075, B:22:0x007a, B:7:0x0016), top: B:37:0x0008 }] */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r12.a
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L16
            java.lang.Object r1 = r12.e
            ahgs r1 = (defpackage.ahgs) r1
            defpackage.agpl.b(r13)
            goto L57
        L16:
            defpackage.agpl.b(r13)     // Catch: java.lang.Throwable -> L1a
            goto L75
        L1a:
            r13 = move-exception
            goto L7b
        L1c:
            java.lang.Object r1 = r12.e
            ahgs r1 = (defpackage.ahgs) r1
            defpackage.agpl.b(r13)
            goto L44
        L24:
            defpackage.agpl.b(r13)
            java.lang.Object r13 = r12.e
            r1 = r13
            ahgs r1 = (defpackage.ahgs) r1
            boa r13 = r12.b
            int[] r6 = r12.c
            blt r7 = r13.d
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L57
            bmn r13 = r13.b
            r12.e = r1
            r12.a = r5
            java.lang.Object r13 = defpackage.bpr.a(r13, r3, r12)
            if (r13 == r0) goto L74
        L44:
            boa r6 = r12.b
            agte r13 = (defpackage.agte) r13
            bnn r7 = new bnn
            r7.<init>(r6, r2)
            r12.e = r1
            r12.a = r4
            java.lang.Object r13 = defpackage.ahal.a(r13, r7, r12)
            if (r13 == r0) goto L74
        L57:
            agwh r13 = new agwh     // Catch: java.lang.Throwable -> L1a
            r13.<init>()     // Catch: java.lang.Throwable -> L1a
            boa r4 = r12.b     // Catch: java.lang.Throwable -> L1a
            blv r4 = r4.e     // Catch: java.lang.Throwable -> L1a
            bnp r6 = new bnp     // Catch: java.lang.Throwable -> L1a
            java.lang.String[] r7 = r12.d     // Catch: java.lang.Throwable -> L1a
            int[] r8 = r12.c     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r13, r1, r7, r8)     // Catch: java.lang.Throwable -> L1a
            r12.e = r2     // Catch: java.lang.Throwable -> L1a
            r13 = 3
            r12.a = r13     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r13 = r4.a(r6, r12)     // Catch: java.lang.Throwable -> L1a
            if (r13 != r0) goto L75
        L74:
            return r0
        L75:
            agpb r13 = new agpb     // Catch: java.lang.Throwable -> L1a
            r13.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r13     // Catch: java.lang.Throwable -> L1a
        L7b:
            boa r0 = r12.b
            int[] r1 = r12.c
            blt r0 = r0.d
            java.util.concurrent.locks.ReentrantLock r2 = r0.a
            r2.lock()
            int r4 = r1.length     // Catch: java.lang.Throwable -> La3
        L87:
            if (r3 >= r4) goto L9f
            r6 = r1[r3]     // Catch: java.lang.Throwable -> La3
            long[] r7 = r0.b     // Catch: java.lang.Throwable -> La3
            r8 = r7[r6]     // Catch: java.lang.Throwable -> La3
            r10 = -1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> La3
            r6 = 1
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L9c
            r0.d = r5     // Catch: java.lang.Throwable -> La3
        L9c:
            int r3 = r3 + 1
            goto L87
        L9f:
            r2.unlock()
            throw r13
        La3:
            r13 = move-exception
            r2.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bnq bnqVar = new bnq(this.b, this.c, this.d, agswVar);
        bnqVar.e = obj;
        return bnqVar;
    }
}
