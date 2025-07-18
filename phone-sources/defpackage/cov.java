package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cov {
    public static boolean a = false;
    public static long b;
    public final ivx j;
    private final cou r;
    private cou s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private coy[] p = new coy[1000];
    private int q = 0;
    cou[] e = new cou[32];

    public cov() {
        t();
        ivx ivxVar = new ivx((byte[]) null);
        this.j = ivxVar;
        this.r = new cox(ivxVar);
        this.s = new cou(ivxVar);
    }

    public static final int o(Object obj) {
        coy coyVar = ((cpc) obj).h;
        if (coyVar != null) {
            return (int) (coyVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(cou couVar) {
        int i;
        if (couVar.d) {
            couVar.a.d(this, couVar.b);
        } else {
            cou[] couVarArr = this.e;
            int i2 = this.i;
            couVarArr[i2] = couVar;
            coy coyVar = couVar.a;
            coyVar.d = i2;
            this.i = i2 + 1;
            coyVar.e(this, couVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                cou couVar2 = this.e[i3];
                if (couVar2 != null && couVar2.d) {
                    couVar2.a.d(this, couVar2.b);
                    ((zlj) this.j.b).q(couVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        cou[] couVarArr2 = this.e;
                        int i6 = i4 - 1;
                        cou couVar3 = couVarArr2[i4];
                        couVarArr2[i6] = couVar3;
                        coy coyVar2 = couVar3.a;
                        if (coyVar2.d == i4) {
                            coyVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            cou couVar = this.e[i];
            couVar.a.f = couVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (cou[]) Arrays.copyOf(this.e, i2);
        ivx ivxVar = this.j;
        ivxVar.c = (coy[]) Arrays.copyOf((Object[]) ivxVar.c, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            cou couVar = this.e[i];
            if (couVar != null) {
                ((zlj) this.j.b).q(couVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(cou couVar) {
        cot cotVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            coy coyVar = couVar.a;
            if (coyVar != null) {
                this.n[coyVar.c] = true;
            }
            coy coyVarK = couVar.k(this.n);
            if (coyVarK != null) {
                boolean[] zArr = this.n;
                int i5 = coyVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (coyVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    cou couVar2 = this.e[i7];
                    if (couVar2.a.n != 1 && !couVar2.d && (i = (cotVar = couVar2.e).e) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i == -1 || i8 >= cotVar.a) {
                                break;
                            }
                            if (cotVar.b[i] == coyVarK.c) {
                                float fA = couVar2.e.a(coyVarK);
                                if (fA < 0.0f) {
                                    float f2 = (-couVar2.b) / fA;
                                    if (f2 < f) {
                                        i6 = i7;
                                        f = f2;
                                    }
                                }
                            } else {
                                i = cotVar.c[i];
                                i8++;
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    cou couVar3 = this.e[i6];
                    couVar3.a.d = -1;
                    couVar3.b(coyVarK);
                    coy coyVar2 = couVar3.a;
                    coyVar2.d = i6;
                    coyVar2.e(this, couVar3);
                }
                z = false;
            }
        }
    }

    private final coy v(int i) {
        coy coyVar = (coy) ((zlj) this.j.a).p();
        if (coyVar == null) {
            coyVar = new coy(i);
            coyVar.n = i;
        } else {
            coyVar.c();
            coyVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (coy[]) Arrays.copyOf(this.p, i4);
        }
        coy[] coyVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        coyVarArr[i5] = coyVar;
        return coyVar;
    }

    public final cou a() {
        ivx ivxVar = this.j;
        cou couVar = (cou) ((zlj) ivxVar.b).p();
        if (couVar == null) {
            couVar = new cou(ivxVar);
            b++;
        } else {
            couVar.a = null;
            couVar.e.f();
            couVar.b = 0.0f;
            couVar.d = false;
        }
        coy.a++;
        return couVar;
    }

    public final coy b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        cpc cpcVar = (cpc) obj;
        coy coyVar = cpcVar.h;
        if (coyVar == null) {
            cpcVar.m();
            coyVar = cpcVar.h;
        }
        int i = coyVar.c;
        if (i != -1) {
            if (i <= this.d && ((coy[]) this.j.c)[i] != null) {
                return coyVar;
            }
            if (i != -1) {
                coyVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        coyVar.c = i2;
        coyVar.n = 1;
        ((coy[]) this.j.c)[i2] = coyVar;
        return coyVar;
    }

    public final coy c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        coy coyVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        coyVarV.c = i;
        ((coy[]) this.j.c)[i] = coyVarV;
        return coyVarV;
    }

    public final void d(coy coyVar, coy coyVar2, int i, float f, coy coyVar3, coy coyVar4, int i2, int i3) {
        cou couVarA = a();
        if (coyVar2 == coyVar3) {
            couVarA.e.g(coyVar, 1.0f);
            couVarA.e.g(coyVar4, 1.0f);
            couVarA.e.g(coyVar2, -2.0f);
        } else if (f == 0.5f) {
            couVarA.e.g(coyVar, 1.0f);
            couVarA.e.g(coyVar2, -1.0f);
            couVarA.e.g(coyVar3, -1.0f);
            couVarA.e.g(coyVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                couVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            couVarA.e.g(coyVar, -1.0f);
            couVarA.e.g(coyVar2, 1.0f);
            couVarA.b = i;
        } else if (f >= 1.0f) {
            couVarA.e.g(coyVar4, -1.0f);
            couVarA.e.g(coyVar3, 1.0f);
            couVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            couVarA.e.g(coyVar, f2);
            couVarA.e.g(coyVar2, -f2);
            couVarA.e.g(coyVar3, -f);
            couVarA.e.g(coyVar4, f);
            if (i > 0 || i2 > 0) {
                couVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            couVarA.f(this, i3);
        }
        e(couVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.cou r18) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cov.e(cou):void");
    }

    public final void f(coy coyVar, int i) {
        int i2 = coyVar.d;
        if (i2 == -1) {
            coyVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                coy coyVar2 = ((coy[]) this.j.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            cou couVarA = a();
            couVarA.a = coyVar;
            coyVar.f = f;
            couVarA.b = f;
            couVarA.d = true;
            e(couVarA);
            return;
        }
        cou couVar = this.e[i2];
        if (couVar.d) {
            couVar.b = i;
            return;
        }
        if (couVar.e.a == 0) {
            couVar.d = true;
            couVar.b = i;
            return;
        }
        cou couVarA2 = a();
        if (i < 0) {
            couVarA2.b = -i;
            couVarA2.e.g(coyVar, 1.0f);
        } else {
            couVarA2.b = i;
            couVarA2.e.g(coyVar, -1.0f);
        }
        e(couVarA2);
    }

    public final void g(coy coyVar, coy coyVar2, int i, int i2) {
        cou couVarA = a();
        coy coyVarC = c();
        coyVarC.e = 0;
        couVarA.h(coyVar, coyVar2, coyVarC, i);
        if (i2 != 8) {
            i(couVarA, (int) (-couVarA.e.a(coyVarC)), i2);
        }
        e(couVarA);
    }

    public final void h(coy coyVar, coy coyVar2, int i, int i2) {
        cou couVarA = a();
        coy coyVarC = c();
        coyVarC.e = 0;
        couVarA.i(coyVar, coyVar2, coyVarC, i);
        if (i2 != 8) {
            i(couVarA, (int) (-couVarA.e.a(coyVarC)), i2);
        }
        e(couVarA);
    }

    final void i(cou couVar, int i, int i2) {
        couVar.e.g(p(i2), i);
    }

    public final void j() {
        cou couVar = this.r;
        if (couVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(couVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(couVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        ivx ivxVar;
        int i = 0;
        while (true) {
            ivxVar = this.j;
            coy[] coyVarArr = (coy[]) ivxVar.c;
            if (i >= coyVarArr.length) {
                break;
            }
            coy coyVar = coyVarArr[i];
            if (coyVar != null) {
                coyVar.c();
            }
            i++;
        }
        Object obj = ivxVar.a;
        coy[] coyVarArr2 = this.p;
        int i2 = this.q;
        int length = coyVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            coy coyVar2 = coyVarArr2[i3];
            zlj zljVar = (zlj) obj;
            int i4 = zljVar.a;
            if (i4 < 256) {
                ((Object[]) zljVar.b)[i4] = coyVar2;
                zljVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) ivxVar.c, (Object) null);
        this.d = 0;
        cox coxVar = (cox) this.r;
        coxVar.f = 0;
        coxVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            cou couVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new cou(ivxVar);
    }

    final void l(cou couVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            cou couVar2 = this.e[i];
            if (couVar2.a.n != 1) {
                float f = 0.0f;
                if (couVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            cou couVar3 = this.e[i5];
                            if (couVar3.a.n != 1 && !couVar3.d && couVar3.b < f) {
                                int i7 = couVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    coy coyVarD = couVar3.e.d(i8);
                                    float fA = couVar3.e.a(coyVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = coyVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = coyVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            cou couVar4 = this.e[i3];
                            couVar4.a.d = -1;
                            couVar4.b(((coy[]) this.j.c)[i4]);
                            coy coyVar = couVar4.a;
                            coyVar.d = i3;
                            coyVar.e(this, couVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(couVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.coy r6, defpackage.coy r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            cou r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            cot r8 = r1.e
            r8.g(r6, r2)
            cot r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            cot r8 = r1.e
            r8.g(r6, r3)
            cot r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cov.m(coy, coy, int, int):void");
    }

    public final void n(coy coyVar, coy coyVar2, coy coyVar3, coy coyVar4, float f) {
        cou couVarA = a();
        couVarA.g(coyVar, coyVar2, coyVar3, coyVar4, f);
        e(couVarA);
    }

    public final coy p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        coy coyVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        coyVarV.c = i2;
        coyVarV.e = i;
        ((coy[]) this.j.c)[i2] = coyVarV;
        cox coxVar = (cox) this.r;
        cow cowVar = coxVar.g;
        cowVar.a = coyVarV;
        Arrays.fill(cowVar.a.i, 0.0f);
        coyVarV.i[coyVarV.e] = 1.0f;
        coxVar.m(coyVarV);
        return coyVarV;
    }
}
