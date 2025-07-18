package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xq implements bvt {
    public final bkd a;
    private final boolean b;

    public xq(bkd bkdVar, boolean z) {
        this.a = bkdVar;
        this.b = z;
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
        int iD;
        int iC;
        bwj bwjVarU;
        if (list.isEmpty()) {
            return bvvVar.cz(clv.d(j), clv.c(j), yhc.a, new pl(13));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final bvs bvsVar = (bvs) list.get(0);
            if (xo.d(bvsVar)) {
                iD = clv.d(j);
                iC = clv.c(j);
                bwjVarU = bvsVar.u(clw.o(clv.d(j), clv.c(j)));
            } else {
                bwjVarU = bvsVar.u(j2);
                iD = Math.max(clv.d(j), bwjVarU.a);
                iC = Math.max(clv.c(j), bwjVarU.b);
            }
            final int i = iC;
            final int i2 = iD;
            final bwj bwjVar = bwjVarU;
            return bvvVar.cz(i2, i, yhc.a, new yjv() { // from class: xp
                @Override // defpackage.yjv
                public final Object a(Object obj) {
                    xo.c((bwi) obj, bwjVar, bvsVar, bvvVar.n(), i2, i, this.a);
                    return ygi.a;
                }
            });
        }
        bwj[] bwjVarArr = new bwj[list.size()];
        yld yldVar = new yld();
        yldVar.a = clv.d(j);
        yld yldVar2 = new yld();
        yldVar2.a = clv.c(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            bvs bvsVar2 = (bvs) list.get(i3);
            if (xo.d(bvsVar2)) {
                z = true;
            } else {
                bwj bwjVarU2 = bvsVar2.u(j2);
                bwjVarArr[i3] = bwjVarU2;
                yldVar.a = Math.max(yldVar.a, bwjVarU2.a);
                yldVar2.a = Math.max(yldVar2.a, bwjVarU2.b);
            }
        }
        if (z) {
            int i4 = yldVar.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = yldVar2.a;
            long jD = clw.d(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                bvs bvsVar3 = (bvs) list.get(i7);
                if (xo.d(bvsVar3)) {
                    bwjVarArr[i7] = bvsVar3.u(jD);
                }
            }
        }
        return bvvVar.cz(yldVar.a, yldVar2.a, yhc.a, new jyh(bwjVarArr, list, bvvVar, yldVar, yldVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        return yks.e(this.a, xqVar.a) && this.b == xqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
