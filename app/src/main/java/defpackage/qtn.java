package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtn extends qtq {
    private final qtp a;

    public qtn(qtp qtpVar) {
        this.a = qtpVar;
    }

    @Override // defpackage.qtq
    public final qtp d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qtq) {
            qtq qtqVar = (qtq) obj;
            qtqVar.f();
            qtqVar.e();
            if (equals(qtqVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() ^ (-1033307390);
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=EXPLICITLY_DISABLED, chargeCounterEnabled=false, metricExtensionProvider=" + toString() + "}";
    }

    @Override // defpackage.qtq
    public final void e() {
    }

    @Override // defpackage.qtq
    public final void f() {
    }
}
