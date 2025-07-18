package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgg extends agtu implements agvb {
    int a;
    final /* synthetic */ cgk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgg(cgk cgkVar, agsw agswVar) {
        super(2, agswVar);
        this.b = cgkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        cgk cgkVar = this.b;
        this.a = 1;
        Object objA = cgkVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cgg(this.b, agswVar);
    }
}
