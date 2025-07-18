package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqi implements aqh {
    private final aqp a;
    private final crv b;
    private final crv c;
    private final cmt d;

    public aqi(aqp aqpVar, crv crvVar, crv crvVar2, byg bygVar, cmt cmtVar) {
        this.a = aqpVar;
        this.b = crvVar;
        this.c = crvVar2;
        this.d = cmtVar;
        if (((Boolean) bygVar.d(Boolean.FALSE)).booleanValue()) {
            return;
        }
        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 115, "PrimesApiImpl.java")).p("Primes instant initialization");
        try {
            WeakHashMap weakHashMap = bwv.a;
            Iterator it = ((cpo) crvVar).a().iterator();
            while (it.hasNext()) {
                ((auh) it.next()).t();
            }
        } catch (RuntimeException e) {
            cbt cbtVar = aqn.a;
            ((cbs) ((cbs) cbtVar.g().i(e)).j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 123, "PrimesApiImpl.java")).p("Primes failed to initialize");
            aqp aqpVar2 = this.a;
            if (aqpVar2.a) {
                return;
            }
            aqpVar2.a = true;
            ((cbs) cbtVar.b().j("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).p("Shutdown ...");
        }
    }

    @Override // defpackage.aqh
    public final void a() {
        this.d.d();
    }

    @Override // defpackage.aqh
    public final void b() {
        ((axi) this.c.a()).a();
    }
}
