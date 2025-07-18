package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class yvp implements zcf {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zcf) {
            return a().equals(((zcf) obj).a());
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
