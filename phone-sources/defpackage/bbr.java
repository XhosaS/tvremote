package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbr {
    private final Object a;
    private final Object b;

    public bbr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        return obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbr)) {
            return false;
        }
        bbr bbrVar = (bbr) obj;
        return yks.e(this.a, bbrVar.a) && yks.e(this.b, bbrVar.b);
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
