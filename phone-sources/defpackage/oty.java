package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oty {
    public final otz a;
    public final oua b;

    public oty(otz otzVar, oua ouaVar) {
        otzVar.getClass();
        ouaVar.getClass();
        this.a = otzVar;
        this.b = ouaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oty)) {
            return false;
        }
        oty otyVar = (oty) obj;
        return this.a == otyVar.a && this.b == otyVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NurLicenseError(nurLicenseErrorCategory=" + this.a + ", nurLicenseErrorCode=" + this.b + ")";
    }
}
