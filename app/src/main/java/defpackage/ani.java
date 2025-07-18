package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ani extends agtu implements agvb {
    int a;
    final /* synthetic */ agvb b;
    final /* synthetic */ alt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ani(agvb agvbVar, alt altVar, agsw agswVar) {
        super(2, agswVar);
        this.b = agvbVar;
        this.c = altVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ani) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
        alt altVar = this.c;
        this.a = 1;
        Object objA = agvbVar.a(altVar.a, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ani(this.b, this.c, agswVar);
    }
}
