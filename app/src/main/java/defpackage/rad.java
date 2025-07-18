package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rad extends rae {
    private final yqt a;
    private final yqt b;

    public rad(yqt yqtVar, yqt yqtVar2) {
        this.a = yqtVar;
        this.b = yqtVar2;
    }

    @Override // defpackage.rae
    public final yqt d() {
        return this.b;
    }

    @Override // defpackage.rae
    public final yqt e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rae) {
            rae raeVar = (rae) obj;
            raeVar.f();
            if (this.a.equals(raeVar.e()) && this.b.equals(raeVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 395873938;
    }

    public final String toString() {
        return "StartupConfigurations{enablement=DEFAULT, metricExtensionProvider=Optional.absent(), customTimestampProvider=Optional.absent()}";
    }

    @Override // defpackage.rae
    public final void f() {
    }
}
