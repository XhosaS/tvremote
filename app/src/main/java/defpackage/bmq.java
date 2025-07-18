package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmq extends agtu implements agvb {
    int a;
    final /* synthetic */ agux b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmq(agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bmq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        if (((ahbt) this.c).fs().get(bnc.a) == null) {
            throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
        }
        agux aguxVar = this.b;
        this.a = 1;
        Object objA = aguxVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bmq bmqVar = new bmq(this.b, agswVar);
        bmqVar.c = obj;
        return bmqVar;
    }
}
