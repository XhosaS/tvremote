package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ync implements Iterator, yli {
    final /* synthetic */ ynb a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ymw] */
    public ync(ynb ynbVar) {
        this.a = ynbVar;
        this.b = ynbVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
