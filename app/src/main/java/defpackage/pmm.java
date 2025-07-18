package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmm {
    public static abh a(Context context) {
        abh abhVar = new abh(context, "download-notification-channel-id");
        abhVar.n = "service";
        abhVar.d(8, true);
        abhVar.e = abh.c(context.getResources().getString(R.string.mdd_foreground_service_notification_title));
        abhVar.s.icon = android.R.drawable.stat_notify_sync_noanim;
        return abhVar;
    }

    public static void b(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static void c(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }
}
