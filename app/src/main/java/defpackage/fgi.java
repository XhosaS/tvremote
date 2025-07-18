package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgi extends agtu implements agvb {
    final /* synthetic */ fgl a;
    final /* synthetic */ xqe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgi(fgl fglVar, xqe xqeVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fglVar;
        this.b = xqeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        fgc fgcVar = fgl.a;
        fey feyVar = this.a.r;
        if (feyVar != null) {
            feyVar.j(this.b, true);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgi(this.a, this.b, agswVar);
    }
}
