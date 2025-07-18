package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltz {
    public final lcs a;

    public ltz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ltz) {
            return this.a.equals(((ltz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        lcs lcsVar = this.a;
        if (lcsVar.A()) {
            iJ = lcsVar.j();
        } else {
            int iJ2 = lcsVar.M;
            if (iJ2 == 0) {
                iJ2 = lcsVar.j();
                lcsVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return iJ ^ 1000003;
    }

    public final String toString() {
        return "GetUserConfigurationResponse{userConfiguration=" + this.a.toString() + "}";
    }

    public ltz(lcs lcsVar) {
        if (lcsVar == null) {
            throw new NullPointerException("Null userConfiguration");
        }
        this.a = lcsVar;
    }
}
