package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfy<T> implements ListIterator<T>, yli {
    private final List a;
    private int b;
    private final /* synthetic */ int c;

    public bfy(List list, int i, int i2) {
        this.c = i2;
        this.a = list;
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.c == 0) {
            this.a.add(this.b, obj);
            this.b++;
        } else {
            int i = this.b + 1;
            this.b = i;
            this.a.add(i, obj);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0 ? this.b < this.a.size() + (-1) : this.b < this.a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c != 0 ? this.b >= 0 : this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.c != 0) {
            int i = this.b + 1;
            this.b = i;
            return this.a.get(i);
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return this.a.get(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c != 0 ? this.b + 1 : this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.c != 0) {
            int i = this.b;
            this.b = i - 1;
            return this.a.get(i);
        }
        int i2 = this.b - 1;
        this.b = i2;
        return this.a.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c != 0 ? this.b : this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.c != 0) {
            this.a.remove(this.b);
            this.b--;
        } else {
            int i = this.b - 1;
            this.b = i;
            this.a.remove(i);
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.c != 0) {
            this.a.set(this.b, obj);
        } else {
            this.a.set(this.b, obj);
        }
    }

    public bfy(List list, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = list;
        this.b = i - 1;
    }
}
