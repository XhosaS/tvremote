package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygx<E> extends ygs<E> {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d;

    public ygx() {
        this.d = b;
    }

    private final int h(int i) {
        return i == 0 ? yfm.aM(this.d) : i - 1;
    }

    private final int i(int i) {
        if (i == yfm.aM(this.d)) {
            return 0;
        }
        return i + 1;
    }

    private final int j(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int k(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void l(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void m(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            this.d = new Object[ykn.j(i, 10)];
            return;
        }
        Object[] objArr2 = new Object[yfm.bv(length, i)];
        yfm.bj(objArr, objArr2, 0, this.c, length);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i2 = this.c;
        yfm.bj(objArr3, objArr2, length2 - i2, 0, i2);
        this.c = 0;
        this.d = objArr2;
    }

    private final void n(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            yfm.aD(objArr, null, i, i2);
        } else {
            yfm.aD(objArr, null, i, objArr.length);
            yfm.aD(this.d, null, 0, i2);
        }
    }

    private final void o() {
        this.modCount++;
    }

    public final Object a() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        a.aB(i, this.a);
        if (i == this.a) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        o();
        m(this.a + 1);
        int iK = k(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int iH = h(iK);
            int iH2 = h(this.c);
            int i3 = this.c;
            if (iH >= i3) {
                Object[] objArr = this.d;
                objArr[iH2] = objArr[i3];
                yfm.bj(objArr, objArr, i3, i3 + 1, iH + 1);
            } else {
                Object[] objArr2 = this.d;
                yfm.bj(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.d;
                objArr3[objArr3.length - 1] = objArr3[0];
                yfm.bj(objArr3, objArr3, 0, 1, iH + 1);
            }
            this.d[iH] = e;
            this.c = iH2;
        } else {
            int iK2 = k(this.c + i2);
            if (iK < iK2) {
                Object[] objArr4 = this.d;
                yfm.bj(objArr4, objArr4, iK + 1, iK, iK2);
            } else {
                Object[] objArr5 = this.d;
                yfm.bj(objArr5, objArr5, 1, 0, iK2);
                Object[] objArr6 = this.d;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                yfm.bj(objArr6, objArr6, iK + 1, iK, length);
            }
            this.d[iK] = e;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        a.aB(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        o();
        m(this.a + collection.size());
        int iK = k(this.c + this.a);
        int iK2 = k(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (iK2 < i2) {
                Object[] objArr = this.d;
                yfm.bj(objArr, objArr, i3, i2, objArr.length);
                if (size >= iK2) {
                    Object[] objArr2 = this.d;
                    yfm.bj(objArr2, objArr2, objArr2.length - size, 0, iK2);
                } else {
                    Object[] objArr3 = this.d;
                    yfm.bj(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.d;
                    yfm.bj(objArr4, objArr4, 0, size, iK2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.d;
                yfm.bj(objArr5, objArr5, i3, i2, iK2);
            } else {
                Object[] objArr6 = this.d;
                int length = objArr6.length;
                i3 += length;
                int i4 = length - i3;
                if (i4 >= iK2 - i2) {
                    yfm.bj(objArr6, objArr6, i3, i2, iK2);
                } else {
                    yfm.bj(objArr6, objArr6, i3, i2, i2 + i4);
                    Object[] objArr7 = this.d;
                    yfm.bj(objArr7, objArr7, 0, this.c + i4, iK2);
                }
            }
            this.c = i3;
            l(j(iK2 - size), collection);
        } else {
            int i5 = iK2 + size;
            if (iK2 < iK) {
                int i6 = size + iK;
                Object[] objArr8 = this.d;
                int length2 = objArr8.length;
                if (i6 <= length2) {
                    yfm.bj(objArr8, objArr8, i5, iK2, iK);
                } else if (i5 >= length2) {
                    yfm.bj(objArr8, objArr8, i5 - length2, iK2, iK);
                } else {
                    int i7 = iK - (i6 - length2);
                    yfm.bj(objArr8, objArr8, 0, i7, iK);
                    Object[] objArr9 = this.d;
                    yfm.bj(objArr9, objArr9, i5, iK2, i7);
                }
            } else {
                Object[] objArr10 = this.d;
                yfm.bj(objArr10, objArr10, size, 0, iK);
                Object[] objArr11 = this.d;
                int length3 = objArr11.length;
                if (i5 >= length3) {
                    yfm.bj(objArr11, objArr11, i5 - length3, iK2, length3);
                } else {
                    yfm.bj(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.d;
                    yfm.bj(objArr12, objArr12, i5, iK2, objArr12.length - size);
                }
            }
            l(iK2, collection);
        }
        return true;
    }

    public final void addFirst(E e) {
        o();
        m(this.a + 1);
        int iH = h(this.c);
        this.c = iH;
        this.d[iH] = e;
        this.a++;
    }

    public final void addLast(E e) {
        o();
        m(this.a + 1);
        this.d[k(this.c + this.a)] = e;
        this.a++;
    }

    @Override // defpackage.ygs
    public final int b() {
        return this.a;
    }

    public final Object c() {
        if (isEmpty()) {
            return null;
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            n(this.c, k(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ygs
    public final Object d(int i) {
        a.aA(i, this.a);
        if (i == yfm.q(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iK = k(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[iK];
        if (i < (this.a >> 1)) {
            int i2 = this.c;
            if (iK >= i2) {
                yfm.bj(objArr, objArr, i2 + 1, i2, iK);
            } else {
                yfm.bj(objArr, objArr, 1, 0, iK);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.c;
                yfm.bj(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.d;
            int i4 = this.c;
            objArr3[i4] = null;
            this.c = i(i4);
        } else {
            int iK2 = k(this.c + yfm.q(this));
            if (iK <= iK2) {
                Object[] objArr4 = this.d;
                yfm.bj(objArr4, objArr4, iK, iK + 1, iK2 + 1);
            } else {
                Object[] objArr5 = this.d;
                yfm.bj(objArr5, objArr5, iK, iK + 1, objArr5.length);
                Object[] objArr6 = this.d;
                objArr6[objArr6.length - 1] = objArr6[0];
                yfm.bj(objArr6, objArr6, 0, 1, iK2 + 1);
            }
            this.d[iK2] = null;
        }
        this.a--;
        return obj;
    }

    public final Object e() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[k(this.c + yfm.q(this))];
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.d[k(this.c + yfm.q(this))];
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        a.aA(i, this.a);
        return (E) this.d[k(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iK = k(this.c + this.a);
        int length = this.c;
        if (length < iK) {
            while (length < iK) {
                if (!yks.e(obj, this.d[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iK) {
            return -1;
        }
        int length2 = this.d.length;
        while (length < length2) {
            if (!yks.e(obj, this.d[length])) {
                length++;
            }
        }
        for (int i2 = 0; i2 < iK; i2++) {
            if (yks.e(obj, this.d[i2])) {
                length = i2 + this.d.length;
                i = this.c;
                return length - i;
            }
        }
        return -1;
        i = this.c;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iAM;
        int i;
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            iAM = iK - 1;
            if (i2 <= iAM) {
                while (!yks.e(obj, this.d[iAM])) {
                    if (iAM != i2) {
                        iAM--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (i2 > iK) {
            for (int i3 = iK - 1; i3 >= 0; i3--) {
                if (yks.e(obj, this.d[i3])) {
                    iAM = i3 + this.d.length;
                    i = this.c;
                    break;
                }
            }
            iAM = yfm.aM(this.d);
            int i4 = this.c;
            if (i4 <= iAM) {
                while (!yks.e(obj, this.d[iAM])) {
                    if (iAM != i4) {
                        iAM--;
                    }
                }
                i = this.c;
            }
        }
        return -1;
        return iAM - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iK;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (i < iK2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[iK] = obj;
                    iK++;
                }
                i++;
            }
            yfm.aD(this.d, null, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                Object[] objArr2 = this.d;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[iK] = obj3;
                    iK = i(iK);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.d;
        int i = this.c;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.c = i(i);
        this.a--;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iK = k(this.c + yfm.q(this));
        Object[] objArr = this.d;
        E e = (E) objArr[iK];
        objArr[iK] = null;
        this.a--;
        return e;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a.aC(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            o();
            if (i < this.a - i2) {
                int iK = k(this.c + (i - 1));
                int iK2 = k(this.c + (i2 - 1));
                while (i > 0) {
                    int i4 = iK + 1;
                    int iMin = Math.min(i, Math.min(i4, iK2 + 1));
                    Object[] objArr = this.d;
                    int i5 = iK2 - iMin;
                    int i6 = iK - iMin;
                    yfm.bj(objArr, objArr, i5 + 1, i6 + 1, i4);
                    iK = j(i6);
                    iK2 = j(i5);
                    i -= iMin;
                }
                int iK3 = k(this.c + i3);
                n(this.c, iK3);
                this.c = iK3;
            } else {
                int iK4 = k(this.c + i2);
                int iK5 = k(this.c + i);
                int i7 = this.a;
                while (true) {
                    i7 -= i2;
                    if (i7 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = Math.min(i7, Math.min(length - iK4, length - iK5));
                    Object[] objArr2 = this.d;
                    int i8 = iK4 + i2;
                    yfm.bj(objArr2, objArr2, iK5, iK4, i8);
                    iK4 = k(i8);
                    iK5 = k(iK5 + i2);
                }
                int iK6 = k(this.c + this.a);
                n(j(iK6 - i3), iK6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iK;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (i < iK2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    this.d[iK] = obj;
                    iK++;
                } else {
                    z = true;
                }
                i++;
            }
            yfm.aD(this.d, null, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                Object[] objArr2 = this.d;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[iK] = obj3;
                    iK = i(iK);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a.aA(i, this.a);
        int iK = k(this.c + i);
        Object[] objArr = this.d;
        E e2 = (E) objArr[iK];
        objArr[iK] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
    }

    public ygx(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = b;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(a.cf(i, "Illegal Capacity: "));
            }
            objArr = new Object[i];
        }
        this.d = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) throws NegativeArraySizeException {
        tArr.getClass();
        int length = tArr.length;
        int i = this.a;
        if (length < i) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            yfm.bu(this.d, tArr, i2, iK, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.d;
            yfm.bj(objArr, tArr, 0, i2, objArr.length);
            Object[] objArr2 = this.d;
            yfm.bj(objArr2, tArr, objArr2.length - this.c, 0, iK);
        }
        yfm.y(this.a, tArr);
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        m(this.a + collection.size());
        l(k(this.c + this.a), collection);
        return true;
    }
}
