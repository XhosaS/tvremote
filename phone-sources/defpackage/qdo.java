package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdo {
    private final Long a;
    private final long b;

    public qdo() {
        throw null;
    }

    public static qdo b(long j) {
        a.H(j >= 0);
        qdh qdhVar = new qdh();
        qdhVar.a = Long.valueOf(j);
        qdhVar.b(SystemClock.uptimeMillis());
        return qdhVar.a();
    }

    public static qdo c() {
        qdh qdhVar = new qdh();
        qdhVar.a = null;
        qdhVar.b(SystemClock.uptimeMillis());
        return qdhVar.a();
    }

    public final long a() {
        Long l = this.a;
        l.getClass();
        return Math.max(0L, l.longValue() - (SystemClock.uptimeMillis() - this.b));
    }

    public final qdo d(long j) {
        if (e()) {
            return this;
        }
        qdh qdhVar = new qdh();
        qdhVar.a = Long.valueOf(Math.max(0L, this.a.longValue() - j));
        qdhVar.b(this.b);
        return qdhVar.a();
    }

    public final boolean e() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdo) {
            qdo qdoVar = (qdo) obj;
            Long l = this.a;
            if (l != null ? l.equals(qdoVar.a) : qdoVar.a == null) {
                if (this.b == qdoVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Timeout{value=" + this.a + ", startTime=" + this.b + "}";
    }

    public qdo(Long l, long j) {
        this.a = l;
        this.b = j;
    }
}
