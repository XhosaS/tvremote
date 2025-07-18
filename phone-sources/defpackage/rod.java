package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rod {
    public static ImmutableList a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            return (ImmutableList) Collection.EL.stream(list).map(new nrc(8)).collect(ImmutableList.toImmutableList());
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((roc) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            return (ImmutableList) Collection.EL.stream(list).map(new nrc(8)).collect(ImmutableList.toImmutableList());
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ImmutableList.Builder builder = ImmutableList.builder();
        int size = arrayList.size();
        long jA2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            roc rocVar = (roc) arrayList.get(i2);
            i++;
            jA2 += rocVar.a();
            if ((j >= 0 && i > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            builder.add((ImmutableList.Builder) rocVar.b());
        }
        return builder.build();
    }
}
