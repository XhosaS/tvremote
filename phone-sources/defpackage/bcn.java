package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bcn {
    public static final int a(ja jaVar) {
        int iA;
        int iA2 = jaVar.a(0);
        while (jaVar.b != 0 && jaVar.a(0) == iA2) {
            jaVar.f(0, jaVar.b());
            jaVar.e(jaVar.b - 1);
            int i = jaVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iA3 = jaVar.a(i3);
                int i4 = i3 + 1;
                int i5 = i4 + i4;
                int i6 = i5 - 1;
                int iA4 = jaVar.a(i6);
                if (i5 >= i || (iA = jaVar.a(i5)) <= iA4) {
                    if (iA4 > iA3) {
                        jaVar.f(i3, iA4);
                        jaVar.f(i6, iA3);
                        i3 = i6;
                    }
                } else if (iA > iA3) {
                    jaVar.f(i3, iA);
                    jaVar.f(i5, iA3);
                    i3 = i5;
                }
            }
        }
        return iA2;
    }

    public static final void b(ja jaVar, int i) {
        if (jaVar.b == 0 || !(jaVar.a(0) == i || jaVar.a(jaVar.b - 1) == i)) {
            int i2 = jaVar.b;
            jaVar.d(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = jaVar.a(i3);
                if (i <= iA) {
                    break;
                }
                jaVar.f(i2, iA);
                i2 = i3;
            }
            jaVar.f(i2, i);
        }
    }

    public static final boolean c(ja jaVar) {
        return jaVar.b != 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
