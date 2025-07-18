package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vph implements voy {
    public final vpg a;
    private final vrr b = vrr.b;

    public vph(vpg vpgVar) {
        this.a = vpgVar;
    }

    @Override // defpackage.voy
    public final vrr a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vph) && yks.e(this.a, ((vph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AvailableAccountParticleClick(availableAccountData=" + this.a + ")";
    }
}
