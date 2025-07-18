package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kca {
    public final out a;
    public final String b;
    public final String c;
    public final long d;

    public kca(out outVar, String str, String str2, long j) {
        this.a = outVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kca)) {
            return false;
        }
        kca kcaVar = (kca) obj;
        return yks.e(this.a, kcaVar.a) && yks.e(this.b, kcaVar.b) && yks.e(this.c, kcaVar.c) && this.d == kcaVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.k(this.d);
    }

    public final String toString() {
        return "TrailerPlayerData(playerMetadata=" + this.a + ", accountName=" + this.b + ", playCountry=" + this.c + ", autoplayDelayDuration=" + this.d + ")";
    }
}
