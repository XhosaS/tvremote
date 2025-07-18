package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guw extends agtu implements agvb {
    int a;
    final /* synthetic */ gva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guw(gva gvaVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gvaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((guw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        lvf lvfVarD = this.b.b.d();
        this.a = 1;
        Object objA = ahnw.a(lvfVarD, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new guw(this.b, agswVar);
    }
}
