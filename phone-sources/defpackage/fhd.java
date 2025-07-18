package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhd extends fdh implements fhh {
    public final long a;
    public final int b;
    public final int c;
    private final long d;

    public fhd(long j, long j2, int i, int i2) {
        super(j, j2, i, i2);
        long j3 = j;
        this.a = j2;
        this.b = i;
        this.c = i2;
        this.d = j3 == -1 ? -1L : j3;
    }

    @Override // defpackage.fhh
    public final int d() {
        return this.b;
    }

    @Override // defpackage.fhh
    public final long e() {
        return this.d;
    }

    @Override // defpackage.fhh
    public final long f(long j) {
        return w(j);
    }
}
