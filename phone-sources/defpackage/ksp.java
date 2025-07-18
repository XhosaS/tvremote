package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksp {
    public final String a;

    public ksp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksp) {
            return this.a.equals(((ksp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AffiliateId{id=" + this.a + "}";
    }

    public ksp(String str) {
        this.a = str;
    }
}
