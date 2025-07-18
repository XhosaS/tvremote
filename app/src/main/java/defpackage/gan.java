package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gan extends agtu implements agvb {
    final /* synthetic */ gar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gan(gar garVar, agsw agswVar) {
        super(2, agswVar);
        this.a = garVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gan) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.b.finish();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gan(this.a, agswVar);
    }
}
