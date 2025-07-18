package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thc extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ the c;
    final /* synthetic */ zmw d;
    final /* synthetic */ zpf e;
    final /* synthetic */ tho f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thc(the theVar, zmw zmwVar, zpf zpfVar, tho thoVar, agsw agswVar) {
        super(2, agswVar);
        this.c = theVar;
        this.d = zmwVar;
        this.e = zpfVar;
        this.f = thoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((thc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0160 A[PHI: r2 r7
  0x0160: PHI (r2v16 java.lang.Object) = (r2v15 java.lang.Object), (r2v31 java.lang.Object) binds: [B:42:0x015e, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0160: PHI (r7v26 thb) = (r7v25 thb), (r7v27 thb) binds: [B:42:0x015e, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193 A[PHI: r2
  0x0193: PHI (r2v21 java.lang.Object) = (r2v20 java.lang.Object), (r2v32 java.lang.Object) binds: [B:44:0x0191, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ac A[RETURN] */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new thc(this.c, this.d, this.e, this.f, agswVar);
    }
}
