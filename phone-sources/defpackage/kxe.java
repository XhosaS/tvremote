package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxe {
    public final ksy a;
    public final long b;
    public final boolean c;
    public final int d;
    private final String e;

    public kxe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxe) {
            kxe kxeVar = (kxe) obj;
            if (this.a.equals(kxeVar.a) && this.d == kxeVar.d && this.e.equals(kxeVar.e) && this.b == kxeVar.b && this.c == kxeVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.d;
        a.bl(i);
        int iHashCode2 = (((iHashCode * 1000003) ^ i) * 1000003) ^ this.e.hashCode();
        int i2 = true != this.c ? 1237 : 1231;
        long j = this.b;
        return (((iHashCode2 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2;
    }

    public final String toString() {
        return "UserSentiment{assetId=" + this.a.toString() + ", sentiment=" + ktw.k(this.d) + ", title=" + this.e + ", timestamp=" + this.b + ", isPending=" + this.c + "}";
    }

    public kxe(ksy ksyVar, int i, long j, boolean z) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.a = ksyVar;
        this.d = i;
        this.e = "";
        this.b = j;
        this.c = z;
    }
}
