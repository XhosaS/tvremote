package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crv {
    public static String b;
    private static cru f;
    public final NotificationManager d;
    private final Context g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public crv(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i) {
        this.d.cancel(str, i);
    }

    public final void b(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(str, i, notification);
            return;
        }
        Context context = this.g;
        crs crsVar = new crs(context.getPackageName(), i, str, notification);
        synchronized (e) {
            if (f == null) {
                f = new cru(context.getApplicationContext());
            }
            f.a.obtainMessage(0, crsVar).sendToTarget();
        }
        this.d.cancel(str, i);
    }

    public final boolean c() {
        return this.d.areNotificationsEnabled();
    }
}
