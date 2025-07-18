package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gti extends agtu implements agvb {
    int a;
    final /* synthetic */ gtj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gti(gtj gtjVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gtjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gti) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        zyd zydVarA = this.b.a.a();
        this.a = 1;
        Object objB = ahkr.b(zydVarA, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gti(this.b, agswVar);
    }
}
