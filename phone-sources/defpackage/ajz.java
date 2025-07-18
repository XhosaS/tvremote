package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajz {
    public final ahx a;
    public final ira b;

    public ajz(ahx ahxVar, ira iraVar) {
        this.a = ahxVar;
        this.b = iraVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajz)) {
            return false;
        }
        ajz ajzVar = (ajz) obj;
        return yks.e(this.a, ajzVar.a) && yks.e(this.b, ajzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
