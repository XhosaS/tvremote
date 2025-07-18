package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abf extends abk {
    public CharSequence a;

    @Override // defpackage.abk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.abk
    public final void b(abb abbVar) {
        new Notification.BigTextStyle(((abl) abbVar).b).setBigContentTitle(null).bigText(this.a);
    }
}
