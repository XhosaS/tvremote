package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmp {
    public final String a;

    public rmp(String str) {
        this.a = str;
    }

    public static rmp a(rmp rmpVar, rmp rmpVar2) {
        return new rmp(String.valueOf(rmpVar.a).concat(String.valueOf(rmpVar2.a)));
    }

    public static rmp b(Class cls) {
        return !sij.F(null) ? new rmp("null".concat(String.valueOf(cls.getSimpleName()))) : new rmp(cls.getSimpleName());
    }

    public static rmp c(Enum r2) {
        return !sij.F(null) ? new rmp("null".concat(String.valueOf(r2.name()))) : new rmp(r2.name());
    }

    public static String d(rmp rmpVar) {
        if (rmpVar == null) {
            return null;
        }
        return rmpVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rmp) {
            return this.a.equals(((rmp) obj).a);
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
