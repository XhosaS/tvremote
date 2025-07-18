package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bye implements ListIterator, yli {
    final /* synthetic */ byg a;
    private int b;
    private final int c;
    private final int d;

    public bye(byg bygVar, int i, int i2, int i3) {
        this.a = bygVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        Object objC = this.a.b.c(i);
        objC.getClass();
        return (bko) objC;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        int i = this.b - 1;
        this.b = i;
        Object objC = this.a.b.c(i);
        objC.getClass();
        return (bko) objC;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b - this.c) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ bye(byg bygVar, int i, int i2) {
        this(bygVar, 1 == (i2 & 1) ? 0 : i, 0, bygVar.a());
    }
}
