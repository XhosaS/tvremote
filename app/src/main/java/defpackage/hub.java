package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hub {
    static void a(List list, List list2, List list3) {
        if (list2.size() > 3) {
            list.clear();
            list2.clear();
            return;
        }
        int i = 0;
        if (!list2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(" ");
            }
            String strC = ypx.c(sb.toString().trim());
            if (!list3.contains(strC)) {
                list3.add(strC);
            }
        }
        while (i < list.size()) {
            ArrayList arrayList = new ArrayList(list2);
            list2.clear();
            arrayList.add((String) list.get(i));
            i++;
            a(list.subList(i, list.size()), arrayList, list3);
        }
    }
}
