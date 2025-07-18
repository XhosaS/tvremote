package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azf {
    public volatile azj a = azi.a;
    public volatile boolean b = true;
    public volatile aza c;
    private final cip d;

    public azf(final Context context, final Executor executor, final azi aziVar, final cov covVar, byg bygVar, crv crvVar, cip cipVar) {
        this.d = cipVar;
        this.c = cipVar.c(Integer.MAX_VALUE);
        final crv crvVar2 = true == bygVar.f() ? null : crvVar;
        b(new Runnable() { // from class: azd
            @Override // java.lang.Runnable
            public final void run() {
                azf azfVar = this.a;
                cov covVar2 = covVar;
                Context context2 = context;
                if (apr.g(context2)) {
                    azfVar.a(covVar2);
                } else {
                    apr.c(context2, new aze(azfVar, covVar2, executor, 0));
                }
                if (azfVar.b) {
                    crv crvVar3 = crvVar2;
                    azi aziVar2 = aziVar;
                    if (crvVar3 == null) {
                        clo cloVarO = cxs.a.o();
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        cxs cxsVar = (cxs) cloVarO.b;
                        cxsVar.d = 2;
                        cxsVar.b |= 4;
                        azfVar.a = aziVar2.a((cxs) cloVarO.i());
                        return;
                    }
                    try {
                        azfVar.a = aziVar2.a((cxs) crvVar3.a());
                    } catch (Throwable th) {
                        ((cbs) ((cbs) aqn.a.g().i(th)).j("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", 128, "Sampler.java")).p("Couldn't get sampling strategy");
                        clo cloVarO2 = cxs.a.o();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        clt cltVar = cloVarO2.b;
                        cxs cxsVar2 = (cxs) cltVar;
                        cxsVar2.b = 2 | cxsVar2.b;
                        cxsVar2.c = 1L;
                        if (!cltVar.A()) {
                            cloVarO2.l();
                        }
                        cxs cxsVar3 = (cxs) cloVarO2.b;
                        cxsVar3.d = 3;
                        cxsVar3.b |= 4;
                        azfVar.a = aziVar2.a((cxs) cloVarO2.i());
                    }
                }
            }
        }, executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(cov covVar) {
        try {
            atd atdVar = (atd) covVar.a();
            this.b = atdVar.b();
            this.c = this.d.c(atdVar.a());
        } catch (Throwable th) {
            ((cbs) ((cbs) aqn.a.g().i(th)).j("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 107, "Sampler.java")).p("Couldn't get config");
            this.b = false;
        }
    }
}
