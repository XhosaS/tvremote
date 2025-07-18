package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zjc extends zje {
    @Override // defpackage.zje
    public final Object a(Deque deque) {
        Iterator it = (Iterator) deque.getFirst();
        if (!it.hasNext()) {
            deque.removeFirst();
            return null;
        }
        Object next = it.next();
        next.getClass();
        return next;
    }
}
