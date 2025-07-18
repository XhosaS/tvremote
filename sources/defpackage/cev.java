package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cev implements Iterator {
    final /* synthetic */ cew a;
    private int b = 0;

    public cev(cew cewVar) {
        this.a = cewVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        cew cewVar = this.a;
        if (i >= cewVar.size()) {
            throw new NoSuchElementException();
        }
        cex cexVar = cewVar.b;
        Object obj = cexVar.b[cewVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
