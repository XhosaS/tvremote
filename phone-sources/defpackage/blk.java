package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blk {
    public final int a;
    public final int b;
    public final cvw c;
    private final long d;

    public blk(int i, long j, int i2, cvw cvwVar) {
        this.a = i;
        this.d = j;
        this.b = i2;
        this.c = cvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blk)) {
            return false;
        }
        blk blkVar = (blk) obj;
        return this.a == blkVar.a && this.d == blkVar.d && this.b == blkVar.b && yks.e(this.c, blkVar.c);
    }

    public final int hashCode() {
        int i = this.b;
        a.bw(i);
        cvw cvwVar = this.c;
        return (((((this.a * 31) + a.k(this.d)) * 31) + i) * 31) + (cvwVar == null ? 0 : cvwVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append((Object) (this.b != 1 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR"));
        sb.append(", structureCompat=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
