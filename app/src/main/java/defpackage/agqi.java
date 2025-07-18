package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqi extends agqf {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d;

    public agqi() {
        this.d = b;
    }

    private final int d(int i) {
        return i == 0 ? agqj.k(this.d) : i - 1;
    }

    private final int e(int i) {
        if (i == agqj.k(this.d)) {
            return 0;
        }
        return i + 1;
    }

    private final int f(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int g(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
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

    private final void i(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            if (i < 10) {
                i = 10;
            }
            this.d = new Object[i];
            return;
        }
        Object[] objArr2 = new Object[agqd.a.a(length, i)];
        agqj.f(objArr, objArr2, 0, this.c, length);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i2 = this.c;
        agqj.f(objArr3, objArr2, length2 - i2, 0, i2);
        this.c = 0;
        this.d = objArr2;
    }

    private final void j(int i, int i2) {
        if (i < i2) {
            Object[] objArr = this.d;
            objArr.getClass();
            Arrays.fill(objArr, i, i2, (Object) null);
            return;
        }
        Object[] objArr2 = this.d;
        int length = objArr2.length;
        objArr2.getClass();
        Arrays.fill(objArr2, i, length, (Object) null);
        Object[] objArr3 = this.d;
        objArr3.getClass();
        Arrays.fill(objArr3, 0, i2, (Object) null);
    }

    private final void k() {
        this.modCount++;
    }

    @Override // defpackage.agqf
    public final int a() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        agqd.a.c(i, this.a);
        if (i == this.a) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        k();
        i(this.a + 1);
        int iG = g(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int iD = d(iG);
            int iD2 = d(this.c);
            int i3 = this.c;
            if (iD >= i3) {
                Object[] objArr = this.d;
                objArr[iD2] = objArr[i3];
                agqj.f(objArr, objArr, i3, i3 + 1, iD + 1);
            } else {
                Object[] objArr2 = this.d;
                agqj.f(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.d;
                objArr3[objArr3.length - 1] = objArr3[0];
                agqj.f(objArr3, objArr3, 0, 1, iD + 1);
            }
            this.d[iD] = obj;
            this.c = iD2;
        } else {
            int iG2 = g(this.c + i2);
            if (iG < iG2) {
                Object[] objArr4 = this.d;
                agqj.f(objArr4, objArr4, iG + 1, iG, iG2);
            } else {
                Object[] objArr5 = this.d;
                agqj.f(objArr5, objArr5, 1, 0, iG2);
                Object[] objArr6 = this.d;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                agqj.f(objArr6, objArr6, iG + 1, iG, length);
            }
            this.d[iG] = obj;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        agqd.a.c(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        k();
        i(this.a + collection.size());
        int iG = g(this.c + this.a);
        int iG2 = g(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (iG2 < i2) {
                Object[] objArr = this.d;
                agqj.f(objArr, objArr, i3, i2, objArr.length);
                if (size >= iG2) {
                    Object[] objArr2 = this.d;
                    agqj.f(objArr2, objArr2, objArr2.length - size, 0, iG2);
                } else {
                    Object[] objArr3 = this.d;
                    agqj.f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.d;
                    agqj.f(objArr4, objArr4, 0, size, iG2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.d;
                agqj.f(objArr5, objArr5, i3, i2, iG2);
            } else {
                Object[] objArr6 = this.d;
                int length = objArr6.length;
                i3 += length;
                int i4 = length - i3;
                if (i4 >= iG2 - i2) {
                    agqj.f(objArr6, objArr6, i3, i2, iG2);
                } else {
                    agqj.f(objArr6, objArr6, i3, i2, i2 + i4);
                    Object[] objArr7 = this.d;
                    agqj.f(objArr7, objArr7, 0, this.c + i4, iG2);
                }
            }
            this.c = i3;
            h(f(iG2 - size), collection);
        } else {
            int i5 = iG2 + size;
            if (iG2 < iG) {
                int i6 = size + iG;
                Object[] objArr8 = this.d;
                int length2 = objArr8.length;
                if (i6 <= length2) {
                    agqj.f(objArr8, objArr8, i5, iG2, iG);
                } else if (i5 >= length2) {
                    agqj.f(objArr8, objArr8, i5 - length2, iG2, iG);
                } else {
                    int i7 = iG - (i6 - length2);
                    agqj.f(objArr8, objArr8, 0, i7, iG);
                    Object[] objArr9 = this.d;
                    agqj.f(objArr9, objArr9, i5, iG2, i7);
                }
            } else {
                Object[] objArr10 = this.d;
                agqj.f(objArr10, objArr10, size, 0, iG);
                Object[] objArr11 = this.d;
                int length3 = objArr11.length;
                if (i5 >= length3) {
                    agqj.f(objArr11, objArr11, i5 - length3, iG2, length3);
                } else {
                    agqj.f(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.d;
                    agqj.f(objArr12, objArr12, i5, iG2, objArr12.length - size);
                }
            }
            h(iG2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        i(this.a + 1);
        int iD = d(this.c);
        this.c = iD;
        this.d[iD] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        k();
        i(this.a + 1);
        this.d[g(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.agqf
    public final Object b(int i) {
        agqd.a.b(i, this.a);
        if (i == agqq.c(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int iG = g(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[iG];
        if (i < (this.a >> 1)) {
            int i2 = this.c;
            if (iG >= i2) {
                agqj.f(objArr, objArr, i2 + 1, i2, iG);
            } else {
                agqj.f(objArr, objArr, 1, 0, iG);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.c;
                agqj.f(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.d;
            int i4 = this.c;
            objArr3[i4] = null;
            this.c = e(i4);
        } else {
            int iG2 = g(this.c + agqq.c(this));
            if (iG <= iG2) {
                Object[] objArr4 = this.d;
                agqj.f(objArr4, objArr4, iG, iG + 1, iG2 + 1);
            } else {
                Object[] objArr5 = this.d;
                agqj.f(objArr5, objArr5, iG, iG + 1, objArr5.length);
                Object[] objArr6 = this.d;
                objArr6[objArr6.length - 1] = objArr6[0];
                agqj.f(objArr6, objArr6, 0, 1, iG2 + 1);
            }
            this.d[iG2] = null;
        }
        this.a--;
        return obj;
    }

    public final Object c() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            j(this.c, g(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        agqd.a.b(i, this.a);
        return this.d[g(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iG = g(this.c + this.a);
        int length = this.c;
        if (length < iG) {
            while (length < iG) {
                if (!agvy.c(obj, this.d[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iG) {
            return -1;
        }
        int length2 = this.d.length;
        while (length < length2) {
            if (!agvy.c(obj, this.d[length])) {
                length++;
            }
        }
        for (int i2 = 0; i2 < iG; i2++) {
            if (agvy.c(obj, this.d[i2])) {
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
        int iK;
        int i;
        int iG = g(this.c + this.a);
        int i2 = this.c;
        if (i2 < iG) {
            iK = iG - 1;
            if (i2 <= iK) {
                while (!agvy.c(obj, this.d[iK])) {
                    if (iK != i2) {
                        iK--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (i2 > iG) {
            for (int i3 = iG - 1; i3 >= 0; i3--) {
                if (agvy.c(obj, this.d[i3])) {
                    iK = i3 + this.d.length;
                    i = this.c;
                    break;
                }
            }
            iK = agqj.k(this.d);
            int i4 = this.c;
            if (i4 <= iK) {
                while (!agvy.c(obj, this.d[iK])) {
                    if (iK != i4) {
                        iK--;
                    }
                }
                i = this.c;
            }
        }
        return -1;
        return iK - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iG;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iG2 = g(this.c + this.a);
        int i = this.c;
        if (i < iG2) {
            iG = i;
            while (i < iG2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[iG] = obj;
                    iG++;
                }
                i++;
            }
            Object[] objArr = this.d;
            objArr.getClass();
            Arrays.fill(objArr, iG, iG2, (Object) null);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.d;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iG = g(i2);
            for (int i3 = 0; i3 < iG2; i3++) {
                Object[] objArr3 = this.d;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[iG] = obj3;
                    iG = e(iG);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        k();
        this.a = f(iG - this.c);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = e(i);
        this.a--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        int iG = g(this.c + agqq.c(this));
        Object[] objArr = this.d;
        Object obj = objArr[iG];
        objArr[iG] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        agqd.a.d(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                b(i);
                return;
            }
            k();
            if (i < this.a - i2) {
                int iG = g(this.c + (i - 1));
                int iG2 = g(this.c + (i2 - 1));
                while (i > 0) {
                    int i4 = iG + 1;
                    int iMin = Math.min(i, Math.min(i4, iG2 + 1));
                    Object[] objArr = this.d;
                    int i5 = iG2 - iMin;
                    int i6 = iG - iMin;
                    agqj.f(objArr, objArr, i5 + 1, i6 + 1, i4);
                    iG = f(i6);
                    iG2 = f(i5);
                    i -= iMin;
                }
                int iG3 = g(this.c + i3);
                j(this.c, iG3);
                this.c = iG3;
            } else {
                int iG4 = g(this.c + i2);
                int iG5 = g(this.c + i);
                int i7 = this.a;
                while (true) {
                    i7 -= i2;
                    if (i7 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = Math.min(i7, Math.min(length - iG4, length - iG5));
                    Object[] objArr2 = this.d;
                    int i8 = iG4 + i2;
                    agqj.f(objArr2, objArr2, iG5, iG4, i8);
                    iG4 = g(i8);
                    iG5 = g(iG5 + i2);
                }
                int iG6 = g(this.c + this.a);
                j(f(iG6 - i3), iG6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iG;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iG2 = g(this.c + this.a);
        int i = this.c;
        if (i < iG2) {
            iG = i;
            while (i < iG2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    this.d[iG] = obj;
                    iG++;
                } else {
                    z = true;
                }
                i++;
            }
            Object[] objArr = this.d;
            objArr.getClass();
            Arrays.fill(objArr, iG, iG2, (Object) null);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.d;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iG = g(i2);
            for (int i3 = 0; i3 < iG2; i3++) {
                Object[] objArr3 = this.d;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[iG] = obj3;
                    iG = e(iG);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        k();
        this.a = f(iG - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        agqd.a.b(i, this.a);
        int iG = g(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
    }

    public agqi(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = b;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(a.b(i, "Illegal Capacity: "));
            }
            objArr = new Object[i];
        }
        this.d = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        objArr.getClass();
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iG = g(this.c + this.a);
        int i2 = this.c;
        if (i2 < iG) {
            agqj.g(this.d, objArr, i2, iG, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            agqj.f(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.d;
            agqj.f(objArr3, objArr, objArr3.length - this.c, 0, iG);
        }
        agqq.b(this.a, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        i(this.a + collection.size());
        h(g(this.c + this.a), collection);
        return true;
    }
}
