package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agoh {
    static volatile aggy a;
    public static volatile aggz b;
    public static volatile aggz c;
    public static volatile aggz d;
    public static volatile aggz e;
    public static volatile aggz f;
    public static volatile aggz g;
    public static volatile aggz h;
    public static volatile aggz i;
    public static volatile aggz j;
    public static volatile aggz k;
    public static volatile aggz l;
    public static volatile aggz m;
    public static volatile aggz n;
    public static volatile boolean o;
    public static volatile boolean p;
    public static volatile mop q;
    public static volatile mop r;
    public static volatile mop s;
    public static volatile mop t;

    public static agfx a(aggz aggzVar, Callable callable) {
        agfx agfxVar = (agfx) c(aggzVar, callable);
        aghn.b(agfxVar, "Scheduler Callable result can't be null");
        return agfxVar;
    }

    public static agfx b(Callable callable) {
        try {
            agfx agfxVar = (agfx) callable.call();
            aghn.b(agfxVar, "Scheduler Callable result can't be null");
            return agfxVar;
        } catch (Throwable th) {
            throw agnx.a(th);
        }
    }

    static Object c(aggz aggzVar, Object obj) {
        try {
            return aggzVar.a(obj);
        } catch (Throwable th) {
            throw agnx.a(th);
        }
    }

    public static Runnable d(Runnable runnable) {
        aghn.b(runnable, "run is null");
        aggz aggzVar = b;
        return aggzVar == null ? runnable : (Runnable) c(aggzVar, runnable);
    }

    public static void e(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof aggs) && !(th instanceof aggr) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof aggp)) {
            th = new aggu(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
