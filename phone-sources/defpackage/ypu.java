package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ypu extends ypp implements ypd {
    private final ynr a;
    public final ynu c;
    public final ynu d;

    public ypu() {
        ynv ynvVar = ynv.a;
        this.c = new ynu(null, ynvVar);
        this.d = new ynu(null, ynvVar);
        this.a = new ynr(false, ynvVar);
    }

    private final boolean A(Runnable runnable) {
        while (true) {
            ynu ynuVar = this.c;
            Object obj = ynuVar.a;
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (ynuVar.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof yxh) {
                yxh yxhVar = (yxh) obj;
                int iA = yxhVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                ynuVar.d(obj, yxhVar.c());
            } else {
                if (obj == ypv.b) {
                    return false;
                }
                yxh yxhVar2 = new yxh(8, true);
                yxhVar2.a((Runnable) obj);
                yxhVar2.a(runnable);
                if (ynuVar.d(obj, yxhVar2)) {
                    return true;
                }
            }
        }
    }

    private final void z() {
        yxv yxvVarD;
        ypt yptVar = (ypt) this.d.a;
        if (yptVar == null || yptVar.g()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (yptVar) {
                yxv yxvVarB = yptVar.b();
                yxvVarD = null;
                if (yxvVarB != null) {
                    yps ypsVar = (yps) yxvVarB;
                    if (jNanoTime - ypsVar.b >= 0 && A(ypsVar)) {
                        yxvVarD = yptVar.d(0);
                    }
                }
            }
        } while (((yps) yxvVarD) != null);
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        i(runnable);
    }

    @Override // defpackage.ypd
    public final void c(long j, yoe yoeVar) {
        long jA = ypv.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ypq ypqVar = new ypq(this, jA + jNanoTime, yoeVar);
            w(jNanoTime, ypqVar);
            yks.p(yoeVar, ypqVar);
        }
    }

    public ypm h(long j, Runnable runnable, yil yilVar) {
        return ypb.a.h(j, runnable, yilVar);
    }

    public void i(Runnable runnable) {
        z();
        if (A(runnable)) {
            s();
        } else {
            ypa.a.i(runnable);
        }
    }

    @Override // defpackage.ypp
    public void k() {
        yxv yxvVarD;
        ThreadLocal threadLocal = yra.a;
        yra.a.set(null);
        this.a.c();
        boolean z = yoy.a;
        while (true) {
            ynu ynuVar = this.c;
            Object obj = ynuVar.a;
            if (obj == null) {
                if (ynuVar.d(null, ypv.b)) {
                    break;
                }
            } else if (obj instanceof yxh) {
                ((yxh) obj).d();
                break;
            } else {
                if (obj == ypv.b) {
                    break;
                }
                yxh yxhVar = new yxh(8, true);
                yxhVar.a((Runnable) obj);
                if (ynuVar.d(obj, yxhVar)) {
                    break;
                }
            }
        }
        while (l() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            ypt yptVar = (ypt) this.d.a;
            if (yptVar == null) {
                return;
            }
            synchronized (yptVar) {
                yxvVarD = yptVar.a() > 0 ? yptVar.d(0) : null;
            }
            yps ypsVar = (yps) yxvVarD;
            if (ypsVar == null) {
                return;
            } else {
                j(jNanoTime, ypsVar);
            }
        }
    }

    @Override // defpackage.ypp
    public final long l() {
        Runnable runnable;
        yps ypsVar;
        if (r()) {
            return 0L;
        }
        z();
        ynu ynuVar = this.c;
        while (true) {
            Object obj = ynuVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof yxh)) {
                if (obj == ypv.b) {
                    break;
                }
                if (ynuVar.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                yxh yxhVar = (yxh) obj;
                Object objB = yxhVar.b();
                if (objB != yxh.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                ynuVar.d(obj, yxhVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        ygx ygxVar = this.b;
        if (((ygxVar == null || ygxVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = ynuVar.a;
        if (obj2 != null) {
            if (!(obj2 instanceof yxh)) {
                return obj2 == ypv.b ? Long.MAX_VALUE : 0L;
            }
            if (!((yxh) obj2).e()) {
                return 0L;
            }
        }
        ypt yptVar = (ypt) this.d.a;
        if (yptVar == null || (ypsVar = (yps) yptVar.c()) == null) {
            return Long.MAX_VALUE;
        }
        return ykn.m(ypsVar.b - System.nanoTime(), 0L);
    }

    protected final ypm v(long j, Runnable runnable) {
        long jA = ypv.a(j);
        if (jA >= 4611686018427387903L) {
            return yqs.a;
        }
        long jNanoTime = System.nanoTime();
        ypr yprVar = new ypr(jA + jNanoTime, runnable);
        w(jNanoTime, yprVar);
        return yprVar;
    }

    public final void w(long j, yps ypsVar) {
        if (!x()) {
            ynu ynuVar = this.d;
            ypt yptVar = (ypt) ynuVar.a;
            if (yptVar == null) {
                ynuVar.d(null, new ypt(j));
                Object obj = ynuVar.a;
                obj.getClass();
                yptVar = (ypt) obj;
            }
            synchronized (ypsVar) {
                if (ypsVar._heap == ypv.a) {
                    return;
                }
                synchronized (yptVar) {
                    yps ypsVar2 = (yps) yptVar.b();
                    if (!x()) {
                        if (ypsVar2 == null) {
                            yptVar.a = j;
                        } else {
                            long j2 = ypsVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = yptVar.a;
                            if (j - j3 > 0) {
                                yptVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (ypsVar.b - j < 0) {
                            ypsVar.b = j;
                        }
                        boolean z = yoy.a;
                        ypsVar.d(yptVar);
                        yxv[] yxvVarArr = yptVar.b;
                        if (yxvVarArr == null) {
                            yxvVarArr = new yxv[4];
                            yptVar.b = yxvVarArr;
                        } else if (yptVar.a() >= yxvVarArr.length) {
                            int iA = yptVar.a();
                            Object[] objArrCopyOf = Arrays.copyOf(yxvVarArr, iA + iA);
                            objArrCopyOf.getClass();
                            yxvVarArr = (yxv[]) objArrCopyOf;
                            yptVar.b = yxvVarArr;
                        }
                        int iA2 = yptVar.a();
                        yptVar.e(iA2 + 1);
                        yxvVarArr[iA2] = ypsVar;
                        ypsVar.e(iA2);
                        yptVar.f(iA2);
                        ypt yptVar2 = (ypt) ynuVar.a;
                        if ((yptVar2 != null ? (yps) yptVar2.c() : null) == ypsVar) {
                            s();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        j(j, ypsVar);
    }

    public final boolean x() {
        return this.a.a();
    }

    protected final boolean y() {
        if (!q()) {
            return false;
        }
        ypt yptVar = (ypt) this.d.a;
        if (yptVar != null && !yptVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof yxh ? ((yxh) obj).e() : obj == ypv.b;
    }
}
