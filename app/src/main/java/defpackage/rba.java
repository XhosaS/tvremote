package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rba extends rbc {
    private final yqt a;
    private final int b;

    public rba(int i, yqt yqtVar) {
        this.b = i;
        this.a = yqtVar;
    }

    @Override // defpackage.rbc, defpackage.qtl
    public final agow b() {
        return null;
    }

    @Override // defpackage.rbc
    public final yqt d() {
        return this.a;
    }

    @Override // defpackage.rbc
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rbc) {
            rbc rbcVar = (rbc) obj;
            if (this.b == rbcVar.e()) {
                rbcVar.f();
                if (this.a.equals(rbcVar.d())) {
                    rbcVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + qtm.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    @Override // defpackage.rbc
    public final void f() {
    }
}
