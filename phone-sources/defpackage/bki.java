package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bki implements bkd {
    private final float a;
    private final float b;

    public bki(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bkd
    public final long a(long j, long j2, cmi cmiVar) {
        float f = cmiVar == cmi.a ? this.a : -this.a;
        return (Math.round(((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) * (this.b + 1.0f)) & 4294967295L) | (Math.round(((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f) * (f + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bki)) {
            return false;
        }
        bki bkiVar = (bki) obj;
        return Float.compare(this.a, bkiVar.a) == 0 && Float.compare(this.b, bkiVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}
