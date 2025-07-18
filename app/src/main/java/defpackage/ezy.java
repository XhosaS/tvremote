package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezy extends agtu implements agvb {
    int a;
    final /* synthetic */ zyd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezy(zyd zydVar, agsw agswVar) {
        super(2, agswVar);
        this.b = zydVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezy) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        zyd zydVar = this.b;
        this.a = 1;
        Object objB = ahkr.b(zydVar, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ezy(this.b, agswVar);
    }
}
