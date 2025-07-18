package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrh implements vrg {
    public final vps a;
    public final int b;

    public vrh(vps vpsVar, int i) {
        this.a = vpsVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrh)) {
            return false;
        }
        vrh vrhVar = (vrh) obj;
        return yks.e(this.a, vrhVar.a) && this.b == vrhVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bw(i);
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailingImage(image=");
        sb.append(this.a);
        sb.append(", size=");
        int i = this.b;
        sb.append((Object) (i != 2 ? i != 3 ? "LARGE_32" : "MEDIUM_24" : "SMALL_MEDIUM_20"));
        sb.append(")");
        return sb.toString();
    }
}
