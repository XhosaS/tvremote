package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sno implements zxe {
    final /* synthetic */ sgo a;
    final /* synthetic */ snr b;

    public sno(snr snrVar, sgo sgoVar) {
        this.a = sgoVar;
        this.b = snrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zfd) ((zfd) ((zfd) snr.a.d()).p(th)).q("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$2", "onFailure", 212, "MonitoringLoggerImpl.java")).u("#audio# AudioRequestListeningSession stop listening failed");
        snr snrVar = this.b;
        sor sorVar = (sor) snrVar.b.a();
        String strName = rxn.UNSET.name();
        String str = (String) snrVar.d.eV();
        int iB = sgn.b(this.a.b);
        if (iB == 0) {
            throw null;
        }
        sorVar.c("FAILED_CLOSING_ERROR_RETRIEVING_STATUS", strName, str, sgn.a(iB));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String strA;
        int iB;
        rvm rvmVar = (rvm) obj;
        rxd rxdVar = rvmVar.c;
        if (rxdVar == null) {
            rxdVar = rxd.a;
        }
        int i = rxdVar.b;
        if (i == 2) {
            int iB2 = rxb.b(((Integer) rxdVar.c).intValue());
            strA = rxb.a(iB2 != 0 ? iB2 : 1);
        } else {
            if (i == 1 && (iB = rxf.b(((Integer) rxdVar.c).intValue())) != 0) {
                i = iB;
            }
            strA = rxf.a(i);
        }
        ((zfd) ((zfd) snr.a.b()).q("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$2", "onSuccess", 199, "MonitoringLoggerImpl.java")).x("#audio# AudioRequestListeningSession stop listening status: %s", strA);
        snr snrVar = this.b;
        sor sorVar = (sor) snrVar.b.a();
        rxn rxnVarB = rxn.b(rvmVar.d);
        if (rxnVarB == null) {
            rxnVarB = rxn.UNSET;
        }
        yrp yrpVar = snrVar.d;
        String strName = rxnVarB.name();
        String str = (String) yrpVar.eV();
        int iB3 = sgn.b(this.a.b);
        if (iB3 == 0) {
            throw null;
        }
        sorVar.c(strA, strName, str, sgn.a(iB3));
    }
}
