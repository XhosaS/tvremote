package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mb implements Collection, Set {
    public int[] a;
    public Object[] b;
    public int c;

    public mb() {
        this(0);
    }

    public final int a(Object obj) {
        return obj == null ? mo.y(this) : mo.x(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iX;
        int i2 = this.c;
        if (obj == null) {
            iX = mo.y(this);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iX = mo.x(this, obj, iHashCode);
        }
        if (iX >= 0) {
            return false;
        }
        int i3 = ~iX;
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
            mo.z(this, i4);
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.a;
            if (iArr2.length != 0) {
                dnx.aU(iArr, iArr2, 0, 0, length);
                dnx.aX(objArr, this.b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            dnx.aU(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.b;
            dnx.aV(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = this.c + collection.size();
        int i = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            mo.z(this, size);
            int i2 = this.c;
            if (i2 > 0) {
                dnx.aU(iArr, this.a, 0, 0, i2);
                dnx.aX(objArr, this.b, 0, this.c, 6);
            }
        }
        if (this.c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
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
                dnx.aU(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.b;
                dnx.aV(objArr2, objArr2, i, i4, i2);
            }
            this.b[i3] = null;
        } else {
            mo.z(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                dnx.aU(iArr, this.a, 0, 0, i);
                dnx.aX(objArr, this.b, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                dnx.aU(iArr, this.a, i, i5, i2);
                dnx.aV(objArr, this.b, i, i5, i2);
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
            this.a = ml.a;
            this.b = ml.b;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
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
    public final Iterator iterator() {
        return new ma(this);
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
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!dnx.aO(collection, this.b[i])) {
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
        Object[] objArr = this.b;
        int i = this.c;
        objArr.getClass();
        int length = objArr.length;
        if (i <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
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

    public mb(int i) {
        this.a = ml.a;
        this.b = ml.b;
        if (i > 0) {
            mo.z(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.c;
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        dnx.aV(this.b, objArr, 0, 0, this.c);
        return objArr;
    }
}
