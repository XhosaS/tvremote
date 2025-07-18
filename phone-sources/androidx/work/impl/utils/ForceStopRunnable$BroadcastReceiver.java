package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.gpn;
import defpackage.gvl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        gpn.a("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        gpn.b();
        gvl.a(context);
    }
}
