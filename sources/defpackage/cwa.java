package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwa implements Executor, Closeable {
    public static final cvx a = new cvx("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final cvf f;
    public final cvw g;
    public final cvf h;
    public final asv i;
    public final asv j;
    private final cvd k;

    public cwa(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(b.h(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(b.f(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(b.h(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
        }
        this.i = new asv((byte[]) null, (byte[]) null);
        this.j = new asv((byte[]) null, (byte[]) null);
        cvh cvhVar = cvh.a;
        this.f = new cvf(0L, cvhVar);
        int i3 = i + 1;
        this.g = new cvw(i3 + i3);
        this.h = new cvf(i << 42, cvhVar);
        this.k = new cvd();
    }

    public static final void c(cwc cwcVar) {
        try {
            cwcVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int d() {
        cvw cvwVar = this.g;
        synchronized (cvwVar) {
            if (b()) {
                return -1;
            }
            cvf cvfVar = this.h;
            long j = cvfVar.b;
            int i = (int) (j & 2097151);
            int iAA = dnx.aA(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iAA >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (cvfVar.b & 2097151)) + 1;
            if (cvwVar.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            cvz cvzVar = new cvz(this, i2);
            cvwVar.b(i2, cvzVar);
            if (i2 != ((int) (2097151 & cvf.a.incrementAndGet(cvfVar)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = iAA + 1;
            cvzVar.start();
            return i3;
        }
    }

    private final cvz e() {
        Thread threadCurrentThread = Thread.currentThread();
        cvz cvzVar = threadCurrentThread instanceof cvz ? (cvz) threadCurrentThread : null;
        if (cvzVar == null || !dnx.aB(cvzVar.c, this)) {
            return null;
        }
        return cvzVar;
    }

    private final boolean f() {
        cvz cvzVar;
        do {
            cvf cvfVar = this.f;
            while (true) {
                long j = cvfVar.b;
                cvzVar = (cvz) this.g.a((int) (2097151 & j));
                if (cvzVar != null) {
                    long j2 = 2097152 + j;
                    int iG = g(cvzVar);
                    if (iG >= 0 && cvfVar.a(j, (j2 & (-2097152)) | iG)) {
                        cvzVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    cvzVar = null;
                    break;
                }
            }
            if (cvzVar == null) {
                return false;
            }
        } while (!cvzVar.a.a(-1, 0));
        LockSupport.unpark(cvzVar);
        return true;
    }

    private static final int g(cvz cvzVar) {
        int i;
        do {
            Object obj = cvzVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            cvzVar = (cvz) obj;
            i = cvzVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(cvz cvzVar, int i, int i2) {
        while (true) {
            cvf cvfVar = this.f;
            long j = cvfVar.b;
            long j2 = 2097152 + j;
            int iG = (int) (2097151 & j);
            if (iG == i) {
                iG = i2 == 0 ? g(cvzVar) : i2;
            }
            if (iG >= 0) {
                if (cvfVar.a(j, iG | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    public final boolean b() {
        return this.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.cvd.a
            cvd r1 = r8.k
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 == 0) goto La1
            cvz r0 = r8.e()
            cvw r1 = r8.g
            monitor-enter(r1)
            cvf r2 = r8.h     // Catch: java.lang.Throwable -> L9e
            long r4 = r2.b     // Catch: java.lang.Throwable -> L9e
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            monitor-exit(r1)
            int r1 = (int) r4
            if (r1 <= 0) goto L65
            r2 = r3
        L20:
            cvw r4 = r8.g
            java.lang.Object r4 = r4.a(r2)
            r4.getClass()
            cvz r4 = (defpackage.cvz) r4
            if (r4 == r0) goto L60
        L2d:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3e
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2d
        L3e:
            int r5 = defpackage.cvk.a
            auf r4 = r4.e
            asv r5 = r8.j
            java.lang.Object r6 = r4.d
            cvg r6 = (defpackage.cvg) r6
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            cwc r6 = (defpackage.cwc) r6
            if (r6 != 0) goto L52
            goto L55
        L52:
            r5.n(r6)
        L55:
            cwc r6 = r4.d()
            if (r6 != 0) goto L5c
            goto L60
        L5c:
            r5.n(r6)
            goto L55
        L60:
            if (r2 == r1) goto L65
            int r2 = r2 + 1
            goto L20
        L65:
            asv r2 = r8.j
            r2.m()
            asv r4 = r8.i
            r4.m()
        L6f:
            if (r0 == 0) goto L77
            cwc r1 = r0.b(r3)
            if (r1 != 0) goto L9a
        L77:
            java.lang.Object r1 = r4.l()
            cwc r1 = (defpackage.cwc) r1
            if (r1 != 0) goto L9a
            java.lang.Object r1 = r2.l()
            cwc r1 = (defpackage.cwc) r1
            if (r1 != 0) goto L9a
            if (r0 == 0) goto L8d
            r1 = 5
            r0.d(r1)
        L8d:
            int r0 = defpackage.cvk.a
            cvf r0 = r8.f
            r1 = 0
            r0.b = r1
            cvf r0 = r8.h
            r0.b = r1
            return
        L9a:
            c(r1)
            goto L6f
        L9e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwa.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        cwc cwcVar;
        int i;
        AtomicReferenceArray atomicReferenceArray;
        String str = cwd.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof cwc) {
            cwcVar = (cwc) runnable;
            cwcVar.a = jNanoTime;
            cwcVar.b = false;
        } else {
            cwcVar = new cwc(runnable, jNanoTime);
        }
        boolean z = cwcVar.b;
        cvz cvzVarE = e();
        if (cvzVarE != null && (i = cvzVarE.d) != 5) {
            boolean z2 = cwcVar.b;
            if (i != 2) {
                cvzVarE.b = true;
                auf aufVar = cvzVarE.e;
                cwcVar = (cwc) ((cvg) aufVar.d).a(cwcVar);
                if (cwcVar == null) {
                    cwcVar = null;
                } else if (aufVar.c() != 127) {
                    Object obj = aufVar.c;
                    cve cveVar = (cve) obj;
                    int i2 = 127 & cveVar.b;
                    while (true) {
                        atomicReferenceArray = (AtomicReferenceArray) aufVar.a;
                        if (atomicReferenceArray.get(i2) == null) {
                            break;
                        } else {
                            Thread.yield();
                        }
                    }
                    atomicReferenceArray.lazySet(i2, cwcVar);
                    cve.a.incrementAndGet(obj);
                    dnx dnxVar = cveVar.c;
                    cvh cvhVar = cvh.a;
                    cwcVar = null;
                }
            }
        }
        if (cwcVar != null && !this.i.n(cwcVar)) {
            throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
        }
        if (f()) {
            return;
        }
        long j = this.h.b;
        long j2 = 2097151 & j;
        int i3 = this.b;
        if (dnx.aA(((int) j2) - ((int) ((j & 4398044413952L) >> 21)), 0) < i3) {
            int iD = d();
            if (iD == 1) {
                if (i3 > 1) {
                    d();
                    return;
                }
                return;
            } else if (iD > 0) {
                return;
            }
        }
        f();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        cvw cvwVar = this.g;
        int length = cvwVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            cvz cvzVar = (cvz) cvwVar.a(i6);
            if (cvzVar != null) {
                auf aufVar = cvzVar.e;
                int iC = ((cvg) aufVar.d).a != null ? aufVar.c() + 1 : aufVar.c();
                int i7 = cvzVar.d;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(iC + "c");
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(iC + "b");
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iC > 0) {
                        arrayList.add(iC + "d");
                    }
                } else {
                    if (i8 != 4) {
                        throw new crz();
                    }
                    i5++;
                }
            }
        }
        cvf cvfVar = this.h;
        String str = this.e;
        long j = cvfVar.b;
        String strAx = dnx.ax(this);
        int i9 = this.b;
        int i10 = this.c;
        asv asvVar = this.i;
        asv asvVar2 = this.j;
        return str + "@" + strAx + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + asvVar.k() + ", global blocking queue size = " + asvVar2.k() + ", Control State {created workers= " + ((int) (j & 2097151)) + ", blocking tasks = " + ((int) ((j & 4398044413952L) >> 21)) + ", CPUs acquired = " + (i9 - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }
}
