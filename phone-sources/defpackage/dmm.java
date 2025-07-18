package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmm {
    private final dmg a;
    private final boolean b;
    private final boolean c;

    public dmm(dmg dmgVar, boolean z, boolean z2) {
        this.a = dmgVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmm)) {
            return false;
        }
        dmm dmmVar = (dmm) obj;
        return this.a == dmmVar.a && this.b == dmmVar.b && this.c == dmmVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.q(this.b)) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "RowColumnChildSelector(type=" + this.a + ", expandWidth=" + this.b + ", expandHeight=" + this.c + ')';
    }
}
