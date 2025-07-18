package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfn {
    public final vku a;
    public final qfz b;

    public qfn(vku vkuVar, qfz qfzVar) {
        qfzVar.getClass();
        this.a = vkuVar;
        this.b = qfzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfn)) {
            return false;
        }
        qfn qfnVar = (qfn) obj;
        return yks.e(this.a, qfnVar.a) && this.b == qfnVar.b;
    }

    public final int hashCode() {
        int iJ;
        vku vkuVar = this.a;
        if (vkuVar.A()) {
            iJ = vkuVar.j();
        } else {
            int iJ2 = vkuVar.M;
            if (iJ2 == 0) {
                iJ2 = vkuVar.j();
                vkuVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (iJ * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExtractedPayloadData(androidPayload=" + this.a + ", pushPayloadType=" + this.b + ")";
    }
}
