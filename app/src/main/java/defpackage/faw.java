package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class faw extends agtu implements agvb {
    int a;
    final /* synthetic */ faz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public faw(faz fazVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fazVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((faw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        faz fazVar = this.b;
        this.a = 1;
        Object objA = fazVar.b.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new faw(this.b, agswVar);
    }
}
