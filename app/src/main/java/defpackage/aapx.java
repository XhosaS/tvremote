package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapx {
    public static void a(final Context context) {
        ApplicationInfo applicationInfo;
        if (aaqa.a(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        final boolean z = true;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!klp.a()) {
            lvq.c(null);
        } else {
            final lvj lvjVar = new lvj();
            new Runnable() { // from class: aapw
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    lvj lvjVar2 = lvjVar;
                    try {
                        if (aapx.b(context2)) {
                            SharedPreferences.Editor editorEdit = aaqa.a(context2).edit();
                            editorEdit.putBoolean("proxy_notification_initialized", true);
                            editorEdit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        } else {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        }
                    } finally {
                        lvjVar2.a.s(null);
                    }
                }
            }.run();
        }
    }

    public static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }
}
