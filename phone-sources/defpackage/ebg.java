package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebg {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(3);
    public static final String d = edt.Z(4);
    public final int e;
    public final eba f;
    public final boolean g;
    public final int[] h;
    public final boolean[] i;

    public ebg(eba ebaVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = ebaVar.c;
        this.e = i;
        a.H(i == iArr.length && i == zArr.length);
        this.f = ebaVar;
        this.g = z && i > 1;
        this.h = (int[]) iArr.clone();
        this.i = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f.e;
    }

    public final dze b(int i) {
        return this.f.c(i);
    }

    public final boolean c(int i) {
        return this.i[i];
    }

    public final boolean d(int i) {
        return this.h[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ebg ebgVar = (ebg) obj;
            if (this.g == ebgVar.g && this.f.equals(ebgVar.f) && Arrays.equals(this.h, ebgVar.h) && Arrays.equals(this.i, ebgVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f.hashCode() * 31) + (this.g ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + Arrays.hashCode(this.i);
    }
}
