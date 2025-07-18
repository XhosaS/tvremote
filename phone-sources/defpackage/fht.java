package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fht {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fht(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean a(int i) {
        return i == 1 ? this.a - this.b > 1 : this.c - this.d > 1;
    }
}
