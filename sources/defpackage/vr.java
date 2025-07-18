package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vr {
    public boolean b;
    public int c;
    public int d;
    protected md[] g;
    public byj i;
    public final Object[] a = new Object[1];
    public int e = -1;
    public int f = -1;
    public int h = -1;

    public final int a(boolean z, int[] iArr) {
        return b(z, this.b ? this.e : this.f, iArr);
    }

    protected abstract int b(boolean z, int i, int[] iArr);

    public final int c(boolean z, int[] iArr) {
        return d(z, this.b ? this.f : this.e, iArr);
    }

    protected abstract int d(boolean z, int i, int[] iArr);

    public final int e(int i) {
        vq vqVarF = f(i);
        if (vqVarF == null) {
            return -1;
        }
        return vqVarF.a;
    }

    public abstract vq f(int i);

    public void g(int i) {
        int i2;
        if (i >= 0 && (i2 = this.f) >= 0) {
            if (i2 >= i) {
                this.f = i - 1;
            }
            i();
            if (this.e < 0) {
                this.h = i;
            }
        }
    }

    public final void h() {
        this.f = -1;
        this.e = -1;
    }

    public final void i() {
        if (this.f < this.e) {
            h();
        }
    }

    public final void j(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.d == i) {
            return;
        }
        this.d = i;
        this.g = new md[i];
        for (int i2 = 0; i2 < this.d; i2++) {
            this.g[i2] = new md();
        }
    }

    public final boolean k() {
        return l(true != this.b ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    public abstract boolean l(int i, boolean z);

    protected final boolean m(int i) {
        if (this.f < 0) {
            return false;
        }
        if (this.b) {
            if (c(true, null) <= i + this.c) {
                return true;
            }
        } else if (a(false, null) >= i - this.c) {
            return true;
        }
        return false;
    }

    protected final boolean n(int i) {
        if (this.f < 0) {
            return false;
        }
        if (this.b) {
            if (a(false, null) >= i - this.c) {
                return true;
            }
        } else if (c(true, null) <= i + this.c) {
            return true;
        }
        return false;
    }

    public abstract md[] o(int i, int i2);

    public abstract void q(int i);

    public void p(int i, int i2, hk hkVar) {
    }
}
