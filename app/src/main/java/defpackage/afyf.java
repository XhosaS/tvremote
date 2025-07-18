package defpackage;

import io.grpc.Status;
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
/* loaded from: classes2.dex */
abstract class afyf implements afoe {
    static final afid e;
    static final afid f;
    public static final Status g;
    public static final Random h;
    public static final boolean i;
    public afxs A;
    public long B;
    public afog C;
    public afxp D;
    public afxp E;
    public long F;
    public boolean G;
    private final afih a;
    private Status b;
    public final afil j;
    public final Executor k;
    public final ScheduledExecutorService m;
    public final afyg n;
    public final afrr o;
    public final boolean p;
    public final afxo r;
    public final long s;
    public final long t;
    public final afye u;
    public final Executor l = new afkc(new afww());
    public final Object q = new Object();
    public final afry v = new afry();
    public volatile afxu w = new afxu(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    public final AtomicBoolean x = new AtomicBoolean();
    public final AtomicInteger y = new AtomicInteger();
    public final AtomicInteger z = new AtomicInteger();

    static {
        afib afibVar = afih.b;
        int i2 = afid.c;
        e = new afia("grpc-previous-rpc-attempts", afibVar);
        f = new afia("grpc-retry-pushback-ms", afih.b);
        g = Status.b.withDescription("Stream thrown away because RetriableStream committed");
        h = new Random();
        i = afrq.i("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public afyf(afil afilVar, afih afihVar, afxo afxoVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, afyg afygVar, afrr afrrVar, afye afyeVar) {
        this.j = afilVar;
        this.r = afxoVar;
        this.s = j;
        this.t = j2;
        this.k = executor;
        this.m = scheduledExecutorService;
        this.a = afihVar;
        this.n = afygVar;
        if (afygVar != null) {
            this.F = afygVar.b;
        }
        this.o = afrrVar;
        yqw.B(afygVar == null || afrrVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.p = afrrVar != null;
        this.u = afyeVar;
    }

    @Override // defpackage.afoe
    public final afeh a() {
        throw null;
    }

    public abstract Status b();

    @Override // defpackage.afzx
    public final void c() {
        afxu afxuVar = this.w;
        if (afxuVar.a) {
            afxuVar.f.a.c();
        } else {
            v(new afxc());
        }
    }

    @Override // defpackage.afzx
    public final void d() {
        v(new afxg());
    }

    @Override // defpackage.afzx
    public final void e(int i2) {
        afxu afxuVar = this.w;
        if (afxuVar.a) {
            afxuVar.f.a.e(i2);
        } else {
            v(new afxh(i2));
        }
    }

    @Override // defpackage.afzx
    public final void f(affa affaVar) {
        v(new afwz(affaVar));
    }

    public abstract afoe g(afih afihVar, afeu afeuVar, int i2, boolean z);

    @Override // defpackage.afzx
    public final void h(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.afzx
    public final boolean i() {
        Iterator it = this.w.c.iterator();
        while (it.hasNext()) {
            if (((afyd) it.next()).a.i()) {
                return true;
            }
        }
        return false;
    }

    public abstract void j();

    public final afyd k(int i2, boolean z) {
        AtomicInteger atomicInteger;
        int i3;
        do {
            atomicInteger = this.z;
            i3 = atomicInteger.get();
            if (i3 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i3, i3 + 1));
        afyd afydVar = new afyd(i2);
        afxj afxjVar = new afxj(new afxn(this, afydVar));
        afih afihVar = this.a;
        afih afihVar2 = new afih();
        afihVar2.d(afihVar);
        if (i2 > 0) {
            afihVar2.e(e, String.valueOf(i2));
        }
        afydVar.a = g(afihVar2, afxjVar, i2, z);
        return afydVar;
    }

    public final Runnable l(afyd afydVar) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.q) {
            if (this.w.f != null) {
                return null;
            }
            Collection collection = this.w.c;
            afxu afxuVar = this.w;
            yqw.M(afxuVar.f == null, "Already committed");
            List list2 = afxuVar.b;
            if (afxuVar.c.contains(afydVar)) {
                list = null;
                collectionSingleton = Collections.singleton(afydVar);
                z = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z = false;
            }
            this.w = new afxu(list, collectionSingleton, afxuVar.d, afydVar, afxuVar.g, z, afxuVar.h, afxuVar.e);
            this.r.a.addAndGet(-this.B);
            afxp afxpVar = this.D;
            boolean z2 = afxpVar != null ? afxpVar.c : false;
            if (afxpVar != null) {
                Future futureA = afxpVar.a();
                this.D = null;
                future = futureA;
            } else {
                future = null;
            }
            afxp afxpVar2 = this.E;
            if (afxpVar2 != null) {
                Future futureA2 = afxpVar2.a();
                this.E = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new afwy(this, collection, afydVar, future, z2, future2);
        }
    }

    @Override // defpackage.afoe
    public final void m(afry afryVar) {
        afxu afxuVar;
        synchronized (this.q) {
            afryVar.b("closed", this.v);
            afxuVar = this.w;
        }
        afyd afydVar = afxuVar.f;
        if (afydVar != null) {
            afry afryVar2 = new afry();
            afydVar.a.m(afryVar2);
            afryVar.b("committed", afryVar2);
            return;
        }
        afry afryVar3 = new afry();
        for (afyd afydVar2 : afxuVar.c) {
            afry afryVar4 = new afry();
            afydVar2.a.m(afryVar4);
            afryVar3.a(afryVar4);
        }
        afryVar.b("open", afryVar3);
    }

    @Override // defpackage.afoe
    public final void n(Status status) {
        afyd afydVar;
        afyd afydVar2 = new afyd(0);
        afydVar2.a = new afvn();
        Runnable runnableL = l(afydVar2);
        if (runnableL != null) {
            synchronized (this.q) {
                this.w = this.w.c(afydVar2);
            }
            runnableL.run();
            y(status, afof.PROCESSED, new afih());
            return;
        }
        synchronized (this.q) {
            if (this.w.c.contains(this.w.f)) {
                afydVar = this.w.f;
            } else {
                this.b = status;
                afydVar = null;
            }
            afxu afxuVar = this.w;
            this.w = new afxu(afxuVar.b, afxuVar.c, afxuVar.d, afxuVar.f, true, afxuVar.a, afxuVar.h, afxuVar.e);
        }
        if (afydVar != null) {
            afydVar.a.n(status);
        }
    }

    public final void o(afyd afydVar) {
        Runnable runnableL = l(afydVar);
        if (runnableL != null) {
            this.k.execute(runnableL);
        }
    }

    @Override // defpackage.afoe
    public final void p() {
        v(new afxd());
    }

    @Override // defpackage.afoe
    public final void q(afft afftVar) {
        v(new afxa(afftVar));
    }

    @Override // defpackage.afoe
    public final void r(affw affwVar) {
        v(new afxb(affwVar));
    }

    @Override // defpackage.afoe
    public final void s(int i2) {
        v(new afxe(i2));
    }

    @Override // defpackage.afoe
    public final void t(int i2) {
        v(new afxf(i2));
    }

    @Override // defpackage.afoe
    public final void u(afog afogVar) {
        afxp afxpVar;
        afye afyeVar;
        this.C = afogVar;
        Status statusB = b();
        if (statusB != null) {
            n(statusB);
            return;
        }
        synchronized (this.q) {
            this.w.b.add(new afxt(this));
        }
        afyd afydVarK = k(0, false);
        if (afydVarK == null) {
            return;
        }
        if (this.p) {
            Object obj = this.q;
            synchronized (obj) {
                this.w = this.w.a(afydVarK);
                afxpVar = null;
                if (z(this.w) && ((afyeVar = this.u) == null || afyeVar.a())) {
                    afxpVar = new afxp(obj);
                    this.E = afxpVar;
                }
            }
            if (afxpVar != null) {
                afxpVar.b(this.m.schedule(new afxr(this, afxpVar), this.o.b, TimeUnit.NANOSECONDS));
            }
        }
        w(afydVarK);
    }

    public final void v(afxm afxmVar) {
        Collection collection;
        synchronized (this.q) {
            if (!this.w.a) {
                this.w.b.add(afxmVar);
            }
            collection = this.w.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            afxmVar.a((afyd) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r10 = (defpackage.afkc) r9.l;
        r10.c(r1);
        r10.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r10.a.u(new defpackage.afyc(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r9.w.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r10 = r9.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r10 = defpackage.afyf.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r0.n(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        r7 = (defpackage.afxm) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.afxt);
        r7 = r9.w;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r7.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(defpackage.afyd r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.q
            monitor-enter(r5)
            afxu r6 = r9.w     // Catch: java.lang.Throwable -> La9
            afyd r7 = r6.f     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            goto L34
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            goto L34
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La9
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La9
            if (r2 != r8) goto L5e
            afxu r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La9
            r9.w = r0     // Catch: java.lang.Throwable -> La9
            boolean r0 = r9.i()     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            return
        L2e:
            afxk r1 = new afxk     // Catch: java.lang.Throwable -> La9
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
        L34:
            if (r1 == 0) goto L41
            java.util.concurrent.Executor r10 = r9.l
            afkc r10 = (defpackage.afkc) r10
            r10.c(r1)
            r10.b()
            return
        L41:
            if (r4 != 0) goto L4d
            afoe r0 = r10.a
            afyc r1 = new afyc
            r1.<init>(r9, r10)
            r0.u(r1)
        L4d:
            afoe r0 = r10.a
            afxu r1 = r9.w
            afyd r1 = r1.f
            if (r1 != r10) goto L58
            io.grpc.Status r10 = r9.b
            goto L5a
        L58:
            io.grpc.Status r10 = defpackage.afyf.g
        L5a:
            r0.n(r10)
            return
        L5e:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto L64
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            return
        L64:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La9
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La9
            if (r3 != 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La9
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La9
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La9
            goto L84
        L7a:
            r3.clear()     // Catch: java.lang.Throwable -> La9
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La9
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La9
        L84:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            int r2 = r3.size()
            r5 = r0
        L8a:
            if (r5 >= r2) goto La6
            java.lang.Object r7 = r3.get(r5)
            afxm r7 = (defpackage.afxm) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.afxt
            r4 = r4 | r7
            afxu r7 = r9.w
            afyd r8 = r7.f
            if (r8 == 0) goto La0
            if (r8 != r10) goto La6
        La0:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L8a
        La6:
            r2 = r6
            goto L5
        La9:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afyf.w(afyd):void");
    }

    public final void x() {
        Future future;
        synchronized (this.q) {
            afxp afxpVar = this.E;
            future = null;
            if (afxpVar != null) {
                Future futureA = afxpVar.a();
                this.E = null;
                future = futureA;
            }
            this.w = this.w.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void y(Status status, afof afofVar, afih afihVar) {
        this.A = new afxs(status, afofVar, afihVar);
        if (this.z.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            afkc afkcVar = (afkc) this.l;
            afkcVar.c(new afxl(this, status, afofVar, afihVar));
            afkcVar.b();
        }
    }

    public final boolean z(afxu afxuVar) {
        return afxuVar.f == null && afxuVar.e < this.o.a && !afxuVar.h;
    }
}
