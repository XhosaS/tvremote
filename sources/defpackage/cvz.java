package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvz extends Thread {
    public final cve a;
    public boolean b;
    final /* synthetic */ cwa c;
    public int d;
    public final auf e;
    private final cum f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public cvz(cwa cwaVar, int i) {
        this.c = cwaVar;
        setDaemon(true);
        setContextClassLoader(cwaVar.getClass().getClassLoader());
        this.e = new auf((char[]) null);
        this.f = new cum();
        this.d = 4;
        this.a = new cve(cvh.a);
        this.nextParkedWorker = cwa.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final cwc e() {
        if (a(2) == 0) {
            cwa cwaVar = this.c;
            cwc cwcVar = (cwc) cwaVar.i.l();
            return cwcVar != null ? cwcVar : (cwc) cwaVar.j.l();
        }
        cwa cwaVar2 = this.c;
        cwc cwcVar2 = (cwc) cwaVar2.j.l();
        return cwcVar2 != null ? cwcVar2 : (cwc) cwaVar2.i.l();
    }

    private final cwc f(int i) {
        long j;
        cwc cwcVarE;
        long j2;
        long j3;
        long j4;
        cwa cwaVar = this.c;
        int i2 = (int) (cwaVar.h.b & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iA = a(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iA++;
            if (iA > i2) {
                iA = 1;
            }
            cvz cvzVar = (cvz) cwaVar.g.a(iA);
            if (cvzVar != null && cvzVar != this) {
                auf aufVar = cvzVar.e;
                cum cumVar = this.f;
                if (i == 3) {
                    cwcVarE = aufVar.d();
                    j = 0;
                } else {
                    int i4 = ((cve) aufVar.b).b;
                    int i5 = ((cve) aufVar.c).b;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        boolean z = i == 1;
                        j = 0;
                        if (z && ((cve) aufVar.e).b == 0) {
                            break;
                        }
                        int i6 = i4 + 1;
                        cwcVarE = aufVar.e(i4, z);
                        if (cwcVarE != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    cwcVarE = null;
                }
                if (cwcVarE != null) {
                    cumVar.a = cwcVarE;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        cvg cvgVar = (cvg) aufVar.d;
                        cwc cwcVar = (cwc) cvgVar.a;
                        j2 = -2;
                        if (cwcVar == null || (i & 2) == 0) {
                            break;
                        }
                        String str = cwd.a;
                        j3 = -1;
                        long jNanoTime = System.nanoTime() - cwcVar.a;
                        long j5 = cwd.b;
                        if (jNanoTime < j5) {
                            j2 = j5 - jNanoTime;
                            break;
                        }
                        if (cvgVar.c(cwcVar, null)) {
                            cumVar.a = cwcVar;
                            j2 = -1;
                            break;
                        }
                    }
                    j3 = -1;
                    j4 = j2;
                }
                if (j4 == j3) {
                    Object obj = cumVar.a;
                    cumVar.a = null;
                    return (cwc) obj;
                }
                if (j4 > j) {
                    jMin = Math.min(jMin, j4);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.h = jMin;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != cwa.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final cwc b(boolean z) {
        cwc cwcVarE;
        cwc cwcVarE2;
        cvf cvfVar;
        long j;
        cwc cwcVar = null;
        if (this.d != 1) {
            cwa cwaVar = this.c;
            do {
                cvfVar = cwaVar.h;
                j = cvfVar.b;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    auf aufVar = this.e;
                    int i = ((cve) aufVar.b).b;
                    int i2 = ((cve) aufVar.c).b;
                    while (true) {
                        if (i == i2 || ((cve) aufVar.e).b == 0) {
                            break;
                        }
                        i2--;
                        cwc cwcVarE3 = aufVar.e(i2, true);
                        if (cwcVarE3 != null) {
                            cwcVar = cwcVarE3;
                            break;
                        }
                    }
                    if (cwcVar != null) {
                        return cwcVar;
                    }
                    cwc cwcVar2 = (cwc) cwaVar.j.l();
                    return cwcVar2 == null ? f(1) : cwcVar2;
                }
            } while (!cvfVar.a(j, (-4398046511104L) + j));
            this.d = 1;
        }
        if (z) {
            int i3 = this.c.b;
            boolean z2 = a(i3 + i3) == 0;
            if (z2 && (cwcVarE2 = e()) != null) {
                return cwcVarE2;
            }
            auf aufVar2 = this.e;
            cwc cwcVarD = (cwc) ((cvg) aufVar2.d).a(null);
            if (cwcVarD == null) {
                cwcVarD = aufVar2.d();
            }
            if (cwcVarD != null) {
                return cwcVarD;
            }
            if (!z2 && (cwcVarE = e()) != null) {
                return cwcVarE;
            }
        } else {
            cwc cwcVarE4 = e();
            if (cwcVarE4 != null) {
                return cwcVarE4;
            }
        }
        return f(3);
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.c.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final void d(int i) {
        int i2 = this.d;
        if (i2 == 1) {
            cvf.a.addAndGet(this.c.h, 4398046511104L);
            i2 = 1;
        }
        if (i2 != i) {
            this.d = i;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        int i;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                cwa cwaVar = this.c;
                if (cwaVar.b() || this.d == 5) {
                    break loop0;
                }
                cwc cwcVarB = b(this.b);
                int i2 = 3;
                if (cwcVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.d == 3) {
                        int i3 = cvk.a;
                        this.d = 2;
                    }
                    cwa.c(cwcVarB);
                } else {
                    this.b = false;
                    if (this.h == 0) {
                        long j2 = 2097151;
                        if (g()) {
                            cve cveVar = this.a;
                            cveVar.b = -1;
                            dnx dnxVar = cveVar.c;
                            while (g() && cveVar.b == -1 && !cwaVar.b() && this.d != 5) {
                                d(i2);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = cwaVar.d + System.nanoTime();
                                }
                                LockSupport.parkNanos(cwaVar.d);
                                long j3 = j2;
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    cvw cvwVar = cwaVar.g;
                                    synchronized (cvwVar) {
                                        if (!cwaVar.b()) {
                                            cvf cvfVar = cwaVar.h;
                                            if (((int) (cvfVar.b & j3)) > cwaVar.b && cveVar.a(-1, 1)) {
                                                int i4 = this.indexInArray;
                                                c(0);
                                                cwaVar.a(this, i4, 0);
                                                int andDecrement = (int) (cvf.a.getAndDecrement(cvfVar) & j3);
                                                if (andDecrement != i4) {
                                                    Object objA = cvwVar.a(andDecrement);
                                                    objA.getClass();
                                                    cvz cvzVar = (cvz) objA;
                                                    cvwVar.b(i4, cvzVar);
                                                    cvzVar.c(i4);
                                                    cwaVar.a(cvzVar, andDecrement, i4);
                                                }
                                                cvwVar.b(andDecrement, null);
                                                this.d = 5;
                                            }
                                            j2 = j3;
                                            i2 = 3;
                                        }
                                    }
                                }
                                j2 = j3;
                            }
                        } else if (this.nextParkedWorker == cwa.a) {
                            cvf cvfVar2 = cwaVar.f;
                            do {
                                j = cvfVar2.b;
                                i = this.indexInArray;
                                int i5 = cvk.a;
                                this.nextParkedWorker = cwaVar.g.a((int) (j & 2097151));
                            } while (!cvfVar2.a(j, ((-2097152) & (2097152 + j)) | i));
                        }
                    } else {
                        if (z) {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
