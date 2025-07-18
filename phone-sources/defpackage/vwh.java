package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwh {
    public static final vwh a = new vwh(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public vwh(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iAd;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int iA = vwq.a(i4);
            int iB = vwq.b(i4);
            if (iB == 0) {
                iAd = vtj.ad(iA, ((Long) this.d[i3]).longValue());
            } else if (iB == 1) {
                ((Long) this.d[i3]).longValue();
                iAd = vtj.aw(iA);
            } else if (iB == 2) {
                iAd = vtj.H(iA, (vsz) this.d[i3]);
            } else if (iB == 3) {
                int iAa = vtj.aa(iA);
                iAd = iAa + iAa + ((vwh) this.d[i3]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(new vup());
                }
                ((Integer) this.d[i3]).intValue();
                iAd = vtj.av(iA);
            }
            i2 += iAd;
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
        if (obj == null || !(obj instanceof vwh)) {
            return false;
        }
        vwh vwhVar = (vwh) obj;
        int i = this.b;
        return i == vwhVar.b && a.U(this.c, vwhVar.c, i) && a.T(this.d, vwhVar.d, this.b);
    }

    public final void f(ulp ulpVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int iB = vwq.b(i2);
                int iA = vwq.a(i2);
                if (iB == 0) {
                    ulpVar.I(iA, ((Long) obj).longValue());
                } else if (iB == 1) {
                    ulpVar.E(iA, ((Long) obj).longValue());
                } else if (iB == 2) {
                    ulpVar.A(iA, (vsz) obj);
                } else if (iB == 3) {
                    vtj vtjVar = (vtj) ulpVar.a;
                    vtjVar.B(iA, 3);
                    ((vwh) obj).f(ulpVar);
                    vtjVar.B(iA, 4);
                } else {
                    if (iB != 5) {
                        throw new RuntimeException(new vup());
                    }
                    ulpVar.D(iA, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + a.R(this.c, i)) * 31) + a.S(this.d, this.b);
    }

    public vwh() {
        this(0, new int[8], new Object[8], true);
    }
}
