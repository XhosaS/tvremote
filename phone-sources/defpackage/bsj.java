package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsj implements bsw {
    public final int a;

    public bsj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((bsj) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidPointerIcon(type=" + this.a + ')';
    }
}
