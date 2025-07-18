package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ywz extends AbstractSet implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    ywz() {
        e(3);
    }

    private final int g() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int h(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objE = yxa.e(i2);
        if (i4 != 0) {
            yxa.g(objE, i3 & i5, i4 + 1);
        }
        Object obj = this.c;
        obj.getClass();
        int[] iArr = this.d;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int iC = yxa.c(obj, i6);
            while (iC != 0) {
                int i7 = iC - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iC2 = yxa.c(objE, i10);
                yxa.g(objE, i10, iC);
                iArr[i7] = ((~i5) & i9) | (iC2 & i5);
                iC = i8 & i;
            }
        }
        this.c = objE;
        i(i5);
        return i5;
    }

    private final void i(int i) {
        this.b = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.b & (-32));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.b(i, "Invalid size: "));
        }
        e(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (f()) {
            yqw.M(f(), "Arrays already allocated");
            int i = this.b;
            int iD = yxa.d(i);
            this.c = yxa.e(iD);
            i(iD - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set setC = c();
        if (setC != null) {
            return setC.add(obj);
        }
        int[] iArr = this.d;
        iArr.getClass();
        Object[] objArr = this.a;
        objArr.getClass();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iB = yxv.b(obj);
        int iG = g();
        int i4 = iB & iG;
        Object obj2 = this.c;
        obj2.getClass();
        int iC = yxa.c(obj2, i4);
        if (iC != 0) {
            int i5 = ~iG;
            int i6 = iB & i5;
            int i7 = 0;
            while (true) {
                int i8 = iC - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && yqs.a(obj, objArr[i8])) {
                    return false;
                }
                int i11 = i9 & iG;
                i7++;
                if (i11 != 0) {
                    iC = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(g() + 1, 1.0f);
                        int iA = a();
                        while (iA >= 0) {
                            Object[] objArr2 = this.a;
                            objArr2.getClass();
                            linkedHashSet.add(objArr2[iA]);
                            iA = b(iA);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        d();
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > iG) {
                        iG = h(iG, yxa.a(iG), iB, i2);
                    } else {
                        iArr[i8] = (i3 & iG) | i10;
                    }
                }
            }
        } else if (i3 > iG) {
            iG = h(iG, yxa.a(iG), iB, i2);
        } else {
            Object obj3 = this.c;
            obj3.getClass();
            yxa.g(obj3, i4, i3);
        }
        int[] iArr2 = this.d;
        iArr2.getClass();
        int length = iArr2.length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.d;
            iArr3.getClass();
            this.d = Arrays.copyOf(iArr3, iMin);
            Object[] objArr3 = this.a;
            objArr3.getClass();
            this.a = Arrays.copyOf(objArr3, iMin);
        }
        int i12 = (~iG) & iB;
        int[] iArr4 = this.d;
        iArr4.getClass();
        iArr4[i2] = i12;
        Object[] objArr4 = this.a;
        objArr4.getClass();
        objArr4[i2] = obj;
        this.e = i3;
        d();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    final Set c() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (f()) {
            return;
        }
        d();
        Set setC = c();
        if (setC != null) {
            this.b = ztm.a(size(), 3, 1073741823);
            setC.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Object[] objArr = this.a;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.e, (Object) null);
        Object obj = this.c;
        obj.getClass();
        yxa.f(obj);
        int[] iArr = this.d;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (f()) {
            return false;
        }
        Set setC = c();
        if (setC != null) {
            return setC.contains(obj);
        }
        int iB = yxv.b(obj);
        int iG = g();
        Object obj2 = this.c;
        obj2.getClass();
        int iC = yxa.c(obj2, iB & iG);
        if (iC != 0) {
            int i = ~iG;
            int i2 = iB & i;
            do {
                int i3 = iC - 1;
                int[] iArr = this.d;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.a;
                    objArr.getClass();
                    if (yqs.a(obj, objArr[i3])) {
                        return true;
                    }
                }
                iC = i4 & iG;
            } while (iC != 0);
        }
        return false;
    }

    final void d() {
        this.b += 32;
    }

    final void e(int i) {
        this.b = ztm.a(i, 1, 1073741823);
    }

    final boolean f() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setC = c();
        return setC != null ? setC.iterator() : new ywy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!f()) {
            Set setC = c();
            if (setC != null) {
                return setC.remove(obj);
            }
            int iG = g();
            Object obj2 = this.c;
            obj2.getClass();
            int[] iArr = this.d;
            iArr.getClass();
            Object[] objArr = this.a;
            objArr.getClass();
            int iB = yxa.b(obj, null, iG, obj2, iArr, objArr, null);
            if (iB != -1) {
                Object obj3 = this.c;
                obj3.getClass();
                int[] iArr2 = this.d;
                iArr2.getClass();
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int size = size();
                int i3 = size - 1;
                if (iB < i3) {
                    int i4 = iB + 1;
                    Object obj4 = objArr2[i3];
                    objArr2[iB] = obj4;
                    objArr2[i3] = null;
                    iArr2[iB] = iArr2[i3];
                    iArr2[i3] = 0;
                    int iB2 = yxv.b(obj4) & iG;
                    int iC = yxa.c(obj3, iB2);
                    if (iC == size) {
                        yxa.g(obj3, iB2, i4);
                    } else {
                        while (true) {
                            i = iC - 1;
                            i2 = iArr2[i];
                            int i5 = i2 & iG;
                            if (i5 == size) {
                                break;
                            }
                            iC = i5;
                        }
                        iArr2[i] = (i2 & (~iG)) | (i4 & iG);
                    }
                } else {
                    objArr2[iB] = null;
                    iArr2[iB] = 0;
                }
                this.e--;
                d();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setC = c();
        return setC != null ? setC.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (f()) {
            return new Object[0];
        }
        Set setC = c();
        if (setC != null) {
            return setC.toArray();
        }
        Object[] objArr = this.a;
        objArr.getClass();
        return Arrays.copyOf(objArr, this.e);
    }

    public ywz(int i) {
        e(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (f()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setC = c();
        if (setC != null) {
            return setC.toArray(objArr);
        }
        Object[] objArr2 = this.a;
        objArr2.getClass();
        int i = this.e;
        yqw.K(0, i, objArr2.length);
        int length = objArr.length;
        if (length < i) {
            objArr = zcb.a(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return objArr;
    }
}
