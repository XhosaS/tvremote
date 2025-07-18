package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjs extends agtu implements agvb {
    int a;
    final /* synthetic */ fjt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjs(fjt fjtVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fjtVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fjs) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        fjt fjtVar = this.b;
        this.a = 1;
        Object objA = fjtVar.a.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fjs(this.b, agswVar);
    }
}
