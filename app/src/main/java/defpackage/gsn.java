package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsn {
    public final long a;
    public final long b;

    public gsn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsn)) {
            return false;
        }
        gsn gsnVar = (gsn) obj;
        return this.a == gsnVar.a && this.b == gsnVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "AppVersionInfo(major=" + this.a + ", minor=" + this.b + ")";
    }
}
