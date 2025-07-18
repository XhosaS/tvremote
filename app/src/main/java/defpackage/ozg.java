package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozg extends agtu implements agvb {
    int a;
    final /* synthetic */ ozi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozg(ozi oziVar, agsw agswVar) {
        super(2, agswVar);
        this.b = oziVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ozg) c((ahge) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahge ahgeVar = (ahge) this.c;
            final ozf ozfVar = new ozf(ahgeVar);
            final ozi oziVar = this.b;
            oziVar.i(ozfVar);
            agum agumVar = new agum() { // from class: oze
                @Override // defpackage.agum
                public final Object a() {
                    oziVar.k(ozfVar);
                    return agpu.a;
                }
            };
            this.a = 1;
            if (ahgd.a(ahgeVar, agumVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ozg ozgVar = new ozg(this.b, agswVar);
        ozgVar.c = obj;
        return ozgVar;
    }
}
