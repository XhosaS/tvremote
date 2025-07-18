package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ars {
    public static bzs a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new aro(4));
            int i = bzs.d;
            return (bzs) map.collect(bza.a);
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((arr) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new aro(4));
            int i2 = bzs.d;
            return (bzs) map2.collect(bza.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = bzs.d;
        bzo bzoVar = new bzo();
        int size = arrayList.size();
        long jA2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            arr arrVar = (arr) arrayList.get(i5);
            i4++;
            jA2 += arrVar.a();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            bzoVar.g(arrVar.b());
        }
        return bzoVar.f();
    }
}
