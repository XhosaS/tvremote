package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhd extends agtu implements agvb {
    final /* synthetic */ xbg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhd(xbg xbgVar, agsw agswVar) {
        super(2, agswVar);
        this.a = xbgVar;
    }

    @Override // defpackage.agvb
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        agsw agswVarC = c((xbg) obj, (agsw) obj2);
        agpl.b(agpu.a);
        return ((fhd) agswVarC).a;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return this.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fhd(this.a, agswVar);
    }
}
