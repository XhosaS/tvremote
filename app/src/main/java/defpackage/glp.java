package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glp implements glk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/primes/InteractorInitializationLoggerImpl");
    private static final Duration b;
    private static final List c;
    private static final Duration d;
    private static final Duration e;
    private final aehf f;
    private final ztw g;
    private final ahbt h;
    private Instant i;
    private Instant j;
    private Instant k;
    private Instant l;
    private Instant m;
    private Instant n;
    private Instant o;
    private Instant p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final ahni t;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(60L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        List listSingletonList = Collections.singletonList(glz.f);
        listSingletonList.getClass();
        c = listSingletonList;
        Duration durationOfSeconds2 = Duration.ofSeconds(10L);
        durationOfSeconds2.getClass();
        d = durationOfSeconds2;
        Duration durationOfSeconds3 = Duration.ofSeconds(1L);
        durationOfSeconds3.getClass();
        Duration durationMultipliedBy = durationOfSeconds3.multipliedBy(-1L);
        durationMultipliedBy.getClass();
        e = durationMultipliedBy;
    }

    public glp(aehf aehfVar, ztw ztwVar, mcw mcwVar, ahbt ahbtVar) {
        aehfVar.getClass();
        ztwVar.getClass();
        mcwVar.getClass();
        ahbtVar.getClass();
        this.f = aehfVar;
        this.g = ztwVar;
        this.h = ahbtVar;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.i = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.j = instant2;
        Instant instant3 = Instant.EPOCH;
        instant3.getClass();
        this.k = instant3;
        Instant instant4 = Instant.EPOCH;
        instant4.getClass();
        this.l = instant4;
        Instant instant5 = Instant.EPOCH;
        instant5.getClass();
        this.m = instant5;
        Instant instant6 = Instant.EPOCH;
        instant6.getClass();
        this.n = instant6;
        Instant instant7 = Instant.EPOCH;
        instant7.getClass();
        this.o = instant7;
        Instant instant8 = Instant.EPOCH;
        instant8.getClass();
        this.p = instant8;
        this.t = new ahnm(false);
    }

    private final void o(glz glzVar, Instant instant, Instant instant2) {
        Duration durationA = fep.a(instant, instant2);
        boolean z = gmr.a;
        if (gmr.a && c.contains(glzVar)) {
            ((zdv) ((zdv) a.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/InteractorInitializationLoggerImpl", "recordDurationAndEnsureValid", 279, "InteractorInitializationLoggerImpl.kt")).F("Recording Katniss Initialization Event: %s (%s)", glzVar, durationA);
        }
        if (durationA.compareTo(e) < 0) {
            ((zdv) ((zdv) a.d()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/logging/primes/InteractorInitializationLoggerImpl", "recordDurationAndEnsureValid", 286, "InteractorInitializationLoggerImpl.kt")).I("Large negative duration between %s timestamp and now; start: %s, end: %s", glzVar, instant, instant2);
        } else if (durationA.compareTo(Duration.ZERO) > 0) {
            ((qpk) this.f.a()).e(glzVar.k, 0L, durationA.toMillis());
        }
    }

    private final void p() {
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.i = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.j = instant2;
        Instant instant3 = Instant.EPOCH;
        instant3.getClass();
        this.k = instant3;
        Instant instant4 = Instant.EPOCH;
        instant4.getClass();
        this.l = instant4;
        Instant instant5 = Instant.EPOCH;
        instant5.getClass();
        this.m = instant5;
        Instant instant6 = Instant.EPOCH;
        instant6.getClass();
        this.n = instant6;
        Instant instant7 = Instant.EPOCH;
        instant7.getClass();
        this.o = instant7;
        Instant instant8 = Instant.EPOCH;
        instant8.getClass();
        this.p = instant8;
        this.r = false;
    }

    @Override // defpackage.glk
    public final void a() {
        p();
        Instant instant = gmw.a.c;
        instant.getClass();
        this.i = instant;
        if (agvy.c(instant, Instant.EPOCH)) {
            Instant instantA = this.g.a();
            instantA.getClass();
            this.i = instantA;
        }
        this.r = SystemClock.elapsedRealtime() < b.toMillis();
    }

    @Override // defpackage.glk
    public final void b() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.o = instantA;
        ahal.e(this.h, null, 0, new gll(this, null), 3);
    }

    @Override // defpackage.glk
    public final void c() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.j = instantA;
        if (fep.a(this.i, instantA).compareTo(d) > 0) {
            this.s = true;
        }
    }

    @Override // defpackage.glk
    public final void d() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.n = instantA;
    }

    @Override // defpackage.glk
    public final void e() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.p = instantA;
        ahal.e(this.h, null, 0, new glm(this, null), 3);
    }

    @Override // defpackage.glk
    public final void f() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.m = instantA;
    }

    @Override // defpackage.glk
    public final void g() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.l = instantA;
    }

    @Override // defpackage.glk
    public final void h() {
        Instant instantA = this.g.a();
        instantA.getClass();
        this.k = instantA;
    }

    @Override // defpackage.glk
    public final boolean i() {
        return this.r;
    }

    @Override // defpackage.glk
    public final boolean j() {
        return this.s;
    }

    @Override // defpackage.glk
    public final void k() {
        this.s = true;
    }

    public final Object l(agsw agswVar) {
        if (!agvy.c(this.o, Instant.EPOCH) && !agvy.c(this.p, Instant.EPOCH)) {
            Instant instant = this.p.compareTo(this.o) > 0 ? this.p : this.o;
            if (agvy.c(this.i, Instant.EPOCH) || !agvy.c(this.k, Instant.EPOCH) || !agvy.c(this.l, Instant.EPOCH) || !agvy.c(this.m, Instant.EPOCH) || agvy.c(this.n, Instant.EPOCH) || agvy.c(this.p, Instant.EPOCH)) {
                Object objM = m(instant, agswVar);
                if (objM == agtg.a) {
                    return objM;
                }
            } else {
                Object objN = n(instant, agswVar);
                if (objN == agtg.a) {
                    return objN;
                }
            }
        }
        return agpu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(j$.time.Instant r5, defpackage.agsw r6) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glp.m(j$.time.Instant, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(j$.time.Instant r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.glo
            if (r0 == 0) goto L13
            r0 = r6
            glo r0 = (defpackage.glo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            glo r0 = new glo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            j$.time.Instant r0 = r0.e
            defpackage.agpl.b(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.agpl.b(r6)
            ahni r6 = r4.t
            r0.e = r5
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L8d
        L46:
            boolean r0 = r4.q     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L50
            r4.p()     // Catch: java.lang.Throwable -> L88
            agpu r5 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L88
            goto L84
        L50:
            glz r0 = defpackage.glz.h     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r1 = r4.i     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r2 = r4.j     // Catch: java.lang.Throwable -> L88
            r4.o(r0, r1, r2)     // Catch: java.lang.Throwable -> L88
            glz r0 = defpackage.glz.i     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r1 = r4.j     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r2 = r4.o     // Catch: java.lang.Throwable -> L88
            r4.o(r0, r1, r2)     // Catch: java.lang.Throwable -> L88
            glz r0 = defpackage.glz.j     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r1 = r4.n     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r2 = r4.p     // Catch: java.lang.Throwable -> L88
            r4.o(r0, r1, r2)     // Catch: java.lang.Throwable -> L88
            glz r0 = defpackage.glz.f     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r1 = r4.i     // Catch: java.lang.Throwable -> L88
            r4.o(r0, r1, r5)     // Catch: java.lang.Throwable -> L88
            boolean r0 = r4.r     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L80
            glz r0 = defpackage.glz.g     // Catch: java.lang.Throwable -> L88
            j$.time.Instant r1 = r4.i     // Catch: java.lang.Throwable -> L88
            r4.o(r0, r1, r5)     // Catch: java.lang.Throwable -> L88
            r5 = 0
            r4.r = r5     // Catch: java.lang.Throwable -> L88
        L80:
            r4.q = r3     // Catch: java.lang.Throwable -> L88
            agpu r5 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L88
        L84:
            r6.d()
            return r5
        L88:
            r5 = move-exception
            r6.d()
            throw r5
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glp.n(j$.time.Instant, agsw):java.lang.Object");
    }
}
