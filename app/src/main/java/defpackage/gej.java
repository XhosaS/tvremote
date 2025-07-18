package defpackage;

import android.os.Build;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gej implements gmd {
    public static final Set b;
    private static final boolean d;
    private final geq e;
    private final gph f;
    private final gzu g;
    private final qpk h;
    private final Random i;
    private volatile String j;
    private volatile int k;
    private final AtomicBoolean l;
    private final ConcurrentMap m;
    public static final gei a = new gei();
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/logging/EventLoggerImpl");

    static {
        d = udy.b("KatnissTraceEvents") && Build.VERSION.SDK_INT >= 29;
        b = agqj.p(new gmc[]{gmc.aa, gmc.f, gmc.E, gmc.G, gmc.J, gmc.av, gmc.aw, gmc.X, gmc.a});
    }

    public gej(mcw mcwVar, geq geqVar, gph gphVar, gzu gzuVar, qpk qpkVar, Random random) {
        mcwVar.getClass();
        geqVar.getClass();
        gzuVar.getClass();
        qpkVar.getClass();
        this.e = geqVar;
        this.f = gphVar;
        this.g = gzuVar;
        this.h = qpkVar;
        this.i = random;
        this.j = "";
        this.k = -1;
        this.l = new AtomicBoolean(true);
        this.m = new ConcurrentHashMap();
    }

    private final boolean t(int i, gmc gmcVar) {
        Integer num = (Integer) this.m.get(gmcVar);
        return num != null && num.intValue() == i;
    }

    @Override // defpackage.gmd
    public final void a(gmc gmcVar) {
        gmcVar.getClass();
        gei geiVar = a;
        boolean zC = geiVar.c(gmcVar);
        qpi qpiVar = gmcVar.aD;
        if (zC) {
            ((zdv) ((zdv) c.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/EventLoggerImpl", "cancel", 114, "EventLoggerImpl.kt")).x("Cancel: %s", qpiVar);
        }
        if (d) {
            geiVar.b(qpiVar);
        }
        this.h.c(qpiVar);
    }

    @Override // defpackage.gmd
    public final void b(gmc gmcVar) {
        gmcVar.getClass();
        gei geiVar = a;
        boolean zC = geiVar.c(gmcVar);
        qpi qpiVar = gmcVar.aD;
        if (zC) {
            ((zdv) ((zdv) c.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/EventLoggerImpl", "cancelAndRestart", 127, "EventLoggerImpl.kt")).x("Cancel and Restart: %s", qpiVar);
        }
        if (d) {
            geiVar.b(qpiVar);
            geiVar.a(qpiVar);
        }
        qpk qpkVar = this.h;
        qpkVar.c(qpiVar);
        this.m.put(gmcVar, Integer.valueOf(this.k));
        qpkVar.g(qpiVar);
    }

    @Override // defpackage.gmd
    public final void c() {
        this.j = "";
    }

    @Override // defpackage.gmd
    public final void d() {
        if (this.l.compareAndSet(true, false)) {
            this.k = this.i.nextInt(Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.gmd
    public final void e(final gmb gmbVar) {
        gmbVar.getClass();
        final geq geqVar = this.e;
        geqVar.i.add(gmbVar);
        geqVar.a(geq.b, new agum() { // from class: geo
            @Override // defpackage.agum
            public final Object a() {
                geqVar.i.remove(gmbVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gmd
    public final void f(final gmb gmbVar) {
        gmbVar.getClass();
        final geq geqVar = this.e;
        geqVar.h.add(gmbVar);
        geqVar.a(geq.c, new agum() { // from class: gek
            @Override // defpackage.agum
            public final Object a() {
                geqVar.h.remove(gmbVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gmd
    public final void g() {
        final geq geqVar = this.e;
        geqVar.e.compareAndSet(false, true);
        geqVar.a(geq.d, new agum() { // from class: gem
            @Override // defpackage.agum
            public final Object a() {
                geqVar.e.compareAndSet(true, false);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gmd
    public final void h() {
        final geq geqVar = this.e;
        geqVar.f.compareAndSet(false, true);
        geqVar.a(geq.a, new agum() { // from class: gen
            @Override // defpackage.agum
            public final Object a() {
                geqVar.f.compareAndSet(true, false);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gmd
    public final void i() {
        final geq geqVar = this.e;
        geqVar.g.compareAndSet(false, true);
        geqVar.a(geq.a, new agum() { // from class: gel
            @Override // defpackage.agum
            public final Object a() {
                geqVar.g.compareAndSet(true, false);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gmd
    public final void j(long j) {
        gei geiVar = a;
        int i = this.k;
        String str = this.j;
        geq geqVar = this.e;
        gmc gmcVar = gmc.ac;
        ahqu ahquVarD = geiVar.d(i, str, this.f, this.g, geqVar.c(gmcVar));
        this.h.a.c(gmcVar.aD, j, SystemClock.elapsedRealtime(), ahquVarD);
    }

    @Override // defpackage.gmd
    public final void k(String str) {
        str.getClass();
        this.j = str;
    }

    @Override // defpackage.gmd
    public final void l(gmc gmcVar) {
        gmcVar.getClass();
        gei geiVar = a;
        boolean zC = geiVar.c(gmcVar);
        qpi qpiVar = gmcVar.aD;
        if (zC) {
            ((zdv) ((zdv) c.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/EventLoggerImpl", "start", 91, "EventLoggerImpl.kt")).x("Start: %s", qpiVar);
        }
        if (d) {
            geiVar.a(qpiVar);
        }
        this.m.put(gmcVar, Integer.valueOf(this.k));
        this.h.g(qpiVar);
    }

    @Override // defpackage.gmd
    public final void m(gmc gmcVar) {
        gmcVar.getClass();
        o(gmcVar, this.k, this.j);
    }

    @Override // defpackage.gmd
    public final void n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m((gmc) it.next());
        }
    }

    @Override // defpackage.gmd
    public final void o(gmc gmcVar, int i, String str) {
        gmcVar.getClass();
        str.getClass();
        q(gmcVar, gmcVar, i, str);
    }

    @Override // defpackage.gmd
    public final void p(gmc gmcVar, gmc gmcVar2) {
        gmcVar.getClass();
        gmcVar2.getClass();
        q(gmcVar, gmcVar2, this.k, this.j);
    }

    @Override // defpackage.gmd
    public final void q(gmc gmcVar, gmc gmcVar2, int i, String str) {
        gmcVar.getClass();
        gmcVar2.getClass();
        str.getClass();
        gph gphVar = this.f;
        gzu gzuVar = this.g;
        gei geiVar = a;
        ahqu ahquVarD = geiVar.d(i, str, gphVar, gzuVar, this.e.c(gmcVar2));
        boolean zC = geiVar.c(gmcVar);
        qpi qpiVar = gmcVar.aD;
        qpi qpiVar2 = gmcVar2.aD;
        if (zC) {
            ((zdv) ((zdv) c.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/EventLoggerImpl", "stopAndOverwriteWith", 226, "EventLoggerImpl.kt")).J("Stop : %s -> %s, clientQueryId: %d, parentEventId: %s", qpiVar, qpiVar2, Integer.valueOf(i), str);
        }
        if (d) {
            geiVar.b(qpiVar);
        }
        if (t(i, gmcVar)) {
            this.h.a.g(qpiVar, qpiVar2, ahquVarD, rbl.UNKNOWN);
        } else {
            this.h.c(qpiVar);
        }
        this.m.remove(gmcVar);
    }

    @Override // defpackage.gmd
    public final void r(gmc gmcVar, rbl rblVar) {
        rbl rblVar2;
        gmcVar.getClass();
        rblVar.getClass();
        int i = this.k;
        String str = this.j;
        str.getClass();
        gph gphVar = this.f;
        gzu gzuVar = this.g;
        gei geiVar = a;
        ahqu ahquVarD = geiVar.d(i, str, gphVar, gzuVar, this.e.c(gmcVar));
        boolean zC = geiVar.c(gmcVar);
        qpi qpiVar = gmcVar.aD;
        if (zC) {
            rblVar2 = rblVar;
            ((zdv) ((zdv) c.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/EventLoggerImpl", "stopWithStatus", 167, "EventLoggerImpl.kt")).J("Stop: %s (%s), clientQueryId %d, parentEventId: %s", qpiVar, rblVar2, Integer.valueOf(i), str);
        } else {
            rblVar2 = rblVar;
        }
        if (d) {
            geiVar.b(qpiVar);
        }
        if (t(i, gmcVar)) {
            this.h.i(qpiVar, qpiVar, ahquVarD, rblVar2);
        } else {
            this.h.c(qpiVar);
        }
        this.m.remove(gmcVar);
    }

    @Override // defpackage.gmd
    public final void s() {
        this.l.set(true);
    }
}
