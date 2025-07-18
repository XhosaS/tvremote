package defpackage;

import java.lang.Thread;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bdz implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bdz(Object obj, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.c = i;
        this.b = obj;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.c == 0) {
            ((bea) this.b).b(this.a, thread, th);
            return;
        }
        Object obj = this.b;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        try {
            try {
                adx adxVarB = bwq.b(th);
                if (adxVarB != null) {
                    Object obj2 = adxVarB.a;
                    avy avyVarA = avy.a(((bxn) obj2).b);
                    if (avyVarA != null && ((avx) avyVarA.a.get()) != null && !avyVarA.b.get()) {
                        UUID uuid = ((bxn) obj2).c;
                        long mostSignificantBits = (uuid.getMostSignificantBits() ^ uuid.getLeastSignificantBits()) & Long.MAX_VALUE;
                        if (mostSignificantBits == 0) {
                            mostSignificantBits = 1;
                        }
                        long j = ((bxn) obj2).d;
                        bit.i(true);
                        clo cloVarO = cwu.a.o();
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        clt cltVar = cloVarO.b;
                        cwu cwuVar = (cwu) cltVar;
                        cwuVar.b |= 4;
                        cwuVar.e = mostSignificantBits;
                        if (!cltVar.A()) {
                            cloVarO.l();
                        }
                        cwu cwuVar2 = (cwu) cloVarO.b;
                        cwuVar2.b |= 1;
                        cwuVar2.c = 0;
                        clf clfVarA = col.a(0L, (int) ((j % 1000) * 1000000));
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        clt cltVar2 = cloVarO.b;
                        cwu cwuVar3 = (cwu) cltVar2;
                        clfVarA.getClass();
                        cwuVar3.d = clfVarA;
                        cwuVar3.b |= 2;
                        if (!cltVar2.A()) {
                            cloVarO.l();
                        }
                        cwu cwuVar4 = (cwu) cloVarO.b;
                        cwuVar4.f = 2;
                        cwuVar4.b |= 8;
                        cwu cwuVar5 = (cwu) cloVarO.i();
                        aue aueVar = ((avz) obj).a;
                        aua auaVarA = aub.a();
                        auaVarA.d(true);
                        clo cloVarO2 = cym.a.o();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        cym cymVar = (cym) cloVarO2.b;
                        cwuVar5.getClass();
                        cymVar.n = cwuVar5;
                        cymVar.b |= 1048576;
                        auaVarA.f((cym) cloVarO2.i());
                        auaVarA.b = null;
                        aueVar.a(auaVarA.a());
                    }
                }
            } catch (Exception e) {
                ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", 104, "CuiMetricServiceImpl.java")).p("Failed to end CUI.");
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
