package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxn extends zxv {
    public static zxj a(Iterable iterable) {
        return new zxj(false, yyk.i(iterable));
    }

    @SafeVarargs
    public static zxj b(zyd... zydVarArr) {
        return new zxj(false, yyk.n(zydVarArr));
    }

    public static zxj c(Iterable iterable) {
        return new zxj(true, yyk.i(iterable));
    }

    @SafeVarargs
    public static zxj d(zyd... zydVarArr) {
        return new zxj(true, yyk.n(zydVarArr));
    }

    public static zyd e(Iterable iterable) {
        return new zwd(yyk.i(iterable), true);
    }

    public static zyd f() {
        zxw zxwVar = zxw.a;
        return zxwVar != null ? zxwVar : new zxw();
    }

    public static zyd g(Throwable th) {
        th.getClass();
        return new zxx(th);
    }

    public static zyd h(Object obj) {
        return obj == null ? zxy.a : new zxy(obj);
    }

    public static zyd i(zyd zydVar) {
        if (zydVar.isDone()) {
            return zydVar;
        }
        zxm zxmVar = new zxm(zydVar);
        zydVar.d(zxmVar, zwk.a);
        return zxmVar;
    }

    public static zyd j(Runnable runnable, Executor executor) {
        zzc zzcVarE = zzc.e(runnable, null);
        executor.execute(zzcVarE);
        return zzcVarE;
    }

    public static zyd k(Callable callable, Executor executor) {
        zzc zzcVar = new zzc(callable);
        executor.execute(zzcVar);
        return zzcVar;
    }

    public static zyd l(zvh zvhVar, Executor executor) {
        zzc zzcVar = new zzc(zvhVar);
        executor.execute(zzcVar);
        return zzcVar;
    }

    public static zyd m(Iterable iterable) {
        return new zwd(yyk.i(iterable), false);
    }

    public static zyd n(zyd zydVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zydVar.isDone()) {
            return zydVar;
        }
        zyz zyzVar = new zyz(zydVar);
        zyx zyxVar = new zyx(zyzVar);
        zyzVar.b = scheduledExecutorService.schedule(zyxVar, j, timeUnit);
        zydVar.d(zyxVar, zwk.a);
        return zyzVar;
    }

    public static Object o(Future future) {
        yqw.R(future.isDone(), "Future was expected to be done: %s", future);
        return zze.a(future);
    }

    public static void p(zyd zydVar, zxe zxeVar, Executor executor) {
        zxeVar.getClass();
        zydVar.d(new zxh(zydVar, zxeVar), executor);
    }

    public static void q(zyd zydVar, Future future) {
        if (zydVar instanceof zum) {
            ((zum) zydVar).n(future);
        } else {
            if (zydVar == null || !zydVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(zyd zydVar, Future future) {
        zydVar.getClass();
        if (future.isDone()) {
            return;
        }
        if (zydVar.isDone()) {
            q(zydVar, future);
            return;
        }
        zxi zxiVar = new zxi(zydVar, future);
        zwk zwkVar = zwk.a;
        zydVar.d(zxiVar, zwkVar);
        if (future instanceof zyd) {
            future.d(zxiVar, zwkVar);
        }
    }

    public static zyd s(zvh zvhVar, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzc zzcVar = new zzc(zvhVar);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(zzcVar, 1L, timeUnit);
        zzcVar.d(new Runnable() { // from class: zxg
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, zwk.a);
        return zzcVar;
    }
}
