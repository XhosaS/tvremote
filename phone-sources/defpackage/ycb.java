package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ycb extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ xpy d;
    final /* synthetic */ xpz e;
    final /* synthetic */ xsq f;
    final /* synthetic */ xsm g;
    final /* synthetic */ ysy h;
    final /* synthetic */ upo i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycb(xpy xpyVar, xpz xpzVar, xsq xsqVar, xsm xsmVar, ysy ysyVar, upo upoVar, yih yihVar) {
        super(2, yihVar);
        this.d = xpyVar;
        this.e = xpzVar;
        this.f = xsqVar;
        this.g = xsmVar;
        this.h = ysyVar;
        this.i = upoVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ycb ycbVar = new ycb(this.d, this.e, this.f, this.g, this.h, this.i, yihVar);
        ycbVar.j = obj;
        return ycbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r6.emit(r15, r14) != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[Catch: Exception -> 0x002f, PHI: r0 r4 r5 r15
  0x00a9: PHI (r0v11 java.lang.Object) = (r0v12 java.lang.Object), (r0v14 java.lang.Object) binds: [B:19:0x00a7, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r4v10 yqe) = (r4v18 yqe), (r4v19 yqe) binds: [B:19:0x00a7, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r5v8 xqb) = (r5v9 xqb), (r5v12 xqb) binds: [B:19:0x00a7, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r15v7 java.lang.Object) = (r15v19 java.lang.Object), (r15v0 java.lang.Object) binds: [B:19:0x00a7, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002f, blocks: (B:7:0x0014, B:24:0x00c8, B:18:0x0098, B:20:0x00a9, B:22:0x00b1, B:11:0x002a), top: B:38:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:7:0x0014, B:24:0x00c8, B:18:0x0098, B:20:0x00a9, B:22:0x00b1, B:11:0x002a), top: B:38:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c6 -> B:24:0x00c8). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
