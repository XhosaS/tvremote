package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goy extends agtu implements agvb {
    final /* synthetic */ goz a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goy(goz gozVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.a = gozVar;
        this.b = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((goy) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.b.s(this.b);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new goy(this.a, this.b, agswVar);
    }
}
