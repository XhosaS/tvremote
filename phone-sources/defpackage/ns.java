package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ns implements nq {
    private final int a;
    private final nl b;
    private final long c;
    private final long d;

    public ns(int i, int i2, nl nlVar) {
        this.a = i;
        this.b = nlVar;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ pn a(bhi bhiVar) {
        return f();
    }

    @Override // defpackage.nq
    public final /* synthetic */ float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.nq
    public final float c(long j, float f, float f2, float f3) {
        float f4;
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            long j2 = j - this.d;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = this.c;
            if (j2 > j3) {
                j2 = j3;
            }
            f4 = j2 / j3;
        }
        float fA = this.b.a(f4);
        return (f * (1.0f - fA)) + (f2 * fA);
    }

    @Override // defpackage.nq
    public final float d(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (c(j4, f, f2, f3) - c((-1000000) + j4, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.nq
    public final long e(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.nq
    public final /* synthetic */ ps f() {
        return new ps(this);
    }

    public ns() {
        this(kwx.JSON3, 0, no.a);
    }
}
