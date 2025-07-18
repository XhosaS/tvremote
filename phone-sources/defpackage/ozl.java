package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozl {
    public final oyf a;
    private final String b;
    private final uwm c;

    public ozl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozl) {
            ozl ozlVar = (ozl) obj;
            String str = this.b;
            if (str != null ? str.equals(ozlVar.b) : ozlVar.b == null) {
                if (this.c.equals(ozlVar.c) && this.a.equals(ozlVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        uwm uwmVar = this.c;
        if (uwmVar.A()) {
            iJ = uwmVar.j();
        } else {
            int iJ3 = uwmVar.M;
            if (iJ3 == 0) {
                iJ3 = uwmVar.j();
                uwmVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int i = iHashCode ^ 1000003;
        oyf oyfVar = this.a;
        if (oyfVar.A()) {
            iJ2 = oyfVar.j();
        } else {
            int iJ4 = oyfVar.M;
            if (iJ4 == 0) {
                iJ4 = oyfVar.j();
                oyfVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return (((i * 1000003) ^ iJ) * 1000003) ^ iJ2;
    }

    public final String toString() {
        oyf oyfVar = this.a;
        return "TriggeringRuleEvalContext{accountName=" + this.b + ", promoId=" + this.c.toString() + ", triggeringEvent=" + oyfVar.toString() + "}";
    }

    public ozl(String str, uwm uwmVar, oyf oyfVar) {
        this.b = str;
        if (uwmVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.c = uwmVar;
        this.a = oyfVar;
    }
}
