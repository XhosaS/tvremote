package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxz implements Executor, Closeable {
    public static final yxo a = new yxo("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final ynt f;
    public final yxk g;
    public final ynt h;
    public final upq i;
    public final upq j;
    private final ynr k;

    public yxz(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.cd(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.ce(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.cd(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a.cp(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.i = new upq(null, null, null);
        this.j = new upq(null, null, null);
        ynv ynvVar = ynv.a;
        this.f = new ynt(0L, ynvVar);
        int i3 = i + 1;
        this.g = new yxk(i3 + i3);
        this.h = new ynt(i << 42, ynvVar);
        this.k = new ynr(false, ynvVar);
    }

    public static /* synthetic */ void e(yxz yxzVar, Runnable runnable, boolean z, int i) {
        yxzVar.a(runnable, false, z & ((i & 4) == 0));
    }

    public static final void f(yyd yydVar) {
        try {
            yydVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int g() {
        yxk yxkVar = this.g;
        synchronized (yxkVar) {
            if (d()) {
                return -1;
            }
            ynt yntVar = this.h;
            long j = yntVar.b;
            int i = (int) (j & 2097151);
            int iJ = ykn.j(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iJ >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (yntVar.b & 2097151)) + 1;
            if (yxkVar.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            yxy yxyVar = new yxy(this, i2);
            yxkVar.b(i2, yxyVar);
            if (i2 != ((int) (2097151 & ynt.a.incrementAndGet(yntVar)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = iJ + 1;
            yxyVar.start();
            return i3;
        }
    }

    private final yxy h() {
        Thread threadCurrentThread = Thread.currentThread();
        yxy yxyVar = threadCurrentThread instanceof yxy ? (yxy) threadCurrentThread : null;
        if (yxyVar == null || !yks.e(yxyVar.d, this)) {
            return null;
        }
        return yxyVar;
    }

    private final boolean i(long j) {
        int iJ = ykn.j(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0);
        int i = this.b;
        if (iJ < i) {
            int iG = g();
            if (iG == 1) {
                if (i > 1) {
                    g();
                }
            } else if (iG <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        yxy yxyVar;
        do {
            ynt yntVar = this.f;
            while (true) {
                long j = yntVar.b;
                yxyVar = (yxy) this.g.a((int) (2097151 & j));
                if (yxyVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(yxyVar);
                    if (iK >= 0 && yntVar.c(j, (j2 & (-2097152)) | iK)) {
                        yxyVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    yxyVar = null;
                    break;
                }
            }
            if (yxyVar == null) {
                return false;
            }
        } while (!yxyVar.b.d(-1, 0));
        LockSupport.unpark(yxyVar);
        return true;
    }

    private static final int k(yxy yxyVar) {
        int i;
        do {
            Object obj = yxyVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            yxyVar = (yxy) obj;
            i = yxyVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        yyd yyeVar;
        int i;
        String str = yyf.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof yyd) {
            yyeVar = (yyd) runnable;
            yyeVar.g = jNanoTime;
            yyeVar.h = z;
        } else {
            yyeVar = new yye(runnable, jNanoTime, z);
        }
        boolean z3 = yyeVar.h;
        long jA = z3 ? this.h.a(2097152L) : 0L;
        yxy yxyVarH = h();
        if (yxyVarH != null && (i = yxyVarH.e) != 5 && (yyeVar.h || i != 2)) {
            yxyVarH.c = true;
            yyh yyhVar = yxyVarH.a;
            if (z2) {
                yyeVar = yyhVar.b(yyeVar);
            } else {
                yyd yydVar = (yyd) ((ynu) yyhVar.b).a(yyeVar);
                yyeVar = yydVar == null ? null : yyhVar.b(yydVar);
            }
        }
        if (yyeVar != null) {
            if (!(yyeVar.h ? this.j.B(yyeVar) : this.i.B(yyeVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(jA)) {
                return;
            }
            j();
        }
    }

    public final void b(yxy yxyVar, int i, int i2) {
        while (true) {
            ynt yntVar = this.f;
            long j = yntVar.b;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(yxyVar) : i2;
            }
            if (iK >= 0) {
                if (yntVar.c(j, iK | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            ynr r0 = r8.k
            boolean r0 = r0.b()
            if (r0 != 0) goto L9
            return
        L9:
            yxy r0 = r8.h()
            yxk r1 = r8.g
            monitor-enter(r1)
            ynt r2 = r8.h     // Catch: java.lang.Throwable -> L9c
            long r2 = r2.b     // Catch: java.lang.Throwable -> L9c
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            monitor-exit(r1)
            int r1 = (int) r2
            r2 = 1
            if (r1 <= 0) goto L63
            r3 = r2
        L1e:
            yxk r4 = r8.g
            java.lang.Object r4 = r4.a(r3)
            r4.getClass()
            yxy r4 = (defpackage.yxy) r4
            if (r4 == r0) goto L5e
        L2b:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3c
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2b
        L3c:
            boolean r5 = defpackage.yoy.a
            yyh r4 = r4.a
            upq r5 = r8.j
            java.lang.Object r6 = r4.b
            ynu r6 = (defpackage.ynu) r6
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            yyd r6 = (defpackage.yyd) r6
            if (r6 != 0) goto L50
            goto L53
        L50:
            r5.B(r6)
        L53:
            yyd r6 = r4.c()
            if (r6 != 0) goto L5a
            goto L5e
        L5a:
            r5.B(r6)
            goto L53
        L5e:
            if (r3 == r1) goto L63
            int r3 = r3 + 1
            goto L1e
        L63:
            upq r3 = r8.j
            r3.A()
            upq r4 = r8.i
            r4.A()
        L6d:
            if (r0 == 0) goto L75
            yyd r1 = r0.b(r2)
            if (r1 != 0) goto L98
        L75:
            java.lang.Object r1 = r4.z()
            yyd r1 = (defpackage.yyd) r1
            if (r1 != 0) goto L98
            java.lang.Object r1 = r3.z()
            yyd r1 = (defpackage.yyd) r1
            if (r1 != 0) goto L98
            if (r0 == 0) goto L8b
            r1 = 5
            r0.d(r1)
        L8b:
            boolean r0 = defpackage.yoy.a
            ynt r0 = r8.f
            r1 = 0
            r0.b = r1
            ynt r0 = r8.h
            r0.b = r1
            return
        L98:
            f(r1)
            goto L6d
        L9c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxz.close():void");
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        yxk yxkVar = this.g;
        int length = yxkVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            yxy yxyVar = (yxy) yxkVar.a(i6);
            if (yxyVar != null) {
                yyh yyhVar = yxyVar.a;
                int iA = ((ynu) yyhVar.b).a != null ? yyhVar.a() + 1 : yyhVar.a();
                int i7 = yxyVar.e;
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
                        throw new yfu();
                    }
                    i5++;
                }
            }
        }
        ynt yntVar = this.h;
        String str = this.e;
        long j = yntVar.b;
        String strB = yoz.b(this);
        int i9 = this.b;
        int i10 = this.c;
        upq upqVar = this.i;
        upq upqVar2 = this.j;
        return str + "@" + strB + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + upqVar.y() + ", global blocking queue size = " + upqVar2.y() + ", Control State {created workers= " + ((int) (j & 2097151)) + ", blocking tasks = " + ((int) ((j & 4398044413952L) >> 21)) + ", CPUs acquired = " + (i9 - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }
}
