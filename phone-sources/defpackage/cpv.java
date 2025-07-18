package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpv extends cpz {
    private static final int[] a = new int[2];

    public cpv(cpd cpdVar) {
        super(cpdVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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

    @Override // defpackage.cpz
    public final void b() {
        cpd cpdVar;
        cpd cpdVar2;
        cpd cpdVar3;
        cpd cpdVar4 = this.d;
        if (cpdVar4.e) {
            this.f.c(cpdVar4.j());
        }
        cpr cprVar = this.f;
        if (!cprVar.i) {
            int iO = this.d.O();
            this.k = iO;
            if (iO != 3) {
                if (this.k == 4 && (cpdVar3 = this.d.V) != null && (cpdVar3.O() == 1 || cpdVar3.O() == 4)) {
                    int iJ = (cpdVar3.j() - this.d.K.b()) - this.d.M.b();
                    j(this.i, cpdVar3.h.i, this.d.K.b());
                    j(this.j, cpdVar3.h.j, -this.d.M.b());
                    cprVar.c(iJ);
                    return;
                }
                if (this.k == 1) {
                    cprVar.c(this.d.j());
                }
            }
        } else if (this.k == 4 && (cpdVar = this.d.V) != null && (cpdVar.O() == 1 || cpdVar.O() == 4)) {
            j(this.i, cpdVar.h.i, this.d.K.b());
            j(this.j, cpdVar.h.j, -this.d.M.b());
            return;
        }
        if (cprVar.i) {
            cpd cpdVar5 = this.d;
            if (cpdVar5.e) {
                cpc[] cpcVarArr = cpdVar5.S;
                cpc cpcVar = cpcVarArr[0];
                cpc cpcVar2 = cpcVar.e;
                if (cpcVar2 != null && cpcVarArr[1].e != null) {
                    if (cpdVar5.J()) {
                        this.i.e = this.d.S[0].b();
                        this.j.e = -this.d.S[1].b();
                        return;
                    }
                    cpq cpqVarK = k(this.d.S[0]);
                    if (cpqVarK != null) {
                        j(this.i, cpqVarK, this.d.S[0].b());
                    }
                    cpq cpqVarK2 = k(this.d.S[1]);
                    if (cpqVarK2 != null) {
                        j(this.j, cpqVarK2, -this.d.S[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if (cpcVar2 != null) {
                    cpq cpqVarK3 = k(cpcVar);
                    if (cpqVarK3 != null) {
                        cpq cpqVar = this.i;
                        j(cpqVar, cpqVarK3, this.d.S[0].b());
                        j(this.j, cpqVar, cprVar.f);
                        return;
                    }
                    return;
                }
                cpc cpcVar3 = cpcVarArr[1];
                if (cpcVar3.e != null) {
                    cpq cpqVarK4 = k(cpcVar3);
                    if (cpqVarK4 != null) {
                        cpq cpqVar2 = this.j;
                        j(cpqVar2, cpqVarK4, -this.d.S[1].b());
                        j(this.i, cpqVar2, -cprVar.f);
                        return;
                    }
                    return;
                }
                if ((cpdVar5 instanceof cpi) || cpdVar5.V == null || cpdVar5.M(7).e != null) {
                    return;
                }
                cpd cpdVar6 = this.d;
                cpq cpqVar3 = cpdVar6.V.h.i;
                cpq cpqVar4 = this.i;
                j(cpqVar4, cpqVar3, cpdVar6.k());
                j(this.j, cpqVar4, cprVar.f);
                return;
            }
        }
        if (this.k == 3) {
            cpd cpdVar7 = this.d;
            int i = cpdVar7.t;
            if (i == 2) {
                cpd cpdVar8 = cpdVar7.V;
                if (cpdVar8 != null) {
                    cpr cprVar2 = cpdVar8.i.f;
                    cprVar.k.add(cprVar2);
                    cprVar2.j.add(cprVar);
                    cprVar.b = true;
                    cpq cpqVar5 = this.i;
                    List list = cprVar.j;
                    list.add(cpqVar5);
                    list.add(this.j);
                }
            } else if (i == 3) {
                if (cpdVar7.u == 3) {
                    this.i.a = this;
                    this.j.a = this;
                    cpx cpxVar = cpdVar7.i;
                    cpxVar.i.a = this;
                    cpxVar.j.a = this;
                    cprVar.a = this;
                    if (cpdVar7.K()) {
                        List list2 = cprVar.k;
                        list2.add(this.d.i.f);
                        this.d.i.f.j.add(cprVar);
                        cpx cpxVar2 = this.d.i;
                        cpxVar2.f.a = this;
                        list2.add(cpxVar2.i);
                        list2.add(this.d.i.j);
                        this.d.i.i.j.add(cprVar);
                        this.d.i.j.j.add(cprVar);
                    } else if (this.d.J()) {
                        this.d.i.f.k.add(cprVar);
                        cprVar.j.add(this.d.i.f);
                    } else {
                        this.d.i.f.k.add(cprVar);
                    }
                } else {
                    cpr cprVar3 = cpdVar7.i.f;
                    cprVar.k.add(cprVar3);
                    cprVar3.j.add(cprVar);
                    this.d.i.i.j.add(cprVar);
                    this.d.i.j.j.add(cprVar);
                    cprVar.b = true;
                    cpq cpqVar6 = this.i;
                    List list3 = cprVar.j;
                    list3.add(cpqVar6);
                    cpq cpqVar7 = this.j;
                    list3.add(cpqVar7);
                    cpqVar6.k.add(cprVar);
                    cpqVar7.k.add(cprVar);
                }
            }
        }
        cpd cpdVar9 = this.d;
        cpc[] cpcVarArr2 = cpdVar9.S;
        cpc cpcVar4 = cpcVarArr2[0];
        cpc cpcVar5 = cpcVar4.e;
        if (cpcVar5 != null && cpcVarArr2[1].e != null) {
            if (cpdVar9.J()) {
                this.i.e = this.d.S[0].b();
                this.j.e = -this.d.S[1].b();
                return;
            }
            cpq cpqVarK5 = k(this.d.S[0]);
            cpq cpqVarK6 = k(this.d.S[1]);
            if (cpqVarK5 != null) {
                cpqVarK5.a(this);
            }
            if (cpqVarK6 != null) {
                cpqVarK6.a(this);
            }
            this.l = 4;
            return;
        }
        if (cpcVar5 != null) {
            cpq cpqVarK7 = k(cpcVar4);
            if (cpqVarK7 != null) {
                cpq cpqVar8 = this.i;
                j(cpqVar8, cpqVarK7, this.d.S[0].b());
                i(this.j, cpqVar8, 1, cprVar);
                return;
            }
            return;
        }
        cpc cpcVar6 = cpcVarArr2[1];
        if (cpcVar6.e != null) {
            cpq cpqVarK8 = k(cpcVar6);
            if (cpqVarK8 != null) {
                cpq cpqVar9 = this.j;
                j(cpqVar9, cpqVarK8, -this.d.S[1].b());
                i(this.i, cpqVar9, -1, cprVar);
                return;
            }
            return;
        }
        if ((cpdVar9 instanceof cpi) || (cpdVar2 = cpdVar9.V) == null) {
            return;
        }
        cpq cpqVar10 = cpdVar2.h.i;
        cpq cpqVar11 = this.i;
        j(cpqVar11, cpqVar10, cpdVar9.k());
        i(this.j, cpqVar11, 1, cprVar);
    }

    @Override // defpackage.cpz
    public final void c() {
        cpq cpqVar = this.i;
        if (cpqVar.i) {
            this.d.aa = cpqVar.f;
        }
    }

    @Override // defpackage.cpz
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.cpz
    public final boolean e() {
        return this.k != 3 || this.d.t == 0;
    }

    @Override // defpackage.cpz, defpackage.cpo
    public final void f() {
        float f;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            cpd cpdVar = this.d;
            m(cpdVar.K, cpdVar.M, 0);
            return;
        }
        cpr cprVar = this.f;
        if (!cprVar.i && this.k == 3) {
            cpd cpdVar2 = this.d;
            int i3 = cpdVar2.t;
            if (i3 == 2) {
                cpd cpdVar3 = cpdVar2.V;
                if (cpdVar3 != null) {
                    if (cpdVar3.h.f.i) {
                        cprVar.c((int) ((r7.f * cpdVar2.y) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = cpdVar2.u;
                if (i4 == 0 || i4 == 3) {
                    cpx cpxVar = cpdVar2.i;
                    cpq cpqVar = cpxVar.i;
                    cpq cpqVar2 = cpxVar.j;
                    boolean z = cpdVar2.K.e != null;
                    boolean z2 = cpdVar2.L.e != null;
                    boolean z3 = cpdVar2.M.e != null;
                    boolean z4 = cpdVar2.N.e != null;
                    int i5 = cpdVar2.Z;
                    if (z && z2 && z3 && z4) {
                        float f2 = cpdVar2.Y;
                        if (cpqVar.i && cpqVar2.i) {
                            cpq cpqVar3 = this.i;
                            if (cpqVar3.c) {
                                cpq cpqVar4 = this.j;
                                if (cpqVar4.c) {
                                    int i6 = ((cpq) cpqVar3.k.get(0)).f + cpqVar3.e;
                                    int i7 = ((cpq) cpqVar4.k.get(0)).f - cpqVar4.e;
                                    int i8 = cpqVar.f + cpqVar.e;
                                    int i9 = cpqVar2.f - cpqVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    cprVar.c(iArr[0]);
                                    this.d.i.f.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cpq cpqVar5 = this.i;
                        if (cpqVar5.i) {
                            cpq cpqVar6 = this.j;
                            if (cpqVar6.i) {
                                if (!cpqVar.c || !cpqVar2.c) {
                                    return;
                                }
                                int i10 = cpqVar5.f + cpqVar5.e;
                                int i11 = cpqVar6.f - cpqVar6.e;
                                int i12 = ((cpq) cpqVar.k.get(0)).f + cpqVar.e;
                                int i13 = ((cpq) cpqVar2.k.get(0)).f - cpqVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                cprVar.c(iArr2[0]);
                                this.d.i.f.c(iArr2[1]);
                            }
                        }
                        if (!cpqVar5.c) {
                            return;
                        }
                        cpq cpqVar7 = this.j;
                        if (!cpqVar7.c || !cpqVar.c || !cpqVar2.c) {
                            return;
                        }
                        int i14 = ((cpq) cpqVar5.k.get(0)).f + cpqVar5.e;
                        int i15 = ((cpq) cpqVar7.k.get(0)).f - cpqVar7.e;
                        int i16 = ((cpq) cpqVar.k.get(0)).f + cpqVar.e;
                        int i17 = ((cpq) cpqVar2.k.get(0)).f - cpqVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        cprVar.c(iArr3[0]);
                        this.d.i.f.c(iArr3[1]);
                    } else if (z && z3) {
                        cpq cpqVar8 = this.i;
                        if (!cpqVar8.c) {
                            return;
                        }
                        cpq cpqVar9 = this.j;
                        if (!cpqVar9.c) {
                            return;
                        }
                        float f3 = cpdVar2.Y;
                        int i18 = (((cpq) cpqVar9.k.get(0)).f - cpqVar9.e) - (((cpq) cpqVar8.k.get(0)).f + cpqVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            cprVar.c(iH);
                            this.d.i.f.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            cprVar.c(iH3);
                            this.d.i.f.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!cpqVar.c || !cpqVar2.c) {
                            return;
                        }
                        float f4 = cpdVar2.Y;
                        int i21 = (((cpq) cpqVar2.k.get(0)).f - cpqVar2.e) - (((cpq) cpqVar.k.get(0)).f + cpqVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            cprVar.c(iH6);
                            this.d.i.f.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            cprVar.c(iH8);
                            this.d.i.f.c(iH7);
                        }
                    }
                } else {
                    int i24 = cpdVar2.Z;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = cpdVar2.i.f.f;
                        float f6 = cpdVar2.Y;
                        f = f5 * f6;
                        cprVar.c((int) (f + 0.5f));
                    } else {
                        f = cpdVar2.i.f.f / cpdVar2.Y;
                        cprVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        cpq cpqVar10 = this.i;
        if (cpqVar10.c) {
            cpq cpqVar11 = this.j;
            if (cpqVar11.c) {
                if (cpqVar10.i && cpqVar11.i && cprVar.i) {
                    return;
                }
                if (!cprVar.i && this.k == 3) {
                    cpd cpdVar4 = this.d;
                    if (cpdVar4.t == 0 && !cpdVar4.J()) {
                        cpq cpqVar12 = (cpq) cpqVar10.k.get(0);
                        cpq cpqVar13 = (cpq) cpqVar11.k.get(0);
                        int i25 = cpqVar12.f + cpqVar10.e;
                        int i26 = cpqVar13.f + cpqVar11.e;
                        cpqVar10.c(i25);
                        cpqVar11.c(i26);
                        cprVar.c(i26 - i25);
                        return;
                    }
                }
                if (!cprVar.i && this.k == 3 && this.c == 1) {
                    List list = cpqVar10.k;
                    if (list.size() > 0) {
                        List list2 = cpqVar11.k;
                        if (list2.size() > 0) {
                            cpq cpqVar14 = (cpq) list.get(0);
                            int iMin = Math.min((((cpq) list2.get(0)).f + cpqVar11.e) - (cpqVar14.f + cpqVar10.e), cprVar.m);
                            cpd cpdVar5 = this.d;
                            int i27 = cpdVar5.x;
                            int iMax = Math.max(cpdVar5.w, iMin);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            cprVar.c(iMax);
                        }
                    }
                }
                if (cprVar.i) {
                    cpq cpqVar15 = (cpq) cpqVar10.k.get(0);
                    cpq cpqVar16 = (cpq) cpqVar11.k.get(0);
                    int i28 = cpqVar15.f;
                    int i29 = cpqVar10.e + i28;
                    int i30 = cpqVar16.f;
                    int i31 = cpqVar11.e + i30;
                    float f7 = this.d.af;
                    if (cpqVar15 == cpqVar16) {
                        f7 = 0.5f;
                    }
                    if (cpqVar15 != cpqVar16) {
                        i30 = i31;
                    }
                    if (cpqVar15 != cpqVar16) {
                        i28 = i29;
                    }
                    cpqVar10.c((int) (i28 + 0.5f + (((i30 - i28) - cprVar.f) * f7)));
                    cpqVar11.c(cpqVar10.f + cprVar.f);
                }
            }
        }
    }

    public final void g() {
        this.h = false;
        cpq cpqVar = this.i;
        cpqVar.b();
        cpqVar.i = false;
        cpq cpqVar2 = this.j;
        cpqVar2.b();
        cpqVar2.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.aj));
    }
}
