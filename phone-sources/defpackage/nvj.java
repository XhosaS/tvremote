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
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvj extends nvk {
    private static final Object e = new Object();
    public static final nvj a = new nvj();
    public static final int b = nvk.c;

    public final nzj a(Context context, nzi nziVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        nzj nzjVar = new nzj(nziVar);
        czi.f(context, nzjVar, intentFilter, 2);
        nzjVar.a = context;
        if (nwb.g(context)) {
            return nzjVar;
        }
        nziVar.a();
        nzjVar.a();
        return null;
    }

    public final onz b(nwv nwvVar, nwv... nwvVarArr) {
        nzg nzgVar;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(nwvVar);
        arrayList.addAll(Arrays.asList(nwvVarArr));
        synchronized (nzg.c) {
            ocv.aG(nzg.d, "Must guarantee manager is non-null before using getInstance");
            nzgVar = nzg.d;
        }
        nxo nxoVar = new nxo(arrayList);
        Handler handler = nzgVar.o;
        handler.sendMessage(handler.obtainMessage(2, nxoVar));
        Object obj = nxoVar.d;
        nvh nvhVar = new nvh(0);
        return ((onz) ((kwy) obj).a).c(ooc.a, nvhVar);
    }

    public final void c(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof by) {
                cr supportFragmentManager = ((by) activity).getSupportFragmentManager();
                nwd nwdVar = new nwd();
                ocv.aG(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                nwdVar.a = dialog;
                if (onCancelListener != null) {
                    nwdVar.b = onCancelListener;
                }
                nwdVar.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        nvf nvfVar = new nvf();
        ocv.aG(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        nvfVar.a = dialog;
        if (onCancelListener != null) {
            nvfVar.b = onCancelListener;
        }
        nvfVar.show(fragmentManager, str);
    }

    public final boolean d(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogE = e(activity, i, new oaz(i(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogE == null) {
            return false;
        }
        c(activity, dialogE, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog e(Context context, int i, obb obbVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(oaw.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.videos.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.videos.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.videos.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, obbVar);
        }
        String strC = oaw.c(context, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        String strC;
        int i3;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new nvi(this, context).sendEmptyMessageDelayed(1, 120000L);
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
            strC = oaw.e(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            strC = oaw.c(context, i);
        }
        if (strC == null) {
            strC = context.getResources().getString(com.google.android.videos.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i2 == 6 || i2 == 19) ? oaw.d(context, "common_google_play_services_resolution_required_text", oaw.a(context)) : oaw.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ocv.aF(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        crm crmVar = new crm(context);
        crmVar.u = true;
        crmVar.f(true);
        crmVar.h(strC);
        crk crkVar = new crk();
        crkVar.b(strD);
        crmVar.p(crkVar);
        boolean zC = ocp.c(context);
        int i4 = R.drawable.stat_sys_warning;
        if (zC) {
            a.ab(true);
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            crmVar.o(i4);
            crmVar.j = 2;
            if (ocp.e(context)) {
                crmVar.d(2131231076, resources.getString(com.google.android.videos.R.string.common_open_on_phone), pendingIntent);
            } else {
                crmVar.g = pendingIntent;
            }
        } else {
            crmVar.o(R.drawable.stat_sys_warning);
            crmVar.r(resources.getString(com.google.android.videos.R.string.common_google_play_services_notification_ticker));
            crmVar.t(System.currentTimeMillis());
            crmVar.g = pendingIntent;
            crmVar.g(strD);
        }
        if (ocv.f()) {
            a.ab(ocv.f());
            synchronized (e) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.google.android.videos.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            crmVar.B = "com.google.android.gms.availability";
        }
        Notification notificationA = crmVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            nwb.c.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }
}
