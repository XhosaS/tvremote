package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkm {
    private final dmg a;
    private final int b;
    private final int c;

    public dkm(dmg dmgVar, int i, int i2) {
        this.a = dmgVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkm)) {
            return false;
        }
        dkm dkmVar = (dkm) obj;
        return this.a == dkmVar.a && a.r(this.b, dkmVar.b) && a.r(this.c, dkmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) drm.a(this.b)) + ", verticalAlignment=" + ((Object) drn.a(this.c)) + ')';
    }

    public /* synthetic */ dkm(dmg dmgVar, int i, int i2, byte[] bArr) {
        this(dmgVar, i, i2);
    }
}
