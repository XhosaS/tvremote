package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xn implements zyd {
    static final xd b;
    public static final /* synthetic */ int c = 0;
    private static final Object e;
    volatile xh listeners;
    public volatile Object value;
    volatile xm waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(xn.class.getName());

    static {
        xd xlVar;
        try {
            xlVar = new xj(AtomicReferenceFieldUpdater.newUpdater(xm.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(xm.class, xm.class, "next"), AtomicReferenceFieldUpdater.newUpdater(xn.class, xm.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(xn.class, xh.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(xn.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            xlVar = new xl();
        }
        b = xlVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    protected xn() {
    }

    static Object a(zyd zydVar) {
        if (zydVar instanceof xn) {
            Object obj = ((xn) zydVar).value;
            if (!(obj instanceof xe)) {
                return obj;
            }
            xe xeVar = (xe) obj;
            if (!xeVar.c) {
                return obj;
            }
            Throwable th = xeVar.d;
            return th != null ? new xe(false, th) : xe.b;
        }
        boolean zIsCancelled = zydVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return xe.b;
        }
        try {
            Object objB = b(zydVar);
            return objB == null ? e : objB;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new xe(false, e2);
            }
            Objects.toString(zydVar);
            return new xg(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zydVar)), e2));
        } catch (ExecutionException e3) {
            return new xg(e3.getCause());
        } catch (Throwable th2) {
            return new xg(th2);
        }
    }

    static Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static void f(xn xnVar) {
        xh xhVar;
        xh xhVar2;
        xh xhVar3 = null;
        while (true) {
            xm xmVar = xnVar.waiters;
            if (b.e(xnVar, xmVar, xm.a)) {
                while (xmVar != null) {
                    Thread thread = xmVar.thread;
                    if (thread != null) {
                        xmVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    xmVar = xmVar.next;
                }
                xnVar.e();
                do {
                    xhVar = xnVar.listeners;
                } while (!b.c(xnVar, xhVar, xh.a));
                while (true) {
                    xhVar2 = xhVar3;
                    xhVar3 = xhVar;
                    if (xhVar3 == null) {
                        break;
                    }
                    xhVar = xhVar3.next;
                    xhVar3.next = xhVar2;
                }
                while (xhVar2 != null) {
                    Runnable runnable = xhVar2.b;
                    xh xhVar4 = xhVar2.next;
                    if (runnable instanceof xk) {
                        xk xkVar = (xk) runnable;
                        xnVar = xkVar.a;
                        if (xnVar.value == xkVar) {
                            if (b.d(xnVar, xkVar, a(xkVar.b))) {
                                xhVar3 = xhVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        l(runnable, xhVar2.c);
                    }
                    xhVar2 = xhVar4;
                }
                return;
            }
        }
    }

    private final Object i(Object obj) throws ExecutionException {
        if (obj instanceof xe) {
            Throwable th = ((xe) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof xg) {
            throw new ExecutionException(((xg) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void k(StringBuilder sb) {
        try {
            Object objB = b(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(objB));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, a.d(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void m(xm xmVar) {
        xmVar.thread = null;
        while (true) {
            xm xmVar2 = this.waiters;
            if (xmVar2 != xm.a) {
                xm xmVar3 = null;
                while (xmVar2 != null) {
                    xm xmVar4 = xmVar2.next;
                    if (xmVar2.thread != null) {
                        xmVar3 = xmVar2;
                    } else if (xmVar3 != null) {
                        xmVar3.next = xmVar4;
                        if (xmVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, xmVar2, xmVar4)) {
                        break;
                    }
                    xmVar2 = xmVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String c() {
        Object obj = this.value;
        if (obj instanceof xk) {
            return "setFuture=[" + j(((xk) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof defpackage.xk
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5c
            boolean r1 = defpackage.xn.a
            if (r1 == 0) goto L1f
            xe r1 = new xe
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            xe r1 = defpackage.xe.a
            goto L26
        L24:
            xe r1 = defpackage.xe.b
        L26:
            r4 = r7
            r5 = r2
        L28:
            xd r6 = defpackage.xn.b
            boolean r6 = r6.d(r4, r0, r1)
            if (r6 == 0) goto L55
            f(r4)
            boolean r4 = r0 instanceof defpackage.xk
            if (r4 == 0) goto L54
            xk r0 = (defpackage.xk) r0
            zyd r0 = r0.b
            boolean r4 = r0 instanceof defpackage.xn
            if (r4 == 0) goto L51
            r4 = r0
            xn r4 = (defpackage.xn) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L48
            r5 = r3
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof defpackage.xk
            r5 = r5 | r6
            if (r5 == 0) goto L50
            r5 = r3
            goto L28
        L50:
            return r3
        L51:
            r0.cancel(r8)
        L54:
            return r3
        L55:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof defpackage.xk
            if (r6 != 0) goto L28
            return r5
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn.cancel(boolean):boolean");
    }

    @Override // defpackage.zyd
    public final void d(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        xh xhVar = this.listeners;
        if (xhVar != xh.a) {
            xh xhVar2 = new xh(runnable, executor);
            do {
                xhVar2.next = xhVar;
                if (b.c(this, xhVar, xhVar2)) {
                    return;
                } else {
                    xhVar = this.listeners;
                }
            } while (xhVar != xh.a);
        }
        l(runnable, executor);
    }

    public boolean g(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof xk))) {
            return i(obj2);
        }
        xm xmVar = this.waiters;
        if (xmVar != xm.a) {
            xm xmVar2 = new xm();
            do {
                xd xdVar = b;
                xdVar.a(xmVar2, xmVar);
                if (xdVar.e(this, xmVar, xmVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m(xmVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof xk))));
                    return i(obj);
                }
                xmVar = this.waiters;
            } while (xmVar != xm.a);
        }
        return i(this.value);
    }

    public final boolean h(Throwable th) {
        th.getClass();
        if (!b.d(this, null, new xg(th))) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof xe;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof xk));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof xe) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            try {
                strConcat = c();
            } catch (RuntimeException e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                k(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof xk))) {
                return i(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                xm xmVar = this.waiters;
                if (xmVar != xm.a) {
                    xm xmVar2 = new xm();
                    do {
                        xd xdVar = b;
                        xdVar.a(xmVar2, xmVar);
                        if (xdVar.e(this, xmVar, xmVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof xk))) {
                                        return i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m(xmVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m(xmVar2);
                        } else {
                            xmVar = this.waiters;
                        }
                    } while (xmVar != xm.a);
                }
                return i(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof xk))) {
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
            throw new TimeoutException(a.i(string, strConcat, " for "));
        }
        throw new InterruptedException();
    }

    protected void e() {
    }
}
