package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agap extends agtu implements agvb {
    int a;
    final /* synthetic */ ahdl b;
    final /* synthetic */ Exception c;
    final /* synthetic */ afeq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agap(ahdl ahdlVar, Exception exc, afeq afeqVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahdlVar;
        this.c = exc;
        this.d = afeqVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agap) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahdl ahdlVar = this.b;
            Exception exc = this.c;
            this.a = 1;
            ahdp.d(ahdlVar, "Collection of responses completed exceptionally", exc);
            Object objFz = ahdlVar.fz(this);
            if (objFz != agtgVar) {
                objFz = agpu.a;
            }
            if (objFz == agtgVar) {
                return agtgVar;
            }
        }
        this.d.b("Collection of responses completed exceptionally", this.c);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new agap(this.b, this.c, this.d, agswVar);
    }
}
