package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oi extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ op d;
    final /* synthetic */ Object e;
    final /* synthetic */ pf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(op opVar, Object obj, pf pfVar, yih yihVar) {
        super(2, yihVar);
        this.d = opVar;
        this.e = obj;
        this.f = pfVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oi) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new oi(this.d, this.e, this.f, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0137, code lost:
    
        if (r15.j(r14) == r0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
