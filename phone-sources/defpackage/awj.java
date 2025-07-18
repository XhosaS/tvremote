package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awj implements bvt {
    final /* synthetic */ float a;

    public awj(float f) {
        this.a = f;
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int a(buz buzVar, List list, int i) {
        return fh.W(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int b(buz buzVar, List list, int i) {
        return fh.X(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int c(buz buzVar, List list, int i) {
        return fh.Y(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int d(buz buzVar, List list, int i) {
        return fh.Z(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final bvu e(final bvv bvvVar, List list, long j) {
        Integer num;
        long jK = clv.k(j, 0, 0, 0, 0, 10);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bvs bvsVar = (bvs) list.get(i);
            if (yks.e(bty.o(bvsVar), "LeadingButton")) {
                final bwj bwjVarU = bvsVar.u(jK);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bvs bvsVar2 = (bvs) list.get(i2);
                    if (yks.e(bty.o(bvsVar2), "TrailingButton")) {
                        int i3 = bwjVarU.a;
                        final float f = this.a;
                        long jL = clw.l(jK, -(i3 + bvvVar.cu(f)), 0, 2);
                        int i4 = bwjVarU.b;
                        final bwj bwjVarU2 = bvsVar2.u(clv.k(jL, 0, 0, i4, i4, 3));
                        int i5 = 1;
                        List listS = yfm.s(bwjVarU, bwjVarU2);
                        int size3 = listS.size();
                        int i6 = 0;
                        for (int i7 = 0; i7 < size3; i7++) {
                            i6 += ((bwj) listS.get(i7)).a;
                        }
                        int iCu = i6 + bvvVar.cu(f);
                        if (listS.isEmpty()) {
                            num = null;
                        } else {
                            Integer numValueOf = Integer.valueOf(((bwj) listS.get(0)).b);
                            int iQ = yfm.q(listS);
                            if (iQ > 0) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((bwj) listS.get(i5)).b);
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i5 == iQ) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            num = numValueOf;
                        }
                        return bvvVar.cz(clw.c(j, iCu), clw.b(j, num != null ? num.intValue() : 0), yhc.a, new yjv() { // from class: awi
                            @Override // defpackage.yjv
                            public final Object a(Object obj) {
                                bwi bwiVar = (bwi) obj;
                                bwj bwjVar = bwjVarU;
                                bwi.y(bwiVar, bwjVar, 0, 0);
                                bwi.y(bwiVar, bwjVarU2, bwjVar.a + bvvVar.cu(f), 0);
                                return ygi.a;
                            }
                        });
                    }
                }
                cmq.a("Collection contains no element matching the predicate.");
                throw new yfs();
            }
        }
        cmq.a("Collection contains no element matching the predicate.");
        throw new yfs();
    }
}
