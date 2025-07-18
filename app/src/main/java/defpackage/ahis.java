package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahis extends ahje implements ahim, ahgr, ahjz {
    public Object[] a;
    public long b;
    public long c;
    private int f;
    private int g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ahgs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(defpackage.ahis r17, defpackage.ahgs r18, defpackage.agsw r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahis.c(ahis, ahgs, agsw):java.lang.Object");
    }

    private final long k() {
        return b() + this.f;
    }

    private final long l(ahiu ahiuVar) {
        long j = ahiuVar.a;
        if (j >= k() && (j > b() || this.g == 0)) {
            return -1L;
        }
        return j;
    }

    private final void m(Object obj) {
        int i = this.f + this.g;
        Object[] objArrP = this.a;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else {
            int length = objArrP.length;
            if (i >= length) {
                objArrP = p(objArrP, i, length + length);
            }
        }
        ahit.b(objArrP, b() + i, obj);
    }

    private final void n(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = ahbx.a;
        for (long jB = b(); jB < jMin; jB++) {
            Object[] objArr = this.a;
            objArr.getClass();
            ahit.b(objArr, jB, null);
        }
        this.b = j;
        this.c = j2;
        this.f = (int) (j3 - jMin);
        this.g = (int) (j4 - j3);
    }

    private final boolean o(Object obj) {
        ahjg[] ahjgVarArr;
        if (this.e == 0) {
            boolean z = ahbx.a;
            return true;
        }
        if (this.f >= 0 && this.c <= this.b) {
            return false;
        }
        m(obj);
        int i = this.f + 1;
        this.f = i;
        if (i > 0) {
            Object[] objArr = this.a;
            objArr.getClass();
            ahit.b(objArr, b(), null);
            this.f--;
            long jB = b() + 1;
            if (this.b < jB) {
                this.b = jB;
            }
            if (this.c < jB) {
                if (this.e != 0 && (ahjgVarArr = this.d) != null) {
                    for (ahjg ahjgVar : ahjgVarArr) {
                        if (ahjgVar != null) {
                            ahiu ahiuVar = (ahiu) ahjgVar;
                            long j = ahiuVar.a;
                            if (j >= 0 && j < jB) {
                                ahiuVar.a = jB;
                            }
                        }
                    }
                }
                this.c = jB;
            }
            boolean z2 = ahbx.a;
        }
        long jB2 = b() + this.f;
        long j2 = this.b;
        if (((int) (jB2 - j2)) > 0) {
            n(j2 + 1, this.c, k(), b() + this.f + this.g);
        }
        return true;
    }

    private final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jB = b();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jB;
                ahit.b(objArr2, j, ahit.a(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final agsw[] q(agsw[] agswVarArr) {
        ahjg[] ahjgVarArr;
        ahiu ahiuVar;
        agsw agswVar;
        if (this.e != 0 && (ahjgVarArr = this.d) != null) {
            int length = agswVarArr.length;
            int i = 0;
            agswVarArr = agswVarArr;
            while (i < ahjgVarArr.length) {
                ahjg ahjgVar = ahjgVarArr[i];
                if (ahjgVar != null && (agswVar = (ahiuVar = (ahiu) ahjgVar).b) != null && l(ahiuVar) >= 0) {
                    int length2 = agswVarArr.length;
                    agswVarArr = agswVarArr;
                    if (length >= length2) {
                        ?? CopyOf = Arrays.copyOf(agswVarArr, Math.max(2, length2 + length2));
                        CopyOf.getClass();
                        agswVarArr = CopyOf;
                    }
                    agswVarArr[length] = agswVar;
                    ahiuVar.b = null;
                    length++;
                }
                i++;
                agswVarArr = agswVarArr;
            }
        }
        return agswVarArr;
    }

    @Override // defpackage.ahim, defpackage.ahgs
    public final Object a(Object obj, agsw agswVar) throws Throwable {
        Throwable th;
        boolean z;
        Throwable th2;
        agsw[] agswVarArrQ;
        ahiq ahiqVar;
        agsw[] agswVarArrQ2 = ahjf.a;
        synchronized (this) {
            try {
                if (o(obj)) {
                    try {
                        agswVarArrQ2 = q(agswVarArrQ2);
                        z = true;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    z = false;
                }
                for (agsw agswVar2 : agswVarArrQ2) {
                    if (agswVar2 != null) {
                        agswVar2.e(agpu.a);
                    }
                }
                if (z) {
                    return agpu.a;
                }
                ahar aharVar = new ahar(agth.c(agswVar), 1);
                aharVar.z();
                agsw[] agswVarArr = ahjf.a;
                synchronized (this) {
                    try {
                        if (o(obj)) {
                            try {
                                aharVar.e(agpu.a);
                                agswVarArrQ = q(agswVarArr);
                                ahiqVar = null;
                            } catch (Throwable th4) {
                                th2 = th4;
                                throw th2;
                            }
                        } else {
                            try {
                                ahiq ahiqVar2 = new ahiq(this, b() + this.f + this.g, obj, aharVar);
                                m(ahiqVar2);
                                this.g++;
                                agswVarArrQ = q(agswVarArr);
                                ahiqVar = ahiqVar2;
                            } catch (Throwable th5) {
                                th = th5;
                                th2 = th;
                                throw th2;
                            }
                        }
                        if (ahiqVar != null) {
                            ahat.b(aharVar, ahiqVar);
                        }
                        for (agsw agswVar3 : agswVarArrQ) {
                            if (agswVar3 != null) {
                                agswVar3.e(agpu.a);
                            }
                        }
                        Object objM = aharVar.m();
                        agtg agtgVar = agtg.a;
                        if (objM == agtgVar) {
                            agswVar.getClass();
                        }
                        if (objM != agtgVar) {
                            objM = agpu.a;
                        }
                        return objM != agtgVar ? agpu.a : objM;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final long b() {
        return Math.min(this.c, this.b);
    }

    @Override // defpackage.ahje
    public final /* synthetic */ ahjg d() {
        return new ahiu();
    }

    public final void e() {
        if (this.g <= 1) {
            return;
        }
        Object[] objArr = this.a;
        objArr.getClass();
        while (this.g > 0 && ahit.a(objArr, (b() + (this.f + this.g)) - 1) == ahit.a) {
            this.g--;
            ahit.b(objArr, b() + this.f + this.g, null);
        }
    }

    public final agsw[] f(long j) {
        long j2;
        long j3;
        long j4;
        ahjg[] ahjgVarArr;
        boolean z = ahbx.a;
        if (j <= this.c) {
            long jB = b();
            long j5 = this.f + jB;
            if (this.g > 0) {
                j5++;
            }
            if (this.e != 0 && (ahjgVarArr = this.d) != null) {
                for (ahjg ahjgVar : ahjgVarArr) {
                    if (ahjgVar != null) {
                        long j6 = ((ahiu) ahjgVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.c) {
                long jK = k();
                int iMin = this.e > 0 ? Math.min(this.g, -((int) (jK - j5))) : this.g;
                agsw[] agswVarArr = ahjf.a;
                long j7 = this.g + jK;
                if (iMin > 0) {
                    agswVarArr = new agsw[iMin];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = 1;
                    long j8 = jK;
                    int i = 0;
                    while (true) {
                        if (jK >= j7) {
                            j2 = jB;
                            j3 = j5;
                            jK = j8;
                            break;
                        }
                        Object objA = ahit.a(objArr, jK);
                        j2 = jB;
                        ahmg ahmgVar = ahit.a;
                        if (objA != ahmgVar) {
                            objA.getClass();
                            int i2 = i + 1;
                            ahiq ahiqVar = (ahiq) objA;
                            j3 = j5;
                            agswVarArr[i] = ahiqVar.d;
                            ahit.b(objArr, jK, ahmgVar);
                            ahit.b(objArr, j8, ahiqVar.c);
                            long j9 = j8 + 1;
                            if (i2 >= iMin) {
                                jK = j9;
                                break;
                            }
                            i = i2;
                            j8 = j9;
                        } else {
                            j3 = j5;
                        }
                        jK++;
                        jB = j2;
                        j5 = j3;
                    }
                } else {
                    j2 = jB;
                    j3 = j5;
                    j4 = 1;
                }
                long j10 = jK - j2;
                long j11 = this.e == 0 ? jK : j3;
                long jMax = Math.max(this.b, jK - Math.min(0, (int) j10));
                if (jMax < j7) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (agvy.c(ahit.a(objArr2, jMax), ahit.a)) {
                        jK += j4;
                        jMax += j4;
                    }
                }
                n(jMax, j11, jK, j7);
                e();
                return agswVarArr.length == 0 ? agswVarArr : q(agswVarArr);
            }
        }
        return ahjf.a;
    }

    @Override // defpackage.ahip, defpackage.ahgr
    public final Object fD(ahgs ahgsVar, agsw agswVar) {
        return c(this, ahgsVar, agswVar);
    }

    @Override // defpackage.ahje
    public final /* synthetic */ ahjg[] g() {
        return new ahiu[2];
    }

    @Override // defpackage.ahjz
    public final ahgr h(agte agteVar, int i, int i2) {
        return ahit.c(this, agteVar, i, i2);
    }
}
