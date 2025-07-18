package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzs {
    public final boolean a;
    public final long b;
    public final String c;
    public final int d;
    public final String e;

    public gzs(boolean z, long j, String str, int i, String str2) {
        this.a = z;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzs)) {
            return false;
        }
        gzs gzsVar = (gzs) obj;
        return this.a == gzsVar.a && this.b == gzsVar.b && agvy.c(this.c, gzsVar.c) && this.d == gzsVar.d && agvy.c(this.e, gzsVar.e);
    }

    public final int hashCode() {
        boolean z = this.a;
        int iHashCode = this.c.hashCode();
        int i = true != z ? 1237 : 1231;
        long j = this.b;
        int i2 = (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode;
        String str = this.e;
        return (((i2 * 31) + this.d) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppInfo(enabled=" + this.a + ", longVersionCode=" + this.b + ", packageName=" + this.c + ", versionCode=" + this.d + ", versionName=" + this.e + ")";
    }
}
