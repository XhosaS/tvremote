package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibg extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibg(bcb bcbVar, ny nyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = bcbVar;
        this.c = nyVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((ibg) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((ibg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 2) {
            return ((ibg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ibg) create((ink) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ita, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            ibg ibgVar = new ibg((iaq) this.c, (iom) this.d, yihVar, 0);
            ibgVar.e = obj;
            return ibgVar;
        }
        if (i == 1) {
            ibg ibgVar2 = new ibg((bcb) this.d, (ny) this.c, yihVar, 1);
            ibgVar2.e = obj;
            return ibgVar2;
        }
        if (i == 2) {
            ibg ibgVar3 = new ibg((ita) this.c, (kw) this.d, yihVar, 2);
            ibgVar3.e = obj;
            return ibgVar3;
        }
        ibg ibgVar4 = new ibg((yyh) this.c, (qen) this.d, yihVar, 3);
        ibgVar4.e = obj;
        return ibgVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (defpackage.ykr.l(r7, r8, r21) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027e, code lost:
    
        if (defpackage.vyf.K(r4, r2, r21) == r0) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:60:0x015f, B:64:0x0184], limit reached: 100 */
    /* JADX WARN: Path cross not found for [B:64:0x0184, B:60:0x015f], limit reached: 100 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a A[PHI: r4 r11
  0x017a: PHI (r4v8 ylc) = (r4v26 ylc), (r4v27 ylc) binds: [B:61:0x0178, B:57:0x0142] A[DONT_GENERATE, DONT_INLINE]
  0x017a: PHI (r11v1 yow) = (r11v2 yow), (r11v4 yow) binds: [B:61:0x0178, B:57:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, uhs] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r8v6, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [ita] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0182 -> B:60:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x019c -> B:60:0x015f). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibg(iaq iaqVar, iom iomVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = iaqVar;
        this.d = iomVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibg(ita itaVar, kw kwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = itaVar;
        this.d = kwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibg(yyh yyhVar, qen qenVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = yyhVar;
        this.d = qenVar;
    }
}
