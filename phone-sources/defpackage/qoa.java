package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qoa extends yiz implements yjv {
    int a;
    final /* synthetic */ qob b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoa(qob qobVar, long j, yih yihVar) {
        super(1, yihVar);
        this.b = qobVar;
        this.c = j;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new qoa(this.b, this.c, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new qoa(this.b, this.c, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
    
        if (defpackage.gez.l(((defpackage.qlt) r37).a, false, true, new defpackage.qaz(r37, r8, 4, null), r36) == r2) goto L77;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
