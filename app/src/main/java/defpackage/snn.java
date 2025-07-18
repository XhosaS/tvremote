package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class snn implements zxe {
    final /* synthetic */ sgo a;
    final /* synthetic */ rxh b;
    final /* synthetic */ snr c;

    public snn(snr snrVar, sgo sgoVar, rxh rxhVar) {
        this.a = sgoVar;
        this.b = rxhVar;
        this.c = snrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zfd) ((zfd) ((zfd) snr.a.d()).p(th)).q("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$1", "onFailure", 165, "MonitoringLoggerImpl.java")).u("#audio# AudioRequestListeningSession start listening failed");
        snr snrVar = this.c;
        sor sorVar = (sor) snrVar.b.a();
        String strName = this.b.name();
        String str = (String) snrVar.d.eV();
        int iB = sgn.b(this.a.b);
        if (iB == 0) {
            throw null;
        }
        sorVar.d(strName, str, sgn.a(iB), false);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iB;
        String strA;
        rxj rxjVar = ((rvk) ((ruv) obj).f()).c;
        if (rxjVar == null) {
            rxjVar = rxj.a;
        }
        int i = rxjVar.b;
        if (i == 2) {
            rxh rxhVarB = rxh.b(((Integer) rxjVar.c).intValue());
            if (rxhVarB == null) {
                rxhVarB = rxh.UNKNOWN_OPENING_FAILURE;
            }
            strA = rxhVarB.name();
        } else {
            if (i != 1 || (iB = rxl.b(((Integer) rxjVar.c).intValue())) == 0) {
                iB = 1;
            }
            strA = rxl.a(iB);
        }
        ((zfd) ((zfd) snr.a.b()).q("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$1", "onSuccess", 152, "MonitoringLoggerImpl.java")).x("#audio# AudioRequestListeningSession start listening status: %s", strA);
        snr snrVar = this.c;
        sor sorVar = (sor) snrVar.b.a();
        String str = (String) snrVar.d.eV();
        int iB2 = sgn.b(this.a.b);
        if (iB2 == 0) {
            throw null;
        }
        sorVar.d(strA, str, sgn.a(iB2), rxjVar.b == 1);
    }
}
