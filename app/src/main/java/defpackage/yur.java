package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yur implements Iterator {
    final Iterator a;
    Collection b = null;
    Iterator c = zam.a;
    final /* synthetic */ yve d;

    public yur(yve yveVar) {
        this.d = yveVar;
        this.a = yveVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.b = collection;
            this.c = collection.iterator();
        }
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
        Collection collection = this.b;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        yve yveVar = this.d;
        yveVar.b--;
    }
}
