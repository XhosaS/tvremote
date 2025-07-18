package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zi extends zn {
    private static final int[] a = new int[2];

    public zi(yn ynVar) {
        super(ynVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.zn
    public final void b() {
        yn ynVar;
        yn ynVar2;
        int i;
        yn ynVar3;
        int i2;
        yn ynVar4 = this.d;
        if (ynVar4.e) {
            this.f.c(ynVar4.h());
        }
        zd zdVar = this.f;
        if (!zdVar.i) {
            yn ynVar5 = this.d;
            int i3 = ynVar5.ar[0];
            this.k = i3;
            if (i3 != 3) {
                int i4 = this.k;
                if (i4 == 4) {
                    yn ynVar6 = ynVar5.V;
                    if (ynVar6 != null && ((i2 = ynVar6.ar[0]) == 1 || i2 == 4)) {
                        int iH = (ynVar6.h() - ynVar5.K.b()) - this.d.M.b();
                        k(this.i, ynVar6.h.i, this.d.K.b());
                        k(this.j, ynVar6.h.j, -this.d.M.b());
                        zdVar.c(iH);
                        return;
                    }
                } else if (i4 == 1) {
                    zdVar.c(ynVar5.h());
                }
            }
        } else if (this.k == 4 && (ynVar2 = (ynVar = this.d).V) != null && ((i = ynVar2.ar[0]) == 1 || i == 4)) {
            k(this.i, ynVar2.h.i, ynVar.K.b());
            k(this.j, ynVar2.h.j, -this.d.M.b());
            return;
        }
        if (zdVar.i) {
            yn ynVar7 = this.d;
            if (ynVar7.e) {
                ym[] ymVarArr = ynVar7.S;
                ym ymVar = ymVarArr[0];
                ym ymVar2 = ymVar.e;
                if (ymVar2 != null && ymVarArr[1].e != null) {
                    if (ynVar7.H()) {
                        this.i.e = this.d.S[0].b();
                        this.j.e = -this.d.S[1].b();
                        return;
                    }
                    zc zcVarI = i(this.d.S[0]);
                    if (zcVarI != null) {
                        k(this.i, zcVarI, this.d.S[0].b());
                    }
                    zc zcVarI2 = i(this.d.S[1]);
                    if (zcVarI2 != null) {
                        k(this.j, zcVarI2, -this.d.S[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if (ymVar2 != null) {
                    zc zcVarI3 = i(ymVar);
                    if (zcVarI3 != null) {
                        zc zcVar = this.i;
                        k(zcVar, zcVarI3, this.d.S[0].b());
                        k(this.j, zcVar, zdVar.f);
                        return;
                    }
                    return;
                }
                ym ymVar3 = ymVarArr[1];
                if (ymVar3.e != null) {
                    zc zcVarI4 = i(ymVar3);
                    if (zcVarI4 != null) {
                        zc zcVar2 = this.j;
                        k(zcVar2, zcVarI4, -this.d.S[1].b());
                        k(this.i, zcVar2, -zdVar.f);
                        return;
                    }
                    return;
                }
                if ((ynVar7 instanceof ys) || ynVar7.V == null || ynVar7.K(7).e != null) {
                    return;
                }
                yn ynVar8 = this.d;
                zc zcVar3 = ynVar8.V.h.i;
                zc zcVar4 = this.i;
                k(zcVar4, zcVar3, ynVar8.i());
                k(this.j, zcVar4, zdVar.f);
                return;
            }
        }
        if (this.k == 3) {
            yn ynVar9 = this.d;
            int i5 = ynVar9.t;
            if (i5 == 2) {
                yn ynVar10 = ynVar9.V;
                if (ynVar10 != null) {
                    zd zdVar2 = ynVar10.i.f;
                    zdVar.k.add(zdVar2);
                    zdVar2.j.add(zdVar);
                    zdVar.b = true;
                    zc zcVar5 = this.i;
                    List list = zdVar.j;
                    list.add(zcVar5);
                    list.add(this.j);
                }
            } else if (i5 == 3) {
                if (ynVar9.u == 3) {
                    this.i.a = this;
                    this.j.a = this;
                    zk zkVar = ynVar9.i;
                    zkVar.i.a = this;
                    zkVar.j.a = this;
                    zdVar.a = this;
                    if (ynVar9.I()) {
                        List list2 = zdVar.k;
                        list2.add(this.d.i.f);
                        this.d.i.f.j.add(zdVar);
                        zk zkVar2 = this.d.i;
                        zkVar2.f.a = this;
                        list2.add(zkVar2.i);
                        list2.add(this.d.i.j);
                        this.d.i.i.j.add(zdVar);
                        this.d.i.j.j.add(zdVar);
                    } else if (this.d.H()) {
                        this.d.i.f.k.add(zdVar);
                        zdVar.j.add(this.d.i.f);
                    } else {
                        this.d.i.f.k.add(zdVar);
                    }
                } else {
                    zd zdVar3 = ynVar9.i.f;
                    zdVar.k.add(zdVar3);
                    zdVar3.j.add(zdVar);
                    this.d.i.i.j.add(zdVar);
                    this.d.i.j.j.add(zdVar);
                    zdVar.b = true;
                    zc zcVar6 = this.i;
                    List list3 = zdVar.j;
                    list3.add(zcVar6);
                    zc zcVar7 = this.j;
                    list3.add(zcVar7);
                    zcVar6.k.add(zdVar);
                    zcVar7.k.add(zdVar);
                }
            }
        }
        yn ynVar11 = this.d;
        ym[] ymVarArr2 = ynVar11.S;
        ym ymVar4 = ymVarArr2[0];
        ym ymVar5 = ymVar4.e;
        if (ymVar5 != null && ymVarArr2[1].e != null) {
            if (ynVar11.H()) {
                this.i.e = this.d.S[0].b();
                this.j.e = -this.d.S[1].b();
                return;
            }
            zc zcVarI5 = i(this.d.S[0]);
            zc zcVarI6 = i(this.d.S[1]);
            if (zcVarI5 != null) {
                zcVarI5.a(this);
            }
            if (zcVarI6 != null) {
                zcVarI6.a(this);
            }
            this.l = 4;
            return;
        }
        if (ymVar5 != null) {
            zc zcVarI7 = i(ymVar4);
            if (zcVarI7 != null) {
                zc zcVar8 = this.i;
                k(zcVar8, zcVarI7, this.d.S[0].b());
                l(this.j, zcVar8, 1, zdVar);
                return;
            }
            return;
        }
        ym ymVar6 = ymVarArr2[1];
        if (ymVar6.e != null) {
            zc zcVarI8 = i(ymVar6);
            if (zcVarI8 != null) {
                zc zcVar9 = this.j;
                k(zcVar9, zcVarI8, -this.d.S[1].b());
                l(this.i, zcVar9, -1, zdVar);
                return;
            }
            return;
        }
        if ((ynVar11 instanceof ys) || (ynVar3 = ynVar11.V) == null) {
            return;
        }
        zc zcVar10 = ynVar3.h.i;
        zc zcVar11 = this.i;
        k(zcVar11, zcVar10, ynVar11.i());
        l(this.j, zcVar11, 1, zdVar);
    }

    @Override // defpackage.zn
    public final void c() {
        zc zcVar = this.i;
        if (zcVar.i) {
            this.d.aa = zcVar.f;
        }
    }

    @Override // defpackage.zn
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.zn
    public final boolean e() {
        return this.k != 3 || this.d.t == 0;
    }

    @Override // defpackage.zn, defpackage.za
    public final void f() {
        float f;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            yn ynVar = this.d;
            m(ynVar.K, ynVar.M, 0);
            return;
        }
        zd zdVar = this.f;
        if (!zdVar.i && this.k == 3) {
            yn ynVar2 = this.d;
            int i3 = ynVar2.t;
            if (i3 == 2) {
                yn ynVar3 = ynVar2.V;
                if (ynVar3 != null) {
                    if (ynVar3.h.f.i) {
                        zdVar.c((int) ((r2.f * ynVar2.y) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = ynVar2.u;
                if (i4 == 0 || i4 == 3) {
                    zk zkVar = ynVar2.i;
                    zc zcVar = zkVar.i;
                    zc zcVar2 = zkVar.j;
                    boolean z = ynVar2.K.e != null;
                    boolean z2 = ynVar2.L.e != null;
                    boolean z3 = ynVar2.M.e != null;
                    boolean z4 = ynVar2.N.e != null;
                    int i5 = ynVar2.Z;
                    if (z && z2 && z3 && z4) {
                        float f2 = ynVar2.Y;
                        if (zcVar.i && zcVar2.i) {
                            zc zcVar3 = this.i;
                            if (zcVar3.c) {
                                zc zcVar4 = this.j;
                                if (zcVar4.c) {
                                    int i6 = ((zc) zcVar3.k.get(0)).f + zcVar3.e;
                                    int i7 = ((zc) zcVar4.k.get(0)).f - zcVar4.e;
                                    int i8 = zcVar.e + zcVar.f;
                                    int i9 = zcVar2.f - zcVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    zdVar.c(iArr[0]);
                                    this.d.i.f.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        zc zcVar5 = this.i;
                        if (zcVar5.i) {
                            zc zcVar6 = this.j;
                            if (zcVar6.i) {
                                if (!zcVar.c || !zcVar2.c) {
                                    return;
                                }
                                int i10 = zcVar5.f + zcVar5.e;
                                int i11 = zcVar6.f - zcVar6.e;
                                int i12 = zcVar.e + ((zc) zcVar.k.get(0)).f;
                                int i13 = ((zc) zcVar2.k.get(0)).f - zcVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                zdVar.c(iArr2[0]);
                                this.d.i.f.c(iArr2[1]);
                            }
                        }
                        if (!zcVar5.c) {
                            return;
                        }
                        zc zcVar7 = this.j;
                        if (!zcVar7.c || !zcVar.c || !zcVar2.c) {
                            return;
                        }
                        int i14 = ((zc) zcVar5.k.get(0)).f + zcVar5.e;
                        int i15 = ((zc) zcVar7.k.get(0)).f - zcVar7.e;
                        int i16 = zcVar.e + ((zc) zcVar.k.get(0)).f;
                        int i17 = ((zc) zcVar2.k.get(0)).f - zcVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        zdVar.c(iArr3[0]);
                        this.d.i.f.c(iArr3[1]);
                    } else if (z && z3) {
                        zc zcVar8 = this.i;
                        if (!zcVar8.c) {
                            return;
                        }
                        zc zcVar9 = this.j;
                        if (!zcVar9.c) {
                            return;
                        }
                        float f3 = ynVar2.Y;
                        int i18 = (((zc) zcVar9.k.get(0)).f - zcVar9.e) - (((zc) zcVar8.k.get(0)).f + zcVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            zdVar.c(iH);
                            this.d.i.f.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            zdVar.c(iH3);
                            this.d.i.f.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!zcVar.c || !zcVar2.c) {
                            return;
                        }
                        float f4 = ynVar2.Y;
                        int i21 = (((zc) zcVar2.k.get(0)).f - zcVar2.e) - (((zc) zcVar.k.get(0)).f + zcVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            zdVar.c(iH6);
                            this.d.i.f.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            zdVar.c(iH8);
                            this.d.i.f.c(iH7);
                        }
                    }
                } else {
                    int i24 = ynVar2.Z;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = ynVar2.i.f.f;
                        float f6 = ynVar2.Y;
                        f = f5 * f6;
                        zdVar.c((int) (f + 0.5f));
                    } else {
                        f = ynVar2.i.f.f / ynVar2.Y;
                        zdVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        zc zcVar10 = this.i;
        if (zcVar10.c) {
            zc zcVar11 = this.j;
            if (zcVar11.c) {
                if (zcVar10.i && zcVar11.i && zdVar.i) {
                    return;
                }
                if (!zdVar.i && this.k == 3) {
                    yn ynVar4 = this.d;
                    if (ynVar4.t == 0 && !ynVar4.H()) {
                        zc zcVar12 = (zc) zcVar10.k.get(0);
                        zc zcVar13 = (zc) zcVar11.k.get(0);
                        int i25 = zcVar12.f + zcVar10.e;
                        int i26 = zcVar13.f + zcVar11.e;
                        zcVar10.c(i25);
                        zcVar11.c(i26);
                        zdVar.c(i26 - i25);
                        return;
                    }
                }
                if (!zdVar.i && this.k == 3 && this.c == 1) {
                    List list = zcVar10.k;
                    if (list.size() > 0) {
                        List list2 = zcVar11.k;
                        if (list2.size() > 0) {
                            zc zcVar14 = (zc) list.get(0);
                            int iMin = Math.min((((zc) list2.get(0)).f + zcVar11.e) - (zcVar14.f + zcVar10.e), zdVar.m);
                            yn ynVar5 = this.d;
                            int i27 = ynVar5.x;
                            int iMax = Math.max(ynVar5.w, iMin);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            zdVar.c(iMax);
                        }
                    }
                }
                if (zdVar.i) {
                    zc zcVar15 = (zc) zcVar10.k.get(0);
                    zc zcVar16 = (zc) zcVar11.k.get(0);
                    int i28 = zcVar15.f;
                    int i29 = zcVar10.e + i28;
                    int i30 = zcVar16.f;
                    int i31 = zcVar11.e + i30;
                    float f7 = this.d.af;
                    if (zcVar15 == zcVar16) {
                        f7 = 0.5f;
                    }
                    if (zcVar15 != zcVar16) {
                        i30 = i31;
                    }
                    if (zcVar15 != zcVar16) {
                        i28 = i29;
                    }
                    zcVar10.c((int) (i28 + 0.5f + (((i30 - i28) - zdVar.f) * f7)));
                    zcVar11.c(zcVar10.f + zdVar.f);
                }
            }
        }
    }

    public final void g() {
        this.h = false;
        zc zcVar = this.i;
        zcVar.b();
        zcVar.i = false;
        zc zcVar2 = this.j;
        zcVar2.b();
        zcVar2.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.aj));
    }
}
