package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bhd<K, V, T> implements Iterator<T>, yli {
    public Object[] a = bhc.a.b;
    public int b;
    private int c;

    public final Object a() {
        return this.a[this.b];
    }

    public final void b() {
        f();
        this.b++;
    }

    public final void c(Object[] objArr, int i) {
        d(objArr, i, 0);
    }

    public final void d(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.c = i;
        this.b = i2;
    }

    public final boolean e() {
        return this.b < this.c;
    }

    public final boolean f() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return e();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
