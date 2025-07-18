package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acab {
    public static final acab a = new acab(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public acab(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iH;
        int I;
        int iH2;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.d[i3]).longValue();
                    iH2 = abvz.H(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    abvo abvoVar = (abvo) this.d[i3];
                    int iH3 = abvz.H(i7);
                    int iD = abvoVar.d();
                    iH2 = iH3 + abvz.H(iD) + iD;
                } else if (i6 == 3) {
                    int iH4 = abvz.H(i5 << 3);
                    iH = iH4 + iH4;
                    I = ((acab) this.d[i3]).a();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new abxu());
                    }
                    ((Integer) this.d[i3]).intValue();
                    iH2 = abvz.H(i5 << 3) + 4;
                }
                i2 += iH2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.d[i3]).longValue();
                iH = abvz.H(i8);
                I = abvz.I(jLongValue);
            }
            iH2 = iH + I;
            i2 += iH2;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof acab)) {
            return false;
        }
        acab acabVar = (acab) obj;
        int i = this.b;
        if (i == acabVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = acabVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = acabVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void f(abwa abwaVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    abwaVar.a.y(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    abwaVar.a.l(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    abwaVar.a.h(i4, (abvo) obj);
                } else if (i3 == 3) {
                    abvz abvzVar = abwaVar.a;
                    abvzVar.v(i4, 3);
                    ((acab) obj).f(abwaVar);
                    abvzVar.v(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new abxu());
                    }
                    abwaVar.a.j(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public acab() {
        this(0, new int[8], new Object[8], true);
    }
}
