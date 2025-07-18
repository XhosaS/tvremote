package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwv extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwv(dfb dfbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = dfbVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((gwv) create((gzu) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((gwv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((gwv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 3) {
            return ((gwv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gwv) create((wnf) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.d;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new gwv((oze) this.c, yihVar, 4) : new gwv((jah) this.c, yihVar, 3) : new gwv((iom) this.c, yihVar, 2) : new gwv((dfb) this.c, yihVar, 1) : new gwv((gxa) this.c, yihVar, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r1.a(r12, null, r11) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
    
        if (r2.a(r3, r11) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014d, code lost:
    
        if (r2.a(r3, r11) != r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (r4.a(r12, r11) != r0) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[PHI: r1
  0x007d: PHI (r1v21 qjm) = (r1v24 qjm), (r1v25 qjm) binds: [B:25:0x007b, B:15:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193 A[PHI: r4 r12
  0x0193: PHI (r4v6 yjz) = (r4v12 yjz), (r4v13 yjz) binds: [B:85:0x0190, B:81:0x0160] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r12v14 java.lang.Object) = (r12v19 java.lang.Object), (r12v0 java.lang.Object) binds: [B:85:0x0190, B:81:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, yjz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x019b -> B:90:0x019e). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwv(gxa gxaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = gxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwv(iom iomVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = iomVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwv(jah jahVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = jahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwv(oze ozeVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = ozeVar;
    }
}
