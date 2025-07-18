package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class snm implements zxe {
    final /* synthetic */ yrn a;
    final /* synthetic */ sgo b;
    final /* synthetic */ rvw c;
    final /* synthetic */ snr d;

    public snm(snr snrVar, yrn yrnVar, sgo sgoVar, rvw rvwVar) {
        this.a = yrnVar;
        this.b = sgoVar;
        this.c = rvwVar;
        this.d = snrVar;
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        String str;
        yrn yrnVar = this.a;
        yrnVar.f();
        double dA = yrnVar.a(TimeUnit.MILLISECONDS);
        snr snrVar = this.d;
        sor sorVar = (sor) snrVar.b.a();
        sgo sgoVar = this.b;
        int iB = sgn.b(sgoVar.b);
        if (iB == 0) {
            throw null;
        }
        rvw rvwVar = this.c;
        yrp yrpVar = snrVar.d;
        switch (rvu.a(rvwVar.b)) {
            case BLUETOOTH_AUDIO_ROUTE:
                int iA = rwb.a((rvwVar.b == 1 ? (rwc) rvwVar.c : rwc.a).b);
                if (iA == 0) {
                    iA = 3;
                }
                int i = iA - 1;
                if (i == 0) {
                    str = "BLUETOOTH_AUDIO_ROUTE";
                    break;
                } else if (i == 1) {
                    str = "BLUETOOTH_AUDIO_ROUTE_FALLBACK_TO_BUILTIN";
                    break;
                } else {
                    str = "BLUETOOTH_AUDIO_ROUTE_CONNECT_IN_PARALLEL_FALLBACK_TO_BUILTIN";
                    break;
                }
            case BUILTIN_AUDIO_ROUTE:
                str = "BUILTIN_AUDIO_ROUTE";
                break;
            case DSP_AUDIO_ROUTE:
                str = "DSP_AUDIO_ROUTE";
                break;
            case BISTO_AUDIO_ROUTE:
                str = "BISTO_AUDIO_ROUTE";
                break;
            case HANDOVER_ROUTE:
                str = "HANDOVER_ROUTE";
                break;
            case SODA_ROUTE:
                str = "SODA_ROUTE";
                break;
            case CAR_AUDIO_ROUTE:
                str = "CAR_AUDIO_ROUTE";
                break;
            case GACS_AUDIO_ROUTE:
                str = "GACS_AUDIO_ROUTE";
                break;
            case AUDIOROUTE_NOT_SET:
                str = "AUDIOROUTE_NOT_SET";
                break;
            default:
                throw new agpg();
        }
        ((uqq) sorVar.f.eV()).b(dA, sgn.a(iB), str, (String) yrpVar.eV());
        zfd zfdVar = (zfd) ((zfd) snr.a.b()).q("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$10", "onSuccess", 621, "MonitoringLoggerImpl.java");
        int iB2 = sgn.b(sgoVar.b);
        if (iB2 == 0) {
            throw null;
        }
        zfdVar.I("#audio# starting listening client(%s) route(%s) took %d(ms)", sgn.a(iB2), szx.b(rvwVar), Long.valueOf((long) dA));
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
