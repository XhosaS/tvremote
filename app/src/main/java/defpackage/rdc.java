package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdc {
    public volatile rdh a = rdg.a;
    public volatile boolean b = true;
    public volatile rcv c;
    private final rcy d;

    public rdc(final Context context, final Executor executor, final rdg rdgVar, final aehf aehfVar, boolean z, yqt yqtVar, agow agowVar, rcy rcyVar) {
        this.d = rcyVar;
        this.c = rcyVar.b(Integer.MAX_VALUE);
        final agow agowVar2 = (!z || yqtVar.g()) ? null : agowVar;
        executor.execute(new Runnable() { // from class: rcz
            @Override // java.lang.Runnable
            public final void run() {
                final rdc rdcVar = this.a;
                final aehf aehfVar2 = aehfVar;
                Context context2 = context;
                if (mhv.h(context2)) {
                    rdcVar.a(aehfVar2);
                } else {
                    final Executor executor2 = executor;
                    mhv.d(context2, new Runnable() { // from class: rda
                        @Override // java.lang.Runnable
                        public final void run() {
                            final rdc rdcVar2 = rdcVar;
                            final aehf aehfVar3 = aehfVar2;
                            executor2.execute(new Runnable() { // from class: rdb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rdcVar2.a(aehfVar3);
                                }
                            });
                        }
                    });
                }
                if (rdcVar.b) {
                    agow agowVar3 = agowVar2;
                    rdg rdgVar2 = rdgVar;
                    if (agowVar3 == null) {
                        ahug ahugVar = ahug.a;
                        ahud ahudVar = new ahud();
                        if ((Integer.MIN_VALUE & ahudVar.b.memoizedSerializedSize) == 0) {
                            ahudVar.y();
                        }
                        ahug ahugVar2 = (ahug) ahudVar.b;
                        ahugVar2.d = 2;
                        ahugVar2.b |= 4;
                        rdcVar.a = rdgVar2.a((ahug) ahudVar.v());
                        return;
                    }
                    try {
                        rdcVar.a = rdgVar2.a((ahug) agowVar3.a());
                    } catch (Throwable th) {
                        ((zdv) ((zdv) ((zdv) qps.a.d()).p(th)).q("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", (char) 128, "Sampler.java")).u("Couldn't get sampling strategy");
                        ahug ahugVar3 = ahug.a;
                        ahud ahudVar2 = new ahud();
                        if ((ahudVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahudVar2.y();
                        }
                        ahug ahugVar4 = (ahug) ahudVar2.b;
                        ahugVar4.b = 2 | ahugVar4.b;
                        ahugVar4.c = 1L;
                        if ((ahudVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahudVar2.y();
                        }
                        ahug ahugVar5 = (ahug) ahudVar2.b;
                        ahugVar5.d = 3;
                        ahugVar5.b |= 4;
                        rdcVar.a = rdgVar2.a((ahug) ahudVar2.v());
                    }
                }
            }
        });
    }

    public final void a(aehf aehfVar) {
        try {
            qtl qtlVar = (qtl) aehfVar.a();
            this.b = qtlVar.c();
            this.c = this.d.b(qtlVar.a());
        } catch (Throwable th) {
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(th)).q("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'k', "Sampler.java")).u("Couldn't get config");
            this.b = false;
        }
    }
}
