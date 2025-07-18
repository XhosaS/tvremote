package defpackage;

import java.io.Serializable;

/* compiled from: PG */
@yji
/* loaded from: classes3.dex */
public final class yfy implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof yfx) {
            return ((yfx) obj).a;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        return !(obj instanceof yfx);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yfy) && yks.e(this.a, ((yfy) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        return obj instanceof yfx ? ((yfx) obj).toString() : a.cj(obj, "Success(", ")");
    }
}
