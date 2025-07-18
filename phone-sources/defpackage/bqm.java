package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqm {
    public static int a;
    public static final Object b;
    public static final brx m;
    public final String c = "";
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final brm h;
    public final long i;
    public final int j;
    public final boolean k;
    public final int l;

    static {
        brx brxVar = new brx(null);
        m = brxVar;
        b = brxVar;
    }

    public bqm(float f, float f2, float f3, float f4, brm brmVar, long j, int i, boolean z, int i2) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = brmVar;
        this.i = j;
        this.j = i;
        this.k = z;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqm)) {
            return false;
        }
        bqm bqmVar = (bqm) obj;
        if (!yks.e(this.c, bqmVar.c) || !cma.b(this.d, bqmVar.d) || !cma.b(this.e, bqmVar.e) || this.f != bqmVar.f || this.g != bqmVar.g || !yks.e(this.h, bqmVar.h)) {
            return false;
        }
        long j = this.i;
        long j2 = bqmVar.i;
        long j3 = bnq.a;
        return a.s(j, j2) && a.r(this.j, bqmVar.j) && this.k == bqmVar.k;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h.hashCode();
        long j = bnq.a;
        return (((((iHashCode * 31) + a.k(this.i)) * 31) + this.j) * 31) + a.q(this.k);
    }
}
