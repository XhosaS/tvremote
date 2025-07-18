package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fai implements faf {
    private final double a;
    private long b;

    public fai(double d) {
        this.a = d;
        this.b = Long.MIN_VALUE;
    }

    @Override // defpackage.faf
    public final long a() {
        return this.b;
    }

    @Override // defpackage.faf
    public final void b(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.b == Long.MIN_VALUE) {
            this.b = j3;
        } else {
            double dPow = Math.pow(this.a, Math.sqrt(j));
            this.b = (long) ((this.b * dPow) + ((1.0d - dPow) * j3));
        }
    }

    @Override // defpackage.faf
    public final void c() {
        this.b = Long.MIN_VALUE;
    }

    public fai() {
        this(0.9999d);
    }
}
