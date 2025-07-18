package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axf implements bvt {
    public final xj a;
    public final bkc b;
    private final ays c;
    private final float d;

    public axf(ays aysVar, xj xjVar, bkc bkcVar, float f) {
        this.c = aysVar;
        this.a = xjVar;
        this.b = bkcVar;
        this.d = f;
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
        Integer num;
        int iCu = buzVar.cu(this.d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((buy) list.get(0)).c(i));
            int iQ = yfm.q(list);
            if (iQ > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((buy) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iQ) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iCu, num != null ? num.intValue() : 0);
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
        int size = list.size();
        int iD = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iD += ((buy) list.get(i2)).d(i);
        }
        return iD;
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
        Integer num;
        int iCu = buzVar.cu(this.d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((buy) list.get(0)).e(i));
            int iQ = yfm.q(list);
            if (iQ > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((buy) list.get(i2)).e(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iQ) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iCu, num != null ? num.intValue() : 0);
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
        int size = list.size();
        int iF = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iF += ((buy) list.get(i2)).f(i);
        }
        return iF;
    }

    @Override // defpackage.bvt
    public final bvu e(final bvv bvvVar, List list, final long j) {
        final axf axfVar = this;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bvs bvsVar = (bvs) list.get(i);
            if (yks.e(bty.o(bvsVar), "navigationIcon")) {
                final bwj bwjVarU = bvsVar.u(clv.k(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    bvs bvsVar2 = (bvs) list.get(i2);
                    if (yks.e(bty.o(bvsVar2), "actionIcons")) {
                        final bwj bwjVarU2 = bvsVar2.u(clv.k(j, 0, 0, 0, 0, 14));
                        int iB = clv.b(j) == Integer.MAX_VALUE ? clv.b(j) : ykn.j((clv.b(j) - bwjVarU.a) - bwjVarU2.a, 0);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            bvs bvsVar3 = (bvs) list.get(i3);
                            if (yks.e(bty.o(bvsVar3), "title")) {
                                final bwj bwjVarU3 = bvsVar3.u(clv.k(j, 0, iB, 0, 0, 12));
                                bus busVar = bue.b;
                                if (bwjVarU3.cs(busVar) != Integer.MIN_VALUE) {
                                    bwjVarU3.cs(busVar);
                                }
                                float fA = axfVar.c.a();
                                int iV = Float.isNaN(fA) ? 0 : yln.v(fA);
                                int iMax = Math.max(bvvVar.cu(axfVar.d), bwjVarU3.b);
                                if (clv.a(j) != Integer.MAX_VALUE) {
                                    iMax = ykn.j(iMax + iV, 0);
                                }
                                final int i4 = iMax;
                                return bvvVar.cz(clv.b(j), i4, yhc.a, new yjv() { // from class: axe
                                    @Override // defpackage.yjv
                                    public final Object a(Object obj) {
                                        int i5 = i4;
                                        bwi bwiVar = (bwi) obj;
                                        bwj bwjVar = bwjVarU;
                                        int i6 = 0;
                                        bwi.y(bwiVar, bwjVar, 0, (i5 - bwjVar.b) / 2);
                                        int iMax2 = Math.max(bvvVar.cu(aqw.a), bwjVar.a);
                                        axf axfVar2 = axfVar;
                                        bkc bkcVar = axfVar2.b;
                                        long j2 = j;
                                        bwj bwjVar2 = bwjVarU3;
                                        bwj bwjVar3 = bwjVarU2;
                                        int i7 = bwjVar3.a;
                                        int iA = bkcVar.a(bwjVar2.a, clv.b(j2), cmi.a);
                                        if (iA < iMax2) {
                                            iA += iMax2 - iA;
                                        } else {
                                            int i8 = bwjVar2.a + iA;
                                            if (i8 > clv.b(j2) - i7) {
                                                iA += (clv.b(j2) - i7) - i8;
                                            }
                                        }
                                        xj xjVar = axfVar2.a;
                                        if (yks.e(xjVar, xk.e)) {
                                            i6 = (i5 - bwjVar2.b) / 2;
                                        } else if (yks.e(xjVar, xk.d)) {
                                            i6 = i5 - bwjVar2.b;
                                        }
                                        bwi.y(bwiVar, bwjVar2, iA, i6);
                                        bwi.y(bwiVar, bwjVar3, clv.b(j2) - bwjVar3.a, (i5 - bwjVar3.b) / 2);
                                        return ygi.a;
                                    }
                                });
                            }
                            i3++;
                            axfVar = this;
                        }
                        cmq.a("Collection contains no element matching the predicate.");
                        throw new yfs();
                    }
                    i2++;
                    axfVar = this;
                }
                cmq.a("Collection contains no element matching the predicate.");
                throw new yfs();
            }
            i++;
            axfVar = this;
        }
        cmq.a("Collection contains no element matching the predicate.");
        throw new yfs();
    }
}
