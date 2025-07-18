package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dga {
    public static final dga a = new dga(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public dga(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iZ;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int iA = dgn.a(i4);
            int iB = dgn.b(i4);
            if (iB == 0) {
                iZ = ddz.Z(iA, ((Long) this.d[i3]).longValue());
            } else if (iB == 1) {
                ((Long) this.d[i3]).longValue();
                iZ = ddz.aq(iA);
            } else if (iB == 2) {
                iZ = ddz.G(iA, (dds) this.d[i3]);
            } else if (iB == 3) {
                int iW = ddz.W(iA);
                iZ = iW + iW + ((dga) this.d[i3]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(new deq());
                }
                ((Integer) this.d[i3]).intValue();
                iZ = ddz.ap(iA);
            }
            i2 += iZ;
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
        if (obj == null || !(obj instanceof dga)) {
            return false;
        }
        dga dgaVar = (dga) obj;
        int i = this.b;
        return i == dgaVar.b && a.U(this.c, dgaVar.c, i) && a.T(this.d, dgaVar.d, this.b);
    }

    public final void f(cxe cxeVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int iB = dgn.b(i2);
                int iA = dgn.a(i2);
                if (iB == 0) {
                    cxeVar.w(iA, ((Long) obj).longValue());
                } else if (iB == 1) {
                    cxeVar.s(iA, ((Long) obj).longValue());
                } else if (iB == 2) {
                    cxeVar.o(iA, (dds) obj);
                } else if (iB == 3) {
                    ddz ddzVar = (ddz) cxeVar.a;
                    ddzVar.z(iA, 3);
                    ((dga) obj).f(cxeVar);
                    ddzVar.z(iA, 4);
                } else {
                    if (iB != 5) {
                        throw new RuntimeException(new deq());
                    }
                    cxeVar.r(iA, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + a.R(this.c, i)) * 31) + a.S(this.d, this.b);
    }

    public dga() {
        this(0, new int[8], new Object[8], true);
    }
}
