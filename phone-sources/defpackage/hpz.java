package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpz {
    public final String a;

    public hpz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hpz) {
            return this.a.equals(((hpz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
