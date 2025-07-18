package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afod extends afeq {
    public static final double a;
    private static final Logger l = Logger.getLogger(afod.class.getName());
    public final afil b;
    public final Executor c;
    public final afns d;
    public final affp e;
    public afnx f;
    public afem g;
    public afoe h;
    public final ScheduledExecutorService i;
    public affw j = affw.b;
    public affb k = affb.a;
    private final boolean m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private final afto q;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public afod(afil afilVar, Executor executor, afem afemVar, afto aftoVar, ScheduledExecutorService scheduledExecutorService, afns afnsVar) {
        this.b = afilVar;
        String str = afilVar.b;
        System.identityHashCode(this);
        int i = agfd.a;
        if (executor == zwk.a) {
            this.c = new afym();
            this.m = true;
        } else {
            this.c = new afyq(executor);
            this.m = false;
        }
        this.d = afnsVar;
        this.e = affp.k();
        afik afikVar = afilVar.a;
        this.n = afikVar == afik.UNARY || afikVar == afik.SERVER_STREAMING;
        this.g = afemVar;
        this.q = aftoVar;
        this.i = scheduledExecutorService;
    }

    private final void h(Object obj) {
        yqw.M(this.h != null, "Not started");
        yqw.M(!this.o, "call was cancelled");
        yqw.M(!this.p, "call was half-closed");
        try {
            afoe afoeVar = this.h;
            if (afoeVar instanceof afyf) {
                afyf afyfVar = (afyf) afoeVar;
                afxu afxuVar = afyfVar.w;
                if (afxuVar.a) {
                    afxuVar.f.a.h(afyfVar.j.a(obj));
                } else {
                    afyfVar.v(new afxi(afyfVar, obj));
                }
            } else {
                afoeVar.h(this.b.a(obj));
            }
            if (this.n) {
                return;
            }
            this.h.c();
        } catch (Error e) {
            this.h.n(Status.b.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.n(Status.b.c(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.afeq
    public final void a(afep afepVar, afih afihVar) {
        affa affaVar;
        afoe aftnVar;
        ScheduledExecutorService scheduledExecutorService;
        afem afemVar;
        int i = agfd.a;
        yqw.M(this.h == null, "Already started");
        yqw.M(!this.o, "call was cancelled");
        afepVar.getClass();
        afihVar.getClass();
        affp affpVar = this.e;
        if (affpVar.i()) {
            this.h = afvn.a;
            this.c.execute(new afnv(this, afepVar));
            return;
        }
        afuy afuyVar = (afuy) this.g.h(afuy.a);
        if (afuyVar != null) {
            Long l2 = afuyVar.b;
            if (l2 != null) {
                afft afftVarC = afft.c(l2.longValue(), TimeUnit.NANOSECONDS, afft.a);
                afft afftVar = this.g.b;
                if (afftVar == null || afftVarC.compareTo(afftVar) < 0) {
                    this.g = this.g.c(afftVarC);
                }
            }
            Boolean bool = afuyVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    afek afekVarA = afem.a(this.g);
                    afekVarA.g = Boolean.TRUE;
                    afemVar = new afem(afekVarA);
                } else {
                    afek afekVarA2 = afem.a(this.g);
                    afekVarA2.g = Boolean.FALSE;
                    afemVar = new afem(afekVarA2);
                }
                this.g = afemVar;
            }
            Integer num = afuyVar.d;
            if (num != null) {
                afem afemVar2 = this.g;
                Integer num2 = afemVar2.h;
                if (num2 != null) {
                    this.g = afemVar2.d(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.g = afemVar2.d(num.intValue());
                }
            }
            Integer num3 = afuyVar.e;
            if (num3 != null) {
                afem afemVar3 = this.g;
                Integer num4 = afemVar3.i;
                if (num4 != null) {
                    this.g = afemVar3.e(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.g = afemVar3.e(num3.intValue());
                }
            }
        }
        String str = this.g.f;
        if (str != null) {
            affaVar = (affa) this.k.b.get(str);
            if (affaVar == null) {
                this.h = afvn.a;
                this.c.execute(new afnw(this, afepVar, str));
                return;
            }
        } else {
            affaVar = afey.a;
        }
        affw affwVar = this.j;
        afihVar.c(afrq.f);
        afid afidVar = afrq.b;
        afihVar.c(afidVar);
        if (affaVar != afey.a) {
            afihVar.e(afidVar, affaVar.c());
        }
        afid afidVar2 = afrq.c;
        afihVar.c(afidVar2);
        byte[] bArr = affwVar.c;
        if (bArr.length != 0) {
            afihVar.e(afidVar2, bArr);
        }
        afihVar.c(afrq.d);
        afihVar.c(afrq.e);
        afft afftVarF = f();
        boolean z = afftVarF != null && afftVarF.equals(affpVar.b());
        afnx afnxVar = new afnx(this, afftVarF, z);
        this.f = afnxVar;
        if (afftVarF == null || afnxVar.c > 0) {
            afto aftoVar = this.q;
            afil afilVar = this.b;
            afem afemVar4 = this.g;
            afun afunVar = aftoVar.b;
            if (afunVar.T) {
                afuy afuyVar2 = (afuy) afemVar4.h(afuy.a);
                aftnVar = new aftn(aftoVar, afilVar, afihVar, afemVar4, afuyVar2 == null ? null : afuyVar2.f, afuyVar2 != null ? afuyVar2.g : null, affpVar);
            } else {
                afev[] afevVarArrK = afrq.k(afemVar4);
                affp affpVarA = affpVar.a();
                try {
                    aftnVar = afunVar.A.b(afilVar, afihVar, afemVar4, afevVarArrK);
                } finally {
                    affpVar.f(affpVarA);
                }
            }
            this.h = aftnVar;
        } else {
            afev[] afevVarArrK2 = afrq.k(this.g);
            String str2 = true != z ? "CallOptions" : "Context";
            Long l3 = (Long) this.g.h(afev.f);
            double d = this.f.c;
            double d2 = a;
            this.h = new afqz(Status.e.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str2, Double.valueOf(d / d2), Double.valueOf(l3 == null ? 0.0d : l3.longValue() / d2))), afof.PROCESSED, afevVarArrK2);
        }
        if (this.m) {
            this.h.d();
        }
        afem afemVar5 = this.g;
        String str3 = afemVar5.d;
        Integer num5 = afemVar5.h;
        if (num5 != null) {
            this.h.s(num5.intValue());
        }
        Integer num6 = this.g.i;
        if (num6 != null) {
            this.h.t(num6.intValue());
        }
        if (afftVarF != null) {
            this.h.q(afftVarF);
        }
        this.h.f(affaVar);
        this.h.r(this.j);
        this.d.b();
        this.h.u(new afoc(this, afepVar));
        afnx afnxVar2 = this.f;
        if (afnxVar2.e) {
            return;
        }
        if (afnxVar2.b && !afnxVar2.a && (scheduledExecutorService = afnxVar2.f.i) != null) {
            afnxVar2.d = scheduledExecutorService.schedule(new aftd(afnxVar2), afnxVar2.c, TimeUnit.NANOSECONDS);
        }
        afnxVar2.f.e.d(afnxVar2, zwk.a);
        if (afnxVar2.e) {
            afnxVar2.c();
        }
    }

    @Override // defpackage.afeq
    public final void b(String str, Throwable th) {
        int i = agfd.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        try {
            if (this.h != null) {
                Status status = Status.b;
                Status statusWithDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
                if (th != null) {
                    statusWithDescription = statusWithDescription.c(th);
                }
                this.h.n(statusWithDescription);
            }
            afnx afnxVar = this.f;
            if (afnxVar != null) {
                afnxVar.c();
            }
        } finally {
        }
    }

    @Override // defpackage.afeq
    public final void c() {
        int i = agfd.a;
        yqw.M(this.h != null, "Not started");
        yqw.M(!this.o, "call was cancelled");
        yqw.M(!this.p, "call already half-closed");
        this.p = true;
        this.h.p();
    }

    @Override // defpackage.afeq
    public final void d(int i) {
        int i2 = agfd.a;
        yqw.M(this.h != null, "Not started");
        yqw.B(i >= 0, "Number requested must be non-negative");
        this.h.e(i);
    }

    @Override // defpackage.afeq
    public final void e(Object obj) {
        int i = agfd.a;
        h(obj);
    }

    public final afft f() {
        afft afftVar = this.g.b;
        afft afftVarB = this.e.b();
        if (afftVar != null) {
            if (afftVarB != null) {
                afftVar.d(afftVarB);
                if (true != afftVar.e(afftVarB)) {
                }
            }
            return afftVar;
        }
        return afftVarB;
    }

    public final void g(afep afepVar, Status status, afih afihVar) {
        try {
            afepVar.a(status, afihVar);
        } catch (RuntimeException e) {
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
        }
    }

    @Override // defpackage.afeq
    public final boolean k() {
        if (this.p) {
            return false;
        }
        return this.h.i();
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("method", this.b);
        return yqqVarB.toString();
    }
}
