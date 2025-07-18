package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmu extends BroadcastReceiver {
    final /* synthetic */ bmx a;

    public bmu(bmx bmxVar) {
        this.a = bmxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bmx bmxVar = this.a;
        String stringExtra = intent.getStringExtra("android.bluetooth.adapter.extra.LOCAL_NAME");
        if (bmxVar.d.equals(stringExtra)) {
            return;
        }
        ((cbs) bmx.a.c().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper$2", "onReceive", 192, "BluetoothLeAdvertiseWrapper.java")).p("Device name changed, restarting advertisement");
        bmxVar.d = stringExtra;
        bmxVar.b = true;
        bmxVar.a();
    }
}
