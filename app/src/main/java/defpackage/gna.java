package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gna extends agtu implements agvb {
    final /* synthetic */ gnd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gna(gnd gndVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gndVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gna) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return this.a.b.b(2);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gna(this.a, agswVar);
    }
}
