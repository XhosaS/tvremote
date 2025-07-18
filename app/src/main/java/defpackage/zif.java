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
public class zif extends AbstractMap {
    public static final Comparator a = new zic();
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, zif] */
    /* JADX WARN: Type inference failed for: r0v1, types: [zif] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public zif(zif zifVar, zif zifVar2) {
        int i;
        Object objC;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.d = new zie(abstractMap, -1);
        abstractMap.e = null;
        abstractMap.f = null;
        int size = zifVar.size() + zifVar2.size();
        int i2 = zifVar.c[zifVar.size()] + zifVar2.c[zifVar2.size()];
        int i3 = size + 1;
        Object[] objArr2 = new Object[i2];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        Map.Entry entryB = zifVar.b(0);
        Map.Entry entryB2 = zifVar2.b(0);
        int i5 = 0;
        int i6 = 0;
        int iA = size;
        Map.Entry entryB3 = entryB;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (entryB3 == null && entryB2 == null) {
                break;
            }
            int i9 = i7 + 1;
            if (entryB3 != null) {
                if (entryB2 != null) {
                    int iCompareTo = ((String) entryB3.getKey()).compareTo((String) entryB2.getKey());
                    if (iCompareTo == 0) {
                        int i10 = i5 + 1;
                        int i11 = i6 + 1;
                        objArr2[i7] = abstractMap.c((String) entryB3.getKey(), i7);
                        zie zieVar = (zie) entryB3.getValue();
                        zie zieVar2 = (zie) entryB2.getValue();
                        int i12 = 0;
                        int i13 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i12 >= zieVar.a() - zieVar.b() && i13 >= zieVar2.a() - zieVar2.b()) {
                                break;
                            }
                            int iCompare = i12 == zieVar.a() - zieVar.b() ? i8 : i13 == zieVar2.a() - zieVar2.b() ? -1 : 0;
                            iCompare = iCompare == 0 ? zih.a.compare(zieVar.c(i12), zieVar2.c(i13)) : iCompare;
                            if (iCompare < 0) {
                                i = i12 + 1;
                                objC = zieVar.c(i12);
                            } else {
                                int i14 = i13 + 1;
                                Object objC2 = zieVar2.c(i13);
                                i13 = i14;
                                i = iCompare == 0 ? i12 + 1 : i12;
                                objC = objC2;
                            }
                            objArr2[iA] = objC;
                            i12 = i;
                            iA++;
                            i8 = 1;
                            abstractMap = this;
                        }
                        iArr[i9] = iA;
                        entryB3 = zifVar.b(i11);
                        entryB2 = zifVar2.b(i10);
                        i6 = i11;
                        i5 = i10;
                        i7 = i9;
                        i4 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i7 = i9;
                        i4 = 0;
                        abstractMap = this;
                    }
                }
                i6++;
                iA = a(entryB3, i7, iA, objArr2, iArr);
                entryB3 = zifVar.b(i6);
                i7 = i9;
                i4 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryB3;
            i5++;
            int iA2 = a(entryB2, i7, iA, objArr2, iArr);
            entryB2 = zifVar2.b(i5);
            iA = iA2;
            entryB3 = entry;
            i7 = i9;
            i4 = 0;
            abstractMap = this;
        }
        int i15 = iArr[i4];
        int i16 = i15 - i7;
        if (i16 != 0) {
            for (int i17 = i4; i17 <= i7; i17++) {
                iArr[i17] = iArr[i17] - i16;
            }
            int i18 = iArr[i7];
            int i19 = i18 - i7;
            if (d(i2, i18)) {
                objArr = new Object[i18];
                System.arraycopy(objArr2, i4, objArr, i4, i7);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i15, objArr, i7, i19);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i20 = iArr[i4] + 1;
        abstractMap.c = d(i3, i20) ? Arrays.copyOf(iArr, i20) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        zie zieVar = (zie) entry.getValue();
        int iA = zieVar.a() - zieVar.b();
        System.arraycopy(zieVar.b.b, zieVar.b(), objArr, i2, iA);
        objArr[i] = c((String) entry.getKey(), i);
        int i3 = i2 + iA;
        iArr[i + 1] = i3;
        return i3;
    }

    private final Map.Entry b(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry c(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new zie(this, i));
    }

    private static boolean d(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
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

    public zif(List list) {
        this.d = new zie(this, -1);
        this.e = null;
        this.f = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = d(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            String str = ((zib) it2.next()).a;
            throw null;
        }
        String str2 = ((zib) it.next()).a;
        throw null;
    }
}
