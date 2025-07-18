package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpt implements vpd {
    public final vps a;

    public vpt(vps vpsVar) {
        this.a = vpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpt) && yks.e(this.a, ((vpt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageTitle(image=" + this.a + ")";
    }
}
