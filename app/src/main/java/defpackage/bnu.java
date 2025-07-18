package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnu extends agtu implements agvb {
    int a;
    final /* synthetic */ boa b;
    final /* synthetic */ agum c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnu(boa boaVar, agum agumVar, agsw agswVar) {
        super(2, agswVar);
        this.b = boaVar;
        this.c = agumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bnu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            boa boaVar = this.b;
            this.a = 1;
            obj = boaVar.b(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bnu(this.b, this.c, agswVar);
    }
}
