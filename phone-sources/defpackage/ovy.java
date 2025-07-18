package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovy {
    public final ovz a;
    public final String b;
    public String c;
    public final boolean d;
    private final boolean e;

    public ovy() {
        this((ovz) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovy)) {
            return false;
        }
        ovy ovyVar = (ovy) obj;
        if (this.a != ovyVar.a || !yks.e(this.b, ovyVar.b)) {
            return false;
        }
        boolean z = ovyVar.e;
        return yks.e(this.c, ovyVar.c) && this.d == ovyVar.d;
    }

    public final int hashCode() {
        ovz ovzVar = this.a;
        int iHashCode = ovzVar == null ? 0 : ovzVar.hashCode();
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode * 31;
        int iQ = a.q(false);
        String str2 = this.c;
        return ((((((i + iHashCode2) * 31) + iQ) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + a.q(this.d);
    }

    public final String toString() {
        return "BasicQoeAnalyticsParams(clientType=" + this.a + ", packageName=" + this.b + ", isSignOutUser=false, documentId=" + this.c + ", isOffline=" + this.d + ")";
    }

    public ovy(ovz ovzVar, String str, String str2, boolean z) {
        this.a = ovzVar;
        this.b = str;
        this.e = false;
        this.c = str2;
        this.d = z;
    }

    public /* synthetic */ ovy(ovz ovzVar, String str, String str2, int i) {
        this(1 == (i & 1) ? null : ovzVar, (i & 2) != 0 ? null : str, (i & 8) != 0 ? null : str2, false);
    }
}
