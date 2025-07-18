package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btt {
    public long a;
    public float b;

    public btt(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btt)) {
            return false;
        }
        btt bttVar = (btt) obj;
        return this.a == bttVar.a && Float.compare(this.b, bttVar.b) == 0;
    }

    public final int hashCode() {
        return (a.k(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
