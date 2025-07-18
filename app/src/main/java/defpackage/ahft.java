package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahft {
    public static final ahfs a = new ahfs();
    public final Object b;

    public static final Object a(Object obj) {
        if (obj instanceof ahfs) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        ahfr ahfrVar = obj instanceof ahfr ? (ahfr) obj : null;
        if (ahfrVar != null) {
            return ahfrVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ahft) && agvy.c(this.b, ((ahft) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof ahfr ? ((ahfr) obj).toString() : a.c(obj, "Value(", ")");
    }
}
