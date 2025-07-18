package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyz extends agtu implements agvb {
    final /* synthetic */ agum a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyz(agum agumVar, agsw agswVar) {
        super(2, agswVar);
        this.a = agumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.a();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gyz(this.a, agswVar);
    }
}
