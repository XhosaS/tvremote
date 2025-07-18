package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.cwm;
import defpackage.dbv;
import defpackage.yih;
import defpackage.ypk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cwm.C(this, ypk.a, new dbv(context, intent, (yih) null, 3));
    }
}
