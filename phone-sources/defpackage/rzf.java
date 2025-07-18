package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzf {
    public final rxp a;
    public final rzg b;

    public rzf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rzf) {
            rzf rzfVar = (rzf) obj;
            rxp rxpVar = this.a;
            if (rxpVar != null ? rxpVar.equals(rzfVar.a) : rzfVar.a == null) {
                if (this.b.equals(rzfVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rxp rxpVar = this.a;
        return (((rxpVar == null ? 0 : rxpVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        rzg rzgVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + rzgVar.toString() + "}";
    }

    public rzf(rxp rxpVar, rzg rzgVar) {
        this.a = rxpVar;
        this.b = rzgVar;
    }
}
