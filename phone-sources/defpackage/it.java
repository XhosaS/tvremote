package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class it<E> implements Collection<E>, Set<E>, ylj, ylm {
    public int[] a;
    public Object[] b;
    public int c;

    public it() {
        this((byte[]) null);
    }

    public final int a(Object obj) {
        return obj == null ? hw.g(this) : hw.f(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iF;
        int i2 = this.c;
        if (e == null) {
            iF = hw.g(this);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iF = hw.f(this, e, iHashCode);
        }
        if (iF >= 0) {
            return false;
        }
        int i3 = ~iF;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            hw.h(this, i4);
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.a;
            if (iArr2.length != 0) {
                yfm.bm(iArr, iArr2, 0, length, 6);
                yfm.bu(objArr, this.b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            yfm.bh(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.b;
            yfm.bj(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = e;
                this.c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        int size = this.c + collection.size();
        int i = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            hw.h(this, size);
            int i2 = this.c;
            if (i2 > 0) {
                yfm.bm(iArr, this.a, 0, i2, 6);
                yfm.bu(objArr, this.b, 0, this.c, 6);
            }
        }
        if (this.c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        return this.b[i];
    }

    public final void c(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                yfm.bh(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.b;
                yfm.bj(objArr2, objArr2, i, i4, i2);
            }
            this.b[i3] = null;
        } else {
            hw.h(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                yfm.bm(iArr, this.a, 0, i, 6);
                yfm.bu(objArr, this.b, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                yfm.bh(iArr, this.a, i, i5, i2);
                yfm.bj(objArr, this.b, i, i5, i2);
            }
        }
        if (i2 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = ku.a;
            this.b = ku.c;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(b(i2))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new is(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        c(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!yfm.as(collection, this.b[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return yfm.aH(this.b, 0, this.c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objB = b(i2);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public it(int i) {
        this.a = ku.a;
        this.b = ku.c;
        if (i > 0) {
            hw.h(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int i = this.c;
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (length > i) {
            tArr[i] = null;
        }
        yfm.bj(this.b, tArr, 0, 0, this.c);
        return tArr;
    }

    public /* synthetic */ it(byte[] bArr) {
        this(0);
    }

    public it(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
