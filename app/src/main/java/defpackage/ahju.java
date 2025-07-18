package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahju extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ ahgr[] f;
    final /* synthetic */ agum g;
    final /* synthetic */ agvc h;
    final /* synthetic */ ahgs i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahju(ahgr[] ahgrVarArr, agum agumVar, agvc agvcVar, ahgs ahgsVar, agsw agswVar) {
        super(2, agswVar);
        this.f = ahgrVarArr;
        this.g = agumVar;
        this.h = agvcVar;
        this.i = ahgsVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahju) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r5 != 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x00a5, B:23:0x0096], limit reached: 35 */
    /* JADX WARN: Path cross not found for [B:26:0x00a7, B:13:0x0062], limit reached: 35 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[LOOP:0: B:18:0x0081->B:33:?, LOOP_START, PHI: r5 r14
  0x0081: PHI (r5v5 int) = (r5v4 int), (r5v6 int) binds: [B:17:0x007f, B:33:?] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r14v7 agrg) = (r14v6 agrg), (r14v14 agrg) binds: [B:17:0x007f, B:33:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ahfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ahfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c9 -> B:13:0x0062). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahju.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahju ahjuVar = new ahju(this.f, this.g, this.h, this.i, agswVar);
        ahjuVar.j = obj;
        return ahjuVar;
    }
}
