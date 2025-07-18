package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bop extends agtu implements agvb {
    int a;
    final /* synthetic */ agvb b;
    final /* synthetic */ bol c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bop(agvb agvbVar, bol bolVar, agsw agswVar) {
        super(2, agswVar);
        this.b = agvbVar;
        this.c = bolVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bop) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        agvb agvbVar = this.b;
        bol bolVar = this.c;
        this.a = 1;
        Object objA = agvbVar.a(bolVar, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bop(this.b, this.c, agswVar);
    }
}
