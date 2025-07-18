package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkq {
    private final dmg a;
    private final int b;
    private final drm c;
    private final drn d;

    public dkq(dmg dmgVar, int i, drm drmVar, drn drnVar) {
        this.a = dmgVar;
        this.b = i;
        this.c = drmVar;
        this.d = drnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkq)) {
            return false;
        }
        dkq dkqVar = (dkq) obj;
        return this.a == dkqVar.a && this.b == dkqVar.b && yks.e(this.c, dkqVar.c) && yks.e(this.d, dkqVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        drm drmVar = this.c;
        int i = (((iHashCode + this.b) * 31) + (drmVar == null ? 0 : drmVar.a)) * 31;
        drn drnVar = this.d;
        return i + (drnVar != null ? drnVar.a : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public /* synthetic */ dkq(dmg dmgVar, int i, drm drmVar, drn drnVar, byte[] bArr) {
        this(dmgVar, i, drmVar, drnVar);
    }

    public /* synthetic */ dkq(dmg dmgVar, int i, drm drmVar, drn drnVar, int i2) {
        this(dmgVar, i, (i2 & 4) != 0 ? null : drmVar, (i2 & 8) != 0 ? null : drnVar);
    }
}
