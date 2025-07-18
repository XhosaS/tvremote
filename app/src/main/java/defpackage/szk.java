package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szk extends agtu implements agvb {
    int a;
    final /* synthetic */ szo b;
    final /* synthetic */ rzb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szk(szo szoVar, rzb rzbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = szoVar;
        this.c = rzbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            zdy zdyVar = szo.a;
            zer zerVar = zfi.a;
            ahdl ahdlVarB = this.b.b("loopback", (rsp) this.c.d().c());
            this.a = 1;
            if (((ahdv) ahdlVarB).fy(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new szk(this.b, this.c, agswVar);
    }
}
