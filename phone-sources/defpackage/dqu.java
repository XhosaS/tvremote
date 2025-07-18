package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqu {
    public static final dqu a = new dqu(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public dqu(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iW;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int iA = dri.a(i4);
            int iB = dri.b(i4);
            if (iB == 0) {
                iW = dot.W(iA, ((Long) this.d[i3]).longValue());
            } else if (iB == 1) {
                ((Long) this.d[i3]).longValue();
                iW = dot.am(iA);
            } else if (iB == 2) {
                iW = dot.D(iA, (dol) this.d[i3]);
            } else if (iB == 3) {
                int iT = dot.T(iA);
                iW = iT + iT + ((dqu) this.d[i3]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(new dpl());
                }
                ((Integer) this.d[i3]).intValue();
                iW = dot.al(iA);
            }
            i2 += iW;
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
        if (obj == null || !(obj instanceof dqu)) {
            return false;
        }
        dqu dquVar = (dqu) obj;
        int i = this.b;
        return i == dquVar.b && a.U(this.c, dquVar.c, i) && a.T(this.d, dquVar.d, this.b);
    }

    public final void f(dhq dhqVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int iB = dri.b(i2);
                int iA = dri.a(i2);
                if (iB == 0) {
                    dhqVar.k(iA, ((Long) obj).longValue());
                } else if (iB == 1) {
                    dhqVar.g(iA, ((Long) obj).longValue());
                } else if (iB == 2) {
                    dhqVar.c(iA, (dol) obj);
                } else if (iB == 3) {
                    dot dotVar = (dot) dhqVar.a;
                    dotVar.x(iA, 3);
                    ((dqu) obj).f(dhqVar);
                    dotVar.x(iA, 4);
                } else {
                    if (iB != 5) {
                        throw new RuntimeException(new dpl());
                    }
                    dhqVar.f(iA, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + a.R(this.c, i)) * 31) + a.S(this.d, this.b);
    }

    public dqu() {
        this(0, new int[8], new Object[8], true);
    }
}
