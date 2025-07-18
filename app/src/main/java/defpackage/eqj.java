package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
class eqj implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;

    public eqj(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.a;
        if (it.hasNext()) {
            return new era(((Integer) it.next()).toString());
        }
        Iterator it2 = this.b;
        if (it2.hasNext()) {
            return new era((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
