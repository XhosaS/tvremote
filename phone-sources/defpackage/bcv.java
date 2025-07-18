package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcv extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ bcy c;
    final /* synthetic */ yka d;
    final /* synthetic */ bby e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcv(bcy bcyVar, yka ykaVar, bby bbyVar, yih yihVar) {
        super(2, yihVar);
        this.c = bcyVar;
        this.d = ykaVar;
        this.e = bbyVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        bcv bcvVar = new bcv(this.c, this.d, this.e, yihVar);
        bcvVar.f = obj;
        return bcvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [biq] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
