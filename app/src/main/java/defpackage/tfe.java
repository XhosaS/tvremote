package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfe extends agtu implements agvb {
    int a;
    final /* synthetic */ tfc b;
    final /* synthetic */ tff c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(tfc tfcVar, tff tffVar, agsw agswVar) {
        super(2, agswVar);
        this.b = tfcVar;
        this.c = tffVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfe) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            long jA = this.b.a();
            this.a = 1;
            if (ahce.c(jA, this) == agtgVar) {
                return agtgVar;
            }
        }
        tfc tfcVar = this.b;
        tfcVar.b();
        this.c.b.put(tfcVar, false);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tfe(this.b, this.c, agswVar);
    }
}
