package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unr {
    public final String a;
    private final long b;
    private final long c;

    public unr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof unr) {
            unr unrVar = (unr) obj;
            if (this.a.equals(unrVar.a) && this.b == unrVar.b && this.c == unrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.b;
        return (((iHashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public unr(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
