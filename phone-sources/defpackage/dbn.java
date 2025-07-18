package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbn extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ dbz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbn(dbz dbzVar, yih yihVar) {
        super(2, yihVar);
        this.c = dbzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbn) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dbn dbnVar = new dbn(this.c, yihVar);
        dbnVar.d = obj;
        return dbnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (defpackage.vyf.K(r2, r11, r10) != r0) goto L25;
     */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
