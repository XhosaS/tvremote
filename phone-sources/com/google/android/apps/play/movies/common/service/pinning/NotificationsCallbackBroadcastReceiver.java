package com.google.android.apps.play.movies.common.service.pinning;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import defpackage.a;
import defpackage.krb;
import defpackage.ksn;
import defpackage.ljg;
import defpackage.ljp;
import defpackage.wae;
import defpackage.xca;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NotificationsCallbackBroadcastReceiver extends xca {
    public ExecutorService a;
    public ljg b;
    public krb c;

    public static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, 0, intent, 201326592);
    }

    public static PendingIntent b(Context context, String str, List list, String str2, String str3) {
        return a(context, c(context, "com.google.android.videos.DOWNLOAD_COMPLETED_DELETED", str).setData(d(str, TextUtils.isEmpty(str3) ? (String) list.get(0) : str3, !TextUtils.isEmpty(str3))).putExtra("video_ids", (String[]) list.toArray(new String[list.size()])).putExtra("season_id", str2).putExtra("show_id", str3));
    }

    public static Intent c(Context context, String str, String str2) {
        return new Intent(context, (Class<?>) NotificationsCallbackBroadcastReceiver.class).setAction(str).putExtra("authAccount", str2);
    }

    public static Uri d(String str, String str2, boolean z) {
        Uri.Builder builderAuthority = new Uri.Builder().scheme("videos").authority(str);
        builderAuthority.path(true != z ? "video" : "show");
        builderAuthority.appendPath(str2);
        return builderAuthority.build();
    }

    public static Intent e(Context context, ksn ksnVar, String str, String str2, String str3) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) ? krb.g(context, ksnVar) : TextUtils.isEmpty(str3) ? krb.l(context, ksnVar, str) : !TextUtils.isEmpty(str) ? krb.k(context, ksnVar, str3, str2, str) : !TextUtils.isEmpty(str2) ? krb.h(context, ksnVar, str3, str2) : krb.i(context, ksnVar, str3);
    }

    public static PendingIntent f(Context context, String str, List list, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 29) {
            return PendingIntent.getActivity(context, 0, e(context, ksn.b(str), (String) list.get(0), str2, str3), 201326592);
        }
        return a(context, c(context, "com.google.android.videos.DOWNLOAD_COMPLETED", str).setData(d(str, TextUtils.isEmpty(str3) ? (String) list.get(0) : str3, !TextUtils.isEmpty(str3))).putExtra("video_ids", (String[]) list.toArray(new String[list.size()])).putExtra("video_id", list.size() == 1 ? (String) list.get(0) : null).putExtra("season_id", str2).putExtra("show_id", str3));
    }

    @Override // defpackage.xca, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wae.B(this, context);
        if (intent == null) {
            return;
        }
        a.H("videos".equals(intent.getData().getScheme()));
        String action = intent.getAction();
        action.getClass();
        ksn ksnVarB = ksn.b(intent.getStringExtra("authAccount"));
        String stringExtra = intent.getStringExtra("season_id");
        String stringExtra2 = intent.getStringExtra("show_id");
        String stringExtra3 = intent.getStringExtra("video_id");
        String[] stringArrayExtra = intent.getStringArrayExtra("video_ids");
        ExecutorService executorService = this.a;
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        executorService.execute(new ljp(context, action, ksnVarB, stringExtra3, stringArrayExtra, stringExtra2, stringExtra, this.b, goAsync()));
    }
}
