package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggp extends yiz implements yjz {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ gex f;
    final /* synthetic */ yjv g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggp(boolean z, boolean z2, gex gexVar, yih yihVar, yjv yjvVar, int i) {
        super(2, yihVar);
        this.h = i;
        this.d = z;
        this.e = z2;
        this.f = gexVar;
        this.g = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            return ((ggp) create((ggd) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ggp) create((ggd) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.h != 0) {
            ggp ggpVar = new ggp(this.d, this.e, this.f, yihVar, this.g, 1, null);
            ggpVar.c = obj;
            return ggpVar;
        }
        ggp ggpVar2 = new ggp(this.d, this.e, this.f, yihVar, this.g, 0);
        ggpVar2.c = obj;
        return ggpVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r10.a(r9) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0136, code lost:
    
        if (r10.a(r9) == r0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[PHI: r2 r10
  0x0096: PHI (r2v12 ggd) = (r2v11 ggd), (r2v16 ggd) binds: [B:32:0x0093, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r10v36 java.lang.Object) = (r10v35 java.lang.Object), (r10v0 java.lang.Object) binds: [B:32:0x0093, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153 A[PHI: r2 r10
  0x0153: PHI (r2v4 ggd) = (r2v3 ggd), (r2v8 ggd) binds: [B:75:0x0150, B:53:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x0153: PHI (r10v15 java.lang.Object) = (r10v14 java.lang.Object), (r10v0 java.lang.Object) binds: [B:75:0x0150, B:53:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0176 A[RETURN] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggp(boolean z, boolean z2, gex gexVar, yih yihVar, yjv yjvVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.h = i;
        this.d = z;
        this.e = z2;
        this.f = gexVar;
        this.g = yjvVar;
    }
}
