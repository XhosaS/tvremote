package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmz extends agtu implements agvb {
    final /* synthetic */ gnd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmz(gnd gndVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gndVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gmz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return this.a.b.b(3);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gmz(this.a, agswVar);
    }
}
