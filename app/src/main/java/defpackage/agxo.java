package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxo implements Iterator {
    final /* synthetic */ agxp a;
    private final Iterator b;
    private Iterator c;
    private int d;

    public agxo(agxp agxpVar) {
        this.a = agxpVar;
        this.b = agxpVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Iterator] */
    private final boolean a() {
        ?? A;
        Iterator it = this.c;
        if (it != null && it.hasNext()) {
            this.d = 1;
            return true;
        }
        do {
            Iterator it2 = this.b;
            if (!it2.hasNext()) {
                this.d = 2;
                this.c = null;
                return false;
            }
            Object next = it2.next();
            agxp agxpVar = this.a;
            oyi oyiVar = (oyi) next;
            oyiVar.getClass();
            A = agxpVar.b.a(oyiVar.d.d());
        } while (!A.hasNext());
        this.c = A;
        this.d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 2) {
            throw new NoSuchElementException();
        }
        if (i == 0 && !a()) {
            throw new NoSuchElementException();
        }
        this.d = 0;
        Iterator it = this.c;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
