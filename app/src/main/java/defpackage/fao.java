package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fao extends agtu implements agvb {
    int a;
    final /* synthetic */ fap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fao(fap fapVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fapVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fao) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        fap fapVar = this.b;
        this.a = 1;
        Object objB = fapVar.b(this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fao(this.b, agswVar);
    }
}
