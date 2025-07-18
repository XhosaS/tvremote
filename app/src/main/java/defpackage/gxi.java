package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxi extends agtu implements agvb {
    int a;
    final /* synthetic */ gxj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxi(gxj gxjVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gxjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gxi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gxj gxjVar = this.b;
            this.a = 1;
            if (gxjVar.a.d(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gxi(this.b, agswVar);
    }
}
