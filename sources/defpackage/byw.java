package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class byw implements caw {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof caw) {
            return a().equals(((caw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
