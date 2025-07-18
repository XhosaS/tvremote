package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glt implements glq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl");
    private static final Map i = agrj.d(new agpi(gma.a, gma.j), new agpi(gma.b, gma.k), new agpi(gma.c, gma.l), new agpi(gma.d, gma.m), new agpi(gma.e, gma.n), new agpi(gma.f, gma.o), new agpi(gma.g, gma.p), new agpi(gma.h, gma.q), new agpi(gma.i, gma.r));
    public final fmg b;
    public final ztw c;
    public Instant d;
    public Instant e;
    public Instant f;
    public Instant g;
    public Instant h;
    private final ahbt j;
    private final agow k;

    public glt(ahbt ahbtVar, agow agowVar, fmg fmgVar, ztw ztwVar) {
        ahbtVar.getClass();
        agowVar.getClass();
        ztwVar.getClass();
        this.j = ahbtVar;
        this.k = agowVar;
        this.b = fmgVar;
        this.c = ztwVar;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.d = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.e = instant2;
        Instant instant3 = Instant.EPOCH;
        instant3.getClass();
        this.f = instant3;
        Instant instant4 = Instant.EPOCH;
        instant4.getClass();
        this.g = instant4;
        Instant instant5 = Instant.EPOCH;
        instant5.getClass();
        this.h = instant5;
    }

    private final void a() {
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.d = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.e = instant2;
        Instant instant3 = Instant.EPOCH;
        instant3.getClass();
        this.f = instant3;
        Instant instant4 = Instant.EPOCH;
        instant4.getClass();
        this.g = instant4;
        Instant instant5 = Instant.EPOCH;
        instant5.getClass();
        this.h = instant5;
    }

    @Override // defpackage.glq
    public final void t() {
        Instant instantA = this.c.a();
        instantA.getClass();
        this.e = instantA;
    }

    @Override // defpackage.glq
    public final void u() {
        Instant instantA = this.c.a();
        instantA.getClass();
        this.f = instantA;
    }

    @Override // defpackage.glq
    public final void v() {
        Instant instantA = this.c.a();
        instantA.getClass();
        this.g = instantA;
    }

    @Override // defpackage.glq
    public final void w(gma gmaVar) {
        gmaVar.getClass();
        if (!gms.b(this.d, this.e, this.f, this.g, this.h)) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl", "recordE2ELatencyMeasure", 101, "KatnissE2ELatencyLoggerImpl.kt")).x("Invalid E2E timestamps! Skipping logging events %s!", gmaVar.name());
            a();
            return;
        }
        Duration durationA = fep.a(this.e, this.f);
        Instant instant = this.d;
        Instant instantMinus = this.h.minus(durationA);
        instantMinus.getClass();
        Duration durationA2 = fep.a(instant, instantMinus);
        qpi qpiVar = gmaVar.s;
        durationA2.toMillis();
        ahbt ahbtVar = this.j;
        ahal.e(ahbtVar, null, 0, new gls(this, gmaVar, durationA2, null), 3);
        agow agowVar = this.k;
        ((qpk) agowVar.a()).e(qpiVar, this.d.toEpochMilli(), this.d.plus(durationA2).toEpochMilli());
        gma gmaVar2 = (gma) i.get(gmaVar);
        if (gmaVar2 != null) {
            Duration durationA3 = fep.a(this.e, this.g);
            Instant instant2 = this.d;
            Instant instantMinus2 = this.h.minus(durationA3);
            instantMinus2.getClass();
            Duration durationA4 = fep.a(instant2, instantMinus2);
            durationA4.toMillis();
            ahal.e(ahbtVar, null, 0, new glr(this, gmaVar2, durationA4, null), 3);
            ((qpk) agowVar.a()).e(gmaVar2.s, this.d.toEpochMilli(), this.d.plus(durationA4).toEpochMilli());
        }
    }

    @Override // defpackage.glq
    public final void x() {
        a();
        Instant instantA = this.c.a();
        instantA.getClass();
        this.d = instantA;
    }

    @Override // defpackage.glq
    public final void y(gma gmaVar) {
        gmaVar.getClass();
        Instant instantA = this.c.a();
        instantA.getClass();
        z(instantA, gmaVar);
    }

    @Override // defpackage.glq
    public final void z(Instant instant, gma gmaVar) {
        gmaVar.getClass();
        this.h = instant;
        w(gmaVar);
    }
}
