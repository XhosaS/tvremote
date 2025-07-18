package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afpn extends afeq {
    private static final Logger c = Logger.getLogger(afpn.class.getName());
    private static final afeq d = new afpg();
    public final affp a;
    public afeq b;
    private final ScheduledFuture e;
    private final Executor f;
    private volatile boolean g;
    private afep h;
    private Status i;
    private List j = new ArrayList();
    private afpm k;

    protected afpn(Executor executor, ScheduledExecutorService scheduledExecutorService, afft afftVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        executor.getClass();
        this.f = executor;
        scheduledExecutorService.getClass();
        affp affpVarK = affp.k();
        this.a = affpVarK;
        afft afftVarB = affpVarK.b();
        if (afftVar == null && afftVarB == null) {
            scheduledFutureSchedule = null;
        } else {
            long jB = afftVar != null ? afftVar.b(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
            if (afftVarB != null && afftVarB.b(TimeUnit.NANOSECONDS) < jB) {
                jB = afftVarB.b(TimeUnit.NANOSECONDS);
                Logger logger = c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jB)));
                    if (afftVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(afftVar.b(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long jAbs = Math.abs(jB) / TimeUnit.SECONDS.toNanos(1L);
            long jAbs2 = Math.abs(jB) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            String str = true != (afftVar == null ? true : afftVarB == null ? false : afftVarB.e(afftVar)) ? "CallOptions" : "Context";
            if (jB < 0) {
                sb2.append("ClientCall started after ");
                sb2.append(str);
                sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline ");
                sb2.append(str);
                sb2.append(" will be exceeded in ");
            }
            sb2.append(jAbs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new afoz(this, sb2), jB, TimeUnit.NANOSECONDS);
        }
        this.e = scheduledFutureSchedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (this.g) {
                runnable.run();
            } else {
                this.j.add(runnable);
            }
        }
    }

    @Override // defpackage.afeq
    public final void a(afep afepVar, afih afihVar) {
        Status status;
        boolean z;
        yqw.M(this.h == null, "already started");
        synchronized (this) {
            afepVar.getClass();
            this.h = afepVar;
            status = this.i;
            z = this.g;
            if (!z) {
                afpm afpmVar = new afpm(afepVar);
                this.k = afpmVar;
                afepVar = afpmVar;
            }
        }
        if (status != null) {
            this.f.execute(new afph(this, afepVar, status));
        } else if (z) {
            this.b.a(afepVar, afihVar);
        } else {
            j(new afpb(this, afepVar, afihVar));
        }
    }

    @Override // defpackage.afeq
    public final void b(String str, Throwable th) {
        Status status = Status.b;
        Status statusWithDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
        if (th != null) {
            statusWithDescription = statusWithDescription.c(th);
        }
        g(statusWithDescription, false);
    }

    @Override // defpackage.afeq
    public final void c() {
        j(new afpf(this));
    }

    @Override // defpackage.afeq
    public final void d(int i) {
        if (this.g) {
            this.b.d(i);
        } else {
            j(new afpe(this, i));
        }
    }

    @Override // defpackage.afeq
    public final void e(Object obj) {
        if (this.g) {
            this.b.e(obj);
        } else {
            j(new afpd(this, obj));
        }
    }

    public final void g(Status status, boolean z) {
        afep afepVar;
        boolean z2;
        synchronized (this) {
            if (this.b == null) {
                i(d);
                afepVar = this.h;
                this.i = status;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                afepVar = null;
                z2 = true;
            }
            if (z2) {
                j(new afpc(this, status));
            } else {
                if (afepVar != null) {
                    this.f.execute(new afph(this, afepVar, status));
                }
                h();
            }
            f();
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
            java.util.List r1 = r3.j     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.j = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.g = r0     // Catch: java.lang.Throwable -> L42
            afpm r0 = r3.k     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f
            afpa r2 = new afpa
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.j     // Catch: java.lang.Throwable -> L42
            r3.j = r0     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpn.h():void");
    }

    public final void i(afeq afeqVar) {
        afeq afeqVar2 = this.b;
        yqw.R(afeqVar2 == null, "realCall already set to %s", afeqVar2);
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = afeqVar;
    }

    @Override // defpackage.afeq
    public final boolean k() {
        if (this.g) {
            return this.b.k();
        }
        return false;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("realCall", this.b);
        return yqqVarB.toString();
    }

    protected void f() {
    }
}
