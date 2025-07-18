package defpackage;

import android.service.notification.StatusBarNotification;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcw {
    public final qcs a;
    public final StatusBarNotification b;
    public final pxg c;
    public final qis d;

    public qcw(qcs qcsVar, StatusBarNotification statusBarNotification, pxg pxgVar, qis qisVar) {
        this.a = qcsVar;
        this.b = statusBarNotification;
        this.c = pxgVar;
        this.d = qisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcw)) {
            return false;
        }
        qcw qcwVar = (qcw) obj;
        return yks.e(this.a, qcwVar.a) && yks.e(this.b, qcwVar.b) && yks.e(this.c, qcwVar.c) && yks.e(this.d, qcwVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        pxg pxgVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (pxgVar == null ? 0 : pxgVar.hashCode())) * 31;
        qis qisVar = this.d;
        return iHashCode2 + (qisVar != null ? qisVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrayNotificationData(trayIdentifier=" + this.a + ", notification=" + this.b + ", notificationTarget=" + this.c + ", thread=" + this.d + ")";
    }
}
