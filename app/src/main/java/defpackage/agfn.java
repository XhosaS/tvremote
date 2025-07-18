package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfn {
    public static final agfn a = new agfn(null);
    public final Object b;

    public agfn(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agfn) {
            return aghn.a(this.b, ((agfn) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!(obj instanceof agoa)) {
            return a.t(obj, "OnNextNotification[", "]");
        }
        return "OnErrorNotification[" + String.valueOf(((agoa) obj).a) + "]";
    }
}
