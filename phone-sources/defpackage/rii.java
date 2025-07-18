package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rii {
    public final String a;
    public final String b;
    public final boolean c;
    private final String d;
    private final String e;

    public rii() {
        throw null;
    }

    public static rii a(Object obj, qth qthVar) {
        String strC = qthVar.c(obj);
        String strD = qthVar.d(obj);
        String strF = qthVar.f(obj);
        String strE = qthVar.e(obj);
        qthVar.j(obj);
        return new rii(strC, strD, strF, strE, qthVar.i(obj));
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rii) {
            rii riiVar = (rii) obj;
            if (this.d.equals(riiVar.d) && this.a.equals(riiVar.a) && ((str = this.b) != null ? str.equals(riiVar.b) : riiVar.b == null) && ((str2 = this.e) != null ? str2.equals(riiVar.e) : riiVar.e == null) && this.c == riiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        return ((((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + this.d + ", accountName=" + this.a + ", displayName=" + this.b + ", avatarUrl=" + this.e + ", isGaiaAccount=true, isMetadataAvailable=" + this.c + "}";
    }

    public rii(String str, String str2, String str3, String str4, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null accountIdentifier");
        }
        this.d = str;
        if (str2 == null) {
            throw new NullPointerException("Null accountName");
        }
        this.a = str2;
        this.b = str3;
        this.e = str4;
        this.c = z;
    }
}
