package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.cwo;
import defpackage.yks;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final cwo b = new cwo();
    public static final Map a = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !yks.e(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            throw new IllegalStateException("Intent is missing ActionKey extra");
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("Intent is missing AppWidgetId extra");
        }
        cwo.f(intExtra);
        Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
    }
}
