package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class utb {
    private final String a;
    private final uqx b;
    private final String c;

    public utb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        uqx uqxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof utb) {
            utb utbVar = (utb) obj;
            if (this.a.equals(utbVar.a) && ((uqxVar = this.b) != null ? uqxVar.equals(utbVar.b) : utbVar.b == null) && this.c.equals(utbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        uqx uqxVar = this.b;
        return (((iHashCode * 1000003) ^ (uqxVar == null ? 0 : uqxVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "InterceptorId{endpoint=" + this.a + ", authContext=" + String.valueOf(this.b) + ", methodName=" + this.c + "}";
    }

    public utb(String str, uqx uqxVar, String str2) {
        if (str == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.a = str;
        this.b = uqxVar;
        this.c = str2;
    }
}
