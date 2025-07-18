package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cju {
    public final String a;
    public final Long b;

    public cju(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cju)) {
            return false;
        }
        cju cjuVar = (cju) obj;
        return agvy.c(this.a, cjuVar.a) && agvy.c(this.b, cjuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
