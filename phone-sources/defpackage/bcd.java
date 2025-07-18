package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcd {
    private final String a;

    public bcd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcd) && yks.e(this.a, ((bcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
