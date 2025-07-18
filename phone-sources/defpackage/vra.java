package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vra {
    public final vps a;

    public vra(vps vpsVar) {
        this.a = vpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vra) && yks.e(this.a, ((vra) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(image=" + this.a + ")";
    }
}
