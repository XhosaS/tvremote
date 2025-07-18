package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmt extends BroadcastReceiver {
    final /* synthetic */ PowerManager a;
    final /* synthetic */ bmx b;

    public bmt(bmx bmxVar, PowerManager powerManager) {
        this.a = powerManager;
        this.b = bmxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PowerManager powerManager = this.a;
        bmx bmxVar = this.b;
        boolean zIsInteractive = powerManager.isInteractive();
        if (bmxVar.e != zIsInteractive) {
            ((cbs) ((cbs) bmx.a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper$1", "onReceive", 174, "BluetoothLeAdvertiseWrapper.java")).p("Interactivity has changed");
            bmxVar.e = zIsInteractive;
            bmxVar.a();
        }
    }
}
