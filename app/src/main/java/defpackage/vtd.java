package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtd extends vtp {
    public final vtq a;
    public final yqt b;

    public vtd(vtq vtqVar, yqt yqtVar) {
        if (vtqVar == null) {
            throw new NullPointerException("Null repeatInterval");
        }
        this.a = vtqVar;
        this.b = yqtVar;
    }

    @Override // defpackage.vtp
    public final vtq a() {
        return this.a;
    }

    @Override // defpackage.vtp
    public final yqt b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vtp) {
            vtp vtpVar = (vtp) obj;
            if (this.a.equals(vtpVar.a()) && this.b.equals(vtpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        yqt yqtVar = this.b;
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=" + yqtVar.toString() + "}";
    }
}
