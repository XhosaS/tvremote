package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgb {
    private final cgy a;

    public cgb(cgy cgyVar) {
        this.a = cgyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgb)) {
            return false;
        }
        cgy cgyVar = this.a;
        cgy cgyVar2 = ((cgb) obj).a;
        return yks.e(cgyVar.a, cgyVar2.a) && cgyVar.b.u(cgyVar2.b) && yks.e(cgyVar.c, cgyVar2.c) && cgyVar.d == cgyVar2.d && cgyVar.e == cgyVar2.e && a.r(cgyVar.f, cgyVar2.f) && yks.e(cgyVar.g, cgyVar2.g) && cgyVar.h == cgyVar2.h && cgyVar.j == cgyVar2.j && a.s(cgyVar.i, cgyVar2.i);
    }

    public final int hashCode() {
        cgy cgyVar = this.a;
        int iHashCode = cgyVar.a.hashCode() * 31;
        chc chcVar = cgyVar.b;
        cgs cgsVar = chcVar.b;
        long j = cgsVar.b;
        cji cjiVar = cgsVar.c;
        long j2 = cmk.a;
        int iK = ((a.k(j) * 31) + (cjiVar != null ? cjiVar.h : 0)) * 31;
        cje cjeVar = cgsVar.d;
        int i = (((iK + (cjeVar != null ? cjeVar.a : 0)) * 31) + (cgsVar.e != null ? 65535 : 0)) * 31;
        ciy ciyVar = cgsVar.f;
        int iHashCode2 = (i + (ciyVar != null ? ciyVar.hashCode() : 0)) * 31;
        String str = cgsVar.g;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + a.k(cgsVar.h)) * 31) + (cgsVar.i != null ? Float.floatToIntBits(0.0f) : 0)) * 31;
        clp clpVar = cgsVar.j;
        int iHashCode4 = (iHashCode3 + (clpVar != null ? clpVar.hashCode() : 0)) * 31;
        ckq ckqVar = cgsVar.k;
        int iHashCode5 = (iHashCode4 + (ckqVar != null ? ckqVar.hashCode() : 0)) * 31;
        long j3 = cgsVar.l;
        long j4 = bnq.a;
        int iK2 = (((iHashCode5 + a.k(j3)) * 961) + chcVar.c.hashCode()) * 31;
        cgr cgrVar = chcVar.d;
        return ((((((((((((((((iHashCode + iK2 + (cgrVar != null ? cgrVar.hashCode() : 0)) * 31) + cgyVar.c.hashCode()) * 31) + cgyVar.d) * 31) + a.q(cgyVar.e)) * 31) + cgyVar.f) * 31) + cgyVar.g.hashCode()) * 31) + cgyVar.h.hashCode()) * 31) + cgyVar.j.hashCode()) * 31) + a.k(cgyVar.i);
    }
}
