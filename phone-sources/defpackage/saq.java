package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class saq {
    public final Object a;
    private final String b;

    public saq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof saq) {
            saq saqVar = (saq) obj;
            if (this.a.equals(saqVar.a) && this.b.equals(saqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        vuc vucVar = (vuc) this.a;
        if (vucVar.A()) {
            iJ = vucVar.j();
        } else {
            int iJ2 = vucVar.M;
            if (iJ2 == 0) {
                iJ2 = vucVar.j();
                vucVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((iJ ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TypeIdentifier{ulexType=" + this.a.toString() + ", name=" + this.b + "}";
    }

    public saq(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Null ulexType");
        }
        this.a = obj;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }
}
