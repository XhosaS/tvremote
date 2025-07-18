package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pge extends phd {
    private final rgy a;
    private final yqt b;
    private final yqt c;

    public pge(rgy rgyVar, yqt yqtVar, yqt yqtVar2) {
        this.a = rgyVar;
        this.b = yqtVar;
        this.c = yqtVar2;
    }

    @Override // defpackage.phd
    public final rgy a() {
        return this.a;
    }

    @Override // defpackage.phd
    public final yqt b() {
        return this.b;
    }

    @Override // defpackage.phd
    public final yqt c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof phd) {
            phd phdVar = (phd) obj;
            if (this.a.equals(phdVar.a()) && this.b.equals(phdVar.b()) && this.c.equals(phdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        yqt yqtVar = this.c;
        yqt yqtVar2 = this.b;
        return "ExperimentationConfig{phenotypeClient=" + this.a.toString() + ", hostAppLogSource=" + yqtVar2.toString() + ", primesLogSource=" + yqtVar.toString() + "}";
    }
}
