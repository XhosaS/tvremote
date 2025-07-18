package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpk implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof agpj) {
            return ((agpj) obj).a;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        return !(obj instanceof agpj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof agpk) && agvy.c(this.a, ((agpk) obj).a);
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
        return obj instanceof agpj ? ((agpj) obj).toString() : a.c(obj, "Success(", ")");
    }
}
