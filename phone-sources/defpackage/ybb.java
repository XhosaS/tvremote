package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybb implements xvk {
    static final xsj a;
    static final xsj b;
    public static final xtk c;
    public static final Random d;
    public static final boolean e;
    public boolean A;
    final /* synthetic */ xsq B;
    final /* synthetic */ xpy C;
    final /* synthetic */ xqo D;
    public final /* synthetic */ xyc E;
    public aafi F;
    public final upo G;
    private final xsm H;
    private xtk I;
    public final xsq f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final ybc j;
    public final xxd k;
    public final boolean l;
    public final Object m;
    public final long n;
    public final long o;
    public final yba p;
    public final xxi q;
    public volatile yax r;
    public final AtomicBoolean s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public long v;
    public xvm w;
    public yau x;
    public yau y;
    public long z;

    static {
        xse xseVar = xsm.c;
        int i = xsj.c;
        a = new xsd("grpc-previous-rpc-attempts", xseVar);
        b = new xsd("grpc-retry-pushback-ms", xsm.c);
        c = xtk.c.e("Stream thrown away because RetriableStream committed");
        d = new Random();
        e = xxc.h("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public ybb(xyc xycVar, xsq xsqVar, xsm xsmVar, xpy xpyVar, ybc ybcVar, xxd xxdVar, xqo xqoVar) {
        this.B = xsqVar;
        this.C = xpyVar;
        this.D = xqoVar;
        this.E = xycVar;
        xyr xyrVar = xycVar.b;
        upo upoVar = xyrVar.T;
        long j = xyrVar.M;
        long j2 = xyrVar.N;
        Executor executorD = xyrVar.d(xpyVar);
        ScheduledExecutorService scheduledExecutorServiceC = xyrVar.i.c();
        yba ybaVar = xycVar.a;
        this.h = new xtq(new yam());
        this.m = new Object();
        this.q = new xxi();
        this.r = new yax(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.t = new AtomicInteger();
        this.u = new AtomicInteger();
        this.f = xsqVar;
        this.G = upoVar;
        this.n = j;
        this.o = j2;
        this.g = executorD;
        this.i = scheduledExecutorServiceC;
        this.H = xsmVar;
        this.j = ybcVar;
        if (ybcVar != null) {
            this.z = ybcVar.b;
        }
        this.k = xxdVar;
        sij.o(ybcVar == null || xxdVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = xxdVar != null;
        this.p = ybaVar;
    }

    @Override // defpackage.xvk
    public final xpv a() {
        throw null;
    }

    public final yaz b(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.u;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        yaz yazVar = new yaz(i);
        yar yarVar = new yar(new yat(this, yazVar));
        xsm xsmVar = this.H;
        xsm xsmVar2 = new xsm();
        xsmVar2.g(xsmVar);
        if (i > 0) {
            xsmVar2.h(a, String.valueOf(i));
        }
        xpy xpyVarI = this.C.i(yarVar);
        xqe[] xqeVarArrK = xxc.k(xpyVarI, i, z);
        xqo xqoVarA = this.D.a();
        try {
            xvk xvkVarA = this.E.b.y.a(this.B, xsmVar2, xpyVarI, xqeVarArrK);
            this.D.c(xqoVarA);
            yazVar.a = xvkVarA;
            return yazVar;
        } catch (Throwable th) {
            this.D.c(xqoVarA);
            throw th;
        }
    }

    public final Runnable c(yaz yazVar) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection = this.r.c;
            yax yaxVar = this.r;
            sij.x(yaxVar.f == null, "Already committed");
            List list2 = yaxVar.b;
            if (yaxVar.c.contains(yazVar)) {
                list = null;
                collectionSingleton = Collections.singleton(yazVar);
                z = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z = false;
            }
            this.r = new yax(list, collectionSingleton, yaxVar.d, yazVar, yaxVar.g, z, yaxVar.h, yaxVar.e);
            this.G.c(-this.v);
            yau yauVar = this.x;
            boolean z2 = yauVar != null ? yauVar.b : false;
            if (yauVar != null) {
                Future futureA = yauVar.a();
                this.x = null;
                future = futureA;
            } else {
                future = null;
            }
            yau yauVar2 = this.y;
            if (yauVar2 != null) {
                Future futureA2 = yauVar2.a();
                this.y = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new rip(this, collection, yazVar, future, z2, future2, 2);
        }
    }

    public final void d(yaz yazVar) {
        Runnable runnableC = c(yazVar);
        if (runnableC != null) {
            this.g.execute(runnableC);
        }
    }

    public final void e(yas yasVar) {
        Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(yasVar);
            }
            collection = this.r.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yasVar.a((yaz) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r9.h.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r10.a.o(new defpackage.yay(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r9.r.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r10 = r9.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        r10 = defpackage.ybb.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        r0.h(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r7 = (defpackage.yas) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.yaw);
        r7 = r9.r;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r7.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.yaz r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.m
            monitor-enter(r5)
            yax r6 = r9.r     // Catch: java.lang.Throwable -> La6
            yaz r7 = r6.f     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            goto L36
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            goto L36
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La6
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La6
            if (r2 != r8) goto L5b
            yax r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La6
            r9.r = r0     // Catch: java.lang.Throwable -> La6
            boolean r0 = r9.p()     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            return
        L2e:
            xyp r1 = new xyp     // Catch: java.lang.Throwable -> La6
            r0 = 9
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r10 = r9.h
            r10.execute(r1)
            return
        L3e:
            if (r4 != 0) goto L4a
            xvk r0 = r10.a
            yay r1 = new yay
            r1.<init>(r9, r10)
            r0.o(r1)
        L4a:
            xvk r0 = r10.a
            yax r1 = r9.r
            yaz r1 = r1.f
            if (r1 != r10) goto L55
            xtk r10 = r9.I
            goto L57
        L55:
            xtk r10 = defpackage.ybb.c
        L57:
            r0.h(r10)
            return
        L5b:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La6
            if (r6 == 0) goto L61
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            return
        L61:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La6
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La6
            if (r3 != 0) goto L77
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La6
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La6
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La6
            goto L81
        L77:
            r3.clear()     // Catch: java.lang.Throwable -> La6
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La6
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La6
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            int r2 = r3.size()
            r5 = r0
        L87:
            if (r5 >= r2) goto La3
            java.lang.Object r7 = r3.get(r5)
            yas r7 = (defpackage.yas) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.yaw
            r4 = r4 | r7
            yax r7 = r9.r
            yaz r8 = r7.f
            if (r8 == 0) goto L9d
            if (r8 != r10) goto La3
        L9d:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L87
        La3:
            r2 = r6
            goto L5
        La6:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybb.f(yaz):void");
    }

    @Override // defpackage.xvk
    public final void g(xxi xxiVar) {
        yax yaxVar;
        synchronized (this.m) {
            xxiVar.b("closed", this.q);
            yaxVar = this.r;
        }
        yaz yazVar = yaxVar.f;
        if (yazVar != null) {
            xxi xxiVar2 = new xxi();
            yazVar.a.g(xxiVar2);
            xxiVar.b("committed", xxiVar2);
            return;
        }
        xxi xxiVar3 = new xxi();
        for (yaz yazVar2 : yaxVar.c) {
            xxi xxiVar4 = new xxi();
            yazVar2.a.g(xxiVar4);
            xxiVar3.a(xxiVar4);
        }
        xxiVar.b("open", xxiVar3);
    }

    @Override // defpackage.xvk
    public final void h(xtk xtkVar) {
        yaz yazVar;
        yaz yazVar2 = new yaz(0);
        yazVar2.a = new xzn();
        Runnable runnableC = c(yazVar2);
        if (runnableC != null) {
            synchronized (this.m) {
                this.r = this.r.c(yazVar2);
            }
            runnableC.run();
            q(xtkVar, xvl.PROCESSED, new xsm());
            return;
        }
        synchronized (this.m) {
            if (this.r.c.contains(this.r.f)) {
                yazVar = this.r.f;
            } else {
                this.I = xtkVar;
                yazVar = null;
            }
            yax yaxVar = this.r;
            this.r = new yax(yaxVar.b, yaxVar.c, yaxVar.d, yaxVar.f, true, yaxVar.a, yaxVar.h, yaxVar.e);
        }
        if (yazVar != null) {
            yazVar.a.h(xtkVar);
        }
    }

    public final void i() {
        Future future;
        synchronized (this.m) {
            yau yauVar = this.y;
            future = null;
            if (yauVar != null) {
                Future futureA = yauVar.a();
                this.y = null;
                future = futureA;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // defpackage.xvk
    public final void j() {
        e(new yao(0));
    }

    @Override // defpackage.xvk
    public final void k(xqp xqpVar) {
        e(new yan(xqpVar, 0));
    }

    @Override // defpackage.xvk
    public final void l(xqs xqsVar) {
        e(new yan(xqsVar, 2));
    }

    @Override // defpackage.xvk
    public final void m(int i) {
        e(new yap(i, 1));
    }

    @Override // defpackage.xvk
    public final void n(int i) {
        e(new yap(i, 0));
    }

    @Override // defpackage.xvk
    public final void o(xvm xvmVar) {
        xtk xtkVar;
        yau yauVar;
        yba ybaVar;
        this.w = xvmVar;
        xyq xyqVar = this.E.b.z;
        synchronized (xyqVar.a) {
            xtkVar = xyqVar.c;
            yauVar = null;
            if (xtkVar == null) {
                xyqVar.b.add(this);
                xtkVar = null;
            }
        }
        if (xtkVar != null) {
            h(xtkVar);
            return;
        }
        synchronized (this.m) {
            this.r.b.add(new yaw(this));
        }
        yaz yazVarB = b(0, false);
        if (yazVarB == null) {
            return;
        }
        if (this.l) {
            Object obj = this.m;
            synchronized (obj) {
                this.r = this.r.a(yazVarB);
                if (s(this.r) && ((ybaVar = this.p) == null || ybaVar.a())) {
                    yauVar = new yau(obj);
                    this.y = yauVar;
                }
            }
            if (yauVar != null) {
                yauVar.b(this.i.schedule(new yav(this, yauVar, 0), this.k.b, TimeUnit.NANOSECONDS));
            }
        }
        f(yazVarB);
    }

    @Override // defpackage.ybt
    public final boolean p() {
        Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((yaz) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void q(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        this.F = new aafi(xtkVar, xvlVar, xsmVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new ejr((Object) this, xtkVar, xvlVar, xsmVar, 18));
        }
    }

    @Override // defpackage.ybt
    public final void r() {
        yax yaxVar = this.r;
        if (yaxVar.a) {
            yaxVar.f.a.r();
        } else {
            e(new yao(1));
        }
    }

    public final boolean s(yax yaxVar) {
        return yaxVar.f == null && yaxVar.e < this.k.a && !yaxVar.h;
    }

    @Override // defpackage.ybt
    public final void t() {
        e(new yao(2));
    }

    @Override // defpackage.ybt
    public final void u(int i) {
        yax yaxVar = this.r;
        if (yaxVar.a) {
            yaxVar.f.a.u(i);
        } else {
            e(new yap(i, 2));
        }
    }

    @Override // defpackage.ybt
    public final void v(xqh xqhVar) {
        e(new yan(xqhVar, 1));
    }

    @Override // defpackage.ybt
    public final void w(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }
}
