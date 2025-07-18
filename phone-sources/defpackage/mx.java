package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mx {
    public final long a;
    public final bcb b;
    public ne c;
    public long d;
    public long e;
    public final bhi f;
    private final yjk g;
    private final bcb h;

    public mx(Object obj, bhi bhiVar, ne neVar, long j, long j2, yjk yjkVar) {
        this.f = bhiVar;
        this.a = j2;
        this.g = yjkVar;
        bcz bczVar = bcz.c;
        this.b = new bci(obj, bczVar);
        this.c = hp.i(neVar);
        this.d = j;
        this.e = Long.MIN_VALUE;
        this.h = new bci(true, bczVar);
    }

    public final Object a() {
        return this.b.a();
    }

    public final void b() {
        d();
        this.g.a();
    }

    public final boolean c() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final void d() {
        this.h.b(false);
    }
}
