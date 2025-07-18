package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdu {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final boolean b(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void c(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        this.b[i] = i2;
    }
}
