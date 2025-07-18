package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iem extends agtu implements agvb {
    final /* synthetic */ iep a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iem(iep iepVar, agsw agswVar) {
        super(2, agswVar);
        this.a = iepVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iem) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.e.finish();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iem(this.a, agswVar);
    }
}
