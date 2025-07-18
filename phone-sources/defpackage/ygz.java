package defpackage;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygz implements Iterator, yli {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ygz(Enumeration enumeration, int i) {
        this.b = i;
        this.a = enumeration;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Enumeration] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != 0 ? this.a.hasNext() : this.a.hasMoreElements();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Enumeration] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.b != 0 ? this.a.next() : this.a.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ygz(Iterator it, int i) {
        this.b = i;
        it.getClass();
        this.a = it;
    }
}
