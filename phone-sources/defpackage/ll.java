package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ll implements bvt {
    private final lu a;
    private boolean b;

    public ll(lu luVar) {
        this.a = luVar;
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((buy) list.get(0)).c(i);
        int iQ = yfm.q(list);
        if (iQ > 0) {
            int i2 = 1;
            while (true) {
                int iC2 = ((buy) list.get(i2)).c(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == iQ) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((buy) list.get(0)).d(i);
        int iQ = yfm.q(list);
        if (iQ > 0) {
            int i2 = 1;
            while (true) {
                int iD2 = ((buy) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == iQ) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE = ((buy) list.get(0)).e(i);
        int iQ = yfm.q(list);
        if (iQ > 0) {
            int i2 = 1;
            while (true) {
                int iE2 = ((buy) list.get(i2)).e(i);
                if (iE2 > iE) {
                    iE = iE2;
                }
                if (i2 == iQ) {
                    break;
                }
                i2++;
            }
        }
        return iE;
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((buy) list.get(0)).f(i);
        int iQ = yfm.q(list);
        if (iQ > 0) {
            int i2 = 1;
            while (true) {
                int iF2 = ((buy) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == iQ) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            bwj bwjVarU = ((bvs) list.get(i)).u(j);
            iMax2 = Math.max(iMax2, bwjVarU.a);
            iMax = Math.max(iMax, bwjVarU.b);
            arrayList.add(bwjVarU);
        }
        if (bvvVar.cA()) {
            this.b = true;
            this.a.a.b(new cmh((4294967295L & iMax) | (iMax2 << 32)));
        } else if (!this.b) {
            this.a.a.b(new cmh((4294967295L & iMax) | (iMax2 << 32)));
        }
        return bvvVar.cz(iMax2, iMax, yhc.a, new lk(arrayList, 0));
    }
}
