package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ywx extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    public transient Object b;
    transient int[] c;
    transient Object[] d;
    transient Object[] e;
    public transient int f;
    public transient int g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public ywx() {
        i(3);
    }

    private final int l(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objE = yxa.e(i2);
        if (i4 != 0) {
            yxa.g(objE, i3 & i5, i4 + 1);
        }
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
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
        this.b = objE;
        m(i5);
        return i5;
    }

    private final void m(int i) {
        this.f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f & (-32));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.b(i, "Invalid size: "));
        }
        i(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itF = f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.g) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (k()) {
            return;
        }
        h();
        Map mapG = g();
        if (mapG != null) {
            this.f = ztm.a(size(), 3, 1073741823);
            mapG.clear();
            this.b = null;
            this.g = 0;
            return;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.g, (Object) null);
        Object[] objArr2 = this.e;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.g, (Object) null);
        Object obj = this.b;
        obj.getClass();
        yxa.f(obj);
        int[] iArr = this.c;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.g, 0);
        this.g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapG = g();
        return mapG != null ? mapG.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsValue(obj);
        }
        for (int i = 0; i < this.g; i++) {
            Object[] objArr = this.e;
            objArr.getClass();
            if (yqs.a(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (k()) {
            return -1;
        }
        int iB = yxv.b(obj);
        int iC = c();
        Object obj2 = this.b;
        obj2.getClass();
        int iC2 = yxa.c(obj2, iB & iC);
        if (iC2 != 0) {
            int i = ~iC;
            int i2 = iB & i;
            do {
                int i3 = iC2 - 1;
                int[] iArr = this.c;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.d;
                    objArr.getClass();
                    if (yqs.a(obj, objArr[i3])) {
                        return i3;
                    }
                }
                iC2 = i4 & iC;
            } while (iC2 != 0);
        }
        return -1;
    }

    public final Object e(Object obj) {
        if (!k()) {
            int iC = c();
            Object obj2 = this.b;
            obj2.getClass();
            int[] iArr = this.c;
            iArr.getClass();
            Object[] objArr = this.d;
            objArr.getClass();
            int iB = yxa.b(obj, null, iC, obj2, iArr, objArr, null);
            if (iB != -1) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                Object obj3 = objArr2[iB];
                j(iB, iC);
                this.g--;
                h();
                return obj3;
            }
        }
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        yws ywsVar = new yws(this);
        this.i = ywsVar;
        return ywsVar;
    }

    final Iterator f() {
        Map mapG = g();
        return mapG != null ? mapG.entrySet().iterator() : new ywq(this);
    }

    final Map g() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        return objArr[iD];
    }

    final void h() {
        this.f += 32;
    }

    final void i(int i) {
        this.f = ztm.a(i, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final void j(int i, int i2) {
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int iB = yxv.b(obj2) & i2;
        int iC = yxa.c(obj, iB);
        if (iC == size) {
            yxa.g(obj, iB, i4);
            return;
        }
        while (true) {
            int i5 = iC - 1;
            int i6 = iArr[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArr[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iC = i7;
        }
    }

    final boolean k() {
        return this.b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        ywu ywuVar = new ywu(this);
        this.h = ywuVar;
        return ywuVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (k()) {
            yqw.M(k(), "Arrays already allocated");
            int i2 = this.f;
            int iD = yxa.d(i2);
            this.b = yxa.e(iD);
            m(iD - 1);
            this.c = new int[i2];
            this.d = new Object[i2];
            this.e = new Object[i2];
        }
        Map mapG = g();
        if (mapG != null) {
            return mapG.put(obj, obj2);
        }
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int i3 = this.g;
        int i4 = i3 + 1;
        int iB = yxv.b(obj);
        int iC = c();
        int i5 = iB & iC;
        Object obj3 = this.b;
        obj3.getClass();
        int iC2 = yxa.c(obj3, i5);
        if (iC2 == 0) {
            if (i4 > iC) {
                iC = l(iC, yxa.a(iC), iB, i3);
            } else {
                Object obj4 = this.b;
                obj4.getClass();
                yxa.g(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~iC;
            int i7 = iB & i6;
            int i8 = 0;
            while (true) {
                int i9 = iC2 - 1;
                int i10 = iArr[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && yqs.a(obj, objArr[i9])) {
                    Object obj5 = objArr2[i9];
                    objArr2[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & iC;
                i8++;
                if (i12 != 0) {
                    iC2 = i12;
                } else {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        int iA = a();
                        while (iA >= 0) {
                            Object[] objArr3 = this.d;
                            objArr3.getClass();
                            Object obj6 = objArr3[iA];
                            Object[] objArr4 = this.e;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[iA]);
                            iA = b(iA);
                        }
                        this.b = linkedHashMap;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        h();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > iC) {
                        iC = l(iC, yxa.a(iC), iB, i3);
                    } else {
                        iArr[i9] = (i4 & iC) | i11;
                    }
                }
            }
        }
        int[] iArr2 = this.c;
        iArr2.getClass();
        int length = iArr2.length;
        if (i4 > length) {
            int i13 = i;
            int iMin = Math.min(1073741823, (Math.max(i13, length >>> 1) + length) | i13);
            if (iMin != length) {
                int[] iArr3 = this.c;
                iArr3.getClass();
                this.c = Arrays.copyOf(iArr3, iMin);
                Object[] objArr5 = this.d;
                objArr5.getClass();
                this.d = Arrays.copyOf(objArr5, iMin);
                Object[] objArr6 = this.e;
                objArr6.getClass();
                this.e = Arrays.copyOf(objArr6, iMin);
            }
        }
        int i14 = (~iC) & iB;
        int[] iArr4 = this.c;
        iArr4.getClass();
        iArr4[i3] = i14;
        Object[] objArr7 = this.d;
        objArr7.getClass();
        objArr7[i3] = obj;
        Object[] objArr8 = this.e;
        objArr8.getClass();
        objArr8[i3] = obj2;
        this.g = i4;
        h();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.remove(obj);
        }
        Object objE = e(obj);
        if (objE == a) {
            return null;
        }
        return objE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapG = g();
        return mapG != null ? mapG.size() : this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        yww ywwVar = new yww(this);
        this.j = ywwVar;
        return ywwVar;
    }

    public ywx(byte[] bArr) {
        i(12);
    }
}
