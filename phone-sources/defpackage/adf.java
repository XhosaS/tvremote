package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adf {
    private static final Comparator a = new ade(0);

    public static final List a(int i, int i2, List list, List list2) {
        if (list.isEmpty()) {
            return yhb.a;
        }
        List listAn = yfm.an(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            add addVar = (add) list.get(i3);
            int iA = addVar.a();
            if (i <= iA && iA <= i2) {
                listAn.add(addVar);
            }
        }
        yfm.C(listAn, a);
        return listAn;
    }
}
