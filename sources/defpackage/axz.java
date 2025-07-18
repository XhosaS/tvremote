package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axz extends awn implements auh, asm {
    private final asq a;
    private final crv b;

    public axz(asq asqVar, cov covVar) {
        super((byte[]) null);
        new AtomicBoolean();
        this.a = asqVar;
        this.b = new axy(covVar, 0);
    }

    @Override // defpackage.asm
    public final void i(aqe aqeVar) {
        this.a.b(this);
        axx axxVar = axx.a;
        se seVar = axxVar.b;
        se seVar2 = axxVar.c;
        ((Boolean) this.b.a()).booleanValue();
        ((cbs) aqn.a.e().j("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 297, "StartupMetricServiceImpl.java")).p("missing firstDraw timestamp");
    }

    @Override // defpackage.auh
    public final void t() {
        this.a.a(this);
    }

    @Override // defpackage.asm
    public final /* synthetic */ void j(aqe aqeVar) {
    }
}
