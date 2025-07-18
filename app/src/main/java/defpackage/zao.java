package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zao extends zdl {
    final Queue a;

    public zao(Iterable iterable, final Comparator comparator) {
        this.a = new PriorityQueue(2, new Comparator() { // from class: zan
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((zap) obj).a(), ((zap) obj2).a());
            }
        });
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.a.add(zar.k(it2));
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Queue queue = this.a;
        zap zapVar = (zap) queue.remove();
        Object next = zapVar.next();
        if (zapVar.hasNext()) {
            queue.add(zapVar);
        }
        return next;
    }
}
