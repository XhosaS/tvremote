package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfz {
    public static final /* synthetic */ int a = 0;

    static {
        new cfy("");
    }

    public static final List a(cfy cfyVar, int i, int i2, yjv yjvVar) {
        List list;
        if (i == i2 || (list = cfyVar.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0) {
            if (i2 >= cfyVar.b.length()) {
                if (yjvVar == null) {
                    return list;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    Object obj = list.get(i3);
                    if (((Boolean) yjvVar.a(((cfx) obj).a)).booleanValue()) {
                        arrayList.add(obj);
                    }
                    i3++;
                }
                return arrayList;
            }
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            cfx cfxVar = (cfx) list.get(i3);
            if (yjvVar == null || ((Boolean) yjvVar.a(cfxVar.a)).booleanValue()) {
                int i4 = cfxVar.b;
                int i5 = cfxVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new cfx((cfu) cfxVar.a, ykn.l(i4, i, i2) - i, ykn.l(i5, i, i2) - i, cfxVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
