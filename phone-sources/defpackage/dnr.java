package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnr extends cwq {
    public final int a;

    public dnr(int i) {
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
        return this.a == ((dnr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
