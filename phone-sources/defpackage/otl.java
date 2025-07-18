package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class otl {
    public int f;
    public int g;
    public int h;

    protected abstract int b(boolean z, int i);

    public abstract int c();

    protected void g() {
        k();
        this.f = -1;
        this.g = 0;
    }

    protected abstract boolean h(int i);

    public final int i(int i) {
        int i2 = this.f;
        int iC = c();
        int i3 = this.h;
        int i4 = (i2 == 0 ? 1 : 0) | (iC == i ? 2 : 0);
        if (i3 != -1 && i4 == this.g) {
            return i3;
        }
        int iMax = Math.max(0, b(i3 == -1, i));
        this.h = iMax;
        this.g = i4;
        return iMax;
    }

    public final int j(int i) {
        if (i <= this.f) {
            k();
            return 2;
        }
        if (!h(i)) {
            return 0;
        }
        k();
        return 1;
    }

    public final void k() {
        this.h = -1;
    }

    public void l(int i) {
        this.f += i;
    }
}
