package defpackage;

import io.grpc.Status;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afun extends afhq implements afgq {
    static final Logger a = Logger.getLogger(afun.class.getName());
    static final Status b;
    static final Status c;
    public static final afva d;
    public static final afgo e;
    public static final afhf f;
    public static final afeq g;
    public final afpu A;
    public final afum B;
    public final AtomicBoolean C;
    public boolean D;
    public volatile boolean E;
    public final CountDownLatch F;
    public final afnr G;
    public final afns H;
    public final afnu I;
    public final afeo J;
    public final afgm K;
    public final afuh L;
    public afva M;
    public final afva N;
    public boolean O;
    public final boolean P;
    public final afxo Q;
    public final long R;
    public final long S;
    public final boolean T;
    final afrx U;
    public final afto V;
    public final afwv W;
    public int X;
    public final afqx Y;
    private final String Z;
    private final URI aa;
    private final afiw ab;
    private final afio ac;
    private final afnl ad;
    private final afvo ae;
    private final afts af;
    private final afts ag;
    private final long ah;
    private final Set ai;
    private final afvb aj;
    private final afvm ak;
    public final afgr h;
    public final afoj i;
    public final afui j;
    public final Executor k;
    public final agaa l;
    public final afkc m;
    public final affw n;
    public final affb o;
    public final afov p;
    public final afen q;
    public final List r;
    public final String s;
    public afiv t;
    public boolean u;
    public aftw v;
    public boolean w;
    public final Set x;
    public Collection y;
    public final Object z;

    static {
        Status.l.withDescription("Channel shutdownNow invoked");
        b = Status.l.withDescription("Channel shutdown invoked");
        c = Status.l.withDescription("Subchannel shutdown invoked");
        d = new afva(null, new HashMap(), new HashMap(), null, null, null);
        e = new aftg();
        f = new aftk();
        g = new aftm();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public afun(afuv afuvVar, afoj afojVar, URI uri, afiw afiwVar, afqx afqxVar, afvo afvoVar, yrp yrpVar, List list, agaa agaaVar) {
        afkc afkcVar = new afkc(new aftl(this));
        this.m = afkcVar;
        this.p = new afov();
        this.x = new HashSet(16, 0.75f);
        this.z = new Object();
        this.ai = new HashSet(1, 0.75f);
        this.B = new afum(this);
        this.C = new AtomicBoolean(false);
        this.F = new CountDownLatch(1);
        this.X = 1;
        this.M = d;
        this.O = false;
        this.Q = new afxo();
        affs affsVar = afft.a;
        aftr aftrVar = new aftr(this);
        this.aj = aftrVar;
        this.U = new aftt(this);
        this.V = new afto(this);
        String str = afuvVar.j;
        str.getClass();
        this.Z = str;
        afgr afgrVarA = afgr.a("Channel", str);
        this.h = afgrVarA;
        agaaVar.getClass();
        this.l = agaaVar;
        afvo afvoVar2 = afuvVar.f;
        afvoVar2.getClass();
        this.ae = afvoVar2;
        ?? A = afvoVar2.a();
        A.getClass();
        this.k = A;
        afvo afvoVar3 = afuvVar.g;
        afvoVar3.getClass();
        afts aftsVar = new afts(afvoVar3);
        this.ag = aftsVar;
        afnq afnqVar = new afnq(afojVar, aftsVar);
        this.i = afnqVar;
        new afnq(afojVar, aftsVar);
        afui afuiVar = new afui(afnqVar.c());
        this.j = afuiVar;
        afnu afnuVar = new afnu(afgrVarA, agaaVar.a(), "Channel for '" + str + "'");
        this.I = afnuVar;
        afnt afntVar = new afnt(afnuVar, agaaVar);
        this.J = afntVar;
        afjg afjgVar = afrq.k;
        this.T = true;
        afnl afnlVar = new afnl(afhp.b());
        this.ad = afnlVar;
        this.aa = uri;
        this.ab = afiwVar;
        afyl afylVar = new afyl(true, afnlVar);
        afim.a();
        afvm afvmVar = new afvm();
        this.ak = afvmVar;
        afin afinVar = new afin();
        afinVar.a = 443;
        afjgVar.getClass();
        afinVar.b = afjgVar;
        afinVar.c = afkcVar;
        afinVar.e = afuiVar;
        afinVar.d = afylVar;
        afinVar.f = afntVar;
        afinVar.g = aftsVar;
        afinVar.h = afvmVar;
        afio afioVar = new afio(afinVar);
        this.ac = afioVar;
        this.t = l(uri, afiwVar, afioVar);
        this.af = new afts(afvoVar);
        afpu afpuVar = new afpu(A, afkcVar);
        this.A = afpuVar;
        afpuVar.f = aftrVar;
        afpuVar.c = new afpo(aftrVar);
        afpuVar.d = new afpp(aftrVar);
        afpuVar.e = new afpq(aftrVar);
        this.Y = afqxVar;
        this.N = null;
        this.P = true;
        afuh afuhVar = new afuh(this, ((afrg) this.t).a.a());
        this.L = afuhVar;
        this.q = afet.a(afuhVar, list);
        this.r = new ArrayList(afuvVar.i);
        yrpVar.getClass();
        long j = afuvVar.o;
        if (j == -1) {
            this.ah = -1L;
        } else {
            yqw.E(j >= afuv.b, "invalid idleTimeoutMillis %s", j);
            this.ah = afuvVar.o;
        }
        this.W = new afwv(new aftu(this), afkcVar, afnqVar.c(), new yrn());
        affw affwVar = afuvVar.m;
        affwVar.getClass();
        this.n = affwVar;
        affb affbVar = afuvVar.n;
        affbVar.getClass();
        this.o = affbVar;
        this.s = afuvVar.k;
        this.S = 16777216L;
        this.R = 1048576L;
        afti aftiVar = new afti(agaaVar);
        this.G = aftiVar;
        this.H = aftiVar.a();
        afgm afgmVar = afuvVar.p;
        afgmVar.getClass();
        this.K = afgmVar;
        afgm.b(afgmVar.d, this);
    }

    static afiv l(URI uri, afiw afiwVar, afio afioVar) {
        afiv afivVarA = afiwVar.a(uri, afioVar);
        if (afivVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
        }
        ScheduledExecutorService scheduledExecutorService = afioVar.e;
        if (scheduledExecutorService != null) {
            return new afyk(afivVarA, new afnn(scheduledExecutorService, afioVar.c));
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.afen
    public final afeq a(afil afilVar, afem afemVar) {
        return this.q.a(afilVar, afemVar);
    }

    @Override // defpackage.afen
    public final String b() {
        return this.q.b();
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return this.h;
    }

    @Override // defpackage.afhq
    public final boolean d() {
        return this.C.get();
    }

    @Override // defpackage.afhq
    public final void e(long j, TimeUnit timeUnit) {
        throw null;
    }

    @Override // defpackage.afhq
    public final /* bridge */ /* synthetic */ void f() {
        throw null;
    }

    public final Executor g(afem afemVar) {
        Executor executor = afemVar.c;
        return executor == null ? this.k : executor;
    }

    final void h() {
        this.m.d();
        if (this.C.get() || this.w) {
            return;
        }
        if (this.U.a.isEmpty()) {
            j();
        } else {
            this.W.b(false);
        }
        if (this.v == null) {
            this.J.a(2, "Exiting idle mode");
            aftw aftwVar = new aftw(this);
            aftwVar.a = new afng(this.ad, aftwVar);
            this.v = aftwVar;
            this.p.a(affe.CONNECTING);
            this.t.d(new afty(this, aftwVar, this.t));
            this.u = true;
        }
    }

    public final void i() {
        if (!this.E && this.C.get() && this.x.isEmpty() && this.ai.isEmpty()) {
            this.J.a(2, "Terminated");
            afgm.c(this.K.d, this);
            this.ae.b(this.k);
            this.af.b();
            this.ag.b();
            this.i.close();
            this.E = true;
            this.F.countDown();
        }
    }

    public final void j() {
        long j = this.ah;
        if (j == -1) {
            return;
        }
        afwv afwvVar = this.W;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jA = afwvVar.a() + nanos;
        afwvVar.e = true;
        if (jA - afwvVar.d < 0 || afwvVar.f == null) {
            ScheduledFuture scheduledFuture = afwvVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            afwvVar.f = afwvVar.a.schedule(new afwu(afwvVar), nanos, TimeUnit.NANOSECONDS);
        }
        afwvVar.d = jA;
    }

    public final void k(boolean z) {
        this.m.d();
        if (z) {
            yqw.M(this.u, "nameResolver is not started");
            yqw.M(this.v != null, "lbHelper is null");
        }
        afiv afivVar = this.t;
        if (afivVar != null) {
            afivVar.c();
            this.u = false;
            if (z) {
                this.t = l(this.aa, this.ab, this.ac);
            } else {
                this.t = null;
            }
        }
        aftw aftwVar = this.v;
        if (aftwVar != null) {
            afng afngVar = aftwVar.a;
            afngVar.b.d();
            afngVar.b = null;
            this.v = null;
        }
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("logId", String.valueOf(this.h.a));
        yqqVarB.b("target", this.Z);
        return yqqVarB.toString();
    }
}
