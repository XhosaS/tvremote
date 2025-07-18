package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tsb implements Iterator {
    final /* synthetic */ Iterable a;
    final /* synthetic */ tsg b;
    private final Iterator c;

    public tsb(tsg tsgVar, Iterable iterable) {
        this.a = iterable;
        this.b = tsgVar;
        this.c = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.convert(this.c.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
    }
}
