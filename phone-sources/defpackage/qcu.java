package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcu {
    public final qcs a;
    public final qcw b;
    public final List c;
    public final Map d;
    public final Boolean e;

    public qcu(qcs qcsVar, qcw qcwVar, List list, Map map, Boolean bool) {
        this.a = qcsVar;
        this.b = qcwVar;
        this.c = list;
        this.d = map;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcu)) {
            return false;
        }
        qcu qcuVar = (qcu) obj;
        return yks.e(this.a, qcuVar.a) && yks.e(this.b, qcuVar.b) && yks.e(this.c, qcuVar.c) && yks.e(this.d, qcuVar.d) && yks.e(this.e, qcuVar.e);
    }

    public final int hashCode() {
        qcs qcsVar = this.a;
        int iHashCode = qcsVar == null ? 0 : qcsVar.hashCode();
        qcw qcwVar = this.b;
        int iHashCode2 = qcwVar == null ? 0 : qcwVar.hashCode();
        int i = iHashCode * 31;
        List list = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.d;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TrayInstructionsResult(addedNotificationTrayId=" + this.a + ", replacedNotification=" + this.b + ", dismissedNotifications=" + this.c + ", targetToReachedLimitInfoMultimap=" + this.d + ", shouldAddedThreadAlertOnReplace=" + this.e + ")";
    }
}
