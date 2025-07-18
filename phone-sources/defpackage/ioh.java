package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioh {
    public final iog a;
    public final boolean b;

    public ioh(iog iogVar, boolean z) {
        iogVar.getClass();
        this.a = iogVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioh)) {
            return false;
        }
        ioh iohVar = (ioh) obj;
        return yks.e(this.a, iohVar.a) && this.b == iohVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }

    public final String toString() {
        return "WatchListState(entityIdAndAccount=" + this.a + ", isWatchlisted=" + this.b + ")";
    }
}
