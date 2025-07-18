package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azx {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final azl f;
    private final azn g;
    private final azr h;

    public azx(Context context, byg bygVar, byg bygVar2, byg bygVar3, byg bygVar4, byg bygVar5) {
        String packageName = context.getPackageName();
        azl azlVar = (azl) bygVar.d(azl.a);
        azn aznVar = (azn) bygVar2.d(azn.a);
        azr azrVar = (azr) bygVar3.d(azr.a);
        boolean zBooleanValue = ((Boolean) bygVar4.d(false)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) bygVar5.d(false)).booleanValue();
        this.c = "ATV_REMOTE_SERVICE_PRIMES";
        this.f = azlVar;
        this.g = aznVar;
        this.h = azrVar;
        this.d = zBooleanValue;
        this.e = zBooleanValue2;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final cja a() {
        final cja cjaVarA = this.f.a();
        final cja cjaVarA2 = this.g.a();
        final cja cjaVarA3 = this.h.a();
        return qm.H(cjaVarA, cjaVarA2, cjaVarA3).a(new Callable() { // from class: azw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                clo cloVarO = azv.a.o();
                boolean zA = cloVarO.b.A();
                cja cjaVar = cjaVarA;
                cja cjaVar2 = cjaVarA2;
                cja cjaVar3 = cjaVarA3;
                if (!zA) {
                    cloVarO.l();
                }
                azx azxVar = this.a;
                azv azvVar = (azv) cloVarO.b;
                azvVar.b |= 1;
                azvVar.c = azxVar.c;
                cloVarO.o(azxVar.a);
                cloVarO.o(azxVar.b);
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                boolean z = azxVar.d;
                clt cltVar = cloVarO.b;
                azv azvVar2 = (azv) cltVar;
                azvVar2.b |= 2;
                azvVar2.d = z;
                boolean z2 = azxVar.e;
                if (!cltVar.A()) {
                    cloVarO.l();
                }
                azv azvVar3 = (azv) cloVarO.b;
                azvVar3.b |= 16;
                azvVar3.h = z2;
                try {
                    byg bygVar = (byg) qm.P(cjaVar);
                    if (bygVar.f()) {
                        String str = (String) bygVar.b();
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        azv azvVar4 = (azv) cloVarO.b;
                        azvVar4.b |= 8;
                        azvVar4.f = str;
                    }
                } catch (Exception e) {
                    ((cbs) ((cbs) aqn.a.b().i(e)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 98, "ClearcutMetricSnapshotBuilder.java")).p("Failed to set Account Name, falling back to Zwieback logging.");
                }
                try {
                    List list = (List) qm.P(cjaVar2);
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    azv azvVar5 = (azv) cloVarO.b;
                    cma cmaVar = azvVar5.g;
                    if (!cmaVar.c()) {
                        azvVar5.g = clt.r(cmaVar);
                    }
                    ckd.d(list, azvVar5.g);
                } catch (Exception e2) {
                    ((cbs) ((cbs) aqn.a.b().i(e2)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 106, "ClearcutMetricSnapshotBuilder.java")).p("Failed to set external Experiment Ids.");
                }
                try {
                    byg bygVar2 = (byg) qm.P(cjaVar3);
                    if (bygVar2.f()) {
                        String str2 = (String) bygVar2.b();
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        azv azvVar6 = (azv) cloVarO.b;
                        azvVar6.b |= 4;
                        azvVar6.e = str2;
                    }
                } catch (Exception e3) {
                    ((cbs) ((cbs) aqn.a.b().i(e3)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 116, "ClearcutMetricSnapshotBuilder.java")).p("Failed to set Zwieback.");
                }
                clq clqVar = (clq) azo.a.o();
                clqVar.Y(azv.j, (azv) cloVarO.i());
                return (azo) clqVar.i();
            }
        }, chz.a);
    }
}
