package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqs extends agtu implements agvb {
    int a;
    final /* synthetic */ sqv b;
    final /* synthetic */ rxn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqs(sqv sqvVar, rxn rxnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sqvVar;
        this.c = rxnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqs) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        rxd rxdVarA;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            rxdVarA = (rxd) obj;
        } else {
            sqv sqvVar = this.b;
            sky skyVarB = sqvVar.i.b(sqvVar.c, sqvVar.b);
            boolean z = skyVarB.a;
            if (z && skyVarB.b == 0) {
                zyd zydVarG = sqvVar.d.g(this.c);
                this.a = 1;
                obj = ahkr.b(zydVarG, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                rxdVarA = (rxd) obj;
            } else {
                rxd rxdVar = rxd.a;
                rxc rxcVar = new rxc();
                if (z) {
                    rwy.c(rxcVar);
                } else {
                    rwy.b(105, rxcVar);
                }
                rxdVarA = rwy.a(rxcVar);
            }
        }
        sqv sqvVar2 = this.b;
        sqvVar2.j.N(skc.a.c(rxdVarA, this.c));
        return rxdVarA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sqs(this.b, this.c, agswVar);
    }
}
