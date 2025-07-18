package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.gpn;
import defpackage.grs;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = gpn.a("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gpn.b();
        Objects.toString(intent);
        try {
            grs grsVarH = grs.h(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (grs.a) {
                BroadcastReceiver.PendingResult pendingResult = grsVarH.g;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                grsVarH.g = pendingResultGoAsync;
                if (grsVarH.f) {
                    grsVarH.g.finish();
                    grsVarH.g = null;
                }
            }
        } catch (IllegalStateException e) {
            gpn.b();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
