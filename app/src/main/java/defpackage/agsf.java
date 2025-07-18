package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsf implements Map, Serializable {
    public static final agrz a = new agrz();
    public static final agsf b;
    public Object[] c;
    public Object[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    private int[] j;
    private int k;
    private int l;
    private agsh m;
    private agsi n;
    private agsg o;

    static {
        agsf agsfVar = new agsf(0);
        agsfVar.i = true;
        b = agsfVar;
    }

    public agsf() {
        throw null;
    }

    private final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.l;
    }

    private final void l(boolean z) {
        int i;
        Object[] objArr = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.e;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                Object[] objArr2 = this.c;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.j[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        agry.c(this.c, i3, i);
        if (objArr != null) {
            agry.c(objArr, i3, this.f);
        }
        this.f = i3;
    }

    private final void m(int i) {
        Object[] objArr = this.c;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.h;
        if (i3 < i && i3 + i4 >= i && i4 >= (length >> 2)) {
            l(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > length) {
            int iA = agqd.a.a(length, i5);
            this.c = agry.e(objArr, iA);
            Object[] objArr2 = this.d;
            this.d = objArr2 != null ? agry.e(objArr2, iA) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.e, iA);
            iArrCopyOf.getClass();
            this.e = iArrCopyOf;
            int iA2 = a.a(iA);
            if (iA2 > this.j.length) {
                o(iA2);
            }
        }
    }

    private final void n() {
        this.g++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r3[r0] = r6;
        r5.e[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void o(int r6) {
        /*
            r5 = this;
            r5.n()
            int r0 = r5.f
            int r1 = r5.h
            r2 = 0
            if (r0 <= r1) goto Ld
            r5.l(r2)
        Ld:
            int[] r0 = new int[r6]
            r5.j = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.l = r6
        L19:
            int r6 = r5.f
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.c
            r0 = r0[r2]
            int r0 = r5.k(r0)
            int r1 = r5.k
        L29:
            int[] r3 = r5.j
            r4 = r3[r0]
            if (r4 != 0) goto L37
            r3[r0] = r6
            int[] r1 = r5.e
            r1[r2] = r0
            r2 = r6
            goto L19
        L37:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L45
            int r4 = r0 + (-1)
            if (r0 != 0) goto L43
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L29
        L43:
            r0 = r4
            goto L29
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsf.o(int):void");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.i) {
            return new agsk(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        e();
        while (true) {
            int iK = k(obj);
            int i = this.k;
            int i2 = i + i;
            int length = this.j.length >> 1;
            int i3 = 0;
            while (true) {
                int[] iArr = this.j;
                int i4 = iArr[iK];
                if (i4 <= 0) {
                    int i5 = this.f;
                    Object[] objArr = this.c;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.f = i6;
                        objArr[i5] = obj;
                        this.e[i5] = iK;
                        iArr[iK] = i6;
                        this.h++;
                        n();
                        if (i3 > this.k) {
                            this.k = i3;
                        }
                        return i5;
                    }
                    m(1);
                } else {
                    if (agvy.c(this.c[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > (i2 > length ? length : i2)) {
                        int length2 = this.j.length;
                        o(length2 + length2);
                        break;
                    }
                    iK = iK == 0 ? this.j.length - 1 : iK - 1;
                }
            }
        }
    }

    public final int b(Object obj) {
        int iK = k(obj);
        int i = this.k;
        while (true) {
            int i2 = this.j[iK];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (agvy.c(this.c[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iK = iK == 0 ? this.j.length - 1 : iK - 1;
        }
    }

    public final int c(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.e[i] >= 0) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (agvy.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        e();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.e;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.j[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        agry.c(this.c, 0, this.f);
        Object[] objArr = this.d;
        if (objArr != null) {
            agry.c(objArr, 0, this.f);
        }
        this.h = 0;
        this.f = 0;
        n();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final Map d() {
        e();
        this.i = true;
        if (this.h > 0) {
            return this;
        }
        agsf agsfVar = b;
        agsfVar.getClass();
        return agsfVar;
    }

    public final void e() {
        if (this.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        agsg agsgVar = this.o;
        if (agsgVar != null) {
            return agsgVar;
        }
        agsg agsgVar2 = new agsg(this);
        this.o = agsgVar2;
        return agsgVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.h == map.size() && g(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0021->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.c
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.d
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.e
            r0 = r0[r12]
            int r1 = r11.k
            int r1 = r1 + r1
            int[] r2 = r11.j
            int r2 = r2.length
            int r2 = r2 >> 1
            if (r1 <= r2) goto L1d
            r1 = r2
        L1d:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L21:
            r5 = -1
            if (r0 != 0) goto L29
            int[] r0 = r11.j
            int r0 = r0.length
            int r0 = r0 + r5
            goto L2b
        L29:
            int r0 = r0 + (-1)
        L2b:
            int r4 = r4 + 1
            int r6 = r11.k
            if (r4 <= r6) goto L36
            int[] r0 = r11.j
            r0[r1] = r2
            goto L66
        L36:
            int[] r6 = r11.j
            r7 = r6[r0]
            if (r7 != 0) goto L3f
            r6[r1] = r2
            goto L66
        L3f:
            if (r7 >= 0) goto L46
            r6[r1] = r5
        L43:
            r1 = r0
            r4 = r2
            goto L5f
        L46:
            java.lang.Object[] r6 = r11.c
            int r8 = r7 + (-1)
            r6 = r6[r8]
            int r6 = r11.k(r6)
            int r6 = r6 - r0
            int[] r9 = r11.j
            int r10 = r9.length
            int r10 = r10 + r5
            r6 = r6 & r10
            if (r6 < r4) goto L5f
            r9[r1] = r7
            int[] r4 = r11.e
            r4[r8] = r1
            goto L43
        L5f:
            int r3 = r3 + r5
            if (r3 >= 0) goto L21
            int[] r0 = r11.j
            r0[r1] = r5
        L66:
            int[] r0 = r11.e
            r0[r12] = r5
            int r12 = r11.h
            int r12 = r12 + r5
            r11.h = r12
            r11.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsf.f(int):void");
    }

    public final boolean g(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!h((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[iB];
    }

    public final boolean h(Map.Entry entry) {
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return agvy.c(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final int hashCode() {
        agsa agsaVar = new agsa(this);
        int i = 0;
        while (agsaVar.hasNext()) {
            int i2 = agsaVar.b;
            agsf agsfVar = agsaVar.a;
            if (i2 >= agsfVar.f) {
                throw new NoSuchElementException();
            }
            agsaVar.b = i2 + 1;
            agsaVar.c = i2;
            Object obj = agsfVar.c[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = agsfVar.d;
            objArr.getClass();
            Object obj2 = objArr[agsaVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            agsaVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(Object obj) {
        e();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        f(iB);
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[this.c.length];
        this.d = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        agsh agshVar = this.m;
        if (agshVar != null) {
            return agshVar;
        }
        agsh agshVar2 = new agsh(this);
        this.m = agshVar2;
        return agshVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        e();
        int iA = a(obj);
        Object[] objArrJ = j();
        if (iA >= 0) {
            objArrJ[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArrJ[i];
        objArrJ[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        e();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArrJ = j();
            if (iA >= 0) {
                objArrJ[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!agvy.c(entry.getValue(), objArrJ[i])) {
                    objArrJ[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        e();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        Object obj2 = objArr[iB];
        f(iB);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.h * 3) + 2);
        sb.append("{");
        agsa agsaVar = new agsa(this);
        int i = 0;
        while (agsaVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = agsaVar.b;
            agsf agsfVar = agsaVar.a;
            if (i2 >= agsfVar.f) {
                throw new NoSuchElementException();
            }
            agsaVar.b = i2 + 1;
            agsaVar.c = i2;
            Object obj = agsfVar.c[i2];
            if (obj == agsfVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = agsfVar.d;
            objArr.getClass();
            Object obj2 = objArr[agsaVar.c];
            if (obj2 == agsfVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            agsaVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        agsi agsiVar = this.n;
        if (agsiVar != null) {
            return agsiVar;
        }
        agsi agsiVar2 = new agsi(this);
        this.n = agsiVar2;
        return agsiVar2;
    }

    public agsf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[a.a(i)];
        this.c = objArr;
        this.d = null;
        this.e = iArr;
        this.j = iArr2;
        this.k = 2;
        this.f = 0;
        this.l = Integer.numberOfLeadingZeros(iArr2.length) + 1;
    }
}
