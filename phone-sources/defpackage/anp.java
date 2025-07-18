package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anp {
    private final bcb a;
    private final bcb b;
    private final bcb c;
    private final bcb d;
    private final bcb e;
    private final bcb f;
    private final bcb g;
    private final bcb h;
    private final bcb i;
    private final bcb j;
    private final bcb k;
    private final bcb l;
    private final bcb m;

    public anp(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        bnq bnqVar = new bnq(j);
        bcz bczVar = bcz.c;
        this.a = new bci(bnqVar, bczVar);
        this.b = new bci(new bnq(j2), bczVar);
        this.c = new bci(new bnq(j3), bczVar);
        this.d = new bci(new bnq(j4), bczVar);
        this.e = new bci(new bnq(j5), bczVar);
        this.f = new bci(new bnq(j6), bczVar);
        this.g = new bci(new bnq(j7), bczVar);
        this.h = new bci(new bnq(j8), bczVar);
        this.i = new bci(new bnq(j9), bczVar);
        this.j = new bci(new bnq(j10), bczVar);
        this.k = new bci(new bnq(j11), bczVar);
        this.l = new bci(new bnq(j12), bczVar);
        this.m = new bci(true, bczVar);
    }

    public final long a() {
        return ((bnq) this.e.a()).h;
    }

    public final long b() {
        return ((bnq) this.g.a()).h;
    }

    public final long c() {
        return ((bnq) this.j.a()).h;
    }

    public final long d() {
        return ((bnq) this.l.a()).h;
    }

    public final long e() {
        return ((bnq) this.h.a()).h;
    }

    public final long f() {
        return ((bnq) this.i.a()).h;
    }

    public final long g() {
        return ((bnq) this.k.a()).h;
    }

    public final long h() {
        return ((bnq) this.a.a()).h;
    }

    public final long i() {
        return ((bnq) this.b.a()).h;
    }

    public final long j() {
        return ((bnq) this.c.a()).h;
    }

    public final long k() {
        return ((bnq) this.d.a()).h;
    }

    public final long l() {
        return ((bnq) this.f.a()).h;
    }

    public final boolean m() {
        return ((Boolean) this.m.a()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) bnq.g(h())) + ", primaryVariant=" + ((Object) bnq.g(i())) + ", secondary=" + ((Object) bnq.g(j())) + ", secondaryVariant=" + ((Object) bnq.g(k())) + ", background=" + ((Object) bnq.g(a())) + ", surface=" + ((Object) bnq.g(l())) + ", error=" + ((Object) bnq.g(b())) + ", onPrimary=" + ((Object) bnq.g(e())) + ", onSecondary=" + ((Object) bnq.g(f())) + ", onBackground=" + ((Object) bnq.g(c())) + ", onSurface=" + ((Object) bnq.g(g())) + ", onError=" + ((Object) bnq.g(d())) + ", isLight=" + m() + ')';
    }
}
