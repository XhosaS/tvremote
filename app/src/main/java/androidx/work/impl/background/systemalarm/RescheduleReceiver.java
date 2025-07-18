package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.cbx;
import defpackage.cfq;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = cbx.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cbx cbxVarC = cbx.c();
        String str = a;
        Objects.toString(intent);
        cbxVarC.a(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            cfq cfqVarJ = cfq.j(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (cfq.b) {
                BroadcastReceiver.PendingResult pendingResult = cfqVarJ.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                cfqVarJ.j = pendingResultGoAsync;
                if (cfqVarJ.i) {
                    cfqVarJ.j.finish();
                    cfqVarJ.j = null;
                }
            }
        } catch (IllegalStateException e) {
            cbx.c();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
