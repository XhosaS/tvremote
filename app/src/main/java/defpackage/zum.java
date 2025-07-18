package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zum extends zuv {
    private static Object e(Future future) {
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

    private final void f(StringBuilder sb) {
        try {
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            if (objE == null) {
                sb.append("null");
            } else if (objE == this) {
                sb.append("this future");
            } else {
                sb.append(objE.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objE)));
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

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            h.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    static Object i(Object obj) throws ExecutionException {
        if (obj instanceof zue) {
            Throwable th = ((zue) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (!(obj instanceof zui)) {
            if (obj == g) {
                return null;
            }
            return obj;
        }
        Throwable th2 = ((zui) obj).c;
        if (th2 != null) {
            throw new ExecutionException(th2);
        }
        h.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(zui.b.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(zyd zydVar) {
        Throwable thK;
        if (zydVar instanceof zuk) {
            Object zueVar = ((zum) zydVar).valueField;
            if (zueVar instanceof zue) {
                zue zueVar2 = (zue) zueVar;
                if (zueVar2.c) {
                    Throwable th = zueVar2.d;
                    zueVar = th != null ? new zue(false, th) : zue.b;
                }
            }
            zueVar.getClass();
            return zueVar;
        }
        if ((zydVar instanceof zzf) && (thK = ((zzf) zydVar).k()) != null) {
            return new zui(thK);
        }
        boolean zIsCancelled = zydVar.isCancelled();
        if ((!i) && zIsCancelled) {
            zue zueVar3 = zue.b;
            zueVar3.getClass();
            return zueVar3;
        }
        try {
            Object objE = e(zydVar);
            return zIsCancelled ? new zue(false, new IllegalArgumentException(a.p(zydVar, "get() did not throw CancellationException, despite reporting isCancelled() == true: "))) : objE == null ? g : objE;
        } catch (Error | Exception e) {
            return new zui(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zui(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(zydVar))), e2)) : new zue(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new zue(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(zydVar))), e3)) : new zui(e3.getCause());
        }
    }

    public static void l(zum zumVar, boolean z) {
        zuj zujVar = null;
        while (true) {
            for (zuu zuuVarB = zuv.j.b(zumVar, zuu.a); zuuVarB != null; zuuVarB = zuuVarB.next) {
                Thread thread = zuuVarB.thread;
                if (thread != null) {
                    zuuVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zumVar.m();
            }
            zumVar.b();
            zuj zujVar2 = zujVar;
            zuj zujVarA = zuv.j.a(zumVar, zuj.a);
            zuj zujVar3 = zujVar2;
            while (zujVarA != null) {
                zuj zujVar4 = zujVarA.next;
                zujVarA.next = zujVar3;
                zujVar3 = zujVarA;
                zujVarA = zujVar4;
            }
            while (zujVar3 != null) {
                Runnable runnable = zujVar3.b;
                zujVar = zujVar3.next;
                runnable.getClass();
                if (runnable instanceof zuf) {
                    zuf zufVar = (zuf) runnable;
                    zumVar = zufVar.a;
                    if (zumVar.valueField == zufVar) {
                        if (zuv.j.f(zumVar, zufVar, j(zufVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zujVar3.c;
                    executor.getClass();
                    g(runnable, executor);
                }
                zujVar3 = zujVar;
            }
            return;
            z = false;
        }
    }

    static boolean o(Object obj) {
        return !(obj instanceof zuf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof defpackage.zuf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L61
            boolean r1 = defpackage.zum.i
            if (r1 == 0) goto L1f
            zue r1 = new zue
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            zue r1 = defpackage.zue.a
            goto L26
        L24:
            zue r1 = defpackage.zue.b
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            zun r6 = defpackage.zuv.j
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L58
            l(r4, r8)
            boolean r4 = r0 instanceof defpackage.zuf
            if (r4 == 0) goto L57
            zuf r0 = (defpackage.zuf) r0
            zyd r0 = r0.b
            boolean r4 = r0 instanceof defpackage.zuk
            if (r4 == 0) goto L54
            r4 = r0
            zum r4 = (defpackage.zum) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof defpackage.zuf
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.valueField
            boolean r6 = o(r0)
            if (r6 == 0) goto L2b
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zum.cancel(boolean):boolean");
    }

    @Override // defpackage.zyd
    public void d(Runnable runnable, Executor executor) {
        zuj zujVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (zujVar = this.listenersField) != zuj.a) {
            zuj zujVar2 = new zuj(runnable, executor);
            do {
                zujVar2.next = zujVar;
                if (zuv.j.e(this, zujVar, zujVar2)) {
                    return;
                } else {
                    zujVar = this.listenersField;
                }
            } while (zujVar != zuj.a);
        }
        g(runnable, executor);
    }

    protected boolean eZ(zyd zydVar) {
        zui zuiVar;
        zydVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (zydVar.isDone()) {
                if (!zuv.j.f(this, null, j(zydVar))) {
                    return false;
                }
                l(this, false);
                return true;
            }
            zuf zufVar = new zuf(this, zydVar);
            if (zuv.j.f(this, null, zufVar)) {
                try {
                    zydVar.d(zufVar, zwk.a);
                } catch (Throwable th) {
                    try {
                        zuiVar = new zui(th);
                    } catch (Error | Exception unused) {
                        zuiVar = zui.a;
                    }
                    zuv.j.f(this, zufVar, zuiVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zue) {
            zydVar.cancel(((zue) obj).c);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zue;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & o(obj);
    }

    @Override // defpackage.zzf
    public final Throwable k() {
        if (!(this instanceof zuk)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zui) {
            return ((zui) obj).c;
        }
        return null;
    }

    final void n(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    public final boolean p(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!zuv.j.f(this, null, obj)) {
            return false;
        }
        l(this, false);
        return true;
    }

    public final boolean q(Throwable th) {
        th.getClass();
        if (!zuv.j.f(this, null, new zui(th))) {
            return false;
        }
        l(this, false);
        return true;
    }

    protected final boolean r() {
        Object obj = this.valueField;
        return (obj instanceof zue) && ((zue) obj).c;
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
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zuf) {
                sb.append(", setFuture=[");
                zyd zydVar = ((zuf) obj).b;
                try {
                    if (zydVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zydVar);
                    }
                } catch (Throwable th) {
                    zyo.b(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = yqv.a(a());
                } catch (Throwable th2) {
                    zyo.b(th2);
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
                f(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return t(j, timeUnit);
    }

    protected void b() {
    }

    protected void m() {
    }
}
