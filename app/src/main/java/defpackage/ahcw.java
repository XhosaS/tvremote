package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahcw extends ahcx implements ahcd {
    public final agzy e;
    public final agzy f;
    public final agzv g;

    public ahcw() {
        agzz agzzVar = agzz.a;
        this.e = new agzy(null, agzzVar);
        this.f = new agzy(null, agzzVar);
        this.g = new agzv(false, agzzVar);
    }

    private final void v() {
        ahmr ahmrVarB;
        ahcv ahcvVar = (ahcv) this.f.a;
        if (ahcvVar == null || ahcvVar.d()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (ahcvVar) {
                ahmr ahmrVarA = ahcvVar.a();
                ahmrVarB = null;
                if (ahmrVarA != null) {
                    ahcu ahcuVar = (ahcu) ahmrVarA;
                    if (jNanoTime - ahcuVar.b >= 0 && w(ahcuVar)) {
                        ahmrVarB = ahcvVar.b(0);
                    }
                }
            }
        } while (((ahcu) ahmrVarB) != null);
    }

    private final boolean w(Runnable runnable) {
        while (true) {
            agzy agzyVar = this.e;
            agzv agzvVar = this.g;
            Object obj = agzyVar.a;
            if (agzvVar.b()) {
                return false;
            }
            if (obj == null) {
                if (agzyVar.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof ahly) {
                ahly ahlyVar = (ahly) obj;
                int iA = ahlyVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                agzyVar.d(obj, ahlyVar.d(ahlyVar.b()));
            } else {
                if (obj == ahcy.b) {
                    return false;
                }
                ahly ahlyVar2 = new ahly(8, true);
                ahlyVar2.a((Runnable) obj);
                ahlyVar2.a(runnable);
                if (agzyVar.d(obj, ahlyVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        h(runnable);
    }

    @Override // defpackage.ahcd
    public final void c(long j, ahap ahapVar) {
        long jA = ahcy.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ahcs ahcsVar = new ahcs(this, jA + jNanoTime, ahapVar);
            s(jNanoTime, ahcsVar);
            ahat.b(ahapVar, ahcsVar);
        }
    }

    public ahcn g(long j, Runnable runnable, agte agteVar) {
        return ahca.a.g(j, runnable, agteVar);
    }

    public void h(Runnable runnable) {
        v();
        if (w(runnable)) {
            u();
        } else {
            ahbz.a.h(runnable);
        }
    }

    @Override // defpackage.ahcr
    public void j() {
        ahmr ahmrVarB;
        ahel ahelVar = ahel.a;
        ahel.b.set(null);
        this.g.a = 1;
        boolean z = ahbx.a;
        while (true) {
            agzy agzyVar = this.e;
            Object obj = agzyVar.a;
            if (obj == null) {
                if (agzyVar.d(null, ahcy.b)) {
                    break;
                }
            } else if (obj instanceof ahly) {
                ((ahly) obj).e();
                break;
            } else {
                if (obj == ahcy.b) {
                    break;
                }
                ahly ahlyVar = new ahly(8, true);
                ahlyVar.a((Runnable) obj);
                if (agzyVar.d(obj, ahlyVar)) {
                    break;
                }
            }
        }
        while (k() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            ahcv ahcvVar = (ahcv) this.f.a;
            if (ahcvVar == null) {
                return;
            }
            synchronized (ahcvVar) {
                ahmrVarB = ahcvVar.c.c > 0 ? ahcvVar.b(0) : null;
            }
            ahcu ahcuVar = (ahcu) ahmrVarB;
            if (ahcuVar == null) {
                return;
            } else {
                i(jNanoTime, ahcuVar);
            }
        }
    }

    @Override // defpackage.ahcr
    public final long k() {
        Runnable runnable;
        ahmr ahmrVarA;
        if (q()) {
            return 0L;
        }
        v();
        agzy agzyVar = this.e;
        while (true) {
            Object obj = agzyVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof ahly)) {
                if (obj == ahcy.b) {
                    break;
                }
                if (agzyVar.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                ahly ahlyVar = (ahly) obj;
                Object objC = ahlyVar.c();
                if (objC != ahly.a) {
                    runnable = (Runnable) objC;
                    break;
                }
                agzyVar.d(obj, ahlyVar.d(ahlyVar.b()));
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        agqi agqiVar = this.d;
        if (((agqiVar == null || agqiVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = agzyVar.a;
        if (obj2 != null) {
            if (!(obj2 instanceof ahly)) {
                return obj2 == ahcy.b ? Long.MAX_VALUE : 0L;
            }
            if (!((ahly) obj2).f()) {
                return 0L;
            }
        }
        ahcv ahcvVar = (ahcv) this.f.a;
        if (ahcvVar == null) {
            return Long.MAX_VALUE;
        }
        synchronized (ahcvVar) {
            ahmrVarA = ahcvVar.a();
        }
        ahcu ahcuVar = (ahcu) ahmrVarA;
        if (ahcuVar == null) {
            return Long.MAX_VALUE;
        }
        long jNanoTime = ahcuVar.b - System.nanoTime();
        if (jNanoTime < 0) {
            return 0L;
        }
        return jNanoTime;
    }

    protected final ahcn r(long j, Runnable runnable) {
        long jA = ahcy.a(j);
        if (jA >= 4611686018427387903L) {
            return ahec.a;
        }
        long jNanoTime = System.nanoTime();
        ahct ahctVar = new ahct(jA + jNanoTime, runnable);
        s(jNanoTime, ahctVar);
        return ahctVar;
    }

    public final void s(long j, ahcu ahcuVar) {
        ahmr ahmrVarA;
        agzv agzvVar = this.g;
        if (!agzvVar.b()) {
            agzy agzyVar = this.f;
            ahcv ahcvVar = (ahcv) agzyVar.a;
            ahcu ahcuVar2 = null;
            if (ahcvVar == null) {
                agzyVar.d(null, new ahcv(j));
                Object obj = agzyVar.a;
                obj.getClass();
                ahcvVar = (ahcv) obj;
            }
            synchronized (ahcuVar) {
                if (ahcuVar._heap == ahcy.a) {
                    return;
                }
                synchronized (ahcvVar) {
                    ahcu ahcuVar3 = (ahcu) ahcvVar.a();
                    if (!agzvVar.b()) {
                        if (ahcuVar3 == null) {
                            ahcvVar.a = j;
                        } else {
                            long j2 = ahcuVar3.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = ahcvVar.a;
                            if (j - j3 > 0) {
                                ahcvVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (ahcuVar.b - j < 0) {
                            ahcuVar.b = j;
                        }
                        boolean z = ahbx.a;
                        ahcuVar.d(ahcvVar);
                        ahmr[] ahmrVarArr = ahcvVar.b;
                        if (ahmrVarArr == null) {
                            ahmrVarArr = new ahmr[4];
                            ahcvVar.b = ahmrVarArr;
                        } else {
                            agzw agzwVar = ahcvVar.c;
                            if (agzwVar.c >= ahmrVarArr.length) {
                                int i = agzwVar.c;
                                Object[] objArrCopyOf = Arrays.copyOf(ahmrVarArr, i + i);
                                objArrCopyOf.getClass();
                                ahmrVarArr = (ahmr[]) objArrCopyOf;
                                ahcvVar.b = ahmrVarArr;
                            }
                        }
                        agzw agzwVar2 = ahcvVar.c;
                        int i2 = agzwVar2.c;
                        agzwVar2.c = i2 + 1;
                        ahmrVarArr[i2] = ahcuVar;
                        ahcuVar.e(i2);
                        ahcvVar.c(i2);
                        ahcv ahcvVar2 = (ahcv) agzyVar.a;
                        if (ahcvVar2 != null) {
                            synchronized (ahcvVar2) {
                                ahmrVarA = ahcvVar2.a();
                            }
                            ahcuVar2 = (ahcu) ahmrVarA;
                        }
                        if (ahcuVar2 == ahcuVar) {
                            u();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i(j, ahcuVar);
    }

    protected final boolean t() {
        if (!p()) {
            return false;
        }
        ahcv ahcvVar = (ahcv) this.f.a;
        if (ahcvVar != null && !ahcvVar.d()) {
            return false;
        }
        Object obj = this.e.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof ahly ? ((ahly) obj).f() : obj == ahcy.b;
    }
}
