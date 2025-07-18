package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpi {
    public final String a;

    public qpi(String str) {
        this.a = str;
    }

    public static qpi a(qpi qpiVar, qpi qpiVar2) {
        return new qpi(String.valueOf(qpiVar.a).concat(String.valueOf(qpiVar2.a)));
    }

    public static String b(qpi qpiVar) {
        if (qpiVar == null) {
            return null;
        }
        return qpiVar.a;
    }

    public static qpi c(Class cls) {
        return !yqv.c(null) ? new qpi("null".concat(String.valueOf(cls.getSimpleName()))) : new qpi(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qpi) {
            return this.a.equals(((qpi) obj).a);
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
