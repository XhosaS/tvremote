package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwz extends agtu implements agvb {
    int a;
    final /* synthetic */ ixa b;
    final /* synthetic */ xuy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwz(ixa ixaVar, xuy xuyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ixaVar;
        this.c = xuyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iwz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ixa ixaVar = this.b;
            xuy xuyVar = this.c;
            this.a = 1;
            if (ixaVar.c(xuyVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iwz(this.b, this.c, agswVar);
    }
}
