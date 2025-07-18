package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvt implements gvo {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/platform/account/auth/TokenFetcherImpl");
    public final jwr a;
    private final fby c;
    private final agte d;
    private final agow e;
    private final exl f;
    private final gtu g;

    public gvt(fby fbyVar, agte agteVar, agow agowVar, exl exlVar, jwr jwrVar, gtu gtuVar) {
        fbyVar.getClass();
        agteVar.getClass();
        agowVar.getClass();
        gtuVar.getClass();
        this.c = fbyVar;
        this.d = agteVar;
        this.e = agowVar;
        this.f = exlVar;
        this.a = jwrVar;
        this.g = gtuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00b8: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:185), block:B:38:0x00b8 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[Catch: Exception -> 0x01c9, PHI: r0 r2 r5 r9
  0x0113: PHI (r0v30 java.lang.Object) = (r0v29 java.lang.Object), (r0v1 java.lang.Object) binds: [B:47:0x0111, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r2v8 android.accounts.Account) = (r2v4 android.accounts.Account), (r2v11 android.accounts.Account) binds: [B:47:0x0111, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r5v22 agwh) = (r5v19 agwh), (r5v28 agwh) binds: [B:47:0x0111, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r9v13 agwh) = (r9v10 agwh), (r9v15 agwh) binds: [B:47:0x0111, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01c9, blocks: (B:61:0x0196, B:63:0x01a9, B:65:0x01b8, B:58:0x017e, B:55:0x0162, B:53:0x014e, B:50:0x012f, B:48:0x0113, B:46:0x00ff, B:40:0x00be, B:42:0x00db, B:43:0x00e3), top: B:103:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f A[Catch: Exception -> 0x01c9, PHI: r0 r2 r9
  0x012f: PHI (r0v34 java.lang.Object) = (r0v33 java.lang.Object), (r0v1 java.lang.Object) binds: [B:49:0x012d, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x012f: PHI (r2v12 android.accounts.Account) = (r2v8 android.accounts.Account), (r2v15 android.accounts.Account) binds: [B:49:0x012d, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x012f: PHI (r9v16 agwh) = (r9v13 agwh), (r9v17 agwh) binds: [B:49:0x012d, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01c9, blocks: (B:61:0x0196, B:63:0x01a9, B:65:0x01b8, B:58:0x017e, B:55:0x0162, B:53:0x014e, B:50:0x012f, B:48:0x0113, B:46:0x00ff, B:40:0x00be, B:42:0x00db, B:43:0x00e3), top: B:103:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162 A[Catch: Exception -> 0x01c9, PHI: r2 r5 r9
  0x0162: PHI (r2v20 android.accounts.Account) = (r2v16 android.accounts.Account), (r2v23 android.accounts.Account) binds: [B:54:0x0160, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r5v37 java.lang.String) = (r5v34 java.lang.String), (r5v39 java.lang.String) binds: [B:54:0x0160, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r9v21 agwh) = (r9v18 agwh), (r9v23 agwh) binds: [B:54:0x0160, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01c9, blocks: (B:61:0x0196, B:63:0x01a9, B:65:0x01b8, B:58:0x017e, B:55:0x0162, B:53:0x014e, B:50:0x012f, B:48:0x0113, B:46:0x00ff, B:40:0x00be, B:42:0x00db, B:43:0x00e3), top: B:103:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9 A[Catch: Exception -> 0x01c9, TryCatch #1 {Exception -> 0x01c9, blocks: (B:61:0x0196, B:63:0x01a9, B:65:0x01b8, B:58:0x017e, B:55:0x0162, B:53:0x014e, B:50:0x012f, B:48:0x0113, B:46:0x00ff, B:40:0x00be, B:42:0x00db, B:43:0x00e3), top: B:103:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8 A[Catch: Exception -> 0x01c9, TRY_LEAVE, TryCatch #1 {Exception -> 0x01c9, blocks: (B:61:0x0196, B:63:0x01a9, B:65:0x01b8, B:58:0x017e, B:55:0x0162, B:53:0x014e, B:50:0x012f, B:48:0x0113, B:46:0x00ff, B:40:0x00be, B:42:0x00db, B:43:0x00e3), top: B:103:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027c  */
    @Override // defpackage.gvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r19, defpackage.agsw r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvt.a(android.accounts.Account, agsw):java.lang.Object");
    }
}
