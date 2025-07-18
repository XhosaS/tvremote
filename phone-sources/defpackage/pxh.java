package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxh {
    public final pxg a;
    public final qdo b;
    public final pvi c;
    public final qrd d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ pxh(pxg pxgVar, qdo qdoVar, pvi pviVar, qrd qrdVar, boolean z, boolean z2, int i) {
        pxgVar.getClass();
        qdoVar.getClass();
        this.a = pxgVar;
        this.b = qdoVar;
        this.c = (i & 4) != 0 ? null : pviVar;
        this.d = (i & 8) != 0 ? null : qrdVar;
        this.e = ((i & 16) == 0) & z;
        this.f = ((i & 32) == 0) & z2;
        this.g = (i & 64) != 0;
    }

    public final qen a() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxh)) {
            return false;
        }
        pxh pxhVar = (pxh) obj;
        return yks.e(this.a, pxhVar.a) && yks.e(this.b, pxhVar.b) && yks.e(this.c, pxhVar.c) && yks.e(this.d, pxhVar.d) && this.e == pxhVar.e && this.f == pxhVar.f && this.g == pxhVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        pvi pviVar = this.c;
        int iJ = 0;
        int iHashCode2 = ((iHashCode * 31) + (pviVar == null ? 0 : pviVar.hashCode())) * 31;
        qrd qrdVar = this.d;
        if (qrdVar != null) {
            if (qrdVar.A()) {
                iJ = qrdVar.j();
            } else {
                iJ = qrdVar.M;
                if (iJ == 0) {
                    iJ = qrdVar.j();
                    qrdVar.M = iJ;
                }
            }
        }
        return ((((((iHashCode2 + iJ) * 31) + a.q(this.e)) * 31) + a.q(this.f)) * 31) + a.q(this.g);
    }

    public final String toString() {
        return "ThreadProcessingContext(notificationTarget=" + this.a + ", timeout=" + this.b + ", traceInfo=" + this.c + ", localThreadState=" + this.d + ", muteNotification=" + this.e + ", forceNotification=" + this.f + ", applyTrayManagementInstructions=" + this.g + ")";
    }
}
