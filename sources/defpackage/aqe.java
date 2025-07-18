package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqe {
    public final String a;

    public aqe(String str) {
        this.a = str;
    }

    public static aqe a(Class cls) {
        return !bdq.q(null) ? new aqe("null".concat(String.valueOf(cls.getSimpleName()))) : new aqe(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqe) {
            return this.a.equals(((aqe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
