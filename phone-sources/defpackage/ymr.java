package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymr implements Iterator, yli {
    private int a;
    private final /* synthetic */ int b;
    private final Object c;

    public ymr(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    private final void a() {
        while (this.a > 0) {
            ?? r0 = this.c;
            if (!r0.hasNext()) {
                return;
            }
            r0.next();
            this.a--;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != 0) {
            return this.a < ((Object[]) this.c).length;
        }
        a();
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == 0) {
            a();
            return this.c.next();
        }
        try {
            Object obj = this.c;
            int i = this.a;
            this.a = i + 1;
            return ((Object[]) obj)[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ymr(yms ymsVar, int i) {
        this.b = i;
        this.c = ymsVar.a.a();
        this.a = ymsVar.b;
    }
}
