package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwr extends gwu {
    public final gzq a;
    private final bqh b;

    public gwr(gzq gzqVar) {
        gzqVar.getClass();
        this.b = null;
        this.a = gzqVar;
    }

    @Override // defpackage.gwu
    public final bqh a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwr)) {
            return false;
        }
        gwr gwrVar = (gwr) obj;
        bqh bqhVar = gwrVar.b;
        return yks.e(null, null) && yks.e(this.a, gwrVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(painter=null, result=" + this.a + ")";
    }
}
