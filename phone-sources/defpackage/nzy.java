package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzy {
    public nzz a;
    public nzz b;
    public nzt c;
    public nvg[] d;
    public int f;
    private final Runnable g = new ehq(7);
    public boolean e = true;

    public final jzs a() {
        ocv.au(this.a != null, "Must set register function");
        ocv.au(this.b != null, "Must set unregister function");
        ocv.au(this.c != null, "Must set holder");
        ocv.aG(this.c.b, "Key must not be null");
        return new jzs(new nzx(this, this.c, this.d, this.e, this.f), new pku(this), this.g, (byte[]) null);
    }
}
