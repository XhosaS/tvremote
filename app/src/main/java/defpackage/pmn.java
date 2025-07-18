package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pmn extends pmo {
    public pjn a;

    private final void b(Notification notification) {
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(1585575426, notification, 1);
        } else {
            startForeground(1585575426, notification);
        }
    }

    private final void d(Notification notification, String str) {
        if (Build.VERSION.SDK_INT < 31) {
            b(notification);
            return;
        }
        try {
            b(notification);
        } catch (ForegroundServiceStartNotAllowedException e) {
            qce.e("%s: Failed to startForeground for Key %s with exception %s", "MDD Foreground Download Service", str, e);
            this.a.c(str);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = qce.a;
        String stringExtra = intent.getStringExtra("key");
        if (yqv.c(stringExtra)) {
            qce.c("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
            return 2;
        }
        if (intent.getBooleanExtra("stop-service", false)) {
            d(pmm.a(this).a(), stringExtra);
            stopForeground(true);
            stopSelf(i2);
            return 2;
        }
        if (intent.hasExtra("cancel-action")) {
            this.a.c(stringExtra);
        }
        d(pmm.a(this).a(), stringExtra);
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        qce.i("%s: onTimeout: %s", "MDD Foreground Download Service", Integer.valueOf(i2));
        super.onTimeout(i, i2);
        stopForeground(true);
        stopSelf(i);
    }
}
