package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wi extends vr {
    private final vq j = new vq(0);

    public wi() {
        j(1);
    }

    @Override // defpackage.vr
    protected final int b(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.b ? this.i.m(i) : this.i.m(i) + this.i.o(i);
    }

    @Override // defpackage.vr
    protected final int d(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.b ? this.i.m(i) - this.i.o(i) : this.i.m(i);
    }

    @Override // defpackage.vr
    public final vq f(int i) {
        return this.j;
    }

    @Override // defpackage.vr
    public final boolean l(int i, boolean z) {
        int iM;
        if (this.i.l() == 0) {
            return false;
        }
        if (!z && m(i)) {
            return false;
        }
        int iR = r();
        boolean z2 = false;
        while (iR < this.i.l()) {
            byj byjVar = this.i;
            Object[] objArr = this.a;
            int iK = byjVar.k(iR, true, objArr, false);
            if (this.e < 0 || this.f < 0) {
                iM = true != this.b ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.e = iR;
                this.f = iR;
            } else {
                int i2 = iR - 1;
                iM = this.b ? (this.i.m(i2) - this.i.o(i2)) - this.c : this.i.m(i2) + this.i.o(i2) + this.c;
                this.f = iR;
            }
            this.i.q(objArr[0], iK, 0, iM);
            if (z || m(i)) {
                return true;
            }
            iR++;
            z2 = true;
        }
        return z2;
    }

    @Override // defpackage.vr
    public final md[] o(int i, int i2) {
        this.g[0].d();
        this.g[0].c(i);
        this.g[0].c(i2);
        return this.g;
    }

    @Override // defpackage.vr
    public final void p(int i, int i2, hk hkVar) {
        int iS;
        int iM;
        if (!this.b ? i2 < 0 : i2 > 0) {
            if (this.f == this.i.l() - 1) {
                return;
            }
            iS = r();
            int iO = this.i.o(this.f) + this.c;
            int iM2 = this.i.m(this.f);
            if (this.b) {
                iO = -iO;
            }
            iM = iO + iM2;
        } else {
            if (this.e == 0) {
                return;
            }
            iS = s();
            iM = this.i.m(this.e) + (this.b ? this.c : -this.c);
        }
        hkVar.a(iS, Math.abs(iM - i));
    }

    @Override // defpackage.vr
    public final void q(int i) {
        int iM;
        if (this.i.l() == 0 || n(i)) {
            return;
        }
        int iN = this.i.n();
        for (int iS = s(); iS >= iN; iS--) {
            byj byjVar = this.i;
            Object[] objArr = this.a;
            int iK = byjVar.k(iS, false, objArr, false);
            if (this.e < 0 || this.f < 0) {
                iM = true != this.b ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.e = iS;
                this.f = iS;
            } else {
                int i2 = iS + 1;
                iM = this.b ? this.i.m(i2) + this.c + iK : (this.i.m(i2) - this.c) - iK;
                this.e = iS;
            }
            this.i.q(objArr[0], iK, 0, iM);
            if (n(i)) {
                return;
            }
        }
    }

    final int r() {
        int i = this.f;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.h;
        if (i2 != -1) {
            return Math.min(i2, this.i.l() - 1);
        }
        return 0;
    }

    final int s() {
        int i = this.e;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.h;
        return i2 != -1 ? Math.min(i2, this.i.l() - 1) : this.i.l() - 1;
    }
}
