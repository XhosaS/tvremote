package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyh {
    public final long a;
    public final long b;

    public eyh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyh)) {
            return false;
        }
        eyh eyhVar = (eyh) obj;
        return this.a == eyhVar.a && this.b == eyhVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
