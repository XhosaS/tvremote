package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izp {
    private final String a;
    private final String b;

    public izp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof izp) {
            return yks.e(this.a, ((izp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "[id=" + this.a + " type=" + this.b + "]";
    }
}
