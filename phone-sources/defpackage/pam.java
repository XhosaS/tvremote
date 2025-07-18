package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pam {
    public final oyf a;
    public final String b;
    public final long c;

    public pam() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pam) {
            pam pamVar = (pam) obj;
            if (this.a.equals(pamVar.a) && ((str = this.b) != null ? str.equals(pamVar.b) : pamVar.b == null) && this.c == pamVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        oyf oyfVar = this.a;
        if (oyfVar.A()) {
            iJ = oyfVar.j();
        } else {
            int iJ2 = oyfVar.M;
            if (iJ2 == 0) {
                iJ2 = oyfVar.j();
                oyfVar.M = iJ2;
            }
            iJ = iJ2;
        }
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        return ((((iJ ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ProcessingContext{event=" + this.a.toString() + ", accountName=" + this.b + ", eventTimeMs=" + this.c + "}";
    }

    public pam(oyf oyfVar, String str, long j) {
        if (oyfVar == null) {
            throw new NullPointerException("Null event");
        }
        this.a = oyfVar;
        this.b = str;
        this.c = j;
    }
}
