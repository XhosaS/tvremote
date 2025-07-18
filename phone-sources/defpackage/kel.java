package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kel {
    public final String a;
    public final String b;

    public kel(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kel)) {
            return false;
        }
        kel kelVar = (kel) obj;
        return yks.e(this.a, kelVar.a) && yks.e(this.b, kelVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenreModel(name=" + this.a + ", imageSrc=" + this.b + ")";
    }
}
