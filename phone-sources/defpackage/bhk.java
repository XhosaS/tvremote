package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhk<E> implements Iterator<E>, yli {
    private Object a;
    private final Map b;
    private int c;

    public bhk(Object obj, Map map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.a;
        this.c++;
        Object obj = this.b.get(e);
        if (obj == null) {
            throw new ConcurrentModificationException(a.cj(e, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.a = ((bhi) obj).b;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
