package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtq extends agtu implements agvb {
    int a;
    final /* synthetic */ agvb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtq(agsw agswVar, agvb agvbVar) {
        super(2, agswVar);
        this.b = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wtq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahbt ahbtVar = (ahbt) this.c;
        agvb agvbVar = this.b;
        this.a = 1;
        Object objA = agvbVar.a(ahbtVar, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        wtq wtqVar = new wtq(agswVar, this.b);
        wtqVar.c = obj;
        return wtqVar;
    }
}
