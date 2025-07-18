package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cgx extends chg {
    private static Object f(Future future) {
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
                    qm.A();
                }
                throw th;
            }
        }
        if (z) {
            qm.A();
        }
        return obj;
    }

    private final void g(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            if (objF == null) {
                sb.append("null");
            } else if (objF == this) {
                sb.append("this future");
            } else {
                sb.append(objF.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objF)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    static Object j(Object obj) throws ExecutionException {
        if (obj instanceof cgq) {
            Throwable th = ((cgq) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof cgt) {
            throw new ExecutionException(((cgt) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object k(cja cjaVar) {
        Throwable thL;
        if (cjaVar instanceof cgv) {
            Object cgqVar = ((cgx) cjaVar).valueField;
            if (cgqVar instanceof cgq) {
                cgq cgqVar2 = (cgq) cgqVar;
                if (cgqVar2.c) {
                    Throwable th = cgqVar2.d;
                    cgqVar = th != null ? new cgq(false, th) : cgq.b;
                }
            }
            cgqVar.getClass();
            return cgqVar;
        }
        if ((cjaVar instanceof cjt) && (thL = ((cjt) cjaVar).l()) != null) {
            return new cgt(thL);
        }
        boolean zIsCancelled = cjaVar.isCancelled();
        if ((!f) && zIsCancelled) {
            cgq cgqVar3 = cgq.b;
            cgqVar3.getClass();
            return cgqVar3;
        }
        try {
            Object objF = f(cjaVar);
            if (!zIsCancelled) {
                return objF == null ? d : objF;
            }
            return new cgq(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(cjaVar)));
        } catch (Error | Exception e) {
            return new cgt(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new cgt(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(cjaVar))), e2)) : new cgq(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new cgq(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(cjaVar))), e3)) : new cgt(e3.getCause());
        }
    }

    public static void n(cgx cgxVar, boolean z) {
        cgu cguVar = null;
        while (true) {
            for (chf chfVarB = chg.g.b(cgxVar, chf.a); chfVarB != null; chfVarB = chfVarB.next) {
                Thread thread = chfVarB.thread;
                if (thread != null) {
                    chfVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                cgxVar.o();
            }
            cgxVar.b();
            cgu cguVar2 = cguVar;
            cgu cguVarA = chg.g.a(cgxVar, cgu.a);
            cgu cguVar3 = cguVar2;
            while (cguVarA != null) {
                cgu cguVar4 = cguVarA.next;
                cguVarA.next = cguVar3;
                cguVar3 = cguVarA;
                cguVarA = cguVar4;
            }
            while (cguVar3 != null) {
                Runnable runnable = cguVar3.b;
                cguVar = cguVar3.next;
                runnable.getClass();
                if (runnable instanceof cgr) {
                    cgr cgrVar = (cgr) runnable;
                    cgxVar = cgrVar.a;
                    if (cgxVar.valueField != cgrVar || !v(cgxVar, cgrVar, k(cgrVar.b))) {
                    }
                } else {
                    Executor executor = cguVar3.c;
                    executor.getClass();
                    h(runnable, executor);
                }
                cguVar3 = cguVar;
            }
            return;
            z = false;
        }
    }

    static boolean q(Object obj) {
        return !(obj instanceof cgr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean c(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!v(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof defpackage.cgr
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = defpackage.cgx.f
            if (r1 == 0) goto L1f
            cgq r1 = new cgq
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            cgq r1 = defpackage.cgq.a
            goto L26
        L24:
            cgq r1 = defpackage.cgq.b
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = v(r4, r0, r1)
            if (r6 == 0) goto L56
            n(r4, r8)
            boolean r4 = r0 instanceof defpackage.cgr
            if (r4 == 0) goto L55
            cgr r0 = (defpackage.cgr) r0
            cja r0 = r0.b
            boolean r4 = r0 instanceof defpackage.cgv
            if (r4 == 0) goto L52
            r4 = r0
            cgx r4 = (defpackage.cgx) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof defpackage.cgr
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = q(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgx.cancel(boolean):boolean");
    }

    public boolean d(Throwable th) {
        th.getClass();
        if (!v(this, null, new cgt(th))) {
            return false;
        }
        n(this, false);
        return true;
    }

    public boolean e(cja cjaVar) {
        cgt cgtVar;
        cjaVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (cjaVar.isDone()) {
                if (!v(this, null, k(cjaVar))) {
                    return false;
                }
                n(this, false);
                return true;
            }
            cgr cgrVar = new cgr(this, cjaVar);
            if (v(this, null, cgrVar)) {
                try {
                    cjaVar.m(cgrVar, chz.a);
                } catch (Throwable th) {
                    try {
                        cgtVar = new cgt(th);
                    } catch (Error | Exception unused) {
                        cgtVar = cgt.a;
                    }
                    v(this, cgrVar, cgtVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof cgq) {
            cjaVar.cancel(((cgq) obj).c);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof cgq;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & q(obj);
    }

    @Override // defpackage.cjt
    public final Throwable l() {
        if (!(this instanceof cgv)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof cgt) {
            return ((cgt) obj).b;
        }
        return null;
    }

    @Override // defpackage.cja
    public void m(Runnable runnable, Executor executor) {
        cgu cguVar;
        executor.getClass();
        if (!isDone() && (cguVar = this.listenersField) != cgu.a) {
            cgu cguVar2 = new cgu(runnable, executor);
            do {
                cguVar2.next = cguVar;
                if (chg.g.e(this, cguVar, cguVar2)) {
                    return;
                } else {
                    cguVar = this.listenersField;
                }
            } while (cguVar != cgu.a);
        }
        h(runnable, executor);
    }

    public final void p(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    protected final boolean r() {
        Object obj = this.valueField;
        return (obj instanceof cgq) && ((cgq) obj).c;
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof cgr) {
                sb.append(", setFuture=[");
                cja cjaVar = ((cgr) obj).b;
                try {
                    if (cjaVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(cjaVar);
                    }
                } catch (Throwable th) {
                    qm.C(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = a();
                    if (true == bdq.q(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    qm.C(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                g(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && q(obj)) {
            return j(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            chf chfVar = this.waitersField;
            if (chfVar != chf.a) {
                chf chfVar2 = new chf();
                while (true) {
                    chg.t(chfVar2, chfVar);
                    if (super.w(chfVar, chfVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                super.u(chfVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && q(obj2)) {
                                return j(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        super.u(chfVar2);
                    } else {
                        chf chfVar3 = this.waitersField;
                        if (chfVar3 == chf.a) {
                            break;
                        }
                        chfVar = chfVar3;
                    }
                }
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return j(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && q(obj4)) {
                return j(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
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
        throw new TimeoutException(strConcat + " for " + string);
    }

    protected void b() {
    }

    protected void o() {
    }
}
