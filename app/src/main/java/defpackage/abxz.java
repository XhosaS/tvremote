package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abxz implements Iterator {
    private final Iterator a;

    public abxz(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof abya ? new abxy(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
