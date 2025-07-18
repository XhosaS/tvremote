package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gdp implements Cloneable {
    public final int a;
    public final int b;
    public final int c;
    public final double d;

    public gdp(int i, int i2, int i3, double d) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = d;
    }

    protected final Object clone() {
        return new gdp(this.a, this.b, this.c, this.d);
    }
}
