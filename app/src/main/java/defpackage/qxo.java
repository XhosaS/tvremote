package defpackage;

import java.lang.Thread;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxo extends qxm implements quz {
    public final qux a;

    static {
        new LinkedHashSet();
    }

    public qxo(quy quyVar, aehf aehfVar, Executor executor) {
        new ArrayDeque();
        this.a = quyVar.a(executor, aehfVar, null);
    }

    @Override // defpackage.quz
    public final void k() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: qxn
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                qxo qxoVar = this.a;
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                try {
                    try {
                        wzf wzfVarA = wub.a(th);
                        if (wzfVarA != null) {
                            wxm wxmVar = wzfVarA.a;
                            qxl qxlVarA = qxl.a(wxmVar.b());
                            if (qxlVarA != null && ((qxk) qxlVarA.b.get()) != null && qxlVarA.c.get() == null) {
                                UUID uuidD = wxmVar.d();
                                long mostSignificantBits = (uuidD.getMostSignificantBits() ^ uuidD.getLeastSignificantBits()) & Long.MAX_VALUE;
                                if (mostSignificantBits == 0) {
                                    mostSignificantBits = 1;
                                }
                                Long lValueOf = Long.valueOf(mostSignificantBits);
                                long jA = wxmVar.a();
                                abwf abwfVarD = acbg.d(jA / 1000, (int) ((jA % 1000) * 1000000));
                                ahqm ahqmVar = ahqm.a;
                                ahqk ahqkVar = new ahqk();
                                if ((ahqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahqkVar.y();
                                }
                                ahqm ahqmVar2 = (ahqm) ahqkVar.b;
                                ahqmVar2.b |= 1;
                                ahqmVar2.c = 0;
                                if ((ahqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahqkVar.y();
                                }
                                ahqm ahqmVar3 = (ahqm) ahqkVar.b;
                                ahqmVar3.f = 2;
                                ahqmVar3.b |= 8;
                                lValueOf.getClass();
                                if ((ahqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahqkVar.y();
                                }
                                ahqm ahqmVar4 = (ahqm) ahqkVar.b;
                                ahqmVar4.b |= 4;
                                ahqmVar4.e = mostSignificantBits;
                                if (abwfVarD != null) {
                                    if ((ahqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        ahqkVar.y();
                                    }
                                    ahqm ahqmVar5 = (ahqm) ahqkVar.b;
                                    ahqmVar5.d = abwfVarD;
                                    ahqmVar5.b |= 2;
                                }
                                ahqm ahqmVar6 = (ahqm) ahqkVar.v();
                                qux quxVar = qxoVar.a;
                                qup qupVarN = quq.n();
                                qupVarN.d(true);
                                ahvw ahvwVar = ahvw.a;
                                ahvv ahvvVar = new ahvv();
                                if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahvvVar.y();
                                }
                                ahvw ahvwVar2 = (ahvw) ahvvVar.b;
                                ahqmVar6.getClass();
                                ahvwVar2.o = ahqmVar6;
                                ahvwVar2.b |= 1048576;
                                qupVarN.f((ahvw) ahvvVar.v());
                                ((quh) qupVarN).c = null;
                                quxVar.b(qupVarN.a());
                            }
                        }
                    } catch (Exception e) {
                        ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", 121, "CuiMetricServiceImpl.java")).u("Failed to end CUI.");
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
        });
    }
}
