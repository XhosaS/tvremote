package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mi {
    public int[] d;
    public Object[] e;
    public int f;

    public mi() {
        this((byte[]) null);
    }

    private final int g(Object obj, int i) {
        int i2 = this.f;
        if (i2 == 0) {
            return -1;
        }
        int iA = ml.a(this.d, i2, i);
        if (iA < 0 || dnx.aB(obj, this.e[iA + iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.d[i3] == i) {
            if (dnx.aB(obj, this.e[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.d[i4] == i; i4--) {
            if (dnx.aB(obj, this.e[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int h() {
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        int iA = ml.a(this.d, i, 0);
        if (iA < 0 || this.e[iA + iA] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.d[i2] == 0) {
            if (this.e[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.d[i3] == 0; i3--) {
            if (this.e[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int a(Object obj) {
        int i = this.f;
        int i2 = i + i;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (dnx.aB(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int b(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    public final Object c(int i) {
        if (i < 0 || i >= this.f) {
            mo.u(b.e(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.e[i + i];
    }

    public final void clear() {
        if (this.f > 0) {
            this.d = ml.a;
            this.e = ml.b;
            this.f = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final Object d(int i) {
        if (i < 0 || i >= this.f) {
            mo.u(b.e(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.e;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.f;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.d;
        int length = iArr.length;
        if (length <= 8 || i3 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                dnx.aU(iArr, iArr, i, i5, i3);
                Object[] objArr2 = this.e;
                dnx.aV(objArr2, objArr2, i2, i5 + i5, i3 + i3);
            }
            Object[] objArr3 = this.e;
            int i6 = i4 + i4;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, i7 + i7);
            objArrCopyOf.getClass();
            this.e = objArrCopyOf;
            if (i3 != this.f) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                dnx.aU(iArr, this.d, 0, 0, i);
                dnx.aV(objArr, this.e, 0, 0, i2);
            }
            if (i < i4) {
                int i8 = i + 1;
                dnx.aU(iArr, this.d, i, i8, i3);
                dnx.aV(objArr, this.e, i2, i8 + i8, i3 + i3);
            }
        }
        if (i3 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i4;
        return obj;
    }

    public final Object e(int i, Object obj) {
        if (i < 0 || i >= this.f) {
            mo.u(b.e(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.e;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof mi) {
                int i = this.f;
                mi miVar = (mi) obj;
                if (i != miVar.f) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object objC = c(i2);
                    Object objF = f(i2);
                    Object obj2 = miVar.get(objC);
                    if (objF == null) {
                        if (obj2 != null || !miVar.containsKey(objC)) {
                            return false;
                        }
                    } else if (!dnx.aB(objF, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objC2 = c(i4);
                Object objF2 = f(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(objC2);
                if (objF2 == null) {
                    if (obj3 != null || !map.containsKey(objC2)) {
                        return false;
                    }
                } else if (!dnx.aB(objF2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.f) {
            mo.u(b.e(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.e[i + i + 1];
    }

    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.e[iB + iB + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iB = b(obj);
        return iB >= 0 ? this.e[iB + iB + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.d;
        Object[] objArr = this.e;
        int i = this.f;
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

    public final boolean isEmpty() {
        return this.f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iG = obj != null ? g(obj, iHashCode) : h();
        if (iG >= 0) {
            int i2 = iG + iG + 1;
            Object[] objArr = this.e;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iG;
        int[] iArr = this.d;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, i4 + i4);
            objArrCopyOf.getClass();
            this.e = objArrCopyOf;
            if (i != this.f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.d;
            int i5 = i3 + 1;
            dnx.aU(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.e;
            int i6 = this.f;
            dnx.aV(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.f;
        if (i == i7) {
            int[] iArr3 = this.d;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.e;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f = i7 + 1;
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
        int iB = b(obj);
        if (iB >= 0) {
            return d(iB);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iB = b(obj);
        if (iB >= 0) {
            return e(iB, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objC = c(i2);
            if (objC != sb) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public mi(int i) {
        this.d = i == 0 ? ml.a : new int[i];
        this.e = i == 0 ? ml.b : new Object[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iB = b(obj);
        if (iB < 0 || !dnx.aB(obj2, f(iB))) {
            return false;
        }
        d(iB);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iB = b(obj);
        if (iB < 0 || !dnx.aB(obj2, f(iB))) {
            return false;
        }
        e(iB, obj3);
        return true;
    }

    public /* synthetic */ mi(byte[] bArr) {
        this(0);
    }
}
