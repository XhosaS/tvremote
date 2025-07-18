package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class skr extends agtu implements agvb {
    final /* synthetic */ skv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skr(skv skvVar, agsw agswVar) {
        super(2, agswVar);
        this.a = skvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((skr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ahbt ahbtVar = (ahbt) this.b;
        skv skvVar = this.a;
        ahal.e(ahbtVar, null, 0, new sko(skvVar, null), 3);
        ahal.e(ahbtVar, null, 0, new skp(skvVar, null), 3);
        ahal.e(ahbtVar, null, 0, new skq(skvVar, null), 3);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        skr skrVar = new skr(this.a, agswVar);
        skrVar.b = obj;
        return skrVar;
    }
}
