package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmx implements Executor, Closeable {
    public static final ahmg a = new ahmg("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final ahna f;
    public final ahna g;
    public final agzx h;
    public final ahmb i;
    public final agzx j;
    public final agzv k;

    public ahmx(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.a(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.k(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.a(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
        }
        this.f = new ahna();
        this.g = new ahna();
        agzz agzzVar = agzz.a;
        this.h = new agzx(0L, agzzVar);
        int i3 = i + 1;
        this.i = new ahmb(i3 + i3);
        this.j = new agzx(i << 42, agzzVar);
        this.k = new agzv(false, agzzVar);
    }

    public static /* synthetic */ void e(ahmx ahmxVar, Runnable runnable, boolean z, int i) {
        ahmxVar.a(runnable, false, z & ((i & 4) == 0));
    }

    private final int g() {
        ahmb ahmbVar = this.i;
        synchronized (ahmbVar) {
            if (this.k.b()) {
                return -1;
            }
            agzx agzxVar = this.j;
            long j = agzxVar.c;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i3 = ((int) (agzxVar.c & 2097151)) + 1;
            if (ahmbVar.a(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ahmw ahmwVar = new ahmw(this, i3);
            ahmbVar.b(i3, ahmwVar);
            if (i3 != ((int) (2097151 & agzx.a.incrementAndGet(agzxVar)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            ahmwVar.start();
            return i4;
        }
    }

    private final int h(ahmw ahmwVar) {
        int i;
        do {
            Object obj = ahmwVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            ahmwVar = (ahmw) obj;
            i = ahmwVar.indexInArray;
        } while (i == 0);
        return i;
    }

    private final ahmw i() {
        Thread threadCurrentThread = Thread.currentThread();
        ahmw ahmwVar = threadCurrentThread instanceof ahmw ? (ahmw) threadCurrentThread : null;
        if (ahmwVar == null || !agvy.c(ahmwVar.d, this)) {
            return null;
        }
        return ahmwVar;
    }

    private final boolean j(long j) {
        int i = ((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.b;
        if (i < i2) {
            int iG = g();
            if (iG == 1) {
                if (i2 > 1) {
                    g();
                }
            } else if (iG <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean k() {
        ahmw ahmwVar;
        do {
            agzx agzxVar = this.h;
            while (true) {
                long j = agzxVar.c;
                ahmwVar = (ahmw) this.i.a((int) (2097151 & j));
                if (ahmwVar != null) {
                    long j2 = 2097152 + j;
                    int iH = h(ahmwVar);
                    if (iH >= 0 && agzxVar.a(j, (j2 & (-2097152)) | iH)) {
                        ahmwVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    ahmwVar = null;
                    break;
                }
            }
            if (ahmwVar == null) {
                return false;
            }
        } while (!ahmwVar.b.a(-1, 0));
        LockSupport.unpark(ahmwVar);
        return true;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        ahnc ahndVar;
        int i;
        String str = ahne.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof ahnc) {
            ahndVar = (ahnc) runnable;
            ahndVar.g = jNanoTime;
            ahndVar.h = z;
        } else {
            ahndVar = new ahnd(runnable, jNanoTime, z);
        }
        boolean z3 = ahndVar.h;
        long jAddAndGet = z3 ? agzx.a.addAndGet(this.j, 2097152L) : 0L;
        ahmw ahmwVarI = i();
        if (ahmwVarI != null && (i = ahmwVarI.e) != 5 && (ahndVar.h || i != 2)) {
            ahmwVarI.c = true;
            ahng ahngVar = ahmwVarI.a;
            if (z2) {
                ahndVar = ahngVar.b(ahndVar);
            } else {
                ahnc ahncVar = (ahnc) ahngVar.a.a(ahndVar);
                ahndVar = ahncVar == null ? null : ahngVar.b(ahncVar);
            }
        }
        if (ahndVar != null) {
            if (!(ahndVar.h ? this.g.d(ahndVar) : this.f.d(ahndVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            d();
        } else {
            if (k() || j(jAddAndGet)) {
                return;
            }
            k();
        }
    }

    public final void b(ahmw ahmwVar, int i, int i2) {
        while (true) {
            agzx agzxVar = this.h;
            long j = agzxVar.c;
            long j2 = 2097152 + j;
            int iH = (int) (2097151 & j);
            if (iH == i) {
                iH = i2 == 0 ? h(ahmwVar) : i2;
            }
            if (iH >= 0) {
                if (agzxVar.a(j, iH | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    public final void c(ahnc ahncVar) {
        try {
            ahncVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void d() {
        if (k() || j(this.j.c)) {
            return;
        }
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r8 = this;
            agzv r0 = r8.k
            boolean r0 = r0.c()
            if (r0 != 0) goto L9
            return
        L9:
            ahmw r0 = r8.i()
            ahmb r1 = r8.i
            monitor-enter(r1)
            agzx r2 = r8.j     // Catch: java.lang.Throwable -> L9a
            long r2 = r2.c     // Catch: java.lang.Throwable -> L9a
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            monitor-exit(r1)
            int r1 = (int) r2
            r2 = 1
            if (r1 <= 0) goto L61
            r3 = r2
        L1e:
            ahmb r4 = r8.i
            java.lang.Object r4 = r4.a(r3)
            r4.getClass()
            ahmw r4 = (defpackage.ahmw) r4
            if (r4 == r0) goto L5c
        L2b:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3c
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2b
        L3c:
            boolean r5 = defpackage.ahbx.a
            ahng r4 = r4.a
            ahna r5 = r8.g
            agzy r6 = r4.a
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            ahnc r6 = (defpackage.ahnc) r6
            if (r6 != 0) goto L4e
            goto L51
        L4e:
            r5.d(r6)
        L51:
            ahnc r6 = r4.c()
            if (r6 != 0) goto L58
            goto L5c
        L58:
            r5.d(r6)
            goto L51
        L5c:
            if (r3 == r1) goto L61
            int r3 = r3 + 1
            goto L1e
        L61:
            ahna r3 = r8.g
            r3.c()
            ahna r4 = r8.f
            r4.c()
        L6b:
            if (r0 == 0) goto L73
            ahnc r1 = r0.b(r2)
            if (r1 != 0) goto L96
        L73:
            java.lang.Object r1 = r4.b()
            ahnc r1 = (defpackage.ahnc) r1
            if (r1 != 0) goto L96
            java.lang.Object r1 = r3.b()
            ahnc r1 = (defpackage.ahnc) r1
            if (r1 != 0) goto L96
            if (r0 == 0) goto L89
            r1 = 5
            r0.d(r1)
        L89:
            boolean r0 = defpackage.ahbx.a
            agzx r0 = r8.h
            r1 = 0
            r0.c = r1
            agzx r0 = r8.j
            r0.c = r1
            return
        L96:
            r8.c(r1)
            goto L6b
        L9a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmx.f():void");
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ahmb ahmbVar = this.i;
        int length = ahmbVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            ahmw ahmwVar = (ahmw) ahmbVar.a(i6);
            if (ahmwVar != null) {
                ahng ahngVar = ahmwVar.a;
                int iA = ahngVar.a.a != null ? ahngVar.a() + 1 : ahngVar.a();
                int i7 = ahmwVar.e;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(iA + "c");
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(iA + "b");
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iA > 0) {
                        arrayList.add(iA + "d");
                    }
                } else {
                    if (i8 != 4) {
                        throw new agpg();
                    }
                    i5++;
                }
            }
        }
        agzx agzxVar = this.j;
        String str = this.e;
        long j = agzxVar.c;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i9 = this.b;
        int i10 = this.c;
        ahna ahnaVar = this.f;
        ahna ahnaVar2 = this.g;
        return str + "@" + hexString + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + ahnaVar.a() + ", global blocking queue size = " + ahnaVar2.a() + ", Control State {created workers= " + ((int) (j & 2097151)) + ", blocking tasks = " + ((int) ((j & 4398044413952L) >> 21)) + ", CPUs acquired = " + (i9 - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }
}
