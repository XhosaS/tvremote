package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bns extends agtu implements agvb {
    int a;
    final /* synthetic */ boa b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(boa boaVar, agsw agswVar) {
        super(2, agswVar);
        this.b = boaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bns) c((bog) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Exception {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        bog bogVar = (bog) this.c;
        boa boaVar = this.b;
        this.a = 1;
        Object objA = boaVar.a(bogVar, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bns bnsVar = new bns(this.b, agswVar);
        bnsVar.c = obj;
        return bnsVar;
    }
}
