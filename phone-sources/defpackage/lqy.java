package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqy {
    public final ieg a;

    public lqy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqy) {
            return this.a.equals(((lqy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetCategoriesRequest{account=" + this.a.toString() + "}";
    }

    public lqy(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null account");
        }
        this.a = iegVar;
    }
}
