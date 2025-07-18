package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdw {
    public static final wdv a = new wdv();
    public final String b;
    public final abvo c;
    public final long d;
    public final rgs e;

    public wdw(String str, abvo abvoVar, long j, rgs rgsVar) {
        this.b = str;
        this.c = abvoVar;
        this.d = j;
        this.e = rgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdw)) {
            return false;
        }
        wdw wdwVar = (wdw) obj;
        return agvy.c(this.b, wdwVar.b) && agvy.c(this.c, wdwVar.c) && this.d == wdwVar.d && agvy.c(this.e, wdwVar.e);
    }

    public final int hashCode() {
        int iB;
        int iHashCode = this.b.hashCode() * 31;
        abvo abvoVar = this.c;
        int iHashCode2 = (iHashCode + (abvoVar == null ? 0 : abvoVar.hashCode())) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        rgs rgsVar = this.e;
        if ((rgsVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(rgsVar.getClass()).b(rgsVar);
        } else {
            int iB2 = rgsVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(rgsVar.getClass()).b(rgsVar);
                rgsVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return i + iB;
    }

    public final String toString() {
        return "Metadata(serverToken=" + this.b + ", experimentToken=" + this.c + ", lastUpdateEpochMillis=" + this.d + ", commitProperties=" + this.e + ")";
    }
}
