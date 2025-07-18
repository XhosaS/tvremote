package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geq {
    public static final Duration a;
    public static final Duration b;
    public static final Duration c;
    public static final Duration d;
    private static final Map j = agrj.d(new agpi(gmc.aa, gmb.a), new agpi(gmc.H, gmb.b));
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final CopyOnWriteArraySet h;
    public final CopyOnWriteArraySet i;
    private final ahbt k;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(60L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
        Duration durationOfSeconds2 = Duration.ofSeconds(60L);
        durationOfSeconds2.getClass();
        b = durationOfSeconds2;
        Duration durationOfSeconds3 = Duration.ofSeconds(60L);
        durationOfSeconds3.getClass();
        c = durationOfSeconds3;
        Duration durationOfSeconds4 = Duration.ofSeconds(300L);
        durationOfSeconds4.getClass();
        d = durationOfSeconds4;
    }

    public geq(mcw mcwVar, ahbt ahbtVar) {
        mcwVar.getClass();
        ahbtVar.getClass();
        this.k = ahbtVar;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new CopyOnWriteArraySet();
        this.i = new CopyOnWriteArraySet();
    }

    public final void a(Duration duration, agum agumVar) {
        ahal.e(this.k, null, 0, new gep(duration, agumVar, null), 3);
    }

    public final boolean b() {
        return SystemClock.elapsedRealtime() < 240000;
    }

    public final int c(gmc gmcVar) {
        gmcVar.getClass();
        Map map = j;
        if (!map.containsKey(gmcVar)) {
            return 1;
        }
        if (b()) {
            return 2;
        }
        if (this.e.get()) {
            return 3;
        }
        if (this.f.get() && gmcVar == gmc.aa) {
            return 4;
        }
        if (this.g.get() && gmcVar == gmc.H) {
            return 4;
        }
        gmb gmbVar = (gmb) map.get(gmcVar);
        return (!agqq.D(this.h, gmbVar) && agqq.D(this.i, gmbVar)) ? 6 : 5;
    }
}
