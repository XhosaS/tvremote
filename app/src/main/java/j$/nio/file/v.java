package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class v implements Iterator {
    public final Iterator a;

    public v(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return AbstractC0002a.g(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
