package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvf extends agtu implements agvb {
    int a;
    final /* synthetic */ gvh b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvf(gvh gvhVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = gvhVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gvf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        lvf lvfVarB = this.b.b.b(this.c);
        this.a = 1;
        Object objA = ahnw.a(lvfVarB, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gvf(this.b, this.c, agswVar);
    }
}
