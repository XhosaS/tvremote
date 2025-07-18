package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjh {
    public final List a;

    public cjh(cjg... cjgVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (cjg cjgVar : cjgVarArr) {
            String str = cjgVar.a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(cjgVar);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException("'" + str2 + "' must be unique. Actual [ [" + yfm.ax(list, null, null, null, null, 63) + ']');
            }
            yfm.I(arrayList2, list);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.a = arrayList3;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjh) && yks.e(this.a, ((cjh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
