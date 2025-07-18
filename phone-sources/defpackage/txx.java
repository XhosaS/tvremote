package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txx implements Iterator {
    final /* synthetic */ txy a;
    private int b = 0;

    public txx(txy txyVar) {
        this.a = txyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        txy txyVar = this.a;
        if (i >= txyVar.size()) {
            throw new NoSuchElementException();
        }
        txz txzVar = txyVar.b;
        Object obj = txzVar.b[txyVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
