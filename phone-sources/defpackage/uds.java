package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uds implements Iterator {
    final /* synthetic */ Iterator a;

    public uds(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (Collection) ((Map.Entry) this.a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
