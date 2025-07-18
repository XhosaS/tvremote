package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdb extends agtu implements agvb {
    int a;
    final /* synthetic */ fdd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdb(fdd fddVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fddVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdd fddVar = this.b;
        this.a = 1;
        Object objF = fddVar.a.f(this);
        return objF == agtgVar ? agtgVar : objF;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fdb(this.b, agswVar);
    }
}
