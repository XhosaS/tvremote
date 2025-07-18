package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ko<K, V> {
    private int[] a;
    private Object[] b;
    public int d;

    public ko() {
        this((byte[]) null);
    }

    private final int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = ku.a(this.a, i2, i);
        if (iA < 0 || yks.e(obj, this.b[iA + iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (yks.e(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (yks.e(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int iA = ku.a(this.a, i, 0);
        if (iA < 0 || this.b[iA + iA] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int b(Object obj) {
        int i = this.d;
        int i2 = i + i;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (yks.e(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int c(Object obj) {
        return obj == null ? j() : a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.d > 0) {
            this.a = ku.a;
            this.b = ku.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(K k) {
        return c(k) >= 0;
    }

    public final boolean containsValue(V v) {
        return b(v) >= 0;
    }

    public final Object d(int i) {
        if (i < 0 || i >= this.d) {
            kv.a(a.cf(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i];
    }

    public Object e(int i) {
        if (i < 0 || i >= this.d) {
            kv.a(a.cf(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i3 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                yfm.bh(iArr, iArr, i, i5, i3);
                Object[] objArr2 = this.b;
                yfm.bj(objArr2, objArr2, i2, i5 + i5, i3 + i3);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 + i4;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i7 + i7);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                yfm.bh(iArr, this.a, 0, 0, i);
                yfm.bj(objArr, this.b, 0, 0, i2);
            }
            if (i < i4) {
                int i8 = i + 1;
                yfm.bh(iArr, this.a, i, i8, i3);
                yfm.bj(objArr, this.b, i2, i8 + i8, i3 + i3);
            }
        }
        if (i3 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i4;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ko) {
                int i = this.d;
                ko koVar = (ko) obj;
                if (i != koVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object objD = d(i2);
                    Object objG = g(i2);
                    Object obj2 = koVar.get(objD);
                    if (objG == null) {
                        if (obj2 != null || !koVar.containsKey(objD)) {
                            return false;
                        }
                    } else if (!yks.e(objG, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objD2 = d(i4);
                Object objG2 = g(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(objD2);
                if (objG2 == null) {
                    if (obj3 != null || !map.containsKey(objD2)) {
                        return false;
                    }
                } else if (!yks.e(objG2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            kv.a(a.cf(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object g(int i) {
        if (i < 0 || i >= this.d) {
            kv.a(a.cf(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i + 1];
    }

    public final V get(K k) {
        int iC = c(k);
        if (iC >= 0) {
            return (V) this.b[iC + iC + 1];
        }
        return null;
    }

    public final V getOrDefault(Object obj, V v) {
        int iC = c(obj);
        return iC >= 0 ? (V) this.b[iC + iC + 1] : v;
    }

    public final void h(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i + i);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(ko koVar) {
        int i = koVar.d;
        h(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(koVar.d(i2), koVar.g(i2));
            }
        } else if (i > 0) {
            yfm.bh(koVar.a, this.a, 0, 0, i);
            yfm.bj(koVar.b, this.b, 0, 0, i + i);
            this.d = i;
        }
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k, V v) {
        int i = this.d;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iA = k != null ? a(k, iHashCode) : j();
        if (iA >= 0) {
            int i2 = iA + iA + 1;
            Object[] objArr = this.b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iA;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i4 + i4);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            yfm.bh(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            int i6 = this.d;
            yfm.bj(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.d;
        if (i == i7) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i8 = i3 + i3;
                objArr3[i8] = k;
                objArr3[i8 + 1] = v;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final V remove(K k) {
        int iC = c(k);
        if (iC >= 0) {
            return (V) e(iC);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iC = c(k);
        if (iC >= 0) {
            return (V) f(iC, v);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objD = d(i2);
            if (objD != sb) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ko(int i) {
        this.a = i == 0 ? ku.a : new int[i];
        this.b = i == 0 ? ku.c : new Object[i + i];
    }

    public final boolean remove(K k, V v) {
        int iC = c(k);
        if (iC < 0 || !yks.e(v, g(iC))) {
            return false;
        }
        e(iC);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iC = c(k);
        if (iC < 0 || !yks.e(v, g(iC))) {
            return false;
        }
        f(iC, v2);
        return true;
    }

    public /* synthetic */ ko(byte[] bArr) {
        this(0);
    }

    public ko(ko koVar) {
        this((byte[]) null);
        if (koVar != null) {
            i(koVar);
        }
    }
}
