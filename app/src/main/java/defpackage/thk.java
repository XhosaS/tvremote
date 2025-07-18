package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thk extends agtu implements agvb {
    int a;
    final /* synthetic */ thl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thk(thl thlVar, agsw agswVar) {
        super(2, agswVar);
        this.b = thlVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((thk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        thl thlVar = this.b;
        this.a = 1;
        Object objA = thlVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new thk(this.b, agswVar);
    }
}
