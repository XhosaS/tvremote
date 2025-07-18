package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkx extends AbstractExecutorService implements AutoCloseable {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public boolean g;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final zkv[] m;
    public final zkv[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final zkw[] t;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();

    public zkx(int i, ThreadFactory threadFactory, Runnable runnable, Runnable runnable2) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.b(i, "numThreads must be positive: "));
        }
        this.q = Integer.MAX_VALUE;
        this.i = threadFactory;
        this.j = true;
        this.k = runnable;
        this.l = runnable2;
        this.s = true;
        this.o = new CountDownLatch(i);
        int i2 = i + 1;
        zkv[] zkvVarArr = new zkv[i2];
        zkv[] zkvVarArr2 = new zkv[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            zkvVarArr[i4] = new zkv(b, i4);
            zkvVarArr2[i4] = new zkv(a, i4);
        }
        this.m = zkvVarArr;
        this.n = zkvVarArr2;
        zkw[] zkwVarArr = new zkw[i];
        zkv zkvVar = zkvVarArr[0];
        while (i3 < i) {
            zkv zkvVar2 = new zkv(zkvVar, i3);
            zkwVarArr[i3] = new zkw(this, i3);
            i3++;
            zkvVar = zkvVar2;
        }
        this.t = zkwVarArr;
        this.p = new AtomicReference(zkvVar);
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    public final void b(boolean z) {
        this.r = true;
        while (true) {
            AtomicReference atomicReference = this.p;
            zkv zkvVar = (zkv) atomicReference.get();
            Object obj = zkvVar.a;
            if (obj == a) {
                return;
            }
            Object obj2 = b;
            if (zku.a(atomicReference, zkvVar, (obj != obj2 || z) ? this.n[0] : this.n[zkvVar.b])) {
                while (zkvVar.a != obj2) {
                    zkw zkwVar = this.t[zkvVar.b];
                    Thread thread = zkwVar.b;
                    zkwVar.i = 3;
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    } else {
                        zkwVar.a();
                    }
                    zkvVar = (zkv) zkvVar.a;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        boolean zAwait = false;
        b(false);
        boolean z = false;
        while (!zAwait) {
            try {
                zAwait = this.o.await(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AtomicInteger atomicInteger;
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                int i2 = this.q;
                if (i2 != Integer.MAX_VALUE) {
                    do {
                        atomicInteger = this.d;
                        i = atomicInteger.get();
                        if (i != i2) {
                        }
                    } while (!atomicInteger.compareAndSet(i, i + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            zkv zkvVar = new zkv(runnable, -1);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            concurrentLinkedQueue.add(zkvVar);
            while (true) {
                AtomicReference atomicReference = this.p;
                zkv zkvVar2 = (zkv) atomicReference.get();
                Object obj = zkvVar2.a;
                if (obj == b) {
                    int i3 = zkvVar2.b;
                    int iMin = Math.min(i3 + 1, this.t.length);
                    if (iMin == i3 || zku.a(atomicReference, zkvVar2, this.m[iMin])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (concurrentLinkedQueue.remove(zkvVar)) {
                            a();
                            throw new RejectedExecutionException();
                        }
                        return;
                    }
                    int i4 = zkvVar2.b;
                    if (zku.a(atomicReference, zkvVar2, (zkv) obj)) {
                        zkw zkwVar = this.t[i4];
                        Thread thread = zkwVar.b;
                        zkwVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            zkwVar.h.e.incrementAndGet();
                            zkwVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((zkv) this.p.get()).a == a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.o.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                zkv zkvVar = (zkv) this.c.poll();
                if (zkvVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) zkvVar.a);
            }
            this.g = true;
            for (zkw zkwVar : this.t) {
                Thread thread = zkwVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
