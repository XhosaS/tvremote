package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpk {
    public static final tvn a = tvn.n("GnpSdk");
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public qpk() {
        throw null;
    }

    public static qpj b() {
        qpj qpjVar = new qpj();
        qpjVar.c(false);
        qpjVar.d(false);
        return qpjVar;
    }

    public final String a() {
        int length = String.valueOf(this.b).concat(sij.E(this.c)).length();
        long jCharAt = 1125899906842597L;
        while (true) {
            length--;
            if (length < 0) {
                long j = 1152921504606846975L & jCharAt;
                int i = this.e;
                int i2 = this.d;
                return Long.toHexString(j) + "-h" + i + "-w" + i2;
            }
            jCharAt = (jCharAt * 31) + r0.charAt(length);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qpk) {
            qpk qpkVar = (qpk) obj;
            if (this.b.equals(qpkVar.b) && ((str = this.c) != null ? str.equals(qpkVar.c) : qpkVar.c == null) && this.d == qpkVar.d && this.e == qpkVar.e && this.f == qpkVar.f && this.g == qpkVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        String str = this.c;
        return (((((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "GnpMedia{url=" + this.b + ", accountName=" + this.c + ", width=" + this.d + ", height=" + this.e + ", shouldAuthenticateFifeUrls=" + this.f + ", shouldApplyFifeOptions=" + this.g + "}";
    }

    public qpk(String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
    }
}
