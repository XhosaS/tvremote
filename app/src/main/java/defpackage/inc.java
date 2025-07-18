package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class inc extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inc(ind indVar, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((inc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ind indVar = this.b;
            gyx[] gyxVarArr = {gyx.r};
            this.a = 1;
            if (indVar.m.g(gyxVarArr, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new inc(this.b, agswVar);
    }
}
