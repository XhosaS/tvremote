package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibq extends yiz implements yjz {
    Object a;
    long b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ yol e;
    final /* synthetic */ kdj f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibq(kdj kdjVar, Object obj, yol yolVar, yih yihVar) {
        super(2, yihVar);
        this.f = kdjVar;
        this.d = obj;
        this.e = yolVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibq) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ibq ibqVar = new ibq(this.f, this.d, this.e, yihVar);
        ibqVar.g = obj;
        return ibqVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(3:(1:(1:(3:8|34|35)(2:9|41))(4:10|45|11|31))(7:15|47|16|17|28|(2:30|31)|42)|38|(1:42)(1:49))(1:20))(3:21|(1:23)|42)|24|43|25|(3:27|28|(0))|42) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (((defpackage.iom) r15.a).d(r0, r3, r14) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
