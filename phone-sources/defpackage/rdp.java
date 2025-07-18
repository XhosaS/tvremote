package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdp {
    public final vqs a;
    public final rdo b = null;

    public rdp(vqs vqsVar) {
        this.a = vqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdp)) {
            return false;
        }
        rdp rdpVar = (rdp) obj;
        if (!yks.e(this.a, rdpVar.a)) {
            return false;
        }
        rdo rdoVar = rdpVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "CardWithViewModelData(card=" + this.a + ", viewModelData=null)";
    }
}
