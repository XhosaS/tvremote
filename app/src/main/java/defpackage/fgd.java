package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgd extends agtu implements agvb {
    final /* synthetic */ fgl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgd(fgl fglVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fglVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.H();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgd(this.a, agswVar);
    }
}
