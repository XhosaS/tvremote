package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gec extends agtu implements agvb {
    int a;
    final /* synthetic */ gee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gec(gee geeVar, agsw agswVar) {
        super(2, agswVar);
        this.b = geeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gec) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        zyd zydVarB = this.b.a.b();
        this.a = 1;
        Object objB = ahkr.b(zydVarB, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gec(this.b, agswVar);
    }
}
