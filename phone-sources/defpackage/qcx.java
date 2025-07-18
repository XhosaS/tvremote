package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qcx {
    public final Map a;
    public final qcs b;
    public final qcy c;
    public final List d;

    public qcx(Map map, qcs qcsVar, qcy qcyVar, List list) {
        map.getClass();
        this.a = map;
        this.b = qcsVar;
        this.c = qcyVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcx)) {
            return false;
        }
        qcx qcxVar = (qcx) obj;
        return yks.e(this.a, qcxVar.a) && yks.e(this.b, qcxVar.b) && yks.e(this.c, qcxVar.c) && yks.e(this.d, qcxVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qcs qcsVar = this.b;
        int iHashCode2 = (iHashCode + (qcsVar == null ? 0 : qcsVar.hashCode())) * 31;
        qcy qcyVar = this.c;
        int iHashCode3 = (iHashCode2 + (qcyVar == null ? 0 : qcyVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationSlotResult(trayModel=" + this.a + ", addedNotificationTrayId=" + this.b + ", replacedNotificationTrayModelData=" + this.c + ", dismissedNotificationsTrayModelData=" + this.d + ")";
    }
}
