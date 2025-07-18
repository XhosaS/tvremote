package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class mmc {
    public final nhf a;
    public final nhb b;
    private final nlr c;

    public mmc(mil milVar, nlr nlrVar) {
        if (milVar instanceof nhf) {
            this.a = (nhf) milVar;
            this.b = null;
        } else {
            if (!(milVar instanceof nhb)) {
                throw new IllegalArgumentException("Invalid componentType");
            }
            this.b = (nhb) milVar;
            this.a = null;
        }
        this.c = nlrVar;
    }

    private final boolean a() {
        nhf nhfVar = this.a;
        return (nhfVar == null || nhfVar.i() == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        nhf nhfVar;
        nhf nhfVar2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmc)) {
            return false;
        }
        mmc mmcVar = (mmc) obj;
        return (!a() || !mmcVar.a() || (nhfVar = this.a) == null || (nhfVar2 = mmcVar.a) == null) ? Objects.equals(this.a, mmcVar.a) && Objects.equals(this.b, mmcVar.b) && Objects.equals(this.c, mmcVar.c) : nhfVar.k().equals(nhfVar2.k());
    }

    public final int hashCode() {
        nhf nhfVar;
        if (a() && (nhfVar = this.a) != null) {
            return nhfVar.k().hashCode();
        }
        nhf nhfVar2 = this.a;
        int iHashCode = nhfVar2 == null ? 0 : nhfVar2.hashCode();
        nlr nlrVar = this.c;
        int iHashCode2 = iHashCode ^ (nlrVar == null ? 0 : nlrVar.hashCode());
        nhb nhbVar = this.b;
        return iHashCode2 ^ (nhbVar != null ? nhbVar.hashCode() : 0);
    }
}
