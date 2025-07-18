package defpackage;

import com.google.common.collect.ImmutableSet;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruo extends rum implements rqf, ruf {
    static final ImmutableSet a = ImmutableSet.of("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final /* synthetic */ int g = 0;
    public final rqd b;
    final ConcurrentHashMap c = new ConcurrentHashMap();
    public final xbw d;
    public final xbw e;
    public final ttm f;
    private final Executor h;

    public ruo(yyh yyhVar, Executor executor, xbw xbwVar, xbw xbwVar2, yfo yfoVar, ulp ulpVar) {
        this.b = yyhVar.f(ugk.a, xbwVar, yfoVar);
        this.h = executor;
        this.d = xbwVar;
        this.e = xbwVar2;
        this.f = sij.l(new evk(ulpVar, xbwVar, 18, null));
    }

    private final uhp e(final String str, final long j, final rul rulVar) {
        return sfy.G(new ufv() { // from class: run
            @Override // defpackage.ufv
            public final uhp a() {
                ruo ruoVar = this.a;
                if (!((rvi) ruoVar.f.get()).a()) {
                    ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "recordSystemHealthMetricInBackground", 435, "TimerMetricServiceImpl.java")).s("TimerMetric not recorded, metric was rejected by sampling configuration.");
                    return uhl.a;
                }
                rul rulVar2 = rulVar;
                long j2 = j;
                tst tstVar = ((ruk) ruoVar.d.b()).b;
                rqd rqdVar = ruoVar.b;
                rpz rpzVarA = rqa.a();
                rpzVarA.c(true);
                rpzVarA.d = Long.valueOf(j2);
                tst tstVar2 = (tst) ruoVar.e.b();
                vtw vtwVarM = zba.a.m();
                boolean zBooleanValue = ((Boolean) tstVar2.b(new rke(13)).e(false)).booleanValue();
                vtw vtwVarM2 = zbb.a.m();
                long jB = zBooleanValue ? rulVar2.b() : rulVar2.a();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar = vtwVarM2.b;
                zbb zbbVar = (zbb) vucVar;
                zbbVar.b = 1 | zbbVar.b;
                zbbVar.c = jB;
                if (rulVar2.d - 1 != 0) {
                    throw new RuntimeException(null, null);
                }
                if (!vucVar.A()) {
                    vtwVarM2.u();
                }
                zbb zbbVar2 = (zbb) vtwVarM2.b;
                zbbVar2.d = 0;
                zbbVar2.b |= 2;
                zbb zbbVar3 = (zbb) vtwVarM2.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                String str2 = str;
                zba zbaVar = (zba) vtwVarM.b;
                zbbVar3.getClass();
                zbaVar.g = zbbVar3;
                zbaVar.b |= 16;
                rpzVarA.f((zba) vtwVarM.r());
                rpzVarA.a = str2;
                rpzVarA.b = null;
                return rqdVar.b(rpzVarA.a());
            }
        }, this.h);
    }

    private final synchronized uhp f(rul rulVar, String str) {
        if (rul.d(rulVar)) {
            return uhl.a;
        }
        long jA = this.b.a(str);
        if (jA == -1) {
            return uhl.a;
        }
        rulVar.c();
        rulVar.e();
        return (rul.d(rulVar) || sij.F(str)) ? sfy.B(new IllegalArgumentException("Can't record an event that was never started or has been stopped already")) : a.contains(str) ? sfy.B(new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", str))) : e(str, jA, rulVar);
    }

    private final synchronized uhp g(String str) {
        rul rulVar = (rul) this.c.remove(str);
        if (rul.d(rulVar)) {
            ((tug) ((tug) rnb.a.c()).j("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 308, "TimerMetricServiceImpl.java")).v("Can't stop global event '%s' that was never started or has already been stopped", str);
            return uhl.a;
        }
        long jA = this.b.a(str);
        if (jA == -1) {
            return uhl.a;
        }
        rulVar.c();
        rulVar.e();
        ((tug) ((tug) rnb.a.c()).j("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 323, "TimerMetricServiceImpl.java")).E("Stopped global timer for event name %s. realtime: %d ms, uptime: %d ms", str, Long.valueOf(rulVar.a()), Long.valueOf(rulVar.b()));
        if (true != sij.F(null)) {
            str = null;
        }
        return e(str, jA, rulVar);
    }

    @Override // defpackage.rum
    public final rul a() {
        return !this.b.d() ? rul.a : new rul();
    }

    @Override // defpackage.rum
    public final rul b(rmp rmpVar) {
        ImmutableSet immutableSet = a;
        String str = rmpVar.a;
        if (immutableSet.contains(str)) {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "startGlobal", 133, "TimerMetricServiceImpl.java")).v("%s is reserved event. Dropping timer.", str);
            return rul.a;
        }
        if (!this.b.d()) {
            return rul.a;
        }
        rul rulVar = new rul();
        this.c.put(str, rulVar);
        return rulVar;
    }

    @Override // defpackage.rum
    public final uhp c(rul rulVar, rmp rmpVar) {
        return f(rulVar, rmpVar.a);
    }

    @Override // defpackage.rum
    public final uhp d(rmp rmpVar) {
        return g(rmpVar.a);
    }

    @Override // defpackage.rqf
    public final /* synthetic */ void k() {
    }
}
