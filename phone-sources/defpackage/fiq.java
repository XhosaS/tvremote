package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fiq {
    public fel c;
    public fdr d;
    public fin e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public boolean m;
    public final fil b = new fil();
    public hig n = new hig();

    protected abstract long a(edi ediVar);

    protected void b(boolean z) {
        int i;
        if (z) {
            this.n = new hig();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }

    protected abstract boolean c(edi ediVar, long j, hig higVar);

    protected final long e(long j) {
        return (j * 1000000) / this.j;
    }

    protected final long f(long j) {
        return (this.j * j) / 1000000;
    }

    protected void g(long j) {
        this.h = j;
    }
}
