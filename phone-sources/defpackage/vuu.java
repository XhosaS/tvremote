package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuu implements Iterator {
    private final Iterator a;

    public vuu(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof vuv ? new vut(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
