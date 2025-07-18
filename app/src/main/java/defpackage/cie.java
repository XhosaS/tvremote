package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cie extends agtu implements agvb {
    int a;
    final /* synthetic */ cic b;
    final /* synthetic */ cld c;
    final /* synthetic */ chv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cie(cic cicVar, cld cldVar, chv chvVar, agsw agswVar) {
        super(2, agswVar);
        this.b = cicVar;
        this.c = cldVar;
        this.d = chvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cie) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            cic cicVar = this.b;
            cld cldVar = this.c;
            chv chvVar = this.d;
            ahgr ahgrVarA = cicVar.a(cldVar);
            cid cidVar = new cid(chvVar, cldVar);
            this.a = 1;
            if (ahgrVarA.fD(cidVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cie(this.b, this.c, this.d, agswVar);
    }
}
