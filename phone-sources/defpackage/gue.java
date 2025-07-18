package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gue {
    public final String a;
    public final Long b;

    public gue(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gue)) {
            return false;
        }
        gue gueVar = (gue) obj;
        return yks.e(this.a, gueVar.a) && yks.e(this.b, gueVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
