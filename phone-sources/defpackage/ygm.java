package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ygm implements Iterator, yli {
    public int a;
    final /* synthetic */ ygp b;

    public ygm(ygp ygpVar) {
        this.b = ygpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ygp ygpVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return ygpVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
