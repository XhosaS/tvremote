package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvp {
    public static final kvp a = new kvp(kvm.TYPE_UNSPECIFIED, kvn.QUALITY_UNSPECIFIED);
    public final kvm b;
    public final kvn c;

    static {
        new kvp(kvm.TYPE_FREE_WITH_ADS, kvn.QUALITY_UNSPECIFIED);
    }

    public kvp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvp) {
            kvp kvpVar = (kvp) obj;
            if (this.b.equals(kvpVar.b) && this.c.equals(kvpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        kvn kvnVar = this.c;
        return "OfferPreference{offerType=" + this.b.toString() + ", quality=" + kvnVar.toString() + "}";
    }

    public kvp(kvm kvmVar, kvn kvnVar) {
        if (kvmVar == null) {
            throw new NullPointerException("Null offerType");
        }
        this.b = kvmVar;
        if (kvnVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.c = kvnVar;
    }
}
