package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrj {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final boolean d;
    public final boolean e;

    public qrj(Boolean bool, Boolean bool2, Boolean bool3, boolean z) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = z;
        boolean z2 = false;
        if ((bool == null || bool.booleanValue()) && ((bool2 == null || bool2.booleanValue()) && (bool3 == null || bool3.booleanValue()))) {
            z2 = true;
        }
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrj)) {
            return false;
        }
        qrj qrjVar = (qrj) obj;
        return yks.e(this.a, qrjVar.a) && yks.e(this.b, qrjVar.b) && yks.e(this.c, qrjVar.c) && this.d == qrjVar.d;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        int i = iHashCode * 31;
        Boolean bool3 = this.c;
        return ((((i + iHashCode2) * 31) + (bool3 != null ? bool3.hashCode() : 0)) * 31) + a.q(this.d);
    }

    public final String toString() {
        return "ImageLoadingOutcome(collapsedViewIconLoadingOutcome=" + this.a + ", expandedViewImageLoadingOutcome=" + this.b + ", expandedViewIconLoadingOutcome=" + this.c + ", loadingTimedOut=" + this.d + ")";
    }
}
