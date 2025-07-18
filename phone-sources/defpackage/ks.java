package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ks implements Iterator, yli {
    final /* synthetic */ kp a;
    private int b;

    public ks(kp kpVar) {
        this.a = kpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.a.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
