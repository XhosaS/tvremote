package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smk extends agtu implements agvb {
    final /* synthetic */ sml a;
    final /* synthetic */ sdp b;
    final /* synthetic */ tae c;
    final /* synthetic */ ruo d;
    final /* synthetic */ agux e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smk(sml smlVar, sdp sdpVar, tae taeVar, ruo ruoVar, agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.a = smlVar;
        this.b = sdpVar;
        this.c = taeVar;
        this.d = ruoVar;
        this.e = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((smk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        rxh rxhVarB;
        agpl.b(obj);
        sml smlVar = this.a;
        sdp sdpVar = this.b;
        tae taeVarC = this.c;
        if (taeVarC == null) {
            taeVarC = smlVar.a.c(this.d, agrd.a);
        }
        ruo ruoVar = this.d;
        final agux aguxVar = this.e;
        agux aguxVar2 = new agux() { // from class: smi
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                rxh rxhVar = (rxh) obj2;
                rxhVar.getClass();
                aguxVar.a(skc.a.g(109, rxn.FAILED_START_LISTENING));
                return skc.a(rxhVar);
            }
        };
        try {
            objA = sdpVar.c();
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        Throwable thA = agpk.a(objA);
        if (thA != null) {
            if (thA instanceof sln) {
                rxj rxjVar = ((sln) thA).a;
                if (rxjVar.b != 2 || (rxhVarB = rxh.b(((Integer) rxjVar.c).intValue())) == null) {
                    rxhVarB = rxh.UNKNOWN_OPENING_FAILURE;
                }
                rxhVarB.getClass();
                return aguxVar2.a(rxhVarB);
            }
            objA = ypv.a;
        }
        sdt sdtVar = (sdt) ((yqt) objA).f();
        if (sdtVar == null) {
            return aguxVar2.a(rxh.FAILED_TO_OPEN_AUDIO_SOURCE);
        }
        boolean z = taeVarC instanceof sbl;
        boolean z2 = taeVarC instanceof sax;
        smlVar.b.a(szr.c(ruoVar), yqt.h(z ? (sbl) taeVarC : null), yqt.h(z2 ? (sax) taeVarC : null)).a(sdtVar);
        yqt yqtVarH = yqt.h(z ? (sbl) taeVarC : null);
        yqt yqtVarH2 = yqt.h(z2 ? (sax) taeVarC : null);
        rxj rxjVar2 = rxj.a;
        rxi rxiVar = new rxi();
        rwz.c(2, rxiVar);
        return skc.f(yqtVarH2, yqtVarH, rwz.a(rxiVar), 24);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new smk(this.a, this.b, this.c, this.d, this.e, agswVar);
    }
}
