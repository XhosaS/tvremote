package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvf {
    public final kzo a;
    public final int b;

    public lvf() {
        throw null;
    }

    final boolean a() {
        int iAR = a.aR(this.a.d);
        if (iAR == 0) {
            return false;
        }
        return iAR == 3 || iAR == 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lvf) {
            lvf lvfVar = (lvf) obj;
            if (this.a.equals(lvfVar.a) && this.b == lvfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        kzo kzoVar = this.a;
        if (kzoVar.A()) {
            iJ = kzoVar.j();
        } else {
            int iJ2 = kzoVar.M;
            if (iJ2 == 0) {
                iJ2 = kzoVar.j();
                kzoVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((iJ ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "StreamAudioInfo{audioInfo=" + this.a.toString() + ", index=" + this.b + "}";
    }

    public lvf(kzo kzoVar, int i) {
        if (kzoVar == null) {
            throw new NullPointerException("Null audioInfo");
        }
        this.a = kzoVar;
        this.b = i;
    }
}
