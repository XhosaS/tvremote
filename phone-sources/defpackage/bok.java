package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bok {
    public static final bok a = new bok(bny.j(4278190080L));
    public final long b;
    public final long c = 0;
    public final float d = 0.0f;

    public bok(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bok)) {
            return false;
        }
        long j = this.b;
        bok bokVar = (bok) obj;
        long j2 = bokVar.b;
        long j3 = bnq.a;
        if (!a.s(j, j2)) {
            return false;
        }
        long j4 = bokVar.c;
        if (!a.s(0L, 0L)) {
            return false;
        }
        float f = bokVar.d;
        return true;
    }

    public final int hashCode() {
        long j = bnq.a;
        return (((a.k(this.b) * 31) + a.k(0L)) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "Shadow(color=" + ((Object) bnq.g(this.b)) + ", offset=" + ((Object) bmx.d(0L)) + ", blurRadius=0.0)";
    }
}
