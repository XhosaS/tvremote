package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bto extends btq {
    public final int a(int i) {
        int iE = e(16);
        if (iE != 0) {
            return this.b.getInt(f(iE) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        int iE = e(16);
        if (iE != 0) {
            return g(iE);
        }
        return 0;
    }

    public final int c() {
        int iE = e(4);
        if (iE != 0) {
            return this.b.getInt(iE + this.a);
        }
        return 0;
    }

    public final short d() {
        int iE = e(14);
        if (iE != 0) {
            return this.b.getShort(iE + this.a);
        }
        return (short) 0;
    }
}
