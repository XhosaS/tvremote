package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atn {
    public static final bcp a = new bbl(bcz.c, new anu(20));
    private static final ato b;
    private static final ato c;

    static {
        long j = bnq.g;
        b = new ato(true, Float.NaN, j);
        c = new ato(false, Float.NaN, j);
    }

    public static /* synthetic */ rs a(boolean z, float f, int i) {
        int i2 = i & 2;
        long j = bnq.g;
        if (i2 != 0) {
            f = Float.NaN;
        }
        boolean zB = cma.b(f, Float.NaN);
        int i3 = (z ? 1 : 0) | (i & 1);
        if (zB && a.s(j, j)) {
            return i3 != 0 ? b : c;
        }
        return new ato(1 == i3, f, j);
    }
}
