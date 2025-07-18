package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcz {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final int e;

    public hcz(String str, boolean z, boolean z2, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcz)) {
            return false;
        }
        hcz hczVar = (hcz) obj;
        return agvy.c(this.a, hczVar.a) && this.b == hczVar.b && this.c == hczVar.c && agvy.c(this.d, hczVar.d) && this.e == hczVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.d;
        return ((((((iHashCode + hcy.a(this.b)) * 31) + hcy.a(this.c)) * 31) + str.hashCode()) * 31) + this.e;
    }

    public final String toString() {
        return "AssistantSearchableApp(packageName=" + this.a + ", isEnabled=" + this.b + ", isOperatorPackage=" + this.c + ", label=" + this.d + ", sourceIconResource=" + this.e + ")";
    }
}
