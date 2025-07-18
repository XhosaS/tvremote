package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfy {
    public final String a;
    public final ret b;
    public final ret c;
    public final String d;

    public rfy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfy) {
            rfy rfyVar = (rfy) obj;
            if (this.a.equals(rfyVar.a) && this.b.equals(rfyVar.b) && this.c.equals(rfyVar.c) && this.d.equals(rfyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ret retVar = this.c;
        return "AccountMessagesResources{recommendedActions=" + this.a + ", yellowAlertIcon=" + String.valueOf(this.b) + ", shieldIcon=" + String.valueOf(retVar) + ", appPackageName=" + this.d + "}";
    }

    public rfy(String str, ret retVar, ret retVar2, String str2) {
        this.a = str;
        this.b = retVar;
        this.c = retVar2;
        this.d = str2;
    }
}
