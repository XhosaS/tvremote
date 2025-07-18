package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssa {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public ssa(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final double a(double d) {
        return d <= -1.0d ? this.a : d < 0.0d ? sik.e(this.a, this.b, d + 1.0d) : d < 0.5d ? sik.e(this.b, this.c, (d + 0.0d) / 0.5d) : d < 1.0d ? sik.e(this.c, this.d, (d - 0.5d) / 0.5d) : this.d;
    }
}
