package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyr extends xsa implements xrd {
    static final Logger a = Logger.getLogger(xyr.class.getName());
    static final xtk b;
    static final xtk c;
    public static final xzc d;
    public static final xrc e;
    public static final xrq f;
    public static final xqb g;
    public final AtomicBoolean A;
    public boolean B;
    public volatile boolean C;
    public final xva D;
    public final xvc E;
    public final xqa F;
    public final xrb G;
    public final xyn H;
    public xzc I;
    public final xzc J;
    public boolean K;
    public final boolean L;
    public final long M;
    public final long N;
    public final boolean O;
    final xxh P;
    public final xyc Q;
    public int R;
    public final zft S;
    public final upo T;
    private final String U;
    private final URI V;
    private final xsy W;
    private final xss X;
    private final xzo Y;
    private final xyg Z;
    private final xyg aa;
    private final long ab;
    private final xpz ac;
    private final Set ad;
    private final CountDownLatch ae;
    private final xzd af;
    private final yal ag;
    private final ybn ah;
    private final ulo ai;
    public final xre h;
    public final xvp i;
    public final xyo j;
    public final Executor k;
    public final ybv l;
    final xtq m;
    public final xqs n;
    public final xvw o;
    public final List p;
    public final String q;
    public xsx r;
    public boolean s;
    public xyi t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final xwh y;
    public final xyq z;

    static {
        xtk.k.e("Channel shutdownNow invoked");
        b = xtk.k.e("Channel shutdown invoked");
        c = xtk.k.e("Subchannel shutdown invoked");
        d = new xzc(null, new HashMap(), new HashMap(), null, null, null);
        e = new xxz();
        f = new xzp();
        g = new xyb();
    }

    public xyr(xyx xyxVar, xvp xvpVar, URI uri, xsy xsyVar, xzo xzoVar, ttm ttmVar, List list, ybv ybvVar) {
        xtq xtqVar = new xtq(new xya(this));
        this.m = xtqVar;
        this.o = new xvw();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.ad = new HashSet(1, 0.75f);
        this.z = new xyq(this);
        this.A = new AtomicBoolean(false);
        this.ae = new CountDownLatch(1);
        this.R = 1;
        this.I = d;
        this.K = false;
        this.T = new upo((char[]) null);
        wbb wbbVar = xqp.c;
        xyf xyfVar = new xyf(this);
        this.af = xyfVar;
        this.P = new xyh(this);
        xyc xycVar = new xyc(this);
        this.Q = xycVar;
        String str = xyxVar.l;
        str.getClass();
        this.U = str;
        xre xreVarB = xre.b("Channel", str);
        this.h = xreVarB;
        ybvVar.getClass();
        this.l = ybvVar;
        xzo xzoVar2 = xyxVar.g;
        xzoVar2.getClass();
        this.Y = xzoVar2;
        Executor executor = (Executor) xzoVar2.a();
        executor.getClass();
        this.k = executor;
        xzo xzoVar3 = xyxVar.h;
        xzoVar3.getClass();
        xyg xygVar = new xyg(xzoVar3);
        this.aa = xygVar;
        xuz xuzVar = new xuz(xvpVar, xygVar);
        this.i = xuzVar;
        new xuz(xvpVar, xygVar);
        xyo xyoVar = new xyo(xuzVar.c());
        this.j = xyoVar;
        xvc xvcVar = new xvc(xreVarB, ybvVar.a(), "Channel for '" + str + "'");
        this.E = xvcVar;
        xvb xvbVar = new xvb(xvcVar, ybvVar);
        this.F = xvbVar;
        xte xteVar = xxc.k;
        boolean z = xyxVar.r;
        this.O = z;
        ulo uloVar = new ulo(xrz.b());
        this.ai = uloVar;
        this.V = uri;
        this.W = xsyVar;
        xsw xswVar = new xsw(z, uloVar);
        ykn.F();
        ybn ybnVar = new ybn();
        this.ah = ybnVar;
        xsr xsrVar = new xsr();
        xsrVar.a = 443;
        xteVar.getClass();
        xsrVar.b = xteVar;
        xsrVar.c = xtqVar;
        xsrVar.e = xyoVar;
        xsrVar.d = xswVar;
        xsrVar.f = xvbVar;
        xsrVar.g = xygVar;
        xsrVar.h = ybnVar;
        xss xssVar = new xss(xsrVar);
        this.X = xssVar;
        this.r = k(uri, xsyVar, xssVar);
        this.Z = new xyg(xzoVar);
        xwh xwhVar = new xwh(executor, xtqVar);
        this.y = xwhVar;
        xwhVar.f = xyfVar;
        xwhVar.c = new xwf(xyfVar, 1);
        xwhVar.d = new xwf(xyfVar, 0);
        xwhVar.e = new xwf(xyfVar, 2);
        Map map = xyxVar.t;
        if (map != null) {
            xst xstVarA = xswVar.a(map);
            xtk xtkVar = xstVarA.a;
            sij.z(xtkVar == null, "Default config is invalid: %s", xtkVar);
            xzc xzcVar = (xzc) xstVarA.b;
            this.J = xzcVar;
            xycVar.a = xzcVar.a;
        } else {
            this.J = null;
        }
        this.L = true;
        xyn xynVar = new xyn(this, this.r.a());
        this.H = xynVar;
        this.ac = wbb.x(xynVar, list);
        this.p = new ArrayList(xyxVar.k);
        ttmVar.getClass();
        long j = xyxVar.q;
        if (j == -1) {
            this.ab = -1L;
        } else {
            sij.r(j >= xyx.c, "invalid idleTimeoutMillis %s", j);
            this.ab = xyxVar.q;
        }
        this.ag = new yal(new xwf(this, 18), xtqVar, xuzVar.c(), new ttl());
        xqs xqsVar = xyxVar.o;
        xqsVar.getClass();
        this.n = xqsVar;
        xyxVar.p.getClass();
        this.q = xyxVar.m;
        this.N = 16777216L;
        this.M = 1048576L;
        zft zftVar = new zft(ybvVar, null);
        this.S = zftVar;
        this.D = zftVar.b();
        xrb xrbVar = xyxVar.s;
        xrbVar.getClass();
        this.G = xrbVar;
        xrb.a(xrbVar.c, this);
    }

    static xsx k(URI uri, xsy xsyVar, xss xssVar) {
        xsx xsxVarA = xsyVar.a(uri, xssVar);
        if (xsxVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
        }
        ScheduledExecutorService scheduledExecutorService = xssVar.e;
        if (scheduledExecutorService != null) {
            return new ybf(xsxVarA, new xux(scheduledExecutorService, xssVar.c));
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.xpz
    public final xqb a(xsq xsqVar, xpy xpyVar) {
        return this.ac.a(xsqVar, xpyVar);
    }

    @Override // defpackage.xpz
    public final String b() {
        return this.ac.b();
    }

    @Override // defpackage.xri
    public final xre c() {
        return this.h;
    }

    public final Executor d(xpy xpyVar) {
        Executor executor = xpyVar.c;
        return executor == null ? this.k : executor;
    }

    public final void e(boolean z) {
        ScheduledFuture scheduledFuture;
        yal yalVar = this.ag;
        yalVar.e = false;
        if (!z || (scheduledFuture = yalVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        yalVar.f = null;
    }

    final void f() {
        this.m.c();
        if (this.A.get() || this.u) {
            return;
        }
        if (this.P.a.isEmpty()) {
            h();
        } else {
            e(false);
        }
        if (this.t == null) {
            this.F.a(2, "Exiting idle mode");
            xyi xyiVar = new xyi(this);
            xyiVar.a = new xus(this.ai, xyiVar);
            this.t = xyiVar;
            this.o.a(xqk.CONNECTING);
            this.r.d(new xyj(this, xyiVar, this.r));
            this.s = true;
        }
    }

    public final void g() {
        if (!this.C && this.A.get() && this.v.isEmpty() && this.ad.isEmpty()) {
            this.F.a(2, "Terminated");
            xrb.b(this.G.c, this);
            this.Y.b(this.k);
            this.Z.b();
            this.aa.b();
            this.i.close();
            this.C = true;
            this.ae.countDown();
        }
    }

    public final void h() {
        long j = this.ab;
        if (j == -1) {
            return;
        }
        yal yalVar = this.ag;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jA = yalVar.a() + nanos;
        yalVar.e = true;
        if (jA - yalVar.d < 0 || yalVar.f == null) {
            ScheduledFuture scheduledFuture = yalVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            yalVar.f = yalVar.a.schedule(new xyp(yalVar, 7), nanos, TimeUnit.NANOSECONDS);
        }
        yalVar.d = jA;
    }

    public final void i(boolean z) {
        this.m.c();
        if (z) {
            sij.x(this.s, "nameResolver is not started");
            sij.x(this.t != null, "lbHelper is null");
        }
        xsx xsxVar = this.r;
        if (xsxVar != null) {
            xsxVar.c();
            this.s = false;
            if (z) {
                this.r = k(this.V, this.W, this.X);
            } else {
                this.r = null;
            }
        }
        xyi xyiVar = this.t;
        if (xyiVar != null) {
            xus xusVar = xyiVar.a;
            xusVar.b.d();
            xusVar.b = null;
            this.t = null;
        }
    }

    public final void j(xrv xrvVar) {
        this.y.d(xrvVar);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.e("logId", this.h.a);
        tssVarH.b("target", this.U);
        return tssVarH.toString();
    }
}
