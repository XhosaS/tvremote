package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdv {
    public final long a;
    public long b;
    public int c;
    public final eub d;
    private final int e;

    public jdv(eub eubVar, long j, int i, long j2, int i2) {
        this.d = eubVar;
        this.a = j;
        this.e = i;
        this.b = j2;
        this.c = i2;
    }

    public final float a() {
        long j = this.a;
        if (j != -1 && j != 0) {
            return (this.b * 100.0f) / j;
        }
        int i = this.e;
        if (i == 0) {
            return -1.0f;
        }
        return (this.c * 100.0f) / i;
    }

    public final void b(long j) {
        long j2 = this.b + j;
        this.b = j2;
        this.d.b(this.a, j2, a());
    }
}
