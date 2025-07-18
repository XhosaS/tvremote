package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymv implements Iterator, yli {
    final /* synthetic */ ynb a;
    private Object b;
    private int c = -2;

    public ymv(ynb ynbVar) {
        this.a = ynbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjk] */
    private final void a() {
        Object objA;
        if (this.c == -2) {
            objA = this.a.b.a();
        } else {
            ynb ynbVar = this.a;
            Object obj = this.b;
            obj.getClass();
            objA = ynbVar.a.a(obj);
        }
        this.b = objA;
        this.c = objA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
