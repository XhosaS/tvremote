package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qej {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;

    public qej() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qej) {
            qej qejVar = (qej) obj;
            if (this.a == qejVar.a && this.b == qejVar.b && this.c == qejVar.c && this.d == qejVar.d && this.e == qejVar.e && this.f == qejVar.f && ((str = this.g) != null ? str.equals(qejVar.g) : qejVar.g == null) && ((str2 = this.h) != null ? str2.equals(qejVar.h) : qejVar.h == null) && ((str3 = this.i) != null ? str3.equals(qejVar.i) : qejVar.i == null) && this.j == qejVar.j && this.k == qejVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.a;
        int i2 = this.b;
        int i3 = true != this.c ? 1237 : 1231;
        int i4 = ((i ^ 1000003) * 1000003) ^ i2;
        int i5 = (iHashCode ^ (((((((((i4 * (-721379959)) ^ i3) * (-721379959)) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * (-721379959)) ^ (true != this.f ? 1237 : 1231)) * 1000003)) * 1000003;
        String str2 = this.h;
        int iHashCode2 = (i5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.i;
        return ((((((iHashCode2 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SystemTrayNotificationConfig{iconResourceId=" + this.a + ", appNameResourceId=" + this.b + ", colorResourceId=null, soundEnabled=" + this.c + ", ringtone=null, vibrationEnabled=" + this.d + ", lightsEnabled=" + this.e + ", ledColor=null, displayRecipientAccountName=" + this.f + ", notificationClickedActivity=" + this.g + ", notificationRemovedReceiver=" + this.h + ", defaultChannelId=" + this.i + ", defaultGroupThreshold=" + this.j + ", summaryNotificationThreshold=" + this.k + ", shouldFilterOldThreads=false}";
    }

    public qej(byte[] bArr) {
        this.a = R.drawable.ic_google_tv_notification_icon;
        this.b = R.string.gtv_application_name;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
        this.h = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
        this.i = "WATCHLISTED_MOVIE_AVAILABLE_FOR_FREE";
        this.j = 1;
        this.k = 1;
    }
}
