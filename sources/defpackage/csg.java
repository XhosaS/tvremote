package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
class csg implements Iterator {
    public int a;
    final /* synthetic */ csj b;

    public csg(csj csjVar) {
        this.b = csjVar;
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
        csj csjVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return csjVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        ii.U();
    }
}
