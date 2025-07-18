package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awy implements bvt {
    public final boolean a;
    public final yy b;
    public final float c;
    public final a d;
    private final ays e;

    public awy(boolean z, a aVar, ays aysVar, yy yyVar, float f) {
        this.a = z;
        this.d = aVar;
        this.e = aysVar;
        this.b = yyVar;
        this.c = f;
    }

    public static final int f(awy awyVar, int i, int i2, bwj bwjVar) {
        return awyVar.a ? bkb.n.a(bwjVar.b, i) : i2;
    }

    private final int g(buz buzVar, List list, int i, yjz yjzVar) {
        Object obj;
        int i2;
        int iIntValue;
        int iB;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (yks.e(zy.C((buy) obj), "Leading")) {
                break;
            }
            i5++;
        }
        buy buyVar = (buy) obj;
        if (buyVar != null) {
            i2 = i;
            iB = zy.B(i2, buyVar.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            iIntValue = ((Number) yjzVar.a(buyVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iB = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (yks.e(zy.C((buy) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        buy buyVar2 = (buy) obj2;
        if (buyVar2 != null) {
            iB = zy.B(iB, buyVar2.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            iIntValue2 = ((Number) yjzVar.a(buyVar2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (yks.e(zy.C((buy) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (buy) obj3;
        int iIntValue3 = obj8 != null ? ((Number) yjzVar.a(obj8, Integer.valueOf(iB))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (yks.e(zy.C((buy) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        buy buyVar3 = (buy) obj4;
        if (buyVar3 != null) {
            int iIntValue4 = ((Number) yjzVar.a(buyVar3, Integer.valueOf(iB))).intValue();
            iB = zy.B(iB, buyVar3.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (yks.e(zy.C((buy) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        buy buyVar4 = (buy) obj5;
        if (buyVar4 != null) {
            int iIntValue5 = ((Number) yjzVar.a(buyVar4, Integer.valueOf(iB))).intValue();
            iB = zy.B(iB, buyVar4.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (yks.e(zy.C((buy) obj9), "TextField")) {
                int iIntValue6 = ((Number) yjzVar.a(obj9, Integer.valueOf(iB))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (yks.e(zy.C((buy) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (buy) obj6;
                int iIntValue7 = obj10 != null ? ((Number) yjzVar.a(obj10, Integer.valueOf(iB))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (yks.e(zy.C((buy) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (buy) obj7;
                return j(buzVar, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) yjzVar.a(obj11, Integer.valueOf(i2))).intValue() : 0, clw.k(0, 0, 15), this.e.a());
            }
        }
        cmq.a("Collection contains no element matching the predicate.");
        throw new yfs();
    }

    private static final int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return clw.c(j, i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2);
    }

    private static final int i(List list, int i, yjz yjzVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (yks.e(zy.C((buy) obj7), "TextField")) {
                int iIntValue = ((Number) yjzVar.a(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (yks.e(zy.C((buy) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                buy buyVar = (buy) obj2;
                int iIntValue2 = buyVar != null ? ((Number) yjzVar.a(buyVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (yks.e(zy.C((buy) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                buy buyVar2 = (buy) obj3;
                int iIntValue3 = buyVar2 != null ? ((Number) yjzVar.a(buyVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (yks.e(zy.C((buy) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                buy buyVar3 = (buy) obj4;
                int iIntValue4 = buyVar3 != null ? ((Number) yjzVar.a(buyVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (yks.e(zy.C((buy) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                buy buyVar4 = (buy) obj5;
                int iIntValue5 = buyVar4 != null ? ((Number) yjzVar.a(buyVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (yks.e(zy.C((buy) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                buy buyVar5 = (buy) obj6;
                int iIntValue6 = buyVar5 != null ? ((Number) yjzVar.a(buyVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (yks.e(zy.C((buy) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                buy buyVar6 = (buy) obj;
                return h(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, buyVar6 != null ? ((Number) yjzVar.a(buyVar6, Integer.valueOf(i))).intValue() : 0, clw.k(0, 0, 15));
            }
        }
        cmq.a("Collection contains no element matching the predicate.");
        throw new yfs();
    }

    private final int j(clx clxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        za zaVar = (za) this.b;
        int iCu = clxVar.cu(zaVar.a + zaVar.b);
        int iMax = 0;
        int[] iArr = {i7, i5, i6, cmq.g(i2, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        if (i2 > 0) {
            float f2 = this.c;
            int iCu2 = clxVar.cu(f2 + f2);
            ni niVar = azp.a;
            iMax = Math.max(iCu2, cmq.g(0, i2, azp.a.a(f)));
        }
        return clw.b(j, Math.max(i3, Math.max(i4, iCu + iMax + i)) + i8);
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
        return g(buzVar, list, i, new xb(12));
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
        return i(list, i, new xb(10));
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
        return g(buzVar, list, i, new xb(11));
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
        return i(list, i, new xb(9));
    }

    @Override // defpackage.bvt
    public final bvu e(final bvv bvvVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        int i2;
        Object obj7;
        za zaVar = (za) this.b;
        float f = zaVar.b;
        final float fA = this.e.a();
        int iCu = bvvVar.cu(zaVar.a);
        int iCu2 = bvvVar.cu(f);
        long jK = clv.k(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (yks.e(bty.o((bvs) obj), "Leading")) {
                break;
            }
            i3++;
        }
        bvs bvsVar = (bvs) obj;
        bwj bwjVarU = bvsVar != null ? bvsVar.u(jK) : null;
        int iA = zy.A(bwjVarU);
        int iMax = Math.max(0, zy.z(bwjVarU));
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (yks.e(bty.o((bvs) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        bvs bvsVar2 = (bvs) obj2;
        bwj bwjVarU2 = bvsVar2 != null ? bvsVar2.u(clw.l(jK, -iA, 0, 2)) : null;
        int iA2 = iA + zy.A(bwjVarU2);
        int iMax2 = Math.max(iMax, zy.z(bwjVarU2));
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (yks.e(bty.o((bvs) obj3), "Prefix")) {
                break;
            }
            i5++;
        }
        bvs bvsVar3 = (bvs) obj3;
        bwj bwjVarU3 = bvsVar3 != null ? bvsVar3.u(clw.l(jK, -iA2, 0, 2)) : null;
        int iA3 = iA2 + zy.A(bwjVarU3);
        int iMax3 = Math.max(iMax2, zy.z(bwjVarU3));
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (yks.e(bty.o((bvs) obj4), "Suffix")) {
                break;
            }
            i6++;
        }
        bvs bvsVar4 = (bvs) obj4;
        bwj bwjVarU4 = bvsVar4 != null ? bvsVar4.u(clw.l(jK, -iA3, 0, 2)) : null;
        int iA4 = iA3 + zy.A(bwjVarU4);
        int iMax4 = Math.max(iMax3, zy.z(bwjVarU4));
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (yks.e(bty.o((bvs) obj5), "Label")) {
                break;
            }
            i7++;
        }
        int i8 = -iA4;
        bvs bvsVar5 = (bvs) obj5;
        ylf ylfVar = new ylf();
        ylfVar.a = bvsVar5 != null ? bvsVar5.u(clw.h(jK, i8, -iCu2)) : null;
        int size6 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i9);
            if (yks.e(bty.o((bvs) obj6), "Supporting")) {
                break;
            }
            i9++;
        }
        bvs bvsVar6 = (bvs) obj6;
        int iE = bvsVar6 != null ? bvsVar6.e(clv.d(j)) : 0;
        int iZ = zy.z((bwj) ylfVar.a) + iCu;
        long jH = clw.h(clv.k(j, 0, 0, 0, 0, 11), i8, ((-iZ) - iCu2) - iE);
        int size7 = list.size();
        int i10 = 0;
        while (i10 < size7) {
            bvs bvsVar7 = (bvs) list.get(i10);
            int i11 = size7;
            if (yks.e(bty.o(bvsVar7), "TextField")) {
                final bwj bwjVarU5 = bvsVar7.u(jH);
                long jK2 = clv.k(jH, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        i = iCu2;
                        i2 = iZ;
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    i = iCu2;
                    i2 = iZ;
                    if (yks.e(bty.o((bvs) obj7), "Hint")) {
                        break;
                    }
                    i12++;
                    iCu2 = i;
                    iZ = i2;
                }
                bvs bvsVar8 = (bvs) obj7;
                bwj bwjVarU6 = bvsVar8 != null ? bvsVar8.u(jK2) : null;
                int iMax5 = Math.max(iMax4, Math.max(zy.z(bwjVarU5), zy.z(bwjVarU6)) + i2 + i);
                final int iH = h(zy.A(bwjVarU), zy.A(bwjVarU2), zy.A(bwjVarU3), zy.A(bwjVarU4), bwjVarU5.a, zy.A((bwj) ylfVar.a), zy.A(bwjVarU6), j);
                bwj bwjVarU7 = bvsVar6 != null ? bvsVar6.u(clv.k(clw.l(jK, 0, -iMax5, 1), 0, iH, 0, 0, 9)) : null;
                int iZ2 = zy.z(bwjVarU7);
                final ylf ylfVar2 = ylfVar;
                final int iJ = j(bvvVar, bwjVarU5.b, zy.z((bwj) ylfVar.a), zy.z(bwjVarU), zy.z(bwjVarU2), zy.z(bwjVarU3), zy.z(bwjVarU4), zy.z(bwjVarU6), zy.z(bwjVarU7), j, fA);
                final int i13 = iJ - iZ2;
                int size9 = list.size();
                int i14 = 0;
                while (i14 < size9) {
                    bvs bvsVar9 = (bvs) list.get(i14);
                    if (yks.e(bty.o(bvsVar9), "Container")) {
                        final bwj bwjVarU8 = bvsVar9.u(clw.d(iH != Integer.MAX_VALUE ? iH : 0, iH, i13 != Integer.MAX_VALUE ? i13 : 0, i13));
                        final int i15 = iCu;
                        final bwj bwjVar = bwjVarU;
                        final bwj bwjVar2 = bwjVarU7;
                        final bwj bwjVar3 = bwjVarU2;
                        final bwj bwjVar4 = bwjVarU3;
                        final bwj bwjVar5 = bwjVarU4;
                        final bwj bwjVar6 = bwjVarU6;
                        return bvvVar.cz(iH, iJ, yhc.a, new yjv() { // from class: awx
                            @Override // defpackage.yjv
                            public final Object a(Object obj8) {
                                bwj bwjVar7;
                                int iCu3;
                                bwj bwjVar8;
                                bwi bwiVar = (bwi) obj8;
                                bwj bwjVar9 = bwjVar2;
                                bwj bwjVar10 = bwjVarU8;
                                bwj bwjVar11 = bwjVar;
                                bwj bwjVar12 = bwjVar4;
                                bwj bwjVar13 = bwjVar5;
                                bwj bwjVar14 = bwjVar3;
                                bwj bwjVar15 = bwjVar6;
                                bwj bwjVar16 = bwjVarU5;
                                int i16 = iJ;
                                int i17 = iH;
                                bvv bvvVar2 = bvvVar;
                                awy awyVar = this;
                                ylf ylfVar3 = ylfVar2;
                                Object obj9 = ylfVar3.a;
                                if (obj9 != null) {
                                    int i18 = i15;
                                    if (awyVar.a) {
                                        bwjVar7 = bwjVar9;
                                        iCu3 = bkb.n.a(((bwj) obj9).b, i13);
                                    } else {
                                        bwjVar7 = bwjVar9;
                                        iCu3 = bvvVar2.cu(awyVar.c) + i18;
                                    }
                                    bwj bwjVar17 = (bwj) ylfVar3.a;
                                    int i19 = bwjVar17.b + i18;
                                    cmi cmiVarN = bvvVar2.n();
                                    bwiVar.r(bwjVar10, 0, 0, 0.0f);
                                    int iZ3 = i16 - zy.z(bwjVar7);
                                    if (bwjVar11 != null) {
                                        bwjVar8 = bwjVar14;
                                        bwi.y(bwiVar, bwjVar11, 0, bkb.n.a(bwjVar11.b, iZ3));
                                    } else {
                                        bwjVar8 = bwjVar14;
                                        bwjVar11 = null;
                                    }
                                    float f2 = fA;
                                    int iG = cmq.g(iCu3, i18, f2);
                                    int iA5 = cmiVarN == cmi.a ? zy.A(bwjVar11) : zy.A(bwjVar8);
                                    aww awwVar = (aww) awyVar.d;
                                    bwj bwjVar18 = bwjVar11;
                                    bwiVar.r(bwjVar17, cmq.g(awwVar.b.a(bwjVar17.a, (i17 - zy.A(bwjVar11)) - zy.A(bwjVar8), cmiVarN) + iA5, awwVar.a.a(bwjVar17.a, (i17 - zy.A(bwjVar18)) - zy.A(bwjVar8), cmiVarN) + iA5, f2), iG, 0.0f);
                                    if (bwjVar12 != null) {
                                        bwi.y(bwiVar, bwjVar12, zy.A(bwjVar18), i19);
                                    } else {
                                        bwjVar12 = null;
                                    }
                                    int iA6 = zy.A(bwjVar18) + zy.A(bwjVar12);
                                    bwi.y(bwiVar, bwjVar16, iA6, i19);
                                    if (bwjVar15 != null) {
                                        bwi.y(bwiVar, bwjVar15, iA6, i19);
                                    }
                                    if (bwjVar13 != null) {
                                        bwi.y(bwiVar, bwjVar13, (i17 - zy.A(bwjVar8)) - bwjVar13.a, i19);
                                    }
                                    if (bwjVar8 != null) {
                                        bwj bwjVar19 = bwjVar8;
                                        bwi.y(bwiVar, bwjVar19, i17 - bwjVar19.a, bkb.n.a(bwjVar19.b, iZ3));
                                    }
                                    if (bwjVar7 != null) {
                                        bwi.y(bwiVar, bwjVar7, 0, iZ3);
                                    }
                                } else {
                                    float fA2 = bvvVar2.a();
                                    bwiVar.s(bwjVar10, 0L, 0.0f);
                                    int iZ4 = i16 - zy.z(bwjVar9);
                                    int iV = yln.v(((za) awyVar.b).a * fA2);
                                    if (bwjVar11 != null) {
                                        bwi.y(bwiVar, bwjVar11, 0, bkb.n.a(bwjVar11.b, iZ4));
                                    } else {
                                        bwjVar11 = null;
                                    }
                                    if (bwjVar12 != null) {
                                        bwi.y(bwiVar, bwjVar12, zy.A(bwjVar11), awy.f(awyVar, iZ4, iV, bwjVar12));
                                    } else {
                                        bwjVar12 = null;
                                    }
                                    int iA7 = zy.A(bwjVar11) + zy.A(bwjVar12);
                                    bwi.y(bwiVar, bwjVar16, iA7, awy.f(awyVar, iZ4, iV, bwjVar16));
                                    if (bwjVar15 != null) {
                                        bwi.y(bwiVar, bwjVar15, iA7, awy.f(awyVar, iZ4, iV, bwjVar15));
                                    }
                                    if (bwjVar13 != null) {
                                        bwi.y(bwiVar, bwjVar13, (i17 - zy.A(bwjVar14)) - bwjVar13.a, awy.f(awyVar, iZ4, iV, bwjVar13));
                                    }
                                    if (bwjVar14 != null) {
                                        bwi.y(bwiVar, bwjVar14, i17 - bwjVar14.a, bkb.n.a(bwjVar14.b, iZ4));
                                    }
                                    if (bwjVar9 != null) {
                                        bwi.y(bwiVar, bwjVar9, 0, iZ4);
                                    }
                                }
                                return ygi.a;
                            }
                        });
                    }
                    i14++;
                    i13 = i13;
                    iCu = iCu;
                    bwjVarU7 = bwjVarU7;
                }
                cmq.a("Collection contains no element matching the predicate.");
                throw new yfs();
            }
            i10++;
            ylfVar = ylfVar;
            size7 = i11;
            jH = jH;
            iCu = iCu;
            iCu2 = iCu2;
        }
        cmq.a("Collection contains no element matching the predicate.");
        throw new yfs();
    }
}
