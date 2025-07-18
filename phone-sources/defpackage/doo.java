package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class doo {
    private static volatile int a = 100;
    public static final /* synthetic */ int h = 0;
    int e;
    final int f = a;
    public dop g;

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract void j(int i);

    public abstract void k(int i);

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o(int i);

    public final void x() throws dpm {
        int iH;
        do {
            iH = h();
            if (iH == 0) {
                return;
            }
            int i = this.e;
            if (i >= this.f) {
                throw new dpm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.e = i + 1;
            this.e--;
        } while (o(iH));
    }
}
