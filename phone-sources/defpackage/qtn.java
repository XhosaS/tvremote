package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtn {
    public final Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final qtj h;

    public qtn() {
        throw null;
    }

    public static qtn a(Object obj, qth qthVar) {
        if (obj != null) {
            return new qtn(obj, qthVar.d(obj), qthVar.f(obj), qthVar.h(obj), qthVar.g(obj), qthVar.e(obj), qthVar.i(obj), qthVar.b(obj));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qtn) {
            qtn qtnVar = (qtn) obj;
            if (this.a.equals(qtnVar.a) && ((str = this.b) != null ? str.equals(qtnVar.b) : qtnVar.b == null) && ((str2 = this.c) != null ? str2.equals(qtnVar.c) : qtnVar.c == null) && ((str3 = this.d) != null ? str3.equals(qtnVar.d) : qtnVar.d == null) && ((str4 = this.e) != null ? str4.equals(qtnVar.e) : qtnVar.e == null) && ((str5 = this.f) != null ? str5.equals(qtnVar.f) : qtnVar.f == null) && this.g == qtnVar.g) {
                qtj qtjVar = this.h;
                qtj qtjVar2 = qtnVar.h;
                if (qtjVar != null ? qtjVar.equals(qtjVar2) : qtjVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (((iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        qtj qtjVar = this.h;
        return iHashCode6 ^ (qtjVar != null ? qtjVar.hashCode() : 0);
    }

    public final String toString() {
        qtj qtjVar = this.h;
        return "AccountSnapshot{account=" + this.a.toString() + ", accountName=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", avatarUrl=" + this.f + ", isMetadataAvailable=" + this.g + ", gaiaAccountData=" + String.valueOf(qtjVar) + "}";
    }

    public qtn(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, qtj qtjVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = qtjVar;
    }
}
