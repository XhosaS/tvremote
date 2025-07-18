package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aamz extends aanl {
    private final String a;
    private final long b;
    private final long c;

    public aamz(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.aanl
    public final long a() {
        return this.c;
    }

    @Override // defpackage.aanl
    public final long b() {
        return this.b;
    }

    @Override // defpackage.aanl
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aanl) {
            aanl aanlVar = (aanl) obj;
            if (this.a.equals(aanlVar.c()) && this.b == aanlVar.b() && this.c == aanlVar.a()) {
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
}
