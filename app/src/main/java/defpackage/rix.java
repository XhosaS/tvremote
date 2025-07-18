package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rix extends rmt {
    public final rho a;
    public final rmu b;

    public rix(rho rhoVar, rmu rmuVar) {
        this.a = rhoVar;
        this.b = rmuVar;
    }

    @Override // defpackage.rmt
    public final rho a() {
        return this.a;
    }

    @Override // defpackage.rmt
    public final rmu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmt) {
            rmt rmtVar = (rmt) obj;
            rho rhoVar = this.a;
            if (rhoVar != null ? rhoVar.equals(rmtVar.a()) : rmtVar.a() == null) {
                if (this.b.equals(rmtVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rho rhoVar = this.a;
        return (((rhoVar == null ? 0 : rhoVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        rmu rmuVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + rmuVar.toString() + "}";
    }
}
