package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yup<T> extends yvi<yur> implements yuj, ysx, yvw {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public yup(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object f(defpackage.yup r17, defpackage.ysy r18, defpackage.yih r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yup.f(yup, ysy, yih):java.lang.Object");
    }

    private final int n() {
        return (int) ((e() + this.h) - this.b);
    }

    private final int o() {
        return this.h + this.i;
    }

    private final long p() {
        return e() + this.h;
    }

    private final long q() {
        return e() + this.h + this.i;
    }

    private final long r(yur yurVar) {
        long j = yurVar.a;
        if (j >= p() && (this.g > 0 || j > e() || this.i == 0)) {
            return -1L;
        }
        return j;
    }

    private final void s() {
        yvk[] yvkVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        yuq.b(objArr, e(), null);
        this.h--;
        long jE = e() + 1;
        if (this.b < jE) {
            this.b = jE;
        }
        if (this.c < jE) {
            if (this.e != 0 && (yvkVarArr = this.d) != null) {
                for (yvk yvkVar : yvkVarArr) {
                    if (yvkVar != null) {
                        yur yurVar = (yur) yvkVar;
                        long j = yurVar.a;
                        if (j >= 0 && j < jE) {
                            yurVar.a = jE;
                        }
                    }
                }
            }
            this.c = jE;
        }
        boolean z = yoy.a;
    }

    private final void t(Object obj) {
        int iO = o();
        Object[] objArrW = this.a;
        if (objArrW == null) {
            objArrW = w(null, 0, 2);
        } else {
            int length = objArrW.length;
            if (iO >= length) {
                objArrW = w(objArrW, iO, length + length);
            }
        }
        yuq.b(objArrW, e() + iO, obj);
    }

    private final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = yoy.a;
        for (long jE = e(); jE < jMin; jE++) {
            Object[] objArr = this.a;
            objArr.getClass();
            yuq.b(objArr, jE, null);
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - jMin);
        this.i = (int) (j4 - j3);
    }

    private final boolean v(Object obj) {
        if (this.e == 0) {
            boolean z = yoy.a;
            if (this.f != 0) {
                t(obj);
                int i = this.h + 1;
                this.h = i;
                if (i > 1) {
                    s();
                }
                this.c = e() + this.h;
            }
            return true;
        }
        int i2 = this.h;
        int i3 = this.g;
        if (i2 >= i3 && this.c <= this.b) {
            int i4 = this.j;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i4 - 1;
            if (i5 == 0) {
                return false;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    return true;
                }
                throw new yfu();
            }
        }
        t(obj);
        int i6 = this.h + 1;
        this.h = i6;
        if (i6 > i3) {
            s();
        }
        if (n() > this.f) {
            u(this.b + 1, this.c, p(), q());
        }
        return true;
    }

    private final Object[] w(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jE = e();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jE;
                yuq.b(objArr2, j, yuq.a(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final yih[] x(yih[] yihVarArr) {
        yvk[] yvkVarArr;
        yur yurVar;
        yih yihVar;
        if (this.e != 0 && (yvkVarArr = this.d) != null) {
            int length = yihVarArr.length;
            int i = 0;
            yihVarArr = yihVarArr;
            while (i < yvkVarArr.length) {
                yvk yvkVar = yvkVarArr[i];
                if (yvkVar != null && (yihVar = (yurVar = (yur) yvkVar).b) != null && r(yurVar) >= 0) {
                    int length2 = yihVarArr.length;
                    yihVarArr = yihVarArr;
                    if (length >= length2) {
                        ?? CopyOf = Arrays.copyOf(yihVarArr, Math.max(2, length2 + length2));
                        CopyOf.getClass();
                        yihVarArr = CopyOf;
                    }
                    yihVarArr[length] = yihVar;
                    yurVar.b = null;
                    length++;
                }
                i++;
                yihVarArr = yihVarArr;
            }
        }
        return yihVarArr;
    }

    @Override // defpackage.yum, defpackage.ysx
    public final Object a(ysy ysyVar, yih yihVar) {
        return f(this, ysyVar, yihVar);
    }

    @Override // defpackage.yuj
    public final void c() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                u(p(), this.c, p(), q());
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final long e() {
        return Math.min(this.c, this.b);
    }

    @Override // defpackage.yvw
    public final ysx eT(yil yilVar, int i, int i2) {
        return yuq.c(this, yilVar, i, i2);
    }

    @Override // defpackage.yum
    public final List eU() {
        synchronized (this) {
            int iN = n();
            if (iN == 0) {
                return yhb.a;
            }
            ArrayList arrayList = new ArrayList(iN);
            Object[] objArr = this.a;
            objArr.getClass();
            for (int i = 0; i < iN; i++) {
                arrayList.add(yuq.a(objArr, this.b + i));
            }
            return arrayList;
        }
    }

    @Override // defpackage.yuj
    public final boolean eV(Object obj) {
        int i;
        boolean z;
        yih[] yihVarArrX = yvj.a;
        synchronized (this) {
            if (v(obj)) {
                yihVarArrX = x(yihVarArrX);
                z = true;
            } else {
                z = false;
            }
        }
        for (yih yihVar : yihVarArrX) {
            if (yihVar != null) {
                yihVar.resumeWith(ygi.a);
            }
        }
        return z;
    }

    @Override // defpackage.yuj, defpackage.ysy
    public final Object emit(T t, yih<? super ygi> yihVar) throws Throwable {
        Throwable th;
        yih[] yihVarArrX;
        yun yunVar;
        if (eV(t)) {
            return ygi.a;
        }
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        yih[] yihVarArrX2 = yvj.a;
        synchronized (this) {
            try {
                if (v(t)) {
                    try {
                        yofVar.resumeWith(ygi.a);
                        yihVarArrX = x(yihVarArrX2);
                        yunVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        yunVar = new yun(this, e() + o(), t, yofVar);
                        t(yunVar);
                        this.i++;
                        if (this.g == 0) {
                            yihVarArrX2 = x(yihVarArrX2);
                        }
                        yihVarArrX = yihVarArrX2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (yunVar != null) {
                    yks.p(yofVar, yunVar);
                }
                for (yih yihVar2 : yihVarArrX) {
                    if (yihVar2 != null) {
                        yihVar2.resumeWith(ygi.a);
                    }
                }
                Object objI = yofVar.i();
                yio yioVar = yio.a;
                if (objI == yioVar) {
                    yihVar.getClass();
                }
                if (objI != yioVar) {
                    objI = ygi.a;
                }
                return objI != yioVar ? ygi.a : objI;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    protected final Object g() {
        Object[] objArr = this.a;
        objArr.getClass();
        return yuq.a(objArr, (this.b + n()) - 1);
    }

    @Override // defpackage.yvi
    public final /* synthetic */ yvk h() {
        return new yur();
    }

    public final void i() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0 && yuq.a(objArr, (e() + o()) - 1) == yuq.a) {
                this.i--;
                yuq.b(objArr, e() + o(), null);
            }
        }
    }

    public final yih[] j(long j) {
        long j2;
        long j3;
        long j4;
        yvk[] yvkVarArr;
        boolean z = yoy.a;
        if (j <= this.c) {
            long jE = e();
            long j5 = this.h + jE;
            int i = this.g;
            if (i == 0 && this.i > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (yvkVarArr = this.d) != null) {
                for (yvk yvkVar : yvkVarArr) {
                    if (yvkVar != null) {
                        long j6 = ((yur) yvkVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.c) {
                long jP = p();
                int iMin = this.e > 0 ? Math.min(this.i, i - ((int) (jP - j5))) : this.i;
                yih[] yihVarArr = yvj.a;
                long j7 = this.i + jP;
                if (iMin > 0) {
                    yihVarArr = new yih[iMin];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = 1;
                    long j8 = jP;
                    while (true) {
                        if (jP >= j7) {
                            j2 = jE;
                            j3 = j5;
                            jP = j8;
                            break;
                        }
                        j2 = jE;
                        Object objA = yuq.a(objArr, jP);
                        yxo yxoVar = yuq.a;
                        if (objA != yxoVar) {
                            objA.getClass();
                            int i3 = i2 + 1;
                            j3 = j5;
                            yun yunVar = (yun) objA;
                            yihVarArr[i2] = yunVar.d;
                            yuq.b(objArr, jP, yxoVar);
                            yuq.b(objArr, j8, yunVar.c);
                            long j9 = j8 + 1;
                            if (i3 >= iMin) {
                                jP = j9;
                                break;
                            }
                            i2 = i3;
                            j8 = j9;
                        } else {
                            j3 = j5;
                        }
                        jP++;
                        jE = j2;
                        j5 = j3;
                    }
                } else {
                    j2 = jE;
                    j3 = j5;
                    j4 = 1;
                }
                long j10 = jP - j2;
                long j11 = this.e == 0 ? jP : j3;
                long jMax = Math.max(this.b, jP - Math.min(this.f, (int) j10));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (yks.e(yuq.a(objArr2, jMax), yuq.a)) {
                        jP += j4;
                        jMax += j4;
                    }
                }
                u(jMax, j11, jP, j7);
                i();
                return yihVarArr.length == 0 ? yihVarArr : x(yihVarArr);
            }
        }
        return yvj.a;
    }

    @Override // defpackage.yvi
    public final /* bridge */ /* synthetic */ yvk[] k() {
        return new yur[2];
    }
}
