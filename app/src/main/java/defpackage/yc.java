package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yc {
    public static boolean a = false;
    public static long b;
    public final yb j;
    private final ya r;
    private ya s;
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
    private yh[] p = new yh[1000];
    private int q = 0;
    ya[] e = new ya[32];

    public yc() {
        s();
        yb ybVar = new yb();
        this.j = ybVar;
        this.r = new yg(ybVar);
        this.s = new ya(ybVar);
    }

    private final void p(ya yaVar) {
        int i;
        if (yaVar.d) {
            yaVar.a.d(this, yaVar.b);
        } else {
            ya[] yaVarArr = this.e;
            int i2 = this.i;
            yaVarArr[i2] = yaVar;
            yh yhVar = yaVar.a;
            yhVar.d = i2;
            this.i = i2 + 1;
            yhVar.e(this, yaVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                ya yaVar2 = this.e[i3];
                if (yaVar2 != null && yaVar2.d) {
                    yaVar2.a.d(this, yaVar2.b);
                    this.j.b.b(yaVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        ya[] yaVarArr2 = this.e;
                        int i6 = i4 - 1;
                        ya yaVar3 = yaVarArr2[i4];
                        yaVarArr2[i6] = yaVar3;
                        yh yhVar2 = yaVar3.a;
                        if (yhVar2.d == i4) {
                            yhVar2.d = i6;
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

    private final void q() {
        for (int i = 0; i < this.i; i++) {
            ya yaVar = this.e[i];
            yaVar.a.f = yaVar.b;
        }
    }

    private final void r() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (ya[]) Arrays.copyOf(this.e, i2);
        yb ybVar = this.j;
        ybVar.a = (yh[]) Arrays.copyOf(ybVar.a, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void s() {
        for (int i = 0; i < this.i; i++) {
            ya yaVar = this.e[i];
            if (yaVar != null) {
                this.j.b.b(yaVar);
            }
            this.e[i] = null;
        }
    }

    private final void t(ya yaVar) {
        xz xzVar;
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
            yh yhVar = yaVar.a;
            if (yhVar != null) {
                this.n[yhVar.c] = true;
            }
            yh yhVarK = yaVar.k(this.n);
            if (yhVarK != null) {
                boolean[] zArr = this.n;
                int i5 = yhVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (yhVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    ya yaVar2 = this.e[i7];
                    if (yaVar2.a.n != 1 && !yaVar2.d && (i = (xzVar = yaVar2.e).f) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i == -1 || i8 >= xzVar.a) {
                                break;
                            }
                            if (xzVar.c[i] == yhVarK.c) {
                                float fA = yaVar2.e.a(yhVarK);
                                if (fA < 0.0f) {
                                    float f2 = (-yaVar2.b) / fA;
                                    if (f2 < f) {
                                        i6 = i7;
                                        f = f2;
                                    }
                                }
                            } else {
                                i = xzVar.d[i];
                                i8++;
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    ya yaVar3 = this.e[i6];
                    yaVar3.a.d = -1;
                    yaVar3.b(yhVarK);
                    yh yhVar2 = yaVar3.a;
                    yhVar2.d = i6;
                    yhVar2.e(this, yaVar3);
                }
                z = false;
            }
        }
    }

    private final yh u(int i) {
        yh yhVar = (yh) this.j.c.a();
        if (yhVar == null) {
            yhVar = new yh(i);
            yhVar.n = i;
        } else {
            yhVar.c();
            yhVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (yh[]) Arrays.copyOf(this.p, i4);
        }
        yh[] yhVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        yhVarArr[i5] = yhVar;
        return yhVar;
    }

    public final int a(Object obj) {
        yh yhVar = ((ym) obj).h;
        if (yhVar != null) {
            return (int) (yhVar.f + 0.5f);
        }
        return 0;
    }

    public final ya b() {
        yb ybVar = this.j;
        ya yaVar = (ya) ybVar.b.a();
        if (yaVar == null) {
            yaVar = new ya(ybVar);
            b++;
        } else {
            yaVar.a = null;
            yaVar.e.f();
            yaVar.b = 0.0f;
            yaVar.d = false;
        }
        yh.a++;
        return yaVar;
    }

    public final yh c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            r();
        }
        ym ymVar = (ym) obj;
        yh yhVar = ymVar.h;
        if (yhVar == null) {
            ymVar.i();
            yhVar = ymVar.h;
        }
        int i = yhVar.c;
        if (i != -1) {
            if (i <= this.d && this.j.a[i] != null) {
                return yhVar;
            }
            if (i != -1) {
                yhVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        yhVar.c = i2;
        yhVar.n = 1;
        this.j.a[i2] = yhVar;
        return yhVar;
    }

    public final yh d() {
        if (this.h + 1 >= this.m) {
            r();
        }
        yh yhVarU = u(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        yhVarU.c = i;
        this.j.a[i] = yhVarU;
        return yhVarU;
    }

    public final void e(yh yhVar, yh yhVar2, int i, float f, yh yhVar3, yh yhVar4, int i2, int i3) {
        ya yaVarB = b();
        if (yhVar2 == yhVar3) {
            yaVarB.e.g(yhVar, 1.0f);
            yaVarB.e.g(yhVar4, 1.0f);
            yaVarB.e.g(yhVar2, -2.0f);
        } else if (f == 0.5f) {
            yaVarB.e.g(yhVar, 1.0f);
            yaVarB.e.g(yhVar2, -1.0f);
            yaVarB.e.g(yhVar3, -1.0f);
            yaVarB.e.g(yhVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                yaVarB.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            yaVarB.e.g(yhVar, -1.0f);
            yaVarB.e.g(yhVar2, 1.0f);
            yaVarB.b = i;
        } else if (f >= 1.0f) {
            yaVarB.e.g(yhVar4, -1.0f);
            yaVarB.e.g(yhVar3, 1.0f);
            yaVarB.b = -i2;
        } else {
            float f2 = 1.0f - f;
            yaVarB.e.g(yhVar, f2);
            yaVarB.e.g(yhVar2, -f2);
            yaVarB.e.g(yhVar3, -f);
            yaVarB.e.g(yhVar4, f);
            if (i > 0 || i2 > 0) {
                yaVarB.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            yaVarB.f(this, i3);
        }
        f(yaVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.ya r18) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc.f(ya):void");
    }

    public final void g(yh yhVar, int i) {
        int i2 = yhVar.d;
        if (i2 == -1) {
            yhVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                yh yhVar2 = this.j.a[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            ya yaVarB = b();
            yaVarB.a = yhVar;
            yhVar.f = f;
            yaVarB.b = f;
            yaVarB.d = true;
            f(yaVarB);
            return;
        }
        ya yaVar = this.e[i2];
        if (yaVar.d) {
            yaVar.b = i;
            return;
        }
        if (yaVar.e.a == 0) {
            yaVar.d = true;
            yaVar.b = i;
            return;
        }
        ya yaVarB2 = b();
        if (i < 0) {
            yaVarB2.b = -i;
            yaVarB2.e.g(yhVar, 1.0f);
        } else {
            yaVarB2.b = i;
            yaVarB2.e.g(yhVar, -1.0f);
        }
        f(yaVarB2);
    }

    public final void h(yh yhVar, yh yhVar2, int i, int i2) {
        ya yaVarB = b();
        yh yhVarD = d();
        yhVarD.e = 0;
        yaVarB.h(yhVar, yhVar2, yhVarD, i);
        if (i2 != 8) {
            float f = -yaVarB.e.a(yhVarD);
            yaVarB.e.g(o(i2), (int) f);
        }
        f(yaVarB);
    }

    public final void i(yh yhVar, yh yhVar2, int i, int i2) {
        ya yaVarB = b();
        yh yhVarD = d();
        yhVarD.e = 0;
        yaVarB.i(yhVar, yhVar2, yhVarD, i);
        if (i2 != 8) {
            float f = -yaVarB.e.a(yhVarD);
            yaVarB.e.g(o(i2), (int) f);
        }
        f(yaVarB);
    }

    public final void j() {
        ya yaVar = this.r;
        if (yaVar.e()) {
            q();
            return;
        }
        if (!this.g) {
            l(yaVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(yaVar);
                return;
            }
        }
        q();
    }

    public final void k() {
        yb ybVar;
        int i = 0;
        while (true) {
            ybVar = this.j;
            yh[] yhVarArr = ybVar.a;
            if (i >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i];
            if (yhVar != null) {
                yhVar.c();
            }
            i++;
        }
        yd ydVar = ybVar.c;
        yh[] yhVarArr2 = this.p;
        int i2 = this.q;
        int length = yhVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            yh yhVar2 = yhVarArr2[i3];
            int i4 = ydVar.b;
            if (i4 < 256) {
                ydVar.a[i4] = yhVar2;
                ydVar.b = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(ybVar.a, (Object) null);
        this.d = 0;
        yg ygVar = (yg) this.r;
        ygVar.f = 0;
        ygVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            ya yaVar = this.e[i5];
        }
        s();
        this.i = 0;
        this.s = new ya(ybVar);
    }

    final void l(ya yaVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            ya yaVar2 = this.e[i];
            if (yaVar2.a.n != 1) {
                float f = 0.0f;
                if (yaVar2.b < 0.0f) {
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
                            ya yaVar3 = this.e[i5];
                            if (yaVar3.a.n != 1 && !yaVar3.d && yaVar3.b < f) {
                                int i7 = yaVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    yh yhVarD = yaVar3.e.d(i8);
                                    float fA = yaVar3.e.a(yhVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = yhVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = yhVarD.c;
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
                            ya yaVar4 = this.e[i3];
                            yaVar4.a.d = -1;
                            yaVar4.b(this.j.a[i4]);
                            yh yhVar = yaVar4.a;
                            yhVar.d = i3;
                            yhVar.e(this, yaVar4);
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
        t(yaVar);
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.yh r6, defpackage.yh r7, int r8, int r9) {
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
            ya r1 = r5.b()
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
            xz r8 = r1.e
            r8.g(r6, r2)
            xz r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            xz r8 = r1.e
            r8.g(r6, r3)
            xz r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc.m(yh, yh, int, int):void");
    }

    public final void n(yh yhVar, yh yhVar2, yh yhVar3, yh yhVar4, float f) {
        ya yaVarB = b();
        yaVarB.g(yhVar, yhVar2, yhVar3, yhVar4, f);
        f(yaVarB);
    }

    public final yh o(int i) {
        if (this.h + 1 >= this.m) {
            r();
        }
        yh yhVarU = u(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        yhVarU.c = i2;
        yhVarU.e = i;
        this.j.a[i2] = yhVarU;
        yg ygVar = (yg) this.r;
        yf yfVar = ygVar.g;
        yfVar.a = yhVarU;
        Arrays.fill(yfVar.a.i, 0.0f);
        yhVarU.i[yhVarU.e] = 1.0f;
        ygVar.m(yhVarU);
        return yhVarU;
    }
}
