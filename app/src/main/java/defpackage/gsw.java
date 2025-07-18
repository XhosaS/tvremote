package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsw extends agtu implements agvb {
    int a;
    final /* synthetic */ gsy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsw(gsy gsyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gsyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gsw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        gsy gsyVar = this.b;
        this.a = 1;
        Object objA = gsyVar.a.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gsw(this.b, agswVar);
    }
}
