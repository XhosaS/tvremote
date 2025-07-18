package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syw extends agtu implements agvb {
    final /* synthetic */ sza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syw(sza szaVar, agsw agswVar) {
        super(2, agswVar);
        this.a = szaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.g();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new syw(this.a, agswVar);
    }
}
