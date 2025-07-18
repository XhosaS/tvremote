package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhi implements ListIterator, yli {
    final /* synthetic */ yhj a;
    private final ListIterator b;

    public yhi(yhj yhjVar, int i) {
        this.a = yhjVar;
        List list = yhjVar.a;
        if (i >= 0 && i <= yhjVar.a()) {
            this.b = list.listIterator(yhjVar.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new ymd(0, yhjVar.a()) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return yfm.G(this.a, this.b.previousIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return yfm.G(this.a, this.b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
