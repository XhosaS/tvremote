package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fge extends agtu implements agvb {
    int a;
    final /* synthetic */ fgl b;
    final /* synthetic */ xmy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fge(fgl fglVar, xmy xmyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fglVar;
        this.c = xmyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fge) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fge.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fge(this.b, this.c, agswVar);
    }
}
