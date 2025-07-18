package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwo extends byr {
    public static final bwo a = new bwo();

    private bwo() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return bvvVar.cz(clv.d(j), clv.c(j), yhc.a, lo.o);
        }
        if (size == 1) {
            bwj bwjVarU = ((bvs) list.get(0)).u(j);
            return bvvVar.cz(clw.c(j, bwjVarU.a), clw.b(j, bwjVarU.b), yhc.a, new brj(bwjVarU, 9));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            bwj bwjVarU2 = ((bvs) list.get(i)).u(j);
            iMax = Math.max(bwjVarU2.a, iMax);
            iMax2 = Math.max(bwjVarU2.b, iMax2);
            arrayList.add(bwjVarU2);
        }
        return bvvVar.cz(clw.c(j, iMax), clw.b(j, iMax2), yhc.a, new brj(arrayList, 10));
    }
}
