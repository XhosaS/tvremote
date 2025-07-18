package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agpy implements Iterator {
    public int a;
    public Object b;

    private final boolean b() {
        this.a = 3;
        a();
        return this.a == 1;
    }

    protected abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            return b();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i != 1 && (i == 2 || !b())) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
