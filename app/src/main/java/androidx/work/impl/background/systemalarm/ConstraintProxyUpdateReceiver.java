package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.cbx;
import defpackage.cfq;
import defpackage.cgw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = cbx.d("ConstrntProxyUpdtRecvr");
    public static final /* synthetic */ int b = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            cbx.c().a(a, "Ignoring unknown action ".concat(String.valueOf(action)));
            return;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        cfq.j(context).m.a.execute(new cgw(intent, context, pendingResultGoAsync));
    }
}
