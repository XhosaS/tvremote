package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjb extends FutureTask implements cja {
    private final cib a;

    public cjb(Callable callable) {
        super(callable);
        this.a = new cib();
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        cib cibVar = this.a;
        synchronized (cibVar) {
            if (cibVar.b) {
                return;
            }
            cibVar.b = true;
            cia ciaVar = cibVar.a;
            cia ciaVar2 = null;
            cibVar.a = null;
            while (ciaVar != null) {
                cia ciaVar3 = ciaVar.c;
                ciaVar.c = ciaVar2;
                ciaVar2 = ciaVar;
                ciaVar = ciaVar3;
            }
            while (ciaVar2 != null) {
                cib.a(ciaVar2.a, ciaVar2.b);
                ciaVar2 = ciaVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.cja
    public final void m(Runnable runnable, Executor executor) {
        executor.getClass();
        cib cibVar = this.a;
        synchronized (cibVar) {
            if (cibVar.b) {
                cib.a(runnable, executor);
            } else {
                cibVar.a = new cia(runnable, executor, cibVar.a);
            }
        }
    }
}
