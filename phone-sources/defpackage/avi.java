package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avi implements bvt {
    final /* synthetic */ avn a;

    public avi(avn avnVar) {
        this.a = avnVar;
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
    public final bvu e(bvv bvvVar, List list, long j) {
        int iMax;
        int iMax2;
        int i;
        int i2;
        int iV;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            bvs bvsVar = (bvs) list.get(i3);
            if (bty.o(bvsVar) == auz.a) {
                final bwj bwjVarU = bvsVar.u(j);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    bvs bvsVar2 = (bvs) list.get(i4);
                    if (bty.o(bvsVar2) == auz.b) {
                        avn avnVar = this.a;
                        uv uvVar = avnVar.e;
                        uv uvVar2 = uv.a;
                        final bwj bwjVarU2 = uvVar == uvVar2 ? bvsVar2.u(clv.k(clw.l(j, 0, -bwjVarU.b, 1), 0, 0, 0, 0, 14)) : bvsVar2.u(clv.k(clw.l(j, -bwjVarU.a, 0, 2), 0, 0, 0, 0, 11));
                        final yld yldVar = new yld();
                        float fB = avnVar.b();
                        float[] fArr = avnVar.c;
                        bwjVarU2.cs(avm.a);
                        if (avnVar.e == uvVar2) {
                            iMax = Math.max(bwjVarU2.a, bwjVarU.a);
                            int i5 = bwjVarU.b;
                            int i6 = bwjVarU2.b;
                            iMax2 = i5 + i6;
                            i = (iMax - bwjVarU2.a) / 2;
                            i2 = i5 / 2;
                            iV = (iMax - bwjVarU.a) / 2;
                            yldVar.a = yln.v(i6 * fB);
                        } else {
                            iMax = bwjVarU.a + bwjVarU2.a;
                            iMax2 = Math.max(bwjVarU2.b, bwjVarU.b);
                            i = bwjVarU.a / 2;
                            i2 = (iMax2 - bwjVarU2.b) / 2;
                            iV = yln.v(bwjVarU2.a * fB);
                            yldVar.a = (iMax2 - bwjVarU.b) / 2;
                        }
                        final int i7 = i2;
                        final int i8 = i;
                        final int i9 = iV;
                        avnVar.i.h(iMax);
                        avnVar.j.h(iMax2);
                        return bvvVar.cz(iMax, iMax2, yhc.a, new yjv() { // from class: avh
                            @Override // defpackage.yjv
                            public final Object a(Object obj) {
                                bwi bwiVar = (bwi) obj;
                                bwi.y(bwiVar, bwjVarU2, i8, i7);
                                bwi.y(bwiVar, bwjVarU, i9, yldVar.a);
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
