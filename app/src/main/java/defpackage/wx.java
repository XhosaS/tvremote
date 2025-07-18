package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wx {
    private int[] a;
    private Object[] b;
    public int d;

    public wx() {
        throw null;
    }

    private final int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = xa.a(this.a, i2, i);
        if (iA < 0 || agvy.c(obj, this.b[iA + iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (agvy.c(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (agvy.c(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int b() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int iA = xa.a(this.a, i, 0);
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

    public final int c(Object obj) {
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
            if (agvy.c(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.d > 0) {
            this.a = xa.a;
            this.b = xa.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? b() : a(obj, obj.hashCode());
    }

    public final Object e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException(a.b(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof wx) {
                int i = this.d;
                wx wxVar = (wx) obj;
                if (i != wxVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object objE = e(i2);
                    Object objH = h(i2);
                    Object obj2 = wxVar.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !wxVar.containsKey(objE)) {
                            return false;
                        }
                    } else if (!agvy.c(objH, obj2)) {
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
                Object objE2 = e(i4);
                Object objH2 = h(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !map.containsKey(objE2)) {
                        return false;
                    }
                } else if (!agvy.c(objH2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException(a.b(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                agqj.e(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.b;
                agqj.f(objArr2, objArr2, i3, i5 + i5, i2 + i2);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 + i4;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i7 + i7);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                agqj.e(iArr, this.a, 0, 0, i);
                agqj.f(objArr, this.b, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                agqj.e(iArr, this.a, i, i8, i2);
                agqj.f(objArr, this.b, i3, i8 + i8, i2 + i2);
            }
        }
        if (i2 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i4;
        return obj;
    }

    public Object g(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException(a.b(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.b[iD + iD + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.b[iD + iD + 1] : obj2;
    }

    public final Object h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException(a.b(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i + 1];
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

    public final void i(int i) {
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

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public void j(wx wxVar) {
        int i = wxVar.d;
        i(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(wxVar.e(i2), wxVar.h(i2));
            }
        } else if (i > 0) {
            agqj.e(wxVar.a, this.a, 0, 0, i);
            agqj.f(wxVar.b, this.b, 0, 0, i + i);
            this.d = i;
        }
    }

    public Object put(Object obj, Object obj2) {
        int i = this.d;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iA = obj != null ? a(obj, iHashCode) : b();
        if (iA >= 0) {
            int i2 = iA + iA + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
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
            agqj.e(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            int i6 = this.d;
            agqj.f(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.d;
        if (i == i7) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return f(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD, obj2);
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
            Object objE = e(i2);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public wx(int i) {
        this.a = i == 0 ? xa.a : new int[i];
        this.b = i == 0 ? xa.c : new Object[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !agvy.c(obj2, h(iD))) {
            return false;
        }
        f(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !agvy.c(obj2, h(iD))) {
            return false;
        }
        g(iD, obj3);
        return true;
    }
}
