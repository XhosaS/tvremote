package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbz extends ahcw implements Runnable {
    private static volatile Thread _thread;
    public static final ahbz a;
    private static volatile int debugStatus;
    private static final long h;

    static {
        Long l;
        ahbz ahbzVar = new ahbz();
        a = ahbzVar;
        ahbzVar.n(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        h = timeUnit.toNanos(l.longValue());
    }

    private ahbz() {
    }

    private final synchronized Thread v() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void w() {
        if (y()) {
            debugStatus = 3;
            ((ahcw) this).e.c(null);
            this.f.c(null);
            notifyAll();
        }
    }

    private final void x() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final boolean y() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private final synchronized boolean z() {
        if (y()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // defpackage.ahcx
    protected final Thread e() {
        Thread thread = _thread;
        return thread == null ? v() : thread;
    }

    @Override // defpackage.ahcw, defpackage.ahcd
    public final ahcn g(long j, Runnable runnable, agte agteVar) {
        return r(j, runnable);
    }

    @Override // defpackage.ahcw
    public final void h(Runnable runnable) {
        if (debugStatus == 4) {
            x();
        }
        super.h(runnable);
    }

    @Override // defpackage.ahcx
    protected final void i(long j, ahcu ahcuVar) {
        x();
    }

    @Override // defpackage.ahcw, defpackage.ahcr
    public final void j() {
        debugStatus = 4;
        super.j();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahel ahelVar = ahel.a;
        ahel.b.set(this);
        try {
            if (z()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jK = k();
                    if (jK == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = h + jNanoTime;
                        }
                        jK = j - jNanoTime;
                        if (jK <= 0) {
                            break;
                        } else if (jK >= Long.MAX_VALUE) {
                            jK = Long.MAX_VALUE;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jK > 0) {
                        if (y()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jK);
                        }
                    }
                }
            }
            _thread = null;
            w();
            if (t()) {
                return;
            }
            e();
        } catch (Throwable th) {
            _thread = null;
            w();
            if (!t()) {
                e();
            }
            throw th;
        }
    }

    @Override // defpackage.ahbm
    public final String toString() {
        return "DefaultExecutor";
    }
}
