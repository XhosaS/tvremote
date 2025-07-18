package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kik implements Iterator {
    protected final kij a;
    protected int b = -1;

    public kik(kij kijVar) {
        this.a = kijVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.b() + (-1);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            kij kijVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return kijVar.c(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
