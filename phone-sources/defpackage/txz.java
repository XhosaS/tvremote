package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txz extends AbstractMap {
    public static final Comparator a = new qbi(8);
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, txz] */
    /* JADX WARN: Type inference failed for: r0v1, types: [txz] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public txz(txz txzVar, txz txzVar2) {
        int i;
        Object objC;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.d = new txy(abstractMap, -1);
        abstractMap.e = null;
        abstractMap.f = null;
        int size = txzVar.size() + txzVar2.size();
        int iB = txzVar.b() + txzVar2.b();
        int i2 = size + 1;
        Object[] objArr2 = new Object[iB];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = txzVar.c(0);
        Map.Entry entryC2 = txzVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        Map.Entry entryC3 = entryC;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (entryC3 == null && entryC2 == null) {
                break;
            }
            int i8 = i6 + 1;
            if (entryC3 != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC3.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i9 = i4 + 1;
                        int i10 = i5 + 1;
                        objArr2[i6] = abstractMap.d((String) entryC3.getKey(), i6);
                        txy txyVar = (txy) entryC3.getValue();
                        txy txyVar2 = (txy) entryC2.getValue();
                        int i11 = 0;
                        int i12 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i11 >= txyVar.size() && i12 >= txyVar2.size()) {
                                break;
                            }
                            int iCompare = i11 == txyVar.size() ? i7 : i12 == txyVar2.size() ? -1 : 0;
                            iCompare = iCompare == 0 ? tyb.a.compare(txyVar.c(i11), txyVar2.c(i12)) : iCompare;
                            if (iCompare < 0) {
                                i = i11 + 1;
                                objC = txyVar.c(i11);
                            } else {
                                int i13 = i12 + 1;
                                Object objC2 = txyVar2.c(i12);
                                i12 = i13;
                                i = iCompare == 0 ? i11 + 1 : i11;
                                objC = objC2;
                            }
                            objArr2[iA] = objC;
                            i11 = i;
                            iA++;
                            i7 = 1;
                            abstractMap = this;
                        }
                        iArr[i8] = iA;
                        entryC3 = txzVar.c(i9);
                        entryC2 = txzVar2.c(i10);
                        i5 = i10;
                        i4 = i9;
                        i6 = i8;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i6 = i8;
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i4++;
                iA = a(entryC3, i6, iA, objArr2, iArr);
                entryC3 = txzVar.c(i4);
                i6 = i8;
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC3;
            i5++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = txzVar2.c(i5);
            iA = iA2;
            entryC3 = entry;
            i6 = i8;
            i3 = 0;
            abstractMap = this;
        }
        int i14 = iArr[i3];
        int i15 = i14 - i6;
        if (i15 != 0) {
            for (int i16 = i3; i16 <= i6; i16++) {
                iArr[i16] = iArr[i16] - i15;
            }
            int i17 = iArr[i6];
            int i18 = i17 - i6;
            if (e(iB, i17)) {
                objArr = new Object[i17];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i14, objArr, i6, i18);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i19 = iArr[i3] + 1;
        abstractMap.c = e(i2, i19) ? Arrays.copyOf(iArr, i19) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        txy txyVar = (txy) entry.getValue();
        int iA = txyVar.a() - txyVar.b();
        System.arraycopy(txyVar.b.b, txyVar.b(), objArr, i2, iA);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + iA;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new txy(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Set<Object>>> entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(super.hashCode());
        }
        return this.e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }

    public txz(List list) {
        this.d = new txy(this, -1);
        this.e = null;
        this.f = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            Object obj = ((ulp) it2.next()).a;
            throw null;
        }
        Object obj2 = ((ulp) it.next()).a;
        throw null;
    }
}
