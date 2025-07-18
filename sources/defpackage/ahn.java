package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahn {
    public aho a;
    public aho b;
    public ahi c;
    public aes[] d;
    public int f;
    private final Runnable g = new om(3);
    public boolean e = true;

    public final bzt a() {
        qp.k(this.a != null, "Must set register function");
        qp.k(this.b != null, "Must set unregister function");
        qp.k(this.c != null, "Must set holder");
        qp.q(this.c.b, "Key must not be null");
        return new bzt(new ahm(this, this.c, this.d, this.e, this.f), new byj(this, null), this.g, (char[]) null);
    }
}
