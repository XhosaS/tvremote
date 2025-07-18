package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvx {
    public final vtl a;
    public final tst b;
    public final tst c;

    public kvx() {
        throw null;
    }

    public final long a() {
        return vxd.b(this.a);
    }

    public final long b() {
        return vxf.b((vwe) this.c.e(vxf.b));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvx) {
            kvx kvxVar = (kvx) obj;
            if (this.a.equals(kvxVar.a) && this.b.equals(kvxVar.b) && this.c.equals(kvxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        vtl vtlVar = this.a;
        if (vtlVar.A()) {
            iJ = vtlVar.j();
        } else {
            int iJ2 = vtlVar.M;
            if (iJ2 == 0) {
                iJ2 = vtlVar.j();
                vtlVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((((iJ ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        tst tstVar = this.c;
        tst tstVar2 = this.b;
        return "PlaybackEvent{position=" + String.valueOf(this.a) + ", startTime=" + String.valueOf(tstVar2) + ", updateTime=" + String.valueOf(tstVar) + "}";
    }

    public kvx(vtl vtlVar, tst tstVar, tst tstVar2) {
        this.a = vtlVar;
        this.b = tstVar;
        this.c = tstVar2;
    }
}
