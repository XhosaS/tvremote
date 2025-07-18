package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhp implements ahgr {
    final /* synthetic */ ahgr a;
    final /* synthetic */ agvd b;

    public ahhp(ahgr ahgrVar, agvd agvdVar) {
        this.a = ahgrVar;
        this.b = agvdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r5 r9 r10
  0x003f: PHI (r5v1 long) = (r5v2 long), (r5v6 long) binds: [B:19:0x0055, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r9v1 ahgs) = (r9v17 ahgs), (r9v18 ahgs) binds: [B:19:0x0055, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r10v2 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:19:0x0055, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [agvd] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:25:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:31:0x0083). Please report as a decompilation issue!!! */
    @Override // defpackage.ahgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fD(defpackage.ahgs r9, defpackage.agsw r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ahho
            if (r0 == 0) goto L13
            r0 = r10
            ahho r0 = (defpackage.ahho) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ahho r0 = new ahho
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            long r5 = r0.f
            java.lang.Object r9 = r0.e
            java.lang.Object r2 = r0.d
            defpackage.agpl.b(r10)
            goto L72
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            long r5 = r0.f
            java.lang.Object r9 = r0.d
            defpackage.agpl.b(r10)
        L3f:
            r2 = r9
            goto L58
        L41:
            defpackage.agpl.b(r10)
            r5 = 0
        L46:
            r0.d = r9
            r10 = 0
            r0.e = r10
            r0.f = r5
            r0.b = r4
            ahgr r10 = r8.a
            java.lang.Object r10 = defpackage.ahhq.a(r10, r9, r0)
            if (r10 == r1) goto L8a
            goto L3f
        L58:
            r9 = r10
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            if (r9 == 0) goto L82
            agvd r10 = r8.b
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r0.d = r2
            r0.e = r9
            r0.f = r5
            r0.b = r3
            java.lang.Object r10 = r10.a(r2, r9, r7, r0)
            if (r10 == r1) goto L8a
        L72:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7f
            r9 = 1
            long r5 = r5 + r9
            r9 = r4
            goto L83
        L7f:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L82:
            r9 = 0
        L83:
            if (r9 == 0) goto L87
            r9 = r2
            goto L46
        L87:
            agpu r9 = defpackage.agpu.a
            return r9
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhp.fD(ahgs, agsw):java.lang.Object");
    }
}
