package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kem {
    public final String a;

    public kem(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kem) && yks.e(this.a, ((kem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecentSearchModel(query=" + this.a + ")";
    }
}
