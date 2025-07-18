package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kaa {
    public static final kaa c;

    static {
        c(1, Double.valueOf(0.0d));
        c(3, null);
        c(4, null);
        c = c(5, null);
        c(2, Double.valueOf(1.0d));
    }

    static kaa c(int i, Double d) {
        if (d == null) {
            d = Double.valueOf(0.0d);
        }
        return new jys(i, d.doubleValue());
    }

    public abstract double a();

    public abstract int b();
}
