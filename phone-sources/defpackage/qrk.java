package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrk {
    public final crm a;
    public final qrj b;
    private final crr c;
    private final Notification d;

    public qrk(crm crmVar, crr crrVar, Notification notification, qrj qrjVar) {
        this.a = crmVar;
        this.c = crrVar;
        this.d = notification;
        this.b = qrjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrk)) {
            return false;
        }
        qrk qrkVar = (qrk) obj;
        return yks.e(this.a, qrkVar.a) && yks.e(this.c, qrkVar.c) && yks.e(this.d, qrkVar.d) && yks.e(this.b, qrkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        crr crrVar = this.c;
        int iHashCode2 = (iHashCode + (crrVar == null ? 0 : crrVar.hashCode())) * 31;
        Notification notification = this.d;
        int iHashCode3 = (iHashCode2 + (notification == null ? 0 : notification.hashCode())) * 31;
        qrj qrjVar = this.b;
        return iHashCode3 + (qrjVar != null ? qrjVar.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationBuilderAndComponents(notificationBuilder=" + this.a + ", style=" + this.c + ", publicVersion=" + this.d + ", imageLoadingOutcome=" + this.b + ")";
    }
}
