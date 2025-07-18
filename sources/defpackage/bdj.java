package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdj {
    public final bbq a;
    public final bdk b;

    public bdj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdj) {
            bdj bdjVar = (bdj) obj;
            bbq bbqVar = this.a;
            if (bbqVar != null ? bbqVar.equals(bdjVar.a) : bdjVar.a == null) {
                if (this.b.equals(bdjVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        bbq bbqVar = this.a;
        return (((bbqVar == null ? 0 : bbqVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        bdk bdkVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + bdkVar.toString() + "}";
    }

    public bdj(bbq bbqVar, bdk bdkVar) {
        this.a = bbqVar;
        this.b = bdkVar;
    }
}
