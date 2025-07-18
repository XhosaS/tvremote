package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgg extends agtu implements agvb {
    final /* synthetic */ fgl a;
    final /* synthetic */ xpy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgg(fgl fglVar, xpy xpyVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fglVar;
        this.b = xpyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        fey feyVar = this.a.r;
        if (feyVar != null) {
            feyVar.l(this.b);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgg(this.a, this.b, agswVar);
    }
}
