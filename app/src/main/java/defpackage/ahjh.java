package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjh extends agtu implements agvb {
    int a;
    final /* synthetic */ ahgs b;
    final /* synthetic */ ahjj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahjh(ahgs ahgsVar, ahjj ahjjVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahgsVar;
        this.c = ahjjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahjh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2 = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahbt ahbtVar = (ahbt) this.d;
            ahgs ahgsVar = this.b;
            ahgg ahggVarF = this.c.f(ahbtVar);
            this.a = 1;
            Object objA = ahgw.a(ahgsVar, ahggVarF, true, this);
            if (objA != obj2) {
                objA = agpu.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahjh ahjhVar = new ahjh(this.b, this.c, agswVar);
        ahjhVar.d = obj;
        return ahjhVar;
    }
}
