package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmr {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public fmr(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    private final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        this.e = this.a + i2;
    }

    public fmr(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
