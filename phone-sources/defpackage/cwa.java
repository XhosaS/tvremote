package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwa<T> implements Iterator<T>, yli {
    private final yjv a;
    private final List b = new ArrayList();
    private Iterator c;

    public cwa(Iterator it, yjv yjvVar) {
        this.a = yjvVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.c.next();
        ?? A = this.a.a(t);
        if (A != 0 && A.hasNext()) {
            this.b.add(this.c);
            this.c = A;
            return t;
        }
        while (!this.c.hasNext()) {
            List list = this.b;
            if (list.isEmpty()) {
                break;
            }
            this.c = (Iterator) yfm.W(list);
            yfm.E(list);
        }
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
