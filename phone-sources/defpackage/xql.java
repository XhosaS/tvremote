package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xql {
    public final xqk a;
    public final xtk b;

    public xql(xqk xqkVar, xtk xtkVar) {
        xqkVar.getClass();
        this.a = xqkVar;
        xtkVar.getClass();
        this.b = xtkVar;
    }

    public static xql a(xqk xqkVar) {
        sij.o(xqkVar != xqk.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new xql(xqkVar, xtk.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xql)) {
            return false;
        }
        xql xqlVar = (xql) obj;
        return this.a.equals(xqlVar.a) && this.b.equals(xqlVar.b);
    }

    public final int hashCode() {
        xtk xtkVar = this.b;
        return xtkVar.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        xtk xtkVar = this.b;
        if (xtkVar.g()) {
            return this.a.toString();
        }
        return this.a.toString() + "(" + xtkVar.toString() + ")";
    }
}
