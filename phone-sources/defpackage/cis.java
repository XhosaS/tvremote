package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cis {
    private final cix a;
    private final Object b = null;

    public cis(cix cixVar) {
        this.a = cixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cis)) {
            return false;
        }
        cis cisVar = (cis) obj;
        if (!yks.e(this.a, cisVar.a)) {
            return false;
        }
        Object obj2 = cisVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
