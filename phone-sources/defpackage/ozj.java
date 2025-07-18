package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozj {
    public final String a;
    public final oyd b;
    public final boolean c;
    private final uwm d;

    public ozj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozj) {
            ozj ozjVar = (ozj) obj;
            String str = this.a;
            if (str != null ? str.equals(ozjVar.a) : ozjVar.a == null) {
                if (this.d.equals(ozjVar.d) && this.b.equals(ozjVar.b) && this.c == ozjVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        uwm uwmVar = this.d;
        if (uwmVar.A()) {
            iJ = uwmVar.j();
        } else {
            int iJ2 = uwmVar.M;
            if (iJ2 == 0) {
                iJ2 = uwmVar.j();
                uwmVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iJ) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        oyd oydVar = this.b;
        return "TriggeringConditionsEvalContext{accountName=" + this.a + ", promoId=" + this.d.toString() + ", clearcutLogContext=" + String.valueOf(oydVar) + ", hasPresentedPromos=" + this.c + "}";
    }

    public ozj(String str, uwm uwmVar, oyd oydVar, boolean z) {
        this.a = str;
        if (uwmVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.d = uwmVar;
        this.b = oydVar;
        this.c = z;
    }
}
