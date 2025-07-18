package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhq extends FutureTask implements uhp {
    private final ugo a;

    public uhq(Runnable runnable) {
        super(runnable, null);
        this.a = new ugo();
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        ugo ugoVar = this.a;
        synchronized (ugoVar) {
            if (ugoVar.b) {
                ugo.a(runnable, executor);
            } else {
                ugoVar.a = new ugn(runnable, executor, ugoVar.a);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        ugo ugoVar = this.a;
        synchronized (ugoVar) {
            if (ugoVar.b) {
                return;
            }
            ugoVar.b = true;
            ugn ugnVar = ugoVar.a;
            ugn ugnVar2 = null;
            ugoVar.a = null;
            while (ugnVar != null) {
                ugn ugnVar3 = ugnVar.c;
                ugnVar.c = ugnVar2;
                ugnVar2 = ugnVar;
                ugnVar = ugnVar3;
            }
            while (ugnVar2 != null) {
                ugo.a(ugnVar2.a, ugnVar2.b);
                ugnVar2 = ugnVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public uhq(Callable callable) {
        super(callable);
        this.a = new ugo();
    }
}
