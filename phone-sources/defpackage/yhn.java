package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhn<E> implements ListIterator<E>, yli {
    private int a;
    private int b;
    private int c;
    private final /* synthetic */ int d;
    private final Object e;

    public yhn(bje bjeVar, int i, int i2) {
        this.d = i2;
        this.e = bjeVar;
        this.c = i - 1;
        this.a = -1;
        this.b = bjf.a(bjeVar);
    }

    private final void a() {
        if (((yho) this.e).d.modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (bjf.a((bje) this.e) != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    private final void c() {
        if (((yhp) this.e).modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.d;
        if (i == 0) {
            a();
            int i2 = this.a;
            this.a = i2 + 1;
            yho yhoVar = (yho) this.e;
            yhoVar.add(i2, obj);
            this.b = -1;
            this.c = yhoVar.modCount;
            return;
        }
        if (i != 1) {
            c();
            int i3 = this.a;
            this.a = i3 + 1;
            yhp yhpVar = (yhp) this.e;
            yhpVar.add(i3, obj);
            this.b = -1;
            this.c = yhpVar.modCount;
            return;
        }
        b();
        int i4 = this.c + 1;
        bje bjeVar = (bje) this.e;
        bjeVar.add(i4, obj);
        this.a = -1;
        this.c++;
        this.b = bjf.a(bjeVar);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 0) {
            return this.a < ((yho) this.e).c;
        }
        if (i != 1) {
            return this.a < ((yhp) this.e).c;
        }
        return this.c < ((bje) this.e).a() + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        return i != 0 ? i != 1 ? this.a > 0 : this.c >= 0 : this.a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0) {
            a();
            Object obj = this.e;
            int i2 = this.a;
            yho yhoVar = (yho) obj;
            if (i2 >= yhoVar.c) {
                throw new NoSuchElementException();
            }
            this.a = i2 + 1;
            this.b = i2;
            return yhoVar.a[yhoVar.b + i2];
        }
        if (i == 1) {
            b();
            int i3 = this.c + 1;
            this.a = i3;
            bje bjeVar = (bje) this.e;
            bjf.c(i3, bjeVar.a());
            Object obj2 = bjeVar.get(i3);
            this.c = i3;
            return obj2;
        }
        c();
        Object obj3 = this.e;
        int i4 = this.a;
        yhp yhpVar = (yhp) obj3;
        if (i4 >= yhpVar.c) {
            throw new NoSuchElementException();
        }
        this.a = i4 + 1;
        this.b = i4;
        return yhpVar.b[i4];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.d;
        return i != 0 ? i != 1 ? this.a : this.c + 1 : this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        if (i == 0) {
            a();
            int i2 = this.a;
            if (i2 <= 0) {
                throw new NoSuchElementException();
            }
            int i3 = i2 - 1;
            this.a = i3;
            this.b = i3;
            yho yhoVar = (yho) this.e;
            return yhoVar.a[yhoVar.b + i3];
        }
        if (i != 1) {
            c();
            int i4 = this.a;
            if (i4 <= 0) {
                throw new NoSuchElementException();
            }
            int i5 = i4 - 1;
            this.a = i5;
            this.b = i5;
            return ((yhp) this.e).b[i5];
        }
        b();
        bje bjeVar = (bje) this.e;
        bjf.c(this.c, bjeVar.a());
        int i6 = this.c;
        this.a = i6;
        this.c--;
        return bjeVar.get(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        return (i == 0 || i != 1) ? this.a - 1 : this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.d;
        if (i == 0) {
            a();
            int i2 = this.b;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            Object obj = this.e;
            ((ygs) obj).d(i2);
            this.a = this.b;
            this.b = -1;
            this.c = ((yho) obj).modCount;
            return;
        }
        if (i == 1) {
            b();
            int i3 = this.c;
            bje bjeVar = (bje) this.e;
            bjeVar.b(i3);
            this.c--;
            this.a = -1;
            this.b = bjf.a(bjeVar);
            return;
        }
        c();
        int i4 = this.b;
        if (i4 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        Object obj2 = this.e;
        ((ygs) obj2).d(i4);
        this.a = this.b;
        this.b = -1;
        this.c = ((yhp) obj2).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.d;
        if (i == 0) {
            a();
            int i2 = this.b;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((yho) this.e).set(i2, obj);
            return;
        }
        if (i != 1) {
            c();
            int i3 = this.b;
            if (i3 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((yhp) this.e).set(i3, obj);
            return;
        }
        b();
        int i4 = this.a;
        if (i4 < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        bje bjeVar = (bje) this.e;
        bjeVar.set(i4, obj);
        this.b = bjf.a(bjeVar);
    }

    public yhn(yho yhoVar, int i, int i2) {
        this.d = i2;
        this.e = yhoVar;
        this.a = i;
        this.b = -1;
        this.c = yhoVar.modCount;
    }

    public yhn(yhp yhpVar, int i, int i2) {
        this.d = i2;
        this.e = yhpVar;
        this.a = i;
        this.b = -1;
        this.c = yhpVar.modCount;
    }
}
