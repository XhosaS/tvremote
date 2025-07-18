package defpackage;

import android.support.v7.widget.ActivityChooserView;
import j$.util.DesugarCollections;
import java.io.EOFException;
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
/* loaded from: classes3.dex */
public final class ycz implements xvv, yci, ydj {
    private static final Map M;
    public static final Logger a;
    static final boolean b;
    public final Deque A;
    public final ydp B;
    public xxw C;
    public boolean D;
    public long E;
    public long F;
    public final Runnable G;
    public final int H;
    public final ybx I;
    public final Map J;
    final xqy K;
    int L;
    private final xre N;
    private int O;
    private final ybk P;
    private final ScheduledExecutorService Q;
    private final int R;
    private boolean S;
    private boolean T;
    private final xxh U;
    public Socket c;
    public SSLSession d;
    public final InetSocketAddress e;
    public final String f;
    public final String g;
    public final Random h = new Random();
    public final int i;
    public xzd j;
    public ycj k;
    public ydl l;
    public final Object m;
    public final Map n;
    public final Executor o;
    public int p;
    public ycx q;
    public xpv r;
    public xtk s;
    public xxg t;
    public boolean u;
    public final SocketFactory v;
    public SSLSocketFactory w;
    public HostnameVerifier x;
    public Socket y;
    public int z;

    static {
        EnumMap enumMap = new EnumMap(yea.class);
        enumMap.put((EnumMap) yea.NO_ERROR, (yea) xtk.j.e("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) yea.PROTOCOL_ERROR, (yea) xtk.j.e("Protocol error"));
        enumMap.put((EnumMap) yea.INTERNAL_ERROR, (yea) xtk.j.e("Internal error"));
        enumMap.put((EnumMap) yea.FLOW_CONTROL_ERROR, (yea) xtk.j.e("Flow control error"));
        enumMap.put((EnumMap) yea.STREAM_CLOSED, (yea) xtk.j.e("Stream closed"));
        enumMap.put((EnumMap) yea.FRAME_TOO_LARGE, (yea) xtk.j.e("Frame too large"));
        enumMap.put((EnumMap) yea.REFUSED_STREAM, (yea) xtk.k.e("Refused stream"));
        enumMap.put((EnumMap) yea.CANCEL, (yea) xtk.c.e("Cancelled"));
        enumMap.put((EnumMap) yea.COMPRESSION_ERROR, (yea) xtk.j.e("Compression error"));
        enumMap.put((EnumMap) yea.CONNECT_ERROR, (yea) xtk.j.e("Connect error"));
        enumMap.put((EnumMap) yea.ENHANCE_YOUR_CALM, (yea) xtk.h.e("Enhance your calm"));
        enumMap.put((EnumMap) yea.INADEQUATE_SECURITY, (yea) xtk.f.e("Inadequate security"));
        M = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(ycz.class.getName());
        b = xxc.h("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public ycz(ycp ycpVar, InetSocketAddress inetSocketAddress, String str, String str2, xpv xpvVar, ttm ttmVar, xqy xqyVar, Runnable runnable) {
        Object obj = new Object();
        this.m = obj;
        this.n = new HashMap();
        this.z = 0;
        this.A = new LinkedList();
        this.J = new ycy();
        this.U = new ycu(this);
        this.L = 30000;
        inetSocketAddress.getClass();
        this.e = inetSocketAddress;
        this.f = str;
        this.R = 4194304;
        this.i = 65535;
        Executor executor = ycpVar.a;
        executor.getClass();
        this.o = executor;
        this.P = new ybk(ycpVar.a);
        ScheduledExecutorService scheduledExecutorService = ycpVar.b;
        scheduledExecutorService.getClass();
        this.Q = scheduledExecutorService;
        this.O = 3;
        this.v = SocketFactory.getDefault();
        this.w = ycpVar.c;
        this.x = ydr.a;
        ydp ydpVar = ycpVar.d;
        ydpVar.getClass();
        this.B = ydpVar;
        ttmVar.getClass();
        this.g = xxc.e("okhttp", str2);
        this.K = xqyVar;
        this.G = runnable;
        this.H = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.I = ycpVar.e.b();
        this.N = xre.a(getClass(), inetSocketAddress.toString());
        xpv xpvVar2 = xpv.a;
        zlx zlxVar = new zlx(xpv.a);
        zlxVar.b(xwy.b, xpvVar);
        this.r = zlxVar.a();
        synchronized (obj) {
        }
    }

    static xtk h(yea yeaVar) {
        xtk xtkVar = (xtk) M.get(yeaVar);
        if (xtkVar != null) {
            return xtkVar;
        }
        return xtk.d.e("Unknown http2 error code: " + yeaVar.s);
    }

    public static String i(zho zhoVar) throws EOFException {
        zgk zgkVar = new zgk();
        while (zhoVar.a(zgkVar, 1L) != -1) {
            if (zgkVar.c(zgkVar.b - 1) == 10) {
                long jI = zgkVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (jI != -1) {
                    return zhs.a(zgkVar, jI);
                }
                zgk zgkVar2 = new zgk();
                zgkVar.G(zgkVar2, 0L, Math.min(32L, zgkVar.b));
                throw new EOFException("\\n not found: limit=" + Math.min(zgkVar.b, Long.MAX_VALUE) + " content=" + zgkVar2.s().g() + "…");
            }
        }
        throw new EOFException("\\n not found: ".concat(zgkVar.s().g()));
    }

    private final void s() {
        if (this.s == null || !this.n.isEmpty() || !this.A.isEmpty() || this.u) {
            return;
        }
        this.u = true;
        xxw xxwVar = this.C;
        if (xxwVar != null) {
            xxwVar.e();
        }
        xxg xxgVar = this.t;
        if (xxgVar != null) {
            xtk xtkVarG = g();
            synchronized (xxgVar) {
                if (!xxgVar.d) {
                    xxgVar.d = true;
                    xxgVar.e = xtkVarG;
                    Map map = xxgVar.c;
                    xxgVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        xxg.b((zft) entry.getKey(), (Executor) entry.getValue());
                    }
                }
            }
            this.t = null;
        }
        if (!this.S) {
            this.S = true;
            this.k.g(yea.NO_ERROR, new byte[0]);
        }
        this.k.close();
    }

    @Override // defpackage.xvn
    public final /* bridge */ /* synthetic */ xvk a(xsq xsqVar, xsm xsmVar, xpy xpyVar, xqe[] xqeVarArr) {
        yct yctVar;
        ybs ybsVarD = ybs.d(xqeVarArr, this.r);
        Object obj = this.m;
        synchronized (obj) {
            yctVar = new yct(xsqVar, xsmVar, this.k, this, this.l, obj, this.R, this.i, this.f, this.g, ybsVarD, this.I, xpyVar);
        }
        return yctVar;
    }

    @Override // defpackage.xze
    public final Runnable b(xzd xzdVar) throws Throwable {
        this.j = xzdVar;
        if (this.D) {
            xxw xxwVar = new xxw(new upo(this, (byte[]) null), this.Q, this.E, this.F);
            this.C = xxwVar;
            xxwVar.d();
        }
        ych ychVar = new ych(this.P, this);
        yck yckVar = new yck(ychVar, new yej(new zhg(ychVar)));
        synchronized (this.m) {
            try {
                this.k = new ycj(this, yckVar);
                this.l = new ydl(this, this.k);
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
        this.P.execute(new ycw(this, countDownLatch, cyclicBarrier, ychVar, countDownLatch2));
        this.o.execute(new xxl(cyclicBarrier, countDownLatch2, 11));
        try {
            synchronized (this.m) {
                ycj ycjVar = this.k;
                try {
                    ((yck) ycjVar.b).a.a();
                } catch (IOException e) {
                    ycjVar.a.d(e);
                }
                nue nueVar = new nue((byte[]) null);
                nueVar.g(7, this.i);
                ycj ycjVar2 = this.k;
                ycjVar2.c.q(2, nueVar);
                try {
                    ((yck) ycjVar2.b).a.j(nueVar);
                } catch (IOException e2) {
                    ycjVar2.a.d(e2);
                }
            }
            countDownLatch.countDown();
            this.P.execute(new xyp(this, 15));
            return null;
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // defpackage.xri
    public final xre c() {
        return this.N;
    }

    @Override // defpackage.yci
    public final void d(Throwable th) {
        n(0, yea.INTERNAL_ERROR, xtk.k.d(th));
    }

    @Override // defpackage.xze
    public final void e(xtk xtkVar) {
        synchronized (this.m) {
            if (this.s != null) {
                return;
            }
            this.s = xtkVar;
            this.j.c(xtkVar);
            s();
        }
    }

    @Override // defpackage.xze
    public final void f(xtk xtkVar) {
        e(xtkVar);
        synchronized (this.m) {
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((yct) entry.getValue()).f.k(xtkVar, false, new xsm());
                k((yct) entry.getValue());
            }
            Deque<yct> deque = this.A;
            for (yct yctVar : deque) {
                yctVar.f.l(xtkVar, xvl.MISCARRIED, true, new xsm());
                k(yctVar);
            }
            deque.clear();
            s();
        }
    }

    public final xtk g() {
        synchronized (this.m) {
            xtk xtkVar = this.s;
            if (xtkVar != null) {
                return xtkVar;
            }
            return xtk.k.e("Connection closed");
        }
    }

    final void j(int i, xtk xtkVar, xvl xvlVar, boolean z, yea yeaVar, xsm xsmVar) {
        synchronized (this.m) {
            yct yctVar = (yct) this.n.remove(Integer.valueOf(i));
            if (yctVar != null) {
                if (yeaVar != null) {
                    this.k.e(i, yea.CANCEL);
                }
                if (xtkVar != null) {
                    ycs ycsVar = yctVar.f;
                    if (xsmVar == null) {
                        xsmVar = new xsm();
                    }
                    ycsVar.l(xtkVar, xvlVar, z, xsmVar);
                }
                if (!q()) {
                    s();
                }
                k(yctVar);
            }
        }
    }

    public final void k(yct yctVar) {
        if (this.T && this.A.isEmpty() && this.n.isEmpty()) {
            this.T = false;
            xxw xxwVar = this.C;
            if (xxwVar != null) {
                xxwVar.c();
            }
        }
        if (yctVar.s) {
            this.U.c(yctVar, false);
        }
    }

    public final void l(yea yeaVar, String str) {
        n(0, yeaVar, h(yeaVar).a(str));
    }

    public final void m(yct yctVar) {
        if (!this.T) {
            this.T = true;
            xxw xxwVar = this.C;
            if (xxwVar != null) {
                xxwVar.b();
            }
        }
        if (yctVar.s) {
            this.U.c(yctVar, true);
        }
    }

    public final void n(int i, yea yeaVar, xtk xtkVar) {
        synchronized (this.m) {
            if (this.s == null) {
                this.s = xtkVar;
                this.j.c(xtkVar);
            }
            if (yeaVar != null && !this.S) {
                this.S = true;
                this.k.g(yeaVar, new byte[0]);
            }
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((yct) entry.getValue()).f.l(xtkVar, xvl.REFUSED, false, new xsm());
                    k((yct) entry.getValue());
                }
            }
            Deque<yct> deque = this.A;
            for (yct yctVar : deque) {
                yctVar.f.l(xtkVar, xvl.MISCARRIED, true, new xsm());
                k(yctVar);
            }
            deque.clear();
            s();
        }
    }

    public final void o(yct yctVar) {
        ycs ycsVar = yctVar.f;
        sij.x(ycsVar.x == -1, "StreamId already assigned");
        this.n.put(Integer.valueOf(this.O), yctVar);
        m(yctVar);
        int i = this.O;
        sij.y(ycsVar.x == -1, "the stream has been started with id %s", i);
        ycsVar.x = i;
        ydl ydlVar = ycsVar.h;
        ycsVar.w = new ydi(ydlVar, i, ydlVar.a, ycsVar);
        yct yctVar2 = ycsVar.y;
        yctVar2.f.d();
        if (ycsVar.u) {
            ycj ycjVar = ycsVar.g;
            try {
                ((yck) ycjVar.b).a.h(false, ycsVar.x, ycsVar.b);
            } catch (IOException e) {
                ycjVar.a.d(e);
            }
            yctVar2.d.a();
            ycsVar.b = null;
            zgk zgkVar = ycsVar.c;
            if (zgkVar.b > 0) {
                ydlVar.a(ycsVar.d, ycsVar.w, zgkVar, ycsVar.e);
            }
            ycsVar.u = false;
        }
        if (yctVar.d() == xsp.UNARY || yctVar.d() == xsp.SERVER_STREAMING) {
            boolean z = yctVar.g;
        } else {
            this.k.c();
        }
        int i2 = this.O;
        if (i2 < 2147483645) {
            this.O = i2 + 2;
        } else {
            this.O = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            n(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, yea.NO_ERROR, xtk.k.e("Stream ids exhausted"));
        }
    }

    final boolean p(int i) {
        boolean z;
        synchronized (this.m) {
            z = false;
            if (i < this.O && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final boolean q() {
        boolean z = false;
        while (true) {
            Deque deque = this.A;
            if (deque.isEmpty() || this.n.size() >= this.z) {
                break;
            }
            o((yct) deque.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.ydj
    public final ydi[] r() {
        ydi[] ydiVarArr;
        synchronized (this.m) {
            Map map = this.n;
            ydiVarArr = new ydi[map.size()];
            Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                ydiVarArr[i] = ((yct) it.next()).f.f();
                i++;
            }
        }
        return ydiVarArr;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.e("logId", this.N.a);
        tssVarH.b("address", this.e);
        return tssVarH.toString();
    }
}
