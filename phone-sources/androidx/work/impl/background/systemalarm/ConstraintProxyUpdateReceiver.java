package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.bd;
import defpackage.gpn;
import defpackage.grs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        gpn.a("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            grs.h(context).k.q(new bd(intent, context, goAsync(), 14));
        } else {
            gpn.b();
        }
    }
}
