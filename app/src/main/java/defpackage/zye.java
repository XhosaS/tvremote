package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zye extends FutureTask implements zyd {
    public final zwo a;

    public zye(Runnable runnable) {
        super(runnable, null);
        this.a = new zwo();
    }

    @Override // defpackage.zyd
    public final void d(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        zwo zwoVar = this.a;
        synchronized (zwoVar) {
            if (zwoVar.b) {
                return;
            }
            zwoVar.b = true;
            zwn zwnVar = zwoVar.a;
            zwn zwnVar2 = null;
            zwoVar.a = null;
            while (zwnVar != null) {
                zwn zwnVar3 = zwnVar.c;
                zwnVar.c = zwnVar2;
                zwnVar2 = zwnVar;
                zwnVar = zwnVar3;
            }
            while (zwnVar2 != null) {
                zwo.b(zwnVar2.a, zwnVar2.b);
                zwnVar2 = zwnVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public zye(Callable callable) {
        super(callable);
        this.a = new zwo();
    }
}
