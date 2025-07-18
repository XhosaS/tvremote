package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdx {
    public final int a;
    public final long b;
    private final int c;

    public sdx(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final int a(int i) {
        int i2 = this.c;
        return i2 != Integer.MIN_VALUE ? i2 : i;
    }

    public final sdx b(int i, int i2, ruo ruoVar) {
        int i3 = i2 + i;
        int i4 = this.a;
        if (i3 > i4) {
            throw new IllegalArgumentException("The end offset cannot be greater than the size");
        }
        if (c()) {
            throw new IllegalStateException("TimestampRead can't be re-calculated for an error");
        }
        long j = this.b;
        long jB = j != Long.MIN_VALUE ? j - sjx.b(i4 - i3, ruoVar) : Long.MIN_VALUE;
        int i5 = this.c;
        return new sdx(i, jB, i5 != Integer.MIN_VALUE ? i5 - (i4 - i3) : Integer.MIN_VALUE);
    }

    public final boolean c() {
        return this.a < -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdx)) {
            return false;
        }
        sdx sdxVar = (sdx) obj;
        return this.a == sdxVar.a && this.b == sdxVar.b && this.c == sdxVar.c;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        return "TimestampedRead(size=" + this.a + ", timestampElapsedNanos=" + this.b + ", originalEndOffset=" + this.c + ")";
    }

    public /* synthetic */ sdx(int i, long j, int i2, byte[] bArr) {
        this(i, (i2 & 2) != 0 ? Long.MIN_VALUE : j, Integer.MIN_VALUE);
    }
}
