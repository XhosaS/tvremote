package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihv extends ihw {
    public final String a;
    private final int b = 2;

    public ihv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihv)) {
            return false;
        }
        ihv ihvVar = (ihv) obj;
        if (!yks.e(this.a, ihvVar.a)) {
            return false;
        }
        int i = ihvVar.b;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a.bw(2);
        return iHashCode + 2;
    }

    public final String toString() {
        return "Message(message=" + this.a + ", origin=Disk)";
    }
}
