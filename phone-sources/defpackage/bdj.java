package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdj {
    public final bdg a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public jc s;
    public jc t;
    private ja u;
    private final ira v;
    private final ira w;
    private final ira x;

    public bdj(bdg bdgVar) {
        this.a = bdgVar;
        this.b = bdgVar.a;
        this.c = bdgVar.c;
        this.d = bdgVar.h;
        this.e = bdgVar.i;
        this.s = bdgVar.j;
        int i = bdgVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = bdgVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.v = new ira((char[]) null);
        this.w = new ira((char[]) null);
        this.x = new ira((char[]) null);
        this.p = i;
        this.q = -1;
    }

    public static final int T(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static /* synthetic */ void V(bdj bdjVar) {
        int i = bdjVar.q;
        int iG = bdjVar.g(i) * 5;
        int[] iArr = bdjVar.b;
        int i2 = iG + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) == 0) {
            bdjVar.N(bdjVar.k(i));
        }
    }

    private final int Z(int[] iArr, int i) {
        return c(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int aa(int[] iArr, int i) {
        return ab(iArr[(g(i) * 5) + 2]);
    }

    private final int ab(int i) {
        return i > -2 ? i : f() + i + 2;
    }

    private final int ac(int i, int i2) {
        return i < i2 ? i : -((f() - i) + 2);
    }

    private final void ad() {
        this.w.g((e() - this.g) - this.p);
    }

    private final void ae(int i, Object obj, boolean z, Object obj2) {
        int iA;
        ira iraVar = this.x;
        int i2 = this.q;
        int i3 = this.m;
        iraVar.g(this.n);
        if (i3 > 0) {
            int i4 = this.o;
            int iC = c(this.b, g(i4));
            B(1);
            this.h = iC;
            this.i = iC;
            int iG = g(i4);
            Object obj3 = ban.a;
            int i5 = obj != obj3 ? 1 : 0;
            int i6 = (z || obj2 == obj3) ? 0 : 1;
            int i7 = this.k;
            int i8 = this.j;
            int length = this.c.length;
            int iT = T(iC, i8, i7, length);
            if (iT >= 0 && this.l < i4) {
                iT = -(((length - i7) - iT) + 1);
            }
            int[] iArr = this.b;
            int i9 = this.q;
            int i10 = iG * 5;
            iArr[i10] = i;
            iArr[i10 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i10 + 2] = i9;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = iT;
            int i11 = (z ? 1 : 0) + i5 + i6;
            if (i11 > 0) {
                C(i11, i4);
                Object[] objArr = this.c;
                int i12 = this.h;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i5 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i6 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.h = i12;
            }
            this.n = 0;
            iA = i4 + 1;
            this.q = i4;
            this.o = iA;
            if (i2 >= 0 && Y(i2) != null) {
                throw null;
            }
        } else {
            this.v.g(i2);
            ad();
            int i13 = this.o;
            int iG2 = g(i13);
            if (!yks.e(obj2, ban.a)) {
                if (z) {
                    O(this.o, obj2);
                } else {
                    M(obj2);
                }
            }
            this.h = m(this.b, iG2);
            this.i = c(this.b, g(this.o + 1));
            int[] iArr2 = this.b;
            this.n = iArr2[(iG2 * 5) + 1] & 67108863;
            this.q = i13;
            this.o = i13 + 1;
            iA = i13 + bdi.a(iArr2, iG2);
        }
        this.p = iA;
    }

    private static final int af(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    private final void ag() {
        this.p = (e() - this.g) - this.w.e();
    }

    private final void ah(Object obj) {
        if (this.m > 0) {
            C(1, this.q);
        }
        Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.i) {
            bau.i("Writing to an invalid slot");
        }
        this.c[d(this.h - 1)] = obj;
    }

    public final void A(int i, yjz yjzVar) {
        int i2;
        int i3;
        bac bacVar;
        yjz yjzVar2 = yjzVar;
        int iK = k(i);
        int iF = f();
        int i4 = i(i) + i;
        byte[] bArr = null;
        int i5 = i;
        je jeVar = null;
        ja jaVar = null;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int iB = b(i6);
            for (int iB2 = b(i5); iB2 < iB; iB2++) {
                Object obj = this.c[d(iB2)];
                if ((obj instanceof bdb) && (bacVar = ((bdb) obj).b) != null && bacVar.a()) {
                    int iA = a(bacVar);
                    if (jeVar == null) {
                        int[] iArr = jf.a;
                        jeVar = new je(bArr);
                    }
                    if (jaVar == null) {
                        jaVar = new ja(bArr);
                    }
                    jeVar.d(iA);
                    jaVar.d(iA);
                    jaVar.d(iB2);
                } else {
                    yjzVar2.a(Integer.valueOf(iB2), obj);
                }
            }
            int iK2 = i6 < iF ? k(i6) : -1;
            if (iK2 == i5) {
                i2 = iF;
            } else {
                while (true) {
                    if (jaVar == null || jeVar == null || !jeVar.e(i5)) {
                        i2 = iF;
                    } else {
                        int i7 = jaVar.b;
                        int i8 = i7 / 2;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < i8) {
                            int i11 = i9 + i9;
                            int i12 = iF;
                            int iA2 = jaVar.a(i11);
                            if (iA2 == i5) {
                                int iA3 = jaVar.a(i11 + 1);
                                yjzVar2.a(Integer.valueOf(iA3), this.c[d(iA3)]);
                            } else if (i11 != i10) {
                                int i13 = i10 + 1;
                                jaVar.f(i10, iA2);
                                i10 += 2;
                                jaVar.f(i13, jaVar.a(i11 + 1));
                            } else {
                                i10 += 2;
                            }
                            i9++;
                            yjzVar2 = yjzVar;
                            iF = i12;
                        }
                        i2 = iF;
                        if (i10 != i7) {
                            if (i10 < 0 || i10 > (i3 = jaVar.b) || i7 < 0 || i7 > i3) {
                                kv.c("Index must be between 0 and size");
                            }
                            if (i7 < i10) {
                                kv.a("The end index must be < start index");
                            }
                            if (i7 != i10) {
                                int i14 = jaVar.b;
                                if (i7 < i14) {
                                    int[] iArr2 = jaVar.a;
                                    yfm.bh(iArr2, iArr2, i10, i7, i14);
                                }
                                jaVar.b -= i7 - i10;
                            }
                        }
                    }
                    if (i5 == i || iK == iK2) {
                        break;
                    }
                    i5 = iK;
                    iF = i2;
                    iK = k(iK);
                    yjzVar2 = yjzVar;
                }
            }
            yjzVar2 = yjzVar;
            iK = iK2;
            i5 = i6;
            iF = i2;
            bArr = null;
        }
    }

    public final void B(int i) {
        if (i > 0) {
            int i2 = this.o;
            D(i2);
            int i3 = this.f;
            int i4 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                int i6 = iMax * 5;
                int i7 = iMax - i5;
                int[] iArr2 = new int[i6];
                yfm.bh(iArr, iArr2, 0, 0, i3 * 5);
                yfm.bh(iArr, iArr2, (i3 + i7) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i7;
            }
            int i8 = this.p;
            if (i8 >= i3) {
                this.p = i8 + i;
            }
            int i9 = i3 + i;
            this.f = i9;
            this.g = i4 - i;
            int iT = T(i5 > 0 ? b(i2 + i) : 0, this.l >= i3 ? this.j : 0, this.k, this.c.length);
            for (int i10 = i3; i10 < i9; i10++) {
                this.b[(i10 * 5) + 4] = iT;
            }
            int i11 = this.l;
            if (i11 >= i3) {
                this.l = i11 + i;
            }
        }
    }

    public final void C(int i, int i2) {
        if (i > 0) {
            E(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.i;
            if (i9 >= i3) {
                this.i = i9 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final void D(int i) {
        bac bacVar;
        int i2;
        bac bacVar2;
        int i3;
        int i4;
        int i5 = this.g;
        int i6 = this.f;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iE = e() - this.g;
                if (i6 < i) {
                    for (int iB = bdi.b(this.d, i6, iE); iB < this.d.size() && (i3 = (bacVar2 = (bac) this.d.get(iB)).a) < 0 && (i4 = i3 + iE) < i; iB++) {
                        bacVar2.a = i4;
                    }
                } else {
                    for (int iB2 = bdi.b(this.d, i, iE); iB2 < this.d.size() && (i2 = (bacVar = (bac) this.d.get(iB2)).a) >= 0; iB2++) {
                        bacVar.a = -(iE - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                int i10 = i7 + i8;
                if (i < i6) {
                    yfm.bh(iArr, iArr, i10, i7, i9);
                } else {
                    yfm.bh(iArr, iArr, i9, i8 + i9, i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iE2 = e();
            if (i6 >= iE2) {
                bau.i("Check failed");
            }
            while (i6 < iE2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.b[i11];
                int iAc = ac(ab(i12), i);
                if (iAc != i12) {
                    this.b[i11] = iAc;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f = i;
    }

    public final void E(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, f());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iG = g(iMin);
                int iG2 = g(i5);
                int i7 = this.f;
                while (iG < iG2) {
                    int i8 = (iG * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        bau.i("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iG++;
                    if (iG == i7) {
                        iG += this.g;
                    }
                }
            } else {
                int iG3 = g(i5);
                int iG4 = g(iMin);
                while (iG3 < iG4) {
                    int i10 = (iG3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        bau.i("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iG3++;
                    if (iG3 == this.f) {
                        iG3 += this.g;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final void F() {
        int i;
        ja jaVar = this.u;
        if (jaVar != null) {
            while (bcn.c(jaVar)) {
                int iA = bcn.a(jaVar);
                int iG = g(iA) * 5;
                int i2 = iA + 1;
                int i3 = i(iA) + iA;
                while (true) {
                    if (i2 >= i3) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(g(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += i(i2);
                    }
                }
                int[] iArr = this.b;
                int i4 = iG + 1;
                int i5 = iArr[i4];
                if (((67108864 & i5) != 0 ? 1 : 0) != i) {
                    iArr[i4] = (i << 26) | ((-67108865) & i5);
                    int iK = k(iA);
                    if (iK >= 0) {
                        bcn.b(jaVar, iK);
                    }
                }
            }
        }
    }

    public final void G(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            E(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            yfm.aD(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final void H() {
        int i = this.p;
        this.o = i;
        this.h = c(this.b, g(i));
    }

    public final void I(int i, Object obj, Object obj2) {
        ae(i, obj, false, obj2);
    }

    public final void J() {
        if (this.m != 0) {
            bau.i("Key must be supplied when inserting");
        }
        Object obj = ban.a;
        ae(0, obj, false, obj);
    }

    public final void K(int i, Object obj) {
        ae(i, obj, false, ban.a);
    }

    public final void L(int i, Object obj) {
        ae(i, obj, true, ban.a);
    }

    public final void M(Object obj) {
        int iG = g(this.o);
        if ((this.b[(iG * 5) + 1] & 268435456) == 0) {
            bau.i("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(Z(this.b, iG))] = obj;
    }

    public final void N(int i) {
        if (i >= 0) {
            ja jaVar = this.u;
            if (jaVar == null) {
                jaVar = new ja((byte[]) null);
                this.u = jaVar;
            }
            bcn.b(jaVar, i);
        }
    }

    public final void O(int i, Object obj) {
        int iG = g(i);
        int[] iArr = this.b;
        if (iG >= iArr.length || (iArr[(iG * 5) + 1] & 1073741824) == 0) {
            bau.i(a.cd(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, iG))] = obj;
    }

    public final boolean P(int i, int i2) {
        int iE;
        int i3;
        if (i2 == this.q) {
            iE = this.p;
        } else {
            ira iraVar = this.v;
            if (i2 > iraVar.d(0)) {
                i3 = i(i2);
            } else {
                int[] iArr = (int[]) iraVar.a;
                int iMin = Math.min(iArr.length, iraVar.b);
                int i4 = 0;
                while (true) {
                    if (i4 >= iMin) {
                        i4 = -1;
                        break;
                    }
                    if (iArr[i4] == i2) {
                        break;
                    }
                    i4++;
                }
                if (i4 < 0) {
                    i3 = i(i2);
                } else {
                    iE = (e() - this.g) - ((int[]) this.w.a)[i4];
                }
            }
            iE = i3 + i2;
        }
        return i > i2 && i < iE;
    }

    public final boolean Q(int i) {
        return (this.b[(g(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean R() {
        if (this.m != 0) {
            bau.i("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int iC = c(this.b, g(i));
        int iL = l();
        if (Y(this.q) != null && p(i) != null) {
            throw null;
        }
        ja jaVar = this.u;
        if (jaVar != null) {
            while (bcn.c(jaVar)) {
                if (jaVar.b == 0) {
                    kv.d("IntList is empty.");
                }
                if (jaVar.a[0] < i) {
                    break;
                }
                bcn.a(jaVar);
            }
        }
        boolean zS = S(i, this.o - i);
        G(iC, this.h - iC, i - 1);
        this.o = i;
        this.h = i2;
        this.n -= iL;
        return zS;
    }

    public final boolean S(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            D(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = bdi.b(this.d, i3, e() - this.g);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    bac bacVar = (bac) this.d.get(iB);
                    int iA = a(bacVar);
                    if (iA < i) {
                        break;
                    }
                    if (iA < i3) {
                        bacVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.f = i;
            this.g += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = Math.max(i, i6 - i2);
            }
            int i7 = this.p;
            if (i7 >= this.f) {
                this.p = i7 - i2;
            }
            int i8 = this.q;
            if (i8 >= 0 && (this.b[(g(i8) * 5) + 1] & 67108864) != 0) {
                N(i8);
            }
        }
        return z;
    }

    public final void U() {
        kc kcVar;
        int i = this.m;
        int i2 = this.o;
        int i3 = this.p;
        int i4 = this.q;
        int iG = g(i4);
        int i5 = i2 - i4;
        int i6 = this.n;
        int i7 = (iG * 5) + 1;
        int i8 = this.b[i7] & 1073741824;
        if (i > 0) {
            jc jcVar = this.t;
            if (jcVar != null && (kcVar = (kc) jcVar.a(i4)) != null) {
                Object[] objArr = kcVar.a;
                int i9 = kcVar.b;
                for (int i10 = 0; i10 < i9; i10++) {
                    ah(objArr[i10]);
                }
            }
            bdi.h(this.b, iG, i5);
            bdi.i(this.b, iG, i6);
            ira iraVar = this.x;
            if (i8 != 0) {
                i6 = 1;
            }
            this.n = iraVar.e() + i6;
            int iAa = aa(this.b, i4);
            this.q = iAa;
            int iF = iAa < 0 ? f() : g(iAa + 1);
            iC = iF >= 0 ? c(this.b, iF) : 0;
            this.h = iC;
            this.i = iC;
            return;
        }
        if (i2 != i3) {
            bau.i("Expected to be at the end of a group");
        }
        int iA = bdi.a(this.b, iG);
        int[] iArr = this.b;
        int i11 = iArr[i7] & 67108863;
        bdi.h(iArr, iG, i5);
        bdi.i(this.b, iG, i6);
        int iE = this.v.e();
        ag();
        this.q = iE;
        int iAa2 = aa(this.b, i4);
        int iE2 = this.x.e();
        this.n = iE2;
        if (iAa2 == iE) {
            this.n = iE2 + (i8 == 0 ? i6 - i11 : 0);
            return;
        }
        int i12 = i5 - iA;
        int i13 = i8 != 0 ? 0 : i6 - i11;
        if (i12 != 0 || i13 != 0) {
            while (iAa2 != 0 && iAa2 != iE) {
                if (i13 == 0) {
                    if (i12 == 0) {
                        break;
                    } else {
                        i13 = 0;
                    }
                }
                int iG2 = g(iAa2);
                int i14 = (iG2 * 5) + 1;
                if (i12 != 0) {
                    bdi.h(this.b, iG2, bdi.a(this.b, iG2) + i12);
                }
                if (i13 != 0) {
                    int[] iArr2 = this.b;
                    bdi.i(iArr2, iG2, (iArr2[i14] & 67108863) + i13);
                }
                int[] iArr3 = this.b;
                if ((iArr3[i14] & 1073741824) != 0) {
                    i13 = 0;
                }
                iAa2 = aa(iArr3, iAa2);
            }
            iC = i13;
        }
        this.n += iC;
    }

    public final void W(bdg bdgVar, int i) {
        bdg bdgVar2;
        int i2;
        if (this.m <= 0) {
            bau.i("Check failed");
        }
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int iA = bdi.a(bdgVar.a, 0);
                int i3 = bdgVar.b;
                if (iA == i3) {
                    int[] iArr = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap map = this.e;
                    jc jcVar = this.s;
                    int[] iArr2 = bdgVar.a;
                    Object[] objArr2 = bdgVar.c;
                    int i4 = bdgVar.d;
                    HashMap map2 = bdgVar.i;
                    jc jcVar2 = bdgVar.j;
                    this.b = iArr2;
                    this.c = objArr2;
                    this.d = bdgVar.h;
                    this.f = i3;
                    this.g = (iArr2.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = map2;
                    this.s = jcVar2;
                    bdgVar.g(iArr, 0, objArr, 0, arrayList, map, jcVar);
                    return;
                }
            }
            bdgVar2 = bdgVar;
            i2 = 0;
        } else {
            bdgVar2 = bdgVar;
            i2 = i;
        }
        bdj bdjVarC = bdgVar2.c();
        try {
            bdi.j(bdjVarC, i2, this, true, true, false);
            bdjVarC.w(true);
        } catch (Throwable th) {
            bdjVarC.w(false);
            throw th;
        }
    }

    public final void X(Object obj) {
        if (this.m <= 0 || this.h == this.j) {
            ah(obj);
            return;
        }
        jc jcVar = this.t;
        byte[] bArr = null;
        if (jcVar == null) {
            jcVar = new jc(bArr);
        }
        this.t = jcVar;
        int i = this.q;
        Object objA = jcVar.a(i);
        if (objA == null) {
            objA = new kc(bArr);
            jcVar.f(i, objA);
        }
        ((kc) objA).p(obj);
    }

    public final bcm Y(int i) {
        bac bacVarP;
        HashMap map = this.e;
        if (map == null || (bacVarP = p(i)) == null) {
            return null;
        }
        return (bcm) map.get(bacVarP);
    }

    public final int a(bac bacVar) {
        int i = bacVar.a;
        return i < 0 ? f() + i : i;
    }

    public final int b(int i) {
        return c(this.b, g(i));
    }

    public final int c(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.k : af(iArr[(i * 5) + 4], this.k, this.c.length);
    }

    public final int d(int i) {
        return i + (this.k * (i < this.j ? 0 : 1));
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.g;
    }

    public final int g(int i) {
        return i + (this.g * (i < this.f ? 0 : 1));
    }

    public final int h(int i) {
        return this.b[g(i) * 5];
    }

    public final int i(int i) {
        return bdi.a(this.b, g(i));
    }

    public final int j(int i) {
        return this.b[(g(i) * 5) + 1] & 67108863;
    }

    public final int k(int i) {
        return aa(this.b, i);
    }

    public final int l() {
        int i = this.o;
        int iG = g(i);
        int iA = i + bdi.a(this.b, iG);
        this.o = iA;
        this.h = c(this.b, g(iA));
        int i2 = this.b[(iG * 5) + 1];
        if ((1073741824 & i2) != 0) {
            return 1;
        }
        return i2 & 67108863;
    }

    public final int m(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.k : af(bdi.e(iArr, i), this.k, this.c.length);
    }

    public final int n(int i) {
        return m(this.b, g(i));
    }

    public final bac o(int i) {
        ArrayList arrayList = this.d;
        int iD = bdi.d(arrayList, i, f());
        if (iD >= 0) {
            return (bac) arrayList.get(iD);
        }
        if (i > this.f) {
            i = -(f() - i);
        }
        bac bacVar = new bac(i);
        arrayList.add(-(iD + 1), bacVar);
        return bacVar;
    }

    public final bac p(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return bdi.f(this.d, i, f());
    }

    public final Object q(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        return (iArr[(iG * 5) + 1] & 268435456) != 0 ? this.c[Z(iArr, iG)] : ban.a;
    }

    public final Object r(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        if ((iArr[(iG * 5) + 1] & 536870912) != 0) {
            return this.c[bdi.c(iArr, iG)];
        }
        return null;
    }

    public final Object s(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        if ((iArr[(iG * 5) + 1] & 1073741824) != 0) {
            return this.c[d(c(iArr, iG))];
        }
        return null;
    }

    public final Object t(int i, int i2, Object obj) {
        int iM = m(this.b, g(i));
        int iC = c(this.b, g(i + 1));
        int i3 = iM + i2;
        if (i3 < iM || i3 >= iC) {
            bau.i(a.ce(i, i2, "Write to an invalid slot index ", " for group "));
        }
        int iD = d(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.o + " end=" + this.p + " size = " + f() + " gap=" + this.f + '-' + (this.f + this.g) + ')';
    }

    public final void u(int i) {
        if (i < 0) {
            bau.i("Cannot seek backwards");
        }
        if (this.m > 0) {
            bcm.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.o + i;
        if (i2 < this.q || i2 > this.p) {
            bau.i("Cannot seek outside the current group (" + this.q + '-' + this.p + ')');
        }
        this.o = i2;
        int iC = c(this.b, g(i2));
        this.h = iC;
        this.i = iC;
    }

    public final void v() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            ad();
        }
    }

    public final void w(boolean z) {
        this.r = true;
        if (z && this.v.b == 0) {
            D(f());
            E(this.c.length - this.k, this.f);
            int i = this.j;
            yfm.aD(this.c, null, i, this.k + i);
            F();
        }
        bdg bdgVar = this.a;
        int[] iArr = this.b;
        int i2 = this.f;
        Object[] objArr = this.c;
        int i3 = this.j;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        jc jcVar = this.s;
        if (!bdgVar.f) {
            bcm.a("Unexpected writer close()");
        }
        bdgVar.f = false;
        bdgVar.g(iArr, i2, objArr, i3, arrayList, map, jcVar);
    }

    public final void x() {
        if (this.m <= 0) {
            bcm.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.x.b != this.v.b) {
                bau.i("startGroup/endGroup mismatch while inserting");
            }
            ag();
        }
    }

    public final void y(int i) {
        if (this.m > 0) {
            bau.i("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                bau.i(a.ce(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.o;
            int i4 = this.h;
            int i5 = this.i;
            this.o = i;
            J();
            this.o = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void z(int i, int i2, int i3) {
        int iAc = ac(i, this.f);
        while (i3 < i2) {
            int[] iArr = this.b;
            iArr[(g(i3) * 5) + 2] = iAc;
            int iA = bdi.a(iArr, g(i3)) + i3;
            z(i3, iA, i3 + 1);
            i3 = iA;
        }
    }
}
