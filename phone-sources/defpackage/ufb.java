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
public abstract class ufb<V> extends ufj<V> {
    private static Object g(Future future) {
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
                    sfy.s();
                }
                throw th;
            }
        }
        if (z) {
            sfy.s();
        }
        return obj;
    }

    private final void h(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            if (objG == null) {
                sb.append("null");
            } else if (objG == this) {
                sb.append("this future");
            } else {
                sb.append(objG.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objG)));
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

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    static Object k(Object obj) throws ExecutionException {
        if (obj instanceof uet) {
            Throwable th = ((uet) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (!(obj instanceof uex)) {
            if (obj == d) {
                return null;
            }
            return obj;
        }
        Throwable th2 = ((uex) obj).c;
        if (th2 != null) {
            throw new ExecutionException(th2);
        }
        e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(uex.b.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object l(uhp uhpVar) {
        Throwable thM;
        if (uhpVar instanceof uez) {
            Object uetVar = ((ufb) uhpVar).valueField;
            if (uetVar instanceof uet) {
                uet uetVar2 = (uet) uetVar;
                if (uetVar2.c) {
                    Throwable th = uetVar2.d;
                    uetVar = th != null ? new uet(false, th) : uet.b;
                }
            }
            uetVar.getClass();
            return uetVar;
        }
        if ((uhpVar instanceof uim) && (thM = ((uim) uhpVar).m()) != null) {
            return new uex(thM);
        }
        boolean zIsCancelled = uhpVar.isCancelled();
        if ((!f) && zIsCancelled) {
            uet uetVar3 = uet.b;
            uetVar3.getClass();
            return uetVar3;
        }
        try {
            Object objG = g(uhpVar);
            return zIsCancelled ? new uet(false, new IllegalArgumentException(a.ct(uhpVar, "get() did not throw CancellationException, despite reporting isCancelled() == true: "))) : objG == null ? d : objG;
        } catch (Error | Exception e) {
            return new uex(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new uex(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(uhpVar))), e2)) : new uet(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new uet(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(uhpVar))), e3)) : new uex(e3.getCause());
        }
    }

    public static void n(ufb ufbVar, boolean z) {
        uey ueyVar = null;
        while (true) {
            for (ufi ufiVarB = ufj.g.b(ufbVar, ufi.a); ufiVarB != null; ufiVarB = ufiVarB.next) {
                Thread thread = ufiVarB.thread;
                if (thread != null) {
                    ufiVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                ufbVar.o();
            }
            ufbVar.d();
            uey ueyVar2 = ueyVar;
            uey ueyVarA = ufj.g.a(ufbVar, uey.a);
            uey ueyVar3 = ueyVar2;
            while (ueyVarA != null) {
                uey ueyVar4 = ueyVarA.next;
                ueyVarA.next = ueyVar3;
                ueyVar3 = ueyVarA;
                ueyVarA = ueyVar4;
            }
            while (ueyVar3 != null) {
                Runnable runnable = ueyVar3.b;
                ueyVar = ueyVar3.next;
                runnable.getClass();
                if (runnable instanceof ueu) {
                    ueu ueuVar = (ueu) runnable;
                    ufbVar = ueuVar.a;
                    if (ufbVar.valueField != ueuVar || !u(ufbVar, ueuVar, l(ueuVar.b))) {
                    }
                } else {
                    Executor executor = ueyVar3.c;
                    executor.getClass();
                    i(runnable, executor);
                }
                ueyVar3 = ueyVar;
            }
            return;
            z = false;
        }
    }

    static boolean q(Object obj) {
        return !(obj instanceof ueu);
    }

    protected boolean b(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!u(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    @Override // defpackage.uhp
    public void c(Runnable runnable, Executor executor) {
        uey ueyVar;
        executor.getClass();
        if (!isDone() && (ueyVar = this.listenersField) != uey.a) {
            uey ueyVar2 = new uey(runnable, executor);
            do {
                ueyVar2.next = ueyVar;
                if (ufj.g.e(this, ueyVar, ueyVar2)) {
                    return;
                } else {
                    ueyVar = this.listenersField;
                }
            } while (ueyVar != uey.a);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
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
            boolean r1 = r0 instanceof defpackage.ueu
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
            boolean r1 = defpackage.ufb.f
            if (r1 == 0) goto L1f
            uet r1 = new uet
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            uet r1 = defpackage.uet.a
            goto L26
        L24:
            uet r1 = defpackage.uet.b
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = u(r4, r0, r1)
            if (r6 == 0) goto L56
            n(r4, r8)
            boolean r4 = r0 instanceof defpackage.ueu
            if (r4 == 0) goto L55
            ueu r0 = (defpackage.ueu) r0
            uhp<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof defpackage.uez
            if (r4 == 0) goto L52
            r4 = r0
            ufb r4 = (defpackage.ufb) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof defpackage.ueu
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufb.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String dw() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean e(Throwable th) {
        th.getClass();
        if (!u(this, null, new uex(th))) {
            return false;
        }
        n(this, false);
        return true;
    }

    protected boolean ev(uhp uhpVar) {
        uex uexVar;
        uhpVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (uhpVar.isDone()) {
                if (!u(this, null, l(uhpVar))) {
                    return false;
                }
                n(this, false);
                return true;
            }
            ueu ueuVar = new ueu(this, uhpVar);
            if (u(this, null, ueuVar)) {
                try {
                    uhpVar.c(ueuVar, ugk.a);
                } catch (Throwable th) {
                    try {
                        uexVar = new uex(th);
                    } catch (Error | Exception unused) {
                        uexVar = uex.a;
                    }
                    u(this, ueuVar, uexVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof uet) {
            uhpVar.cancel(((uet) obj).c);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof uet;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & q(obj);
    }

    @Override // defpackage.uim
    public final Throwable m() {
        if (!(this instanceof uez)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof uex) {
            return ((uex) obj).c;
        }
        return null;
    }

    public final void p(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    protected final boolean r() {
        Object obj = this.valueField;
        return (obj instanceof uet) && ((uet) obj).c;
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
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof ueu) {
                sb.append(", setFuture=[");
                uhp<? extends V> uhpVar = ((ueu) obj).b;
                try {
                    if (uhpVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(uhpVar);
                    }
                } catch (Throwable th) {
                    sfy.u(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = sij.D(dw());
                } catch (Throwable th2) {
                    sfy.u(th2);
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
                h(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return t(j, timeUnit);
    }

    protected void d() {
    }

    protected void o() {
    }
}
