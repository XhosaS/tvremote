package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbw extends agtu implements agvb {
    final /* synthetic */ hby a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbw(hby hbyVar, agsw agswVar) {
        super(2, agswVar);
        this.a = hbyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.d.finish();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hbw(this.a, agswVar);
    }
}
