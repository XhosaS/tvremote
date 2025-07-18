package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfq {
    public final cfp a;
    public final cfr b;
    public boolean c;
    public Object d;
    private boolean e;
    private boolean f;
    private long g;
    private final yjk h;
    private final bmw i;
    private final kc j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cfq() {
        this(null);
        jd.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(defpackage.bys r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfq.g(bys, long, boolean):void");
    }

    private final void h(bys bysVar) {
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            g(bysVar2, bysVar2.o().x, false);
            h(bysVar2);
        }
    }

    private static final long i(bys bysVar) {
        float[] fArrL;
        int iQ;
        bzq bzqVarO = bysVar.o();
        bzq bzqVarN = bysVar.n();
        long jC = 0;
        while (bzqVarN != null && bzqVarN != bzqVarO) {
            bzx bzxVar = bzqVarN.C;
            jC = cme.c(jC, bzqVarN.x);
            bzqVarN = bzqVarN.w;
            if (bzxVar != null && (iQ = ccf.q((fArrL = bzxVar.l()))) != 3) {
                if ((iQ & 2) == 0) {
                    return 9223372034707292159L;
                }
                jC = boa.a(fArrL, jC);
            }
        }
        return cme.d(jC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r6 = r3.b;
        r3 = r3.a;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r8 = (long[]) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r7 >= (r8.length - 2)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r7 >= r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r9 = r7 + 2;
        r8[r9] = r8[r9] & (-2305843009213693953L);
        r7 = r7 + 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfq.a():void");
    }

    public final void b() {
        this.e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void c(bys bysVar) {
        this.e = true;
        int i = bysVar.c & 67108863;
        cfp cfpVar = this.a;
        Object obj = cfpVar.b;
        int i2 = cfpVar.a;
        boolean z = false;
        int i3 = 0;
        while (true) {
            long[] jArr = (long[]) obj;
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        ?? r12 = this.d;
        boolean z2 = r12 != 0;
        long j2 = this.b.a;
        if (j2 >= 0) {
            z = z2;
        } else if (z2) {
            return;
        }
        if (this.g == j2 && z) {
            return;
        }
        if (r12 != 0) {
            bka.a.removeCallbacks(r12);
        }
        Handler handler = bka.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Math.max(j2, 16 + jCurrentTimeMillis);
        this.g = jMax;
        bf bfVar = new bf(this.h, 20);
        bka.a.postDelayed(bfVar, jMax - jCurrentTimeMillis);
        this.d = bfVar;
    }

    public final void d(bys bysVar) {
        long jI = i(bysVar);
        if (!ccf.r(jI)) {
            h(bysVar);
            return;
        }
        bysVar.f = jI;
        bysVar.au();
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            e(bysVar2, bysVar2.o().x, false);
        }
        c(bysVar);
    }

    public final void e(bys bysVar, long j, boolean z) {
        char c;
        long j2;
        int i;
        long jD;
        int i2;
        char c2;
        int i3;
        long j3;
        char c3;
        int i4;
        char c4;
        Object obj;
        float[] fArrL;
        int iQ;
        bzh bzhVarM = bysVar.m();
        int iW = bzhVarM.w();
        int iCC = bzhVarM.cC();
        bys bysVarJ = bysVar.j();
        long j4 = bysVar.d;
        long j5 = bysVar.e;
        long j6 = j5 >> 32;
        long j7 = j5 & 4294967295L;
        int i5 = 1;
        if (bysVarJ != null) {
            char c5 = ' ';
            boolean z2 = bysVarJ.g;
            j2 = 4294967295L;
            long j8 = bysVarJ.d;
            boolean zR = ccf.r(j8);
            i = 0;
            long jI = bysVarJ.f;
            if (!zR) {
                bzq bzqVarO = bysVar.o();
                long jC = 0;
                while (true) {
                    if (bzqVarO == null) {
                        jD = cme.d(jC);
                        c = c5;
                        break;
                    }
                    bzx bzxVar = bzqVarO.C;
                    jC = cme.c(jC, bzqVarO.x);
                    bzqVarO = bzqVarO.w;
                    if (bzxVar != null && (iQ = ccf.q((fArrL = bzxVar.l()))) != 3) {
                        if ((iQ & 2) == 0) {
                            jD = 9223372034707292159L;
                            c = c5;
                            break;
                        }
                        jC = boa.a(fArrL, jC);
                    }
                }
            } else {
                if (z2) {
                    jI = i(bysVarJ);
                    bysVarJ.f = jI;
                    bysVarJ.au();
                }
                i2 = !ccf.r(jI) ? 1 : 0;
                jD = cmf.d(cmf.d(j8, jI), j);
                c2 = c5;
                if (i2 == 0 || !ccf.r(jD)) {
                    g(bysVar, j, z);
                }
                bysVar.d = jD;
                bysVar.e = (iW << c2) | (iCC & j2);
                int iA = cmf.a(jD);
                int iB = cmf.b(jD);
                int i6 = iA + iW;
                int i7 = iB + iCC;
                if (!z && a.s(jD, j4) && ((int) j6) == iW && ((int) j7) == iCC) {
                    return;
                }
                int i8 = bysVar.c;
                if (z) {
                    int i9 = i8;
                    bys bysVarJ2 = bysVar.j();
                    int i10 = bysVarJ2 != null ? bysVarJ2.c : -1;
                    cfp cfpVar = this.a;
                    bzm bzmVar = bysVar.t;
                    cfpVar.a(i9, iA, iB, i6, i7, i10, bzmVar.j(1024), bzmVar.j(16));
                } else {
                    cfp cfpVar2 = this.a;
                    int i11 = 67108863;
                    int i12 = i8 & 67108863;
                    Object obj2 = cfpVar2.b;
                    int i13 = cfpVar2.a;
                    int i14 = i;
                    while (true) {
                        long[] jArr = (long[]) obj2;
                        if (i14 >= jArr.length - 2 || i14 >= i13) {
                            break;
                        }
                        int i15 = i14 + 2;
                        int i16 = i11;
                        int i17 = i12;
                        long j9 = jArr[i15];
                        int i18 = i8;
                        if ((((int) j9) & i16) == i17) {
                            long j10 = jArr[i14];
                            jArr[i14] = (iB & j2) | (iA << c2);
                            jArr[i14 + 1] = (i6 << c2) | (i7 & j2);
                            long j11 = 2305843009213693952L;
                            jArr[i15] = j9 | 2305843009213693952L;
                            int i19 = iB - ((int) j10);
                            if (((iA - ((int) (j10 >> c2)) != 0 ? 1 : i) | (i19 != 0 ? 1 : i)) != 0) {
                                long j12 = -4503599560261633L;
                                Object obj3 = cfpVar2.b;
                                Object obj4 = cfpVar2.c;
                                int i20 = cfpVar2.a / 3;
                                long[] jArr2 = (long[]) obj4;
                                long j13 = (i14 + 3) & i16;
                                char c6 = 26;
                                jArr2[i] = (j9 & (-4503599560261633L)) | (j13 << 26);
                                Object obj5 = obj3;
                                while (i5 > 0) {
                                    i5--;
                                    long j14 = jArr2[i5];
                                    int i21 = ((int) j14) & i16;
                                    int i22 = ((int) (j14 >> c6)) & i16;
                                    char c7 = 511;
                                    int i23 = ((int) (j14 >> 52)) & 511;
                                    if (i23 == 511) {
                                        j3 = j12;
                                        i3 = i20;
                                    } else {
                                        i3 = i23 + i22;
                                        j3 = j12;
                                    }
                                    while (true) {
                                        long[] jArr3 = (long[]) obj5;
                                        if (i22 >= jArr3.length - 2 || i22 >= i3) {
                                            break;
                                        }
                                        int i24 = i22 + 3;
                                        int i25 = i22 + 2;
                                        long j15 = jArr3[i25];
                                        long j16 = j11;
                                        if ((((int) (j15 >> c6)) & i16) == i21) {
                                            long j17 = jArr3[i22];
                                            int i26 = i22 + 1;
                                            c4 = c6;
                                            obj = obj5;
                                            long j18 = jArr3[i26];
                                            i4 = i19;
                                            jArr3[i22] = ((((int) j17) + i4) & j2) | ((((int) (j17 >> c2)) + r6) << c2);
                                            jArr3[i26] = ((((int) j18) + i4) & j2) | ((((int) (j18 >> c2)) + r6) << c2);
                                            jArr3[i25] = j15 | j16;
                                            c3 = 511;
                                            if ((((int) (j15 >> 52)) & 511) > 0) {
                                                jArr2[i5] = (j15 & j3) | ((i24 & i16) << c4);
                                                i5++;
                                            }
                                        } else {
                                            c3 = c7;
                                            i4 = i19;
                                            c4 = c6;
                                            obj = obj5;
                                        }
                                        c6 = c4;
                                        i22 = i24;
                                        c7 = c3;
                                        j11 = j16;
                                        obj5 = obj;
                                        i19 = i4;
                                    }
                                    c6 = c6;
                                    j12 = j3;
                                    j11 = j11;
                                    obj5 = obj5;
                                    i19 = i19;
                                }
                            }
                        } else {
                            i14 += 3;
                            i11 = i16;
                            i12 = i17;
                            i8 = i18;
                        }
                    }
                }
                b();
                return;
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
            i = 0;
            jD = j;
        }
        i2 = i;
        c2 = c;
        if (i2 == 0) {
        }
        g(bysVar, j, z);
    }

    public final void f(bys bysVar) {
        int i = bysVar.c & 67108863;
        cfp cfpVar = this.a;
        Object obj = cfpVar.b;
        int i2 = cfpVar.a;
        int i3 = 0;
        while (true) {
            long[] jArr = (long[]) obj;
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        b();
        this.f = true;
    }

    public cfq(byte[] bArr) {
        this.a = new cfp();
        this.b = new cfr();
        this.j = new kc((byte[]) null);
        this.g = -1L;
        this.h = new cdq(this, 2);
        this.i = new bmw();
    }
}
