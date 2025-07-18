package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewo {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/homekey/HomeKeyPressedMonitorImpl");
    private BroadcastReceiver b;

    public final void a(Context context, ewm ewmVar) {
        ewmVar.getClass();
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/app/homekey/HomeKeyPressedMonitorImpl", "onAttach", 30, "HomeKeyPressedMonitorImpl.kt")).u("IllegalArgumentException, homeKeyBroadcastReceiver might not have been registered.");
            }
        }
        this.b = new ewn(ewmVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        abs.c(context, this.b, intentFilter, null, 2);
    }

    public final void b(Context context) {
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/app/homekey/HomeKeyPressedMonitorImpl", "onDetach", 48, "HomeKeyPressedMonitorImpl.kt")).u("IllegalArgumentException, homeKeyBroadcastReceiver might not have been registered.");
            }
            this.b = null;
        }
    }
}
