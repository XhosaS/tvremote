package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final dhm g;
    public final boolean h;
    public final boolean i;
    private final int j;

    public dhf(int i, int i2, int i3, boolean z) {
        this.i = z;
        this.a = i2;
        this.b = i3;
        this.c = i;
        this.d = i3 + i3;
        int i4 = i3 * i;
        this.e = i4;
        this.j = i2 - i4;
        this.f = (1 << i) - 1;
        this.g = i == 12 ? new dhk() : new dhl();
        this.h = (i3 & 7) != 0;
    }

    public final int a() {
        if (!this.h) {
            return (this.e * this.j) >> 3;
        }
        int i = this.e;
        return i * ((this.a >> 3) - ((i - 1) >> 3));
    }
}
