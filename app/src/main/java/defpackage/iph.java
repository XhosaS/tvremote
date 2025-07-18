package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iph implements ipg {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl");
    private final qpk b;
    private boolean c;
    private String d;

    public iph(qpk qpkVar) {
        qpkVar.getClass();
        this.b = qpkVar;
    }

    @Override // defpackage.ipg
    public final void a() {
        if (this.c) {
            return;
        }
        this.b.g(gmc.l.aD);
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl", "maybeStart", 44, "ScreenLoadTimeTrackerImpl.kt")).u("Start tracking screen loading time.");
        this.c = true;
    }

    @Override // defpackage.ipg
    public final void b(String str) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl", "setScreenName", 35, "ScreenLoadTimeTrackerImpl.kt")).x("Set screen name to [%s]", str);
        this.d = str;
    }

    @Override // defpackage.ipg
    public final void c(rbl rblVar) {
        rblVar.getClass();
        if (!this.c) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl", "stop", 50, "ScreenLoadTimeTrackerImpl.kt")).u("Tacker already stopped");
            return;
        }
        qpk qpkVar = this.b;
        qpi qpiVar = gmc.l.aD;
        String str = this.d;
        ahqu ahquVar = ahqu.a;
        ahqt ahqtVar = new ahqt();
        abxc abxcVar = ahqq.b;
        abxcVar.getClass();
        ahqp ahqpVar = new ahqp();
        ahqs ahqsVar = ahqs.a;
        ahqr ahqrVar = new ahqr();
        if (str != null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl", "buildMetricExtension", 76, "ScreenLoadTimeTrackerImpl.kt")).x("Recording latency for screen [%s]", str);
            if ((ahqrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqrVar.y();
            }
            ahqs ahqsVar2 = (ahqs) ahqrVar.b;
            ahqsVar2.b |= 4;
            ahqsVar2.c = str;
        } else {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl", "buildMetricExtension", 79, "ScreenLoadTimeTrackerImpl.kt")).u("Screen name missing while recording latency");
        }
        abxd abxdVarV = ahqrVar.v();
        abxdVarV.getClass();
        ahqs ahqsVar3 = (ahqs) abxdVarV;
        if ((ahqpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqpVar.y();
        }
        ahqq ahqqVar = (ahqq) ahqpVar.b;
        ahqqVar.d = ahqsVar3;
        ahqqVar.c |= 1;
        abxd abxdVarV2 = ahqpVar.v();
        abxdVarV2.getClass();
        ahqtVar.f(abxcVar, (ahqq) abxdVarV2);
        qpkVar.i(qpiVar, qpiVar, ahsg.a(ahqtVar), rblVar);
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/metrics/ScreenLoadTimeTrackerImpl", "stop", 59, "ScreenLoadTimeTrackerImpl.kt")).F("Stop tracking [%s] with status [%s]", this.d, rblVar);
        qpkVar.c(qpiVar);
        this.c = false;
        this.d = null;
    }
}
