package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqf extends bqh {
    private final long c;
    private final long d;
    private float e;
    private bnr f;
    private final bng g;
    private final long b = 0;
    public int a = 1;

    public bqf(bng bngVar, long j) {
        int i;
        int i2;
        this.g = bngVar;
        this.c = j;
        if (cmf.a(0L) < 0 || cmf.b(0L) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > bngVar.c() || i2 > bngVar.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = j;
        this.e = 1.0f;
    }

    @Override // defpackage.bqh
    public final long a() {
        return clw.y(this.d);
    }

    @Override // defpackage.bqh
    protected final void b(bpq bpqVar) {
        brx.q(bpqVar, this.g, this.c, (Math.round(Float.intBitsToFloat((int) (bpqVar.n() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bpqVar.n() & 4294967295L))) & 4294967295L), this.e, this.f, this.a, 328);
    }

    @Override // defpackage.bqh
    protected final void c(float f) {
        this.e = f;
    }

    @Override // defpackage.bqh
    protected final void d(bnr bnrVar) {
        this.f = bnrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqf)) {
            return false;
        }
        bqf bqfVar = (bqf) obj;
        if (!yks.e(this.g, bqfVar.g)) {
            return false;
        }
        long j = bqfVar.b;
        return a.s(0L, 0L) && a.s(this.c, bqfVar.c) && a.r(this.a, bqfVar.a);
    }

    public final int hashCode() {
        return (((((this.g.hashCode() * 31) + a.k(0L)) * 31) + a.k(this.c)) * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.g);
        sb.append(", srcOffset=");
        sb.append((Object) cmf.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) cmh.a(this.c));
        sb.append(", filterQuality=");
        int i = this.a;
        sb.append((Object) (a.r(i, 0) ? "None" : a.r(i, 1) ? "Low" : a.r(i, 2) ? "Medium" : a.r(i, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
