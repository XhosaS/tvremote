package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltx {
    public final ksn a;
    public final int b;
    public final long c;
    public final int d;

    public ltx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ltx) {
            ltx ltxVar = (ltx) obj;
            if (this.a.equals(ltxVar.a) && this.b == ltxVar.b && this.d == ltxVar.d && this.c == ltxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.d;
        a.bl(i);
        long j = this.c;
        return (((((iHashCode * 1000003) ^ this.b) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "UpdateAccountLinkRequest{account=" + this.a.toString() + ", partner=" + this.b + ", state=" + krf.o(this.d) + ", timestampMillis=" + this.c + "}";
    }

    public ltx(ksn ksnVar, int i, long j) {
        this.a = ksnVar;
        this.b = i;
        this.d = 3;
        this.c = j;
    }
}
