package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vos extends vfi {
    public final String a;

    public vos(String str) {
        super(null);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vos) && yks.e(this.a, ((vos) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringText(string=" + this.a + ")";
    }
}
