package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijw {
    public final String a;
    public final boolean b;

    public ijw(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijw)) {
            return false;
        }
        ijw ijwVar = (ijw) obj;
        return yks.e(this.a, ijwVar.a) && this.b == ijwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }

    public final String toString() {
        return "SelectedTag(tagId=" + this.a + ", negate=" + this.b + ")";
    }
}
