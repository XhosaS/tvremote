package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lwq implements kum {
    public final int a;
    public final List b;
    public final String c;
    public final int[] d;
    public final tju e;

    public lwq(int i, List list, String str, tju tjuVar, int[] iArr) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.e = tjuVar;
        this.d = iArr;
    }

    public final int b(int i) {
        int[] iArr = this.d;
        if (iArr == null) {
            return -1;
        }
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            int i2 = ~iBinarySearch;
            if ((i2 & 1) != 1) {
                if (i2 > 0) {
                    return iArr[i2 - 1];
                }
                return -1;
            }
        }
        return i;
    }

    public final boolean c(int i) {
        return b(i) == i;
    }

    @Override // defpackage.kum
    public final String dX() {
        return Integer.toString(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwq)) {
            return false;
        }
        lwq lwqVar = (lwq) obj;
        if (this.a != lwqVar.a || !this.b.equals(lwqVar.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? lwqVar.c != null : !str.equals(lwqVar.c)) {
            return false;
        }
        tju tjuVar = this.e;
        if (tjuVar == null ? lwqVar.e == null : tjuVar.equals(lwqVar.e)) {
            return Arrays.equals(this.d, lwqVar.d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.a * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31;
        tju tjuVar = this.e;
        int iHashCode3 = (iHashCode2 + (tjuVar != null ? tjuVar.hashCode() : 0)) * 31;
        int[] iArr = this.d;
        return iHashCode3 + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    public lwq(int i, String str, tju tjuVar, int[] iArr) {
        this.a = i;
        this.b = Collections.singletonList(Integer.valueOf(i));
        this.c = str;
        this.e = tjuVar;
        this.d = iArr;
    }
}
