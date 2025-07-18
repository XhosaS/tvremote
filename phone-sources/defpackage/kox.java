package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kox {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    private final String e = null;

    public kox(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kox)) {
            return false;
        }
        kox koxVar = (kox) obj;
        if (!yks.e(this.a, koxVar.a) || !yks.e(this.b, koxVar.b) || !yks.e(this.c, koxVar.c)) {
            return false;
        }
        String str = koxVar.e;
        if (!yks.e(null, null)) {
            return false;
        }
        long j = this.d;
        long j2 = koxVar.d;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        long j = bnq.a;
        return (iHashCode * 961) + a.k(this.d);
    }

    public final String toString() {
        return "StoryAvatarCardData(titleText=" + this.a + ", subtitleText=" + this.b + ", avatarUrl=" + this.c + ", actionUrl=null, textColor=" + bnq.g(this.d) + ")";
    }
}
