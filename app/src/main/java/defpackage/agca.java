package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agca implements afot, agbf, agcm {
    private static final Map J;
    public static final Logger a;
    static final boolean b;
    public aftc A;
    public boolean B;
    public long C;
    public long D;
    public final Runnable E;
    public final int F;
    public final Map G;
    final afgh H;
    int I;
    private final Random K = new Random();
    private final afgr L;
    private int M;
    private final afyq N;
    private final ScheduledExecutorService O;
    private final int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private final agae T;
    private final afrx U;
    public Socket c;
    public SSLSession d;
    public final InetSocketAddress e;
    public final String f;
    public final String g;
    public final int h;
    public afvb i;
    public agbg j;
    public agco k;
    public final Object l;
    public final Map m;
    public final Executor n;
    public int o;
    public agby p;
    public afeh q;
    public Status r;
    public afrw s;
    public final SocketFactory t;
    public SSLSocketFactory u;
    public HostnameVerifier v;
    public Socket w;
    public int x;
    public final Deque y;
    public final agcs z;

    static {
        EnumMap enumMap = new EnumMap(agdg.class);
        enumMap.put((EnumMap) agdg.NO_ERROR, (agdg) Status.k.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) agdg.PROTOCOL_ERROR, (agdg) Status.k.withDescription("Protocol error"));
        enumMap.put((EnumMap) agdg.INTERNAL_ERROR, (agdg) Status.k.withDescription("Internal error"));
        enumMap.put((EnumMap) agdg.FLOW_CONTROL_ERROR, (agdg) Status.k.withDescription("Flow control error"));
        enumMap.put((EnumMap) agdg.STREAM_CLOSED, (agdg) Status.k.withDescription("Stream closed"));
        enumMap.put((EnumMap) agdg.FRAME_TOO_LARGE, (agdg) Status.k.withDescription("Frame too large"));
        enumMap.put((EnumMap) agdg.REFUSED_STREAM, (agdg) Status.l.withDescription("Refused stream"));
        enumMap.put((EnumMap) agdg.CANCEL, (agdg) Status.b.withDescription("Cancelled"));
        enumMap.put((EnumMap) agdg.COMPRESSION_ERROR, (agdg) Status.k.withDescription("Compression error"));
        enumMap.put((EnumMap) agdg.CONNECT_ERROR, (agdg) Status.k.withDescription("Connect error"));
        enumMap.put((EnumMap) agdg.ENHANCE_YOUR_CALM, (agdg) Status.h.withDescription("Enhance your calm"));
        enumMap.put((EnumMap) agdg.INADEQUATE_SECURITY, (agdg) Status.f.withDescription("Inadequate security"));
        J = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(agca.class.getName());
        b = afrq.i("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public agca(agbn agbnVar, InetSocketAddress inetSocketAddress, String str, String str2, afeh afehVar, yrp yrpVar, afgh afghVar, Runnable runnable) {
        Object obj = new Object();
        this.l = obj;
        this.m = new HashMap();
        this.x = 0;
        this.y = new LinkedList();
        this.G = new agbz();
        this.U = new agbt(this);
        this.I = 30000;
        inetSocketAddress.getClass();
        this.e = inetSocketAddress;
        this.f = str;
        this.P = 4194304;
        this.h = 65535;
        Executor executor = agbnVar.a;
        executor.getClass();
        this.n = executor;
        this.N = new afyq(agbnVar.a);
        ScheduledExecutorService scheduledExecutorService = agbnVar.b;
        scheduledExecutorService.getClass();
        this.O = scheduledExecutorService;
        this.M = 3;
        this.t = SocketFactory.getDefault();
        this.u = agbnVar.d;
        this.v = agcw.a;
        agcs agcsVar = agbnVar.e;
        agcsVar.getClass();
        this.z = agcsVar;
        yrpVar.getClass();
        this.g = afrq.e("okhttp", str2);
        this.H = afghVar;
        this.E = runnable;
        this.F = Integer.MAX_VALUE;
        this.T = agbnVar.c.a();
        this.L = afgr.a(afgr.b(getClass()), inetSocketAddress.toString());
        afeh afehVar2 = afeh.a;
        afef afefVar = new afef(afeh.a);
        afefVar.b(afri.b, afehVar);
        this.q = afefVar.a();
        synchronized (obj) {
        }
    }

    static Status h(agdg agdgVar) {
        Status status = (Status) J.get(agdgVar);
        if (status != null) {
            return status;
        }
        return Status.c.withDescription("Unknown http2 error code: " + agdgVar.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(defpackage.ahxq r20) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agca.j(ahxq):java.lang.String");
    }

    private final Status t() {
        synchronized (this.l) {
            Status status = this.r;
            if (status != null) {
                return status;
            }
            return Status.l.withDescription("Connection closed");
        }
    }

    private final void u() {
        if (this.r == null || !this.m.isEmpty() || !this.y.isEmpty() || this.R) {
            return;
        }
        this.R = true;
        aftc aftcVar = this.A;
        if (aftcVar != null) {
            aftcVar.e();
        }
        afrw afrwVar = this.s;
        if (afrwVar != null) {
            Status statusT = t();
            synchronized (afrwVar) {
                if (!afrwVar.d) {
                    afrwVar.d = true;
                    afrwVar.e = statusT;
                    Map map = afrwVar.c;
                    afrwVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        afrw.a((Executor) entry.getValue(), new afrv((afta) entry.getKey()));
                    }
                }
            }
            this.s = null;
        }
        if (!this.Q) {
            this.Q = true;
            this.j.i(agdg.NO_ERROR, new byte[0]);
        }
        this.j.close();
    }

    @Override // defpackage.afot
    public final afeh a() {
        return this.q;
    }

    @Override // defpackage.afoh
    public final /* bridge */ /* synthetic */ afoe b(afil afilVar, afih afihVar, afem afemVar, afev[] afevVarArr) {
        agbs agbsVar;
        afzw afzwVarH = afzw.h(afevVarArr, this.q);
        Object obj = this.l;
        synchronized (obj) {
            agbsVar = new agbs(afilVar, afihVar, this.j, this, this.k, obj, this.P, this.h, this.f, this.g, afzwVarH, this.T, afemVar);
        }
        return agbsVar;
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return this.L;
    }

    @Override // defpackage.afvc
    public final Runnable d(afvb afvbVar) throws Throwable {
        this.i = afvbVar;
        if (this.B) {
            aftc aftcVar = new aftc(new aftb(this), this.O, this.C, this.D);
            this.A = aftcVar;
            aftcVar.d();
        }
        agbe agbeVar = new agbe(this.N, this);
        agbc agbcVar = new agbc(agbeVar, new agdq(new ahxi(agbeVar)));
        synchronized (this.l) {
            try {
                this.j = new agbg(this, agbcVar);
                this.k = new agco(this, this.j);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.N.execute(new agbv(this, countDownLatch, cyclicBarrier, agbeVar, countDownLatch2));
        this.n.execute(new agbw(cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.l) {
                agbg agbgVar = this.j;
                try {
                    ((agbh) agbgVar.b).b.b();
                } catch (IOException e) {
                    agbgVar.a.e(e);
                }
                agdu agduVar = new agdu();
                agduVar.c(7, this.h);
                agbg agbgVar2 = this.j;
                agbgVar2.c.f(2, agduVar);
                try {
                    ((agbh) agbgVar2.b).b.g(agduVar);
                } catch (IOException e2) {
                    agbgVar2.a.e(e2);
                }
            }
            countDownLatch.countDown();
            this.N.execute(new agbx(this));
            return null;
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // defpackage.agbf
    public final void e(Throwable th) {
        o(0, agdg.INTERNAL_ERROR, Status.l.c(th));
    }

    @Override // defpackage.afvc
    public final void f(Status status) {
        synchronized (this.l) {
            if (this.r != null) {
                return;
            }
            this.r = status;
            this.i.c(status);
            u();
        }
    }

    @Override // defpackage.afvc
    public final void g(Status status) {
        f(status);
        synchronized (this.l) {
            Iterator it = this.m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((agbs) entry.getValue()).f.j(status, afof.PROCESSED, false, new afih());
                l((agbs) entry.getValue());
            }
            Deque<agbs> deque = this.y;
            for (agbs agbsVar : deque) {
                agbsVar.f.j(status, afof.MISCARRIED, true, new afih());
                l(agbsVar);
            }
            deque.clear();
            u();
        }
    }

    @Override // defpackage.afoh
    public final void i(afta aftaVar, Executor executor) {
        long jNextLong;
        synchronized (this.l) {
            boolean z = true;
            yqw.L(this.j != null);
            if (this.R) {
                t();
                int i = afrw.f;
                afrw.a(executor, new afrv(aftaVar));
                return;
            }
            afrw afrwVar = this.s;
            if (afrwVar != null) {
                jNextLong = 0;
                z = false;
            } else {
                jNextLong = this.K.nextLong();
                yrn yrnVar = new yrn();
                yrnVar.e();
                afrw afrwVar2 = new afrw(jNextLong, yrnVar);
                this.s = afrwVar2;
                this.T.f++;
                afrwVar = afrwVar2;
            }
            if (z) {
                this.j.e(false, (int) (jNextLong >>> 32), (int) jNextLong);
            }
            synchronized (afrwVar) {
                if (afrwVar.d) {
                    afrw.a(executor, afrwVar.e != null ? new afrv(aftaVar) : new afru());
                } else {
                    afrwVar.c.put(aftaVar, executor);
                }
            }
        }
    }

    final void k(int i, Status status, afof afofVar, boolean z, agdg agdgVar, afih afihVar) {
        synchronized (this.l) {
            agbs agbsVar = (agbs) this.m.remove(Integer.valueOf(i));
            if (agbsVar != null) {
                if (agdgVar != null) {
                    this.j.f(i, agdg.CANCEL);
                }
                if (status != null) {
                    agbr agbrVar = agbsVar.f;
                    if (afihVar == null) {
                        afihVar = new afih();
                    }
                    agbrVar.j(status, afofVar, z, afihVar);
                }
                if (!r()) {
                    u();
                }
                l(agbsVar);
            }
        }
    }

    public final void l(agbs agbsVar) {
        if (this.S && this.y.isEmpty() && this.m.isEmpty()) {
            this.S = false;
            aftc aftcVar = this.A;
            if (aftcVar != null) {
                aftcVar.c();
            }
        }
        if (agbsVar.s) {
            this.U.c(agbsVar, false);
        }
    }

    public final void m(agdg agdgVar, String str) {
        o(0, agdgVar, h(agdgVar).a(str));
    }

    public final void n(agbs agbsVar) {
        if (!this.S) {
            this.S = true;
            aftc aftcVar = this.A;
            if (aftcVar != null) {
                aftcVar.b();
            }
        }
        if (agbsVar.s) {
            this.U.c(agbsVar, true);
        }
    }

    public final void o(int i, agdg agdgVar, Status status) {
        synchronized (this.l) {
            if (this.r == null) {
                this.r = status;
                this.i.c(status);
            }
            if (agdgVar != null && !this.Q) {
                this.Q = true;
                this.j.i(agdgVar, new byte[0]);
            }
            Iterator it = this.m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((agbs) entry.getValue()).f.j(status, afof.REFUSED, false, new afih());
                    l((agbs) entry.getValue());
                }
            }
            Deque<agbs> deque = this.y;
            for (agbs agbsVar : deque) {
                agbsVar.f.j(status, afof.MISCARRIED, true, new afih());
                l(agbsVar);
            }
            deque.clear();
            u();
        }
    }

    public final void p(agbs agbsVar) {
        agbr agbrVar = agbsVar.f;
        yqw.M(agbrVar.w == -1, "StreamId already assigned");
        this.m.put(Integer.valueOf(this.M), agbsVar);
        n(agbsVar);
        int i = this.M;
        yqw.P(agbrVar.w == -1, "the stream has been started with id %s", i);
        agbrVar.w = i;
        agco agcoVar = agbrVar.h;
        agbrVar.v = new agcl(agcoVar, i, agcoVar.c, agbrVar);
        agbs agbsVar2 = agbrVar.x;
        agbsVar2.f.d();
        if (agbrVar.t) {
            agbg agbgVar = agbrVar.g;
            try {
                ((agbh) agbgVar.b).b.j(false, agbrVar.w, agbrVar.b);
            } catch (IOException e) {
                agbgVar.a.e(e);
            }
            agbsVar2.d.a();
            agbrVar.b = null;
            ahwx ahwxVar = agbrVar.c;
            if (ahwxVar.b > 0) {
                agcoVar.a(agbrVar.d, agbrVar.v, ahwxVar, agbrVar.e);
            }
            agbrVar.t = false;
        }
        afik afikVar = agbsVar.b.a;
        if (afikVar == afik.UNARY || afikVar == afik.SERVER_STREAMING) {
            boolean z = agbsVar.g;
        } else {
            this.j.d();
        }
        int i2 = this.M;
        if (i2 < 2147483645) {
            this.M = i2 + 2;
        } else {
            this.M = Integer.MAX_VALUE;
            o(Integer.MAX_VALUE, agdg.NO_ERROR, Status.l.withDescription("Stream ids exhausted"));
        }
    }

    final boolean q(int i) {
        boolean z;
        synchronized (this.l) {
            z = false;
            if (i < this.M && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final boolean r() {
        boolean z = false;
        while (true) {
            Deque deque = this.y;
            if (deque.isEmpty() || this.m.size() >= this.x) {
                break;
            }
            p((agbs) deque.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.agcm
    public final agcl[] s() {
        agcl[] agclVarArr;
        synchronized (this.l) {
            Map map = this.m;
            agclVarArr = new agcl[map.size()];
            Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                agclVarArr[i] = ((agbs) it.next()).f.f();
                i++;
            }
        }
        return agclVarArr;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("logId", String.valueOf(this.L.a));
        yqqVarB.b("address", this.e);
        return yqqVarB.toString();
    }
}
