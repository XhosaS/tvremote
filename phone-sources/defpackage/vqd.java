package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqd implements vpw {
    public final String a;

    public vqd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqd) && yks.e(this.a, ((vqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringContent(string=" + this.a + ")";
    }
}
