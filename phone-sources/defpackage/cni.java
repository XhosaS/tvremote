package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cni implements bvt {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cni(int i) {
        this.c = i;
        this.b = "action";
        this.a = "text";
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int a(buz buzVar, List list, int i) {
        return this.c != 0 ? fh.W(this, buzVar, list, i) : fh.W(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int b(buz buzVar, List list, int i) {
        return this.c != 0 ? fh.X(this, buzVar, list, i) : fh.X(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int c(buz buzVar, List list, int i) {
        return this.c != 0 ? fh.Y(this, buzVar, list, i) : fh.Y(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int d(buz buzVar, List list, int i) {
        return this.c != 0 ? fh.Z(this, buzVar, list, i) : fh.Z(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        int iCu;
        int iMax;
        int i = 0;
        if (this.c == 0) {
            ((cny) this.a).e = (cmi) this.b;
            return bvvVar.cz(0, 0, yhc.a, ccu.m);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = this.b;
            bvs bvsVar = (bvs) list.get(i2);
            if (yks.e(bty.o(bvsVar), obj)) {
                long j2 = j;
                final bwj bwjVarU = bvsVar.u(j2);
                int iB = (clv.b(j2) - bwjVarU.a) - bvvVar.cu(8.0f);
                int iD = clv.d(j2);
                Object obj2 = this.a;
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    bvs bvsVar2 = (bvs) list.get(i3);
                    if (yks.e(bty.o(bvsVar2), obj2)) {
                        final bwj bwjVarU2 = bvsVar2.u(clv.k(j2, 0, ykn.j(iB, iD), 0, 0, 9));
                        bus busVar = bue.a;
                        int iCs = bwjVarU2.cs(busVar);
                        int iCs2 = bwjVarU2.cs(bue.b);
                        boolean z = true;
                        boolean z2 = (iCs == Integer.MIN_VALUE || iCs2 == Integer.MIN_VALUE) ? false : true;
                        if (iCs != iCs2 && z2) {
                            z = false;
                        }
                        final int iB2 = clv.b(j) - bwjVarU.a;
                        if (z) {
                            iMax = Math.max(bvvVar.cu(48.0f), bwjVarU.b);
                            iCu = (iMax - bwjVarU2.b) / 2;
                            int iCs3 = bwjVarU.cs(busVar);
                            if (iCs3 != Integer.MIN_VALUE) {
                                i = (iCs + iCu) - iCs3;
                            }
                        } else {
                            iCu = bvvVar.cu(30.0f) - iCs;
                            iMax = Math.max(bvvVar.cu(68.0f), bwjVarU2.b + iCu);
                            i = (iMax - bwjVarU.b) / 2;
                        }
                        final int i4 = i;
                        final int i5 = iCu;
                        return bvvVar.cz(clv.b(j), iMax, yhc.a, new yjv() { // from class: apr
                            @Override // defpackage.yjv
                            public final Object a(Object obj3) {
                                bwi bwiVar = (bwi) obj3;
                                bwi.y(bwiVar, bwjVarU2, 0, i5);
                                bwi.y(bwiVar, bwjVarU, iB2, i4);
                                return ygi.a;
                            }
                        });
                    }
                    i3++;
                    j2 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public cni(cny cnyVar, cmi cmiVar, int i) {
        this.c = i;
        this.a = cnyVar;
        this.b = cmiVar;
    }
}
