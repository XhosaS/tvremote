package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joi {
    public final void a(gmd gmdVar) {
        gmdVar.c();
        gmdVar.d();
    }

    public final void b(Context context, NotificationManager notificationManager, ghr ghrVar) {
        joi joiVar = jot.a;
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("Voice Input Disable Notification Channel");
        if (notificationChannel == null || notificationChannel.getImportance() == 0) {
            if (notificationChannel != null) {
                notificationManager.deleteNotificationChannel("Voice Input Disable Notification Channel");
            }
            notificationManager.createNotificationChannel(new NotificationChannel("Voice Input Disable Notification Channel", "Voice Input Disable Notification Channel", 3));
        } else {
            notificationChannel.getImportance();
        }
        Notification.Builder smallIcon = new Notification.Builder(context, "Voice Input Disable Notification Channel").setContentTitle(context.getString(R.string.amati_voice_input_disabled_notification_title)).setContentText(context.getString(R.string.amati_voice_input_disabled_notification_text)).setSmallIcon(R.drawable.setup_notification_icon);
        smallIcon.getClass();
        Intent intent = new Intent("com.google.android.apps.tvsearch.ASSISTANT_NOTIFICATION_REDIRECT");
        ComponentName componentName = irm.a;
        Intent intentPutExtra = intent.setComponent(irm.c).putExtra("notification_type", "as_voice_input_disable_notification");
        intentPutExtra.getClass();
        PendingIntent pendingIntentA = tpf.a(context, 0, intentPutExtra, 201326592);
        if (pendingIntentA != null) {
            smallIcon.setContentIntent(pendingIntentA);
        }
        smallIcon.setAutoCancel(true).extend(new Notification.TvExtender());
        notificationManager.notify(4, smallIcon.build());
        ghrVar.ai(2);
    }
}
