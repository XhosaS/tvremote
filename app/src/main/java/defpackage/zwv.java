package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwv {
    private final AtomicReference b = new AtomicReference(zxy.a);
    public zwu a = new zwu();

    public final zyd a(Callable callable, Executor executor) {
        executor.getClass();
        return b(new zwq(callable), executor);
    }

    public final zyd b(zvh zvhVar, Executor executor) {
        executor.getClass();
        final zwt zwtVar = new zwt(executor, this);
        zwr zwrVar = new zwr(zwtVar, zvhVar);
        final zyu zyuVar = new zyu();
        final zyd zydVar = (zyd) this.b.getAndSet(zyuVar);
        final zzc zzcVar = new zzc(zwrVar);
        zydVar.d(zzcVar, zwtVar);
        final zyd zydVarI = zxn.i(zzcVar);
        Runnable runnable = new Runnable() { // from class: zwp
            @Override // java.lang.Runnable
            public final void run() {
                zzc zzcVar2 = zzcVar;
                if (zzcVar2.isDone()) {
                    zyuVar.eZ(zydVar);
                } else if (zydVarI.isCancelled() && zwtVar.compareAndSet(zws.NOT_RUN, zws.CANCELLED)) {
                    zzcVar2.cancel(false);
                }
            }
        };
        zwk zwkVar = zwk.a;
        zydVarI.d(runnable, zwkVar);
        zzcVar.d(runnable, zwkVar);
        return zydVarI;
    }
}
