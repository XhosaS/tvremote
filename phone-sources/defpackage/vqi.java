package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqi {
    public final vqe a;
    public final int b;

    public vqi(int i, vqe vqeVar) {
        this.b = i;
        this.a = vqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqi)) {
            return false;
        }
        vqi vqiVar = (vqi) obj;
        return this.b == vqiVar.b && yks.e(this.a, vqiVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        a.bw(i);
        vqe vqeVar = this.a;
        return (i * 31) + (vqeVar == null ? 0 : vqeVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingData(ringType=");
        sb.append((Object) (this.b != 1 ? "RING_TYPE_GOOGLE_ONE" : "RING_TYPE_UNDEFINED"));
        sb.append(", accessibilityLabel=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public vqi() {
        this(1, null);
    }
}
