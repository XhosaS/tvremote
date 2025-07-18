package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyh implements Iterator {
    private int a;
    private final Iterator b;

    public agyh(agyi agyiVar) {
        this.a = agyiVar.b;
        this.b = agyiVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.a = i - 1;
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
