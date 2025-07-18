package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agqx extends agqw {
    public static final Object j(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(agqq.c(list));
    }

    public static final void k(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void l(List list, agux aguxVar) {
        int iC;
        int iC2 = agqq.c(list);
        int i = 0;
        if (iC2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (((Boolean) aguxVar.a(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iC2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iC = agqq.c(list))) {
            return;
        }
        while (true) {
            list.remove(iC);
            if (iC == i) {
                return;
            } else {
                iC--;
            }
        }
    }
}
