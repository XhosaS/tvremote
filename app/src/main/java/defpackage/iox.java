package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iox implements iow {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/initialloading/SetupLoadingTrackerImpl");
    private static final Duration l;
    public Duration b;
    public Duration c;
    public Duration d;
    public Duration e;
    public final yrn f;
    public final yrn g;
    public final yrn h;
    public boolean i;
    public boolean j;
    public final List k;
    private final ipe m;
    private Duration n;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(20L);
        durationOfSeconds.getClass();
        l = durationOfSeconds;
    }

    public iox(ipe ipeVar, yrx yrxVar) {
        ipeVar.getClass();
        this.m = ipeVar;
        Duration duration = Duration.ZERO;
        duration.getClass();
        this.n = duration;
        Duration duration2 = Duration.ZERO;
        duration2.getClass();
        this.b = duration2;
        Duration duration3 = Duration.ZERO;
        duration3.getClass();
        this.c = duration3;
        Duration duration4 = Duration.ZERO;
        duration4.getClass();
        this.d = duration4;
        Duration duration5 = Duration.ZERO;
        duration5.getClass();
        this.e = duration5;
        this.f = new yrn(yrxVar);
        this.g = new yrn(yrxVar);
        this.h = new yrn(yrxVar);
        this.k = new ArrayList();
    }

    @Override // defpackage.iow
    public final void a() {
        yrn yrnVar = this.f;
        Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
        durationOfNanos.getClass();
        this.n = durationOfNanos;
        d(adzh.AUTH_CHECK, this.n);
        yrnVar.d();
        yrnVar.e();
    }

    @Override // defpackage.iow
    public final void b() {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/initialloading/SetupLoadingTrackerImpl", "markStartFetchSettings", 72, "SetupLoadingTrackerImpl.kt")).u("Starting loading latency stopwatch");
        yrn yrnVar = this.f;
        yrnVar.d();
        yrnVar.e();
        yrn yrnVar2 = this.h;
        if (yrnVar2.a) {
            return;
        }
        yrnVar2.e();
    }

    @Override // defpackage.iow
    public final boolean c() {
        if (!agvy.c(this.n, Duration.ZERO) && !agvy.c(this.b, Duration.ZERO) && !agvy.c(this.c, Duration.ZERO) && !agvy.c(this.d, Duration.ZERO) && !agvy.c(this.e, Duration.ZERO)) {
            return true;
        }
        if (Duration.ofNanos(this.h.b()).compareTo(l) > 0) {
            this.m.e(ipd.u, null);
            return true;
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/initialloading/SetupLoadingTrackerImpl", "isAllLoadingDoneOrTimeout", 57, "SetupLoadingTrackerImpl.kt")).u("Assistant setup initial loading not finished nor timed out.");
        return false;
    }

    public final void d(adzh adzhVar, Duration duration) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/initialloading/SetupLoadingTrackerImpl", "addLatencyInfo", 140, "SetupLoadingTrackerImpl.kt")).F("SetupLatencyType %s: [%s]", adzhVar, duration);
        ygm ygmVar = ygm.a;
        ygl yglVar = new ygl();
        yhh.b(adzhVar, yglVar);
        int millis = (int) duration.toMillis();
        if ((yglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yglVar.y();
        }
        List list = this.k;
        ygm ygmVar2 = (ygm) yglVar.b;
        ygmVar2.b |= 2;
        ygmVar2.d = millis;
        list.add(yhh.a(yglVar));
    }

    public final void e() {
        if (c()) {
            Duration durationPlus = this.d.plus(this.e);
            durationPlus.getClass();
            Duration durationPlus2 = this.n.plus(this.b).plus(this.c);
            durationPlus2.getClass();
            adzh adzhVar = adzh.LATENCY_SETUP_FIRST_SCREEN;
            if (durationPlus.compareTo(durationPlus2) < 0) {
                durationPlus = durationPlus2;
            }
            d(adzhVar, durationPlus);
        }
    }
}
