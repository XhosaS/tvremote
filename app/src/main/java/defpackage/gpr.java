package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpr extends BroadcastReceiver {
    final /* synthetic */ gps a;

    public gpr(gps gpsVar) {
        this.a = gpsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        IntentFilter intentFilter = gpx.a;
        gps gpsVar = this.a;
        ahal.e(gpsVar.a, null, 0, new gpq(gpsVar, null), 3);
    }
}
