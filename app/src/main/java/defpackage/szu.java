package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szu extends agtu implements agvb {
    final /* synthetic */ agux a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szu(agux aguxVar, Object obj, agsw agswVar) {
        super(2, agswVar);
        this.a = aguxVar;
        this.b = obj;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.a(this.b);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new szu(this.a, this.b, agswVar);
    }
}
