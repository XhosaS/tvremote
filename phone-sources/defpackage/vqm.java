package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqm implements vpd {
    public final vql a;

    public vqm(vql vqlVar) {
        this.a = vqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqm) && yks.e(this.a, ((vqm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextTitle(text=" + this.a + ")";
    }
}
