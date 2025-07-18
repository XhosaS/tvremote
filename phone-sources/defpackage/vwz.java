package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwz implements Iterator, yli {
    final /* synthetic */ Iterator a;
    private final /* synthetic */ Iterator b;

    public vwz(Iterator it) {
        this.a = it;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new vxb((Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
