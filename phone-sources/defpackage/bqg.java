package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqg extends bqh {
    private final long a;
    private float b = 1.0f;
    private bnr c;

    public bqg(long j) {
        this.a = j;
    }

    @Override // defpackage.bqh
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.bqh
    protected final void b(bpq bpqVar) {
        brx.o(bpqVar, this.a, 0L, 0L, this.b, this.c, 86);
    }

    @Override // defpackage.bqh
    protected final void c(float f) {
        this.b = f;
    }

    @Override // defpackage.bqh
    protected final void d(bnr bnrVar) {
        this.c = bnrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqg)) {
            return false;
        }
        long j = this.a;
        long j2 = ((bqg) obj).a;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    public final int hashCode() {
        long j = bnq.a;
        return a.k(this.a);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) bnq.g(this.a)) + ')';
    }
}
