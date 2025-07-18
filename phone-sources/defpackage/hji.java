package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hji implements uhp {
    static final hiz b;
    public static final /* synthetic */ int f = 0;
    private static final Object h;
    volatile Object c;
    volatile hjd d;
    volatile hjh e;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger g = Logger.getLogger(hji.class.getName());

    static {
        hiz hjgVar;
        try {
            hjgVar = new hje(AtomicReferenceFieldUpdater.newUpdater(hjh.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(hjh.class, hjh.class, "c"), AtomicReferenceFieldUpdater.newUpdater(hji.class, hjh.class, "e"), AtomicReferenceFieldUpdater.newUpdater(hji.class, hjd.class, "d"), AtomicReferenceFieldUpdater.newUpdater(hji.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hjgVar = new hjg();
        }
        Throwable th2 = th;
        b = hjgVar;
        if (th2 != null) {
            g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    protected hji() {
    }

    static void b(hji hjiVar) {
        hjh hjhVar;
        hiz hizVar;
        hjd hjdVar;
        do {
            hjhVar = hjiVar.e;
            hizVar = b;
        } while (!hizVar.e(hjiVar, hjhVar, hjh.a));
        while (hjhVar != null) {
            Thread thread = hjhVar.b;
            if (thread != null) {
                hjhVar.b = null;
                LockSupport.unpark(thread);
            }
            hjhVar = hjhVar.c;
        }
        do {
            hjdVar = hjiVar.d;
        } while (!hizVar.c(hjiVar, hjdVar, hjd.a));
        hjd hjdVar2 = null;
        while (hjdVar != null) {
            hjd hjdVar3 = hjdVar.d;
            hjdVar.d = hjdVar2;
            hjdVar2 = hjdVar;
            hjdVar = hjdVar3;
        }
        while (hjdVar2 != null) {
            Runnable runnable = hjdVar2.b;
            hjd hjdVar4 = hjdVar2.d;
            if (runnable instanceof hjf) {
                hji hjiVar2 = ((hjf) runnable).a;
                throw null;
            }
            g(runnable, hjdVar2.c);
            hjdVar2 = hjdVar4;
        }
    }

    private final String e(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void f(StringBuilder sb) {
        try {
            Object objG = a.G(this);
            sb.append("SUCCESS, result=[");
            sb.append(e(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", a.cA(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }

    private final void h(hjh hjhVar) {
        hjhVar.b = null;
        while (true) {
            hjh hjhVar2 = this.e;
            if (hjhVar2 != hjh.a) {
                hjh hjhVar3 = null;
                while (hjhVar2 != null) {
                    hjh hjhVar4 = hjhVar2.c;
                    if (hjhVar2.b != null) {
                        hjhVar3 = hjhVar2;
                    } else if (hjhVar3 != null) {
                        hjhVar3.c = hjhVar4;
                        if (hjhVar3.b == null) {
                            break;
                        }
                    } else if (!b.e(this, hjhVar2, hjhVar4)) {
                        break;
                    }
                    hjhVar2 = hjhVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object i(Object obj) throws ExecutionException {
        if (obj instanceof hja) {
            Throwable th = ((hja) obj).c;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof hjc) {
            throw new ExecutionException(((hjc) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        Object obj = this.c;
        if (obj instanceof hjf) {
            uhp uhpVar = ((hjf) obj).b;
            return "setFuture=[" + e(null) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        hjd hjdVar = this.d;
        hjd hjdVar2 = hjd.a;
        if (hjdVar != hjdVar2) {
            hjd hjdVar3 = new hjd(runnable, executor);
            do {
                hjdVar3.d = hjdVar;
                if (b.c(this, hjdVar, hjdVar3)) {
                    return;
                } else {
                    hjdVar = this.d;
                }
            } while (hjdVar != hjdVar2);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.c;
        if ((obj instanceof hjf) | (obj == null)) {
            hja hjaVar = a ? new hja(new CancellationException("Future.cancel() was called.")) : z ? hja.a : hja.b;
            while (!b.d(this, obj, hjaVar)) {
                obj = this.c;
                if (!(obj instanceof hjf)) {
                }
            }
            b(this);
            if (!(obj instanceof hjf)) {
                return true;
            }
            uhp uhpVar = ((hjf) obj).b;
            throw null;
        }
        return false;
    }

    protected boolean d(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.c;
        if ((obj2 != null) && (!(obj2 instanceof hjf))) {
            return i(obj2);
        }
        hjh hjhVar = this.e;
        hjh hjhVar2 = hjh.a;
        if (hjhVar != hjhVar2) {
            hjh hjhVar3 = new hjh();
            do {
                hjhVar3.a(hjhVar);
                if (b.e(this, hjhVar, hjhVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(hjhVar3);
                            throw new InterruptedException();
                        }
                        obj = this.c;
                    } while (!((obj != null) & (!(obj instanceof hjf))));
                    return i(obj);
                }
                hjhVar = this.e;
            } while (hjhVar != hjhVar2);
        }
        return i(this.c);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof hja;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.c != null) & (!(r0 instanceof hjf));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e.getClass())));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                f(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.c;
            boolean z2 = true;
            if ((obj != null) & (!(obj instanceof hjf))) {
                return i(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                hjh hjhVar = this.e;
                hjh hjhVar2 = hjh.a;
                if (hjhVar != hjhVar2) {
                    hjh hjhVar3 = new hjh();
                    while (true) {
                        hjhVar3.a(hjhVar);
                        z = z2;
                        if (b.e(this, hjhVar, hjhVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.c;
                                    if ((obj2 != null ? z : false) & (!(obj2 instanceof hjf))) {
                                        return i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    h(hjhVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(hjhVar3);
                        } else {
                            hjhVar = this.e;
                            if (hjhVar == hjhVar2) {
                                break;
                            }
                            z2 = z;
                        }
                    }
                }
                return i(this.c);
            }
            z = true;
            while (nanos > 0) {
                Object obj3 = this.c;
                if ((obj3 != null ? z : false) & (!(obj3 instanceof hjf))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(a.cq(string, strConcat, " for "));
        }
        throw new InterruptedException();
    }
}
