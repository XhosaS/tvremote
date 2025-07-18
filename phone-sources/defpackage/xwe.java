package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xwe extends xqb {
    private static final xqb c;
    public final xqo a;
    public xqb b;
    private final ScheduledFuture d;
    private final Executor e;
    private volatile boolean f;
    private xtk g;
    private List h = new ArrayList();
    private xwd i;
    private wbb j;

    static {
        Logger.getLogger(xwe.class.getName());
        c = new xwb();
    }

    protected xwe(Executor executor, ScheduledExecutorService scheduledExecutorService, xqp xqpVar) {
        executor.getClass();
        this.e = executor;
        scheduledExecutorService.getClass();
        this.a = xqo.b();
        ScheduledFuture<?> scheduledFutureSchedule = null;
        if (xqpVar != null) {
            long jB = xqpVar.b(TimeUnit.NANOSECONDS);
            long jAbs = Math.abs(jB) / TimeUnit.SECONDS.toNanos(1L);
            long jAbs2 = Math.abs(jB) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (jB < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new utm((Object) this, (Object) sb, 6, (byte[]) null), jB, TimeUnit.NANOSECONDS);
        }
        this.d = scheduledFutureSchedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (this.f) {
                runnable.run();
            } else {
                this.h.add(runnable);
            }
        }
    }

    @Override // defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        xtk xtkVar;
        boolean z;
        sij.x(this.j == null, "already started");
        synchronized (this) {
            wbbVar.getClass();
            this.j = wbbVar;
            xtkVar = this.g;
            z = this.f;
            if (!z) {
                xwd xwdVar = new xwd(wbbVar);
                this.i = xwdVar;
                wbbVar = xwdVar;
            }
        }
        if (xtkVar != null) {
            this.e.execute(new xwc(this, wbbVar, xtkVar));
        } else if (z) {
            this.b.a(wbbVar, xsmVar);
        } else {
            j(new rvp(this, wbbVar, xsmVar, 17));
        }
    }

    @Override // defpackage.xqb
    public final void c(String str, Throwable th) {
        xtk xtkVar = xtk.c;
        xtk xtkVarE = str != null ? xtkVar.e(str) : xtkVar.e("Call cancelled without message");
        if (th != null) {
            xtkVarE = xtkVarE.d(th);
        }
        g(xtkVarE, false);
    }

    @Override // defpackage.xqb
    public final void d() {
        j(new ufx(this, 19, null));
    }

    @Override // defpackage.xqb
    public final void e(int i) {
        if (this.f) {
            this.b.e(i);
        } else {
            j(new utl(this, i, 3, null));
        }
    }

    @Override // defpackage.xqb
    public final void f(Object obj) {
        if (this.f) {
            this.b.f(obj);
        } else {
            j(new utm((Object) this, obj, 8, (byte[]) null));
        }
    }

    public final void g(xtk xtkVar, boolean z) {
        boolean z2;
        wbb wbbVar;
        synchronized (this) {
            if (this.b == null) {
                i(c);
                wbbVar = this.j;
                this.g = xtkVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                z2 = true;
                wbbVar = null;
            }
            if (z2) {
                j(new utm(this, xtkVar, 7, (char[]) null));
            } else {
                if (wbbVar != null) {
                    this.e.execute(new xwc(this, wbbVar, xtkVar));
                }
                h();
            }
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f = r0     // Catch: java.lang.Throwable -> L42
            xwd r0 = r3.i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.e
            xwa r2 = new xwa
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwe.h():void");
    }

    public final void i(xqb xqbVar) {
        xqb xqbVar2 = this.b;
        sij.z(xqbVar2 == null, "realCall already set to %s", xqbVar2);
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = xqbVar;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("realCall", this.b);
        return tssVarH.toString();
    }

    protected void b() {
    }
}
