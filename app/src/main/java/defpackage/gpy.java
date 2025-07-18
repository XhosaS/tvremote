package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpy {
    public final String a;
    public final long b;

    public gpy(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpy)) {
            return false;
        }
        gpy gpyVar = (gpy) obj;
        return agvy.c(this.a, gpyVar.a) && this.b == gpyVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AppUsageScore(packageName=" + this.a + ", usageScore=" + this.b + ")";
    }
}
