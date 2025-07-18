package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsq extends jtk {
    public final String a;
    public final long b;

    public jsq(String str, long j) {
        if (str == null) {
            throw new NullPointerException("Null contentTag");
        }
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.jtk
    public final long a() {
        return this.b;
    }

    @Override // defpackage.jtk
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtk) {
            jtk jtkVar = (jtk) obj;
            if (this.a.equals(jtkVar.b()) && this.b == jtkVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DownloadMetadata{contentTag=" + this.a + ", lastModifiedTimeSeconds=" + this.b + "}";
    }
}
