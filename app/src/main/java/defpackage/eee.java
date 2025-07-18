package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eee {
    public emk e;
    public tll i;
    private final ebc j = ebc.m;
    private float k = 4.0f;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    private final boolean l = ebc.d;
    private final boolean m = ebc.c;
    public int f = -1;
    public boolean g = false;
    public boolean h = false;

    static {
        boolean z = ebc.a;
    }

    public final eef a() {
        return new eef(this.k, this.i, this.j, this.a, this.c, this.b, this.e, this.l, this.m, this.f, this.g, this.h, this.d);
    }

    public final void b(float f) {
        if (f >= 0.0f) {
            this.k = f;
        } else {
            throw new IllegalArgumentException("Range ratio cannot be negative: " + f);
        }
    }
}
