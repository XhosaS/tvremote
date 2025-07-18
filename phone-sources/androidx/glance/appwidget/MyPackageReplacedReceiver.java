package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.btr;
import defpackage.cwm;
import defpackage.yih;
import defpackage.ypk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            throw new IllegalStateException("onReceive context is null");
        }
        if (intent == null) {
            throw new IllegalStateException("onReceive intent is null");
        }
        cwm.C(this, ypk.a, new btr(context, (yih) null, 9));
    }
}
