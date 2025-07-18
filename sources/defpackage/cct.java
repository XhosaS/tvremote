package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cct implements ccd {
    private final ccd a;
    private final Object b;

    public cct(ccd ccdVar, Object obj) {
        ccdVar.getClass();
        this.a = ccdVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cct)) {
            return false;
        }
        cct cctVar = (cct) obj;
        return this.a.equals(cctVar.a) && this.b.equals(cctVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
