package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esv extends esw {
    public final String a;
    public final String b;

    public esv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.esw
    public final String a() {
        return this.a;
    }

    @Override // defpackage.esw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esw) {
            esw eswVar = (esw) obj;
            if (this.a.equals(eswVar.a()) && this.b.equals(eswVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "VerificationApiResult{packageName=" + this.a + ", verificationStatus=" + this.b + "}";
    }
}
