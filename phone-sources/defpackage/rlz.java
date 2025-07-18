package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlz {
    public final rmd a;
    public final rmc b;
    public final rmb c;
    public final rjg d;
    public final int e;
    public final rrx f;

    public rlz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlz) {
            rlz rlzVar = (rlz) obj;
            if (this.a.equals(rlzVar.a) && this.b.equals(rlzVar.b) && this.c.equals(rlzVar.c) && this.d.equals(rlzVar.d)) {
                int i = this.e;
                int i2 = rlzVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.f.equals(rlzVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        a.bl(this.e);
        return (((((iHashCode * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        rrx rrxVar = this.f;
        rjg rjgVar = this.d;
        rmb rmbVar = this.c;
        rmc rmcVar = this.b;
        return "Configuration{onViewCreatedCallback=" + String.valueOf(this.a) + ", onDismissCallback=" + String.valueOf(rmcVar) + ", onDestroyCallback=" + String.valueOf(rmbVar) + ", visualElements=" + String.valueOf(rjgVar) + ", isExperimental=false, largeScreenDialogAlignment=" + rrx.O(this.e) + ", materialVersion=" + String.valueOf(rrxVar) + "}";
    }

    public rlz(rmd rmdVar, rmc rmcVar, rmb rmbVar, rjg rjgVar, rrx rrxVar) {
        this.a = rmdVar;
        this.b = rmcVar;
        this.c = rmbVar;
        this.d = rjgVar;
        this.e = 1;
        this.f = rrxVar;
    }
}
