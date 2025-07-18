package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfw extends agtu implements agvb {
    final /* synthetic */ jhh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfw(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.a = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jfw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.aw();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jfw(this.a, agswVar);
    }
}
