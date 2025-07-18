package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kcx extends kcy {
    private static final Object e = new Object();
    public static final kcx a = new kcx();
    public static final int b = kcy.c;

    public final lvf a(kew kewVar, kew... kewVarArr) {
        kgu kguVar;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(kewVar);
        arrayList.addAll(Arrays.asList(kewVarArr));
        synchronized (kgu.c) {
            kkk.l(kgu.d, "Must guarantee manager is non-null before using getInstance");
            kguVar = kgu.d;
        }
        kfr kfrVar = new kfr(arrayList);
        Handler handler = kguVar.o;
        handler.sendMessage(handler.obtainMessage(2, kfrVar));
        lvj lvjVar = kfrVar.b;
        return lvjVar.a.c(lvm.a, new lve() { // from class: kcv
            @Override // defpackage.lve
            public final lvf a(Object obj) {
                kcx kcxVar = kcx.a;
                return lvq.c(null);
            }
        });
    }

    public final void b(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof bw) {
                de deVar = ((bw) activity).a.a.e;
                kdw kdwVar = new kdw();
                kkk.l(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                kdwVar.ah = dialog;
                kdwVar.ai = onCancelListener;
                kdwVar.l(deVar, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        kcs kcsVar = new kcs();
        kkk.l(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        kcsVar.a = dialog;
        kcsVar.b = onCancelListener;
        kcsVar.show(fragmentManager, str);
    }

    public final Dialog c(Context context, int i, kjj kjjVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(kje.b(context, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = context.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.katniss.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.katniss.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.katniss.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, kjjVar);
        }
        String strC = kje.c(context, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    @Override // defpackage.kcy
    public final PendingIntent d(Context context, int i, String str) {
        return super.d(context, i, null);
    }

    public final void e(Context context, int i) throws Resources.NotFoundException {
        f(context, i, super.d(context, i, "n"));
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        String strC;
        int i3;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new kcw(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            strC = kje.e(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            strC = kje.c(context, i);
        }
        if (strC == null) {
            strC = context.getResources().getString(com.google.android.katniss.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i2 == 6 || i2 == 19) ? kje.d(context, "common_google_play_services_resolution_required_text", kje.a(context)) : kje.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        kkk.k(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        abh abhVar = new abh(context, null);
        abhVar.m = true;
        abhVar.d(16, true);
        abhVar.e = abh.c(strC);
        abf abfVar = new abf();
        abfVar.a = abh.c(strD);
        abhVar.e(abfVar);
        boolean zC = kll.c(context);
        int i4 = R.drawable.stat_sys_warning;
        if (zC) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            abhVar.s.icon = i4;
            abhVar.j = 2;
            if (kll.e(context)) {
                abhVar.b.add(new abc(IconCompat.f(null, "", com.google.android.katniss.R.drawable.common_full_open_on_phone), resources.getString(com.google.android.katniss.R.string.common_open_on_phone), pendingIntent, new Bundle(), null));
            } else {
                abhVar.g = pendingIntent;
            }
        } else {
            Notification notification = abhVar.s;
            notification.icon = R.drawable.stat_sys_warning;
            abhVar.f(resources.getString(com.google.android.katniss.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            abhVar.g = pendingIntent;
            abhVar.f = abh.c(strD);
        }
        synchronized (e) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.google.android.katniss.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        abhVar.r = "com.google.android.gms.availability";
        Notification notificationA = abhVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            kdu.d.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }
}
