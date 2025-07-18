package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agar extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ afem d;
    final /* synthetic */ afen e;
    final /* synthetic */ afil f;
    final /* synthetic */ afih g;
    final /* synthetic */ ahgs h;
    final /* synthetic */ agam i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agar(afem afemVar, afen afenVar, afil afilVar, afih afihVar, ahgs ahgsVar, agam agamVar, agsw agswVar) {
        super(2, agswVar);
        this.d = afemVar;
        this.e = afenVar;
        this.f = afilVar;
        this.g = afihVar;
        this.h = ahgsVar;
        this.i = agamVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agar) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (r7.a(r14, r13) != r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[Catch: Exception -> 0x002f, PHI: r1 r5 r6 r14
  0x00a5: PHI (r1v9 ahfp) = (r1v18 ahfp), (r1v19 ahfp) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r5v9 ahdl) = (r5v17 ahdl), (r5v18 ahdl) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r6v4 afeq) = (r6v5 afeq), (r6v8 afeq) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r14v7 java.lang.Object) = (r14v15 java.lang.Object), (r14v0 java.lang.Object) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002f, blocks: (B:7:0x0015, B:24:0x00c1, B:18:0x0097, B:20:0x00a5, B:22:0x00ad, B:11:0x002b), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:7:0x0015, B:24:0x00c1, B:18:0x0097, B:20:0x00a5, B:22:0x00ad, B:11:0x002b), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:24:0x00c1). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agar.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        agar agarVar = new agar(this.d, this.e, this.f, this.g, this.h, this.i, agswVar);
        agarVar.j = obj;
        return agarVar;
    }
}
