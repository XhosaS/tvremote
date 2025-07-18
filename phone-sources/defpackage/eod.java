package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eod {
    final long a;
    final long b;

    public eod(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eod eodVar = (eod) obj;
            if (this.a == eodVar.a && this.b == eodVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
