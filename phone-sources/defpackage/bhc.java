package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhc {
    public static final bhc a = new bhc(0, 0, new Object[0]);
    public Object[] b;
    private int c;
    private int d;
    private final a e;

    public bhc(int i, int i2, Object[] objArr, a aVar) {
        this.c = i;
        this.d = i2;
        this.e = aVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int iBitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = iBitCount + iBitCount; i < length; i++) {
            iBitCount += h(i).n();
        }
        return iBitCount;
    }

    private final bhc o(int i, bgw bgwVar) {
        bgwVar.f(bgwVar.a() - 1);
        bgwVar.b = s(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != bgwVar.e) {
            return new bhc(0, 0, a.bO(objArr, i), bgwVar.e);
        }
        this.b = a.bO(objArr, i);
        return this;
    }

    private final bhc p(int i, int i2, bgw bgwVar) {
        bgwVar.f(bgwVar.a() - 1);
        bgwVar.b = s(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != bgwVar.e) {
            return new bhc(i2 ^ this.c, this.d, a.bO(objArr, i), bgwVar.e);
        }
        this.b = a.bO(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final bhc q(int i, int i2, bhc bhcVar) {
        Object[] objArr = bhcVar.b;
        if (objArr.length != 2 || bhcVar.d != 0) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i] = bhcVar;
            return new bhc(this.c, this.d, objArrCopyOf);
        }
        if (this.b.length == 1) {
            bhcVar.c = this.d;
            return bhcVar;
        }
        int iB = b(i2);
        Object[] objArr3 = this.b;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int length = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, length + 1);
        objArrCopyOf2.getClass();
        yfm.bj(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, length);
        yfm.bj(objArrCopyOf2, objArrCopyOf2, iB + 2, iB, i);
        objArrCopyOf2[iB] = obj;
        objArrCopyOf2[iB + 1] = obj2;
        return new bhc(this.c ^ i2, i2 ^ this.d, objArrCopyOf2);
    }

    private final Object r(int i) {
        return this.b[i];
    }

    private final Object s(int i) {
        return this.b[i + 1];
    }

    private final boolean t(Object obj) {
        ymb ymbVarQ = ykn.q(ykn.r(0, this.b.length), 2);
        int i = ymbVarQ.a;
        int i2 = ymbVarQ.b;
        int i3 = ymbVarQ.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!yks.e(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean u(bhc bhcVar) {
        if (this == bhcVar) {
            return true;
        }
        if (this.d != bhcVar.d || this.c != bhcVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != bhcVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean v(int i) {
        return (i & this.d) != 0;
    }

    private final bhc w(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, a aVar) {
        if (i3 > 30) {
            return new bhc(0, 0, new Object[]{obj, obj2, obj3, obj4}, aVar);
        }
        int iBM = a.bM(i, i3);
        int iBM2 = a.bM(i2, i3);
        if (iBM == iBM2) {
            return new bhc(0, 1 << iBM, new Object[]{w(i, obj, obj2, i2, obj3, obj4, i3 + 5, aVar)}, aVar);
        }
        Object[] objArr = new Object[4];
        if (iBM < iBM2) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new bhc((1 << iBM) | (1 << iBM2), 0, objArr, aVar);
    }

    private final bhc x(bhc bhcVar, bhc bhcVar2, int i, int i2, a aVar) {
        if (bhcVar2 != null) {
            return (this.e == aVar || bhcVar != bhcVar2) ? y(i, bhcVar2, aVar) : this;
        }
        Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != aVar) {
            return new bhc(this.c, i2 ^ this.d, a.bP(objArr, i), aVar);
        }
        this.b = a.bP(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final bhc y(int i, bhc bhcVar, a aVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (bhcVar.b.length == 2 && bhcVar.d == 0) {
                bhcVar.c = this.d;
                return bhcVar;
            }
            length = 1;
        }
        if (this.e == aVar) {
            objArr[i] = bhcVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = bhcVar;
        return new bhc(this.c, this.d, objArrCopyOf, aVar);
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, a aVar) {
        Object objR = r(i);
        bhc bhcVarW = w(objR != null ? objR.hashCode() : 0, objR, s(i), i3, obj, obj2, i4 + 5, aVar);
        int iC = c(i2);
        int i5 = iC + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        yfm.bu(objArr, objArr2, 0, i, 6);
        yfm.bj(objArr, objArr2, i, i + 2, i5);
        objArr2[iC - 1] = bhcVarW;
        yfm.bj(objArr, objArr2, iC, i5, length);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int iBitCount = Integer.bitCount((i - 1) & this.c);
        return iBitCount + iBitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount((i - 1) & this.d);
    }

    public final bhc d(int i, Object obj, Object obj2, int i2, bgw bgwVar) {
        bgw bgwVar2;
        bhc bhcVarD;
        int iBM = 1 << a.bM(i, i2);
        if (l(iBM)) {
            int iB = b(iBM);
            if (!yks.e(obj, r(iB))) {
                bgwVar.f(bgwVar.a() + 1);
                a aVar = bgwVar.e;
                if (this.e != aVar) {
                    return new bhc(this.c ^ iBM, this.d | iBM, z(iB, iBM, i, obj, obj2, i2, aVar), aVar);
                }
                this.b = z(iB, iBM, i, obj, obj2, i2, aVar);
                this.c ^= iBM;
                this.d |= iBM;
                return this;
            }
            bgwVar.b = s(iB);
            if (s(iB) == obj2) {
                return this;
            }
            int i3 = iB + 1;
            if (this.e == bgwVar.e) {
                this.b[i3] = obj2;
                return this;
            }
            bgwVar.c++;
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i3] = obj2;
            return new bhc(this.c, this.d, objArrCopyOf, bgwVar.e);
        }
        if (!v(iBM)) {
            bgwVar.f(bgwVar.a() + 1);
            a aVar2 = bgwVar.e;
            int iB2 = b(iBM);
            if (this.e != aVar2) {
                return new bhc(this.c | iBM, this.d, a.bN(this.b, iB2, obj, obj2), aVar2);
            }
            this.b = a.bN(this.b, iB2, obj, obj2);
            this.c |= iBM;
            return this;
        }
        int iC = c(iBM);
        bhc bhcVarH = h(iC);
        if (i2 == 30) {
            ymb ymbVarQ = ykn.q(ykn.r(0, bhcVarH.b.length), 2);
            int i4 = ymbVarQ.a;
            int i5 = ymbVarQ.b;
            int i6 = ymbVarQ.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                bgwVar.f(bgwVar.a() + 1);
                bhcVarD = new bhc(0, 0, a.bN(bhcVarH.b, 0, obj, obj2), bgwVar.e);
                bgwVar2 = bgwVar;
            } else {
                while (!yks.e(obj, bhcVarH.r(i4))) {
                    if (i4 == i5) {
                        bgwVar.f(bgwVar.a() + 1);
                        bhcVarD = new bhc(0, 0, a.bN(bhcVarH.b, 0, obj, obj2), bgwVar.e);
                        break;
                    }
                    i4 += i6;
                }
                int i7 = i4 + 1;
                bgwVar.b = bhcVarH.s(i4);
                if (bhcVarH.e == bgwVar.e) {
                    bhcVarH.b[i7] = obj2;
                    bgwVar2 = bgwVar;
                    bhcVarD = bhcVarH;
                } else {
                    bgwVar.c++;
                    Object[] objArr2 = bhcVarH.b;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2.getClass();
                    objArrCopyOf2[i7] = obj2;
                    bhcVarD = new bhc(0, 0, objArrCopyOf2, bgwVar.e);
                    bgwVar2 = bgwVar;
                }
            }
        } else {
            bgwVar2 = bgwVar;
            bhcVarD = bhcVarH.d(i, obj, obj2, i2 + 5, bgwVar2);
        }
        return bhcVarH != bhcVarD ? y(iC, bhcVarD, bgwVar2.e) : this;
    }

    public final bhc e(bhc bhcVar, int i, bhl bhlVar, bgw bgwVar) {
        bhc bhcVar2;
        bgw bgwVar2;
        Object[] objArr;
        int i2;
        bhc bhcVarW;
        int i3;
        int iHashCode;
        bgw bgwVar3 = bgwVar;
        if (this == bhcVar) {
            bhlVar.a += n();
            return this;
        }
        int i4 = 0;
        if (i > 30) {
            a aVar = bgwVar3.e;
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + bhcVar.b.length);
            objArrCopyOf.getClass();
            int length = this.b.length;
            ymb ymbVarQ = ykn.q(ykn.r(0, bhcVar.b.length), 2);
            int i5 = ymbVarQ.a;
            int i6 = ymbVarQ.b;
            int i7 = ymbVarQ.c;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (t(bhcVar.b[i5])) {
                        bhlVar.a++;
                    } else {
                        Object[] objArr3 = bhcVar.b;
                        objArrCopyOf[length] = objArr3[i5];
                        objArrCopyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length != this.b.length) {
                if (length != bhcVar.b.length) {
                    if (length == objArrCopyOf.length) {
                        return new bhc(0, 0, objArrCopyOf, aVar);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    objArrCopyOf2.getClass();
                    return new bhc(0, 0, objArrCopyOf2, aVar);
                }
            }
            return this;
        }
        int i8 = this.d | bhcVar.d;
        int i9 = this.c;
        int i10 = bhcVar.c;
        int i11 = i9 ^ i10;
        int i12 = i9 & i10;
        int i13 = (~i8) & i11;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            if (yks.e(r(b(iLowestOneBit)), bhcVar.r(bhcVar.b(iLowestOneBit)))) {
                i13 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i12 ^= iLowestOneBit;
        }
        if ((i8 & i13) != 0) {
            bcm.b("Check failed.");
        }
        if (yks.e(this.e, bgwVar3.e) && this.c == i13 && this.d == i8) {
            bhcVar2 = this;
        } else {
            int iBitCount = Integer.bitCount(i13);
            bhcVar2 = new bhc(i13, i8, new Object[iBitCount + iBitCount + Integer.bitCount(i8)]);
        }
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr4 = bhcVar2.b;
            int length2 = (objArr4.length - 1) - i15;
            if (v(iLowestOneBit2)) {
                bhcVarW = h(c(iLowestOneBit2));
                if (bhcVar.v(iLowestOneBit2)) {
                    bhcVarW = bhcVarW.e(bhcVar.h(bhcVar.c(iLowestOneBit2)), i + 5, bhlVar, bgwVar3);
                    bgwVar2 = bgwVar3;
                } else {
                    if (bhcVar.l(iLowestOneBit2)) {
                        int i16 = i + 5;
                        int iB = bhcVar.b(iLowestOneBit2);
                        Object objR = bhcVar.r(iB);
                        Object objS = bhcVar.s(iB);
                        int iA = bgwVar3.a();
                        if (objR != null) {
                            i3 = iA;
                            iHashCode = objR.hashCode();
                        } else {
                            int i17 = i4;
                            i3 = iA;
                            iHashCode = i17;
                        }
                        bhcVarW = bhcVarW.d(iHashCode, objR, objS, i16, bgwVar3);
                        if (bgwVar.a() == i3) {
                            bhlVar.a++;
                        }
                    }
                    bgwVar2 = bgwVar;
                }
            } else if (bhcVar.v(iLowestOneBit2)) {
                bhcVarW = bhcVar.h(bhcVar.c(iLowestOneBit2));
                if (l(iLowestOneBit2)) {
                    int i18 = i + 5;
                    int iB2 = b(iLowestOneBit2);
                    Object objR2 = r(iB2);
                    if (bhcVarW.k(objR2 != null ? objR2.hashCode() : 0, objR2, i18)) {
                        bhlVar.a++;
                    } else {
                        bgwVar3 = bgwVar;
                        bhcVarW = bhcVarW.d(objR2 != null ? objR2.hashCode() : 0, objR2, s(iB2), i18, bgwVar3);
                        bgwVar2 = bgwVar3;
                    }
                }
                bgwVar2 = bgwVar;
            } else {
                bgwVar2 = bgwVar;
                int i19 = i + 5;
                int iB3 = b(iLowestOneBit2);
                Object objR3 = r(iB3);
                Object objS2 = s(iB3);
                int iB4 = bhcVar.b(iLowestOneBit2);
                Object objR4 = bhcVar.r(iB4);
                objArr = objArr4;
                i2 = iLowestOneBit2;
                bhcVarW = w(objR3 != null ? objR3.hashCode() : 0, objR3, objS2, objR4 != null ? objR4.hashCode() : 0, objR4, bhcVar.s(iB4), i19, bgwVar2.e);
                objArr[length2] = bhcVarW;
                i14 ^= i2;
                i15++;
                bgwVar3 = bgwVar2;
                i4 = 0;
            }
            i2 = iLowestOneBit2;
            objArr = objArr4;
            objArr[length2] = bhcVarW;
            i14 ^= i2;
            i15++;
            bgwVar3 = bgwVar2;
            i4 = 0;
        }
        int i20 = 0;
        while (i13 != 0) {
            int i21 = i20 + i20;
            int i22 = i21 + 1;
            int iLowestOneBit3 = Integer.lowestOneBit(i13);
            if (bhcVar.l(iLowestOneBit3)) {
                int iB5 = bhcVar.b(iLowestOneBit3);
                bhcVar2.b[i21] = bhcVar.r(iB5);
                bhcVar2.b[i22] = bhcVar.s(iB5);
                if (l(iLowestOneBit3)) {
                    bhlVar.a++;
                }
            } else {
                int iB6 = b(iLowestOneBit3);
                bhcVar2.b[i21] = r(iB6);
                bhcVar2.b[i22] = s(iB6);
            }
            i13 ^= iLowestOneBit3;
            i20++;
        }
        if (!u(bhcVar2)) {
            return bhcVar.u(bhcVar2) ? bhcVar : bhcVar2;
        }
        return this;
    }

    public final bhc f(int i, Object obj, int i2, bgw bgwVar) {
        bhc bhcVarF;
        bhc bhcVar;
        int iBM = 1 << a.bM(i, i2);
        if (l(iBM)) {
            int iB = b(iBM);
            if (yks.e(obj, r(iB))) {
                return p(iB, iBM, bgwVar);
            }
        } else if (v(iBM)) {
            int iC = c(iBM);
            bhc bhcVarH = h(iC);
            if (i2 == 30) {
                ymb ymbVarQ = ykn.q(ykn.r(0, bhcVarH.b.length), 2);
                int i3 = ymbVarQ.a;
                int i4 = ymbVarQ.b;
                int i5 = ymbVarQ.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!yks.e(obj, bhcVarH.r(i3))) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    bhcVarF = bhcVarH.o(i3, bgwVar);
                }
                bhcVar = bhcVarH;
                return x(bhcVarH, bhcVar, iC, iBM, bgwVar.e);
            }
            bhcVarF = bhcVarH.f(i, obj, i2 + 5, bgwVar);
            bhcVar = bhcVarF;
            return x(bhcVarH, bhcVar, iC, iBM, bgwVar.e);
        }
        return this;
    }

    public final bhc g(int i, Object obj, Object obj2, int i2, bgw bgwVar) {
        bhc bhcVar;
        int iBM = 1 << a.bM(i, i2);
        if (l(iBM)) {
            int iB = b(iBM);
            if (yks.e(obj, r(iB)) && yks.e(obj2, s(iB))) {
                return p(iB, iBM, bgwVar);
            }
        } else if (v(iBM)) {
            int iC = c(iBM);
            bhc bhcVarH = h(iC);
            if (i2 == 30) {
                ymb ymbVarQ = ykn.q(ykn.r(0, bhcVarH.b.length), 2);
                int i3 = ymbVarQ.a;
                int i4 = ymbVarQ.b;
                int i5 = ymbVarQ.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    bhcVar = bhcVarH;
                } else {
                    while (true) {
                        if (!yks.e(obj, bhcVarH.r(i3)) || !yks.e(obj2, bhcVarH.s(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            bhc bhcVarO = bhcVarH.o(i3, bgwVar);
                            bhcVar = bhcVarH;
                            bhcVarH = bhcVarO;
                            break;
                        }
                    }
                    bhcVar = bhcVarH;
                }
            } else {
                bhcVar = bhcVarH;
                bhcVarH = bhcVar.g(i, obj, obj2, i2 + 5, bgwVar);
            }
            bhc bhcVar2 = bhcVarH;
            return x(bhcVar, bhcVar2, iC, iBM, bgwVar.e);
        }
        return this;
    }

    public final bhc h(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (bhc) obj;
    }

    public final bhc i(int i, Object obj, int i2) {
        bhc bhcVarI;
        int iBM = 1 << a.bM(i, i2);
        if (l(iBM)) {
            int iB = b(iBM);
            if (yks.e(obj, r(iB))) {
                Object[] objArr = this.b;
                if (objArr.length == 2) {
                    return null;
                }
                return new bhc(this.c ^ iBM, this.d, a.bO(objArr, iB));
            }
        } else if (v(iBM)) {
            int iC = c(iBM);
            bhc bhcVarH = h(iC);
            if (i2 == 30) {
                ymb ymbVarQ = ykn.q(ykn.r(0, bhcVarH.b.length), 2);
                int i3 = ymbVarQ.a;
                int i4 = ymbVarQ.b;
                int i5 = ymbVarQ.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    bhcVarI = bhcVarH;
                    break;
                }
                while (!yks.e(obj, bhcVarH.r(i3))) {
                    if (i3 == i4) {
                        bhcVarI = bhcVarH;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = bhcVarH.b;
                bhcVarI = objArr2.length == 2 ? null : new bhc(0, 0, a.bO(objArr2, i3));
            } else {
                bhcVarI = bhcVarH.i(i, obj, i2 + 5);
            }
            if (bhcVarI == null) {
                Object[] objArr3 = this.b;
                if (objArr3.length == 1) {
                    return null;
                }
                return new bhc(this.c, iBM ^ this.d, a.bP(objArr3, iC));
            }
            if (bhcVarH != bhcVarI) {
                return q(iC, iBM, bhcVarI);
            }
        }
        return this;
    }

    public final Object j(int i, Object obj, int i2) {
        int iBM = 1 << a.bM(i, i2);
        if (l(iBM)) {
            int iB = b(iBM);
            if (yks.e(obj, r(iB))) {
                return s(iB);
            }
            return null;
        }
        if (!v(iBM)) {
            return null;
        }
        bhc bhcVarH = h(c(iBM));
        if (i2 != 30) {
            return bhcVarH.j(i, obj, i2 + 5);
        }
        ymb ymbVarQ = ykn.q(ykn.r(0, bhcVarH.b.length), 2);
        int i3 = ymbVarQ.a;
        int i4 = ymbVarQ.b;
        int i5 = ymbVarQ.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!yks.e(obj, bhcVarH.r(i3))) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return bhcVarH.s(i3);
        }
        return null;
    }

    public final boolean k(int i, Object obj, int i2) {
        int iBM = 1 << a.bM(i, i2);
        if (l(iBM)) {
            return yks.e(obj, r(b(iBM)));
        }
        if (!v(iBM)) {
            return false;
        }
        bhc bhcVarH = h(c(iBM));
        return i2 == 30 ? bhcVarH.t(obj) : bhcVarH.k(i, obj, i2 + 5);
    }

    public final boolean l(int i) {
        return (i & this.c) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        r13.b = q(r11, r4, (defpackage.bhc) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.etc m(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhc.m(int, java.lang.Object, java.lang.Object, int):etc");
    }

    public bhc(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
