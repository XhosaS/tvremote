package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psz {
    public final long a;
    public final Map b;

    public psz(long j, Map map) {
        this.a = j;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psz)) {
            return false;
        }
        psz pszVar = (psz) obj;
        return this.a == pszVar.a && yks.e(this.b, pszVar.b);
    }

    public final int hashCode() {
        return (a.k(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NotificationsCount(count=" + this.a + ", taggedNotificationsCounts=" + this.b + ")";
    }
}
