package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bas extends awv {
    private final awt j = new awt(0);

    public bas() {
        j(1);
    }

    @Override // defpackage.awv
    protected final int b(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.c ? this.b.c(i) : this.b.c(i) + this.b.d(i);
    }

    @Override // defpackage.awv
    protected final int d(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.c ? this.b.c(i) - this.b.d(i) : this.b.c(i);
    }

    @Override // defpackage.awv
    public final awt f(int i) {
        return this.j;
    }

    @Override // defpackage.awv
    public final boolean l(int i, boolean z) {
        int iC;
        if (this.b.b() == 0) {
            return false;
        }
        if (!z && m(i)) {
            return false;
        }
        int iR = r();
        boolean z2 = false;
        while (iR < this.b.b()) {
            awu awuVar = this.b;
            Object[] objArr = this.a;
            int iA = awuVar.a(iR, true, objArr, false);
            if (this.f < 0 || this.g < 0) {
                iC = true != this.c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f = iR;
                this.g = iR;
            } else {
                int i2 = iR - 1;
                iC = this.c ? (this.b.c(i2) - this.b.d(i2)) - this.d : this.b.c(i2) + this.b.d(i2) + this.d;
                this.g = iR;
            }
            this.b.e(objArr[0], iR, iA, 0, iC);
            if (z || m(i)) {
                return true;
            }
            iR++;
            z2 = true;
        }
        return z2;
    }

    @Override // defpackage.awv
    public final boolean o(int i, boolean z) {
        int iC;
        if (this.b.b() == 0) {
            return false;
        }
        if (!z && n(i)) {
            return false;
        }
        int i2 = ((awx) this.b).a.h;
        int iS = s();
        boolean z2 = false;
        while (iS >= i2) {
            awu awuVar = this.b;
            Object[] objArr = this.a;
            int iA = awuVar.a(iS, false, objArr, false);
            if (this.f < 0 || this.g < 0) {
                iC = true != this.c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f = iS;
                this.g = iS;
            } else {
                int i3 = iS + 1;
                iC = this.c ? this.b.c(i3) + this.d + iA : (this.b.c(i3) - this.d) - iA;
                this.f = iS;
            }
            this.b.e(objArr[0], iS, iA, 0, iC);
            if (z || n(i)) {
                return true;
            }
            iS--;
            z2 = true;
        }
        return z2;
    }

    @Override // defpackage.awv
    public final wj[] p(int i, int i2) {
        wj wjVar = this.h[0];
        wjVar.b = 0;
        wjVar.b(i);
        this.h[0].b(i2);
        return this.h;
    }

    @Override // defpackage.awv
    public final void q(int i, int i2, oe oeVar) {
        int iS;
        int iC;
        if (!this.c ? i2 < 0 : i2 > 0) {
            if (this.g == this.b.b() - 1) {
                return;
            }
            iS = r();
            int iD = this.b.d(this.g) + this.d;
            int iC2 = this.b.c(this.g);
            if (this.c) {
                iD = -iD;
            }
            iC = iD + iC2;
        } else {
            if (this.f == 0) {
                return;
            }
            iS = s();
            iC = this.b.c(this.f) + (this.c ? this.d : -this.d);
        }
        oeVar.a(iS, Math.abs(iC - i));
    }

    final int r() {
        int i = this.g;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.i;
        if (i2 != -1) {
            return Math.min(i2, this.b.b() - 1);
        }
        return 0;
    }

    final int s() {
        int i = this.f;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.i;
        return i2 != -1 ? Math.min(i2, this.b.b() - 1) : this.b.b() - 1;
    }
}
