package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jik extends agtu implements agvb {
    int a;
    final /* synthetic */ ahcb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jik(ahcb ahcbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahcbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jik) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahcb ahcbVar = this.b;
        this.a = 1;
        Object objA = ahcbVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jik(this.b, agswVar);
    }
}
