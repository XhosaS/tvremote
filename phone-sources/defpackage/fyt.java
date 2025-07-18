package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyt implements Iterator, yli {
    final /* synthetic */ fyu a;
    private int b = -1;
    private boolean c;

    public fyt(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < this.a.b.c();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = true;
        fyu fyuVar = this.a;
        int i = this.b + 1;
        this.b = i;
        return (fxb) fyuVar.b.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        fyu fyuVar = this.a;
        int i = this.b;
        kp kpVar = fyuVar.b;
        ((fxb) kpVar.e(i)).c = null;
        kpVar.i(this.b);
        this.b--;
        this.c = false;
    }
}
