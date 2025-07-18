package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zbq implements zbo {
    public final boolean equals(Object obj) {
        if (obj instanceof zbo) {
            zbo zboVar = (zbo) obj;
            if (a() == zboVar.a() && yqs.a(b(), zboVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = b();
        return (objB == null ? 0 : objB.hashCode()) ^ a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(b());
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
