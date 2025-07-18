package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuz {
    public final int a;
    public final long b;

    public kuz() {
        throw null;
    }

    public static kuz a(kvx kvxVar) {
        return new kuz((int) kvxVar.a(), kvxVar.b());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuz) {
            kuz kuzVar = (kuz) obj;
            if (this.a == kuzVar.a && this.b == kuzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LastWatchInfo{mediaPositionMs=" + this.a + ", timestamp=" + this.b + "}";
    }

    public kuz(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
