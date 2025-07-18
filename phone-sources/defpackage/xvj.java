package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvj extends xqb {
    public static final Logger a = Logger.getLogger(xvj.class.getName());
    public static final double b;
    public final xsq c;
    public final Executor d;
    public final xva e;
    public final xqo f;
    public xvd g;
    public xpy h;
    public xvk i;
    public final ScheduledExecutorService j;
    public xqs k = xqs.b;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final xyc p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        b = TimeUnit.SECONDS.toNanos(1L);
    }

    public xvj(xsq xsqVar, Executor executor, xpy xpyVar, xyc xycVar, ScheduledExecutorService scheduledExecutorService, xva xvaVar) {
        xqi xqiVar = xqi.a;
        this.c = xsqVar;
        String str = xsqVar.b;
        System.identityHashCode(this);
        int i = yfl.a;
        if (executor == ugk.a) {
            this.d = new ybg();
            this.l = true;
        } else {
            this.d = new ybk(executor);
            this.l = false;
        }
        this.e = xvaVar;
        this.f = xqo.b();
        xsp xspVar = xsqVar.a;
        this.m = xspVar == xsp.UNARY || xspVar == xsp.SERVER_STREAMING;
        this.h = xpyVar;
        this.p = xycVar;
        this.j = scheduledExecutorService;
    }

    private final void g(Object obj) {
        sij.x(this.i != null, "Not started");
        sij.x(!this.n, "call was cancelled");
        sij.x(!this.o, "call was half-closed");
        try {
            xvk xvkVar = this.i;
            if (xvkVar instanceof ybb) {
                ybb ybbVar = (ybb) xvkVar;
                yax yaxVar = ybbVar.r;
                if (yaxVar.a) {
                    yaxVar.f.a.w(ybbVar.f.b(obj));
                } else {
                    ybbVar.e(new yaq(ybbVar, obj));
                }
            } else {
                xvkVar.w(this.c.b(obj));
            }
            if (this.m) {
                return;
            }
            this.i.r();
        } catch (Error e) {
            this.i.h(xtk.c.e("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.i.h(xtk.c.d(e2).e("Failed to stream message"));
        }
    }

    @Override // defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        xvk ybbVar;
        ScheduledExecutorService scheduledExecutorService;
        xpy xpyVar;
        int i = yfl.a;
        sij.x(this.i == null, "Already started");
        sij.x(!this.n, "call was cancelled");
        wbbVar.getClass();
        xsmVar.getClass();
        xqo xqoVar = this.f;
        xza xzaVar = (xza) this.h.g(xza.a);
        if (xzaVar != null) {
            Long l = xzaVar.b;
            if (l != null) {
                xqp xqpVarC = xqp.c(l.longValue(), TimeUnit.NANOSECONDS);
                xqp xqpVar = this.h.b;
                if (xqpVar == null || xqpVarC.compareTo(xqpVar) < 0) {
                    this.h = this.h.b(xqpVarC);
                }
            }
            Boolean bool = xzaVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    xpw xpwVarA = xpy.a(this.h);
                    xpwVarA.e = Boolean.TRUE;
                    xpyVar = new xpy(xpwVarA);
                } else {
                    xpw xpwVarA2 = xpy.a(this.h);
                    xpwVarA2.e = Boolean.FALSE;
                    xpyVar = new xpy(xpwVarA2);
                }
                this.h = xpyVar;
            }
            Integer num = xzaVar.d;
            if (num != null) {
                xpy xpyVar2 = this.h;
                Integer num2 = xpyVar2.f;
                if (num2 != null) {
                    this.h = xpyVar2.d(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.h = xpyVar2.d(num.intValue());
                }
            }
            Integer num3 = xzaVar.e;
            if (num3 != null) {
                xpy xpyVar3 = this.h;
                Integer num4 = xpyVar3.g;
                if (num4 != null) {
                    this.h = xpyVar3.e(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.h = xpyVar3.e(num3.intValue());
                }
            }
        }
        xqg xqgVar = xqf.a;
        xqs xqsVar = this.k;
        xsmVar.f(xxc.f);
        xsmVar.f(xxc.b);
        xsj xsjVar = xxc.c;
        xsmVar.f(xsjVar);
        byte[] bArr = xqsVar.d;
        if (bArr.length != 0) {
            xsmVar.h(xsjVar, bArr);
        }
        xsmVar.f(xxc.d);
        xsmVar.f(xxc.e);
        xqp xqpVarB = b();
        boolean z = xqpVarB != null && xqpVarB.equals(null);
        xvd xvdVar = new xvd(this, xqpVarB, z);
        this.g = xvdVar;
        if (xqpVarB == null || xvdVar.c > 0) {
            xyc xycVar = this.p;
            xsq xsqVar = this.c;
            xpy xpyVar4 = this.h;
            xyr xyrVar = xycVar.b;
            if (xyrVar.O) {
                xza xzaVar2 = (xza) xpyVar4.g(xza.a);
                ybbVar = new ybb(xycVar, xsqVar, xsmVar, xpyVar4, xzaVar2 == null ? null : xzaVar2.f, xzaVar2 != null ? xzaVar2.g : null, xqoVar);
            } else {
                xqe[] xqeVarArrK = xxc.k(xpyVar4, 0, false);
                xqo xqoVarA = xqoVar.a();
                try {
                    ybbVar = xyrVar.y.a(xsqVar, xsmVar, xpyVar4, xqeVarArrK);
                } finally {
                    xqoVar.c(xqoVarA);
                }
            }
            this.i = ybbVar;
        } else {
            xqe[] xqeVarArrK2 = xxc.k(this.h, 0, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.h.g(xqe.f);
            double d = this.g.c;
            double d2 = b;
            this.i = new xwr(xtk.e.e(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), xqeVarArrK2);
        }
        if (this.l) {
            this.i.t();
        }
        xpy xpyVar5 = this.h;
        String str2 = xpyVar5.d;
        Integer num5 = xpyVar5.f;
        if (num5 != null) {
            this.i.m(num5.intValue());
        }
        Integer num6 = this.h.g;
        if (num6 != null) {
            this.i.n(num6.intValue());
        }
        if (xqpVarB != null) {
            this.i.k(xqpVarB);
        }
        this.i.v(xqgVar);
        this.i.l(this.k);
        this.e.b();
        this.i.o(new xvi(this, wbbVar));
        xvd xvdVar2 = this.g;
        if (xvdVar2.e) {
            return;
        }
        if (xvdVar2.b && !xvdVar2.a && (scheduledExecutorService = xvdVar2.f.j) != null) {
            xvdVar2.d = scheduledExecutorService.schedule(new xxx(xvdVar2), xvdVar2.c, TimeUnit.NANOSECONDS);
        }
        xvj xvjVar = xvdVar2.f;
        xqo.d(ugk.a, "executor");
        if (xvdVar2.e) {
            xvdVar2.b();
        }
    }

    public final xqp b() {
        xqp xqpVar = this.h.b;
        if (xqpVar == null) {
            return null;
        }
        return xqpVar;
    }

    @Override // defpackage.xqb
    public final void c(String str, Throwable th) {
        int i = yfl.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            a.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            if (this.i != null) {
                xtk xtkVar = xtk.c;
                xtk xtkVarE = str != null ? xtkVar.e(str) : xtkVar.e("Call cancelled without message");
                if (th != null) {
                    xtkVarE = xtkVarE.d(th);
                }
                this.i.h(xtkVarE);
            }
            xvd xvdVar = this.g;
            if (xvdVar != null) {
                xvdVar.b();
            }
        } finally {
        }
    }

    @Override // defpackage.xqb
    public final void d() {
        int i = yfl.a;
        sij.x(this.i != null, "Not started");
        sij.x(!this.n, "call was cancelled");
        sij.x(!this.o, "call already half-closed");
        this.o = true;
        this.i.j();
    }

    @Override // defpackage.xqb
    public final void e(int i) {
        int i2 = yfl.a;
        sij.x(this.i != null, "Not started");
        sij.o(i >= 0, "Number requested must be non-negative");
        this.i.u(i);
    }

    @Override // defpackage.xqb
    public final void f(Object obj) {
        int i = yfl.a;
        g(obj);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("method", this.c);
        return tssVarH.toString();
    }
}
