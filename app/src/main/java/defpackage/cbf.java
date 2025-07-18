package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbf {
    public final int a;
    public final int b;
    public final Notification c;

    public cbf(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cbf cbfVar = (cbf) obj;
        if (this.a == cbfVar.a && this.b == cbfVar.b) {
            return this.c.equals(cbfVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
