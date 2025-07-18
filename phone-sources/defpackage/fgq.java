package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgq {
    public final long a;
    public final long b;
    public final int c;

    public fgq(long j, long j2, int i) {
        a.H(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgq fgqVar = (fgq) obj;
            if (this.a == fgqVar.a && this.b == fgqVar.b && this.c == fgqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return edt.R("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }
}
