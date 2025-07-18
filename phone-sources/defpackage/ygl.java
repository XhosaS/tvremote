package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygl<T> implements Iterator<T>, yli {
    public int a;
    public Object b;
    final /* synthetic */ yhk c;
    private int d;
    private int e;

    public ygl() {
        throw null;
    }

    private final boolean a() {
        this.a = 3;
        int i = this.d;
        if (i == 0) {
            this.a = 2;
            return false;
        }
        yhk yhkVar = this.c;
        int i2 = this.e;
        this.b = yhkVar.a[i2];
        this.a = 1;
        this.e = (i2 + 1) % yhkVar.b;
        this.d = i - 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            return a();
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
    public final T next() {
        int i = this.a;
        if (i != 1 && (i == 2 || !a())) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return (T) this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ygl(yhk yhkVar) {
        this.c = yhkVar;
        this.d = yhkVar.d;
        this.e = yhkVar.c;
    }
}
