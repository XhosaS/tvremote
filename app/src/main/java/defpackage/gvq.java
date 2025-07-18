package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvq extends agtu implements agvb {
    final /* synthetic */ gvt a;
    final /* synthetic */ agwh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvq(gvt gvtVar, agwh agwhVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gvtVar;
        this.b = agwhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gvq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return this.a.a.a((String) this.b.a);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gvq(this.a, this.b, agswVar);
    }
}
