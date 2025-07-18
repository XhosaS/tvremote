package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snf extends agtu implements agvb {
    int a;
    final /* synthetic */ snh b;
    final /* synthetic */ sgo c;
    final /* synthetic */ long d;
    final /* synthetic */ rux e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snf(snh snhVar, sgo sgoVar, long j, rux ruxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = snhVar;
        this.c = sgoVar;
        this.d = j;
        this.e = ruxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((snf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        int iB;
        rqs rqsVarA;
        Object objB;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
                objB = obj;
            } else {
                agpl.b(obj);
                zyd zydVarA = ((ruw) this.e.c()).a();
                this.a = 1;
                objB = ahkr.b(zydVarA, this);
                if (objB == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (rvm) objB;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        rxn rxnVar = rxn.UNSET;
        Object objA2 = skj.a(skj.f(1), rxnVar);
        if (true == (objA instanceof agpj)) {
            objA = objA2;
        }
        snh snhVar = this.b;
        sgo sgoVar = this.c;
        long j = this.d;
        rvm rvmVar = (rvm) objA;
        rvmVar.getClass();
        rqo rqoVar = rpp.a;
        rqw rqwVar = new rqw(new rpz("AUDIO_STOP_LISTENING_DONE", false, ypv.a, 109, rpq.AUDIO_LISTENING, new int[]{105}, rpp.a, rpp.c, rpp.d));
        rxd rxdVar = rvmVar.c;
        if (rxdVar == null) {
            rxdVar = rxd.a;
        }
        rxdVar.getClass();
        int i = rxdVar.b;
        if (i == 2) {
            int iB2 = rxb.b(((Integer) rxdVar.c).intValue());
            if (iB2 == 0) {
                iB2 = 1;
            }
            rqsVarA = rqwVar.a(iB2 - 1, "stop_listening_failure");
        } else {
            if (i != 1 || (iB = rxf.b(((Integer) rxdVar.c).intValue())) == 0) {
                iB = 1;
            }
            rqsVarA = rqwVar.a(iB - 1, "stop_listening_success");
        }
        snhVar.A(rqsVarA, j);
        abxc abxcVar = snh.b;
        rxn rxnVarB = rxn.b(rvmVar.d);
        if (rxnVarB != null) {
            rxnVar = rxnVarB;
        }
        rxnVar.getClass();
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        ahod.b(snh.a.a(sgoVar), ahonVar);
        ahod.c(3, ahonVar);
        ahor ahorVar = ahor.a;
        ahoq ahoqVar = new ahoq();
        if ((ahoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahoqVar.y();
        }
        ahor ahorVar2 = (ahor) ahoqVar.b;
        ahorVar2.c = rxnVar.s;
        ahorVar2.b |= 1;
        ahor ahorVarA = ahoe.a(ahoqVar);
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.f = ahorVarA;
        ahovVar2.c |= 32;
        ((rqt) rqsVarA).f(abxcVar, ahod.a(ahonVar));
        snhVar.x(rqsVarA, sgoVar);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        snf snfVar = new snf(this.b, this.c, this.d, this.e, agswVar);
        snfVar.f = obj;
        return snfVar;
    }
}
