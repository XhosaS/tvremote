package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class awv {
    public awu b;
    public boolean c;
    public int d;
    public int e;
    protected wj[] h;
    public final Object[] a = new Object[1];
    public int f = -1;
    public int g = -1;
    public int i = -1;

    public final int a(boolean z, int[] iArr) {
        return b(z, this.c ? this.f : this.g, iArr);
    }

    protected abstract int b(boolean z, int i, int[] iArr);

    public final int c(boolean z, int[] iArr) {
        return d(z, this.c ? this.g : this.f, iArr);
    }

    protected abstract int d(boolean z, int i, int[] iArr);

    public final int e(int i) {
        awt awtVarF = f(i);
        if (awtVarF == null) {
            return -1;
        }
        return awtVarF.a;
    }

    public abstract awt f(int i);

    public void g(int i) {
        int i2;
        if (i >= 0 && (i2 = this.g) >= 0) {
            if (i2 >= i) {
                this.g = i - 1;
            }
            i();
            if (this.f < 0) {
                this.i = i;
            }
        }
    }

    public final void h() {
        this.g = -1;
        this.f = -1;
    }

    public final void i() {
        if (this.g < this.f) {
            h();
        }
    }

    public final void j(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.e == i) {
            return;
        }
        this.e = i;
        this.h = new wj[i];
        for (int i2 = 0; i2 < this.e; i2++) {
            this.h[i2] = new wj();
        }
    }

    public final boolean k() {
        return l(true != this.c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    public abstract boolean l(int i, boolean z);

    protected final boolean m(int i) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (c(true, null) <= i + this.d) {
                return true;
            }
        } else if (a(false, null) >= i - this.d) {
            return true;
        }
        return false;
    }

    protected final boolean n(int i) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (a(false, null) >= i - this.d) {
                return true;
            }
        } else if (c(true, null) <= i + this.d) {
            return true;
        }
        return false;
    }

    public abstract boolean o(int i, boolean z);

    public abstract wj[] p(int i, int i2);

    public void q(int i, int i2, oe oeVar) {
    }
}
