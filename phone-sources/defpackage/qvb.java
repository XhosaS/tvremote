package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvb {
    public final cum a;
    public final ril b;
    public final wds c;
    public final rjg d;
    public final qtg e;
    public final qtg f;
    public final rhu g;
    private final tst h;
    private final tst i;

    public qvb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvb) {
            qvb qvbVar = (qvb) obj;
            if (this.a.equals(qvbVar.a) && this.b.equals(qvbVar.b) && this.c.equals(qvbVar.c) && this.d.equals(qvbVar.d) && this.e.equals(qvbVar.e) && this.f.equals(qvbVar.f) && this.h.equals(qvbVar.h) && this.i.equals(qvbVar.i) && this.g.equals(qvbVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        wds wdsVar = this.c;
        if (wdsVar.A()) {
            iJ = wdsVar.j();
        } else {
            int iJ2 = wdsVar.M;
            if (iJ2 == 0) {
                iJ2 = wdsVar.j();
                wdsVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (((((((((((((iHashCode * 1000003) ^ iJ) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        rhu rhuVar = this.g;
        tst tstVar = this.i;
        tst tstVar2 = this.h;
        qtg qtgVar = this.f;
        qtg qtgVar2 = this.e;
        rjg rjgVar = this.d;
        wds wdsVar = this.c;
        ril rilVar = this.b;
        return "PolicyFooterSpec{accountSupplier=" + String.valueOf(this.a) + ", eventLogger=" + String.valueOf(rilVar) + ", logContext=" + String.valueOf(wdsVar) + ", visualElements=" + String.valueOf(rjgVar) + ", privacyPolicyClickListener=" + String.valueOf(qtgVar2) + ", termsOfServiceClickListener=" + String.valueOf(qtgVar) + ", customItemLabelStringId=" + String.valueOf(tstVar2) + ", customItemClickListener=" + String.valueOf(tstVar) + ", clickRunnables=" + String.valueOf(rhuVar) + "}";
    }

    public qvb(cum cumVar, ril rilVar, wds wdsVar, rjg rjgVar, qtg qtgVar, qtg qtgVar2, tst tstVar, tst tstVar2, rhu rhuVar) {
        this.a = cumVar;
        this.b = rilVar;
        this.c = wdsVar;
        this.d = rjgVar;
        this.e = qtgVar;
        this.f = qtgVar2;
        this.h = tstVar;
        this.i = tstVar2;
        this.g = rhuVar;
    }
}
