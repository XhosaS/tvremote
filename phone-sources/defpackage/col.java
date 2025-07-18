package defpackage;

import java.util.Locale;
import java.util.Objects;
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
public abstract class col<V> implements uhp<V> {
    static final coc b;
    public static final /* synthetic */ int c = 0;
    private static final Object e;
    volatile cog listeners;
    public volatile Object value;
    volatile cok waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(col.class.getName());

    static {
        coc cojVar;
        try {
            cojVar = new coh(AtomicReferenceFieldUpdater.newUpdater(cok.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cok.class, cok.class, "next"), AtomicReferenceFieldUpdater.newUpdater(col.class, cok.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(col.class, cog.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(col.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            cojVar = new coj();
        }
        b = cojVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    protected col() {
    }

    static Object a(uhp uhpVar) {
        if (uhpVar instanceof col) {
            Object obj = ((col) uhpVar).value;
            if (!(obj instanceof cod)) {
                return obj;
            }
            cod codVar = (cod) obj;
            if (!codVar.c) {
                return obj;
            }
            Throwable th = codVar.d;
            return th != null ? new cod(false, th) : cod.b;
        }
        boolean zIsCancelled = uhpVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return cod.b;
        }
        try {
            Object objG = a.G(uhpVar);
            return objG == null ? e : objG;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new cod(false, e2);
            }
            Objects.toString(uhpVar);
            return new cof(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(uhpVar)), e2));
        } catch (ExecutionException e3) {
            return new cof(e3.getCause());
        } catch (Throwable th2) {
            return new cof(th2);
        }
    }

    static void e(col colVar) {
        cog cogVar;
        cog cogVar2;
        cog cogVar3 = null;
        while (true) {
            cok cokVar = colVar.waiters;
            if (b.e(colVar, cokVar, cok.a)) {
                while (cokVar != null) {
                    Thread thread = cokVar.thread;
                    if (thread != null) {
                        cokVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    cokVar = cokVar.next;
                }
                colVar.d();
                do {
                    cogVar = colVar.listeners;
                } while (!b.c(colVar, cogVar, cog.a));
                while (true) {
                    cogVar2 = cogVar3;
                    cogVar3 = cogVar;
                    if (cogVar3 == null) {
                        break;
                    }
                    cogVar = cogVar3.next;
                    cogVar3.next = cogVar2;
                }
                while (cogVar2 != null) {
                    Runnable runnable = cogVar2.b;
                    cog cogVar4 = cogVar2.next;
                    if (runnable instanceof coi) {
                        coi coiVar = (coi) runnable;
                        colVar = coiVar.a;
                        if (colVar.value == coiVar) {
                            if (b.d(colVar, coiVar, a(coiVar.b))) {
                                cogVar3 = cogVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, cogVar2.c);
                    }
                    cogVar2 = cogVar4;
                }
                return;
            }
        }
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void i(StringBuilder sb) {
        try {
            Object objG = a.G(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(objG));
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

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, a.ck(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void k(cok cokVar) {
        cokVar.thread = null;
        while (true) {
            cok cokVar2 = this.waiters;
            if (cokVar2 != cok.a) {
                cok cokVar3 = null;
                while (cokVar2 != null) {
                    cok cokVar4 = cokVar2.next;
                    if (cokVar2.thread != null) {
                        cokVar3 = cokVar2;
                    } else if (cokVar3 != null) {
                        cokVar3.next = cokVar4;
                        if (cokVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, cokVar2, cokVar4)) {
                        break;
                    }
                    cokVar2 = cokVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object l(Object obj) throws ExecutionException {
        if (obj instanceof cod) {
            Throwable th = ((cod) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof cof) {
            throw new ExecutionException(((cof) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof coi) {
            return "setFuture=[" + h(((coi) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        cog cogVar = this.listeners;
        if (cogVar != cog.a) {
            cog cogVar2 = new cog(runnable, executor);
            do {
                cogVar2.next = cogVar;
                if (b.c(this, cogVar, cogVar2)) {
                    return;
                } else {
                    cogVar = this.listeners;
                }
            } while (cogVar != cog.a);
        }
        j(runnable, executor);
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
            boolean r1 = r0 instanceof defpackage.coi
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
            boolean r1 = defpackage.col.a
            if (r1 == 0) goto L1f
            cod r1 = new cod
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            cod r1 = defpackage.cod.a
            goto L26
        L24:
            cod r1 = defpackage.cod.b
        L26:
            r4 = r7
            r5 = r2
        L28:
            coc r6 = defpackage.col.b
            boolean r6 = r6.d(r4, r0, r1)
            if (r6 == 0) goto L55
            e(r4)
            boolean r4 = r0 instanceof defpackage.coi
            if (r4 == 0) goto L54
            coi r0 = (defpackage.coi) r0
            uhp<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof defpackage.col
            if (r4 == 0) goto L51
            r4 = r0
            col r4 = (defpackage.col) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L48
            r5 = r3
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof defpackage.coi
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
            boolean r6 = r0 instanceof defpackage.coi
            if (r6 != 0) goto L28
            return r5
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.col.cancel(boolean):boolean");
    }

    public boolean f(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public final boolean g(Throwable th) {
        if (!b.d(this, null, new cof(th))) {
            return false;
        }
        e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof coi))) {
            return l(obj2);
        }
        cok cokVar = this.waiters;
        if (cokVar != cok.a) {
            cok cokVar2 = new cok();
            do {
                cokVar2.a(cokVar);
                if (b.e(this, cokVar, cokVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            k(cokVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof coi))));
                    return l(obj);
                }
                cokVar = this.waiters;
            } while (cokVar != cok.a);
        }
        return l(this.value);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof cod;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof coi));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                strConcat = b();
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
                i(sb);
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
            if ((obj != null) & (!(obj instanceof coi))) {
                return l(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                cok cokVar = this.waiters;
                if (cokVar != cok.a) {
                    cok cokVar2 = new cok();
                    do {
                        cokVar2.a(cokVar);
                        if (b.e(this, cokVar, cokVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof coi))) {
                                        return l(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    k(cokVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            k(cokVar2);
                        } else {
                            cokVar = this.waiters;
                        }
                    } while (cokVar != cok.a);
                }
                return l(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof coi))) {
                    return l(obj3);
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

    protected void d() {
    }
}
