package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tgj {
    public int f;
    public int g;
    public int h;

    protected abstract int b(boolean z, int i);

    public abstract int c();

    protected void g() {
        l();
        this.f = -1;
        this.g = 0;
    }

    protected abstract boolean h(int i);

    public final int j(int i) {
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

    public final int k(int i) {
        if (i <= this.f) {
            l();
            return 2;
        }
        if (!h(i)) {
            return 0;
        }
        l();
        return 1;
    }

    public final void l() {
        this.h = -1;
    }

    public void m(int i) {
        this.f += i;
    }
}
