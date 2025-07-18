package defpackage;

import android.service.notification.StatusBarNotification;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcy {
    public final qcs a;
    public final StatusBarNotification b;
    public final pxg c;
    public final qis d;

    public qcy(qcs qcsVar, StatusBarNotification statusBarNotification, pxg pxgVar, qis qisVar) {
        this.a = qcsVar;
        this.b = statusBarNotification;
        this.c = pxgVar;
        this.d = qisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcy)) {
            return false;
        }
        qcy qcyVar = (qcy) obj;
        return yks.e(this.a, qcyVar.a) && yks.e(this.b, qcyVar.b) && yks.e(this.c, qcyVar.c) && yks.e(this.d, qcyVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        StatusBarNotification statusBarNotification = this.b;
        int iHashCode2 = (iHashCode + (statusBarNotification == null ? 0 : statusBarNotification.hashCode())) * 31;
        pxg pxgVar = this.c;
        int iHashCode3 = (iHashCode2 + (pxgVar == null ? 0 : pxgVar.hashCode())) * 31;
        qis qisVar = this.d;
        return iHashCode3 + (qisVar != null ? qisVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrayModelDataItem(trayIdentifier=" + this.a + ", notification=" + this.b + ", notificationTarget=" + this.c + ", thread=" + this.d + ")";
    }
}
